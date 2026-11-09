package androidx.camera.core.impl.utils.futures;

import Ab.r;
import E.AbstractC0198c;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static m a(List list) {
        return new m(new ArrayList(list), true, org.chromium.support_lib_boundary.util.b.u());
    }

    public static Object b(ListenableFuture listenableFuture) {
        p118hf.a.k(listenableFuture.isDone(), "Future was expected to be done, " + listenableFuture);
        return c(listenableFuture);
    }

    public static Object c(Future future) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static l d(Object obj) {
        return obj == null ? l.f14212c : new l(obj, 0);
    }

    public static ListenableFuture e(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        return listenableFuture.isDone() ? listenableFuture : AbstractC0198c.y(new d(listenableFuture, 0));
    }

    public static void f(ListenableFuture listenableFuture, androidx.concurrent.futures.k kVar) {
        g(true, listenableFuture, kVar, org.chromium.support_lib_boundary.util.b.u());
    }

    public static void g(boolean z3, ListenableFuture listenableFuture, androidx.concurrent.futures.k kVar, androidx.camera.core.impl.utils.executor.a aVar) {
        listenableFuture.getClass();
        kVar.getClass();
        aVar.getClass();
        listenableFuture.addListener(new i(0, listenableFuture, new r(kVar, 11)), aVar);
        if (z3) {
            kVar.a(new B5.c(listenableFuture, 27), org.chromium.support_lib_boundary.util.b.u());
        }
    }

    public static m h(ArrayList arrayList) {
        return new m(new ArrayList(arrayList), false, org.chromium.support_lib_boundary.util.b.u());
    }

    public static a i(ListenableFuture listenableFuture, AsyncFunction asyncFunction, Executor executor) {
        a aVar = new a(asyncFunction, listenableFuture);
        listenableFuture.addListener(aVar, executor);
        return aVar;
    }
}
