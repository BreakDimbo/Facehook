package com.facehook.dao;

import com.facehook.dao.base.DaoBaseInter;
import com.facehook.domain.AlbumEntity;

/**
 * Created by Break.D on 7/27/16.
 */
public interface AlbumDao extends DaoBaseInter {
    int save(AlbumEntity albumEntity, boolean greedy);
}
