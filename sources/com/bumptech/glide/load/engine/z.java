package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;

/* JADX INFO: loaded from: classes.dex */
public final class z implements DataFetcher.DataCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.model.t f20799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f20800b;

    public z(A a3, com.bumptech.glide.load.model.t tVar) {
        this.f20800b = a3;
        this.f20799a = tVar;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onDataReady(Object obj) {
        A a3 = this.f20800b;
        com.bumptech.glide.load.model.t tVar = this.f20799a;
        com.bumptech.glide.load.model.t tVar2 = a3.f20568f;
        if (tVar2 == null || tVar2 != tVar) {
            return;
        }
        A a10 = this.f20800b;
        com.bumptech.glide.load.model.t tVar3 = this.f20799a;
        k kVar = a10.f20563a.f20660p;
        if (obj != null && kVar.a(tVar3.f20869c.getDataSource())) {
            a10.f20567e = obj;
            a10.f20564b.reschedule();
        } else {
            i iVar = a10.f20564b;
            Key key = tVar3.f20867a;
            DataFetcher dataFetcher = tVar3.f20869c;
            iVar.onDataFetcherReady(key, obj, dataFetcher, dataFetcher.getDataSource(), a10.f20569g);
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onLoadFailed(Exception exc) {
        A a3 = this.f20800b;
        com.bumptech.glide.load.model.t tVar = this.f20799a;
        com.bumptech.glide.load.model.t tVar2 = a3.f20568f;
        if (tVar2 == null || tVar2 != tVar) {
            return;
        }
        A a10 = this.f20800b;
        com.bumptech.glide.load.model.t tVar3 = this.f20799a;
        i iVar = a10.f20564b;
        d dVar = a10.f20569g;
        DataFetcher dataFetcher = tVar3.f20869c;
        iVar.onDataFetcherFailed(dVar, exc, dataFetcher, dataFetcher.getDataSource());
    }
}
