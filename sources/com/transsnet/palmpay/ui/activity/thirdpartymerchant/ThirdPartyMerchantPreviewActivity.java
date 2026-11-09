package com.transsnet.palmpay.ui.activity.thirdpartymerchant;

import A8.g;
import Ac.e;
import Ac.f;
import Fe.s0;
import Pa.r0;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.core.viewmodel.ModelPreviewPaymentMethodItem;
import com.transsnet.palmpay.core.viewmodel.ModelUsePointsWithSwitch;
import com.transsnet.palmpay.core.viewmodel.PreviewTitleView;
import com.transsnet.palmpay.main.export.bean.req.MerchantOrderCompleteReq;
import com.transsnet.palmpay.main.export.bean.req.MerchantOrderPreviewReq;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantOrderPreviewResp;
import com.transsnet.palmpay.ui.mvp.contract.ThirdPartyMerchantPreviewContract$IView;
import com.transsnet.palmpay.util.ToastUtils;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/third_party_merchant_preview")
public class ThirdPartyMerchantPreviewActivity extends AbstractActivityC1479m implements ThirdPartyMerchantPreviewContract$IView, View.OnClickListener {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f35020w0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public PreviewTitleView f35021Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ModelItemFee f35022Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ModelItemFee f35023k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ModelItemFee f35024p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ModelUsePointsWithSwitch f35025q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ModelItemFee f35026r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ModelPreviewPaymentMethodItem f35027s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Button f35028t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f35029u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public MerchantOrderPreviewResp f35030v0;

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final int D() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final void N() {
        this.f35029u0 = getIntent().getStringExtra("orderNo");
        MerchantOrderPreviewReq merchantOrderPreviewReq = new MerchantOrderPreviewReq();
        merchantOrderPreviewReq.setCountryCode(BaseApplication.getCountryLocale());
        merchantOrderPreviewReq.setCurrency(BaseApplication.getCurrency());
        merchantOrderPreviewReq.setOrderNo(this.f35029u0);
        merchantOrderPreviewReq.setIsRedeemPoint(this.f35025q0.f28430j.isChecked());
        merchantOrderPreviewReq.setPayerAccountType(String.valueOf(1));
        showLoadingView(true);
        ((s0) this.f27350a).queryPaymentMethod(merchantOrderPreviewReq);
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final void O(PreviewPayInfoResp.DataBean dataBean) {
        ModelPreviewPaymentMethodItem modelPreviewPaymentMethodItem = this.f35027s0;
        if (modelPreviewPaymentMethodItem == null) {
            return;
        }
        modelPreviewPaymentMethodItem.setPaymentMethod(this.f27789d);
        Q();
    }

    public final void Q() {
        if (this.f27789d == null) {
            return;
        }
        MerchantOrderPreviewReq merchantOrderPreviewReq = new MerchantOrderPreviewReq();
        merchantOrderPreviewReq.setCountryCode(BaseApplication.getCountryLocale());
        merchantOrderPreviewReq.setCurrency(BaseApplication.getCurrency());
        merchantOrderPreviewReq.setOrderNo(this.f35029u0);
        merchantOrderPreviewReq.setIsRedeemPoint(this.f35025q0.f28430j.isChecked());
        merchantOrderPreviewReq.setPayerAccountType(String.valueOf(this.f27789d.senderAccountType));
        ((s0) this.f27350a).queryPreviewPayInfo(merchantOrderPreviewReq);
    }

    public final void R(MerchantOrderPreviewResp merchantOrderPreviewResp) {
        this.f35030v0 = merchantOrderPreviewResp;
        if (merchantOrderPreviewResp == null) {
            this.f35024p0.setVisibility(8);
            this.f35025q0.setVisibility(8);
            this.f35026r0.setVisibility(8);
            this.f35028t0.setText(k.core_pay);
            this.f35028t0.setEnabled(false);
            this.f35021Y.setAmount(0L);
            return;
        }
        this.f35021Y.setAmount(r0.L(20, 37, 37, merchantOrderPreviewResp.getPayAmount()));
        this.f35021Y.d(merchantOrderPreviewResp.getMerchantName());
        this.f35022Z.setContent(this.f35029u0);
        this.f35023k0.setContent(r0.B(merchantOrderPreviewResp.getOrderAmount(), true));
        this.f35024p0.setContent(r0.B(merchantOrderPreviewResp.getFee(), true));
        this.f35024p0.e(merchantOrderPreviewResp.getFee(), merchantOrderPreviewResp.getVat());
        this.f35024p0.setVisibility(merchantOrderPreviewResp.getVat() + merchantOrderPreviewResp.getFee() > 0 ? 0 : 8);
        if (merchantOrderPreviewResp.getDeductionPoint() <= 0) {
            this.f35025q0.f(merchantOrderPreviewResp.getDeductionPoint(), r0.A(merchantOrderPreviewResp.getDeductionPointAmount()));
            this.f35025q0.setVisibility(8);
        } else {
            if (this.f35025q0.f28430j.isChecked()) {
                this.f35025q0.f(merchantOrderPreviewResp.getDeductionPoint(), r0.A(merchantOrderPreviewResp.getDeductionPointAmount()));
            } else {
                this.f35025q0.f(0L, r0.A(0L));
            }
            this.f35025q0.setVisibility(0);
            this.f35025q0.setPointExchangeRate(merchantOrderPreviewResp.getExchangeRate());
        }
        if (merchantOrderPreviewResp.getReturnPoint() > 0) {
            this.f35026r0.setContent(r0.x0(merchantOrderPreviewResp.getReturnPoint()));
            this.f35026r0.setVisibility(0);
        } else {
            this.f35026r0.setContent(r0.x0(merchantOrderPreviewResp.getReturnPoint()));
            this.f35026r0.setVisibility(8);
        }
        this.f35028t0.setText(getString(k.core_confirm_pay_format, r0.B(merchantOrderPreviewResp.getPayAmount(), true)));
        PaymentMethod paymentMethod = this.f27789d;
        if (paymentMethod != null) {
            boolean z3 = paymentMethod.payType != 1 || ((long) merchantOrderPreviewResp.getPayAmount()) <= this.f27789d.availableBalance;
            this.f35027s0.d(z3);
            this.f35028t0.setEnabled(z3);
            if (z3) {
                return;
            }
            K();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_merchant_preview_confirm_activity;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getOrderAmount */
    public final long getF29670u0() {
        return 0L;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getTransType */
    public final String getF27551B0() {
        return TransType.TRANS_TYPE_THIRD_PARTY_MERCHANT;
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new s0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == e.itemPaymentMethod) {
            L();
            return;
        }
        if (id2 != e.merchant_confirm_btn || this.f35030v0 == null) {
            return;
        }
        MerchantOrderCompleteReq merchantOrderCompleteReq = new MerchantOrderCompleteReq();
        merchantOrderCompleteReq.setLoyaltyAmount(this.f35030v0.getDeductionPointAmount());
        merchantOrderCompleteReq.setLoyaltyPoint(this.f35030v0.getDeductionPoint());
        merchantOrderCompleteReq.setOrderNo(this.f35029u0);
        merchantOrderCompleteReq.setPayAmount(this.f35030v0.getPayAmount());
        merchantOrderCompleteReq.setPayeeAmount(this.f35030v0.getPayeeAmount());
        merchantOrderCompleteReq.setPayeeFee(this.f35030v0.getPayeeFee());
        merchantOrderCompleteReq.setPayeeVat(this.f35030v0.getPayeeVat());
        merchantOrderCompleteReq.setPayerFee(this.f35030v0.getFee());
        merchantOrderCompleteReq.setPayerVat(this.f35030v0.getVat());
        merchantOrderCompleteReq.setReturnPoint(this.f35030v0.getReturnPoint());
        merchantOrderCompleteReq.setTotalAmount(this.f35030v0.getTotalAmount());
        showLoadingDialog(true);
        ((s0) this.f27350a).completeMerchantOrder(merchantOrderCompleteReq);
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        this.f35021Y.setAmount(0L);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void setDefaultMethod(PaymentMethod paymentMethod) {
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        this.f35021Y = (PreviewTitleView) findViewById(e.previewTitle);
        this.f35022Z = (ModelItemFee) findViewById(e.merchant_id);
        this.f35023k0 = (ModelItemFee) findViewById(e.merchant_amount);
        this.f35024p0 = (ModelItemFee) findViewById(e.merchant_fee);
        this.f35025q0 = (ModelUsePointsWithSwitch) findViewById(e.merchant_points_use);
        this.f35026r0 = (ModelItemFee) findViewById(e.merchant_points_earn);
        this.f35027s0 = (ModelPreviewPaymentMethodItem) findViewById(e.itemPaymentMethod);
        this.f35028t0 = (Button) findViewById(e.merchant_confirm_btn);
        this.f35025q0.setOnCheckedChangeListener(new g(this, 13));
        this.f35028t0.setOnClickListener(this);
        this.f35027s0.setOnClickListener(this);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ThirdPartyMerchantPreviewContract$IView
    public final void showMerchantOrder(CommonResult commonResult) {
        showLoadingDialog(false);
        if (!commonResult.isSuccess()) {
            ToastUtils.showLong(commonResult.getRespMsg());
            return;
        }
        String str = this.f35029u0;
        long payAmount = this.f35030v0.getPayAmount();
        this.f27793i = str;
        setPayAmount(payAmount);
        E();
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ThirdPartyMerchantPreviewContract$IView
    public final void showMerchantOrderError(String str) {
        showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void showPreviewPayInfo(PaymentMethod paymentMethod, PreviewPayInfoResp.DataBean dataBean) {
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ThirdPartyMerchantPreviewContract$IView
    public final void showPreviewPayInfoError(String str) {
        showLoadingDialog(false);
        R(null);
        ToastUtils.showLong(str);
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    /* JADX INFO: renamed from: t */
    public final String getF27552C0() {
        return TransType.TRANS_TYPE_BIND_REPAY_CARD;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final PreviewPayInfoV2Req v() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.ui.mvp.contract.ThirdPartyMerchantPreviewContract$IView
    public final void showPreviewPayInfo(CommonBeanResult commonBeanResult) {
        showLoadingDialog(false);
        if (commonBeanResult.isSuccess()) {
            R((MerchantOrderPreviewResp) commonBeanResult.data);
        } else {
            R(null);
            ToastUtils.showLong(commonBeanResult.getRespMsg());
        }
    }
}
