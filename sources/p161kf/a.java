package p161kf;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends CountDownLatch implements Observer, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f38761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f38762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f38763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f38764d;

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f38764d = true;
        Disposable disposable = this.f38763c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f38764d;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.f38761a == null) {
            this.f38762b = th;
        }
        countDown();
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.f38761a == null) {
            this.f38761a = obj;
            this.f38763c.dispose();
            countDown();
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f38763c = disposable;
        if (this.f38764d) {
            disposable.dispose();
        }
    }
}
