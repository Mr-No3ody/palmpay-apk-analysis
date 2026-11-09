package androidx.work.impl;

import androidx.room.C1234m;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile androidx.work.impl.model.n f18388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile androidx.work.impl.model.b f18389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile androidx.camera.video.internal.c f18390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile O2.a f18391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile androidx.work.impl.model.b f18392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile O2.a f18393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile p279s5.d f18394h;

    @Override // androidx.work.impl.WorkDatabase
    public final DependencyDao c() {
        androidx.work.impl.model.b bVar;
        if (this.f18389c != null) {
            return this.f18389c;
        }
        synchronized (this) {
            try {
                if (this.f18389c == null) {
                    this.f18389c = new androidx.work.impl.model.b(this, 0);
                }
                bVar = this.f18389c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.room.G
    public final void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.execSQL("DELETE FROM `Dependency`");
            writableDatabase.execSQL("DELETE FROM `WorkSpec`");
            writableDatabase.execSQL("DELETE FROM `WorkTag`");
            writableDatabase.execSQL("DELETE FROM `SystemIdInfo`");
            writableDatabase.execSQL("DELETE FROM `WorkName`");
            writableDatabase.execSQL("DELETE FROM `WorkProgress`");
            writableDatabase.execSQL("DELETE FROM `Preference`");
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
    public final androidx.room.z createInvalidationTracker() {
        return new androidx.room.z(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.G
    public final SupportSQLiteOpenHelper createOpenHelper(C1234m c1234m) {
        androidx.room.J callback = new androidx.room.J(c1234m, new Sd.a(this), "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0");
        M0.e eVarBuilder = M0.g.f5714f.builder(c1234m.f17771a);
        eVarBuilder.f5710b = c1234m.f17772b;
        Intrinsics.checkNotNullParameter(callback, "callback");
        eVarBuilder.f5711c = callback;
        return c1234m.f17773c.create(eVarBuilder.a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public final PreferenceDao d() {
        p279s5.d dVar;
        if (this.f18394h != null) {
            return this.f18394h;
        }
        synchronized (this) {
            try {
                if (this.f18394h == null) {
                    this.f18394h = new p279s5.d(this);
                }
                dVar = this.f18394h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final SystemIdInfoDao e() {
        O2.a aVar;
        if (this.f18391e != null) {
            return this.f18391e;
        }
        synchronized (this) {
            try {
                if (this.f18391e == null) {
                    this.f18391e = new O2.a(this, 5);
                }
                aVar = this.f18391e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final WorkNameDao f() {
        androidx.work.impl.model.b bVar;
        if (this.f18392f != null) {
            return this.f18392f;
        }
        synchronized (this) {
            try {
                if (this.f18392f == null) {
                    this.f18392f = new androidx.work.impl.model.b(this, 1);
                }
                bVar = this.f18392f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final WorkProgressDao g() {
        O2.a aVar;
        if (this.f18393g != null) {
            return this.f18393g;
        }
        synchronized (this) {
            try {
                if (this.f18393g == null) {
                    this.f18393g = new O2.a(this, 6);
                }
                aVar = this.f18393g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // androidx.room.G
    public final List getAutoMigrations(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1269b(13, 14, 10));
        arrayList.add(new r(0));
        arrayList.add(new C1269b(16, 17, 11));
        arrayList.add(new C1269b(17, 18, 12));
        arrayList.add(new C1269b(18, 19, 13));
        arrayList.add(new r(1));
        arrayList.add(new C1269b(20, 21, 14));
        arrayList.add(new C1269b(22, 23, 15));
        return arrayList;
    }

    @Override // androidx.room.G
    public final Set getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.G
    public final Map getRequiredTypeConverters() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(WorkSpecDao.class, list);
        map.put(DependencyDao.class, list);
        map.put(WorkTagDao.class, list);
        map.put(SystemIdInfoDao.class, list);
        map.put(WorkNameDao.class, list);
        map.put(WorkProgressDao.class, list);
        map.put(PreferenceDao.class, list);
        map.put(RawWorkInfoDao.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final WorkSpecDao h() {
        androidx.work.impl.model.n nVar;
        if (this.f18388b != null) {
            return this.f18388b;
        }
        synchronized (this) {
            try {
                if (this.f18388b == null) {
                    this.f18388b = new androidx.work.impl.model.n(this);
                }
                nVar = this.f18388b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final WorkTagDao i() {
        androidx.camera.video.internal.c cVar;
        if (this.f18390d != null) {
            return this.f18390d;
        }
        synchronized (this) {
            try {
                if (this.f18390d == null) {
                    this.f18390d = new androidx.camera.video.internal.c(this);
                }
                cVar = this.f18390d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
