package Ye;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11379a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i7, int i10) {
        super(context, str, cursorFactory, i7);
        this.f11379a = i10;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f11379a) {
            case 0:
                sQLiteDatabase.beginTransaction();
                try {
                    sQLiteDatabase.execSQL("CREATE TABLE cache_table(_id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT, head TEXT, data text, local_expires text)");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX cache_unique_index ON cache_table(\"key\")");
                    sQLiteDatabase.setTransactionSuccessful();
                    return;
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            default:
                sQLiteDatabase.beginTransaction();
                try {
                    sQLiteDatabase.execSQL("CREATE TABLE cookies_table(_id INTEGER PRIMARY KEY AUTOINCREMENT, uri TEXT, name TEXT, value TEXT, comment TEXT, comment_url TEXT, discard TEXT, domain TEXT, expiry INTEGER, path TEXT, port_list TEXT, secure TEXT, version INTEGER)");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX cookie_unique_index ON cookies_table(\"name\", \"domain\", \"path\")");
                    sQLiteDatabase.setTransactionSuccessful();
                    return;
                } finally {
                    sQLiteDatabase.endTransaction();
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i10) {
        switch (this.f11379a) {
            case 0:
                onUpgrade(sQLiteDatabase, i7, i10);
                break;
            default:
                onUpgrade(sQLiteDatabase, i7, i10);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i10) {
        switch (this.f11379a) {
            case 0:
                if (i10 != i7) {
                    sQLiteDatabase.beginTransaction();
                    try {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cache_table");
                        sQLiteDatabase.execSQL("CREATE TABLE cache_table(_id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT, head TEXT, data text, local_expires text)");
                        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX cache_unique_index ON cache_table(\"key\")");
                        sQLiteDatabase.setTransactionSuccessful();
                        return;
                    } finally {
                        sQLiteDatabase.endTransaction();
                    }
                }
                return;
            default:
                if (i10 != i7) {
                    sQLiteDatabase.beginTransaction();
                    try {
                        sQLiteDatabase.execSQL("DROP TABLE  IF EXISTS cookies_table");
                        sQLiteDatabase.execSQL("CREATE TABLE cookies_table(_id INTEGER PRIMARY KEY AUTOINCREMENT, uri TEXT, name TEXT, value TEXT, comment TEXT, comment_url TEXT, discard TEXT, domain TEXT, expiry INTEGER, path TEXT, port_list TEXT, secure TEXT, version INTEGER)");
                        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX cookie_unique_index ON cookies_table(\"name\", \"domain\", \"path\")");
                        sQLiteDatabase.setTransactionSuccessful();
                        return;
                    } finally {
                        sQLiteDatabase.endTransaction();
                    }
                }
                return;
        }
    }
}
