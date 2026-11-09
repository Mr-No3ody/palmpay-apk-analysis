package com.bumptech.glide.load.model;

import com.bumptech.glide.load.data.DataFetcher;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1327d implements DataFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f20826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteArrayLoader$Converter f20827b;

    public C1327d(byte[] bArr, ByteArrayLoader$Converter byteArrayLoader$Converter) {
        this.f20826a = bArr;
        this.f20827b = byteArrayLoader$Converter;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return this.f20827b.getDataClass();
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.f20508a;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(com.bumptech.glide.g gVar, DataFetcher.DataCallback dataCallback) {
        dataCallback.onDataReady(this.f20827b.convert(this.f20826a));
    }
}
