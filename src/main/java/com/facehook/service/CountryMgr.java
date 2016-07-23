package com.facehook.service;

import com.facehook.domain.CountryEntity;
import com.facehook.service.base.MgrBaseInter;

import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
public interface CountryMgr extends MgrBaseInter {
    List<CountryEntity> listAllCountry();
}
