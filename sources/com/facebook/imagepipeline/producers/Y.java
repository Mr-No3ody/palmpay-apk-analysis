package com.facebook.imagepipeline.producers;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC1338c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21520c;

    public /* synthetic */ Y(Object obj, int i7) {
        this.f21519b = i7;
        this.f21520c = obj;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void c() {
        switch (this.f21519b) {
            case 0:
                try {
                    p181m3.a.a();
                    Z z3 = (Z) this.f21520c;
                    synchronized (z3) {
                        try {
                            if (z3.f21527g == this) {
                                z3.f21527g = null;
                                z3.f21526f = null;
                                Z.b(z3.f21523c);
                                z3.f21523c = null;
                                z3.i(3);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    p181m3.a.a();
                    return;
                } catch (Throwable th2) {
                    p181m3.a.a();
                    throw th2;
                }
            default:
                p076f3.a aVar = (p076f3.a) this.f21520c;
                synchronized (aVar) {
                    p213o2.e.f(aVar.isClosed());
                }
                return;
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void d(Throwable throwable) {
        switch (this.f21519b) {
            case 0:
                try {
                    p181m3.a.a();
                    ((Z) this.f21520c).f(this, throwable);
                    return;
                } finally {
                    p181m3.a.a();
                }
            default:
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                p076f3.a aVar = (p076f3.a) this.f21520c;
                i0 producerContext = aVar.f36378h;
                Intrinsics.checkNotNullParameter(producerContext, "producerContext");
                if (aVar.c(throwable, producerContext.getExtras())) {
                    aVar.f36379i.onRequestFailure(producerContext, throwable);
                    return;
                }
                return;
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void e(int i7, Object obj) {
        switch (this.f21519b) {
            case 0:
                Closeable closeable = (Closeable) obj;
                try {
                    p181m3.a.a();
                    ((Z) this.f21520c).g(this, closeable, i7);
                    return;
                } finally {
                    p181m3.a.a();
                }
            default:
                p076f3.a aVar = (p076f3.a) this.f21520c;
                aVar.g(obj, i7, aVar.f36378h);
                return;
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void f(float f10) {
        switch (this.f21519b) {
            case 0:
                try {
                    p181m3.a.a();
                    ((Z) this.f21520c).h(this, f10);
                    return;
                } finally {
                    p181m3.a.a();
                }
            default:
                ((p076f3.a) this.f21520c).d(f10);
                return;
        }
    }
}
