package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f15055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListenableFuture f15056b;

    public g(j jVar, ListenableFuture listenableFuture) {
        this.f15055a = jVar;
        this.f15056b = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15055a.value != this) {
            return;
        }
        if (j.ATOMIC_HELPER.b(this.f15055a, this, j.getFutureValue(this.f15056b))) {
            j.complete(this.f15055a);
        }
    }
}
