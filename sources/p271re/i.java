package p271re;

import android.text.TextUtils;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.dialog.SelectPayMethodDialog;
import com.transsnet.palmpay.ui.activity.qr.QrCodePayMoneyFragment;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements SelectPayMethodDialog.CallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ QrCodePayMoneyFragment f41797a;

    public i(QrCodePayMoneyFragment qrCodePayMoneyFragment) {
        this.f41797a = qrCodePayMoneyFragment;
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onAddNewBankCardClick() {
        QrCodePayMoneyFragment qrCodePayMoneyFragment = this.f41797a;
        qrCodePayMoneyFragment.getClass();
        d.F("/coreImpl/add_new_card");
        qrCodePayMoneyFragment.f34886L.dismiss();
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onChoosePayMethodClick(PaymentMethod paymentMethod, PreviewPayInfoResp.DataBean dataBean) {
        QrCodePayMoneyFragment qrCodePayMoneyFragment = this.f41797a;
        qrCodePayMoneyFragment.f34888Q = paymentMethod;
        qrCodePayMoneyFragment.f34886L.dismiss();
        PaymentMethod paymentMethod2 = qrCodePayMoneyFragment.f34888Q;
        if (paymentMethod2 != null) {
            qrCodePayMoneyFragment.t.setPaymentMethod(paymentMethod2);
            qrCodePayMoneyFragment.u();
            if (TextUtils.isEmpty(qrCodePayMoneyFragment.f34888Q.accountId)) {
                return;
            }
            String value = !TextUtils.isEmpty(qrCodePayMoneyFragment.f34888Q.accountId) ? qrCodePayMoneyFragment.f34888Q.accountId : "";
            Intrinsics.checkNotNullParameter("main_sp_qr_default_pm_accountid", "key");
            Intrinsics.checkNotNullParameter(value, "value");
            SPUtils.getInstance(a.G("main_sp_qr_default_pm_accountid")).put(p367ya.a.d().e("main_sp_qr_default_pm_accountid"), value);
        }
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onAddNewBankAccountClick() {
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onAddNewBankCardOrBankAccountClick() {
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onUseUSSDClick() {
    }
}
