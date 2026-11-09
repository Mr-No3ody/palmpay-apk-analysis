package androidx.camera.core.impl;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class J0 implements Observable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f13911b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13910a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13912c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13913d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f13914e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet f13915f = new CopyOnWriteArraySet();

    public J0(Object obj) {
        this.f13911b = new AtomicReference(obj);
    }

    public final void a(Observable.Observer observer) {
        I0 i0 = (I0) this.f13914e.remove(observer);
        if (i0 != null) {
            i0.f13892c.set(false);
            this.f13915f.remove(i0);
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public final void addObserver(Executor executor, Observable.Observer observer) {
        I0 i0;
        synchronized (this.f13910a) {
            a(observer);
            i0 = new I0(this.f13911b, executor, observer);
            this.f13914e.put(observer, i0);
            this.f13915f.add(i0);
        }
        i0.a(0);
    }

    public final void b(Object obj) {
        Iterator it;
        int i7;
        synchronized (this.f13910a) {
            try {
                if (Objects.equals(this.f13911b.getAndSet(obj), obj)) {
                    return;
                }
                int i10 = this.f13912c + 1;
                this.f13912c = i10;
                if (this.f13913d) {
                    return;
                }
                this.f13913d = true;
                Iterator it2 = this.f13915f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((I0) it2.next()).a(i10);
                    } else {
                        synchronized (this.f13910a) {
                            try {
                                if (this.f13912c == i10) {
                                    this.f13913d = false;
                                    return;
                                } else {
                                    it = this.f13915f.iterator();
                                    i7 = this.f13912c;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        it2 = it;
                        i10 = i7;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public final ListenableFuture fetchData() {
        Object obj = this.f13911b.get();
        if (!(obj instanceof AbstractC0989l)) {
            return androidx.camera.core.impl.utils.futures.j.d(obj);
        }
        ((AbstractC0989l) obj).getClass();
        return new androidx.camera.core.impl.utils.futures.l(null, 1);
    }

    @Override // androidx.camera.core.impl.Observable
    public final void removeObserver(Observable.Observer observer) {
        synchronized (this.f13910a) {
            a(observer);
        }
    }
}
