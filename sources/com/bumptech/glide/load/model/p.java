package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class p implements DataFetcher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f20859c = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f20861b;

    public p(Context context, Uri uri) {
        this.f20860a = context;
        this.f20861b = uri;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return File.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.f20508a;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(com.bumptech.glide.g gVar, DataFetcher.DataCallback dataCallback) {
        Cursor cursorQuery = this.f20860a.getContentResolver().query(this.f20861b, f20859c, null, null, null);
        String string = null;
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                cursorQuery.close();
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        if (!TextUtils.isEmpty(string)) {
            dataCallback.onDataReady(new File(string));
            return;
        }
        dataCallback.onLoadFailed(new FileNotFoundException("Failed to find file path for: " + this.f20861b));
    }
}
