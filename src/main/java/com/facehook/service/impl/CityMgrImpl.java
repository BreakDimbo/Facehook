package com.facehook.service.impl;

import com.facehook.dao.CityDao;
import com.facehook.domain.CityEntity;
import com.facehook.service.CityMgr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Break.D on 7/22/16.
 */
@Service
public class CityMgrImpl implements CityMgr {
    private CityDao cityDao;

    public CityDao getCityDao() {
        return cityDao;
    }

    @Resource
    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }


    public List<CityEntity> listAllCities() {
        return cityDao.getAllCities();
    }

    public List<CityEntity> getCitiesByProId(int pid) {
        return cityDao.getCitiesByProId(pid);
    }
}
