package com.facehook.service.impl;

import com.facehook.dao.AlbumDao;
import com.facehook.domain.AlbumEntity;
import com.facehook.service.AlbumMgr;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Break.D on 7/27/16.
 */
@Service
public class AlbumMgrImpl implements AlbumMgr {

    private AlbumDao albumDao;

    public AlbumDao getAlbumDao() {
        return albumDao;
    }

    @Resource
    public void setAlbumDao(AlbumDao albumDao) {
        this.albumDao = albumDao;
    }

    public int save(AlbumEntity albumEntity) {
        return albumDao.save(albumEntity, true);
    }
}
