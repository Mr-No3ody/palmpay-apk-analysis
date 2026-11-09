package com.transsnet.palmpay.ui.activity.qr;

import C9.C0145l;
import La.F;
import Pa.r0;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m;
import com.transsnet.palmpay.core.viewmodel.ModelCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.core.viewmodel.ModelPreviewPaymentMethodItem;
import com.transsnet.palmpay.core.viewmodel.ModelUsePointsWithSwitch;
import com.transsnet.palmpay.core.viewmodel.PreviewTitleView;
import com.transsnet.palmpay.custom_view.r;
import p025ba.k;
import p071ef.b;
import p271re.d;
import p271re.e;
import p298tf.f;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/scan_partner_pay_money_preview_page")
public class PayMoneyToPartnerPreviewActivity extends AbstractActivityC1479m {

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ int f34852B0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final d f34853A0 = new d(this);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Button f34854Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ModelItemFee f34855Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ModelItemFee f34856k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ModelItemFee f34857p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ModelItemFee f34858q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ModelUsePointsWithSwitch f34859r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public PreviewTitleView f34860s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ModelPreviewPaymentMethodItem f34861t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ImageView f34862u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public TextView f34863v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ModelCouponItem f34864w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f34865x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f34866y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public PreviewPayInfoResp.DataBean f34867z0;

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    /* JADX INFO: renamed from: B */
    public final boolean getF27555F0() {
        return true;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final int D() {
        return 1;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final void N() {
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final void O(PreviewPayInfoResp.DataBean dataBean) {
        ModelPreviewPaymentMethodItem modelPreviewPaymentMethodItem = this.f34861t0;
        if (modelPreviewPaymentMethodItem == null) {
            return;
        }
        modelPreviewPaymentMethodItem.setPaymentMethod(this.f27789d);
        S();
    }

    public final void Q(boolean z3) {
        this.f34861t0.d(z3);
        this.f34854Y.setEnabled(z3);
        if (z3) {
            return;
        }
        K();
    }

    public final void R() {
        this.f34860s0.setAmount(this.f34865x0);
        this.f34855Z.e(0L, 0L);
        this.f34859r0.setVisibility(8);
        this.f34856k0.setVisibility(8);
        this.f34854Y.setText(getString(k.core_pay));
        this.f34864w0.setVisibility(8);
        this.f34858q0.setVisibility(8);
    }

    public final void S() {
        showLoadingDialog(true);
        ((PayApiService) c.f43141a.f14621b).queryPreviewPayInfoV2(v()).k(f.f42629b).i(b.a()).subscribe(new e(this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ac.f.main_activity_scan_qrcode_pay_money_preview;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getOrderAmount */
    public final long getF27554E0() {
        return this.f34865x0;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getTransType */
    public final String getF27551B0() {
        return TransType.TRANS_TYPE_PARTNER_MERCHANT_C_SCAN_B;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f34857p0.setContent(r0.A(this.f34865x0));
        this.f34862u0.setImageResource(r.cv_default_merchat);
        super.initData();
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new F();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.dialog.CoreSelectCouponForPaymentDialog.CallBack
    public final void onCouponClick(CouponItem couponItem) {
        this.f27790e = couponItem;
        this.f34864w0.setCoupon(couponItem);
        if (this.f34859r0.f28430j.isChecked()) {
            this.f34859r0.d(false);
        }
        this.f34864w0.d();
        S();
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void setDefaultMethod(PaymentMethod paymentMethod) {
        if (paymentMethod != null) {
            this.f27789d = paymentMethod;
            this.f34861t0.setPaymentMethod(paymentMethod);
            S();
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        this.f34860s0 = (PreviewTitleView) findViewById(Ac.e.acap_title_info);
        this.f34854Y = (Button) findViewById(Ac.e.acapbo_next_btn);
        this.f34856k0 = (ModelItemFee) findViewById(Ac.e.acapbo_point_earned_item);
        this.f34855Z = (ModelItemFee) findViewById(Ac.e.acapbo_fee_item);
        this.f34857p0 = (ModelItemFee) findViewById(Ac.e.acapbo_amount_item);
        this.f34858q0 = (ModelItemFee) findViewById(Ac.e.itemDiscount);
        this.f34859r0 = (ModelUsePointsWithSwitch) findViewById(Ac.e.acapbo_point_used_item);
        this.f34861t0 = (ModelPreviewPaymentMethodItem) findViewById(Ac.e.acapbo_bank_card_item);
        this.f34862u0 = (ImageView) findViewById(Ac.e.acapbo_payee_icon);
        this.f34863v0 = (TextView) findViewById(Ac.e.acapbo_payee_name);
        ModelCouponItem modelCouponItem = (ModelCouponItem) findViewById(Ac.e.itemCoupon);
        this.f34864w0 = modelCouponItem;
        d dVar = this.f34853A0;
        modelCouponItem.setOnClickListener(dVar);
        this.f34854Y.setEnabled(false);
        this.f34854Y.setOnClickListener(dVar);
        this.f34859r0.setOnCheckedChangeListener(new C0145l(this, 6));
        this.f34861t0.setOnClickListener(dVar);
        this.f34854Y.setEnabled(false);
        R();
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void showPreviewPayInfo(PaymentMethod paymentMethod, PreviewPayInfoResp.DataBean dataBean) {
        this.f34867z0 = dataBean;
        this.f34854Y.setText(getString(k.core_pay_amount, BaseApplication.getCurrencySymbol(), r0.A(this.f27791f)));
        PreviewPayInfoResp.DataBean dataBean2 = this.f34867z0;
        if (dataBean2 == null) {
            R();
        } else {
            setPayAmount(dataBean2.payAmount);
            this.f34860s0.setAmount(this.f34867z0.payAmount);
            if (!TextUtils.isEmpty(this.f34867z0.shopName)) {
                this.f34860s0.d(getString(k.core_to, this.f34867z0.shopName));
            }
            this.f34863v0.setText(this.f34867z0.shopName);
            ModelItemFee modelItemFee = this.f34855Z;
            PreviewPayInfoResp.DataBean dataBean3 = this.f34867z0;
            modelItemFee.e(dataBean3.fee, dataBean3.vat);
            this.f34856k0.setContent(String.valueOf(this.f34867z0.returnPoint));
            ModelUsePointsWithSwitch modelUsePointsWithSwitch = this.f34859r0;
            PreviewPayInfoResp.DataBean dataBean4 = this.f34867z0;
            modelUsePointsWithSwitch.f(dataBean4.deductionPoint, r0.A(dataBean4.deductionPointAmount));
            if (this.f34859r0.f28430j.isChecked()) {
                ModelUsePointsWithSwitch modelUsePointsWithSwitch2 = this.f34859r0;
                PreviewPayInfoResp.DataBean dataBean5 = this.f34867z0;
                modelUsePointsWithSwitch2.f(dataBean5.deductionPoint, r0.A(dataBean5.deductionPointAmount));
            } else {
                this.f34859r0.f(0L, "0");
            }
            if (this.f34867z0.deductionPointAmount <= 0) {
                this.f34859r0.setVisibility(8);
            } else {
                this.f34859r0.setVisibility(0);
            }
            if (this.f34867z0.discountAmount > 0) {
                this.f34858q0.setVisibility(0);
                this.f34858q0.setContent("- " + r0.B(this.f34867z0.discountAmount, true));
            } else {
                this.f34858q0.setVisibility(8);
            }
            this.f34859r0.setPointExchangeRate((int) this.f34867z0.exchangeRate);
            if (this.f34867z0.returnPoint <= 0) {
                this.f34856k0.setVisibility(8);
            } else {
                this.f34856k0.setVisibility(0);
            }
            PreviewPayInfoResp.DataBean dataBean6 = this.f34867z0;
            q(dataBean6.couponId, dataBean6.couponAmount);
            this.f34864w0.setVisibility(0);
            this.f34864w0.setAvailableCouponCount(this.f27779A);
            this.f34864w0.setCoupon(this.f27790e);
            this.f34864w0.setCouponDeductAmount(this.f34867z0.couponAmount);
        }
        PaymentMethod paymentMethod2 = this.f27789d;
        if (paymentMethod2 == null) {
            this.f34854Y.setEnabled(false);
            return;
        }
        if (paymentMethod2.senderAccountType != 1) {
            Q(true);
            return;
        }
        PreviewPayInfoResp.DataBean dataBean7 = this.f34867z0;
        if (dataBean7 == null) {
            Q(true);
        } else if (paymentMethod2.availableBalance < dataBean7.payAmount) {
            Q(false);
        } else {
            Q(true);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    /* JADX INFO: renamed from: t */
    public final String getF27552C0() {
        return "20";
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final PreviewPayInfoV2Req v() {
        PreviewPayInfoV2Req previewPayInfoV2Req = new PreviewPayInfoV2Req();
        previewPayInfoV2Req.orderAmount = this.f34865x0;
        previewPayInfoV2Req.createReceiptUrl = this.f34866y0;
        previewPayInfoV2Req.orderType = "20";
        try {
            previewPayInfoV2Req.transType = TransType.TRANS_TYPE_PARTNER_MERCHANT_C_SCAN_B;
        } catch (NumberFormatException e10) {
            F6.d.c(this.TAG, "queryPreViewInfo: ", e10);
        }
        boolean zIsChecked = this.f34859r0.f28430j.isChecked();
        previewPayInfoV2Req.isRedeemPoint = zIsChecked;
        if (zIsChecked) {
            previewPayInfoV2Req.isUseCoupon = false;
        } else {
            previewPayInfoV2Req.isUseCoupon = C();
        }
        CouponItem couponItem = this.f27790e;
        if (couponItem != null) {
            previewPayInfoV2Req.couponId = Long.valueOf(couponItem.couponId);
            previewPayInfoV2Req.couponAmount = this.f27790e.nominaValue;
        }
        PaymentMethod paymentMethod = this.f27789d;
        if (paymentMethod != null) {
            previewPayInfoV2Req.payerAccountType = String.valueOf(paymentMethod.senderAccountType);
        }
        return previewPayInfoV2Req;
    }
}
