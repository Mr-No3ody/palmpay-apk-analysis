package p7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static g f41263d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f41264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SQLiteDatabase f41265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41266c;

    public final synchronized void a() {
        SQLiteDatabase sQLiteDatabase = this.f41265b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f41265b.close();
            this.f41265b = null;
        }
    }

    public final synchronized boolean b() {
        a();
        return this.f41264a.deleteDatabase("RKStorage");
    }

    public final synchronized void c() {
        SQLiteDatabase sQLiteDatabase = this.f41265b;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            SQLiteException e10 = null;
            for (int i7 = 0; i7 < 2; i7++) {
                if (i7 > 0) {
                    try {
                        b();
                    } catch (SQLiteException e11) {
                        e10 = e11;
                        try {
                            Thread.sleep(30L);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                this.f41265b = getWritableDatabase();
            }
            SQLiteDatabase sQLiteDatabase2 = this.f41265b;
            if (sQLiteDatabase2 == null) {
                throw e10;
            }
            sQLiteDatabase2.setMaximumSize(this.f41266c);
        }
    }

    public final synchronized SQLiteDatabase d() {
        c();
        return this.f41265b;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i10) {
        if (i7 != i10) {
            b();
            onCreate(sQLiteDatabase);
        }
    }
}
