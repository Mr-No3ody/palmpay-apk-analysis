package androidx.lifecycle;

import Wf.AbstractC0774s;
import java.util.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class G extends AbstractC0774s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V7.g f17346c;

    public G() {
        V7.g gVar = new V7.g();
        gVar.f10096a = true;
        gVar.f10099d = new ArrayDeque();
        this.f17346c = gVar;
    }

    @Override // Wf.AbstractC0774s
    public final void a(CoroutineContext context, Runnable runnable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runnable, "block");
        V7.g gVar = this.f17346c;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        p042cg.f fVar = Wf.I.f10809a;
        Xf.d dVar = ((Xf.d) p015ag.o.f11960a).f11224e;
        if (!dVar.c(context)) {
            if (!(gVar.f10097b || !gVar.f10096a)) {
                if (!((ArrayDeque) gVar.f10099d).offer(runnable)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                gVar.b();
                return;
            }
        }
        dVar.a(context, new androidx.camera.video.internal.encoder.o(12, gVar, runnable));
    }

    @Override // Wf.AbstractC0774s
    public final boolean c(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        p042cg.f fVar = Wf.I.f10809a;
        if (((Xf.d) p015ag.o.f11960a).f11224e.c(context)) {
            return true;
        }
        V7.g gVar = this.f17346c;
        return !(gVar.f10097b || !gVar.f10096a);
    }
}
