package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.internal.fuseable.ScalarCallable;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends df.d implements ScalarCallable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37748a;

    public B(Object obj) {
        this.f37748a = obj;
    }

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public final Object call() {
        return this.f37748a;
    }

    @Override // df.d
    public final void j(Observer observer) {
        E e10 = new E(observer, this.f37748a);
        observer.onSubscribe(e10);
        e10.run();
    }
}
