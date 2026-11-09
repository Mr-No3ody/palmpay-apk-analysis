package androidx.camera.core.impl;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class I0 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f13889i = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f13890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Observable.Observer f13891b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f13893d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f13892c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f13894e = f13889i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13895f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13896g = false;

    public I0(AtomicReference atomicReference, Executor executor, Observable.Observer observer) {
        this.f13893d = atomicReference;
        this.f13890a = executor;
        this.f13891b = observer;
    }

    public final void a(int i7) {
        synchronized (this) {
            try {
                if (this.f13892c.get()) {
                    if (i7 <= this.f13895f) {
                        return;
                    }
                    this.f13895f = i7;
                    if (this.f13896g) {
                        return;
                    }
                    this.f13896g = true;
                    try {
                        this.f13890a.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.f13896g = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.f13892c.get()) {
                    this.f13896g = false;
                    return;
                }
                Object obj = this.f13893d.get();
                int i7 = this.f13895f;
                while (true) {
                    if (!Objects.equals(this.f13894e, obj)) {
                        this.f13894e = obj;
                        if (obj instanceof AbstractC0989l) {
                            Observable.Observer observer = this.f13891b;
                            ((AbstractC0989l) obj).getClass();
                            observer.onError(null);
                        } else {
                            this.f13891b.onNewData(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i7 == this.f13895f || !this.f13892c.get()) {
                                break;
                                break;
                            } else {
                                obj = this.f13893d.get();
                                i7 = this.f13895f;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.f13896g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
