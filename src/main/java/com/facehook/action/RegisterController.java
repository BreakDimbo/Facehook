package com.facehook.action;

import com.facehook.domain.UniversityEntity;
import com.facehook.domain.UserUniversityEntity;
import com.facehook.domain.UsersEntity;
import com.facehook.dto.UserForm;
import com.facehook.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Break.D on 7/23/16.
 */
@Controller
@RequestMapping(value = "/reg")
public class RegisterController {

    private CountryMgr countryMgr;
    private ProvinceMgr provinceMgr;
    private UniversityMgr universityMgr;
    private UserMgr userMgr;
    private UserUniversityMgr userUniversityMgr;

    public UserMgr getUserMgr() {
        return userMgr;
    }

    @Resource
    public void setUserMgr(UserMgr userMgr) {
        this.userMgr = userMgr;
    }

    public UserUniversityMgr getUserUniversityMgr() {
        return userUniversityMgr;
    }

    @Resource
    public void setUserUniversityMgr(UserUniversityMgr userUniversityMgr) {
        this.userUniversityMgr = userUniversityMgr;
    }

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

    @RequestMapping(value = "/getInfo")
    public String gotoRegister(HttpServletRequest request) {

        //准备数据
        //国家
        request.setAttribute("countryList", countryMgr.listAllCountry());
        //省
        request.setAttribute("provinceList", provinceMgr.showProByCountryId(1));
        //大学
        request.setAttribute("universityList", universityMgr.showUniByProCouId(1, 1));
        return "public/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String userForm(Model model) {
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);
        return "forward:getInfo";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String userFormSubmit(@ModelAttribute("userForm") UserForm userForm, Model model) {


        UsersEntity user = new UsersEntity();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());
        user.setLoginDate(new Date());
        user.setPwd(userForm.getPwd());
        user.setRegisterDate(new Date());
        user.setSex(userForm.getSex());

        //创建用户的大学
        UniversityEntity universityEntity = universityMgr.getUniversityById(Integer.parseInt(userForm.getUniversityId()));

        //创建用户对应大学
        UserUniversityEntity uuni = new UserUniversityEntity();
        uuni.setUser(user);
        uuni.setUniversity(universityEntity);
        uuni.setUserType(userForm.getUserType());

        //保存数据
        userMgr.save(user);
        userUniversityMgr.save(uuni);




        return "individual/home";
    }
}
