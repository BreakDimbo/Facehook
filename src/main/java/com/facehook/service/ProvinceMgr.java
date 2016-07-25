package com.facehook.service;

import com.facehook.dao.base.DaoBaseInter;
import com.facehook.domain.ProvinceEntity;

import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
public interface ProvinceMgr {
    List<ProvinceEntity> getAllProvince();

    List<ProvinceEntity> showProByCountryId(int id);
}
