package Wf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class Z extends AbstractC0761e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10833f = AtomicIntegerFieldUpdater.newUpdater(Z.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f10834e;

    public Z(Function1 function1) {
        this.f10834e = function1;
    }

    @Override // Wf.AbstractC0761e0
    public final boolean g() {
        return true;
    }

    @Override // Wf.AbstractC0761e0
    public final void h(Throwable th) {
        if (f10833f.compareAndSet(this, 0, 1)) {
            this.f10834e.invoke(th);
        }
    }
}
