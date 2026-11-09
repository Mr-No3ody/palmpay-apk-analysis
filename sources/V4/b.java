package V4;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends SQLiteOpenHelper {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events(\n_id INTEGER PRIMARY KEY AUTOINCREMENT,\n_created INTEGER NOT NULL, \n_modified INTEGER NOT NULL, \n_data BLOB NOT NULL, \n_event_type TEXT NOT NULL, \n_policy INTEGER NOT NULL \n);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events;");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events(\n_id INTEGER PRIMARY KEY AUTOINCREMENT,\n_created INTEGER NOT NULL, \n_modified INTEGER NOT NULL, \n_data BLOB NOT NULL, \n_event_type TEXT NOT NULL, \n_policy INTEGER NOT NULL \n);");
    }
}
