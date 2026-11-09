package p042cg;

import Wf.AbstractC0774s;
import kotlin.coroutines.CoroutineContext;
import p015ag.a;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends AbstractC0774s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f19023c = new m();

    @Override // Wf.AbstractC0774s
    public final void a(CoroutineContext coroutineContext, Runnable runnable) {
        f.f19011d.f19013c.b(runnable, true, false);
    }

    @Override // Wf.AbstractC0774s
    public final void b(CoroutineContext coroutineContext, Runnable runnable) {
        f.f19011d.f19013c.b(runnable, true, true);
    }

    @Override // Wf.AbstractC0774s
    public final AbstractC0774s d(int i7) {
        a.a(i7);
        return i7 >= l.f19020d ? this : super.d(i7);
    }

    @Override // Wf.AbstractC0774s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
