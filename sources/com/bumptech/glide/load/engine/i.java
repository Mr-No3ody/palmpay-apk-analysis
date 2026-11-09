package com.bumptech.glide.load.engine;

import N8.q0;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.camera2.internal.F;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.util.pool.FactoryPools$Poolable;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i implements DataFetcherGenerator.FetcherReadyCallback, Runnable, Comparable, FactoryPools$Poolable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public com.bumptech.glide.load.h f20668A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public q f20669B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f20670C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f20671H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Object f20672L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Thread f20673M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Key f20674Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Key f20675X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object f20676Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public com.bumptech.glide.load.a f20677Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f20681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final top.zibin.luban.io.a f20682e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.bumptech.glide.f f20685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Key f20686j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public DataFetcher f20687k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.g f20688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r f20689p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public volatile DataFetcherGenerator f20690p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public volatile boolean f20691q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public volatile boolean f20692r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f20693s0;
    public int t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f20694t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f20695u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20696v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k f20697w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f20678a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20679b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K1.b f20680c = new K1.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f20683f = new h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.workaround.a f20684g = new androidx.camera.camera2.internal.compat.workaround.a();

    public i(l lVar, top.zibin.luban.io.a aVar) {
        this.f20681d = lVar;
        this.f20682e = aVar;
    }

    public final Resource a(DataFetcher dataFetcher, Object obj, com.bumptech.glide.load.a aVar) {
        if (obj == null) {
            dataFetcher.cleanup();
            return null;
        }
        try {
            int i7 = J1.i.f4465a;
            SystemClock.elapsedRealtimeNanos();
            Resource resourceB = b(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                resourceB.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.f20689p);
                Thread.currentThread().getName();
            }
            return resourceB;
        } finally {
            dataFetcher.cleanup();
        }
    }

    public final Resource b(Object obj, com.bumptech.glide.load.a aVar) {
        Class<?> cls = obj.getClass();
        f fVar = this.f20678a;
        v vVarC = fVar.c(cls);
        com.bumptech.glide.load.h hVar = this.f20668A;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z3 = aVar == com.bumptech.glide.load.a.f20511d || fVar.f20662r;
            com.bumptech.glide.load.g gVar = com.bumptech.glide.load.resource.bitmap.o.f20936i;
            Boolean bool = (Boolean) hVar.a(gVar);
            if (bool == null || (bool.booleanValue() && !z3)) {
                hVar = new com.bumptech.glide.load.h();
                com.bumptech.glide.load.h hVar2 = this.f20668A;
                J1.d dVar = hVar.f20807b;
                dVar.g(hVar2.f20807b);
                dVar.put(gVar, Boolean.valueOf(z3));
            }
        }
        com.bumptech.glide.load.h hVar3 = hVar;
        DataRewinder dataRewinderG = this.f20685i.a().g(obj);
        try {
            int i7 = this.t;
            int i10 = this.f20696v;
            g gVar2 = new g(this, aVar);
            top.zibin.luban.io.a aVar2 = vVarC.f20772a;
            Object objAcquire = aVar2.acquire();
            J1.g.c(objAcquire, "Argument must not be null");
            List list = (List) objAcquire;
            try {
                Resource resourceA = vVarC.a(dataRewinderG, hVar3, i7, i10, gVar2, list);
                aVar2.release(list);
                dataRewinderG.cleanup();
                return resourceA;
            } catch (Throwable th) {
                aVar2.release(list);
                throw th;
            }
        } catch (Throwable th2) {
            dataRewinderG.cleanup();
            throw th2;
        }
    }

    public final void c() {
        Resource resourceA;
        boolean zA;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.f20676Y + ", cache key: " + this.f20674Q + ", fetcher: " + this.f20687k0;
            int i7 = J1.i.f4465a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.f20689p);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        w wVar = null;
        try {
            resourceA = a(this.f20687k0, this.f20676Y, this.f20677Z);
        } catch (u e10) {
            Key key = this.f20675X;
            com.bumptech.glide.load.a aVar = this.f20677Z;
            e10.f20768b = key;
            e10.f20769c = aVar;
            e10.f20770d = null;
            this.f20679b.add(e10);
            resourceA = null;
        }
        if (resourceA == null) {
            h();
            return;
        }
        com.bumptech.glide.load.a aVar2 = this.f20677Z;
        boolean z3 = this.f20693s0;
        if (resourceA instanceof Initializable) {
            ((Initializable) resourceA).initialize();
        }
        if (this.f20683f.f20667c != null) {
            wVar = (w) w.f20775e.acquire();
            J1.g.c(wVar, "Argument must not be null");
            wVar.f20779d = false;
            wVar.f20778c = true;
            wVar.f20777b = resourceA;
            resourceA = wVar;
        }
        j();
        this.f20669B.onResourceReady(resourceA, aVar2, z3);
        this.f20694t0 = 5;
        try {
            h hVar = this.f20683f;
            if (hVar.f20667c != null) {
                l lVar = this.f20681d;
                com.bumptech.glide.load.h hVar2 = this.f20668A;
                hVar.getClass();
                try {
                    lVar.getDiskCache().put(hVar.f20665a, new e(hVar.f20666b, hVar.f20667c, hVar2));
                    hVar.f20667c.a();
                } catch (Throwable th) {
                    hVar.f20667c.a();
                    throw th;
                }
            }
            if (wVar != null) {
                wVar.a();
            }
            androidx.camera.camera2.internal.compat.workaround.a aVar3 = this.f20684g;
            synchronized (aVar3) {
                aVar3.f13485b = true;
                zA = aVar3.a();
            }
            if (zA) {
                g();
            }
        } catch (Throwable th2) {
            if (wVar != null) {
                wVar.a();
            }
            throw th2;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        int iOrdinal = this.f20688o.ordinal() - iVar.f20688o.ordinal();
        return iOrdinal == 0 ? this.f20670C - iVar.f20670C : iOrdinal;
    }

    public final DataFetcherGenerator d() {
        int i7 = F.i(this.f20694t0);
        f fVar = this.f20678a;
        if (i7 == 1) {
            return new x(fVar, this);
        }
        if (i7 == 2) {
            return new c(fVar.a(), fVar, this);
        }
        if (i7 == 3) {
            return new A(fVar, this);
        }
        if (i7 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(com.airbnb.lottie.model.layer.d.x(this.f20694t0)));
    }

    public final int e(int i7) {
        boolean z3;
        boolean z8;
        int i10 = F.i(i7);
        if (i10 == 0) {
            switch (this.f20697w.f20707a) {
                case 0:
                default:
                    z3 = true;
                    break;
                case 1:
                case 2:
                    z3 = false;
                    break;
            }
            if (z3) {
                return 2;
            }
            return e(2);
        }
        if (i10 != 1) {
            if (i10 == 2) {
                return this.f20671H ? 6 : 4;
            }
            if (i10 == 3 || i10 == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(com.airbnb.lottie.model.layer.d.x(i7)));
        }
        switch (this.f20697w.f20707a) {
            case 0:
            case 2:
            default:
                z8 = true;
                break;
            case 1:
                z8 = false;
                break;
        }
        if (z8) {
            return 3;
        }
        return e(3);
    }

    public final void f() {
        boolean zA;
        j();
        this.f20669B.onLoadFailed(new u("Failed to load resource", new ArrayList(this.f20679b)));
        androidx.camera.camera2.internal.compat.workaround.a aVar = this.f20684g;
        synchronized (aVar) {
            aVar.f13486c = true;
            zA = aVar.a();
        }
        if (zA) {
            g();
        }
    }

    public final void g() {
        androidx.camera.camera2.internal.compat.workaround.a aVar = this.f20684g;
        synchronized (aVar) {
            aVar.f13485b = false;
            aVar.f13484a = false;
            aVar.f13486c = false;
        }
        h hVar = this.f20683f;
        hVar.f20665a = null;
        hVar.f20666b = null;
        hVar.f20667c = null;
        f fVar = this.f20678a;
        fVar.f20647c = null;
        fVar.f20648d = null;
        fVar.f20658n = null;
        fVar.f20651g = null;
        fVar.f20655k = null;
        fVar.f20653i = null;
        fVar.f20659o = null;
        fVar.f20654j = null;
        fVar.f20660p = null;
        fVar.f20645a.clear();
        fVar.f20656l = false;
        fVar.f20646b.clear();
        fVar.f20657m = false;
        this.f20691q0 = false;
        this.f20685i = null;
        this.f20686j = null;
        this.f20668A = null;
        this.f20688o = null;
        this.f20689p = null;
        this.f20669B = null;
        this.f20694t0 = 0;
        this.f20690p0 = null;
        this.f20673M = null;
        this.f20674Q = null;
        this.f20676Y = null;
        this.f20677Z = null;
        this.f20687k0 = null;
        this.f20692r0 = false;
        this.f20672L = null;
        this.f20679b.clear();
        this.f20682e.release(this);
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools$Poolable
    public final K1.c getVerifier() {
        return this.f20680c;
    }

    public final void h() {
        this.f20673M = Thread.currentThread();
        int i7 = J1.i.f4465a;
        SystemClock.elapsedRealtimeNanos();
        boolean zStartNext = false;
        while (!this.f20692r0 && this.f20690p0 != null && !(zStartNext = this.f20690p0.startNext())) {
            this.f20694t0 = e(this.f20694t0);
            this.f20690p0 = d();
            if (this.f20694t0 == 4) {
                this.f20695u0 = 2;
                this.f20669B.reschedule(this);
                return;
            }
        }
        if ((this.f20694t0 == 6 || this.f20692r0) && !zStartNext) {
            f();
        }
    }

    public final void i() {
        String str;
        int i7 = F.i(this.f20695u0);
        if (i7 == 0) {
            this.f20694t0 = e(1);
            this.f20690p0 = d();
            h();
        } else {
            if (i7 == 1) {
                h();
                return;
            }
            if (i7 == 2) {
                c();
                return;
            }
            int i10 = this.f20695u0;
            if (i10 == 1) {
                str = "INITIALIZE";
            } else if (i10 != 2) {
                str = i10 != 3 ? BuildConfig.TRAVIS : "DECODE_DATA";
            } else {
                str = "SWITCH_TO_SOURCE_SERVICE";
            }
            throw new IllegalStateException("Unrecognized run reason: ".concat(str));
        }
    }

    public final void j() {
        this.f20680c.a();
        if (this.f20691q0) {
            throw new IllegalStateException("Already notified", this.f20679b.isEmpty() ? null : (Throwable) q0.i(1, this.f20679b));
        }
        this.f20691q0 = true;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void onDataFetcherFailed(Key key, Exception exc, DataFetcher dataFetcher, com.bumptech.glide.load.a aVar) {
        dataFetcher.cleanup();
        u uVar = new u("Fetching data failed", Collections.singletonList(exc));
        Class dataClass = dataFetcher.getDataClass();
        uVar.f20768b = key;
        uVar.f20769c = aVar;
        uVar.f20770d = dataClass;
        this.f20679b.add(uVar);
        if (Thread.currentThread() == this.f20673M) {
            h();
        } else {
            this.f20695u0 = 2;
            this.f20669B.reschedule(this);
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void onDataFetcherReady(Key key, Object obj, DataFetcher dataFetcher, com.bumptech.glide.load.a aVar, Key key2) {
        this.f20674Q = key;
        this.f20676Y = obj;
        this.f20687k0 = dataFetcher;
        this.f20677Z = aVar;
        this.f20675X = key2;
        this.f20693s0 = key != this.f20678a.a().get(0);
        if (Thread.currentThread() == this.f20673M) {
            c();
        } else {
            this.f20695u0 = 3;
            this.f20669B.reschedule(this);
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    public final void reschedule() {
        this.f20695u0 = 2;
        this.f20669B.reschedule(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        DataFetcher dataFetcher = this.f20687k0;
        try {
            try {
                if (this.f20692r0) {
                    f();
                    if (dataFetcher != null) {
                        dataFetcher.cleanup();
                        return;
                    }
                    return;
                }
                i();
                if (dataFetcher != null) {
                    dataFetcher.cleanup();
                }
            } catch (Throwable th) {
                if (dataFetcher != null) {
                    dataFetcher.cleanup();
                }
                throw th;
            }
        } catch (b e10) {
            throw e10;
        } catch (Throwable th2) {
            if (this.f20694t0 != 5) {
                this.f20679b.add(th2);
                f();
            }
            if (!this.f20692r0) {
                throw th2;
            }
            throw th2;
        }
    }
}
