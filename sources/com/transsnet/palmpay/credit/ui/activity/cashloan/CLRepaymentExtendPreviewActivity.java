package com.transsnet.palmpay.credit.ui.activity.cashloan;

import Pa.r0;
import Ya.e;
import Ya.f;
import Ya.g;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
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
import com.transsnet.palmpay.core.viewmodel.ModelCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.core.viewmodel.ModelPreviewPaymentMethodItem;
import com.transsnet.palmpay.core.viewmodel.PreviewTitleView;
import com.transsnet.palmpay.credit.bean.resp.CLRepayOrderData;
import com.transsnet.palmpay.credit.contract.CLRepayPreviewContract;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentExtendPreviewActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p220oa.h;
import p235pb.b;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit展期还款收银台", path = "/credit_score/cl_repayment_extend_preview__activity")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLRepaymentExtendPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/m;", "Lpb/b;", "Lcom/transsnet/palmpay/credit/contract/CLRepayPreviewContract$ICLRepayPreviewView;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRepaymentExtendPreviewActivity extends AbstractActivityC1479m implements CLRepayPreviewContract.ICLRepayPreviewView {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f29080w0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29081Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29082Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f29083k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f29084p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f29085q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f29086r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f29087s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f29088t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f29089u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public PreviewPayInfoResp.DataBean f29090v0;

    public CLRepaymentExtendPreviewActivity() {
        final int i7 = 0;
        this.f29081Y = C2131j.b(new Function0(this) { // from class: tb.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendPreviewActivity f42455b;

            {
                this.f42455b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendPreviewActivity cLRepaymentExtendPreviewActivity = this.f42455b;
                switch (i7) {
                    case 0:
                        int i10 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (Button) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i11 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelPreviewPaymentMethodItem) cLRepaymentExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i12 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i13 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelCouponItem) cLRepaymentExtendPreviewActivity.findViewById(e.itemCoupon);
                    case 4:
                        int i14 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 5:
                        int i15 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 6:
                        int i16 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i17 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (PreviewTitleView) cLRepaymentExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
                }
            }
        });
        final int i10 = 1;
        this.f29082Z = C2131j.b(new Function0(this) { // from class: tb.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendPreviewActivity f42455b;

            {
                this.f42455b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendPreviewActivity cLRepaymentExtendPreviewActivity = this.f42455b;
                switch (i10) {
                    case 0:
                        int i11 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (Button) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i12 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelPreviewPaymentMethodItem) cLRepaymentExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i13 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i14 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelCouponItem) cLRepaymentExtendPreviewActivity.findViewById(e.itemCoupon);
                    case 4:
                        int i15 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 5:
                        int i16 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 6:
                        int i17 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i18 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (PreviewTitleView) cLRepaymentExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
                }
            }
        });
        final int i11 = 2;
        this.f29083k0 = C2131j.b(new Function0(this) { // from class: tb.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendPreviewActivity f42455b;

            {
                this.f42455b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendPreviewActivity cLRepaymentExtendPreviewActivity = this.f42455b;
                switch (i11) {
                    case 0:
                        int i12 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (Button) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i13 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelPreviewPaymentMethodItem) cLRepaymentExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i14 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i15 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelCouponItem) cLRepaymentExtendPreviewActivity.findViewById(e.itemCoupon);
                    case 4:
                        int i16 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 5:
                        int i17 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 6:
                        int i18 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i19 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (PreviewTitleView) cLRepaymentExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
                }
            }
        });
        final int i12 = 3;
        this.f29084p0 = C2131j.b(new Function0(this) { // from class: tb.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendPreviewActivity f42455b;

            {
                this.f42455b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendPreviewActivity cLRepaymentExtendPreviewActivity = this.f42455b;
                switch (i12) {
                    case 0:
                        int i13 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (Button) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i14 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelPreviewPaymentMethodItem) cLRepaymentExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i15 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i16 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelCouponItem) cLRepaymentExtendPreviewActivity.findViewById(e.itemCoupon);
                    case 4:
                        int i17 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 5:
                        int i18 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 6:
                        int i19 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i110 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (PreviewTitleView) cLRepaymentExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
                }
            }
        });
        final int i13 = 4;
        this.f29085q0 = C2131j.b(new Function0(this) { // from class: tb.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendPreviewActivity f42455b;

            {
                this.f42455b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendPreviewActivity cLRepaymentExtendPreviewActivity = this.f42455b;
                switch (i13) {
                    case 0:
                        int i14 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (Button) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i15 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelPreviewPaymentMethodItem) cLRepaymentExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i16 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i17 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelCouponItem) cLRepaymentExtendPreviewActivity.findViewById(e.itemCoupon);
                    case 4:
                        int i18 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 5:
                        int i19 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 6:
                        int i110 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i111 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (PreviewTitleView) cLRepaymentExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
                }
            }
        });
        final int i14 = 5;
        this.f29086r0 = C2131j.b(new Function0(this) { // from class: tb.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendPreviewActivity f42455b;

            {
                this.f42455b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendPreviewActivity cLRepaymentExtendPreviewActivity = this.f42455b;
                switch (i14) {
                    case 0:
                        int i15 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (Button) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i16 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelPreviewPaymentMethodItem) cLRepaymentExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i17 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i18 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelCouponItem) cLRepaymentExtendPreviewActivity.findViewById(e.itemCoupon);
                    case 4:
                        int i19 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 5:
                        int i110 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 6:
                        int i111 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i112 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (PreviewTitleView) cLRepaymentExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
                }
            }
        });
        final int i15 = 6;
        this.f29087s0 = C2131j.b(new Function0(this) { // from class: tb.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendPreviewActivity f42455b;

            {
                this.f42455b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendPreviewActivity cLRepaymentExtendPreviewActivity = this.f42455b;
                switch (i15) {
                    case 0:
                        int i16 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (Button) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i17 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelPreviewPaymentMethodItem) cLRepaymentExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i18 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i19 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelCouponItem) cLRepaymentExtendPreviewActivity.findViewById(e.itemCoupon);
                    case 4:
                        int i110 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 5:
                        int i111 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 6:
                        int i112 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i113 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (PreviewTitleView) cLRepaymentExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
                }
            }
        });
        final int i16 = 7;
        this.f29088t0 = C2131j.b(new Function0(this) { // from class: tb.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendPreviewActivity f42455b;

            {
                this.f42455b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendPreviewActivity cLRepaymentExtendPreviewActivity = this.f42455b;
                switch (i16) {
                    case 0:
                        int i17 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (Button) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 1:
                        int i18 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelPreviewPaymentMethodItem) cLRepaymentExtendPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 2:
                        int i19 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 3:
                        int i110 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelCouponItem) cLRepaymentExtendPreviewActivity.findViewById(e.itemCoupon);
                    case 4:
                        int i111 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_point_earned_item);
                    case 5:
                        int i112 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_fee_item);
                    case 6:
                        int i113 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (ModelItemFee) cLRepaymentExtendPreviewActivity.findViewById(e.top_up_amount_item);
                    default:
                        int i114 = CLRepaymentExtendPreviewActivity.f29080w0;
                        return (PreviewTitleView) cLRepaymentExtendPreviewActivity.findViewById(e.lite_repayment_title_info);
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
        if (T() == null) {
            return;
        }
        T().setPaymentMethod(this.f27789d);
        PaymentMethod paymentMethod = this.f27789d;
        ((b) this.f27350a).queryPreviewInfo(R(String.valueOf(paymentMethod != null ? paymentMethod.senderAccountType : 29)));
    }

    public final void Q(boolean z3) {
        T().d(z3);
        Object value = this.f29081Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((Button) value).setEnabled(z3);
        if (z3) {
            return;
        }
        K();
    }

    public final PreviewPayInfoV2Req R(String str) {
        PreviewPayInfoV2Req previewPayInfoV2Req = new PreviewPayInfoV2Req();
        previewPayInfoV2Req.orderAmount = this.f29089u0;
        previewPayInfoV2Req.orderType = TransType.TRANS_TYPE_BULK_DISBURSEMENT;
        previewPayInfoV2Req.isRedeemPoint = false;
        previewPayInfoV2Req.isUseCoupon = C();
        CouponItem couponItem = this.f27790e;
        if (couponItem != null) {
            previewPayInfoV2Req.couponId = Long.valueOf(couponItem.couponId);
            previewPayInfoV2Req.couponAmount = this.f27790e.nominaValue;
        }
        previewPayInfoV2Req.transType = TransType.TRANS_TYPE_OK_CARD_EXTEND;
        previewPayInfoV2Req.orderId = this.f27793i;
        previewPayInfoV2Req.payerAccountType = str;
        previewPayInfoV2Req.payeeAccountType = "29";
        return previewPayInfoV2Req;
    }

    public final ModelCouponItem S() {
        Object value = this.f29084p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelCouponItem) value;
    }

    public final ModelPreviewPaymentMethodItem T() {
        Object value = this.f29082Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelPreviewPaymentMethodItem) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_repay_preview_layout;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getOrderAmount, reason: from getter */
    public final long getF29800t0() {
        return this.f29089u0;
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
        this.f27793i = intent.getStringExtra("cl_repay_order_no");
        this.f29089u0 = intent.getLongExtra("cl_repay_amount", 0L);
        Object value = this.f29087s0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ModelItemFee) value).setContent(r0.A(this.f29089u0));
        Object value2 = this.f29088t0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((PreviewTitleView) value2).setAmount(this.f29089u0);
        this.f27794j = R("1");
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new b(this);
    }

    @Override // com.transsnet.palmpay.credit.contract.CLRepayPreviewContract.ICLRepayPreviewView
    public final void launchPay(CLRepayOrderData cLRepayOrderData) {
        this.f27793i = cLRepayOrderData != null ? cLRepayOrderData.getOrderId() : null;
        E();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.dialog.CoreSelectCouponForPaymentDialog.CallBack
    public final void onCouponClick(CouponItem couponItem) {
        this.f27790e = couponItem;
        S().setCoupon(this.f27790e);
        S().d();
        PaymentMethod paymentMethod = this.f27789d;
        ((b) this.f27350a).queryPreviewInfo(R(String.valueOf(paymentMethod != null ? paymentMethod.senderAccountType : 29)));
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onMessageEvent(event);
        switch (event.getEventType()) {
            case MessageEvent.EVENT_CL_REPAYMENT_SUCCESS /* 358 */:
            case MessageEvent.EVENT_CL_REPAYMENT_PENDING /* 359 */:
            case MessageEvent.EVENT_CL_REPAYMENT_FAILED /* 360 */:
                finish();
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void setDefaultMethod(PaymentMethod paymentMethod) {
        this.f27789d = paymentMethod;
        T().setPaymentMethod(this.f27789d);
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ((TextView) findViewById(e.tvTitle)).setText(getString(g.cs_flex_cash_repayment));
        t tVar = this.f29081Y;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((Button) value).setEnabled(false);
        Object value2 = this.f29083k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((ModelItemFee) value2).f();
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        final int i7 = 1;
        h.l(new View.OnClickListener(this) { // from class: tb.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendPreviewActivity f42459b;

            {
                this.f42459b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLRepaymentExtendPreviewActivity cLRepaymentExtendPreviewActivity = this.f42459b;
                switch (i7) {
                    case 0:
                        cLRepaymentExtendPreviewActivity.F(cLRepaymentExtendPreviewActivity.f29090v0);
                        break;
                    case 1:
                        int i10 = CLRepaymentExtendPreviewActivity.f29080w0;
                        if (cLRepaymentExtendPreviewActivity.f27789d == null) {
                            ToastUtils.showShort("please select a payment method", new Object[0]);
                        } else if (!TextUtils.isEmpty(cLRepaymentExtendPreviewActivity.f27793i)) {
                            cLRepaymentExtendPreviewActivity.E();
                        } else {
                            ToastUtils.showLong("orderNo is null", new Object[0]);
                            cLRepaymentExtendPreviewActivity.finish();
                        }
                        break;
                    default:
                        int i11 = CLRepaymentExtendPreviewActivity.f29080w0;
                        cLRepaymentExtendPreviewActivity.L();
                        break;
                }
            }
        }, (Button) value3);
        final int i10 = 2;
        h.l(new View.OnClickListener(this) { // from class: tb.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendPreviewActivity f42459b;

            {
                this.f42459b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLRepaymentExtendPreviewActivity cLRepaymentExtendPreviewActivity = this.f42459b;
                switch (i10) {
                    case 0:
                        cLRepaymentExtendPreviewActivity.F(cLRepaymentExtendPreviewActivity.f29090v0);
                        break;
                    case 1:
                        int i11 = CLRepaymentExtendPreviewActivity.f29080w0;
                        if (cLRepaymentExtendPreviewActivity.f27789d == null) {
                            ToastUtils.showShort("please select a payment method", new Object[0]);
                        } else if (!TextUtils.isEmpty(cLRepaymentExtendPreviewActivity.f27793i)) {
                            cLRepaymentExtendPreviewActivity.E();
                        } else {
                            ToastUtils.showLong("orderNo is null", new Object[0]);
                            cLRepaymentExtendPreviewActivity.finish();
                        }
                        break;
                    default:
                        int i12 = CLRepaymentExtendPreviewActivity.f29080w0;
                        cLRepaymentExtendPreviewActivity.L();
                        break;
                }
            }
        }, T());
        final int i11 = 0;
        h.l(new View.OnClickListener(this) { // from class: tb.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendPreviewActivity f42459b;

            {
                this.f42459b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLRepaymentExtendPreviewActivity cLRepaymentExtendPreviewActivity = this.f42459b;
                switch (i11) {
                    case 0:
                        cLRepaymentExtendPreviewActivity.F(cLRepaymentExtendPreviewActivity.f29090v0);
                        break;
                    case 1:
                        int i12 = CLRepaymentExtendPreviewActivity.f29080w0;
                        if (cLRepaymentExtendPreviewActivity.f27789d == null) {
                            ToastUtils.showShort("please select a payment method", new Object[0]);
                        } else if (!TextUtils.isEmpty(cLRepaymentExtendPreviewActivity.f27793i)) {
                            cLRepaymentExtendPreviewActivity.E();
                        } else {
                            ToastUtils.showLong("orderNo is null", new Object[0]);
                            cLRepaymentExtendPreviewActivity.finish();
                        }
                        break;
                    default:
                        int i13 = CLRepaymentExtendPreviewActivity.f29080w0;
                        cLRepaymentExtendPreviewActivity.L();
                        break;
                }
            }
        }, S());
    }

    @Override // com.transsnet.palmpay.credit.contract.CLRepayPreviewContract.ICLRepayPreviewView
    public final void showPreviewInfo(PreviewPayInfoResp.DataBean dataBean) {
        showPreviewPayInfo(null, dataBean);
        I(dataBean);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void showPreviewPayInfo(PaymentMethod paymentMethod, PreviewPayInfoResp.DataBean dataBean) {
        this.f29090v0 = dataBean;
        setPayAmount(dataBean != null ? dataBean.payAmount : 0L);
        t tVar = this.f29081Y;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((Button) value).setText(getString(k.core_pay_amount, BaseApplication.getCurrencySymbol(), r0.A(this.f27791f)));
        PreviewPayInfoResp.DataBean dataBean2 = this.f29090v0;
        t tVar2 = this.f29083k0;
        t tVar3 = this.f29086r0;
        if (dataBean2 == null) {
            Object value2 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((ModelItemFee) value2).e(0L, 0L);
            Object value3 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((ModelItemFee) value3).setContent(r0.A(0L));
            Object value4 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((Button) value4).setEnabled(false);
        } else {
            if (!TextUtils.isEmpty(dataBean2.interestPenaltyFeeTips)) {
                ToastUtils.showLong(dataBean2.interestPenaltyFeeTips, new Object[0]);
            }
            Object value5 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((ModelItemFee) value5).e(dataBean2.fee, dataBean2.vat);
            Object value6 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            ((ModelItemFee) value6).setVisibility(dataBean2.fee + dataBean2.vat > 0 ? 0 : 8);
            Object value7 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
            ((ModelItemFee) value7).setContent(r0.A(dataBean2.payAmount));
            Object value8 = this.f29088t0.getValue();
            Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
            ((PreviewTitleView) value8).setAmount(dataBean2.totalAmount);
            q(dataBean2.couponId, dataBean2.couponAmount);
            h.s(S(), false);
            S().setAvailableCouponCount(this.f27779A);
            S().setCoupon(this.f27790e);
            S().setCouponDeductAmount(dataBean2.couponAmount);
            t tVar4 = this.f29085q0;
            Object value9 = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
            ModelItemFee modelItemFee = (ModelItemFee) value9;
            PreviewPayInfoResp.DataBean dataBean3 = this.f29090v0;
            modelItemFee.setContent(String.valueOf(dataBean3 != null ? Integer.valueOf(dataBean3.returnPoint) : null));
            if (dataBean2.returnPoint <= 0) {
                Object value10 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                ((ModelItemFee) value10).setVisibility(8);
            } else {
                Object value11 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                ((ModelItemFee) value11).setVisibility(0);
            }
        }
        PaymentMethod paymentMethod2 = this.f27789d;
        if (paymentMethod2 == null) {
            Object value12 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
            ((Button) value12).setEnabled(false);
        } else {
            if (paymentMethod2.senderAccountType != 1) {
                Q(true);
                return;
            }
            PreviewPayInfoResp.DataBean dataBean4 = this.f29090v0;
            if (dataBean4 == null) {
                Q(true);
            } else if (paymentMethod2.availableBalance < dataBean4.payAmount) {
                Q(false);
            } else {
                Q(true);
            }
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

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final String y() {
        return "l4_02";
    }
}
