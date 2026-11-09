package Wf;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0762f extends AbstractC0752a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f10849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S f10850e;

    public C0762f(CoroutineContext coroutineContext, Thread thread, S s3) {
        super(coroutineContext, true);
        this.f10849d = thread;
        this.f10850e = s3;
    }

    @Override // Wf.n0
    public final void a(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f10849d;
        if (Intrinsics.c(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
