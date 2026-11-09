package com.bumptech.glide.load.model;

import com.bumptech.glide.load.data.DataFetcher;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class k implements DataFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f20842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileLoader$FileOpener f20843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20844c;

    public k(File file, FileLoader$FileOpener fileLoader$FileOpener) {
        this.f20842a = file;
        this.f20843b = fileLoader$FileOpener;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        Object obj = this.f20844c;
        if (obj != null) {
            try {
                this.f20843b.close(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return this.f20843b.getDataClass();
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.f20508a;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(com.bumptech.glide.g gVar, DataFetcher.DataCallback dataCallback) {
        try {
            Object objOpen = this.f20843b.open(this.f20842a);
            this.f20844c = objOpen;
            dataCallback.onDataReady(objOpen);
        } catch (FileNotFoundException e10) {
            dataCallback.onLoadFailed(e10);
        }
    }
}
