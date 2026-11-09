package com.transsnet.palmpay.cash_in.ui.activity;

import A8.b;
import Ab.k;
import Ae.n;
import C9.d0;
import K8.a;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.widget.ModelResultAmountList;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.viewmodel.FailResultPageAdView;
import com.transsnet.palmpay.core.viewmodel.ModelPaymentResultProgress;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p298tf.f;
import p366y9.c;
import p366y9.d;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cashin_out/withdraw_result")
public class WithdrawResultActivity extends BaseActivity {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String[] f26959A = {PushMessage.MESSAGE_TYPE_ORDER_STATUS_CHANGE};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RelativeLayout f26960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f26961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f26962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f26963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f26964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SingleAdView f26965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FailResultPageAdView f26966g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ModelPaymentResultProgress f26967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ModelResultAmountList f26968j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PayByOrderResp.DataBean f26969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public BillDetail f26970p;
    public Handler t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n f26971v = new n(this, 5);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f26972w = new b(this, 25);

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.cash_in_withdraw_activity_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        PayByOrderResp.DataBean dataBean = this.f26969o;
        if (dataBean != null) {
            int i7 = dataBean.payStatus;
            if (i7 == 2) {
                if (TextUtils.isEmpty(dataBean.errorMsg)) {
                    this.f26967i.d(getString(d.ci_fund_fail_msg));
                } else {
                    this.f26967i.d(this.f26969o.errorMsg);
                }
                this.f26966g.s(this.f26969o.payId);
            } else if (i7 == 1) {
                this.f26967i.g("");
                this.f26965f.setVisibility(0);
            } else {
                this.f26967i.f(dataBean.pendingAcTime, dataBean.pendingAcTips, dataBean.pendingCountdownAcTips);
                if (this.t == null) {
                    this.t = new Handler(getMainLooper());
                }
                Handler handler = this.t;
                n nVar = this.f26971v;
                handler.removeCallbacks(nVar);
                this.t.postDelayed(nVar, 5000L);
            }
        }
        PayByOrderResp.DataBean dataBean2 = this.f26969o;
        if (dataBean2 == null || TextUtils.isEmpty(dataBean2.orderData)) {
            return;
        }
        C0525w c0525wF = C0525w.f();
        String str = this.f26969o.orderData;
        c0525wF.getClass();
        BillDetail billDetail = (BillDetail) C0525w.d(str, BillDetail.class);
        this.f26970p = billDetail;
        if (billDetail == null) {
            return;
        }
        this.f26967i.setAmount(billDetail.totalAmount);
        BillDetail billDetail2 = this.f26970p;
        String strK = billDetail2.payeeAccountType == 8 ? i0.k(billDetail2.bankCode, billDetail2.mobileNo) : i0.g(billDetail2.bankName, billDetail2.bankAccNo);
        if (!TextUtils.isEmpty(strK)) {
            this.f26962c.setText(strK);
            this.f26960a.setVisibility(0);
        }
        ModelResultAmountList modelResultAmountList = this.f26968j;
        BillDetail billDetail3 = this.f26970p;
        long j6 = billDetail3.businessAmount;
        long j10 = billDetail3.payFee + billDetail3.vat;
        long j11 = billDetail3.loyaltyPoint;
        String transactionId = billDetail3.orderNo;
        String transType = getString(d.ci_withdraw);
        long j12 = this.f26970p.returnPoint;
        modelResultAmountList.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(transType, "transType");
        Intrinsics.checkNotNullParameter("", "saveForYou");
        modelResultAmountList.getMBusinessAmountPreviewItem().f31568d.setText(r0.B(j6, true));
        modelResultAmountList.getMFeeAmountPreviewItem().f31568d.setText(r0.B(j10, true));
        modelResultAmountList.getMPointUsedPreviewItem().f31568d.setText("- " + r0.x0(j11));
        modelResultAmountList.getMCouponAmountPreviewItem().f31568d.setText("- " + r0.B(0L, true));
        modelResultAmountList.getMDiscountUsedPreviewItem().f31568d.setText("- " + r0.B(0L, true));
        modelResultAmountList.getMTransactionIdPreviewItem().f31568d.setText(transactionId);
        modelResultAmountList.getMTransTypePreviewItem().f31568d.setText(transType);
        modelResultAmountList.getMPointEarnedPreviewItem().f31568d.setText(r0.x0(j12));
        modelResultAmountList.getMSaveForYouPreviewItem().f31568d.setText("");
        modelResultAmountList.getMSaveForYouPreviewItem().setOnClickListener(new a(14));
        if (modelResultAmountList.getMCollapseLayout().indexOfChild(modelResultAmountList.getMAccountItem()) != -1 && modelResultAmountList.getMAccountItem().getVisibility() != 0) {
            modelResultAmountList.getMCollapseLayout().removeView(modelResultAmountList.getMAccountItem());
        }
        modelResultAmountList.getMCollapseLayout().removeView(modelResultAmountList.getMPaymentMethodItem());
        if (j6 == 0) {
            modelResultAmountList.getMCollapseLayout().removeView(modelResultAmountList.getMBusinessAmountPreviewItem());
        }
        if (j10 == 0) {
            modelResultAmountList.getMCollapseLayout().removeView(modelResultAmountList.getMFeeAmountPreviewItem());
        }
        if (j11 == 0) {
            modelResultAmountList.getMCollapseLayout().removeView(modelResultAmountList.getMPointUsedPreviewItem());
        }
        modelResultAmountList.getMCollapseLayout().removeView(modelResultAmountList.getMCouponAmountPreviewItem());
        modelResultAmountList.getMCollapseLayout().removeView(modelResultAmountList.getMDiscountUsedPreviewItem());
        if (j12 == 0) {
            modelResultAmountList.getMCollapseLayout().removeView(modelResultAmountList.getMPointEarnedPreviewItem());
        }
        if (transType.length() == 0) {
            modelResultAmountList.getMCollapseLayout().removeView(modelResultAmountList.getMTransTypePreviewItem());
        }
        modelResultAmountList.getMCollapseLayout().removeView(modelResultAmountList.getMSaveForYouPreviewItem());
        modelResultAmountList.getMCollapseLayout().removeView(modelResultAmountList.getMDataBonusEarnedPreviewItem());
        modelResultAmountList.getMCollapseLayout().removeView(modelResultAmountList.getMDataBonusUsedPreviewItem());
        modelResultAmountList.getMCollapseLayout().removeView(modelResultAmountList.getMCommissionEarnedPreviewItem());
    }

    public final void l() {
        CheckPayReq checkPayReq = new CheckPayReq();
        PayByOrderResp.DataBean dataBean = this.f26969o;
        checkPayReq.orderNo = dataBean.orderNo;
        checkPayReq.payId = dataBean.payId;
        checkPayReq.transType = this.f26970p.transType;
        checkPayReq.subPayId = dataBean.subPayId;
        ((PayApiService) p324va.c.f43141a.f14621b).queryNewPayResult(checkPayReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new d0(this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
        AdManager.clearPreloadSingleAd();
        Handler handler = this.t;
        if (handler != null) {
            handler.removeCallbacks(this.f26971v);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceivePushMessage(PushMessage pushMessage) {
        PushMessage.Content content;
        if (pushMessage == null || (content = pushMessage.content) == null) {
            return;
        }
        if (f26959A[0].equals(content.messageType)) {
            l();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        org.greenrobot.eventbus.c.b().j(this);
        this.f26961b = (TextView) findViewById(p366y9.b.ciar_pay_method_tv);
        this.f26963d = (TextView) findViewById(p366y9.b.ciar_complete_btn);
        this.f26960a = (RelativeLayout) findViewById(p366y9.b.ciar_pay_method_item);
        this.f26964e = (RelativeLayout) findViewById(p366y9.b.ciar_receipt_item);
        this.f26962c = (TextView) findViewById(p366y9.b.ciar_receipt_tv);
        this.f26960a.setVisibility(8);
        this.f26965f = (SingleAdView) findViewById(p366y9.b.actur_ad);
        this.f26966g = (FailResultPageAdView) findViewById(p366y9.b.fail_okcard_ad);
        this.f26967i = (ModelPaymentResultProgress) findViewById(p366y9.b.payProgress);
        this.f26968j = (ModelResultAmountList) findViewById(p366y9.b.model_result_amount_list);
        TextView textView = this.f26963d;
        b bVar = this.f26972w;
        textView.setOnClickListener(bVar);
        findViewById(p366y9.b.ciar_withdraw_again_btn).setOnClickListener(bVar);
        ARouter.getInstance().inject(this);
        n0.g().k(new ClickEvent("PalmPay_Wthd_View_Success").afEvt(true));
        i0.k0();
        this.f26966g.setAdListener(new com.chuanyi.ad.a(this.f26966g, "HandleResultActivity"));
        this.f26965f.setSlotId(org.chromium.support_lib_boundary.util.b.z("02"));
        this.f26965f.setAdListener(new com.chuanyi.ad.a(this.f26965f, "HandleResultActivity"));
        this.f26965f.setVisibility(8);
        new InterstitialAdView(org.chromium.support_lib_boundary.util.b.y("02"), new k(5)).show(this, new com.growingio.android.debugger.a(1));
        this.f26961b.setText(d.ci_palmpay_account);
        this.f26964e.setVisibility(0);
    }
}
