package com.didi.drouter.router;

import com.didi.drouter.store.IRouterProxy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M.f f21134a = new M.f(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M.f f21135b = new M.f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M.g f21136c = new M.g(0);

    static {
        p075f2.c.a();
        Iterator it = p075f2.c.f36373b.entrySet().iterator();
        while (it.hasNext()) {
            ((p075f2.b) ((Map.Entry) it.next()).getValue()).getClass();
        }
    }

    public static IRouterInterceptor a(Class cls) {
        IRouterInterceptor iRouterInterceptor;
        M.f fVar = f21134a;
        IRouterInterceptor iRouterInterceptor2 = (IRouterInterceptor) fVar.get(cls);
        if (iRouterInterceptor2 == null) {
            M.f fVar2 = f21135b;
            if (fVar2.containsKey(cls)) {
                iRouterInterceptor2 = (IRouterInterceptor) ((WeakReference) fVar2.get(cls)).get();
            }
        }
        if (iRouterInterceptor2 != null) {
            return iRouterInterceptor2;
        }
        synchronized (c.class) {
            try {
                iRouterInterceptor = (IRouterInterceptor) fVar.get(cls);
                if (iRouterInterceptor == null) {
                    M.f fVar3 = f21135b;
                    if (fVar3.containsKey(cls)) {
                        iRouterInterceptor = (IRouterInterceptor) ((WeakReference) fVar3.get(cls)).get();
                    }
                }
                if (iRouterInterceptor == null) {
                    p075f2.c.a();
                    ConcurrentHashMap concurrentHashMap = p075f2.c.f36373b;
                    p075f2.b bVarB = (p075f2.b) concurrentHashMap.get(cls);
                    if (bVarB == null) {
                        bVarB = p075f2.b.b(5);
                        bVarB.f36366b = cls;
                        bVarB.f36367c = null;
                        bVarB.f36368d = 0;
                        p075f2.c.a();
                        concurrentHashMap.put(cls, bVarB);
                    }
                    IRouterProxy iRouterProxy = bVarB.f36367c;
                    IRouterInterceptor iRouterInterceptor3 = iRouterProxy != null ? (IRouterInterceptor) iRouterProxy.newInstance(null) : null;
                    iRouterInterceptor = iRouterInterceptor3 == null ? (IRouterInterceptor) p092g2.c.b(cls, new Object[0]) : iRouterInterceptor3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iRouterInterceptor;
    }
}
