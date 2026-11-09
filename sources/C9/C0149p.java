package C9;

import Pa.r0;
import android.text.TextUtils;
import com.transsnet.palmpay.cash_in.bean.request.CreateCashOutOrderReq;
import com.transsnet.palmpay.cash_in.network.IRechargeService;
import com.transsnet.palmpay.cash_in.ui.activity.ConfirmAndPayWithdrawOrderActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: renamed from: C9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0149p extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ConfirmAndPayWithdrawOrderActivity f1321f;

    public C0149p(ConfirmAndPayWithdrawOrderActivity confirmAndPayWithdrawOrderActivity) {
        this.f1321f = confirmAndPayWithdrawOrderActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f1321f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        QueryLimitAmountResp.DataBean dataBean;
        QueryLimitAmountResp queryLimitAmountResp = (QueryLimitAmountResp) obj;
        if (queryLimitAmountResp == null || (dataBean = queryLimitAmountResp.data) == null) {
            return;
        }
        ConfirmAndPayWithdrawOrderActivity confirmAndPayWithdrawOrderActivity = this.f1321f;
        if (confirmAndPayWithdrawOrderActivity.f26833C > dataBean.getMaxAmount()) {
            ToastUtils.showLong(confirmAndPayWithdrawOrderActivity.getString(p025ba.k.core_msg_amount_below_desc, r0.B(queryLimitAmountResp.data.getMaxAmount(), true)));
            confirmAndPayWithdrawOrderActivity.showLoadingDialog(false);
            return;
        }
        if (confirmAndPayWithdrawOrderActivity.f26833C < queryLimitAmountResp.data.getMinAmount()) {
            ToastUtils.showLong(confirmAndPayWithdrawOrderActivity.getString(p025ba.k.core_msg_amount_above_desc, r0.B(queryLimitAmountResp.data.getMinAmount(), true)));
            confirmAndPayWithdrawOrderActivity.showLoadingDialog(false);
            return;
        }
        if (!TextUtils.isEmpty(confirmAndPayWithdrawOrderActivity.f26837Q)) {
            confirmAndPayWithdrawOrderActivity.f574e = confirmAndPayWithdrawOrderActivity.f26837Q;
            confirmAndPayWithdrawOrderActivity.m();
            return;
        }
        CreateCashOutOrderReq createCashOutOrderReq = new CreateCashOutOrderReq();
        createCashOutOrderReq.currency = BaseApplication.getCurrency();
        createCashOutOrderReq.orderTitle = "title";
        createCashOutOrderReq.payerAccountId = confirmAndPayWithdrawOrderActivity.f26834H.getBalanceAccountId();
        createCashOutOrderReq.payerMemberId = confirmAndPayWithdrawOrderActivity.f26834H.getMemberId();
        createCashOutOrderReq.totalAmount = confirmAndPayWithdrawOrderActivity.f26833C;
        createCashOutOrderReq.remark = confirmAndPayWithdrawOrderActivity.f26835L;
        if (BaseApplication.isAO()) {
            createCashOutOrderReq.payerAccountType = 1;
            createCashOutOrderReq.payeeAccountType = 6;
        }
        createCashOutOrderReq.payeeName = confirmAndPayWithdrawOrderActivity.f26834H.getFullName();
        PreviewPayInfoResp.DataBean dataBean2 = confirmAndPayWithdrawOrderActivity.f26836M;
        if (dataBean2 != null) {
            createCashOutOrderReq.loyaltyPoint = dataBean2.deductionPoint;
            createCashOutOrderReq.loyaltyAmount = Long.valueOf(dataBean2.deductionPointAmount);
            PreviewPayInfoResp.DataBean dataBean3 = confirmAndPayWithdrawOrderActivity.f26836M;
            createCashOutOrderReq.returnPoint = dataBean3.returnPoint;
            createCashOutOrderReq.businessAmount = dataBean3.payAmount;
            createCashOutOrderReq.payFee = dataBean3.fee;
            createCashOutOrderReq.vat = Long.valueOf(dataBean3.vat);
            createCashOutOrderReq.reciveFee = Long.valueOf(confirmAndPayWithdrawOrderActivity.f26836M.payeeFee);
            createCashOutOrderReq.reciveTaxFee = Long.valueOf(confirmAndPayWithdrawOrderActivity.f26836M.payeeVat);
            createCashOutOrderReq.platformFee = Long.valueOf(confirmAndPayWithdrawOrderActivity.f26836M.platformFee);
            createCashOutOrderReq.platformTaxFee = Long.valueOf(confirmAndPayWithdrawOrderActivity.f26836M.platformVat);
            createCashOutOrderReq.reciveAmount = Long.valueOf(confirmAndPayWithdrawOrderActivity.f26836M.payeeAmount);
            createCashOutOrderReq.seqId = confirmAndPayWithdrawOrderActivity.f26836M.seqId;
        }
        ((IRechargeService) A9.a.f95a.f35518b).createCashOutOrder(createCashOutOrderReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0148o(confirmAndPayWithdrawOrderActivity));
    }
}
