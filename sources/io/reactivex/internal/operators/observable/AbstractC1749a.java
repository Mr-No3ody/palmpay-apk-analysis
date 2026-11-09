package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1749a extends df.d implements HasUpstreamObservableSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ObservableSource f37797a;

    public AbstractC1749a(ObservableSource observableSource) {
        this.f37797a = observableSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public final ObservableSource source() {
        return this.f37797a;
    }
}
