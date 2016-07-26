package com.facehook.service;

import com.facehook.domain.UniversityEntity;

import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
public interface UniversityMgr {
    List<UniversityEntity> getAllUniversities();

    List<UniversityEntity> showUniByProCouId(int pId, int cId);

    UniversityEntity getUniversityById(int id);
}
