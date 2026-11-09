package C9;

import Pa.r0;
import com.transsnet.palmpay.cash_in.ui.activity.ConfirmAndPayWithdrawOrderActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.payment.PaymentFeeDetail;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.core.viewmodel.ModelUsePointsWithSwitch;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: renamed from: C9.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0147n extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ConfirmAndPayWithdrawOrderActivity f1319f;

    public C0147n(ConfirmAndPayWithdrawOrderActivity confirmAndPayWithdrawOrderActivity) {
        this.f1319f = confirmAndPayWithdrawOrderActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f1319f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
        this.f1319f.showLoadingDialog(false);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PreviewPayInfoResp previewPayInfoResp = (PreviewPayInfoResp) obj;
        PreviewPayInfoResp.DataBean data = previewPayInfoResp.getData();
        ConfirmAndPayWithdrawOrderActivity confirmAndPayWithdrawOrderActivity = this.f1319f;
        if (data != null) {
            PreviewPayInfoResp.DataBean data2 = previewPayInfoResp.getData();
            confirmAndPayWithdrawOrderActivity.f26836M = data2;
            confirmAndPayWithdrawOrderActivity.f573d = data2.payAmount;
            confirmAndPayWithdrawOrderActivity.f26839g.setText(confirmAndPayWithdrawOrderActivity.getString(p025ba.k.core_withdraw_amount, BaseApplication.getCurrencySymbol(), r0.A(confirmAndPayWithdrawOrderActivity.f26836M.payAmount)));
            PreviewPayInfoResp.DataBean dataBean = confirmAndPayWithdrawOrderActivity.f26836M;
            if (dataBean == null) {
                confirmAndPayWithdrawOrderActivity.f26840i.setAmount(confirmAndPayWithdrawOrderActivity.f26833C);
            } else {
                long j6 = dataBean.payAmount;
                confirmAndPayWithdrawOrderActivity.f573d = j6;
                confirmAndPayWithdrawOrderActivity.f26840i.setAmount(j6);
                ModelItemFee modelItemFee = confirmAndPayWithdrawOrderActivity.f26843p;
                PreviewPayInfoResp.DataBean dataBean2 = confirmAndPayWithdrawOrderActivity.f26836M;
                modelItemFee.e(dataBean2.fee, dataBean2.vat);
                PreviewPayInfoResp.DataBean dataBean3 = confirmAndPayWithdrawOrderActivity.f26836M;
                if (dataBean3.fee + dataBean3.vat > 0) {
                    confirmAndPayWithdrawOrderActivity.f26843p.setVisibility(0);
                } else {
                    confirmAndPayWithdrawOrderActivity.f26843p.setVisibility(8);
                }
                PaymentFeeDetail paymentFeeDetail = confirmAndPayWithdrawOrderActivity.f26836M.feeDetail;
                if (paymentFeeDetail != null) {
                    confirmAndPayWithdrawOrderActivity.f26843p.setFeeDetails(paymentFeeDetail);
                }
                confirmAndPayWithdrawOrderActivity.f26839g.setText(confirmAndPayWithdrawOrderActivity.getString(p366y9.d.ci_withdraw_amount, BaseApplication.getCurrencySymbol(), r0.A(confirmAndPayWithdrawOrderActivity.f26836M.payAmount)));
                confirmAndPayWithdrawOrderActivity.t.setContent(confirmAndPayWithdrawOrderActivity.f26836M.returnPoint + "");
                confirmAndPayWithdrawOrderActivity.f26845w.setPointExchangeRate(confirmAndPayWithdrawOrderActivity.f26836M.exchangeRate);
                if (confirmAndPayWithdrawOrderActivity.f26845w.f28430j.isChecked()) {
                    ModelUsePointsWithSwitch modelUsePointsWithSwitch = confirmAndPayWithdrawOrderActivity.f26845w;
                    PreviewPayInfoResp.DataBean dataBean4 = confirmAndPayWithdrawOrderActivity.f26836M;
                    modelUsePointsWithSwitch.f(dataBean4.deductionPoint, r0.A(dataBean4.deductionPointAmount));
                } else {
                    confirmAndPayWithdrawOrderActivity.f26845w.f(0L, "0");
                }
                if (confirmAndPayWithdrawOrderActivity.f26836M.deductionPointAmount <= 0) {
                    confirmAndPayWithdrawOrderActivity.f26845w.setVisibility(8);
                } else {
                    confirmAndPayWithdrawOrderActivity.f26845w.setVisibility(0);
                }
                if (confirmAndPayWithdrawOrderActivity.f26836M.returnPoint <= 0) {
                    confirmAndPayWithdrawOrderActivity.t.setVisibility(8);
                } else {
                    confirmAndPayWithdrawOrderActivity.t.setVisibility(0);
                }
                confirmAndPayWithdrawOrderActivity.f26832B.a(confirmAndPayWithdrawOrderActivity.f26836M.earlyRefundEnable);
            }
            confirmAndPayWithdrawOrderActivity.f26839g.setEnabled(true);
        } else {
            ToastUtils.showShort("server return null");
        }
        confirmAndPayWithdrawOrderActivity.showLoadingDialog(false);
    }
}
