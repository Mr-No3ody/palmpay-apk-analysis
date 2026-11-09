package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1757i extends AbstractC1749a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f37825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final df.i f37826d;

    public C1757i(df.d dVar, long j6, TimeUnit timeUnit, df.i iVar) {
        super(dVar);
        this.f37824b = j6;
        this.f37825c = timeUnit;
        this.f37826d = iVar;
    }

    @Override // df.d
    public final void j(Observer observer) {
        p257qf.a aVar = new p257qf.a(observer);
        df.h hVarA = this.f37826d.a();
        this.f37797a.subscribe(new C1756h(aVar, this.f37824b, this.f37825c, hVarA));
    }
}
