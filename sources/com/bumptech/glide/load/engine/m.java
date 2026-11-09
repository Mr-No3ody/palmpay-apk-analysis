package com.bumptech.glide.load.engine;

import C9.N;
import Pa.C0505b;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.m1;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.didiglobal.booster.instrument.ShadowExecutors;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class m implements EngineJobListener, MemoryCache.ResourceRemovedListener, EngineResource$ResourceListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f20710i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f20711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final org.sufficientlysecure.htmltextview.k f20712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.cache.f f20713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m1 f20714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N f20715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f20716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0505b f20717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final O2.a f20718h;

    public m(com.bumptech.glide.load.engine.cache.f fVar, com.bumptech.glide.load.engine.cache.c cVar, p359y1.b bVar, p359y1.b bVar2, p359y1.b bVar3, p359y1.b bVar4) {
        this.f20713c = fVar;
        l lVar = new l(cVar);
        this.f20716f = lVar;
        ExecutorService executorServiceNewOptimizedSingleThreadExecutor = ShadowExecutors.newOptimizedSingleThreadExecutor(new androidx.camera.core.impl.utils.executor.e(2), "\u200bcom.bumptech.glide.load.engine.ActiveResources");
        O2.a aVar = new O2.a();
        aVar.f6554b = new HashMap();
        aVar.f6555c = new ReferenceQueue();
        aVar.f6553a = executorServiceNewOptimizedSingleThreadExecutor;
        executorServiceNewOptimizedSingleThreadExecutor.execute(new androidx.customview.widget.e(aVar, 11));
        this.f20718h = aVar;
        synchronized (this) {
            synchronized (aVar) {
                aVar.f6556d = this;
            }
        }
        this.f20712b = new org.sufficientlysecure.htmltextview.k(4);
        this.f20711a = new g();
        m1 m1Var = new m1();
        m1Var.f12977g = K1.a.a(150, new Sd.b(m1Var, 16));
        m1Var.f12971a = bVar;
        m1Var.f12972b = bVar2;
        m1Var.f12973c = bVar3;
        m1Var.f12974d = bVar4;
        m1Var.f12975e = this;
        m1Var.f12976f = this;
        this.f20714d = m1Var;
        this.f20717g = new C0505b(lVar);
        this.f20715e = new N();
        fVar.f20627e = this;
    }

    public static void c(Resource resource) {
        if (!(resource instanceof s)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((s) resource).b();
    }

    public final androidx.camera.video.internal.c a(com.bumptech.glide.f fVar, Object obj, Key key, int i7, int i10, Class cls, Class cls2, com.bumptech.glide.g gVar, k kVar, J1.d dVar, boolean z3, boolean z8, com.bumptech.glide.load.h hVar, boolean z10, boolean z11, boolean z12, G1.e eVar, Executor executor) {
        long jElapsedRealtimeNanos;
        if (f20710i) {
            int i11 = J1.i.f4465a;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f20712b.getClass();
        r rVar = new r(obj, key, i7, i10, dVar, cls, cls2, hVar);
        synchronized (this) {
            try {
                s sVarB = b(rVar, z10, jElapsedRealtimeNanos);
                if (sVarB == null) {
                    return d(fVar, obj, key, i7, i10, cls, cls2, gVar, kVar, dVar, z3, z8, hVar, z10, z11, z12, eVar, executor, rVar, jElapsedRealtimeNanos);
                }
                eVar.onResourceReady(sVarB, com.bumptech.glide.load.a.f20512e, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s b(r rVar, boolean z3, long j6) throws Throwable {
        Throwable th;
        s sVar;
        m mVar;
        r rVar2;
        s sVar2;
        if (z3) {
            O2.a aVar = this.f20718h;
            synchronized (aVar) {
                try {
                    C1323a c1323a = (C1323a) ((HashMap) aVar.f6554b).get(rVar);
                    if (c1323a == null) {
                        sVar = null;
                    } else {
                        sVar = (s) c1323a.get();
                        if (sVar == null) {
                            try {
                                aVar.b(c1323a);
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                }
                            }
                        }
                    }
                    if (sVar != null) {
                        sVar.a();
                    }
                    if (sVar != null) {
                        if (f20710i) {
                            int i7 = J1.i.f4465a;
                            SystemClock.elapsedRealtimeNanos();
                            Objects.toString(rVar);
                        }
                        return sVar;
                    }
                    Resource resourceRemove = this.f20713c.remove(rVar);
                    if (resourceRemove == null) {
                        mVar = this;
                        rVar2 = rVar;
                        sVar2 = null;
                    } else if (resourceRemove instanceof s) {
                        sVar2 = (s) resourceRemove;
                        mVar = this;
                        rVar2 = rVar;
                    } else {
                        mVar = this;
                        rVar2 = rVar;
                        sVar2 = new s(resourceRemove, true, true, rVar2, mVar);
                    }
                    if (sVar2 != null) {
                        sVar2.a();
                        mVar.f20718h.a(rVar2, sVar2);
                    }
                    if (sVar2 != null) {
                        if (f20710i) {
                            int i10 = J1.i.f4465a;
                            SystemClock.elapsedRealtimeNanos();
                            Objects.toString(rVar2);
                        }
                        return sVar2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        return null;
    }

    public final androidx.camera.video.internal.c d(com.bumptech.glide.f fVar, Object obj, Key key, int i7, int i10, Class cls, Class cls2, com.bumptech.glide.g gVar, k kVar, J1.d dVar, boolean z3, boolean z8, com.bumptech.glide.load.h hVar, boolean z10, boolean z11, boolean z12, G1.e eVar, Executor executor, r rVar, long j6) {
        p359y1.b bVar;
        g gVar2 = this.f20711a;
        q qVar = (q) ((HashMap) (z12 ? gVar2.f20664b : gVar2.f20663a)).get(rVar);
        if (qVar != null) {
            qVar.a(eVar, executor);
            if (f20710i) {
                int i11 = J1.i.f4465a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(rVar);
            }
            return new androidx.camera.video.internal.c(this, eVar, qVar);
        }
        q qVar2 = (q) ((top.zibin.luban.io.a) this.f20714d.f12977g).acquire();
        J1.g.c(qVar2, "Argument must not be null");
        synchronized (qVar2) {
            qVar2.f20745p = rVar;
            qVar2.t = z10;
            qVar2.f20746v = z11;
            qVar2.f20747w = z12;
        }
        C0505b c0505b = this.f20717g;
        i iVar = (i) ((top.zibin.luban.io.a) c0505b.f7074d).acquire();
        J1.g.c(iVar, "Argument must not be null");
        int i12 = c0505b.f7072b;
        c0505b.f7072b = i12 + 1;
        f fVar2 = iVar.f20678a;
        fVar2.f20647c = fVar;
        fVar2.f20648d = obj;
        fVar2.f20658n = key;
        fVar2.f20649e = i7;
        fVar2.f20650f = i10;
        fVar2.f20660p = kVar;
        fVar2.f20651g = cls;
        fVar2.f20652h = iVar.f20681d;
        fVar2.f20655k = cls2;
        fVar2.f20659o = gVar;
        fVar2.f20653i = hVar;
        fVar2.f20654j = dVar;
        fVar2.f20661q = z3;
        fVar2.f20662r = z8;
        iVar.f20685i = fVar;
        iVar.f20686j = key;
        iVar.f20688o = gVar;
        iVar.f20689p = rVar;
        iVar.t = i7;
        iVar.f20696v = i10;
        iVar.f20697w = kVar;
        iVar.f20671H = z12;
        iVar.f20668A = hVar;
        iVar.f20669B = qVar2;
        iVar.f20670C = i12;
        iVar.f20695u0 = 1;
        iVar.f20672L = obj;
        g gVar3 = this.f20711a;
        gVar3.getClass();
        ((HashMap) (qVar2.f20747w ? gVar3.f20664b : gVar3.f20663a)).put(rVar, qVar2);
        qVar2.a(eVar, executor);
        synchronized (qVar2) {
            qVar2.f20732Q = iVar;
            int iE = iVar.e(1);
            if (iE == 2 || iE == 3) {
                bVar = qVar2.f20741g;
            } else {
                bVar = qVar2.f20746v ? qVar2.f20743j : qVar2.f20742i;
            }
            bVar.execute(iVar);
        }
        if (f20710i) {
            int i13 = J1.i.f4465a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(rVar);
        }
        return new androidx.camera.video.internal.c(this, eVar, qVar2);
    }

    @Override // com.bumptech.glide.load.engine.EngineJobListener
    public final synchronized void onEngineJobCancelled(q qVar, Key key) {
        g gVar = this.f20711a;
        gVar.getClass();
        HashMap map = (HashMap) (qVar.f20747w ? gVar.f20664b : gVar.f20663a);
        if (qVar.equals(map.get(key))) {
            map.remove(key);
        }
    }

    @Override // com.bumptech.glide.load.engine.EngineJobListener
    public final synchronized void onEngineJobComplete(q qVar, Key key, s sVar) {
        if (sVar != null) {
            try {
                if (sVar.f20757a) {
                    this.f20718h.a(key, sVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g gVar = this.f20711a;
        gVar.getClass();
        HashMap map = (HashMap) (qVar.f20747w ? gVar.f20664b : gVar.f20663a);
        if (qVar.equals(map.get(key))) {
            map.remove(key);
        }
    }

    @Override // com.bumptech.glide.load.engine.EngineResource$ResourceListener
    public final void onResourceReleased(Key key, s sVar) {
        O2.a aVar = this.f20718h;
        synchronized (aVar) {
            C1323a c1323a = (C1323a) ((HashMap) aVar.f6554b).remove(key);
            if (c1323a != null) {
                c1323a.f20572c = null;
                c1323a.clear();
            }
        }
        if (sVar.f20757a) {
            this.f20713c.put(key, sVar);
        } else {
            this.f20715e.l(sVar, false);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener
    public final void onResourceRemoved(Resource resource) {
        this.f20715e.l(resource, true);
    }
}
