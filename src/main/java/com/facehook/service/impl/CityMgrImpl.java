package com.facehook.service.impl;

import com.facehook.dao.CityDao;
import com.facehook.domain.CityEntity;
import com.facehook.service.CityMgr;
import com.facehook.service.base.MgrBaseImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Break.D on 7/22/16.
 */
@Component
public class CityMgrImpl extends MgrBaseImpl implements CityMgr {
    private CityDao cityDao;

    public CityDao getCityDao() {
        return cityDao;
    }

    @Resource
    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }


    public List<CityEntity> listAllCities() {
        return cityDao.listAllCities();
    }
}
