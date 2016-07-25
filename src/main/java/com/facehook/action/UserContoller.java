package com.facehook.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Break.D on 7/23/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserContoller {


    @RequestMapping(value = "/addUser")
    public String addUser(HttpServletRequest request) {

        String name = request.getParameter("name");

        return "individual/home";
    }


}
