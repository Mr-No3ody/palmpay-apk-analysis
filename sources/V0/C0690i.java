package V0;

import Wf.AbstractC0774s;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: V0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0690i extends AbstractC0774s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0690i f9949c = new C0690i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p042cg.f f9950d = Wf.I.f10809a;

    @Override // Wf.AbstractC0774s
    public final void a(CoroutineContext context, Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        f9950d.a(context, block);
    }

    @Override // Wf.AbstractC0774s
    public final boolean c(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        f9950d.getClass();
        return !false;
    }
}
