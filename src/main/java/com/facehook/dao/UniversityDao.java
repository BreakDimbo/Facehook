package com.facehook.dao;

import com.facehook.dao.base.DaoBaseInter;
import com.facehook.domain.UniversityEntity;

import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
public interface UniversityDao extends DaoBaseInter{
    List<UniversityEntity> getAllUniversities();

    List<UniversityEntity> getUniByProId(int pId, int cId);
}
