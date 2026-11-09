package p161kf;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.observers.LambdaConsumerIntrospection;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.util.b;
import p147jf.a;
import retrofit2.adapter.rxjava2.d;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AtomicReference implements Observer, Disposable, LambdaConsumerIntrospection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Consumer f38772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f38773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Action f38774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f38775d;

    public e(Consumer consumer, Consumer consumer2, Action action) {
        d dVar = a.f38600d;
        this.f38772a = consumer;
        this.f38773b = consumer2;
        this.f38774c = action;
        this.f38775d = dVar;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        p001if.a.a(this);
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.f38773b != a.f38601e;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == p001if.a.f37585a;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(p001if.a.f37585a);
        try {
            this.f38774c.run();
        } catch (Throwable th) {
            D3.a.H(th);
            b.V(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (isDisposed()) {
            b.V(th);
            return;
        }
        lazySet(p001if.a.f37585a);
        try {
            this.f38773b.accept(th);
        } catch (Throwable th2) {
            D3.a.H(th2);
            b.V(new p118hf.b(th, th2));
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f38772a.accept(obj);
        } catch (Throwable th) {
            D3.a.H(th);
            ((Disposable) get()).dispose();
            onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (p001if.a.c(this, disposable)) {
            try {
                this.f38775d.getClass();
            } catch (Throwable th) {
                D3.a.H(th);
                disposable.dispose();
                onError(th);
            }
        }
    }
}
