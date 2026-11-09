package androidx.room;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t f17802o = new t(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f17803p = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f17804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f17805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f17806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f17807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f17808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f17809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f17810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile SupportSQLiteStatement f17811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v f17812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p1.d f17813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A.f f17814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f17815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f17816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.customview.widget.e f17817n;

    public z(G database, HashMap shadowTablesMap, HashMap viewTables, String... tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f17804a = database;
        this.f17805b = shadowTablesMap;
        this.f17806c = viewTables;
        this.f17809f = new AtomicBoolean(false);
        this.f17812i = new v(tableNames.length);
        this.f17813j = new p1.d(database);
        this.f17814k = new A.f();
        this.f17815l = new Object();
        this.f17816m = new Object();
        this.f17807d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str = tableNames[i7];
            Locale locale = Locale.US;
            String strQ = androidx.camera.video.u.q(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            this.f17807d.put(strQ, Integer.valueOf(i7));
            String str2 = (String) this.f17805b.get(tableNames[i7]);
            String strQ2 = str2 != null ? androidx.camera.video.u.q(locale, "US", str2, locale, "this as java.lang.String).toLowerCase(locale)") : null;
            if (strQ2 != null) {
                strQ = strQ2;
            }
            strArr[i7] = strQ;
        }
        this.f17808e = strArr;
        for (Map.Entry entry : this.f17805b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String strQ3 = androidx.camera.video.u.q(locale2, "US", str3, locale2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f17807d.containsKey(strQ3)) {
                String strQ4 = androidx.camera.video.u.q(locale2, "US", (String) entry.getKey(), locale2, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f17807d;
                linkedHashMap.put(strQ4, kotlin.collections.G.d(linkedHashMap, strQ3));
            }
        }
        this.f17817n = new androidx.customview.widget.e(this, 5);
    }

    public final void a(w observer) {
        x xVar;
        boolean z3;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] strArrE = e(observer.f17795a);
        ArrayList arrayList = new ArrayList(strArrE.length);
        for (String str : strArrE) {
            LinkedHashMap linkedHashMap = this.f17807d;
            Locale locale = Locale.US;
            Integer num = (Integer) linkedHashMap.get(androidx.camera.video.u.q(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
            arrayList.add(num);
        }
        int[] iArrX = CollectionsKt.X(arrayList);
        x xVar2 = new x(observer, iArrX, strArrE);
        synchronized (this.f17814k) {
            xVar = (x) this.f17814k.b(observer, xVar2);
        }
        if (xVar == null) {
            v vVar = this.f17812i;
            int[] tableIds = Arrays.copyOf(iArrX, iArrX.length);
            vVar.getClass();
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (vVar) {
                try {
                    z3 = false;
                    for (int i7 : tableIds) {
                        long[] jArr = vVar.f17791a;
                        long j6 = jArr[i7];
                        jArr[i7] = 1 + j6;
                        if (j6 == 0) {
                            vVar.f17794d = true;
                            z3 = true;
                        }
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z3) {
                G g7 = this.f17804a;
                if (g7.isOpenInternal()) {
                    h(g7.getOpenHelper().getWritableDatabase());
                }
            }
        }
    }

    public final N b(String[] tableNames, boolean z3, Callable computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        String[] tableNames2 = e(tableNames);
        for (String str : tableNames2) {
            LinkedHashMap linkedHashMap = this.f17807d;
            Locale locale = Locale.US;
            if (!linkedHashMap.containsKey(androidx.camera.video.u.q(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"))) {
                throw new IllegalArgumentException("There is no table with name ".concat(str).toString());
            }
        }
        p1.d dVar = this.f17813j;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(tableNames2, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return new N((G) dVar.f41178b, dVar, z3, computeFunction, tableNames2);
    }

    public final boolean c() {
        if (!this.f17804a.isOpenInternal()) {
            return false;
        }
        if (!this.f17810g) {
            this.f17804a.getOpenHelper().getWritableDatabase();
        }
        if (this.f17810g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void d(w observer) {
        x xVar;
        boolean z3;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f17814k) {
            xVar = (x) this.f17814k.c(observer);
        }
        if (xVar != null) {
            v vVar = this.f17812i;
            int[] iArr = xVar.f17797b;
            int[] tableIds = Arrays.copyOf(iArr, iArr.length);
            vVar.getClass();
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (vVar) {
                try {
                    z3 = false;
                    for (int i7 : tableIds) {
                        long[] jArr = vVar.f17791a;
                        long j6 = jArr[i7];
                        jArr[i7] = j6 - 1;
                        if (j6 == 1) {
                            vVar.f17794d = true;
                            z3 = true;
                        }
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z3) {
                G g7 = this.f17804a;
                if (g7.isOpenInternal()) {
                    h(g7.getOpenHelper().getWritableDatabase());
                }
            }
        }
    }

    public final String[] e(String[] strArr) {
        Af.l lVar = new Af.l();
        for (String str : strArr) {
            Locale locale = Locale.US;
            String strQ = androidx.camera.video.u.q(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            HashMap map = this.f17806c;
            if (map.containsKey(strQ)) {
                Object obj = map.get(androidx.camera.video.u.q(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)"));
                Intrinsics.e(obj);
                lVar.addAll((Collection) obj);
            } else {
                lVar.add(str);
            }
        }
        return (String[]) kotlin.collections.N.a(lVar).toArray(new String[0]);
    }

    public final void f(SupportSQLiteDatabase supportSQLiteDatabase, int i7) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i7 + ", 0)");
        String str = this.f17808e[i7];
        for (String str2 : f17803p) {
            StringBuilder sb2 = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb2.append(f17802o.getTriggerName$room_runtime_release(str, str2));
            sb2.append(" AFTER ");
            androidx.camera.video.u.x(sb2, str2, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb2.append(i7);
            sb2.append(" AND invalidated = 0; END");
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(string);
        }
    }

    public final void g(SupportSQLiteDatabase supportSQLiteDatabase, int i7) {
        String str = this.f17808e[i7];
        for (String str2 : f17803p) {
            String str3 = "DROP TRIGGER IF EXISTS " + f17802o.getTriggerName$room_runtime_release(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    public final void h(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.inTransaction()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f17804a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f17815l) {
                    int[] iArrA = this.f17812i.a();
                    if (iArrA != null) {
                        f17802o.beginTransactionInternal$room_runtime_release(database);
                        try {
                            int length = iArrA.length;
                            int i7 = 0;
                            int i10 = 0;
                            while (i7 < length) {
                                int i11 = iArrA[i7];
                                int i12 = i10 + 1;
                                if (i11 == 1) {
                                    f(database, i10);
                                } else if (i11 == 2) {
                                    g(database, i10);
                                }
                                i7++;
                                i10 = i12;
                            }
                            database.setTransactionSuccessful();
                            database.endTransaction();
                            Unit unit = Unit.f38893a;
                        } catch (Throwable th) {
                            database.endTransaction();
                            throw th;
                        }
                    }
                }
                closeLock$room_runtime_release.unlock();
            } catch (Throwable th2) {
                closeLock$room_runtime_release.unlock();
                throw th2;
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
