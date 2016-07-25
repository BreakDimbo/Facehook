package com.facehook.action;

import com.facehook.service.CountryMgr;
import com.facehook.service.ProvinceMgr;
import com.facehook.service.UniversityMgr;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Break.D on 7/23/16.
 */
@Controller
@RequestMapping(value = "/reg")
public class RegisterAction {

    private CountryMgr countryMgr;
    private ProvinceMgr provinceMgr;
    private UniversityMgr universityMgr;

    public CountryMgr getCountryMgr() {
        return countryMgr;
    }

    @Resource
    public void setCountryMgr(CountryMgr countryMgr) {
        this.countryMgr = countryMgr;
    }

    public ProvinceMgr getProvinceMgr() {
        return provinceMgr;
    }

    @Resource
    public void setProvinceMgr(ProvinceMgr provinceMgr) {
        this.provinceMgr = provinceMgr;
    }

    public UniversityMgr getUniversityMgr() {
        return universityMgr;
    }

    @Resource
    public void setUniversityMgr(UniversityMgr universityMgr) {
        this.universityMgr = universityMgr;
    }

    @RequestMapping(value = "/register")
    public String gotoRegister(HttpServletRequest request) {


//        准备数据

//        国家
        request.setAttribute("countryList", countryMgr.listAllCountry());

//        省
        request.setAttribute("provinceList", provinceMgr.showProByCountryId(1));

//        大学
        request.setAttribute("universityList", universityMgr.showUniByProCouId(1, 1));

        return "public/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String userForm(Model model) {
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);
        return "public/register";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String userFormSubmit(@ModelAttribute("userForm") UserForm userForm, Model model) {

        model.addAttribute("userForm", userForm);
        System.out.println(userForm.getName());

        return "individual/home";
    }
}
