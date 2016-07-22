package com.facehook.dao.impl;

import com.facehook.dao.CityDao;
import com.facehook.domain.CityEntity;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Break.D on 7/22/16.
 */
@Component
public class CityDaoImpl implements CityDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public CityEntity load(int id) {
        return sessionFactory.getCurrentSession().load(CityEntity.class, id);
    }

    public void save(CityEntity cityEntity) {
        sessionFactory.getCurrentSession().save(cityEntity);

    }

    public List<CityEntity> loadCities() {
        List<CityEntity> cityEntities = (List<CityEntity>) sessionFactory.getCurrentSession().createQuery("from CityEntity").list();
        return cityEntities;
    }

    public void delete(CityEntity c) {
        sessionFactory.getCurrentSession().delete(c);
    }
}
