package com.facehook.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Break.D on 7/23/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserContoller {


    @RequestMapping("/gotoHome")
    public String gotoHome() {
        return "individual/home";
    }

    @RequestMapping(value = "/gotoHomePage")
    public String gotoHomePage() {
        return "individual/homePage";
    }





}
