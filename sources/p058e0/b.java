package p058e0;

import androidx.core.util.Pools$SimplePool;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Pools$SimplePool {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f35985c;

    public b(int i7) {
        super(i7);
        this.f35985c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, androidx.core.util.Pools$Pool
    public final Object acquire() {
        Object objAcquire;
        synchronized (this.f35985c) {
            objAcquire = super.acquire();
        }
        return objAcquire;
    }

    @Override // androidx.core.util.Pools$SimplePool, androidx.core.util.Pools$Pool
    public final boolean release(Object instance) {
        boolean zRelease;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f35985c) {
            zRelease = super.release(instance);
        }
        return zRelease;
    }
}
