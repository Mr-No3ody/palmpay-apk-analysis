package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.didiglobal.booster.instrument.ShadowExecutors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f19559e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f19560a = new LinkedHashSet(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f19561b = new LinkedHashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f19562c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile B f19563d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f19559e = new G0.g(0);
        } else {
            f19559e = ShadowExecutors.newOptimizedCachedThreadPool(new com.airbnb.lottie.utils.d(), "\u200bcom.airbnb.lottie.LottieTask");
        }
    }

    public D(k kVar) {
        d(new B(kVar));
    }

    public final synchronized void a(LottieListener lottieListener) {
        Throwable th;
        try {
            B b7 = this.f19563d;
            if (b7 != null && (th = b7.f19557b) != null) {
                lottieListener.onResult(th);
            }
            this.f19561b.add(lottieListener);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(LottieListener lottieListener) {
        k kVar;
        try {
            B b7 = this.f19563d;
            if (b7 != null && (kVar = b7.f19556a) != null) {
                lottieListener.onResult(kVar);
            }
            this.f19560a.add(lottieListener);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        B b7 = this.f19563d;
        if (b7 == null) {
            return;
        }
        k kVar = b7.f19556a;
        if (kVar != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f19560a).iterator();
                while (it.hasNext()) {
                    ((LottieListener) it.next()).onResult(kVar);
                }
            }
            return;
        }
        Throwable th = b7.f19557b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f19561b);
            if (arrayList.isEmpty()) {
                com.airbnb.lottie.utils.c.c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((LottieListener) it2.next()).onResult(th);
            }
        }
    }

    public final void d(B b7) {
        if (this.f19563d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f19563d = b7;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.f19562c.post(new m(this, 2));
        }
    }

    public D(Callable callable, boolean z3) {
        if (z3) {
            try {
                d((B) callable.call());
                return;
            } catch (Throwable th) {
                d(new B(th));
                return;
            }
        }
        Executor executor = f19559e;
        C c6 = new C(callable);
        c6.f19558a = this;
        executor.execute(c6);
    }
}
