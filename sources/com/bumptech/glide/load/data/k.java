package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements DataFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f20546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f20547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20548c;

    public k(ContentResolver contentResolver, Uri uri) {
        this.f20547b = contentResolver;
        this.f20546a = uri;
    }

    public abstract void a(Object obj);

    public abstract Object b(ContentResolver contentResolver, Uri uri);

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        Object obj = this.f20548c;
        if (obj != null) {
            try {
                a(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.f20508a;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(com.bumptech.glide.g gVar, DataFetcher.DataCallback dataCallback) {
        try {
            Object objB = b(this.f20547b, this.f20546a);
            this.f20548c = objB;
            dataCallback.onDataReady(objB);
        } catch (FileNotFoundException e10) {
            dataCallback.onLoadFailed(e10);
        }
    }
}
