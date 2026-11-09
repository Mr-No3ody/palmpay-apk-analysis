package androidx.concurrent.futures;

import Wf.C0765i;
import androidx.work.impl.K;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;
import p355xf.q;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListenableFuture f15070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0765i f15071c;

    public p(ListenableFuture futureToObserve, C0765i continuation, int i7) {
        this.f15069a = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(futureToObserve, "futureToObserve");
                Intrinsics.checkNotNullParameter(continuation, "continuation");
                this.f15070b = futureToObserve;
                this.f15071c = continuation;
                break;
            default:
                Intrinsics.g(futureToObserve, "futureToObserve");
                this.f15070b = futureToObserve;
                this.f15071c = continuation;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0765i c0765i = this.f15071c;
        ListenableFuture listenableFuture = this.f15070b;
        switch (this.f15069a) {
            case 0:
                if (listenableFuture.isCancelled()) {
                    c0765i.cancel(null);
                } else {
                    try {
                        p355xf.o oVar = q.f43977a;
                        c0765i.resumeWith(j.getUninterruptibly(listenableFuture));
                    } catch (ExecutionException e10) {
                        Throwable cause = e10.getCause();
                        if (cause == null) {
                            Intrinsics.l();
                        }
                        p355xf.o oVar2 = q.f43977a;
                        c0765i.resumeWith(androidx.camera.core.impl.utils.executor.g.f(cause));
                        return;
                    }
                }
                break;
            default:
                if (listenableFuture.isCancelled()) {
                    c0765i.cancel(null);
                } else {
                    try {
                        p355xf.o oVar3 = q.f43977a;
                        c0765i.resumeWith(K.b(listenableFuture));
                    } catch (ExecutionException e11) {
                        p355xf.o oVar4 = q.f43977a;
                        Throwable cause2 = e11.getCause();
                        Intrinsics.e(cause2);
                        c0765i.resumeWith(androidx.camera.core.impl.utils.executor.g.f(cause2));
                    }
                }
                break;
        }
    }
}
