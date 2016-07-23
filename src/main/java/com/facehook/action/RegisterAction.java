package com.facehook.action;

import com.facehook.service.CountryMgr;
import com.facehook.service.ProvinceMgr;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    public ProvinceMgr getProvinceMgr() {
        return provinceMgr;
    }

    @Resource
    public void setProvinceMgr(ProvinceMgr provinceMgr) {
        this.provinceMgr = provinceMgr;
    }

    public CountryMgr getCountryMgr() {
        return countryMgr;
    }

    @Resource
    public void setCountryMgr(CountryMgr countryMgr) {
        this.countryMgr = countryMgr;
    }

    @RequestMapping(value = "/register")
    public String gotoRegister(HttpServletRequest request) {


//        准备数据

//        国家
        request.setAttribute("countryList", countryMgr.listAllCountry());

//        省
        request.setAttribute("provinceList", provinceMgr.getResults("from ProvinceEntity where id = ?", new Object[]{new Integer(1)}));

//        大学

        return "public/register";
    }
}
