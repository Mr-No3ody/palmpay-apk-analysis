package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0925e0 implements CallbackToFutureAdapter$Resolver, AsyncFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0927f0 f13504b;

    public /* synthetic */ C0925e0(C0927f0 c0927f0, int i7) {
        this.f13503a = i7;
        this.f13504b = c0927f0;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        switch (this.f13503a) {
            case 1:
                C0927f0 c0927f0 = this.f13504b;
                if (!c0927f0.f13521f) {
                    return androidx.camera.core.impl.utils.futures.l.f14212c;
                }
                K0 k2 = c0927f0.f13516a.f13610h;
                k2.getClass();
                return AbstractC0198c.y(new F0(k2, 1));
            default:
                W w3 = new W(2);
                C0927f0 c0927f1 = this.f13504b;
                long millis = TimeUnit.NANOSECONDS.toMillis(C0927f0.f13514g);
                C0917a0 c0917a0 = new C0917a0(w3);
                C0944o c0944o = c0927f1.f13516a;
                c0944o.a(c0917a0);
                RunnableC0934j runnableC0934j = new RunnableC0934j(6, c0944o, c0917a0);
                androidx.camera.core.impl.utils.executor.i iVar = c0944o.f13605c;
                androidx.concurrent.futures.m mVar = c0917a0.f13339b;
                mVar.addListener(runnableC0934j, iVar);
                return AbstractC0198c.y(new androidx.camera.core.impl.utils.futures.c(mVar, c0927f1.f13520e, millis, 1));
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.k kVar) {
        this.f13504b.f13516a.f13612j.a(kVar, true);
        return "TorchOn";
    }
}
