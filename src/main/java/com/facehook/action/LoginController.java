package com.facehook.action;

import com.facehook.dto.LoginInfo;
import com.facehook.dto.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Break.D on 7/25/16.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getLoginInfo(Model model) {
        LoginInfo loginInfo = new LoginInfo();
        model.addAttribute("loginInfo", loginInfo);
        return "public/index";
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public String checkLoginInfo(@ModelAttribute LoginInfo loginInfo, Model model) {
        


        return "individual/home";
    }

}
