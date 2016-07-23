package com.facehook.service.base;

import com.facehook.dao.base.DaoBaseInter;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
public abstract class MgrBaseImpl implements MgrBaseInter {

    private DaoBaseInter daoBaseInter;

    public DaoBaseInter getDaoBaseInter() {
        return daoBaseInter;
    }

    @Resource(name = "generalDao")
    public void setDaoBaseInter(DaoBaseInter daoBaseInter) {
        this.daoBaseInter = daoBaseInter;
    }

    public void add(Object object) {
        daoBaseInter.save(object);
    }

    public void delete(Object object) {
        daoBaseInter.delete(object);
    }

    public void update(String hql, Object[] parameters) {
        daoBaseInter.update(hql, parameters);
    }

    public List<Object> getResults(String hql, Object[] parameters) {
        return daoBaseInter.getResults(hql, parameters);
    }
}
