package com.facehook.service.impl;

import com.facehook.dao.UserDao;
import com.facehook.domain.UsersEntity;
import com.facehook.service.UserMgr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Break.D on 7/25/16.
 */
@Service
public class UserMgrImpl implements UserMgr {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    @Resource
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(UsersEntity user) {
        userDao.save(user);
    }

    public UsersEntity checkUser(String email, String pwd) {
        List<UsersEntity> users = userDao.getUser(email, pwd);
        if (users.size() == 1) {
            return users.get(0);
        }
        return null;
    }
}
