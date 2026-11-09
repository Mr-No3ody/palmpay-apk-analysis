package Fe;

import com.transsnet.palmpay.ui.mvp.contract.PersonalActivityContract;

/* JADX INFO: loaded from: classes4.dex */
public final class Y extends com.transsnet.palmpay.core.base.j implements PersonalActivityContract.Presenter {
    static {
        new V(null);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PersonalActivityContract.Presenter
    public final void checkUpdateNameLimit() {
        J3.a.D(this, this.f27351a, new W(1, null), new U(this, 1), new Ab.B(25), false, true);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.PersonalActivityContract.Presenter
    public final void loadPersonalInfo() {
        J3.a.D(this, this.f27351a, new X(1, null), new U(this, 0), new Ab.B(24), false, false);
    }
}
