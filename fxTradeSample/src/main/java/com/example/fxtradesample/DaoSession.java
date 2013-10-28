package com.example.fxtradesample;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.example.fxtradesample.Instrument;

import com.example.fxtradesample.InstrumentDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig instrumentDaoConfig;

    private final InstrumentDao instrumentDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        instrumentDaoConfig = daoConfigMap.get(InstrumentDao.class).clone();
        instrumentDaoConfig.initIdentityScope(type);

        instrumentDao = new InstrumentDao(instrumentDaoConfig, this);

        registerDao(Instrument.class, instrumentDao);
    }
    
    public void clear() {
        instrumentDaoConfig.getIdentityScope().clear();
    }

    public InstrumentDao getInstrumentDao() {
        return instrumentDao;
    }

}
