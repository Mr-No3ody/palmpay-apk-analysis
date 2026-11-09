package Wf;

import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;

/* JADX INFO: renamed from: Wf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0768l extends AbstractC0761e0 implements ChildHandle {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ChildJob f10880e;

    public C0768l(ChildJob childJob) {
        this.f10880e = childJob;
    }

    @Override // kotlinx.coroutines.ChildHandle
    public final boolean childCancelled(Throwable th) {
        return f().h(th);
    }

    @Override // Wf.AbstractC0761e0
    public final boolean g() {
        return true;
    }

    @Override // Wf.AbstractC0761e0
    public final void h(Throwable th) {
        this.f10880e.parentCancelled(f());
    }
}
