package p190mf;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends AtomicReferenceArray implements Runnable, Callable, Disposable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f39695b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f39696c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f39697d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f39698e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f39699a;

    public n(Runnable runnable, DisposableContainer disposableContainer) {
        super(3);
        this.f39699a = runnable;
        lazySet(0, disposableContainer);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f39698e) {
                return;
            }
            if (obj == f39696c) {
                future.cancel(false);
                return;
            } else if (obj == f39697d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f39698e;
            if (obj6 == obj || obj6 == (obj4 = f39696c) || obj6 == (obj5 = f39697d)) {
                break;
            }
            boolean z3 = get(2) != Thread.currentThread();
            if (z3) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z3);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f39695b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((DisposableContainer) obj2).delete(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        Object obj = get(0);
        return obj == f39695b || obj == f39698e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2 = f39697d;
        Object obj3 = f39696c;
        Object obj4 = f39695b;
        Object obj5 = f39698e;
        lazySet(2, Thread.currentThread());
        try {
            this.f39699a.run();
        } catch (Throwable th) {
            try {
                b.V(th);
            } finally {
                lazySet(2, null);
                Object obj6 = get(0);
                if (obj6 != obj4 && compareAndSet(0, obj6, obj5) && obj6 != null) {
                    ((DisposableContainer) obj6).delete(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj3 || obj == obj2) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj5));
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj4 && compareAndSet(0, obj7, obj5) && obj7 != null) {
            ((DisposableContainer) obj7).delete(this);
        }
        while (r2 != obj3 && r2 != obj2 && !compareAndSet(1, get(i), obj5)) {
        }
    }
}
