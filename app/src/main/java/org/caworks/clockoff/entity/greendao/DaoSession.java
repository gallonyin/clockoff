package org.caworks.clockoff.entity.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import org.caworks.clockoff.entity.greendao.ClockOffBean;

import org.caworks.clockoff.entity.greendao.ClockOffBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig clockOffBeanDaoConfig;

    private final ClockOffBeanDao clockOffBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        clockOffBeanDaoConfig = daoConfigMap.get(ClockOffBeanDao.class).clone();
        clockOffBeanDaoConfig.initIdentityScope(type);

        clockOffBeanDao = new ClockOffBeanDao(clockOffBeanDaoConfig, this);

        registerDao(ClockOffBean.class, clockOffBeanDao);
    }
    
    public void clear() {
        clockOffBeanDaoConfig.clearIdentityScope();
    }

    public ClockOffBeanDao getClockOffBeanDao() {
        return clockOffBeanDao;
    }

}