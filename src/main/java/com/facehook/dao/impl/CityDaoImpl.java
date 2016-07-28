package com.facehook.dao.impl;

import com.facehook.dao.CityDao;
import com.facehook.dao.base.DaoBaseImpl;
import com.facehook.domain.CityEntity;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Break.D on 7/22/16.
 */
@Repository
public class CityDaoImpl extends DaoBaseImpl implements CityDao {


    public List<CityEntity> getAllCities() {
        return (List<CityEntity>) this.getResults("from CityEntity", null);
    }

    public List<CityEntity> getCitiesByProId(int pid) {
        Query query = getSessionFactory().getCurrentSession().createQuery("from CityEntity where proId = " + pid);
        return query.list();
    }
}
