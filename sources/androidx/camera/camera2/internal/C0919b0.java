package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0919b0 implements CallbackToFutureAdapter$Resolver, AsyncFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0923d0 f13348b;

    public /* synthetic */ C0919b0(C0923d0 c0923d0, int i7) {
        this.f13347a = i7;
        this.f13348b = c0923d0;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        switch (this.f13347a) {
            case 1:
                return this.f13348b.f13497a.f13610h.c(true);
            case 2:
                return AbstractC0198c.y(new C0919b0(this.f13348b, 0));
            case 3:
                K0 k2 = this.f13348b.f13497a.f13610h;
                k2.getClass();
                return AbstractC0198c.y(new F0(k2, 1));
            default:
                W w3 = new W(1);
                C0923d0 c0923d0 = this.f13348b;
                long millis = TimeUnit.NANOSECONDS.toMillis(C0923d0.f13495f);
                C0917a0 c0917a0 = new C0917a0(w3);
                C0944o c0944o = c0923d0.f13497a;
                c0944o.a(c0917a0);
                RunnableC0934j runnableC0934j = new RunnableC0934j(6, c0944o, c0917a0);
                androidx.camera.core.impl.utils.executor.i iVar = c0944o.f13605c;
                androidx.concurrent.futures.m mVar = c0917a0.f13339b;
                mVar.addListener(runnableC0934j, iVar);
                return AbstractC0198c.y(new androidx.camera.core.impl.utils.futures.c(mVar, c0923d0.f13499c, millis, 1));
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.k kVar) {
        C0923d0 c0923d0 = this.f13348b;
        if (!c0923d0.f13501e.d()) {
            kVar.b(null);
            return "EnableTorchInternal";
        }
        p140j8.f.G("Camera2CapturePipeline");
        c0923d0.f13497a.c(true);
        kVar.b(null);
        return "EnableTorchInternal";
    }
}
