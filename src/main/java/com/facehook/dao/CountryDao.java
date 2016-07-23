package com.facehook.dao;

import com.facehook.dao.base.DaoBaseInter;
import com.facehook.domain.CountryEntity;

import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
public interface CountryDao extends DaoBaseInter {
    List<CountryEntity> listAllCountry();
}
