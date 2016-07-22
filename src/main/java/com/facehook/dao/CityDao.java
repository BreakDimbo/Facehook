package com.facehook.dao;

import com.facehook.domain.CityEntity;

import java.util.List;

/**
 * Created by Break.D on 7/22/16.
 */
public interface CityDao {
    CityEntity load(int id);

    void save(CityEntity cityEntity);

    List<CityEntity> loadCities();

    void delete(CityEntity cityEntity);

}
