package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1759k extends AbstractC1749a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f37833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Consumer f37834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Action f37835d;

    public C1759k(df.d dVar, Consumer consumer, Consumer consumer2, Action action) {
        super(dVar);
        this.f37833b = consumer;
        this.f37834c = consumer2;
        this.f37835d = action;
    }

    @Override // df.d
    public final void j(Observer observer) {
        this.f37797a.subscribe(new C1758j(observer, this.f37833b, this.f37834c, this.f37835d));
    }
}
