package com.bumptech.glide.load.model;

import com.bumptech.glide.load.data.DataFetcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v implements DataFetcher, DataFetcher.DataCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final top.zibin.luban.io.a f20872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.g f20874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DataFetcher.DataCallback f20875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f20876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20877g;

    public v(ArrayList arrayList, top.zibin.luban.io.a aVar) {
        this.f20872b = aVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f20871a = arrayList;
        this.f20873c = 0;
    }

    public final void a() {
        if (this.f20877g) {
            return;
        }
        if (this.f20873c < this.f20871a.size() - 1) {
            this.f20873c++;
            loadData(this.f20874d, this.f20875e);
        } else {
            J1.g.b(this.f20876f);
            this.f20875e.onLoadFailed(new com.bumptech.glide.load.engine.u("Fetch failed", new ArrayList(this.f20876f)));
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
        this.f20877g = true;
        Iterator it = this.f20871a.iterator();
        while (it.hasNext()) {
            ((DataFetcher) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        List list = this.f20876f;
        if (list != null) {
            this.f20872b.release(list);
        }
        this.f20876f = null;
        Iterator it = this.f20871a.iterator();
        while (it.hasNext()) {
            ((DataFetcher) it.next()).cleanup();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return ((DataFetcher) this.f20871a.get(0)).getDataClass();
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final com.bumptech.glide.load.a getDataSource() {
        return ((DataFetcher) this.f20871a.get(0)).getDataSource();
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(com.bumptech.glide.g gVar, DataFetcher.DataCallback dataCallback) {
        this.f20874d = gVar;
        this.f20875e = dataCallback;
        this.f20876f = (List) this.f20872b.acquire();
        ((DataFetcher) this.f20871a.get(this.f20873c)).loadData(gVar, this);
        if (this.f20877g) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onDataReady(Object obj) {
        if (obj != null) {
            this.f20875e.onDataReady(obj);
        } else {
            a();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onLoadFailed(Exception exc) {
        List list = this.f20876f;
        J1.g.c(list, "Argument must not be null");
        list.add(exc);
        a();
    }
}
