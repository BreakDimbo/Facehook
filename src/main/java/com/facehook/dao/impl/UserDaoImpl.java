package com.facehook.dao.impl;

import com.facehook.dao.UserDao;
import com.facehook.dao.base.DaoBaseImpl;
import com.facehook.domain.UsersEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Break.D on 7/25/16.
 */
@Repository

public class UserDaoImpl extends DaoBaseImpl implements UserDao {
    public List<UsersEntity> getUser(String email, String pwd) {
        return  getResults("from UsersEntity u where u.email=? and u.pwd=?", new Object[]{email, pwd});
    }

    public void updatePhoto(UsersEntity user) {
        update("update UsersEntity u set u.photo=? where u.id=?", new Object[]{user.getPhoto(), user.getId()});
//        updateAll(user);
    }
}
