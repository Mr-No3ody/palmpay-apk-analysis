package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DataFetcherGenerator, DataFetcher.DataCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f20610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataFetcherGenerator.FetcherReadyCallback f20611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20612d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Key f20613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f20614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20615g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile com.bumptech.glide.load.model.t f20616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public File f20617j;

    public c(List list, f fVar, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.f20609a = list;
        this.f20610b = fVar;
        this.f20611c = fetcherReadyCallback;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        com.bumptech.glide.load.model.t tVar = this.f20616i;
        if (tVar != null) {
            tVar.f20869c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onDataReady(Object obj) {
        this.f20611c.onDataFetcherReady(this.f20613e, obj, this.f20616i.f20869c, com.bumptech.glide.load.a.f20510c, this.f20613e);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onLoadFailed(Exception exc) {
        this.f20611c.onDataFetcherFailed(this.f20613e, exc, this.f20616i.f20869c, com.bumptech.glide.load.a.f20510c);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean startNext() {
        while (true) {
            List list = this.f20614f;
            boolean z3 = false;
            if (list != null && this.f20615g < list.size()) {
                this.f20616i = null;
                while (!z3 && this.f20615g < this.f20614f.size()) {
                    List list2 = this.f20614f;
                    int i7 = this.f20615g;
                    this.f20615g = i7 + 1;
                    ModelLoader modelLoader = (ModelLoader) list2.get(i7);
                    File file = this.f20617j;
                    f fVar = this.f20610b;
                    this.f20616i = modelLoader.buildLoadData(file, fVar.f20649e, fVar.f20650f, fVar.f20653i);
                    if (this.f20616i != null && this.f20610b.c(this.f20616i.f20869c.getDataClass()) != null) {
                        this.f20616i.f20869c.loadData(this.f20610b.f20659o, this);
                        z3 = true;
                    }
                }
                return z3;
            }
            int i10 = this.f20612d + 1;
            this.f20612d = i10;
            if (i10 >= this.f20609a.size()) {
                return false;
            }
            Key key = (Key) this.f20609a.get(this.f20612d);
            f fVar2 = this.f20610b;
            File file2 = fVar2.f20652h.getDiskCache().get(new d(key, fVar2.f20658n));
            this.f20617j = file2;
            if (file2 != null) {
                this.f20613e = key;
                this.f20614f = this.f20610b.f20647c.a().f(file2);
                this.f20615g = 0;
            }
        }
    }
}
