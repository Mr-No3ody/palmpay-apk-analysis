package androidx.camera.core.impl;

import E.AbstractC0198c;
import android.util.Log;
import android.util.Size;
import androidx.biometric.RunnableC0903g;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: androidx.camera.core.impl.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0970b0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Size f14017k = new Size(0, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f14018l = p140j8.f.o("DeferrableSurface");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicInteger f14019m = new AtomicInteger(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicInteger f14020n = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14021a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14022b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14023c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.concurrent.futures.k f14024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.concurrent.futures.m f14025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.concurrent.futures.k f14026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.concurrent.futures.m f14027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Size f14028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Class f14030j;

    public AbstractC0970b0(Size size, int i7) {
        this.f14028h = size;
        this.f14029i = i7;
        final int i10 = 0;
        androidx.concurrent.futures.m mVarY = AbstractC0198c.y(new CallbackToFutureAdapter$Resolver(this) { // from class: androidx.camera.core.impl.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC0970b0 f14006b;

            {
                this.f14006b = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
            public final Object attachCompleter(androidx.concurrent.futures.k kVar) {
                switch (i10) {
                    case 0:
                        AbstractC0970b0 abstractC0970b0 = this.f14006b;
                        synchronized (abstractC0970b0.f14021a) {
                            abstractC0970b0.f14024d = kVar;
                            break;
                        }
                        return "DeferrableSurface-termination(" + abstractC0970b0 + ")";
                    default:
                        AbstractC0970b0 abstractC0970b1 = this.f14006b;
                        synchronized (abstractC0970b1.f14021a) {
                            abstractC0970b1.f14026f = kVar;
                            break;
                        }
                        return "DeferrableSurface-close(" + abstractC0970b1 + ")";
                }
            }
        });
        this.f14025e = mVarY;
        final int i11 = 1;
        this.f14027g = AbstractC0198c.y(new CallbackToFutureAdapter$Resolver(this) { // from class: androidx.camera.core.impl.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC0970b0 f14006b;

            {
                this.f14006b = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
            public final Object attachCompleter(androidx.concurrent.futures.k kVar) {
                switch (i11) {
                    case 0:
                        AbstractC0970b0 abstractC0970b0 = this.f14006b;
                        synchronized (abstractC0970b0.f14021a) {
                            abstractC0970b0.f14024d = kVar;
                            break;
                        }
                        return "DeferrableSurface-termination(" + abstractC0970b0 + ")";
                    default:
                        AbstractC0970b0 abstractC0970b1 = this.f14006b;
                        synchronized (abstractC0970b1.f14021a) {
                            abstractC0970b1.f14026f = kVar;
                            break;
                        }
                        return "DeferrableSurface-close(" + abstractC0970b1 + ")";
                }
            }
        });
        if (p140j8.f.o("DeferrableSurface")) {
            f14020n.incrementAndGet();
            f14019m.get();
            e();
            mVarY.addListener(new RunnableC0903g(12, this, Log.getStackTraceString(new Exception())), org.chromium.support_lib_boundary.util.b.u());
        }
    }

    public void a() {
        androidx.concurrent.futures.k kVar;
        synchronized (this.f14021a) {
            try {
                if (this.f14023c) {
                    kVar = null;
                } else {
                    this.f14023c = true;
                    this.f14026f.b(null);
                    if (this.f14022b == 0) {
                        kVar = this.f14024d;
                        this.f14024d = null;
                    } else {
                        kVar = null;
                    }
                    if (p140j8.f.o("DeferrableSurface")) {
                        toString();
                        p140j8.f.G("DeferrableSurface");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kVar != null) {
            kVar.b(null);
        }
    }

    public final void b() {
        androidx.concurrent.futures.k kVar;
        synchronized (this.f14021a) {
            try {
                int i7 = this.f14022b;
                if (i7 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i10 = i7 - 1;
                this.f14022b = i10;
                if (i10 == 0 && this.f14023c) {
                    kVar = this.f14024d;
                    this.f14024d = null;
                } else {
                    kVar = null;
                }
                if (p140j8.f.o("DeferrableSurface")) {
                    toString();
                    p140j8.f.G("DeferrableSurface");
                    if (this.f14022b == 0) {
                        f14020n.get();
                        f14019m.decrementAndGet();
                        e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (kVar != null) {
            kVar.b(null);
        }
    }

    public final ListenableFuture c() {
        synchronized (this.f14021a) {
            try {
                if (this.f14023c) {
                    return new androidx.camera.core.impl.utils.futures.l(new C0968a0("DeferrableSurface already closed.", this), 1);
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f14021a) {
            try {
                int i7 = this.f14022b;
                if (i7 == 0 && this.f14023c) {
                    throw new C0968a0("Cannot begin use on a closed surface.", this);
                }
                this.f14022b = i7 + 1;
                if (p140j8.f.o("DeferrableSurface")) {
                    if (this.f14022b == 1) {
                        f14020n.get();
                        f14019m.incrementAndGet();
                        e();
                    }
                    toString();
                    p140j8.f.G("DeferrableSurface");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (!f14018l && p140j8.f.o("DeferrableSurface")) {
            p140j8.f.G("DeferrableSurface");
        }
        toString();
        p140j8.f.G("DeferrableSurface");
    }

    public abstract ListenableFuture f();
}
