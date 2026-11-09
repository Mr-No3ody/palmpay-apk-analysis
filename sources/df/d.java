package df;

import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.operators.observable.B;
import io.reactivex.internal.operators.observable.C1752d;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1757i;
import io.reactivex.internal.operators.observable.C1761m;
import io.reactivex.internal.operators.observable.C1765q;
import io.reactivex.internal.operators.observable.F;
import io.reactivex.internal.operators.observable.G;
import io.reactivex.internal.operators.observable.K;
import io.reactivex.internal.operators.observable.S;
import io.reactivex.internal.operators.observable.y;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d<T> implements ObservableSource<T> {
    public static C1752d d(K k2, d dVar) {
        return new C1752d(new C1755g(new ObservableSource[]{k2, dVar}, 1), b.f35920a);
    }

    public static y g(long j6, long j10, TimeUnit timeUnit, i iVar) {
        p147jf.a.a(timeUnit, "unit is null");
        p147jf.a.a(iVar, "scheduler is null");
        return new y(Math.max(0L, j6), Math.max(0L, j10), timeUnit, iVar);
    }

    public static B h(Object obj) {
        p147jf.a.a(obj, "item is null");
        return new B(obj);
    }

    public final void a() {
        p161kf.a aVar = new p161kf.a(1);
        subscribe(aVar);
        if (aVar.getCount() != 0) {
            try {
                aVar.await();
            } catch (InterruptedException e10) {
                aVar.dispose();
                throw p239pf.c.a(e10);
            }
        }
        Throwable th = aVar.f38762b;
        if (th != null) {
            throw p239pf.c.a(th);
        }
        if (aVar.f38761a == null) {
            throw new NoSuchElementException();
        }
    }

    public final Object b() {
        p161kf.b bVar = new p161kf.b(1);
        try {
            subscribe(new G(bVar, 0));
            if (bVar.getCount() != 0) {
                try {
                    bVar.await();
                } catch (InterruptedException e10) {
                    bVar.f38768d = true;
                    Disposable disposable = bVar.f38767c;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    throw p239pf.c.a(e10);
                }
            }
            Throwable th = bVar.f38766b;
            if (th != null) {
                throw p239pf.c.a(th);
            }
            Object obj = bVar.f38765a;
            if (obj != null) {
                return obj;
            }
            throw new NoSuchElementException();
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            D3.a.H(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final d c(ObservableTransformer observableTransformer) {
        ObservableSource observableSourceApply = observableTransformer.apply(this);
        p147jf.a.a(observableSourceApply, "source is null");
        return observableSourceApply instanceof d ? (d) observableSourceApply : new C1755g(observableSourceApply, 2);
    }

    public final C1757i e(long j6, TimeUnit timeUnit, i iVar) {
        p147jf.a.a(timeUnit, "unit is null");
        p147jf.a.a(iVar, "scheduler is null");
        return new C1757i(this, j6, timeUnit, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d f(Function function) {
        int i7 = b.f35920a;
        p147jf.a.b(Integer.MAX_VALUE, "maxConcurrency");
        p147jf.a.b(i7, "bufferSize");
        if (!(this instanceof ScalarCallable)) {
            return new C1765q(this, function, i7, 0);
        }
        Object objCall = ((ScalarCallable) this).call();
        return objCall == null ? C1761m.f37838a : new F(objCall, function);
    }

    public final C1765q i(i iVar) {
        int i7 = b.f35920a;
        p147jf.a.a(iVar, "scheduler is null");
        p147jf.a.b(i7, "bufferSize");
        return new C1765q(this, iVar, i7, 1);
    }

    public abstract void j(Observer observer);

    public final K k(i iVar) {
        p147jf.a.a(iVar, "scheduler is null");
        return new K(this, iVar, 0);
    }

    public final S l(d dVar, BiFunction biFunction) {
        p147jf.a.a(dVar, "other is null");
        Sd.b bVar = new Sd.b(biFunction, 22);
        int i7 = b.f35920a;
        ObservableSource[] observableSourceArr = {this, dVar};
        p147jf.a.b(i7, "bufferSize");
        return new S(observableSourceArr, bVar, i7);
    }

    @Override // io.reactivex.ObservableSource
    public final void subscribe(Observer observer) {
        p147jf.a.a(observer, "observer is null");
        try {
            j(observer);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            D3.a.H(th);
            org.chromium.support_lib_boundary.util.b.V(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
