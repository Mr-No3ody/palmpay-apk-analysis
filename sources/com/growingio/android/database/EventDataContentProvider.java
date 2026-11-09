package com.growingio.android.database;

import V4.b;
import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class EventDataContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UriMatcher f23149c = new UriMatcher(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23150a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f23151b;

    @Override // android.content.ContentProvider
    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        if (contentValuesArr == null || contentValuesArr.length == 0) {
            return 0;
        }
        if (f23149c.match(uri) != 1) {
            throw new IllegalArgumentException("UnKnow Uri:" + uri.toString());
        }
        SQLiteDatabase writableDatabase = this.f23151b.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            int i7 = 0;
            for (ContentValues contentValues : contentValuesArr) {
                if (writableDatabase.insert("events", null, contentValues) >= 0) {
                    i7++;
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            if (i7 > 0) {
                getContext().getContentResolver().notifyChange(uri, null);
            }
            return i7;
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase writableDatabase = this.f23151b.getWritableDatabase();
        if (f23149c.match(uri) == 1) {
            return writableDatabase.delete("events", str, strArr);
        }
        throw new IllegalArgumentException("UnKnow Uri:" + uri.toString());
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase writableDatabase = this.f23151b.getWritableDatabase();
        if (f23149c.match(uri) == 1) {
            Uri uriWithAppendedId = ContentUris.withAppendedId(uri, writableDatabase.insert("events", null, contentValues));
            getContext().getContentResolver().notifyChange(uri, null);
            return uriWithAppendedId;
        }
        throw new IllegalArgumentException("UnKnow Uri:" + uri.toString());
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        f23149c.addURI(getContext().getPackageName() + ".EventDataContentProvider", "events", 1);
        this.f23151b = new b(getContext(), "growingio.db", null, 1);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            synchronized (this.f23150a) {
                try {
                    SQLiteDatabase readableDatabase = this.f23151b.getReadableDatabase();
                    if (f23149c.match(uri) != 1) {
                        throw new IllegalArgumentException("UnKnow Uri: " + uri.toString());
                    }
                    if ("rawQuery".equals(str2)) {
                        return readableDatabase.rawQuery(str, null);
                    }
                    return readableDatabase.query("events", strArr, str, strArr2, null, null, str2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (SQLException e10) {
            Log.e("EventContentProvider", "query error: " + e10.getMessage());
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase writableDatabase = this.f23151b.getWritableDatabase();
        if (f23149c.match(uri) == 1) {
            return writableDatabase.update("events", contentValues, str, strArr);
        }
        throw new IllegalArgumentException("UnKnow Uri:" + uri.toString());
    }
}
