package com.facehook.action;

import com.facehook.domain.UsersEntity;
import com.facehook.dto.LoginInfo;
import com.facehook.service.UserMgr;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

    //使用 request.getSession()设置的 session 会有问题,待研究
    @PostMapping(value = "/check")
    public String checkLoginInfo(@ModelAttribute("loginInfo") LoginInfo loginInfo, HttpSession session) {
        String email = loginInfo.getEmail();
        String pwd = loginInfo.getPwd();

        UsersEntity user = userMgr.checkUser(email, pwd);

        if (user != null) {
            session.setAttribute("loginUser", user);

            return "individual/home";
        } else {
            return "public/index";
        }
    }

    //退出登录
    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "forward:get";
    }

}
