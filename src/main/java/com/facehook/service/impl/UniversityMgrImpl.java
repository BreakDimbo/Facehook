package com.facehook.service.impl;

import com.facehook.dao.UniversityDao;
import com.facehook.domain.UniversityEntity;
import com.facehook.service.UniversityMgr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
@Service
public class UniversityMgrImpl implements UniversityMgr {
    private UniversityDao universityDao;

    public UniversityDao getUniversityDao() {
        return universityDao;
    }

    @Resource
    public void setUniversityDao(UniversityDao universityDao) {
        this.universityDao = universityDao;
    }

    public List<UniversityEntity> getAllUniversities() {
        return universityDao.getAllUniversities();
    }

    public List<UniversityEntity> showUniByProCouId(int pId, int cId) {
        return universityDao.getUniByProId(pId, cId);
    }
}
