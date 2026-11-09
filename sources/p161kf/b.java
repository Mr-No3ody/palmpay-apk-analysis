package p161kf;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends CountDownLatch implements SingleObserver, CompletableObserver, MaybeObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f38765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f38766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f38767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f38768d;

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.SingleObserver, io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public final void onError(Throwable th) {
        this.f38766b = th;
        countDown();
    }

    @Override // io.reactivex.SingleObserver, io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable) {
        this.f38767c = disposable;
        if (this.f38768d) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.SingleObserver, io.reactivex.MaybeObserver
    public final void onSuccess(Object obj) {
        this.f38765a = obj;
        countDown();
    }
}
