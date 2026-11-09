package com.transsnet.palmpay.ui.activity.qr;

import Ac.e;
import C9.C0145l;
import F6.d;
import La.F;
import Pa.r0;
import android.app.Activity;
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
import com.transsnet.palmpay.core.ui.activity.AbstractActivityC1476j;
import com.transsnet.palmpay.core.viewmodel.ModelCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.core.viewmodel.ModelPreviewPaymentMethodItem;
import com.transsnet.palmpay.core.viewmodel.ModelUsePointsWithSwitch;
import com.transsnet.palmpay.core.viewmodel.PreviewTitleView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.ToastUtils;
import p025ba.k;
import p071ef.b;
import p271re.a;
import p298tf.f;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/app/pay_money_to_palmpay_business_preview_page")
public class PayMoneyToPalmPayBusinessPreviewActivity extends AbstractActivityC1476j {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final /* synthetic */ int f34816C0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public PreviewPayInfoResp.DataBean f34817A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final a f34818B0 = new a(this);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Button f34819Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ModelItemFee f34820Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ModelItemFee f34821k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ModelItemFee f34822p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ModelItemFee f34823q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ModelUsePointsWithSwitch f34824r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public PreviewTitleView f34825s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ModelPreviewPaymentMethodItem f34826t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ImageView f34827u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public TextView f34828v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ModelCouponItem f34829w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f34830x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f34831y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f34832z0;

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
        ModelPreviewPaymentMethodItem modelPreviewPaymentMethodItem = this.f34826t0;
        if (modelPreviewPaymentMethodItem == null) {
            return;
        }
        modelPreviewPaymentMethodItem.setPaymentMethod(this.f27789d);
        S();
    }

    public final void Q(boolean z3) {
        this.f34826t0.d(z3);
        this.f34819Y.setEnabled(z3);
        if (z3) {
            return;
        }
        K();
    }

    public final void R() {
        this.f34825s0.setAmount(this.f34830x0);
        this.f34820Z.e(0L, 0L);
        this.f34824r0.setVisibility(8);
        this.f34821k0.setVisibility(8);
        this.f34819Y.setText(getString(k.core_pay));
        this.f34829w0.setVisibility(8);
        this.f34823q0.setVisibility(8);
    }

    public final void S() {
        if (this.f27789d == null) {
            ToastUtils.showLong(k.core_msg_select_payment_method);
        } else {
            showLoadingDialog(true);
            ((PayApiService) c.f43141a.f14621b).queryPreviewPayInfoV2(v()).k(f.f42629b).i(b.a()).subscribe(new p271re.b(this));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ac.f.main_activity_pay_money_to_palmpay_business_preview;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getOrderAmount */
    public final long getF27554E0() {
        return this.f34830x0;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getTransType */
    public final String getF27551B0() {
        return TransType.TRANS_TYPE_PAY_MONEY_TO_PALMPAY_BUSINESS;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f34822p0.setContent(r0.A(this.f34830x0));
        this.f34827u0.setImageResource(r.cv_default_merchat);
        R();
        super.initData();
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new F();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.dialog.CoreSelectCouponForPaymentDialog.CallBack
    public final void onCouponClick(CouponItem couponItem) {
        this.f27790e = couponItem;
        this.f34829w0.setCoupon(couponItem);
        if (this.f34824r0.f28430j.isChecked()) {
            this.f34824r0.d(false);
        }
        this.f34829w0.d();
        S();
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void setDefaultMethod(PaymentMethod paymentMethod) {
        if (paymentMethod != null) {
            this.f27789d = paymentMethod;
            this.f34826t0.setPaymentMethod(paymentMethod);
            S();
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f34825s0 = (PreviewTitleView) findViewById(e.acap_title_info);
        this.f34819Y = (Button) findViewById(e.acapbo_next_btn);
        this.f34821k0 = (ModelItemFee) findViewById(e.acapbo_point_earned_item);
        this.f34820Z = (ModelItemFee) findViewById(e.acapbo_fee_item);
        this.f34822p0 = (ModelItemFee) findViewById(e.acapbo_amount_item);
        this.f34823q0 = (ModelItemFee) findViewById(e.itemDiscount);
        this.f34824r0 = (ModelUsePointsWithSwitch) findViewById(e.acapbo_point_used_item);
        this.f34826t0 = (ModelPreviewPaymentMethodItem) findViewById(e.acapbo_bank_card_item);
        this.f34827u0 = (ImageView) findViewById(e.acapbo_payee_icon);
        this.f34828v0 = (TextView) findViewById(e.acapbo_payee_name);
        ModelCouponItem modelCouponItem = (ModelCouponItem) findViewById(e.itemCoupon);
        this.f34829w0 = modelCouponItem;
        a aVar = this.f34818B0;
        modelCouponItem.setOnClickListener(aVar);
        this.f34819Y.setEnabled(false);
        this.f34819Y.setOnClickListener(aVar);
        this.f34824r0.setOnCheckedChangeListener(new C0145l(this, 5));
        this.f34826t0.setOnClickListener(aVar);
        this.f34819Y.setEnabled(false);
        BarUtils.setStatusBarLightMode((Activity) this, true);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void showPreviewPayInfo(PaymentMethod paymentMethod, PreviewPayInfoResp.DataBean dataBean) {
        this.f34817A0 = dataBean;
        if (dataBean != null) {
            setPayAmount(dataBean.payAmount);
            this.f34819Y.setText(getString(k.core_pay_amount, BaseApplication.getCurrencySymbol(), r0.A(this.f34817A0.payAmount)));
        }
        if (this.f34817A0 == null) {
            R();
        } else {
            this.f34829w0.setVisibility(0);
            this.f34825s0.setAmount(this.f34817A0.payAmount);
            this.f34825s0.d(getString(k.core_to_s1, this.f34832z0));
            this.f34828v0.setText(this.f34817A0.shopName);
            ModelItemFee modelItemFee = this.f34820Z;
            PreviewPayInfoResp.DataBean dataBean2 = this.f34817A0;
            modelItemFee.e(dataBean2.fee, dataBean2.vat);
            this.f34821k0.setContent(this.f34817A0.returnPoint + "");
            ModelUsePointsWithSwitch modelUsePointsWithSwitch = this.f34824r0;
            PreviewPayInfoResp.DataBean dataBean3 = this.f34817A0;
            modelUsePointsWithSwitch.f((long) dataBean3.deductionPoint, r0.A(dataBean3.deductionPointAmount));
            if (this.f34824r0.f28430j.isChecked()) {
                ModelUsePointsWithSwitch modelUsePointsWithSwitch2 = this.f34824r0;
                PreviewPayInfoResp.DataBean dataBean4 = this.f34817A0;
                modelUsePointsWithSwitch2.f(dataBean4.deductionPoint, r0.A(dataBean4.deductionPointAmount));
            } else {
                this.f34824r0.f(0L, "0");
            }
            if (this.f34817A0.deductionPointAmount <= 0) {
                this.f34824r0.setVisibility(8);
            } else {
                this.f34824r0.setVisibility(0);
            }
            if (this.f34817A0.discountAmount > 0) {
                this.f34823q0.setVisibility(0);
                this.f34823q0.setContent("- " + r0.B(this.f34817A0.discountAmount, true));
            } else {
                this.f34823q0.setVisibility(8);
            }
            this.f34824r0.setPointExchangeRate((int) this.f34817A0.exchangeRate);
            if (this.f34817A0.returnPoint <= 0) {
                this.f34821k0.setVisibility(8);
            } else {
                this.f34821k0.setVisibility(0);
            }
            PreviewPayInfoResp.DataBean dataBean5 = this.f34817A0;
            q(dataBean5.couponId, dataBean5.couponAmount);
            this.f34829w0.setVisibility(0);
            this.f34829w0.setAvailableCouponCount(this.f27779A);
            this.f34829w0.setCoupon(this.f27790e);
            this.f34829w0.setCouponDeductAmount(this.f34817A0.couponAmount);
        }
        PaymentMethod paymentMethod2 = this.f27789d;
        if (paymentMethod2 == null) {
            this.f34819Y.setEnabled(false);
            return;
        }
        if (paymentMethod2.senderAccountType != 1) {
            Q(true);
            return;
        }
        PreviewPayInfoResp.DataBean dataBean6 = this.f34817A0;
        if (dataBean6 == null) {
            Q(true);
        } else if (paymentMethod2.availableBalance < dataBean6.payAmount) {
            Q(false);
        } else {
            Q(true);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    /* JADX INFO: renamed from: t */
    public final String getF27552C0() {
        return TransType.TRANS_TYPE_P2P_CASH_OUT;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final PreviewPayInfoV2Req v() {
        PreviewPayInfoV2Req previewPayInfoV2Req = new PreviewPayInfoV2Req();
        previewPayInfoV2Req.orderAmount = this.f34830x0;
        previewPayInfoV2Req.orderType = TransType.TRANS_TYPE_P2P_CASH_OUT;
        try {
            previewPayInfoV2Req.transType = TransType.TRANS_TYPE_PAY_MONEY_TO_PALMPAY_BUSINESS;
        } catch (NumberFormatException e10) {
            d.c(this.TAG, "queryPreViewInfo: ", e10);
        }
        boolean zIsChecked = this.f34824r0.f28430j.isChecked();
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
