package com.transsnet.palmpay.teller.db;

import M0.e;
import M0.g;
import Sd.a;
import androidx.camera.camera2.internal.P0;
import androidx.room.C1234m;
import androidx.room.J;
import androidx.room.z;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.transsnet.palmpay.teller.db.dao.BillerSearchRecordDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class BillerSearchRecordDataBase_Impl extends BillerSearchRecordDataBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile P0 f34138b;

    @Override // com.transsnet.palmpay.teller.db.BillerSearchRecordDataBase
    public final BillerSearchRecordDao c() {
        P0 p3;
        if (this.f34138b != null) {
            return this.f34138b;
        }
        synchronized (this) {
            try {
                if (this.f34138b == null) {
                    this.f34138b = new P0(this);
                }
                p3 = this.f34138b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p3;
    }

    @Override // androidx.room.G
    public final void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `biller_search_record`");
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
        return new z(this, new HashMap(0), new HashMap(0), "biller_search_record");
    }

    @Override // androidx.room.G
    public final SupportSQLiteOpenHelper createOpenHelper(C1234m c1234m) {
        J callback = new J(c1234m, new a(this, 0), "cb5a7433ef0fe5a928245ea6010640fe", "6837eaba5e305630be781f32993dcf89");
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
        map.put(BillerSearchRecordDao.class, Collections.EMPTY_LIST);
        return map;
    }
}
