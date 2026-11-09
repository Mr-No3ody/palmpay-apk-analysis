package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.internal.fuseable.ScalarCallable;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1761m extends df.d implements ScalarCallable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1761m f37838a = new C1761m();

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public final Object call() {
        return null;
    }

    @Override // df.d
    public final void j(Observer observer) {
        observer.onSubscribe(p001if.b.f37587a);
        observer.onComplete();
    }
}
