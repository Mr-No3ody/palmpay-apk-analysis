package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends df.b implements HasUpstreamPublisher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final df.b f37677b;

    public a(df.b bVar) {
        p147jf.a.a(bVar, "source is null");
        this.f37677b = bVar;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public final Publisher source() {
        return this.f37677b;
    }
}
