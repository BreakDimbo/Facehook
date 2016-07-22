package com.facehook.service.impl;

import com.facehook.dao.CityDao;
import com.facehook.domain.CityEntity;
import com.facehook.service.CityMgr;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Break.D on 7/22/16.
 */
@Component
public class CityMgrImpl implements CityMgr {
    private CityDao cityDao;

    public CityDao getCityDao() {
        return cityDao;
    }

    @Resource
    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Transactional
    public void add(CityEntity c) {
        cityDao.save(c);
    }

    @Transactional
    public void delete(CityEntity c) {
        cityDao.delete(c);
    }

    @Transactional
    public CityEntity load(int id) {
        return cityDao.load(id);
    }

    @Transactional
    public List<CityEntity> loadCities() {
        return cityDao.loadCities();
    }
}
