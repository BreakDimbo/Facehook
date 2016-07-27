package com.facehook.action;

import com.facehook.domain.UsersEntity;
import com.facehook.dto.LoginInfo;
import com.facehook.service.UserMgr;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Break.D on 7/25/16.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    private UserMgr userMgr;

    public UserMgr getUserMgr() {
        return userMgr;
    }

    @Resource
    public void setUserMgr(UserMgr userMgr) {
        this.userMgr = userMgr;
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getLoginInfo(Model model) {
        LoginInfo loginInfo = new LoginInfo();
        model.addAttribute("loginInfo", loginInfo);
        return "public/index";
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public String checkLoginInfo(@ModelAttribute LoginInfo loginInfo, Model model, HttpServletRequest request) {
        String email = loginInfo.getEmail();
        String pwd = loginInfo.getPwd();

        UsersEntity user = userMgr.checkUser(email, pwd);

        if (user != null) {
            request.getSession().setAttribute("loginUser ", user);
            return "individual/home";
        } else {
            return "public/index";
        }


    }

}
