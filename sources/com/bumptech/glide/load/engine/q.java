package com.bumptech.glide.load.engine;

import com.bumptech.glide.util.pool.FactoryPools$Poolable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class q implements DecodeJob$Callback, FactoryPools$Poolable {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final org.sufficientlysecure.htmltextview.i f20725Z = new org.sufficientlysecure.htmltextview.i(4);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Resource f20726A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public com.bumptech.glide.load.a f20727B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f20728C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public u f20729H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f20730L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public s f20731M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public i f20732Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public volatile boolean f20733X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f20734Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f20735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K1.b f20736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f20737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final top.zibin.luban.io.a f20738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final org.sufficientlysecure.htmltextview.i f20739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f20740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p359y1.b f20741g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p359y1.b f20742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p359y1.b f20743j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicInteger f20744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r f20745p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20746v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20747w;

    public q(p359y1.b bVar, p359y1.b bVar2, p359y1.b bVar3, p359y1.b bVar4, m mVar, m mVar2, top.zibin.luban.io.a aVar) {
        org.sufficientlysecure.htmltextview.i iVar = f20725Z;
        this.f20735a = new p(new ArrayList(2));
        this.f20736b = new K1.b();
        this.f20744o = new AtomicInteger();
        this.f20741g = bVar;
        this.f20742i = bVar2;
        this.f20743j = bVar4;
        this.f20740f = mVar;
        this.f20737c = mVar2;
        this.f20738d = aVar;
        this.f20739e = iVar;
    }

    public final synchronized void a(G1.e eVar, Executor executor) {
        try {
            this.f20736b.a();
            p pVar = this.f20735a;
            pVar.getClass();
            pVar.f20724a.add(new o(eVar, executor));
            if (this.f20728C) {
                c(1);
                executor.execute(new n(this, eVar, 1));
            } else if (this.f20730L) {
                c(1);
                executor.execute(new n(this, eVar, 0));
            } else {
                J1.g.a(!this.f20733X, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        s sVar;
        synchronized (this) {
            try {
                this.f20736b.a();
                J1.g.a(d(), "Not yet complete!");
                int iDecrementAndGet = this.f20744o.decrementAndGet();
                J1.g.a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    sVar = this.f20731M;
                    e();
                } else {
                    sVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sVar != null) {
            sVar.b();
        }
    }

    public final synchronized void c(int i7) {
        s sVar;
        J1.g.a(d(), "Not yet complete!");
        if (this.f20744o.getAndAdd(i7) == 0 && (sVar = this.f20731M) != null) {
            sVar.a();
        }
    }

    public final boolean d() {
        return this.f20730L || this.f20728C || this.f20733X;
    }

    public final synchronized void e() {
        boolean zA;
        if (this.f20745p == null) {
            throw new IllegalArgumentException();
        }
        this.f20735a.f20724a.clear();
        this.f20745p = null;
        this.f20731M = null;
        this.f20726A = null;
        this.f20730L = false;
        this.f20733X = false;
        this.f20728C = false;
        this.f20734Y = false;
        i iVar = this.f20732Q;
        androidx.camera.camera2.internal.compat.workaround.a aVar = iVar.f20684g;
        synchronized (aVar) {
            aVar.f13484a = true;
            zA = aVar.a();
        }
        if (zA) {
            iVar.g();
        }
        this.f20732Q = null;
        this.f20729H = null;
        this.f20727B = null;
        this.f20738d.release(this);
    }

    public final synchronized void f(G1.e eVar) {
        try {
            this.f20736b.a();
            p pVar = this.f20735a;
            pVar.f20724a.remove(new o(eVar, J1.g.f4462b));
            if (this.f20735a.f20724a.isEmpty()) {
                if (!d()) {
                    this.f20733X = true;
                    i iVar = this.f20732Q;
                    iVar.f20692r0 = true;
                    DataFetcherGenerator dataFetcherGenerator = iVar.f20690p0;
                    if (dataFetcherGenerator != null) {
                        dataFetcherGenerator.cancel();
                    }
                    this.f20740f.onEngineJobCancelled(this, this.f20745p);
                }
                if (this.f20728C || this.f20730L) {
                    if (this.f20744o.get() == 0) {
                        e();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools$Poolable
    public final K1.c getVerifier() {
        return this.f20736b;
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob$Callback
    public final void onLoadFailed(u uVar) {
        synchronized (this) {
            this.f20729H = uVar;
        }
        synchronized (this) {
            try {
                this.f20736b.a();
                if (this.f20733X) {
                    e();
                    return;
                }
                if (this.f20735a.f20724a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f20730L) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f20730L = true;
                r rVar = this.f20745p;
                p pVar = this.f20735a;
                pVar.getClass();
                ArrayList<o> arrayList = new ArrayList(pVar.f20724a);
                c(arrayList.size() + 1);
                this.f20740f.onEngineJobComplete(this, rVar, null);
                for (o oVar : arrayList) {
                    oVar.f20723b.execute(new n(this, oVar.f20722a, 0));
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob$Callback
    public final void onResourceReady(Resource resource, com.bumptech.glide.load.a aVar, boolean z3) {
        synchronized (this) {
            this.f20726A = resource;
            this.f20727B = aVar;
            this.f20734Y = z3;
        }
        synchronized (this) {
            try {
                this.f20736b.a();
                if (this.f20733X) {
                    this.f20726A.recycle();
                    e();
                    return;
                }
                if (this.f20735a.f20724a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f20728C) {
                    throw new IllegalStateException("Already have resource");
                }
                org.sufficientlysecure.htmltextview.i iVar = this.f20739e;
                Resource resource2 = this.f20726A;
                boolean z8 = this.t;
                r rVar = this.f20745p;
                m mVar = this.f20737c;
                iVar.getClass();
                this.f20731M = new s(resource2, z8, true, rVar, mVar);
                this.f20728C = true;
                p pVar = this.f20735a;
                pVar.getClass();
                ArrayList<o> arrayList = new ArrayList(pVar.f20724a);
                c(arrayList.size() + 1);
                this.f20740f.onEngineJobComplete(this, this.f20745p, this.f20731M);
                for (o oVar : arrayList) {
                    oVar.f20723b.execute(new n(this, oVar.f20722a, 1));
                }
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob$Callback
    public final void reschedule(i iVar) {
        (this.f20746v ? this.f20743j : this.f20742i).execute(iVar);
    }
}
