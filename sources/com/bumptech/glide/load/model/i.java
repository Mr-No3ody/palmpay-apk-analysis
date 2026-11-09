package com.bumptech.glide.load.model;

import android.content.res.Resources;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i implements DataFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources.Theme f20836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f20837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f20840e;

    public i(Resources.Theme theme, Resources resources, DirectResourceLoader$ResourceOpener directResourceLoader$ResourceOpener, int i7) {
        this.f20836a = theme;
        this.f20837b = resources;
        this.f20838c = directResourceLoader$ResourceOpener;
        this.f20839d = i7;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        Object obj = this.f20840e;
        if (obj != null) {
            try {
                this.f20838c.close(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return this.f20838c.getDataClass();
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.f20508a;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(com.bumptech.glide.g gVar, DataFetcher.DataCallback dataCallback) {
        try {
            Object objOpen = this.f20838c.open(this.f20836a, this.f20837b, this.f20839d);
            this.f20840e = objOpen;
            dataCallback.onDataReady(objOpen);
        } catch (Resources.NotFoundException e10) {
            dataCallback.onLoadFailed(e10);
        }
    }
}
