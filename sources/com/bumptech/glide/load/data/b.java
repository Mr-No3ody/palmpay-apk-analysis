package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements DataFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager f20526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20527c;

    public b(AssetManager assetManager, String str) {
        this.f20526b = assetManager;
        this.f20525a = str;
    }

    public abstract void a(Object obj);

    public abstract Object b(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        Object obj = this.f20527c;
        if (obj == null) {
            return;
        }
        try {
            a(obj);
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.f20508a;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(com.bumptech.glide.g gVar, DataFetcher.DataCallback dataCallback) {
        try {
            Object objB = b(this.f20526b, this.f20525a);
            this.f20527c = objB;
            dataCallback.onDataReady(objB);
        } catch (IOException e10) {
            dataCallback.onLoadFailed(e10);
        }
    }
}
