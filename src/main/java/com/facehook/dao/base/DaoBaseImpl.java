package com.facehook.dao.base;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Break.D on 7/23/16.
 */
@Transactional
public abstract class DaoBaseImpl implements DaoBaseInter{

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Object object) {
        sessionFactory.getCurrentSession().save(object);
    }

    public void delete(Object object) {
        sessionFactory.getCurrentSession().delete(object);
    }

    public void update(String hql, Object[] parameters) {
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        if (parameters != null && parameters.length > 0) {
            for (int i = 0; i < parameters.length; i++) {
                query.setParameter(i, parameters[i]);
            }
        }
        query.executeUpdate();
    }

    /**
     * @author break.D
     * @param hql 查询语句
     * @param parameters ? 对应的参数
     * @return
     */
    public List getResults(String hql, Object[] parameters) {

        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        if (parameters != null && parameters.length > 0) {
            for (int i = 0; i < parameters.length; i++) {
                query.setParameter(i, parameters[i]);
            }
        }
        return query.list();

    }

    public Object loadById(Class clazz, Serializable id) {
        return sessionFactory.getCurrentSession().get(clazz, id);
    }
}
