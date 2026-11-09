package com.transsnet.palmpay.cash_in.ui.activity;

import B9.c;
import C9.C0145l;
import C9.C0147n;
import C9.ViewOnClickListenerC0146m;
import Pa.r0;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BankCardInfo;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.core.viewmodel.ModelPreviewPaymentMethodItem;
import com.transsnet.palmpay.core.viewmodel.ModelUsePointsWithSwitch;
import com.transsnet.palmpay.core.viewmodel.PreviewPageItemContainer;
import com.transsnet.palmpay.core.viewmodel.PreviewTitleView;
import com.transsnet.palmpay.custom_view.r;
import p071ef.b;
import p298tf.f;
import p366y9.d;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cashout/confirm_withdrw_order")
@Deprecated(since = "待废弃,是否可以使用新收银台")
public class ConfirmAndPayWithdrawOrderActivity extends c {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ int f26830Y = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ModelPreviewPaymentMethodItem f26831A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public PreviewPageItemContainer f26832B;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public User f26834H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f26835L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public PreviewPayInfoResp.DataBean f26836M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f26837Q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f26839g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PreviewTitleView f26840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ModelItemFee f26841j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ModelItemFee f26842o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ModelItemFee f26843p;
    public ModelItemFee t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ModelItemFee f26844v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ModelUsePointsWithSwitch f26845w;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f26833C = 0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final ViewOnClickListenerC0146m f26838X = new ViewOnClickListenerC0146m(this, 0);

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return p366y9.c.ci_activity_withdraw_confirm_and_pay;
    }

    @Override // B9.c, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Intent intent = getIntent();
        BankCardInfo bankCardInfo = (BankCardInfo) intent.getParcelableExtra("KEY_BANK_CARD");
        this.f571b = bankCardInfo;
        if (bankCardInfo != null) {
            n();
            this.f26842o.setContent(this.f571b.userName);
        }
        this.f26837Q = intent.getStringExtra("orderNo");
        long longExtra = intent.getLongExtra("extra_amount", 0L);
        this.f26833C = longExtra;
        this.f26844v.setContent(r0.A(longExtra));
        this.f26840i.setAmount(this.f26833C);
        this.f26835L = intent.getStringExtra("extra_message");
        this.f26834H = BaseApplication.getInstance().getUserDataSource().b();
        super.initData();
        this.f570a.setDialogTitle(getString(d.ci_select_withdrawl_account));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // B9.c
    public final void n() {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.payType = 7;
        BankCardInfo bankCardInfo = this.f571b;
        paymentMethod.senderAccountType = bankCardInfo.payeeAccountType;
        paymentMethod.reUseable = 0;
        paymentMethod.cardNo = bankCardInfo.cardNo;
        paymentMethod.bankAccountNo = bankCardInfo.bankAccountNo;
        paymentMethod.bankCode = bankCardInfo.bankCode;
        paymentMethod.bankName = bankCardInfo.bankName;
        paymentMethod.bankUrl = bankCardInfo.bankUrl;
        this.f26831A.setPaymentMethod(paymentMethod);
        this.f26839g.setEnabled(true);
    }

    public final void o() {
        showLoadingDialog(true);
        PreviewPayInfoV2Req previewPayInfoV2Req = new PreviewPayInfoV2Req();
        previewPayInfoV2Req.orderAmount = this.f26833C;
        previewPayInfoV2Req.orderType = "3";
        previewPayInfoV2Req.transType = "02";
        previewPayInfoV2Req.isRedeemPoint = this.f26845w.f28430j.isChecked();
        previewPayInfoV2Req.payeeAccountType = String.valueOf(6);
        ((PayApiService) p324va.c.f43141a.f14621b).queryPreviewPayInfoV2(previewPayInfoV2Req).k(f.f42629b).i(b.a()).subscribe(new C0147n(this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        o();
    }

    @Override // B9.c, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        this.f26839g = (Button) findViewById(p366y9.b.awcap_complete_btn);
        this.f26840i = (PreviewTitleView) findViewById(p366y9.b.withdraw_preview_title_info);
        this.f26841j = (ModelItemFee) findViewById(p366y9.b.acap_total_pay_item);
        this.t = (ModelItemFee) findViewById(p366y9.b.acap_point_earned_item);
        this.f26843p = (ModelItemFee) findViewById(p366y9.b.acap_fee_item);
        this.f26844v = (ModelItemFee) findViewById(p366y9.b.acap_amount_item);
        this.f26842o = (ModelItemFee) findViewById(p366y9.b.acap_verify_name_item);
        this.f26845w = (ModelUsePointsWithSwitch) findViewById(p366y9.b.acap_point_used_item);
        this.f26831A = (ModelPreviewPaymentMethodItem) findViewById(p366y9.b.acap_bank_card_item);
        this.f26832B = (PreviewPageItemContainer) findViewById(p366y9.b.itemContainer);
        ModelPreviewPaymentMethodItem modelPreviewPaymentMethodItem = this.f26831A;
        String string = getString(d.ci_select_withdrawl_account);
        int i7 = r.cv_default_bank_logo;
        modelPreviewPaymentMethodItem.f28414d.setText(string);
        modelPreviewPaymentMethodItem.f28416f.setImageResource(i7);
        this.f26831A.f28415e.setVisibility(4);
        this.f26839g.setEnabled(false);
        Button button = this.f26839g;
        ViewOnClickListenerC0146m viewOnClickListenerC0146m = this.f26838X;
        button.setOnClickListener(viewOnClickListenerC0146m);
        this.f26845w.setOnCheckedChangeListener(new C0145l(this, 0));
        this.f26831A.setOnClickListener(viewOnClickListenerC0146m);
        this.f26841j.f28361b.setTypeface(Typeface.defaultFromStyle(1));
        this.f26841j.f28361b.setTextColor(getResources().getColor(L6.b.ppColorTextPrimary));
    }
}
