package com.limbo.test;

import com.facehook.domain.CountryEntity;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Break.D on 7/22/16.
 */
public class ServiceTest {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public List showCountry() {
        return sessionFactory.getCurrentSession().createQuery("from CountryEntity ").list();
    }
}
