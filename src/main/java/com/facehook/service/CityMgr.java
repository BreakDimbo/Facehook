package com.facehook.service;

import com.facehook.domain.CityEntity;
import com.facehook.service.base.MgrBaseInter;

import java.util.List;

/**
 * Created by Break.D on 7/22/16.
 */
public interface CityMgr extends MgrBaseInter {
    List<CityEntity> listAllCities();
}
