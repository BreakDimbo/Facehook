package com.facehook.action;

import com.facehook.service.CountryMgr;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Break.D on 7/23/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserContoller {

    private CountryMgr countryMgr;

    public CountryMgr getCountryMgr() {
        return countryMgr;
    }

    @Resource
    public void setCountryMgr(CountryMgr countryMgr) {
        this.countryMgr = countryMgr;
    }

    @RequestMapping(value = "/addUser")
    public String register(HttpServletRequest request) {

        return "individual/home";
    }

    @RequestMapping(value = "/register")
    public String gotoRegister(HttpServletRequest request) {


//        准备数据

//        国家
        request.setAttribute("countryList", countryMgr.listAllCountry());

//        省

//        大学

        return "public/register";
    }
}
