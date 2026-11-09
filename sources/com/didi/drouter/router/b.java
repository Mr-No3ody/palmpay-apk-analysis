package com.didi.drouter.router;

import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static void a(PriorityQueue priorityQueue, d dVar, IRouterInterceptor.IInterceptor iInterceptor) {
        IRouterInterceptor iRouterInterceptor = (IRouterInterceptor) priorityQueue.poll();
        if (iRouterInterceptor == null) {
            Object[] objArr = {dVar.f21142g};
            if (p092g2.c.c()) {
                p092g2.c.a("<< Pass request \"%s\" interceptors", objArr);
            }
            iInterceptor.onContinue();
            return;
        }
        p075f2.c.a();
        p075f2.b bVar = (p075f2.b) p075f2.c.f36373b.get(iRouterInterceptor.getClass());
        String simpleName = iRouterInterceptor.getClass().getSimpleName();
        String str = dVar.f21142g;
        bVar.getClass();
        Object[] objArr2 = {simpleName, str, Boolean.FALSE, Integer.valueOf(bVar.f36368d)};
        if (p092g2.c.c()) {
            p092g2.c.a("interceptor \"%s\" execute, for request \"%s\", global:%s, priority:%s", objArr2);
        }
        iRouterInterceptor.handle(dVar);
    }
}
