package com.facehook.service;

import com.facehook.domain.UsersEntity;

/**
 * Created by Break.D on 7/25/16.
 */
public interface UserMgr {

    void save(UsersEntity user);

    UsersEntity checkUser(String email, String pwd);
}
