package androidx.work.impl;

import C0.C0126s;
import V0.EnumC0698q;
import Wf.C0765i;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18385a;

    static {
        String strD = V0.C.d("WorkerWrapper");
        Intrinsics.checkNotNullExpressionValue(strD, "tagWithPrefix(\"WorkerWrapper\")");
        f18385a = strD;
    }

    public static final Object a(ListenableFuture listenableFuture, V0.B b7, Ff.h frame) {
        try {
            if (listenableFuture.isDone()) {
                return b(listenableFuture);
            }
            C0765i c0765i = new C0765i(1, Ef.f.b(frame));
            c0765i.initCancellability();
            listenableFuture.addListener(new androidx.concurrent.futures.p(listenableFuture, c0765i, 1), EnumC0698q.f9962a);
            c0765i.invokeOnCancellation(new C0126s(5, b7, listenableFuture));
            Object objM = c0765i.m();
            if (objM == Ef.a.f2423a) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objM;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            Intrinsics.e(cause);
            throw cause;
        }
    }

    public static final Object b(Future future) {
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
}
