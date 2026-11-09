package p014af;

import D4.f;
import Ye.c;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends f {
    @Override // D4.f
    public final String b() {
        return "cookies_table";
    }

    @Override // D4.f
    public final ArrayList h(String str) {
        SQLiteDatabase readableDatabase = ((c) this.f1592b).getReadableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = readableDatabase.rawQuery(str, null);
        while (!cursorRawQuery.isClosed() && cursorRawQuery.moveToNext()) {
            a aVar = new a();
            aVar.f11911a = -1L;
            aVar.f11923m = 1;
            aVar.f11911a = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("_id"));
            aVar.f11912b = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("uri"));
            aVar.f11913c = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("name"));
            aVar.f11914d = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("value"));
            aVar.f11915e = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("comment"));
            aVar.f11916f = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("comment_url"));
            aVar.f11917g = "true".equals(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("discard")));
            aVar.f11918h = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("domain"));
            aVar.f11919i = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("expiry"));
            aVar.f11920j = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("path"));
            aVar.f11921k = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("port_list"));
            aVar.f11922l = "true".equals(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("secure")));
            aVar.f11923m = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("version"));
            arrayList.add(aVar);
        }
        if (!cursorRawQuery.isClosed()) {
            cursorRawQuery.close();
        }
        f.d(readableDatabase);
        return arrayList;
    }

    public final void w(p105h.b bVar) {
        a aVar = (a) bVar;
        SQLiteDatabase writableDatabase = ((c) this.f1592b).getWritableDatabase();
        writableDatabase.beginTransaction();
        ContentValues contentValues = new ContentValues();
        contentValues.put("uri", aVar.f11912b);
        contentValues.put("name", aVar.f11913c);
        contentValues.put("value", aVar.f11914d);
        contentValues.put("comment", aVar.f11915e);
        contentValues.put("comment_url", aVar.f11916f);
        contentValues.put("discard", String.valueOf(aVar.f11917g));
        contentValues.put("domain", aVar.f11918h);
        contentValues.put("expiry", Long.valueOf(aVar.f11919i));
        contentValues.put("path", aVar.f11920j);
        contentValues.put("port_list", aVar.f11921k);
        contentValues.put("secure", String.valueOf(aVar.f11922l));
        contentValues.put("version", Integer.valueOf(aVar.f11923m));
        try {
            writableDatabase.replace("cookies_table", null, contentValues);
            writableDatabase.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            writableDatabase.endTransaction();
            f.d(writableDatabase);
        }
    }
}
