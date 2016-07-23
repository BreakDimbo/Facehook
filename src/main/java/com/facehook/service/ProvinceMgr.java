package com.facehook.service;

import com.facehook.dao.base.DaoBaseInter;

import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
public interface ProvinceMgr extends DaoBaseInter{
    List<Object> getAllProvince();
}
