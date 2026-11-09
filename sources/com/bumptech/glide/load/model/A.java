package com.bumptech.glide.load.model;

import com.bumptech.glide.load.data.DataFetcher;

/* JADX INFO: loaded from: classes.dex */
public final class A implements DataFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20810a;

    public A(Object obj) {
        this.f20810a = obj;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return this.f20810a.getClass();
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.f20508a;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(com.bumptech.glide.g gVar, DataFetcher.DataCallback dataCallback) {
        dataCallback.onDataReady(this.f20810a);
    }
}
