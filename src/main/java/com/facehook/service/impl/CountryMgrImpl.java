package com.facehook.service.impl;

import com.facehook.dao.CountryDao;
import com.facehook.domain.CountryEntity;
import com.facehook.service.CountryMgr;
import com.facehook.service.base.MgrBaseImpl;
import com.facehook.service.base.MgrBaseInter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
@Component
public class CountryMgrImpl extends MgrBaseImpl implements CountryMgr {
    private CountryDao countryDao;

    public CountryDao getCountryDao() {
        return countryDao;
    }

    @Resource
    public void setCountryDao(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    public List<CountryEntity> listAllCountry() {
        return countryDao.listAllCountry();
    }
}
