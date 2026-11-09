package io.reactivex.internal.operators.observable;

import io.reactivex.internal.fuseable.FuseToObservable;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends df.a implements FuseToObservable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df.d f37877a;

    public w(df.d dVar) {
        this.f37877a = dVar;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public final df.d fuseToObservable() {
        return new v(this.f37877a);
    }
}
