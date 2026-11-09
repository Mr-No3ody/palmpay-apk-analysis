package com.transsnet.palmpay.cash_in.ui.activity;

import A8.b;
import Ab.ViewOnClickListenerC0053e;
import Ab.k;
import Ae.n;
import C0.G;
import C9.ViewOnClickListenerC0146m;
import C9.ViewOnClickListenerC0150q;
import I9.e;
import I9.f;
import I9.g;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.growingio.android.circler.a;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.cash_in.ui.view.ModelFundPaymentResultProgress;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.viewmodel.FailResultPageAdView;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.util.SpanUtils;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p366y9.c;
import p366y9.d;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cashin_out/fund_result")
public class FundResultActivity extends BaseActivity {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f26846v = {PushMessage.MESSAGE_TYPE_ORDER_STATUS_CHANGE};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PpTitleBar f26847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f26848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SingleAdView f26849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SingleAdView f26850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FailResultPageAdView f26851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ModelFundPaymentResultProgress f26852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f26853g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PayByOrderResp.DataBean f26854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BillDetail f26855j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Handler f26857p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n f26856o = new n(this, 3);
    public final b t = new b(this, 21);

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.cash_in_activity_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        PayByOrderResp.DataBean dataBean = this.f26854i;
        if (dataBean != null) {
            int i7 = dataBean.payStatus;
            if (i7 == 2) {
                if (TextUtils.isEmpty(dataBean.errorMsg)) {
                    this.f26852f.d(getString(d.ci_error_occurred));
                } else {
                    this.f26852f.d(this.f26854i.errorMsg);
                }
                this.f26851e.s(this.f26854i.payId);
            } else if (i7 == 1) {
                new InterstitialAdView(org.chromium.support_lib_boundary.util.b.y("01"), new k(1)).show(this, new a(1));
                ModelFundPaymentResultProgress modelFundPaymentResultProgress = this.f26852f;
                e eVar = modelFundPaymentResultProgress.f27078d;
                if (eVar != null) {
                    eVar.a(8);
                }
                f fVar = modelFundPaymentResultProgress.f27079e;
                if (fVar != null) {
                    fVar.a(8);
                }
                if (modelFundPaymentResultProgress.f27077c == null) {
                    ((ViewStub) modelFundPaymentResultProgress.findViewById(p025ba.e.successStub)).inflate();
                    modelFundPaymentResultProgress.f27077c = new g(modelFundPaymentResultProgress.findViewById(p025ba.e.viewSuccessRoot), 0);
                }
                if (!TextUtils.isEmpty("")) {
                    modelFundPaymentResultProgress.f27077c.getClass();
                }
                modelFundPaymentResultProgress.f27077c.a(0);
            } else {
                this.f26852f.setTransType(dataBean.transType);
                ModelFundPaymentResultProgress modelFundPaymentResultProgress2 = this.f26852f;
                String string = getString(d.ci_fund_pending_tips);
                PayByOrderResp.DataBean dataBean2 = this.f26854i;
                String str = dataBean2.pendingCountdownAcTips;
                long j6 = dataBean2.pendingAcTime;
                modelFundPaymentResultProgress2.getClass();
                ModelFundPaymentResultProgress.f27075i = string;
                e eVar2 = modelFundPaymentResultProgress2.f27078d;
                if (eVar2 != null) {
                    eVar2.a(8);
                }
                g gVar = modelFundPaymentResultProgress2.f27077c;
                if (gVar != null) {
                    gVar.a(8);
                }
                if (modelFundPaymentResultProgress2.f27079e == null) {
                    ((ViewStub) modelFundPaymentResultProgress2.findViewById(p025ba.e.pendingStub)).inflate();
                    modelFundPaymentResultProgress2.f27079e = new f(modelFundPaymentResultProgress2, modelFundPaymentResultProgress2.findViewById(p025ba.e.viewPendingRoot));
                }
                f fVar2 = modelFundPaymentResultProgress2.f27079e;
                I9.d dVar = fVar2.f4287g.f27080f;
                if (dVar != null) {
                    fVar2.f4285e.removeCallbacks(dVar);
                }
                TextView textView = fVar2.f4285e;
                if (j6 > 0) {
                    I9.d dVar2 = new I9.d(0);
                    dVar2.f4280b = new WeakReference(textView);
                    dVar2.f4281c = new WeakReference(fVar2.f4286f);
                    dVar2.f4282d = j6;
                    fVar2.f4287g.f27080f = dVar2;
                    textView.postDelayed(dVar2, 500L);
                } else {
                    textView.setText(p025ba.k.core_pending);
                }
                f fVar3 = modelFundPaymentResultProgress2.f27079e;
                fVar3.getClass();
                boolean zIsNG = BaseApplication.isNG();
                TextView textView2 = fVar3.f4286f;
                if (!zIsNG) {
                    fVar3.f4285e.setText(p025ba.k.core_pending);
                    textView2.setText("");
                } else if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(str)) {
                    if (j6 - System.currentTimeMillis() > 0) {
                        textView2.setOnClickListener(null);
                        textView2.setText(str);
                        F6.d.h("debug_tag", 3, "5 tvPendingMsg. setText, pendingCountDownTips:" + str);
                    } else if (TextUtils.equals(ModelFundPaymentResultProgress.f27074g, "01")) {
                        textView2.setOnClickListener(null);
                        textView2.setText(string);
                    } else {
                        SpanUtils spanUtilsAppend = new SpanUtils().append(string).append(" ");
                        int i10 = p025ba.k.core_view_overtime_rewards;
                        Context context = fVar3.f4278d;
                        SpannableStringBuilder spannableStringBuilderCreate = spanUtilsAppend.append(context.getString(i10)).setForegroundColor(context.getColor(L6.b.ppColorPrimary)).create();
                        textView2.setText(spannableStringBuilderCreate);
                        F6.d.h("debug_tag", 3, "6 tvPendingMsg. setText, pendingMessage: " + ((Object) spannableStringBuilderCreate));
                        textView2.setOnClickListener(new ViewOnClickListenerC0053e(21));
                    }
                }
                modelFundPaymentResultProgress2.f27079e.a(0);
                if (this.f26857p == null) {
                    this.f26857p = new Handler(getMainLooper());
                }
                Handler handler = this.f26857p;
                n nVar = this.f26856o;
                handler.removeCallbacks(nVar);
                this.f26857p.postDelayed(nVar, 5000L);
            }
        }
        PayByOrderResp.DataBean dataBean3 = this.f26854i;
        if (dataBean3 == null || TextUtils.isEmpty(dataBean3.orderData)) {
            return;
        }
        C0525w c0525wF = C0525w.f();
        String str2 = this.f26854i.orderData;
        c0525wF.getClass();
        BillDetail billDetail = (BillDetail) C0525w.d(str2, BillDetail.class);
        this.f26855j = billDetail;
        if (billDetail == null) {
            return;
        }
        this.f26852f.setAmount(billDetail.totalAmount);
        this.f26853g.removeAllViews();
        LinearLayout linearLayout = this.f26853g;
        String string2 = getString(p025ba.k.core_pay_method);
        BillDetail billDetail2 = this.f26855j;
        linearLayout.addView(new OrderResultItemModel(this, 1002, string2, billDetail2.payerAccountType == 8 ? i0.k(billDetail2.bankCode, billDetail2.mobileNo) : i0.h(billDetail2.bankName, billDetail2.bankAccNo)));
        this.f26853g.addView(new OrderResultItemModel(this, 1002, getString(v.cv_amount), r0.B(this.f26855j.businessAmount, true)));
        LinearLayout linearLayout2 = this.f26853g;
        String str3 = this.f26855j.orderNo;
        TextView textView3 = new TextView(this);
        textView3.setText(G.i("View Detail").appendImage(r.cv_purple_arrow_right_bold).create());
        textView3.setGravity(49);
        textView3.setPadding(0, DensityUtil.dp2px(12.0f), 0, DensityUtil.dp2px(16.0f));
        textView3.setTextColor(getColor(L6.b.ppColorPrimary));
        textView3.setTextSize(12.0f);
        textView3.setOnClickListener(new ViewOnClickListenerC0150q(str3, 0));
        linearLayout2.addView(textView3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
    }

    public final void l() {
        if (this.f26855j == null || this.f26854i == null) {
            return;
        }
        CheckPayReq checkPayReq = new CheckPayReq();
        PayByOrderResp.DataBean dataBean = this.f26854i;
        checkPayReq.orderNo = dataBean.orderNo;
        checkPayReq.payId = dataBean.payId;
        checkPayReq.transType = this.f26855j.transType;
        checkPayReq.subPayId = dataBean.subPayId;
        ((PayApiService) p324va.c.f43141a.f14621b).queryNewPayResult(checkPayReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C9.r(this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
        AdManager.clearPreloadSingleAd();
        Handler handler = this.f26857p;
        if (handler != null) {
            handler.removeCallbacks(this.f26856o);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceivePushMessage(PushMessage pushMessage) {
        PushMessage.Content content;
        if (pushMessage == null || (content = pushMessage.content) == null) {
            return;
        }
        if (f26846v[0].equals(content.messageType)) {
            l();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        org.greenrobot.eventbus.c.b().j(this);
        this.f26847a = (PpTitleBar) findViewById(p366y9.b.titleBar);
        this.f26848b = (TextView) findViewById(p366y9.b.ciar_complete_btn);
        this.f26850d = (SingleAdView) findViewById(p366y9.b.cia_success_ad1);
        this.f26851e = (FailResultPageAdView) findViewById(p366y9.b.cia_fail_okcard_ad);
        this.f26849c = (SingleAdView) findViewById(p366y9.b.actur_ad);
        this.f26852f = (ModelFundPaymentResultProgress) findViewById(p366y9.b.payProgress);
        this.f26853g = (LinearLayout) findViewById(p366y9.b.ll_order_info);
        TextView textView = this.f26848b;
        b bVar = this.t;
        textView.setOnClickListener(bVar);
        findViewById(p366y9.b.ciar_fund_again_btn).setOnClickListener(bVar);
        ARouter.getInstance().inject(this);
        i0.k0();
        this.f26851e.setVisibility(8);
        this.f26849c.setSlotId(org.chromium.support_lib_boundary.util.b.z("01"));
        SingleAdView singleAdView = this.f26849c;
        singleAdView.setAdListener(new com.chuanyi.ad.a(singleAdView, "HandleResultActivity"));
        this.f26850d.setAdListener(new com.chuanyi.ad.a(this.f26850d, "HandleResultActivity"));
        this.f26851e.setAdListener(new com.chuanyi.ad.a(this.f26851e, "HandleResultActivity"));
        this.f26847a.setRightImageView2ClickListener(new ViewOnClickListenerC0146m(this, 1));
        this.f26847a.setRightImageView2Icon(S6.a.pay_CustomerService);
    }
}
