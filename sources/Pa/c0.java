package Pa;

import com.transsnet.palmpay.core.callback.Argument0Callback;
import com.transsnet.palmpay.core.callback.Argument1Callback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Argument0Callback, Argument1Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f7077b;

    public /* synthetic */ c0(g0 g0Var, int i7) {
        this.f7076a = i7;
        this.f7077b = g0Var;
    }

    @Override // com.transsnet.palmpay.core.callback.Argument1Callback
    public void invoke(Object obj) {
        p038ca.a settingsLauncher = (p038ca.a) obj;
        Intrinsics.checkNotNullParameter(settingsLauncher, "settingsLauncher");
        this.f7077b.d(settingsLauncher);
    }

    @Override // com.transsnet.palmpay.core.callback.Argument0Callback
    public void invoke() {
        switch (this.f7076a) {
            case 0:
                this.f7077b.b();
                break;
            default:
                this.f7077b.d(null);
                break;
        }
    }
}
