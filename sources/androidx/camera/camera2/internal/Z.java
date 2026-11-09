package androidx.camera.camera2.internal;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f13321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f13322k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f13324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.d f13325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0944o f13326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N7.a f13327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13329g = f13321j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f13330h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final X f13331i = new X(this);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f13321j = timeUnit.toNanos(1L);
        f13322k = timeUnit.toNanos(5L);
    }

    public Z(int i7, androidx.camera.core.impl.utils.executor.i iVar, androidx.camera.core.impl.utils.executor.d dVar, C0944o c0944o, boolean z3, N7.a aVar) {
        this.f13323a = i7;
        this.f13324b = iVar;
        this.f13325c = dVar;
        this.f13326d = c0944o;
        this.f13328f = z3;
        this.f13327e = aVar;
    }

    public final ListenableFuture a(int i7) {
        ListenableFuture listenableFuture = androidx.camera.core.impl.utils.futures.l.f14212c;
        if (this.f13330h.isEmpty()) {
            return listenableFuture;
        }
        if (this.f13331i.isCaptureResultNeeded()) {
            C0917a0 c0917a0 = new C0917a0(null);
            C0944o c0944o = this.f13326d;
            c0944o.a(c0917a0);
            RunnableC0934j runnableC0934j = new RunnableC0934j(6, c0944o, c0917a0);
            listenableFuture = c0917a0.f13339b;
            listenableFuture.addListener(runnableC0934j, c0944o.f13605c);
        }
        androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(listenableFuture);
        Nc.v vVar = new Nc.v(this, i7);
        bVarA.getClass();
        androidx.camera.core.impl.utils.executor.i iVar = this.f13324b;
        return androidx.camera.core.impl.utils.futures.j.i(androidx.camera.core.impl.utils.futures.j.i(bVarA, vVar, iVar), new C0936k(this, 5), iVar);
    }
}
