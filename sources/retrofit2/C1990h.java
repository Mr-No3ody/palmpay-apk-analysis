package retrofit2;

import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Y;

/* JADX INFO: renamed from: retrofit2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1990h implements Call {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f41929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Call f41930b;

    public C1990h(Executor executor, Call call) {
        this.f41929a = executor;
        this.f41930b = call;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.f41930b.cancel();
    }

    @Override // retrofit2.Call
    public final void enqueue(Callback callback) {
        Objects.requireNonNull(callback, "callback == null");
        this.f41930b.enqueue(new p039cb.c(this, 15, callback, false));
    }

    @Override // retrofit2.Call
    public final K execute() {
        return this.f41930b.execute();
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        return this.f41930b.isCanceled();
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        return this.f41930b.isExecuted();
    }

    @Override // retrofit2.Call
    public final Y request() {
        return this.f41930b.request();
    }

    @Override // retrofit2.Call
    public final Pg.F timeout() {
        return this.f41930b.timeout();
    }

    @Override // retrofit2.Call
    public final Call clone() {
        return new C1990h(this.f41929a, this.f41930b.clone());
    }
}
