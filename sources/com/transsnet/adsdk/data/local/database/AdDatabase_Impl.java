package com.transsnet.adsdk.data.local.database;

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
import com.transsnet.adsdk.data.local.dao.AdDao;
import com.transsnet.adsdk.data.local.dao.AdDao_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AdDatabase_Impl extends AdDatabase {
    private volatile AdDao _adDao;

    @Override // com.transsnet.adsdk.data.local.database.AdDatabase
    public AdDao adDao() {
        AdDao adDao;
        if (this._adDao != null) {
            return this._adDao;
        }
        synchronized (this) {
            try {
                if (this._adDao == null) {
                    this._adDao = new AdDao_Impl(this);
                }
                adDao = this._adDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return adDao;
    }

    @Override // androidx.room.G
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `ad_detail`");
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
        return new z(this, new HashMap(0), new HashMap(0), "ad_detail");
    }

    @Override // androidx.room.G
    public SupportSQLiteOpenHelper createOpenHelper(C1234m configuration) {
        J callback = new J(configuration, new a(this), "c33f582bbda7cb4cee66332b14fe8583", "7ae0b00590280ed43db6cb4eb7e2689a");
        e eVarBuilder = g.f5714f.builder(configuration.f17771a);
        eVarBuilder.f5710b = configuration.f17772b;
        Intrinsics.checkNotNullParameter(callback, "callback");
        eVarBuilder.f5711c = callback;
        return configuration.f17773c.create(eVarBuilder.a());
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
        map.put(AdDao.class, AdDao_Impl.getRequiredConverters());
        return map;
    }
}
