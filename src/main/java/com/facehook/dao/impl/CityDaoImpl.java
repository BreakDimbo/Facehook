package com.facehook.dao.impl;

import com.facehook.dao.CityDao;
import com.facehook.dao.base.DaoBaseImpl;
import com.facehook.domain.CityEntity;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Break.D on 7/22/16.
 */
@Repository
public class CityDaoImpl extends DaoBaseImpl implements CityDao {


    public List<CityEntity> getAllCities() {
        return (List<CityEntity>) this.getResults("from CityEntity", null);
    }
}
