package com.facehook.action;

import com.facehook.domain.UsersEntity;
import com.facehook.service.UserMgr;
import com.facehook.util.MyTools;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Break.D on 7/27/16.
 */
@Controller
@RequestMapping(value = "/upload")
public class UploadController {

    private UserMgr userMgr;

    public UserMgr getUserMgr() {
        return userMgr;
    }

    @Resource
    public void setUserMgr(UserMgr userMgr) {
        this.userMgr = userMgr;
    }

    @RequestMapping(value = "/gotoUpload")
    public String gotoUpload() {
        return "individual/uploadPhoto";
    }

    @PostMapping(value = "/avatar")
    public String uploadAvatar(@RequestParam("avatar") MultipartFile photo, HttpSession session) {
        if (!photo.isEmpty()) {
            UsersEntity user = (UsersEntity) session.getAttribute("loginUser");

            //do store
            String filename = MyTools.myUpload(session, photo, user.getId());
            user.setPhoto(filename);
            userMgr.updatePhoto(user);

            // redirect 的作用:1.避免用户重复提交/ 2.跳转至其他 Controller,消除数据,避免混淆
            return "redirect:gotoUpload";
        } else {
            return "redirect:uploadFail";
        }
    }
}
