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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    public String getLoginInfo(Model model, HttpServletRequest request, HttpSession session) {

        //读取cookie 判断是否需要自动登录
        Cookie[] cookies = request.getCookies();
        String email = null;
        String pwd = null;
        for (Cookie c : cookies) {
            if (c.getName().equals("LoginName")) {
                email = c.getValue();
            }
            if (c.getName().equals("Password")) {
                pwd = c.getValue();
            }
        }

        //判断 cookie 内容是否有效
        UsersEntity user = userMgr.checkUser(email, pwd);

        if (user != null) {
            session.setAttribute("loginUser", user);
            return "redirect:/user/gotoHome";
        } else {
            LoginInfo loginInfo = new LoginInfo();
            model.addAttribute("loginInfo", loginInfo);
            return "public/index";
        }
    }

    //使用 request.getSession()设置的 session 会有问题,待研究
    @PostMapping(value = "/check")
    public String checkLoginInfo(@ModelAttribute("loginInfo") LoginInfo loginInfo, HttpSession session,
                                 HttpServletRequest request, HttpServletResponse response) {
        String email = loginInfo.getEmail();
        String pwd = loginInfo.getPwd();
        String isRemember = loginInfo.getRemember();

        UsersEntity user = userMgr.checkUser(email, pwd);

        if (user != null) {
            session.setAttribute("loginUser", user);

            //设置自动登录(设置coolkie)
            if (isRemember != null && isRemember.trim().equals("true")) {
                Cookie cookie = new Cookie("LoginName", email);
                //设置存活时间
                cookie.setMaxAge(60 * 60 * 24 * 7);
                //设置路径
                cookie.setPath(request.getContextPath());
                response.addCookie(cookie);
                cookie = new Cookie("Password", pwd);
                //设置存活时间
                cookie.setMaxAge(60 * 60 * 24 * 7);
                //设置路径
                cookie.setPath(request.getContextPath());
                response.addCookie(cookie);
            }

            //redirect 尽量使用绝对路径
            return "redirect:/user/gotoHome";
        } else {
            return "redirect:get";
        }
    }

    //退出登录
    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().invalidate();

        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies) {
            if (c.getName().equals("LoginName")) {
                c.setPath(request.getContextPath());
                c.setMaxAge(0);
                response.addCookie(c);
            }
            if (c.getName().equals("Password")) {
                c.setPath(request.getContextPath());
                c.setMaxAge(0);
                response.addCookie(c);
            }
        }

        return "redirect:/login/get";
    }

}
