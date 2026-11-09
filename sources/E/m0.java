package E;

import Pa.C0525w;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.SurfaceRequest$TransformationInfoListener;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.CameraInternal;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.core.util.Consumer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Range f2054p = C0993n.f14107f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2055a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f2056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0216v f2057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Range f2058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CameraInternal f2059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.concurrent.futures.m f2061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.concurrent.futures.k f2062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.concurrent.futures.m f2063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.concurrent.futures.k f2064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.concurrent.futures.k f2065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j0 f2066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0205j f2067m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SurfaceRequest$TransformationInfoListener f2068n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Executor f2069o;

    public m0(Size size, CameraInternal cameraInternal, boolean z3, C0216v c0216v, Range range, androidx.camera.core.processing.i iVar) {
        this.f2056b = size;
        this.f2059e = cameraInternal;
        this.f2060f = z3;
        this.f2057c = c0216v;
        this.f2058d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        final int i7 = 0;
        androidx.concurrent.futures.m mVarY = AbstractC0198c.y(new CallbackToFutureAdapter$Resolver() { // from class: E.h0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
            public final Object attachCompleter(androidx.concurrent.futures.k kVar) {
                switch (i7) {
                    case 0:
                        atomicReference.set(kVar);
                        return str + "-cancellation";
                    case 1:
                        atomicReference.set(kVar);
                        return str + "-status";
                    default:
                        atomicReference.set(kVar);
                        return str + "-Surface";
                }
            }
        });
        androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) atomicReference.get();
        kVar.getClass();
        this.f2065k = kVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        final int i10 = 1;
        androidx.concurrent.futures.m mVarY2 = AbstractC0198c.y(new CallbackToFutureAdapter$Resolver() { // from class: E.h0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
            public final Object attachCompleter(androidx.concurrent.futures.k kVar2) {
                switch (i10) {
                    case 0:
                        atomicReference2.set(kVar2);
                        return str + "-cancellation";
                    case 1:
                        atomicReference2.set(kVar2);
                        return str + "-status";
                    default:
                        atomicReference2.set(kVar2);
                        return str + "-Surface";
                }
            }
        });
        this.f2063i = mVarY2;
        mVarY2.addListener(new androidx.camera.core.impl.utils.futures.i(0, mVarY2, new p1.d(3, kVar, mVarY)), org.chromium.support_lib_boundary.util.b.u());
        androidx.concurrent.futures.k kVar2 = (androidx.concurrent.futures.k) atomicReference2.get();
        kVar2.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        final int i11 = 2;
        androidx.concurrent.futures.m mVarY3 = AbstractC0198c.y(new CallbackToFutureAdapter$Resolver() { // from class: E.h0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
            public final Object attachCompleter(androidx.concurrent.futures.k kVar3) {
                switch (i11) {
                    case 0:
                        atomicReference3.set(kVar3);
                        return str + "-cancellation";
                    case 1:
                        atomicReference3.set(kVar3);
                        return str + "-status";
                    default:
                        atomicReference3.set(kVar3);
                        return str + "-Surface";
                }
            }
        });
        this.f2061g = mVarY3;
        androidx.concurrent.futures.k kVar3 = (androidx.concurrent.futures.k) atomicReference3.get();
        kVar3.getClass();
        this.f2062h = kVar3;
        j0 j0Var = new j0(this, size);
        this.f2066l = j0Var;
        ListenableFuture listenableFutureE = androidx.camera.core.impl.utils.futures.j.e(j0Var.f14025e);
        mVarY3.addListener(new androidx.camera.core.impl.utils.futures.i(0, mVarY3, new top.zibin.luban.io.a(listenableFutureE, 4, kVar2, str)), org.chromium.support_lib_boundary.util.b.u());
        listenableFutureE.addListener(new i0(this, 0), org.chromium.support_lib_boundary.util.b.u());
        androidx.camera.core.impl.utils.executor.a aVarU = org.chromium.support_lib_boundary.util.b.u();
        AtomicReference atomicReference4 = new AtomicReference(null);
        androidx.concurrent.futures.m mVarY4 = AbstractC0198c.y(new Ad.c0(5, this, atomicReference4));
        mVarY4.addListener(new androidx.camera.core.impl.utils.futures.i(0, mVarY4, new C0525w(iVar, 3)), aVarU);
        androidx.concurrent.futures.k kVar4 = (androidx.concurrent.futures.k) atomicReference4.get();
        kVar4.getClass();
        this.f2064j = kVar4;
    }

    public final boolean a() {
        return this.f2061g.f15066b.isDone();
    }

    public final void b(final Surface surface, Executor executor, final Consumer consumer) {
        if (!this.f2062h.b(surface)) {
            androidx.concurrent.futures.m mVar = this.f2061g;
            if (!mVar.f15066b.isCancelled()) {
                p118hf.a.k(mVar.f15066b.isDone(), null);
                try {
                    mVar.get();
                    final int i7 = 0;
                    executor.execute(new Runnable() { // from class: E.g0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    consumer.accept(new C0204i(3, surface));
                                    break;
                                default:
                                    consumer.accept(new C0204i(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i10 = 1;
                    executor.execute(new Runnable() { // from class: E.g0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    consumer.accept(new C0204i(3, surface));
                                    break;
                                default:
                                    consumer.accept(new C0204i(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        p279s5.d dVar = new p279s5.d(3, consumer, surface);
        androidx.concurrent.futures.m mVar2 = this.f2063i;
        mVar2.addListener(new androidx.camera.core.impl.utils.futures.i(0, mVar2, dVar), executor);
    }

    public final void c(Executor executor, SurfaceRequest$TransformationInfoListener surfaceRequest$TransformationInfoListener) {
        C0205j c0205j;
        synchronized (this.f2055a) {
            this.f2068n = surfaceRequest$TransformationInfoListener;
            this.f2069o = executor;
            c0205j = this.f2067m;
        }
        if (c0205j != null) {
            executor.execute(new f0(surfaceRequest$TransformationInfoListener, c0205j, 1));
        }
    }

    public final void d() {
        this.f2062h.d(new U2.B("Surface request will not complete.", 4));
    }
}
