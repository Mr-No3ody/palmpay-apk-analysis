package com.bumptech.glide.load.model;

import com.bumptech.glide.load.data.DataFetcher;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class f implements DataFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f20830a;

    public f(File file) {
        this.f20830a = file;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return ByteBuffer.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.f20508a;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(com.bumptech.glide.g gVar, DataFetcher.DataCallback dataCallback) {
        try {
            dataCallback.onDataReady(J1.c.a(this.f20830a));
        } catch (IOException e10) {
            dataCallback.onLoadFailed(e10);
        }
    }
}
