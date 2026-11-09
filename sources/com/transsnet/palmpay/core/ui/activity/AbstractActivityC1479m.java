package com.transsnet.palmpay.core.ui.activity;

import Fe.h0;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.transsnet.adsdk.AdManager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.PaymentMethodResp;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.bill.TransTypeUtils;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.DefaultPayMethodReq;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.bean.req.QueryCouponByConditionReq;
import com.transsnet.palmpay.core.bean.req.USSDFundResultReq;
import com.transsnet.palmpay.core.bean.rsp.LimitAmountResp;
import com.transsnet.palmpay.core.bean.rsp.OkCardPreCreditInfoRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp;
import com.transsnet.palmpay.core.bean.rsp.QueryUserCouponsRsp;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.dialog.CoreSelectCouponForPaymentDialog;
import com.transsnet.palmpay.core.dialog.FundBalancePromptDialog;
import com.transsnet.palmpay.core.dialog.SelectBankDialogV2;
import com.transsnet.palmpay.core.dialog.SelectPayMethodDialog;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.dialog.ConfirmPaymentFeeDialog;
import com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.core.viewmodel.ModelApplyOkCard;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentExtendPreviewActivity;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1479m extends com.transsnet.palmpay.core.base.i implements SelectPaymentContract$IView, CoreSelectCouponForPaymentDialog.CallBack, SelectPayMethodDialog.CallBack, SelectBankDialogV2.CallBack, ConfirmPaymentFeeDialog.IConfirmPay {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f27779A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f27780B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f27781C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f27782H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Object f27783L;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f27786X;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SelectPayMethodDialog f27787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f27788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PaymentMethod f27789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CouponItem f27790e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PreviewPayInfoV2Req f27794j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f27795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f27796p;
    public SelectBankDialogV2 t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f27797v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f27798w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f27791f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f27792g = -1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final org.sufficientlysecure.htmltextview.h f27784M = new org.sufficientlysecure.htmltextview.h(5);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final p183m6.j f27785Q = new p183m6.j(this, 16);

    public final void A(int i7) {
        ARouter.getInstance().build("/coreImpl/add_new_card").withString("extra_data_1", getLocalClassName()).withInt("extra_type", i7).navigation();
    }

    /* JADX INFO: renamed from: B */
    public boolean getF27555F0() {
        return this instanceof CLRepaymentExtendPreviewActivity;
    }

    public final boolean C() {
        return this.f27790e != null;
    }

    public int D() {
        return 1;
    }

    public final void E() {
        PaymentMethod paymentMethod = this.f27789d;
        if (paymentMethod == null) {
            ToastUtils.showLong(p025ba.k.core_msg_select_payment_method);
            payProcessUnexpectedStop(FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE, "pay method is null");
            return;
        }
        this.f27784M.getClass();
        if ((28 != paymentMethod.senderAccountType && paymentMethod.payType != 36) || !this.f27789d.needSign) {
            P();
            return;
        }
        showLoadingView(false);
        getWindow().getDecorView().setVisibility(4);
        this.f27783L = new Object();
        AbstractActivityC1479m abstractActivityC1479m = (AbstractActivityC1479m) this.f27785Q.f39520b;
        OkCardPreCreditInfoRsp okCardPreCreditInfoRsp = abstractActivityC1479m.f27787b.mOkCardPreCreditInfo;
        if (okCardPreCreditInfoRsp == null) {
            return;
        }
        ARouter.getInstance().build("/credit_score/oc_apply_lite_activity").withLong("extra_data_1", okCardPreCreditInfoRsp.okCardPreCreditAmount).withLong("extra_data_2", okCardPreCreditInfoRsp.okCardPreCreditDiscountAmount).withString("CORE_FROM", "BasePreviewActivity").navigation(abstractActivityC1479m, 4097);
    }

    public final void F(PreviewPayInfoResp.DataBean dataBean) {
        if (r0.U0()) {
            return;
        }
        String transType = getF27551B0();
        if (getF27555F0()) {
            if (this.f27789d == null) {
                ToastUtils.showLong(p025ba.k.core_msg_select_payment_method);
                return;
            }
            if (this.f27350a == null || dataBean == null) {
                return;
            }
            QueryCouponByConditionReq queryCouponByConditionReq = new QueryCouponByConditionReq();
            queryCouponByConditionReq.setOrderAmt(getF29089u0());
            queryCouponByConditionReq.setTransType(transType);
            queryCouponByConditionReq.setFeePlusVat(dataBean.fee + dataBean.vat);
            queryCouponByConditionReq.setUseAccountType(String.valueOf(this.f27789d.senderAccountType));
            queryCouponByConditionReq.setCustomerId(this.f27795o);
            queryCouponByConditionReq.setBusinessPhone(z());
            queryCouponByConditionReq.setProductId(null);
            queryCouponByConditionReq.setInstitutionId(this.f27796p);
            queryCouponByConditionReq.setOrderId(this.f27793i);
            showLoadingDialog(true);
            ((La.F) this.f27350a).queryCoupons(queryCouponByConditionReq);
        }
    }

    public final void G() {
        DefaultPayMethodReq defaultPayMethodReq = new DefaultPayMethodReq();
        defaultPayMethodReq.transType = getF27551B0();
        defaultPayMethodReq.payeeAccountType = u();
        defaultPayMethodReq.orderAmount = getF29089u0();
        defaultPayMethodReq.isRedeemPoint = true;
        defaultPayMethodReq.isUseCoupon = true;
        defaultPayMethodReq.businessPhone = z();
        defaultPayMethodReq.productId = null;
        defaultPayMethodReq.institutionId = this.f27796p;
        defaultPayMethodReq.ltem = r();
        defaultPayMethodReq.coins = getF27558I0();
        defaultPayMethodReq.senderAccountType = 0;
        defaultPayMethodReq.orderId = this.f27793i;
        defaultPayMethodReq.subTransTypeCode = y();
        String str = this.f27782H;
        if (!TextUtils.isEmpty(str)) {
            defaultPayMethodReq.calculationExtInfo = str;
        }
        o(defaultPayMethodReq);
        La.F f10 = (La.F) this.f27350a;
        J3.a.B(f10, (SelectPaymentContract$IView) f10.f27351a, new La.B(defaultPayMethodReq, 1), new La.C(f10, 9), new La.C(f10, 10), false, false);
    }

    public final void H(int i7) {
        if (this.f27350a != null) {
            String transType = getF27551B0();
            if (!TransTypeUtils.isUseNewPaymentMethod(transType)) {
                if (1 == i7) {
                    ((La.F) this.f27350a).c(0, transType, u(), this.f27793i);
                    showLoadingDialog(true);
                    G();
                    return;
                } else {
                    PreviewPayInfoV2Req previewPayInfoV2Req = this.f27794j;
                    if (previewPayInfoV2Req != null) {
                        previewPayInfoV2Req.transType = transType;
                        ((La.F) this.f27350a).queryPaymentMethod(previewPayInfoV2Req);
                        return;
                    }
                    return;
                }
            }
            showLoadingDialog(true);
            DefaultPayMethodReq defaultPayMethodReq = new DefaultPayMethodReq();
            defaultPayMethodReq.transType = getF27551B0();
            defaultPayMethodReq.payeeAccountType = u();
            defaultPayMethodReq.orderAmount = getF29089u0();
            defaultPayMethodReq.isRedeemPoint = true;
            defaultPayMethodReq.isUseCoupon = true;
            defaultPayMethodReq.businessPhone = z();
            defaultPayMethodReq.customerId = this.f27795o;
            defaultPayMethodReq.productId = null;
            defaultPayMethodReq.institutionId = this.f27796p;
            defaultPayMethodReq.ltem = r();
            defaultPayMethodReq.coins = getF27558I0();
            defaultPayMethodReq.bestSenderAccountType = 0;
            defaultPayMethodReq.orderId = this.f27793i;
            defaultPayMethodReq.usePayDiscount = true;
            String str = this.f27782H;
            if (!TextUtils.isEmpty(str)) {
                defaultPayMethodReq.calculationExtInfo = str;
            }
            o(defaultPayMethodReq);
            La.F f10 = (La.F) this.f27350a;
            J3.a.B(f10, (SelectPaymentContract$IView) f10.f27351a, new La.B(defaultPayMethodReq, 0), new La.C(f10, 6), new La.C(f10, 8), false, false);
        }
    }

    public final void I(PreviewPayInfoResp.DataBean dataBean) {
        if (dataBean != null) {
            this.f27781C = dataBean.cacheKey;
            this.f27779A = dataBean.availableCoupon;
        }
    }

    public final void J(String str, String str2) {
        F6.d.h(this.TAG, 3, "showAlertDialog >>> code=" + str + ", message=" + ((Object) str2));
        O6.c cVar = new O6.c(this);
        cVar.e(p025ba.k.core_title_error_info);
        cVar.f6598d = str2;
        cVar.f6605k = true;
        if ((!TextUtils.isEmpty(str) && str.startsWith("CFRONT_TCE")) || CommonResult.CODE_ACCOUNT_STATE_ERROR.equalsIgnoreCase(str) || CommonResult.CODE_OUT_OF_TRANSACTION_LIMIT_ERROR.equalsIgnoreCase(str)) {
            cVar.d(p025ba.k.core_confirm, new W8.d(29));
        } else {
            cVar.d(p025ba.k.core_confirm, new ViewOnClickListenerC1477k(this, 1));
        }
        O6.d dVarA = cVar.a();
        dVarA.setCancelable(false);
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.show();
    }

    public final void K() {
        PaymentMethod paymentMethod = this.f27789d;
        if (paymentMethod == null || paymentMethod.senderAccountType != 1) {
            return;
        }
        FundBalancePromptDialog fundBalancePromptDialog = new FundBalancePromptDialog(this);
        fundBalancePromptDialog.setCancelable(true);
        fundBalancePromptDialog.setCanceledOnTouchOutside(true);
        fundBalancePromptDialog.show();
        fundBalancePromptDialog.setAmount(this.f27789d.availableBalance);
    }

    public void L() {
        M(7);
    }

    public final void M(int i7) {
        if (this.f27787b == null) {
            SelectPayMethodDialog selectPayMethodDialog = new SelectPayMethodDialog(this);
            this.f27787b = selectPayMethodDialog;
            selectPayMethodDialog.setCallBack(this);
        }
        this.f27787b.setTransType(getF27551B0());
        this.f27787b.setPaymentMethodOptions(i7);
        List<PaymentMethod> list = this.f27788c;
        if (list != null) {
            this.f27787b.setPayMethods(list);
            PaymentMethod paymentMethod = this.f27789d;
            if (paymentMethod != null) {
                this.f27787b.setSelectedPayMethod(paymentMethod);
            }
        }
        if (this.f27789d == null) {
            BaseApplication.isNG();
        }
        if (this.f27791f < 0) {
            this.f27787b.setPayAmount(getF29089u0());
        }
        this.f27787b.show();
    }

    public abstract void N();

    public abstract void O(PreviewPayInfoResp.DataBean dataBean);

    public final void P() {
        if (this.f27350a == null) {
            payProcessUnexpectedStop(FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE, "presenter is null");
            return;
        }
        PayByOrderReq payByOrderReq = new PayByOrderReq();
        payByOrderReq.amount = this.f27791f;
        payByOrderReq.currency = BaseApplication.getCurrency();
        payByOrderReq.orderNo = this.f27793i;
        payByOrderReq.orderType = getF27552C0();
        PaymentMethod paymentMethod = this.f27789d;
        payByOrderReq.payType = paymentMethod.payType;
        payByOrderReq.payerAccountId = paymentMethod.accountId;
        payByOrderReq.payerCardCvv = paymentMethod.cvv;
        payByOrderReq.payerCardPin = paymentMethod.cardPin;
        payByOrderReq.payerCardExpiryMon = paymentMethod.expiryMonth;
        payByOrderReq.payerCardExpiryYear = paymentMethod.expiryYear;
        payByOrderReq.payerCardNo = paymentMethod.cardNo;
        payByOrderReq.payerBankCode = paymentMethod.bankCode;
        payByOrderReq.payerBankName = paymentMethod.bankName;
        payByOrderReq.reUseable = paymentMethod.reUseable;
        payByOrderReq.buyEarlyRefundByTime = p();
        if (!TextUtils.isEmpty(w())) {
            payByOrderReq.payerMessage = w();
        }
        if (payByOrderReq.payType == 11) {
            PaymentMethod paymentMethod2 = this.f27789d;
            payByOrderReq.walletChannel = paymentMethod2.bankCode;
            payByOrderReq.walletPhone = paymentMethod2.bankAccountNo;
        }
        payByOrderReq.transType = getF27551B0();
        payByOrderReq.cacheKey = this.f27781C;
        showLoadingDialog(true, false);
        getF27552C0();
        if (TransTypeUtils.isUseNewCashierDesk(payByOrderReq.transType)) {
            ((La.F) this.f27350a).payByNewOrderNo(payByOrderReq);
        } else {
            ((La.F) this.f27350a).payByOrderNo(payByOrderReq);
        }
        if (this.f27789d.payType == 2) {
            n0.g().k(new ClickEvent(n0.h(getF27552C0(), !TextUtils.isEmpty(this.f27789d.accountId))).afEvt(true));
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final boolean checkShowOkCardPreCreditInfo() {
        return s() != null;
    }

    public void confirmPay() {
    }

    /* JADX INFO: renamed from: getOrderAmount */
    public abstract long getF29089u0();

    /* JADX INFO: renamed from: getPalmPointsAmount */
    public long getF27558I0() {
        return 0L;
    }

    /* JADX INFO: renamed from: getTransType */
    public abstract String getF27551B0();

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void handleCommonPreviewInfo(PreviewPayInfoResp.DataBean dataBean) {
        if (dataBean != null) {
            this.f27779A = dataBean.availableCoupon;
            this.f27781C = dataBean.cacheKey;
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void handleOkCardPreCreditInfo(OkCardPreCreditInfoRsp data) {
        int i7;
        ModelApplyOkCard modelApplyOkCardS = s();
        if (modelApplyOkCardS != null) {
            Intrinsics.checkNotNullParameter(data, "data");
            modelApplyOkCardS.f28244f = data;
            modelApplyOkCardS.e(data.okCardPreCreditTags);
            modelApplyOkCardS.d(data.okCardPreCreditDesc);
            boolean z3 = false;
            modelApplyOkCardS.c(r0.B(data.okCardPreCreditAmount, false));
            if (data.okCardPreCreditFlag && (((i7 = data.applyStatus) == -1 || i7 == 2) && !modelApplyOkCardS.f28245g)) {
                z3 = true;
            }
            p220oa.h.s(modelApplyOkCardS, z3);
            this.f27787b.setOkCardPreCreditInfo(data);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void handlePaymentMethodActivityText(List list) {
        SelectPayMethodDialog selectPayMethodDialogX = x();
        this.f27787b = selectPayMethodDialogX;
        selectPayMethodDialogX.setActivityConfigs(list);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void handleQueryCouponRsp(QueryUserCouponsRsp queryUserCouponsRsp) {
        int i7;
        showLoadingDialog(false);
        if (!queryUserCouponsRsp.isSuccess()) {
            ToastUtils.showLong(queryUserCouponsRsp.getRespMsg());
            return;
        }
        if (queryUserCouponsRsp.getData() == null || queryUserCouponsRsp.getData().getList() == null) {
            return;
        }
        List<CouponItem> list = queryUserCouponsRsp.getData().getList();
        if (list.isEmpty()) {
            i7 = 0;
        } else {
            Iterator<CouponItem> it = list.iterator();
            i7 = 0;
            while (it.hasNext()) {
                if (it.next().available) {
                    i7++;
                }
            }
        }
        this.f27779A = i7;
        if (!list.isEmpty()) {
            User user = BaseApplication.getInstance().getUser();
            boolean z3 = (user == null || TextUtils.isEmpty(user.getPhoneNumber()) || !user.getPhoneNumber().equals(z())) ? false : true;
            for (CouponItem couponItem : list) {
                if (TextUtils.isEmpty(z())) {
                    couponItem.showOnlyMeErrors = false;
                } else if (couponItem.useLimitType != 1 || z3) {
                    couponItem.showOnlyMeErrors = false;
                } else {
                    couponItem.showOnlyMeErrors = true;
                }
            }
        }
        CoreSelectCouponForPaymentDialog coreSelectCouponForPaymentDialog = new CoreSelectCouponForPaymentDialog(this);
        PreviewPayInfoV2Req previewPayInfoV2Req = ((La.F) this.f27350a).f5573e;
        if (previewPayInfoV2Req == null) {
            previewPayInfoV2Req = v();
        }
        if (previewPayInfoV2Req == null) {
            previewPayInfoV2Req = new PreviewPayInfoV2Req();
            previewPayInfoV2Req.orderNo = this.f27793i;
            previewPayInfoV2Req.orderAmount = getF29089u0();
            previewPayInfoV2Req.orderType = getF27552C0();
            previewPayInfoV2Req.transType = getF27551B0();
        }
        previewPayInfoV2Req.useDiscount = false;
        previewPayInfoV2Req.useBonus = false;
        previewPayInfoV2Req.isRedeemPoint = false;
        previewPayInfoV2Req.isUseCoupon = true;
        PaymentMethod paymentMethod = this.f27789d;
        if (paymentMethod != null) {
            previewPayInfoV2Req.payerAccountType = String.valueOf(paymentMethod.senderAccountType);
        }
        coreSelectCouponForPaymentDialog.setPreviewPayReq(previewPayInfoV2Req);
        coreSelectCouponForPaymentDialog.setCallBack(this);
        coreSelectCouponForPaymentDialog.setCoupons(list);
        CouponItem couponItem2 = this.f27790e;
        if (couponItem2 != null) {
            coreSelectCouponForPaymentDialog.setDefaultCouponId(couponItem2.couponId);
        }
        coreSelectCouponForPaymentDialog.setTransType(getF27551B0());
        coreSelectCouponForPaymentDialog.show();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public void initData() {
        this.f27787b = x();
        org.greenrobot.eventbus.c.b().j(this);
        this.f27788c = new ArrayList();
        SelectBankDialogV2 selectBankDialogV2 = new SelectBankDialogV2(this);
        this.t = selectBankDialogV2;
        selectBankDialogV2.setCallBack(this);
        HashMap map = new HashMap();
        map.put(LogConstants.Autotrack.ELEMENT_TRANS_TYPE, getF27551B0());
        AutoTrackUtil.trackActivityProperties(this, map);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public boolean isMainBusiness() {
        return true;
    }

    public final boolean m(PreviewPayInfoResp.FeeTips feeTips) {
        if (this.f27786X || feeTips == null || !"1".equals(feeTips.showConfirmPaymentTipsFlag) || TextUtils.isEmpty(feeTips.confirmPaymentTips)) {
            return false;
        }
        this.f27786X = true;
        ConfirmPaymentFeeDialog confirmPaymentFeeDialog = new ConfirmPaymentFeeDialog(this, feeTips.confirmPaymentTips);
        confirmPaymentFeeDialog.show();
        confirmPaymentFeeDialog.setConfrimPayEvent(this);
        return true;
    }

    public final void n(PaymentMethod paymentMethod) {
        if (this.f27788c == null) {
            this.f27788c = new ArrayList();
        }
        List list = this.f27788c;
        for (int i7 = 0; i7 < list.size(); i7++) {
            PaymentMethod paymentMethod2 = (PaymentMethod) list.get(i7);
            if (paymentMethod2 != null) {
                if (paymentMethod.payType == 1 && paymentMethod2.payType == 1) {
                    return;
                }
                if (!TextUtils.isEmpty(paymentMethod.cardNo) && paymentMethod.cardNo.equals(paymentMethod2.cardNo)) {
                    return;
                }
                if (!TextUtils.isEmpty(paymentMethod.accountId) && paymentMethod.accountId.equals(paymentMethod2.accountId)) {
                    return;
                }
                if (!TextUtils.isEmpty(paymentMethod.bankAccountNo) && paymentMethod.bankAccountNo.equals(paymentMethod2.bankAccountNo)) {
                    return;
                }
            }
        }
        PaymentMethod paymentMethod3 = this.f27788c.size() > 0 ? (PaymentMethod) this.f27788c.get(0) : null;
        if (paymentMethod3 == null || paymentMethod3.senderAccountType != 1) {
            this.f27788c.add(0, paymentMethod);
        } else {
            this.f27788c.add(1, paymentMethod);
        }
    }

    public void o(DefaultPayMethodReq defaultPayMethodReq) {
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 4097 && i10 == -1) {
            org.sufficientlysecure.htmltextview.h hVar = this.f27784M;
            PaymentMethod paymentMethod = this.f27789d;
            hVar.getClass();
            if (paymentMethod != null && (28 == paymentMethod.senderAccountType || paymentMethod.payType == 36)) {
                this.f27789d.needSign = false;
            }
            showLoadingView(true);
            P();
        }
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onAddNewBankAccountClick() {
        A(2);
        this.f27787b.dismiss();
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onAddNewBankCardClick() {
        A(1);
        this.f27787b.dismiss();
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onAddNewBankCardOrBankAccountClick() {
        A(1);
        this.f27787b.dismiss();
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectBankDialogV2.CallBack
    public final void onChooseBankClick(BankInfo bankInfo) {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.bankCode = bankInfo.bankCode;
        paymentMethod.bankName = bankInfo.bankName;
        paymentMethod.bankUrl = bankInfo.bankUrl;
        paymentMethod.countryCode = bankInfo.countryCode;
        paymentMethod.payType = 13;
        paymentMethod.senderAccountType = 23;
        if (this.f27787b != null) {
            this.f27787b = null;
            this.f27787b = x();
        }
        n(paymentMethod);
        this.f27789d = paymentMethod;
        O(null);
        this.f27787b.setSelectedPayMethod(this.f27789d);
        this.t.dismiss();
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onChoosePayMethodClick(PaymentMethod paymentMethod, PreviewPayInfoResp.DataBean dataBean) {
        if (paymentMethod == null) {
            return;
        }
        long j6 = paymentMethod.availableBalance;
        long orderAmount = this.f27791f;
        if (orderAmount < 0) {
            orderAmount = getF29089u0();
        }
        if (j6 < orderAmount) {
            int i7 = paymentMethod.senderAccountType;
            if (i7 == 27) {
                return;
            }
            if (i7 == 1) {
                com.palmpay.lib.apm.launchcounter.util.d.F("/cashin_out/add_money");
                this.f27787b.setSelectedPayMethod(this.f27789d);
                this.f27787b.dismiss();
                return;
            }
        }
        this.f27789d = paymentMethod;
        this.f27787b.dismiss();
        if (dataBean != null && TransTypeUtils.isUseNewQueryPaymentMethodDialog(getF27551B0())) {
            handleCommonPreviewInfo(dataBean);
        }
        O(dataBean);
        PaymentMethod paymentMethod2 = this.f27789d;
        if (paymentMethod2 != null) {
            HashMap map = new HashMap();
            map.put(LogConstants.Autotrack.ELEMENT_PAY_METHOD, Integer.valueOf(paymentMethod2.senderAccountType));
            AutoTrackUtil.trackActivityProperties(this, map);
        }
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectBankDialogV2.CallBack
    public final void onClickPayMethod(PaymentMethod paymentMethod) {
    }

    public void onCouponClick(CouponItem couponItem) {
        this.f27790e = couponItem;
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
        IBasePresenter iBasePresenter = this.f27350a;
        if (iBasePresenter != null) {
            ((La.F) iBasePresenter).detachView();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent event) {
        IBasePresenter iBasePresenter;
        int eventType = event.getEventType();
        if (eventType == 7) {
            H(D());
            return;
        }
        if (eventType != 275 && eventType != 283) {
            if (eventType == 344) {
                if (1 == D()) {
                    showLoadingDialog(true);
                    G();
                    return;
                }
                return;
            }
            if (eventType != 291) {
                if (eventType != 292) {
                    return;
                }
                String eventContent = event.getEventContent();
                if ((TextUtils.isEmpty(eventContent) || getLocalClassName().equals(eventContent)) && (iBasePresenter = this.f27350a) != null) {
                    La.F f10 = (La.F) iBasePresenter;
                    long j6 = this.f27791f;
                    String str = this.f27789d.bankCode;
                    String str2 = this.f27798w;
                    String transType = getF27551B0();
                    String str3 = this.f27793i;
                    USSDFundResultReq uSSDFundResultReq = new USSDFundResultReq();
                    uSSDFundResultReq.amout = j6;
                    uSSDFundResultReq.bankCode = str;
                    uSSDFundResultReq.payId = str2;
                    uSSDFundResultReq.transType = transType;
                    ((PayApiService) p324va.c.f43141a.f14621b).getUSSDResult(uSSDFundResultReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new La.q(f10, transType, str3, j6));
                    return;
                }
                return;
            }
        }
        String eventContent2 = event.getEventContent();
        if ((TextUtils.isEmpty(eventContent2) || getLocalClassName().equals(eventContent2)) && (event.getEventObj() instanceof PaymentMethod)) {
            if (this.f27787b != null) {
                this.f27787b = null;
                this.f27787b = x();
            }
            PaymentMethod paymentMethod = (PaymentMethod) event.getEventObj();
            n(paymentMethod);
            this.f27789d = paymentMethod;
            O(null);
            this.f27787b.setSelectedPayMethod(this.f27789d);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f27780B = true;
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.f27783L != null) {
            getWindow().getDecorView().setVisibility(0);
            this.f27783L = null;
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            this.f27789d = (PaymentMethod) bundle.getParcelable("SELECT_PAY_METHOD");
            this.f27791f = bundle.getLong("pay_amount");
            this.f27793i = bundle.getString("orderNo");
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f27780B) {
            this.f27780B = false;
            if (this.f27789d == null && 1 == D()) {
                G();
            }
        }
    }

    @Override // androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("SELECT_PAY_METHOD", this.f27789d);
        bundle.putLong("pay_amount", this.f27791f);
        bundle.putString("orderNo", this.f27793i);
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onUseUSSDClick() {
        this.f27787b.dismiss();
        this.t.show();
    }

    public int p() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.BasePaymentContract.IView
    public final void payProcessUnexpectedStop(String str, String str2) {
        Intrinsics.checkNotNullParameter(this, "context");
        if (str != null) {
            if (str.equals("33000039") || str.equals("33000040") || str.equals("33000041") || str.equals("33000093")) {
                if (str2 == null) {
                    str2 = "";
                }
                i0.i0(this, str, str2, true);
            } else if (FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE.equals(str)) {
                if (str2 == null) {
                    str2 = "";
                }
                F6.d.c("CashierErrorInfo", str2);
            } else {
                if (str2 == null) {
                    str2 = "";
                }
                ToastUtils.showLong(str2, new Object[0]);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        H(D());
        ((La.F) this.f27350a).queryOkCardPreCreditInfo(false);
        IBasePresenter iBasePresenter = this.f27350a;
        if (iBasePresenter != null) {
            La.F f10 = (La.F) iBasePresenter;
            J3.a.D(f10, f10.f27351a, new La.E(1, null), new La.C(f10, 5), new h0(8), false, false);
        }
        N();
        AdManager.preloadSingleAd(this, org.chromium.support_lib_boundary.util.b.z(getF27551B0()), null);
        ModelApplyOkCard view = s();
        if (view != null) {
            int color = getColor(L6.b.ppColorDividerLine);
            Intrinsics.checkNotNullParameter(this, "context");
            Intrinsics.checkNotNullParameter(view, "view");
            ViewParent parent = view.getParent();
            Intrinsics.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setClipChildren(false);
            float f11 = 12;
            ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setAllCorners(new RoundedCornerTreatment()).setAllCornerSizes(SizeUtils.dp2px(f11)).build();
            Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelBuild, "build(...)");
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
            materialShapeDrawable.setTint(getColor(L6.b.ppColorBackgroundLight));
            materialShapeDrawable.setPaintStyle(Paint.Style.FILL);
            materialShapeDrawable.setShadowCompatibilityMode(2);
            materialShapeDrawable.initializeElevationOverlay(view.getContext());
            materialShapeDrawable.setShadowRadius(SizeUtils.dp2px(f11));
            materialShapeDrawable.setShadowColor(color);
            view.setBackground(materialShapeDrawable);
        }
    }

    public final void q(long j6, long j10) {
        if (j6 == 0) {
            this.f27790e = null;
            return;
        }
        CouponItem couponItem = this.f27790e;
        if (couponItem == null || couponItem.couponId != j6) {
            CouponItem couponItem2 = new CouponItem();
            this.f27790e = couponItem2;
            couponItem2.couponId = j6;
            couponItem2.nominaValue = j10;
        }
    }

    public void queryLimitAmountOK(QueryLimitAmountResp queryLimitAmountResp) {
    }

    public String r() {
        return null;
    }

    public ModelApplyOkCard s() {
        return null;
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void setFeeAmount(long j6) {
        this.f27792g = j6;
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void setLimitAmount(LimitAmountResp limitAmountResp) {
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void setPayAmount(long j6) {
        this.f27791f = j6;
        this.f27787b.setPayAmount(j6);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void setUSSDData(List list) {
        this.f27797v = list;
        this.t.setBankCardInfos(list);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public void setupView() {
        initStatusBar(true);
        setWindowBackground(com.transsnet.palmpay.custom_view.p.cv_preview_window_bg);
        View viewFindViewById = findViewById(com.transsnet.palmpay.custom_view.s.ivBack);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC1477k(this, 0));
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.BasePaymentContract.IView
    public final void showPayResult(PayByOrderResp payByOrderResp) {
        showLoadingDialog(false);
        F6.d.h(this.TAG, 3, "showPayResult >>> respCode=" + payByOrderResp.getRespCode());
        if (!payByOrderResp.isSuccess() || payByOrderResp.getData() == null) {
            if (CommonResult.CODE_BALANCE_ACCOUNT_LOCK.equals(payByOrderResp.getRespCode())) {
                com.palmpay.lib.apm.launchcounter.util.d.F("/account/ask_apply_for_balance");
                return;
            }
            if (!CommonResult.CODE_REQUIRE_VERIFY_BVN.equals(payByOrderResp.getRespCode())) {
                String respCode = payByOrderResp.getRespCode();
                if (Intrinsics.c(respCode, "33000039") || Intrinsics.c(respCode, "33000040") || Intrinsics.c(respCode, "33000041") || Intrinsics.c(respCode, "33000093")) {
                    i0.i0(this, payByOrderResp.getRespCode(), payByOrderResp.getRespMsg(), true);
                    return;
                } else {
                    J(payByOrderResp.getRespCode(), payByOrderResp.getRespMsg());
                    return;
                }
            }
            String respMsg = payByOrderResp.getRespMsg();
            O6.c cVar = new O6.c(this);
            cVar.e(p025ba.k.core_tips);
            cVar.f6598d = respMsg;
            cVar.d(p025ba.k.core_add_bvn, new ViewOnClickListenerC1478l(0));
            cVar.c(p025ba.k.core_cancel, null);
            O6.d dVarA = cVar.a();
            dVarA.setOnDismissListener(new Dd.b(this, 18));
            dVarA.show();
            return;
        }
        this.f27798w = payByOrderResp.getData().payId;
        if (!payByOrderResp.getData().flag) {
            String str = payByOrderResp.getData().businessData;
            Integer num = 8;
            if (num.toString().equals(C0525w.j(str, "payStatus"))) {
                Pa.K.c(getF27552C0(), str);
                finish();
                return;
            }
            Integer numH = C0525w.h(str, "extVerifyMethod");
            if (Pa.K.b(numH, getF27552C0(), str)) {
                if (numH.intValue() != 3) {
                    finish();
                    return;
                }
                return;
            }
            Pa.J j6 = new Pa.J();
            j6.f7022a = getF27552C0();
            j6.f7023b = payByOrderResp.getData();
            j6.f7024c = this.f27793i;
            j6.f7025d = getF27551B0();
            j6.f7026e = this.f27791f;
            j6.f7028g = this.f27782H;
            j6.f7027f = y();
            if (Pa.K.a(j6)) {
                finish();
                return;
            }
            return;
        }
        if (!this.f27793i.equals(payByOrderResp.getData().orderNo)) {
            J("", getString(p025ba.k.core_fail_to_pay_order));
            F6.d.c(this.TAG, "orderNo not Match");
            return;
        }
        CheckPayReq checkPayReq = new CheckPayReq();
        checkPayReq.orderNo = payByOrderResp.getData().orderNo;
        checkPayReq.orderType = getF27552C0();
        checkPayReq.payId = payByOrderResp.getData().payId;
        checkPayReq.subPayId = payByOrderResp.getData().subPayId;
        checkPayReq.url = payByOrderResp.getData().url;
        checkPayReq.verifyMethod = payByOrderResp.getData().verifyMethod;
        checkPayReq.payRouteId = payByOrderResp.getData().payRouteId;
        checkPayReq.transType = getF27551B0();
        checkPayReq.otpReference = payByOrderResp.getData().otpReference;
        checkPayReq.payAmount = this.f27791f;
        checkPayReq.orderAmount = getF29089u0();
        checkPayReq.feeAmount = this.f27792g;
        checkPayReq.subTransTypeCode = y();
        d0 d0Var = new d0(this);
        d0Var.f27748b = checkPayReq;
        d0Var.f27751e = this.f27789d;
        d0Var.f27757k = isForceNoNightMode();
        d0Var.f27749c = payByOrderResp;
        d0Var.f27752f = null;
        d0Var.a();
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void showPaymentMethod(PaymentMethodResp paymentMethodResp) {
        List<PaymentMethod> list;
        PaymentMethod paymentMethod;
        List list2;
        if (!paymentMethodResp.isSuccess() || (list = paymentMethodResp.data) == null) {
            showLoadingDialog(false);
            ToastUtils.showLong(paymentMethodResp.getRespMsg());
            return;
        }
        this.f27788c = list;
        if ("2".equals(getF27552C0()) && (list2 = this.f27788c) != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((PaymentMethod) it.next()).senderAccountType == 1) {
                    it.remove();
                }
            }
        }
        if (1 == D()) {
            return;
        }
        long j6 = this.f27791f;
        List list3 = this.f27788c;
        if (list3 != null && !list3.isEmpty()) {
            Iterator it2 = list3.iterator();
            paymentMethod = null;
            PaymentMethod paymentMethod2 = null;
            while (true) {
                if (!it2.hasNext()) {
                    if (paymentMethod != null) {
                        break;
                    }
                    paymentMethod = paymentMethod2;
                    break;
                }
                PaymentMethod paymentMethod3 = (PaymentMethod) it2.next();
                int i7 = paymentMethod3.senderAccountType;
                if (i7 == 20 || i7 == 22 || i7 == 27 || i7 == 28 || i7 == 26) {
                    if (paymentMethod3.availableBalance >= j6) {
                        paymentMethod = paymentMethod3;
                        break;
                    }
                } else if (i7 == 1) {
                    long j10 = paymentMethod3.availableBalance;
                    if (j10 >= j6) {
                        paymentMethod = paymentMethod3;
                        break;
                    } else if (j10 > 0) {
                        paymentMethod2 = paymentMethod3;
                    }
                } else {
                    paymentMethod = paymentMethod3;
                }
            }
        } else {
            paymentMethod = null;
        }
        this.f27789d = paymentMethod;
        O(null);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void showPaymentMethodError(String str) {
        O6.c cVar = new O6.c(this);
        cVar.e(p025ba.k.core_title_error_info);
        cVar.f6598d = str;
        cVar.c(p025ba.k.core_cancel, null);
        cVar.d(p025ba.k.core_try_again, new ViewOnClickListenerC1477k(this, 2));
        cVar.g();
    }

    /* JADX INFO: renamed from: t */
    public abstract String getF27552C0();

    public String u() {
        return null;
    }

    public abstract PreviewPayInfoV2Req v();

    public String w() {
        return null;
    }

    public final SelectPayMethodDialog x() {
        if (this.f27787b == null) {
            SelectPayMethodDialog selectPayMethodDialog = new SelectPayMethodDialog(this);
            this.f27787b = selectPayMethodDialog;
            selectPayMethodDialog.setCallBack(this);
        }
        return this.f27787b;
    }

    public String y() {
        return "";
    }

    public final String z() {
        String transType = getF27551B0();
        return ("04".equals(transType) || TransType.TRANS_TYPE_BUNDLE.equals(transType) || TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW.equals(transType)) ? this.f27795o : "";
    }
}
