package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1338c implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21537a = false;

    public static boolean a(int i7) {
        return (i7 & 1) == 1;
    }

    public static boolean b(int i7) {
        return !a(i7);
    }

    public static boolean h(int i7, int i10) {
        return (i7 & i10) == i10;
    }

    public abstract void c();

    public abstract void d(Throwable th);

    public abstract void e(int i7, Object obj);

    public abstract void f(float f10);

    public final void g(Exception exc) {
        Class<?> cls = getClass();
        p229p2.b bVar = p229p2.a.f41180a;
        if (bVar.isLoggable(6)) {
            bVar.wtf(cls.getSimpleName(), "unhandled exception", exc);
        }
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public final synchronized void onCancellation() {
        if (this.f21537a) {
            return;
        }
        this.f21537a = true;
        try {
            c();
        } catch (Exception e10) {
            g(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public final synchronized void onFailure(Throwable th) {
        if (this.f21537a) {
            return;
        }
        this.f21537a = true;
        try {
            d(th);
        } catch (Exception e10) {
            g(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public final synchronized void onNewResult(Object obj, int i7) {
        if (this.f21537a) {
            return;
        }
        this.f21537a = a(i7);
        try {
            e(i7, obj);
        } catch (Exception e10) {
            g(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.Consumer
    public final synchronized void onProgressUpdate(float f10) {
        if (this.f21537a) {
            return;
        }
        try {
            f(f10);
        } catch (Exception e10) {
            g(e10);
        }
    }
}
