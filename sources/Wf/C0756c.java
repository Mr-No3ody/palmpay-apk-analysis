package Wf;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: renamed from: Wf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0756c extends AbstractC0761e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10839i = AtomicReferenceFieldUpdater.newUpdater(C0756c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0765i f10840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DisposableHandle f10841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0760e f10842g;

    public C0756c(C0760e c0760e, C0765i c0765i) {
        this.f10842g = c0760e;
        this.f10840e = c0765i;
    }

    @Override // Wf.AbstractC0761e0
    public final boolean g() {
        return false;
    }

    @Override // Wf.AbstractC0761e0
    public final void h(Throwable th) {
        C0765i c0765i = this.f10840e;
        if (th != null) {
            Object objTryResumeWithException = c0765i.tryResumeWithException(th);
            if (objTryResumeWithException != null) {
                c0765i.completeResume(objTryResumeWithException);
                C0758d c0758d = (C0758d) f10839i.get(this);
                if (c0758d != null) {
                    c0758d.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0760e.f10846b;
        C0760e c0760e = this.f10842g;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0760e) == 0) {
            Deferred[] deferredArr = c0760e.f10847a;
            ArrayList arrayList = new ArrayList(deferredArr.length);
            for (Deferred deferred : deferredArr) {
                arrayList.add(deferred.getCompleted());
            }
            p355xf.o oVar = p355xf.q.f43977a;
            c0765i.resumeWith(arrayList);
        }
    }
}
