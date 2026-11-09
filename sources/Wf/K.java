package Wf;

import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends AbstractC0761e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10812f;

    public /* synthetic */ K(Object obj, int i7) {
        this.f10811e = i7;
        this.f10812f = obj;
    }

    @Override // Wf.AbstractC0761e0
    public final boolean g() {
        switch (this.f10811e) {
        }
        return false;
    }

    @Override // Wf.AbstractC0761e0
    public final void h(Throwable th) {
        Object obj = this.f10812f;
        switch (this.f10811e) {
            case 0:
                ((DisposableHandle) obj).dispose();
                break;
            case 1:
                ((Function1) obj).invoke(th);
                break;
            default:
                Object obj2 = n0.f10888a.get(f());
                f0 f0Var = (f0) obj;
                if (!(obj2 instanceof C0771o)) {
                    p355xf.o oVar = p355xf.q.f43977a;
                    f0Var.resumeWith(AbstractC0780y.r(obj2));
                } else {
                    p355xf.o oVar2 = p355xf.q.f43977a;
                    f0Var.resumeWith(androidx.camera.core.impl.utils.executor.g.f(((C0771o) obj2).f10891a));
                }
                break;
        }
    }
}
