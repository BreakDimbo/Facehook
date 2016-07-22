package com.facehook.action;

import com.facehook.domain.CityEntity;
import com.facehook.service.CityMgr;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Break.D on 7/22/16.
 */
@Controller
@RequestMapping("/city")
public class CityController {
    private CityMgr cityMgr;

    public CityMgr getCityMgr() {
        return cityMgr;
    }

    @Resource
    public void setCityMgr(CityMgr cityMgr) {
        this.cityMgr = cityMgr;
    }

    @RequestMapping("/listcities")
    public String listCities(){
        System.out.println("进入 action");
        List<CityEntity> cities = cityMgr.loadCities();
        for (CityEntity c : cities) {
            System.out.println(c.getName());
        }
        return "index";
    }

}
