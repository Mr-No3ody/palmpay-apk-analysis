package C9;

import com.transsnet.palmpay.cash_in.bean.response.UssdLastOrderResp;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeActivity;
import com.transsnet.palmpay.cash_in.ui.dialog.FundUSSDCompleteLastOrderDialog;
import com.transsnet.palmpay.cash_in.ui.viewmodel.FundViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C9.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0156x implements FundUSSDCompleteLastOrderDialog.DialUssdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RechargeActivity f1337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UssdLastOrderResp f1338b;

    public C0156x(RechargeActivity rechargeActivity, UssdLastOrderResp ussdLastOrderResp) {
        this.f1337a = rechargeActivity;
        this.f1338b = ussdLastOrderResp;
    }

    @Override // com.transsnet.palmpay.cash_in.ui.dialog.FundUSSDCompleteLastOrderDialog.DialUssdCallback
    public final void dialUssd() {
        String str = RechargeActivity.f26858r0;
        FundViewModel fundViewModel = (FundViewModel) this.f1337a.l();
        String orderNo = this.f1338b.orderNo;
        if (orderNo == null) {
            orderNo = "";
        }
        fundViewModel.getClass();
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        p140j8.f.s(fundViewModel, new J9.l(orderNo, null), fundViewModel.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
