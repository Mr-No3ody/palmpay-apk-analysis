package Wf;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class A0 extends AbstractC0774s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10799c = 0;

    static {
        new A0();
    }

    @Override // Wf.AbstractC0774s
    public final void a(CoroutineContext coroutineContext, Runnable runnable) {
        E0 e10 = (E0) coroutineContext.get(E0.f10805c);
        if (e10 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        e10.f10806b = true;
    }

    @Override // Wf.AbstractC0774s
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
