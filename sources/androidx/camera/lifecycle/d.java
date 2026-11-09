package androidx.camera.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f14524a;

    public /* synthetic */ d(h hVar) {
        this.f14524a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h this$0 = this.f14524a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.unbindAll();
        b bVar = this$0.f14533e;
        synchronized (bVar.f14518a) {
            try {
                Iterator it = new HashSet(bVar.f14520c.keySet()).iterator();
                while (it.hasNext()) {
                    bVar.l(((LifecycleCameraRepository$LifecycleCameraRepositoryObserver) it.next()).f14515b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
