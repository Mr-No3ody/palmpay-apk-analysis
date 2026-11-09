package com.transsnet.palmpay.betting.ui.activity;

import Pa.J;
import Pa.K;
import Pa.r0;
import Pd.d;
import Pd.f;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.core.viewmodel.ModelApplyOkCard;
import com.transsnet.palmpay.core.viewmodel.ModelCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelDiscountItem;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.core.viewmodel.ModelPreviewPaymentMethodItem;
import com.transsnet.palmpay.core.viewmodel.ModelUsePointsWithSwitch;
import com.transsnet.palmpay.core.viewmodel.PreviewTitleView;
import com.transsnet.palmpay.teller.bean.BettingWithdrawRedeemPayReq;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.ui.mvp.contract.BettingConfirmPaymentOrderContract;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p028be.c;
import p070ee.b;
import p173ld.o;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/quick_teller/betting_withdraw_confirm_payment_order")
public class BettingWithdrawConfirmPaymentOrderActivity extends AbstractActivityC1479m implements BettingConfirmPaymentOrderContract.View {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public ModelItemFee f26699A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ModelItemFee f26700B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public ModelItemFee f26701C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public ModelDiscountItem f26702D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public ModelUsePointsWithSwitch f26703E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public ModelCouponItem f26704F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public ModelItemFee f26705G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public ModelItemFee f26706H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public TextView f26707I0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public PaymentItemBean f26708Y;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f26710k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f26711p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f26712q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f26713r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f26714s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f26715t0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public TextView f26717v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public PreviewTitleView f26718w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ModelPreviewPaymentMethodItem f26719x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ModelItemFee f26720y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ModelItemFee f26721z0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public long f26709Z = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f26716u0 = false;

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final int D() {
        return 1;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final void N() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return d.qt_activity_betting_withdraw_confirm_payment_order;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getOrderAmount */
    public final long getF27554E0() {
        return this.f26709Z;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getTransType */
    public final String getF27551B0() {
        Object obj = b.f36288a;
        PaymentItemBean paymentItemBean = this.f26708Y;
        return b.b(paymentItemBean != null ? paymentItemBean.categoryId : null);
    }

    @Override // com.transsnet.palmpay.teller.ui.mvp.contract.BettingConfirmPaymentOrderContract.View
    public final void handleBettingDefaultPaymentOrder(PaymentMethod paymentMethod) {
        if (paymentMethod != null) {
            this.f27789d = paymentMethod;
        } else {
            PaymentMethod paymentMethod2 = new PaymentMethod();
            this.f27789d = paymentMethod2;
            paymentMethod2.payType = 1;
        }
        setPayAmount(this.f26709Z);
        if (TextUtils.isEmpty(this.f27793i)) {
            return;
        }
        E();
    }

    @Override // com.transsnet.palmpay.teller.ui.mvp.contract.BettingConfirmPaymentOrderContract.View
    public final void handleBettingRedeemCodePay(CheckPayResp checkPayResp) {
        J j6 = new J();
        j6.f7022a = "5";
        j6.f7023b = checkPayResp.getData();
        j6.f7024c = checkPayResp.getData().orderNo;
        j6.f7025d = getF27551B0();
        j6.f7026e = this.f27791f;
        j6.f7027f = null;
        K.a(j6);
        finish();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        super.initData();
        String stringExtra = getIntent().getStringExtra("core_calculation_ext_info");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f27782H = stringExtra;
        }
        PaymentItemBean paymentItemBean = this.f26708Y;
        if (paymentItemBean != null) {
            PreviewTitleView previewTitleView = this.f26718w0;
            String str = paymentItemBean.billerName;
            String str2 = paymentItemBean.paymentItemName;
            PreviewTitleView.e(previewTitleView.f28563e, str);
            PreviewTitleView.e(previewTitleView.f28564f, str2);
            this.f27796p = this.f26708Y.billerId;
        } else {
            this.f26718w0.d(this.f26711p0);
        }
        if (!TextUtils.isEmpty(this.f26711p0)) {
            this.f26699A0.setContent(this.f26711p0);
        }
        PaymentItemBean paymentItemBean2 = this.f26708Y;
        if (paymentItemBean2 != null) {
            this.f26720y0.setContent(paymentItemBean2.billerName);
        }
        if (!TextUtils.isEmpty(this.f26710k0)) {
            this.f26721z0.setContent(this.f26710k0);
        }
        this.f26700B0.setAmount(r0.A(this.f26709Z));
        this.f26718w0.setAmount(this.f26709Z);
        this.f26701C0.d(false);
        this.f26704F0.d();
        this.f26706H0.f();
        PaymentItemBean paymentItemBean3 = this.f26708Y;
        if (paymentItemBean3 != null) {
            TextView textView = this.f26707I0;
            Object obj = b.f36288a;
            AutoTrackUtil.trackViewProperties(textView, LogConstants.Autotrack.ELEMENT_TRANS_TYPE, b.b(paymentItemBean3.categoryId));
        }
        if (this.f26716u0) {
            this.f27789d = new PaymentMethod();
        }
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new c();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        if (i7 != 101) {
            super.onActivityResult(i7, i10, intent);
        } else if (i10 == -1) {
            ((c) this.f27350a).bettingWithdrawRedeemCodePay(new BettingWithdrawRedeemPayReq(this.f26715t0));
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.dialog.CoreSelectCouponForPaymentDialog.CallBack
    public final void onCouponClick(CouponItem couponItem) {
        this.f27790e = couponItem;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent event) {
        super.onMessageEvent(event);
        if (event.getEventType() != 306) {
            return;
        }
        finish();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        c cVar = new c();
        this.f27350a = cVar;
        cVar.f27351a = this;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final String r() {
        PaymentItemBean paymentItemBean = this.f26708Y;
        if (paymentItemBean != null) {
            return paymentItemBean.paymentItemId;
        }
        return null;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final ModelApplyOkCard s() {
        return null;
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void setDefaultMethod(PaymentMethod paymentMethod) {
        if (paymentMethod == null) {
            L();
        } else {
            this.f27789d = paymentMethod;
            this.f26719x0.setPaymentMethod(paymentMethod);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        this.f27793i = getQueryParameter("orderNo");
        this.f26718w0 = (PreviewTitleView) findViewById(Pd.c.previewTitle);
        this.f26719x0 = (ModelPreviewPaymentMethodItem) findViewById(Pd.c.itemPaymentMethod);
        this.f26720y0 = (ModelItemFee) findViewById(Pd.c.itemBillerName);
        this.f26721z0 = (ModelItemFee) findViewById(Pd.c.itemUserId);
        this.f26699A0 = (ModelItemFee) findViewById(Pd.c.itemUserName);
        this.f26700B0 = (ModelItemFee) findViewById(Pd.c.itemAmount);
        this.f26701C0 = (ModelItemFee) findViewById(Pd.c.itemFee);
        this.f26717v0 = (TextView) findViewById(Pd.c.tvTitle);
        this.f26702D0 = (ModelDiscountItem) findViewById(Pd.c.itemDiscount);
        this.f26703E0 = (ModelUsePointsWithSwitch) findViewById(Pd.c.itemPointToUse);
        this.f26704F0 = (ModelCouponItem) findViewById(Pd.c.itemCoupon);
        this.f26705G0 = (ModelItemFee) findViewById(Pd.c.itemPointToEarn);
        this.f26706H0 = (ModelItemFee) findViewById(Pd.c.itemTotal);
        this.f26707I0 = (TextView) findViewById(Pd.c.textViewNext);
        this.f26717v0.setText(f.qt_infomation_confirmation);
        this.f26707I0.setOnClickListener(new o(this, 21));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract.View
    public final void showLoadingView(boolean z3) {
        showLoadingDialog(z3);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void showPreviewPayInfo(PaymentMethod paymentMethod, PreviewPayInfoResp.DataBean dataBean) {
        updatePreviewInfo(String.valueOf(paymentMethod.senderAccountType), dataBean);
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    /* JADX INFO: renamed from: t */
    public final String getF27552C0() {
        return "5";
    }

    @Override // com.transsnet.palmpay.teller.ui.mvp.contract.BettingConfirmPaymentOrderContract.View
    public final void updatePreviewInfo(String str, PreviewPayInfoResp.DataBean dataBean) {
        if (dataBean == null) {
            this.f27790e = null;
            this.f26702D0.setVisibility(8);
            this.f26701C0.e(0L, 0L);
            this.f26703E0.setVisibility(8);
            this.f26705G0.setVisibility(8);
            this.f26704F0.setVisibility(8);
            this.f26718w0.setAmount(this.f26709Z);
            return;
        }
        I(dataBean);
        setPayAmount(dataBean.payAmount);
        this.f26701C0.e(dataBean.fee, dataBean.vat);
        this.f26701C0.setVisibility(dataBean.fee + dataBean.vat > 0 ? 0 : 8);
        this.f26718w0.setAmount(dataBean.payAmount);
        this.f26703E0.setVisibility(8);
        this.f26705G0.setVisibility(8);
        this.f26702D0.setVisibility(8);
        this.f26701C0.d(true);
        this.f26704F0.setVisibility(8);
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final PreviewPayInfoV2Req v() {
        return null;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final void O(PreviewPayInfoResp.DataBean dataBean) {
    }
}
