package androidx.camera.core.impl.utils.futures;

import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements CallbackToFutureAdapter$Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListenableFuture f14200b;

    public /* synthetic */ d(ListenableFuture listenableFuture, int i7) {
        this.f14199a = i7;
        this.f14200b = listenableFuture;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object attachCompleter(androidx.concurrent.futures.k kVar) {
        switch (this.f14199a) {
            case 0:
                androidx.camera.core.impl.utils.executor.a aVarU = org.chromium.support_lib_boundary.util.b.u();
                ListenableFuture listenableFuture = this.f14200b;
                j.g(false, listenableFuture, kVar, aVarU);
                return "nonCancellationPropagating[" + listenableFuture + "]";
            default:
                g gVar = new g(0, kVar);
                androidx.camera.core.impl.utils.executor.a aVarU2 = org.chromium.support_lib_boundary.util.b.u();
                ListenableFuture listenableFuture2 = this.f14200b;
                listenableFuture2.addListener(gVar, aVarU2);
                return "transformVoidFuture [" + listenableFuture2 + "]";
        }
    }
}
