package com.didi.drouter.store;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import java.util.Objects;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public class LoadProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Objects.toString(getContext());
        Application application = (Application) getContext();
        if (application != null) {
            if (p092g2.c.f36839a == null) {
                try {
                    p092g2.c.f36840b = (application.getApplicationInfo().flags & 2) != 0;
                } catch (Exception unused) {
                }
            }
            p092g2.c.f36839a = application;
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
