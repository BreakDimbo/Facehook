package com.facehook.dao.base;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
public interface DaoBaseInter {

    void save(Object object);

    void delete(Object object);

    void update(String hql, Object[] parameters);

    List getResults(String hql, Object[] parameters);

    Object loadById(Class clazz, Serializable id);

}
