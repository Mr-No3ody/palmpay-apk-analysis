package com.bumptech.glide.load.model;

import com.bumptech.glide.load.data.DataFetcher;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class g implements DataFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1326c f20832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20833c;

    public g(String str, C1326c c1326c) {
        this.f20831a = str;
        this.f20832b = c1326c;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        try {
            this.f20832b.close(this.f20833c);
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.f20508a;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(com.bumptech.glide.g gVar, DataFetcher.DataCallback dataCallback) {
        try {
            Object objDecode = this.f20832b.decode(this.f20831a);
            this.f20833c = objDecode;
            dataCallback.onDataReady(objDecode);
        } catch (IllegalArgumentException e10) {
            dataCallback.onLoadFailed(e10);
        }
    }
}
