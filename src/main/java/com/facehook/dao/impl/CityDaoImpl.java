package com.facehook.dao.impl;

import com.facehook.dao.CityDao;
import com.facehook.dao.base.DaoBaseImpl;
import com.facehook.domain.CityEntity;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Break.D on 7/22/16.
 */
@Component
public class CityDaoImpl extends DaoBaseImpl implements CityDao {


    public List<CityEntity> listAllCities() {
        return (List<CityEntity>) this.getResults("from CityEntity", null);
    }
}
