package com.transsnet.palmpay.credit.ui.activity.okcard;

import Pa.r0;
import Ya.e;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.core.viewmodel.ModelPreviewPaymentMethodItem;
import com.transsnet.palmpay.core.viewmodel.PreviewTitleView;
import com.transsnet.palmpay.credit.bean.resp.OcOrderData;
import com.transsnet.palmpay.credit.bean.resp.OcOrderRsp;
import com.transsnet.palmpay.credit.contract.OcRepayExtendPreviewContract;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayExtendPreviewActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p235pb.s;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC展期还款收银台", path = "/credit_score/oc_repay_extend_preview_activity")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcRepayExtendPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/m;", "Lpb/s;", "Lcom/transsnet/palmpay/credit/contract/OcRepayExtendPreviewContract$IPreviewView;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepayExtendPreviewActivity extends AbstractActivityC1479m implements OcRepayExtendPreviewContract.IPreviewView {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f29792w0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29793Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29794Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f29795k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f29796p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f29797q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f29798r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f29799s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public long f29800t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f29801u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public PreviewPayInfoResp.DataBean f29802v0;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public OcRepayExtendPreviewActivity() {
        final int i7 = 0;
        this.f29793Y = C2131j.b(new Function0(this) { // from class: ub.e1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendPreviewActivity f42845b;

            {
                this.f42845b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendPreviewActivity ocRepayExtendPreviewActivity = this.f42845b;
                switch (i7) {
                    case 0:
                        int i10 = OcRepayExtendPreviewActivity.f29792w0;
                        return (Button) ocRepayExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i11 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelPreviewPaymentMethodItem) ocRepayExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i12 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i13 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 4:
                        int i14 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 5:
                        int i15 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i16 = OcRepayExtendPreviewActivity.f29792w0;
                        return (PreviewTitleView) ocRepayExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
                }
            }
        });
        final int i10 = 1;
        this.f29794Z = C2131j.b(new Function0(this) { // from class: ub.e1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendPreviewActivity f42845b;

            {
                this.f42845b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendPreviewActivity ocRepayExtendPreviewActivity = this.f42845b;
                switch (i10) {
                    case 0:
                        int i11 = OcRepayExtendPreviewActivity.f29792w0;
                        return (Button) ocRepayExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i12 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelPreviewPaymentMethodItem) ocRepayExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i13 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i14 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 4:
                        int i15 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 5:
                        int i16 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i17 = OcRepayExtendPreviewActivity.f29792w0;
                        return (PreviewTitleView) ocRepayExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
                }
            }
        });
        final int i11 = 2;
        this.f29795k0 = C2131j.b(new Function0(this) { // from class: ub.e1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendPreviewActivity f42845b;

            {
                this.f42845b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendPreviewActivity ocRepayExtendPreviewActivity = this.f42845b;
                switch (i11) {
                    case 0:
                        int i12 = OcRepayExtendPreviewActivity.f29792w0;
                        return (Button) ocRepayExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i13 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelPreviewPaymentMethodItem) ocRepayExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i14 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i15 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 4:
                        int i16 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 5:
                        int i17 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i18 = OcRepayExtendPreviewActivity.f29792w0;
                        return (PreviewTitleView) ocRepayExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
                }
            }
        });
        final int i12 = 3;
        this.f29796p0 = C2131j.b(new Function0(this) { // from class: ub.e1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendPreviewActivity f42845b;

            {
                this.f42845b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendPreviewActivity ocRepayExtendPreviewActivity = this.f42845b;
                switch (i12) {
                    case 0:
                        int i13 = OcRepayExtendPreviewActivity.f29792w0;
                        return (Button) ocRepayExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i14 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelPreviewPaymentMethodItem) ocRepayExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i15 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i16 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 4:
                        int i17 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 5:
                        int i18 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i19 = OcRepayExtendPreviewActivity.f29792w0;
                        return (PreviewTitleView) ocRepayExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
                }
            }
        });
        final int i13 = 4;
        this.f29797q0 = C2131j.b(new Function0(this) { // from class: ub.e1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendPreviewActivity f42845b;

            {
                this.f42845b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendPreviewActivity ocRepayExtendPreviewActivity = this.f42845b;
                switch (i13) {
                    case 0:
                        int i14 = OcRepayExtendPreviewActivity.f29792w0;
                        return (Button) ocRepayExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i15 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelPreviewPaymentMethodItem) ocRepayExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i16 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i17 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 4:
                        int i18 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 5:
                        int i19 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i110 = OcRepayExtendPreviewActivity.f29792w0;
                        return (PreviewTitleView) ocRepayExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
                }
            }
        });
        final int i14 = 5;
        this.f29798r0 = C2131j.b(new Function0(this) { // from class: ub.e1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendPreviewActivity f42845b;

            {
                this.f42845b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendPreviewActivity ocRepayExtendPreviewActivity = this.f42845b;
                switch (i14) {
                    case 0:
                        int i15 = OcRepayExtendPreviewActivity.f29792w0;
                        return (Button) ocRepayExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i16 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelPreviewPaymentMethodItem) ocRepayExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i17 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i18 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 4:
                        int i19 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 5:
                        int i110 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i111 = OcRepayExtendPreviewActivity.f29792w0;
                        return (PreviewTitleView) ocRepayExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
                }
            }
        });
        final int i15 = 6;
        this.f29799s0 = C2131j.b(new Function0(this) { // from class: ub.e1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendPreviewActivity f42845b;

            {
                this.f42845b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayExtendPreviewActivity ocRepayExtendPreviewActivity = this.f42845b;
                switch (i15) {
                    case 0:
                        int i16 = OcRepayExtendPreviewActivity.f29792w0;
                        return (Button) ocRepayExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i17 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelPreviewPaymentMethodItem) ocRepayExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i18 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i19 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 4:
                        int i110 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 5:
                        int i111 = OcRepayExtendPreviewActivity.f29792w0;
                        return (ModelItemFee) ocRepayExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i112 = OcRepayExtendPreviewActivity.f29792w0;
                        return (PreviewTitleView) ocRepayExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
                }
            }
        });
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
        if (S() == null) {
            return;
        }
        ModelPreviewPaymentMethodItem modelPreviewPaymentMethodItemS = S();
        if (modelPreviewPaymentMethodItemS != null) {
            modelPreviewPaymentMethodItemS.setPaymentMethod(this.f27789d);
        }
        PaymentMethod paymentMethod = this.f27789d;
        ((s) this.f27350a).queryPreviewInfo(R(String.valueOf(paymentMethod != null ? paymentMethod.senderAccountType : 1)));
    }

    public final void Q(boolean z3) {
        S().d(z3);
        U(z3);
        if (z3) {
            return;
        }
        K();
    }

    public final PreviewPayInfoV2Req R(String str) {
        PreviewPayInfoV2Req previewPayInfoV2Req = new PreviewPayInfoV2Req();
        previewPayInfoV2Req.orderAmount = this.f29800t0;
        previewPayInfoV2Req.orderType = TransType.TRANS_TYPE_BULK_DISBURSEMENT;
        previewPayInfoV2Req.isRedeemPoint = false;
        CouponItem couponItem = this.f27790e;
        if (couponItem != null) {
            previewPayInfoV2Req.couponId = Long.valueOf(couponItem.couponId);
            previewPayInfoV2Req.couponAmount = this.f27790e.nominaValue;
        }
        previewPayInfoV2Req.isUseCoupon = false;
        previewPayInfoV2Req.transType = TransType.TRANS_TYPE_OK_CARD_EXTEND;
        previewPayInfoV2Req.payerAccountType = str;
        previewPayInfoV2Req.payeeAccountType = TransType.TRANS_TYPE_BIND_BANK_CARD;
        return previewPayInfoV2Req;
    }

    public final ModelPreviewPaymentMethodItem S() {
        Object value = this.f29794Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelPreviewPaymentMethodItem) value;
    }

    public final Button T() {
        Object value = this.f29793Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }

    public final void U(boolean z3) {
        T().setEnabled(z3);
        if (z3) {
            T().setBackgroundResource(Ya.d.cs_renew_tv_bg);
        } else {
            T().setBackgroundColor(getColor(L6.b.ppColorDividerLineDark));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_repay_extend_preview_layout;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getOrderAmount, reason: from getter */
    public final long getF29089u0() {
        return this.f29800t0;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getTransType */
    public final String getF27551B0() {
        return TransType.TRANS_TYPE_OK_CARD_EXTEND;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        super.initData();
        Intent intent = getIntent();
        this.f29801u0 = intent.getStringExtra("ok_card_repay_order_no");
        intent.getStringExtra("ok_card_repay_card_no");
        intent.getLongExtra("ok_card_repay_bill_id", 0L);
        this.f29800t0 = intent.getLongExtra("ok_card_repay_amount", 0L);
        Object value = this.f29798r0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ModelItemFee) value).setContent(r0.A(this.f29800t0));
        Object value2 = this.f29799s0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((PreviewTitleView) value2).setAmount(this.f29800t0);
        this.f27794j = R("1");
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        s sVar = new s();
        sVar.f41295f = this;
        return sVar;
    }

    @Override // com.transsnet.palmpay.credit.contract.OcRepayExtendPreviewContract.IPreviewView
    public final void launchPay(OcOrderRsp ocOrderRsp) {
        OcOrderData data;
        this.f27793i = (ocOrderRsp == null || (data = ocOrderRsp.getData()) == null) ? null : data.getOrderId();
        E();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onMessageEvent(event);
        switch (event.getEventType()) {
            case MessageEvent.EVENT_OC_REPAY_SUCCESS /* 327 */:
            case MessageEvent.EVENT_OC_REPAY_PENDING /* 328 */:
            case MessageEvent.EVENT_OC_REPAY_FAILED /* 329 */:
                finish();
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void setDefaultMethod(PaymentMethod paymentMethod) {
        this.f27789d = paymentMethod;
        S().setPaymentMethod(this.f27789d);
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        U(false);
        Object value = this.f29795k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ModelItemFee) value).f();
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.d1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendPreviewActivity f42839b;

            {
                this.f42839b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcRepayExtendPreviewActivity ocRepayExtendPreviewActivity = this.f42839b;
                switch (i7) {
                    case 0:
                        int i10 = OcRepayExtendPreviewActivity.f29792w0;
                        if (ocRepayExtendPreviewActivity.f27789d == null) {
                            ToastUtils.showShort("please select a payment method", new Object[0]);
                        } else if (!TextUtils.isEmpty(ocRepayExtendPreviewActivity.f29801u0)) {
                            ocRepayExtendPreviewActivity.f27793i = ocRepayExtendPreviewActivity.f29801u0;
                            ocRepayExtendPreviewActivity.E();
                        } else {
                            ToastUtils.showLong("order id is null", new Object[0]);
                            ocRepayExtendPreviewActivity.finish();
                        }
                        break;
                    default:
                        int i11 = OcRepayExtendPreviewActivity.f29792w0;
                        ocRepayExtendPreviewActivity.L();
                        break;
                }
            }
        }, T());
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.d1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayExtendPreviewActivity f42839b;

            {
                this.f42839b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcRepayExtendPreviewActivity ocRepayExtendPreviewActivity = this.f42839b;
                switch (i10) {
                    case 0:
                        int i11 = OcRepayExtendPreviewActivity.f29792w0;
                        if (ocRepayExtendPreviewActivity.f27789d == null) {
                            ToastUtils.showShort("please select a payment method", new Object[0]);
                        } else if (!TextUtils.isEmpty(ocRepayExtendPreviewActivity.f29801u0)) {
                            ocRepayExtendPreviewActivity.f27793i = ocRepayExtendPreviewActivity.f29801u0;
                            ocRepayExtendPreviewActivity.E();
                        } else {
                            ToastUtils.showLong("order id is null", new Object[0]);
                            ocRepayExtendPreviewActivity.finish();
                        }
                        break;
                    default:
                        int i12 = OcRepayExtendPreviewActivity.f29792w0;
                        ocRepayExtendPreviewActivity.L();
                        break;
                }
            }
        }, S());
    }

    @Override // com.transsnet.palmpay.credit.contract.OcRepayExtendPreviewContract.IPreviewView
    public final void showPreviewInfo(PreviewPayInfoResp.DataBean dataBean) {
        showPreviewPayInfo(null, dataBean);
        I(dataBean);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void showPreviewPayInfo(PaymentMethod paymentMethod, PreviewPayInfoResp.DataBean dataBean) {
        this.f29802v0 = dataBean;
        setPayAmount(dataBean != null ? dataBean.payAmount : 0L);
        T().setText(getString(k.core_pay_amount, BaseApplication.getCurrencySymbol(), r0.A(this.f27791f)));
        PreviewPayInfoResp.DataBean dataBean2 = this.f29802v0;
        t tVar = this.f29795k0;
        t tVar2 = this.f29797q0;
        if (dataBean2 == null) {
            Object value = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((ModelItemFee) value).e(0L, 0L);
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((ModelItemFee) value2).setContent(r0.A(0L));
            U(false);
        } else {
            Object value3 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((ModelItemFee) value3).e(dataBean2.fee, dataBean2.vat);
            Object value4 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((ModelItemFee) value4).setVisibility(dataBean2.fee + dataBean2.vat > 0 ? 0 : 8);
            Object value5 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((ModelItemFee) value5).setContent(r0.A(dataBean2.payAmount));
            t tVar3 = this.f29799s0;
            Object value6 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            ((PreviewTitleView) value6).setAmount(dataBean2.totalAmount);
            Object value7 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
            ((PreviewTitleView) value7).d(getString(Ya.g.cs_oc_repay_preview_top_tip));
            q(dataBean2.couponId, dataBean2.couponAmount);
            t tVar4 = this.f29796p0;
            Object value8 = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
            ModelItemFee modelItemFee = (ModelItemFee) value8;
            PreviewPayInfoResp.DataBean dataBean3 = this.f29802v0;
            modelItemFee.setContent(String.valueOf(dataBean3 != null ? Integer.valueOf(dataBean3.returnPoint) : null));
            if (dataBean2.returnPoint <= 0) {
                Object value9 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                ((ModelItemFee) value9).setVisibility(8);
            } else {
                Object value10 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                ((ModelItemFee) value10).setVisibility(0);
            }
        }
        PaymentMethod paymentMethod2 = this.f27789d;
        if (paymentMethod2 == null) {
            U(false);
            return;
        }
        if (paymentMethod2.senderAccountType != 1) {
            Q(true);
            return;
        }
        PreviewPayInfoResp.DataBean dataBean4 = this.f29802v0;
        if (dataBean4 == null) {
            Q(true);
        } else if (paymentMethod2.availableBalance < dataBean4.payAmount) {
            Q(false);
        } else {
            Q(true);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    /* JADX INFO: renamed from: t */
    public final String getF27552C0() {
        return TransType.TRANS_TYPE_BULK_DISBURSEMENT;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final String u() {
        return TransType.TRANS_TYPE_BIND_BANK_CARD;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final PreviewPayInfoV2Req v() {
        PaymentMethod paymentMethod = this.f27789d;
        return R(String.valueOf(paymentMethod != null ? paymentMethod.senderAccountType : 1));
    }
}
