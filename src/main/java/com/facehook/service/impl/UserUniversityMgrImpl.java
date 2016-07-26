package com.facehook.service.impl;

import com.facehook.dao.UserUniversityDao;
import com.facehook.domain.UserUniversityEntity;
import com.facehook.service.UserUniversityMgr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Break.D on 7/25/16.
 */
@Service
public class UserUniversityMgrImpl implements UserUniversityMgr {

    private UserUniversityDao userUniversityDao;

    public UserUniversityDao getUserUniversityDao() {
        return userUniversityDao;
    }

    @Resource
    public void setUserUniversityDao(UserUniversityDao userUniversityDao) {
        this.userUniversityDao = userUniversityDao;
    }

    public void save(UserUniversityEntity userUniversityEntity) {
        userUniversityDao.save(userUniversityEntity);
    }
}
