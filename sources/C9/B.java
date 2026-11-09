package C9;

import com.transsnet.palmpay.cash_in.ui.activity.RechargeUSSDResultActivity;
import com.transsnet.palmpay.core.dialog.PaymentRewardsDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class B implements PaymentRewardsDialog.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RechargeUSSDResultActivity f1250a;

    public B(RechargeUSSDResultActivity rechargeUSSDResultActivity) {
        this.f1250a = rechargeUSSDResultActivity;
    }

    @Override // com.transsnet.palmpay.core.dialog.PaymentRewardsDialog.Callback
    public final void onCancelClick() {
        RechargeUSSDResultActivity rechargeUSSDResultActivity = this.f1250a;
        PaymentRewardsDialog paymentRewardsDialog = rechargeUSSDResultActivity.f26895o;
        Intrinsics.e(paymentRewardsDialog);
        paymentRewardsDialog.dismiss();
        rechargeUSSDResultActivity.f26894j = true;
        rechargeUSSDResultActivity.finish();
    }

    @Override // com.transsnet.palmpay.core.dialog.PaymentRewardsDialog.Callback
    public final void onConfirmClick() {
        PaymentRewardsDialog paymentRewardsDialog = this.f1250a.f26895o;
        Intrinsics.e(paymentRewardsDialog);
        paymentRewardsDialog.dismiss();
    }
}
