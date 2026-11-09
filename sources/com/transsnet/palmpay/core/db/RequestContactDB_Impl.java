package com.transsnet.palmpay.core.db;

import M0.e;
import M0.g;
import N2.a;
import androidx.room.C1234m;
import androidx.room.J;
import androidx.room.z;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.transsnet.palmpay.core.db.dao.RequestContactDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class RequestContactDB_Impl extends RequestContactDB {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile a f27374b;

    @Override // com.transsnet.palmpay.core.db.RequestContactDB
    public final RequestContactDao c() {
        a aVar;
        if (this.f27374b != null) {
            return this.f27374b;
        }
        synchronized (this) {
            try {
                if (this.f27374b == null) {
                    this.f27374b = new a(this);
                }
                aVar = this.f27374b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // androidx.room.G
    public final void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `request_contacts`");
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
    public final z createInvalidationTracker() {
        return new z(this, new HashMap(0), new HashMap(0), "request_contacts");
    }

    @Override // androidx.room.G
    public final SupportSQLiteOpenHelper createOpenHelper(C1234m c1234m) {
        J callback = new J(c1234m, new Sd.a(this, 2), "6c96b611ceb7162cf419f5abfd3b4792", "1fc98abc8cf207a44925cce3e1cfd766");
        e eVarBuilder = g.f5714f.builder(c1234m.f17771a);
        eVarBuilder.f5710b = c1234m.f17772b;
        Intrinsics.checkNotNullParameter(callback, "callback");
        eVarBuilder.f5711c = callback;
        return c1234m.f17773c.create(eVarBuilder.a());
    }

    @Override // androidx.room.G
    public final List getAutoMigrations(Map map) {
        return new ArrayList();
    }

    @Override // androidx.room.G
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.G
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(RequestContactDao.class, Collections.EMPTY_LIST);
        return map;
    }
}
