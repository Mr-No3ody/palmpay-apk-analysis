package com.didi.drouter.router;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.video.internal.encoder.o;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap f21145f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f21148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IRouterResult f21149d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f21146a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f21147b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LifecycleObserver f21150e = new LifecycleEventObserver() { // from class: com.didi.drouter.router.ResultAgent$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, EnumC1203m enumC1203m) {
            if (enumC1203m == EnumC1203m.ON_DESTROY) {
                ConcurrentHashMap concurrentHashMap = f.f21145f;
                f fVar = this.f21129a;
                if (concurrentHashMap.containsKey(fVar.f21148c.f21142g)) {
                    Object[] objArr = {fVar.f21148c.f21142g};
                    if (p092g2.c.c()) {
                        p092g2.c.a("request \"%s\" lifecycleOwner destroy and complete", objArr);
                    }
                    f.c(fVar.f21148c, "request_cancel");
                }
            }
        }
    };

    public f(d dVar, Set set, e eVar, H6.a aVar) {
        ConcurrentHashMap concurrentHashMap = f21145f;
        concurrentHashMap.put(dVar.f21142g, eVar);
        this.f21149d = (IRouterResult) new C2085k0(IRouterResult.class).a(new Object[0]);
        this.f21148c = dVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d dVar2 = (d) it.next();
            concurrentHashMap.put(dVar2.f21142g, eVar);
            this.f21146a.put(dVar2.f21142g, dVar2);
        }
        if (dVar.f21140e != null) {
            o oVar = new o(24, this, dVar);
            Handler handler = p092g2.b.f36837a;
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                oVar.run();
            } else {
                p092g2.b.f36837a.postDelayed(oVar, 0L);
            }
        }
    }

    public static synchronized void a(String str, String str2) {
        int i7;
        try {
            ConcurrentHashMap concurrentHashMap = f21145f;
            e eVar = (e) concurrentHashMap.get(str);
            if (eVar != null) {
                if ("timeout".equals(str2)) {
                    Object[] objArr = {str};
                    if (p092g2.c.c()) {
                        p092g2.c.a("request \"%s\" time out and force-complete", objArr);
                    }
                }
                eVar.f21143c.f21147b.put(str, str2);
                f fVar = eVar.f21143c;
                d dVar = (d) fVar.f21146a.get(str);
                synchronized (fVar) {
                    try {
                        if (fVar.f21149d != null && dVar != null) {
                            if ("not_found".equals(str2)) {
                                i7 = 1;
                            } else {
                                i7 = ("stop_by_interceptor".equals(str2) || "stop_by_router_target".equals(str2)) ? 2 : 0;
                            }
                            fVar.f21149d.onResult(dVar, i7);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                concurrentHashMap.remove(str);
                Object[] objArr2 = {str, str2};
                if (p092g2.c.c()) {
                    p092g2.c.a("==== request \"%s\" complete, reason \"%s\" ====", objArr2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void b(e eVar) {
        try {
            f fVar = eVar.f21143c;
            d dVar = fVar.f21148c;
            Object[] objArr = {dVar.f21142g, dVar.f21138c, fVar.f21147b.toString()};
            if (p092g2.c.c()) {
                p092g2.c.a("primary request \"%s\" complete, router uri \"%s\", all reason %s", objArr);
            }
            f21145f.remove(eVar.f21143c.f21148c.f21142g);
            f fVar2 = eVar.f21143c;
            fVar2.getClass();
            if (fVar2.f21148c.f21140e != null) {
                p024b9.g gVar = new p024b9.g(eVar, 3);
                Handler handler = p092g2.b.f36837a;
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    gVar.run();
                } else {
                    p092g2.b.f36837a.postDelayed(gVar, 0L);
                }
            }
            Object[] objArr2 = new Object[0];
            if (p092g2.c.c()) {
                p092g2.c.a("Request finish ------------------------------------------------------------", objArr2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void c(d dVar, String str) {
        if (dVar == null) {
            return;
        }
        try {
            String str2 = dVar.f21142g;
            e eVar = str2 == null || str2.length() == 0 ? null : (e) f21145f.get(str2);
            if (eVar != null) {
                if (eVar.f21143c.f21148c.f21142g.equals(str2)) {
                    if (eVar.f21143c.f21146a.size() > 1) {
                        Object[] objArr = {str2};
                        if (p092g2.c.c()) {
                            p092g2.c.a("be careful, all request \"%s\" will be cleared", objArr);
                        }
                    }
                    for (String str3 : eVar.f21143c.f21146a.keySet()) {
                        if (!eVar.f21143c.f21147b.containsKey(str3)) {
                            a(str3, str);
                        }
                    }
                } else {
                    a(str2, str);
                }
                if (eVar.f21143c.f21147b.size() == eVar.f21143c.f21146a.size()) {
                    b(eVar);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
