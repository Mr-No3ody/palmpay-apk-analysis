package Wf;

import kotlin.Unit;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends AbstractC0761e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SelectInstance f10869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0 f10870g;

    public /* synthetic */ i0(n0 n0Var, SelectInstance selectInstance, int i7) {
        this.f10868e = i7;
        this.f10870g = n0Var;
        this.f10869f = selectInstance;
    }

    @Override // Wf.AbstractC0761e0
    public final boolean g() {
        switch (this.f10868e) {
        }
        return false;
    }

    @Override // Wf.AbstractC0761e0
    public final void h(Throwable th) {
        switch (this.f10868e) {
            case 0:
                n0 n0Var = this.f10870g;
                n0Var.getClass();
                Object objR = n0.f10888a.get(n0Var);
                if (!(objR instanceof C0771o)) {
                    objR = AbstractC0780y.r(objR);
                }
                this.f10869f.trySelect(n0Var, objR);
                break;
            default:
                this.f10869f.trySelect(this.f10870g, Unit.f38893a);
                break;
        }
    }
}
