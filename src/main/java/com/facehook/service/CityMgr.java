package com.facehook.service;

import com.facehook.domain.CityEntity;

import java.util.List;

/**
 * Created by Break.D on 7/22/16.
 */
public interface CityMgr {
    void add(CityEntity c);
    void delete(CityEntity c);
    CityEntity load(int id);

    List<CityEntity> loadCities();
}
