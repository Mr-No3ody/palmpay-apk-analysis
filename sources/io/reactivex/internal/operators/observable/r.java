package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.internal.fuseable.QueueDisposable;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements QueueDisposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f37870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f37873e;

    public r(Observer observer, Object[] objArr) {
        this.f37869a = observer;
        this.f37870b = objArr;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.f37871c = this.f37870b.length;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f37873e = true;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f37873e;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.f37871c == this.f37870b.length;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        int i7 = this.f37871c;
        Object[] objArr = this.f37870b;
        if (i7 == objArr.length) {
            return null;
        }
        this.f37871c = i7 + 1;
        Object obj = objArr[i7];
        p147jf.a.a(obj, "The array element is null");
        return obj;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i7) {
        if ((i7 & 1) == 0) {
            return 0;
        }
        this.f37872d = true;
        return 1;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
