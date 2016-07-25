package com.facehook.dao.impl;

import com.facehook.dao.ProvinceDao;
import com.facehook.dao.base.DaoBaseImpl;
import com.facehook.domain.ProvinceEntity;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
@Repository
public class ProvinceDaoImpl extends DaoBaseImpl implements ProvinceDao {
    public List<ProvinceEntity> getAllProvinces() {
        return this.getResults("from ProvinceEntity", null);
    }

    public List<ProvinceEntity> getProByCountryId(int id) {
        Query query = getSessionFactory().getCurrentSession().createQuery(
                "from ProvinceEntity p where p.countryId = ?");
        query.setParameter(0, id);
        return query.list();
    }
}
