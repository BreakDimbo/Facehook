package com.facehook.dao;

import com.facehook.dao.base.DaoBaseInter;
import com.facehook.domain.CityEntity;

import java.util.List;

/**
 * Created by Break.D on 7/22/16.
 */
public interface CityDao extends DaoBaseInter {
    List<CityEntity> getAllCities();

    List<CityEntity> getCitiesByProId(int pid);
}
