package N0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f6046i = new j(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f6048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M0.d f6049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O0.b f6052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6053g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, String str, final f dbRef, final M0.d callback, boolean z3) {
        String string;
        super(context, str, null, callback.f5708a, new DatabaseErrorHandler() { // from class: N0.g
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                M0.d callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                f dbRef2 = dbRef;
                Intrinsics.checkNotNullParameter(dbRef2, "$dbRef");
                Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
                d db2 = k.f6046i.getWrappedDb(dbRef2, dbObj);
                callback2.getClass();
                Intrinsics.checkNotNullParameter(db2, "db");
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
                boolean zIsOpen = db2.f6034a.isOpen();
                SQLiteDatabase sQLiteDatabase = db2.f6034a;
                if (!zIsOpen) {
                    String path = sQLiteDatabase.getPath();
                    if (path != null) {
                        M0.d.a(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        db2.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                            M0.d.a((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase.getPath();
                        if (path2 != null) {
                            M0.d.a(path2);
                        }
                    }
                }
            }
        });
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dbRef, "dbRef");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f6047a = context;
        this.f6048b = dbRef;
        this.f6049c = callback;
        this.f6050d = z3;
        if (str == null) {
            string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        } else {
            string = str;
        }
        this.f6052f = new O0.b(string, context.getCacheDir(), false);
    }

    public final SupportSQLiteDatabase a(boolean z3) {
        O0.b bVar = this.f6052f;
        try {
            bVar.a((this.f6053g || getDatabaseName() == null) ? false : true);
            this.f6051e = false;
            SQLiteDatabase sQLiteDatabaseD = d(z3);
            if (!this.f6051e) {
                return b(sQLiteDatabaseD);
            }
            close();
            return a(z3);
        } finally {
            bVar.b();
        }
    }

    public final d b(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return f6046i.getWrappedDb(this.f6048b, sqLiteDatabase);
    }

    public final SQLiteDatabase c(boolean z3) {
        if (z3) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        O0.b bVar = this.f6052f;
        try {
            bVar.a(bVar.f6532a);
            super.close();
            this.f6048b.f6035a = null;
            this.f6053g = false;
        } finally {
            bVar.b();
        }
    }

    public final SQLiteDatabase d(boolean z3) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z8 = this.f6053g;
        Context context = this.f6047a;
        if (databaseName != null && !z8 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            return c(z3);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return c(z3);
            } catch (Throwable th) {
                super.close();
                if (th instanceof h) {
                    h hVar = th;
                    int iOrdinal = hVar.f6038a.ordinal();
                    Throwable th2 = hVar.f6039b;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || !(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f6050d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return c(z3);
                } catch (h e10) {
                    throw e10.f6039b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        boolean z3 = this.f6051e;
        M0.d dVar = this.f6049c;
        if (!z3 && dVar.f5708a != db2.getVersion()) {
            db2.setMaxSqlCacheSize(1);
        }
        try {
            dVar.b(b(db2));
        } catch (Throwable th) {
            throw new h(i.f6040a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f6049c.c(b(sqLiteDatabase));
        } catch (Throwable th) {
            throw new h(i.f6041b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db2, int i7, int i10) {
        Intrinsics.checkNotNullParameter(db2, "db");
        this.f6051e = true;
        try {
            this.f6049c.d(b(db2), i7, i10);
        } catch (Throwable th) {
            throw new h(i.f6043d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        if (!this.f6051e) {
            try {
                this.f6049c.e(b(db2));
            } catch (Throwable th) {
                throw new h(i.f6044e, th);
            }
        }
        this.f6053g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i7, int i10) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        this.f6051e = true;
        try {
            this.f6049c.f(b(sqLiteDatabase), i7, i10);
        } catch (Throwable th) {
            throw new h(i.f6042c, th);
        }
    }
}
