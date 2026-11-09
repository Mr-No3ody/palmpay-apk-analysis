package La;

import Ad.C0058e;
import Fe.C0259g;
import Fe.h0;
import com.transsnet.palmpay.core.bean.req.BindBankCardReq;
import com.transsnet.palmpay.core.bean.req.CheckBankCardInfoReq;
import com.transsnet.palmpay.core.bean.req.CheckCardBindNumReq;
import com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IPresenter;
import com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends r implements AddNewCardContract$IPresenter {
    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IPresenter
    public final void bindBankCard(BindBankCardReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        AddNewCardContract$IView addNewCardContract$IView = (AddNewCardContract$IView) this.f27351a;
        if (addNewCardContract$IView != null) {
            addNewCardContract$IView.showLoadingView(true);
        }
        J3.a.B(this, this.f27351a, new Ae.j(req, 25), new j(this, 4), new j(this, 5), false, false);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IPresenter
    public final void checkCardBindNum(CheckCardBindNumReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        J3.a.B(this, this.f27351a, new Ae.j(req, 24), new j(this, 2), new h0(5), false, true);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IPresenter
    public final void checkInputBankCardInfo(CheckBankCardInfoReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        J3.a.B(this, this.f27351a, new Ae.j(req, 26), new C0058e(10, this, req), new h0(2), false, true);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IPresenter
    public final void getBankInfoByCardNo(String str) {
        J3.a.B(this, this.f27351a, new C0259g(str, 1), new j(this, 1), new h0(4), true, false);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IPresenter
    public final void getBindBankCardTips() {
        J3.a.B(this, this.f27351a, new i(1), new j(this, 6), new h0(7), false, false);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IPresenter
    public final void getFundActivityConfig() {
        J3.a.B(this, this.f27351a, new i(0), new j(this, 0), new h0(3), false, false);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.AddNewCardContract$IPresenter
    public final void queryPaymentMethod() {
        J3.a.B(this, this.f27351a, new G9.j(29), new j(this, 3), new h0(6), true, false);
    }
}
