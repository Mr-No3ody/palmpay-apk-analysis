package retrofit2;

import Wf.C0765i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: retrofit2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1996n extends AbstractC1997o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CallAdapter f41938d;

    public C1996n(J j6, okhttp3.Call.Factory factory, Converter converter, CallAdapter callAdapter) {
        super(j6, factory, converter);
        this.f41938d = callAdapter;
    }

    @Override // retrofit2.AbstractC1997o
    public final Object b(C2002u c2002u, Object[] objArr) {
        Call call = (Call) this.f41938d.adapt(c2002u);
        Continuation frame = (Continuation) objArr[objArr.length - 1];
        try {
            C0765i c0765i = new C0765i(1, Ef.f.b(frame));
            c0765i.initCancellability();
            c0765i.invokeOnCancellation(new C1999q(call, 2));
            call.enqueue(new org.greenrobot.eventbus.f(c0765i, 20));
            Object objM = c0765i.m();
            if (objM == Ef.a.f2423a) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objM;
        } catch (Exception e10) {
            U.r(frame, e10);
            return Ef.a.f2423a;
        }
    }
}
