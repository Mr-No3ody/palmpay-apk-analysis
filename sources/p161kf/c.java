package p161kf;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import org.chromium.support_lib_boundary.util.b;
import p001if.a;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Observer, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f38769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f38770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f38771c;

    public c(Observer observer, Consumer consumer) {
        this.f38769a = observer;
        this.f38770b = consumer;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Disposable disposable = this.f38771c;
        a aVar = a.f37585a;
        if (disposable != aVar) {
            this.f38771c = aVar;
            disposable.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f38771c.isDisposed();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        Disposable disposable = this.f38771c;
        a aVar = a.f37585a;
        if (disposable != aVar) {
            this.f38771c = aVar;
            this.f38769a.onComplete();
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        Disposable disposable = this.f38771c;
        a aVar = a.f37585a;
        if (disposable == aVar) {
            b.V(th);
        } else {
            this.f38771c = aVar;
            this.f38769a.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        this.f38769a.onNext(obj);
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        Observer observer = this.f38769a;
        try {
            this.f38770b.accept(disposable);
            if (a.d(this.f38771c, disposable)) {
                this.f38771c = disposable;
                observer.onSubscribe(this);
            }
        } catch (Throwable th) {
            D3.a.H(th);
            disposable.dispose();
            this.f38771c = a.f37585a;
            observer.onSubscribe(p001if.b.f37587a);
            observer.onError(th);
        }
    }
}
