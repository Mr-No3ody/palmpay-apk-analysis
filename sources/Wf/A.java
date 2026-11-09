package Wf;

import kotlin.coroutines.ContinuationInterceptor;
import kotlinx.coroutines.Delay;

/* JADX INFO: loaded from: classes4.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Delay f10798a;

    static {
        String property;
        Delay delay;
        int i7 = p015ag.u.f11966a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            p042cg.f fVar = I.f10809a;
            ContinuationInterceptor continuationInterceptor = p015ag.o.f11960a;
            Xf.d dVar = ((Xf.d) continuationInterceptor).f11224e;
            delay = !(continuationInterceptor instanceof Delay) ? RunnableC0781z.f10920o : (Delay) continuationInterceptor;
        } else {
            delay = RunnableC0781z.f10920o;
        }
        f10798a = delay;
    }
}
