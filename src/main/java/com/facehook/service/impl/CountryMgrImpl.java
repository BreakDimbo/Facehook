package com.facehook.service.impl;

import com.facehook.dao.CountryDao;
import com.facehook.domain.CountryEntity;
import com.facehook.service.CountryMgr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
@Service
public class CountryMgrImpl implements CountryMgr {
    private CountryDao countryDao;

    public CountryDao getCountryDao() {
        return countryDao;
    }

    @Resource
    public void setCountryDao(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    public List<CountryEntity> listAllCountry() {
        return countryDao.getAllCountries();
    }
}
