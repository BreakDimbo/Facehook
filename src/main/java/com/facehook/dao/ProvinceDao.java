package com.facehook.dao;

import com.facehook.dao.base.DaoBaseInter;
import com.facehook.domain.ProvinceEntity;

import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
public interface ProvinceDao extends DaoBaseInter {
    List<ProvinceEntity> getAllProvinces();

    List<ProvinceEntity> getProByCountryId(int id);
}
