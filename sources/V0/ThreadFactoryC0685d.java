package V0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: V0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0685d implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f9935a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9936b;

    public ThreadFactoryC0685d(boolean z3) {
        this.f9936b = z3;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        StringBuilder sbS = androidx.camera.video.u.s(this.f9936b ? "WM.task-" : "androidx.work-");
        sbS.append(this.f9935a.incrementAndGet());
        return new Thread(runnable, sbS.toString());
    }
}
