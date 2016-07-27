package com.facehook.dao.impl;

import com.facehook.dao.AlbumDao;
import com.facehook.dao.base.DaoBaseImpl;
import com.facehook.domain.AlbumEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by Break.D on 7/27/16.
 */
@Repository
public class AlbumDaoImpl extends DaoBaseImpl implements AlbumDao {


    public int save(AlbumEntity albumEntity, boolean greedy) {
        int id = (Integer) getSessionFactory().getCurrentSession().save(albumEntity);
        return id;
    }
}
