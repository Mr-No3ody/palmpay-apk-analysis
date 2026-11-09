package com.transsnet.analysis.data.local.database;

import M0.e;
import M0.g;
import Sd.a;
import androidx.annotation.NonNull;
import androidx.room.C1234m;
import androidx.room.J;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.z;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.transsnet.analysis.data.local.dao.EventsDao;
import com.transsnet.analysis.data.local.dao.EventsDao_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EventsDatabase_Impl extends EventsDatabase {
    private volatile EventsDao _eventsDao;

    @Override // androidx.room.G
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `events`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.G
    public z createInvalidationTracker() {
        return new z(this, new HashMap(0), new HashMap(0), "events");
    }

    @Override // androidx.room.G
    public SupportSQLiteOpenHelper createOpenHelper(C1234m configuration) {
        J callback = new J(configuration, new a(this), "fc2eab652f4147ec89e2d550e5582e32", "1bfd4ae21d0cce6ca81cc2fd142ac23e");
        e eVarBuilder = g.f5714f.builder(configuration.f17771a);
        eVarBuilder.f5710b = configuration.f17772b;
        Intrinsics.checkNotNullParameter(callback, "callback");
        eVarBuilder.f5711c = callback;
        return configuration.f17773c.create(eVarBuilder.a());
    }

    @Override // com.transsnet.analysis.data.local.database.EventsDatabase
    public EventsDao eventsDao() {
        EventsDao eventsDao;
        if (this._eventsDao != null) {
            return this._eventsDao;
        }
        synchronized (this) {
            try {
                if (this._eventsDao == null) {
                    this._eventsDao = new EventsDao_Impl(this);
                }
                eventsDao = this._eventsDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eventsDao;
    }

    @Override // androidx.room.G
    public List<J0.a> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
        return Arrays.asList(new J0.a[0]);
    }

    @Override // androidx.room.G
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.G
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(EventsDao.class, EventsDao_Impl.getRequiredConverters());
        return map;
    }
}
