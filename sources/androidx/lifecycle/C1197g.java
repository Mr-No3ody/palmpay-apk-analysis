package androidx.lifecycle;

import Wf.C0753a0;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1197g implements Closeable, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f17453a;

    public C1197g(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17453a = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Job job = (Job) this.f17453a.get(C0753a0.f10836a);
        if (job != null) {
            job.cancel((CancellationException) null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f17453a;
    }
}
