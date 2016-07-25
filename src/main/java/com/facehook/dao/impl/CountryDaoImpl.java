package com.facehook.dao.impl;

import com.facehook.dao.CountryDao;
import com.facehook.dao.base.DaoBaseImpl;
import com.facehook.domain.CountryEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
@Repository
public class CountryDaoImpl extends DaoBaseImpl implements CountryDao {
    public List<CountryEntity> getAllCountries() {
        return (List<CountryEntity>) this.getResults("from CountryEntity", null);
    }
}
