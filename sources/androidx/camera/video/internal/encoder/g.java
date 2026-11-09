package androidx.camera.video.internal.encoder;

import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements CallbackToFutureAdapter$Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14674b;

    public /* synthetic */ g(AtomicReference atomicReference, int i7) {
        this.f14673a = i7;
        this.f14674b = atomicReference;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public final Object attachCompleter(androidx.concurrent.futures.k kVar) {
        switch (this.f14673a) {
            case 0:
                this.f14674b.set(kVar);
                return "Data closed";
            case 1:
                this.f14674b.set(kVar);
                return "acquireInputBuffer";
            case 2:
                this.f14674b.set(kVar);
                return "mReleasedFuture";
            default:
                this.f14674b.set(kVar);
                return "Terminate InputBuffer";
        }
    }
}
