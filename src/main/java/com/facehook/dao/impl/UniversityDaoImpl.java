package com.facehook.dao.impl;

import com.facehook.dao.UniversityDao;
import com.facehook.dao.base.DaoBaseImpl;
import com.facehook.domain.UniversityEntity;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
@Repository
public class UniversityDaoImpl extends DaoBaseImpl implements UniversityDao {
    public List<UniversityEntity> getAllUniversities() {
        return this.getResults("from UniversityEntity", null);
    }

    public List<UniversityEntity> getUniByProId(int pId, int cId) {
        Query query = getSessionFactory().getCurrentSession().createQuery("from UniversityEntity u where u.proId = ? and u.countryId = ?");
        query.setParameter(0, pId);
        query.setParameter(1, cId);
        return query.list();
    }
}
