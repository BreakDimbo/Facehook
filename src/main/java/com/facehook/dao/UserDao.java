package com.facehook.dao;

import com.facehook.dao.base.DaoBaseInter;
import com.facehook.domain.UsersEntity;

import java.util.List;

/**
 * Created by Break.D on 7/25/16.
 */
public interface UserDao extends DaoBaseInter {
    List<UsersEntity> getUser(String email, String pwd);
}
