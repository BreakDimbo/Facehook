package com.facehook.service.impl;

import com.facehook.dao.ProvinceDao;
import com.facehook.domain.CountryEntity;
import com.facehook.domain.ProvinceEntity;
import com.facehook.service.ProvinceMgr;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
@Service
public class ProvinceMgrImpl implements ProvinceMgr {

    private ProvinceDao provinceDao;

    public ProvinceDao getProvinceDao() {
        return provinceDao;
    }

    @Resource
    public void setProvinceDao(ProvinceDao provinceDao) {
        this.provinceDao = provinceDao;
    }

    public List<ProvinceEntity> getAllProvince() {
        return provinceDao.getAllProvinces();
    }

    public List<ProvinceEntity> showProByCountryId(int id) {
        return provinceDao.getProByCountryId(id);
    }
}
