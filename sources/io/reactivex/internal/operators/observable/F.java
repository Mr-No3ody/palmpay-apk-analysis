package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends df.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function f37762b;

    public F(Object obj, Function function) {
        this.f37761a = obj;
        this.f37762b = function;
    }

    @Override // df.d
    public final void j(Observer observer) {
        Disposable disposable = p001if.b.f37587a;
        try {
            Object objApply = this.f37762b.apply(this.f37761a);
            p147jf.a.a(objApply, "The mapper returned a null ObservableSource");
            ObservableSource observableSource = (ObservableSource) objApply;
            if (!(observableSource instanceof Callable)) {
                observableSource.subscribe(observer);
                return;
            }
            try {
                Object objCall = ((Callable) observableSource).call();
                if (objCall == null) {
                    observer.onSubscribe(disposable);
                    observer.onComplete();
                } else {
                    E e10 = new E(observer, objCall);
                    observer.onSubscribe(e10);
                    e10.run();
                }
            } catch (Throwable th) {
                D3.a.H(th);
                observer.onSubscribe(disposable);
                observer.onError(th);
            }
        } catch (Throwable th2) {
            observer.onSubscribe(disposable);
            observer.onError(th2);
        }
    }
}
