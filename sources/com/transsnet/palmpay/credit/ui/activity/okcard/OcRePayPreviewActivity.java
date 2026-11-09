package com.transsnet.palmpay.credit.ui.activity.okcard;

import Pa.r0;
import Ya.e;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
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
import com.transsnet.palmpay.credit.bean.resp.OcOrderData;
import com.transsnet.palmpay.credit.bean.resp.OcOrderRsp;
import com.transsnet.palmpay.credit.contract.OcPrePayPreviewContract;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRePayPreviewActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p235pb.v;
import p310ub.G0;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC重新还款收银台", path = "/credit_score/oc_repay_preview_activity")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcRePayPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/m;", "Lpb/v;", "Lcom/transsnet/palmpay/credit/contract/OcPrePayPreviewContract$IPreviewView;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRePayPreviewActivity extends AbstractActivityC1479m implements OcPrePayPreviewContract.IPreviewView {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f29661w0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29662Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29663Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f29664k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f29665p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f29666q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f29667r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f29668s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f29669t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f29670u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public PreviewPayInfoResp.DataBean f29671v0;

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

    public OcRePayPreviewActivity() {
        final int i7 = 2;
        this.f29662Y = C2131j.b(new Function0(this) { // from class: ub.H0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRePayPreviewActivity f42761b;

            {
                this.f42761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRePayPreviewActivity ocRePayPreviewActivity = this.f42761b;
                switch (i7) {
                    case 0:
                        int i10 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_amount_item);
                    case 1:
                        int i11 = OcRePayPreviewActivity.f29661w0;
                        return (PreviewTitleView) ocRePayPreviewActivity.findViewById(e.lite_repayment_title_info);
                    case 2:
                        int i12 = OcRePayPreviewActivity.f29661w0;
                        return (Button) ocRePayPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 3:
                        int i13 = OcRePayPreviewActivity.f29661w0;
                        return (ModelPreviewPaymentMethodItem) ocRePayPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 4:
                        int i14 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 5:
                        int i15 = OcRePayPreviewActivity.f29661w0;
                        return (ModelCouponItem) ocRePayPreviewActivity.findViewById(e.itemCoupon);
                    case 6:
                        int i16 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_point_earned_item);
                    default:
                        int i17 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_fee_item);
                }
            }
        });
        final int i10 = 3;
        this.f29663Z = C2131j.b(new Function0(this) { // from class: ub.H0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRePayPreviewActivity f42761b;

            {
                this.f42761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRePayPreviewActivity ocRePayPreviewActivity = this.f42761b;
                switch (i10) {
                    case 0:
                        int i11 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_amount_item);
                    case 1:
                        int i12 = OcRePayPreviewActivity.f29661w0;
                        return (PreviewTitleView) ocRePayPreviewActivity.findViewById(e.lite_repayment_title_info);
                    case 2:
                        int i13 = OcRePayPreviewActivity.f29661w0;
                        return (Button) ocRePayPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 3:
                        int i14 = OcRePayPreviewActivity.f29661w0;
                        return (ModelPreviewPaymentMethodItem) ocRePayPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 4:
                        int i15 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 5:
                        int i16 = OcRePayPreviewActivity.f29661w0;
                        return (ModelCouponItem) ocRePayPreviewActivity.findViewById(e.itemCoupon);
                    case 6:
                        int i17 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_point_earned_item);
                    default:
                        int i18 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_fee_item);
                }
            }
        });
        final int i11 = 4;
        this.f29664k0 = C2131j.b(new Function0(this) { // from class: ub.H0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRePayPreviewActivity f42761b;

            {
                this.f42761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRePayPreviewActivity ocRePayPreviewActivity = this.f42761b;
                switch (i11) {
                    case 0:
                        int i12 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_amount_item);
                    case 1:
                        int i13 = OcRePayPreviewActivity.f29661w0;
                        return (PreviewTitleView) ocRePayPreviewActivity.findViewById(e.lite_repayment_title_info);
                    case 2:
                        int i14 = OcRePayPreviewActivity.f29661w0;
                        return (Button) ocRePayPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 3:
                        int i15 = OcRePayPreviewActivity.f29661w0;
                        return (ModelPreviewPaymentMethodItem) ocRePayPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 4:
                        int i16 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 5:
                        int i17 = OcRePayPreviewActivity.f29661w0;
                        return (ModelCouponItem) ocRePayPreviewActivity.findViewById(e.itemCoupon);
                    case 6:
                        int i18 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_point_earned_item);
                    default:
                        int i19 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_fee_item);
                }
            }
        });
        final int i12 = 5;
        this.f29665p0 = C2131j.b(new Function0(this) { // from class: ub.H0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRePayPreviewActivity f42761b;

            {
                this.f42761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRePayPreviewActivity ocRePayPreviewActivity = this.f42761b;
                switch (i12) {
                    case 0:
                        int i13 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_amount_item);
                    case 1:
                        int i14 = OcRePayPreviewActivity.f29661w0;
                        return (PreviewTitleView) ocRePayPreviewActivity.findViewById(e.lite_repayment_title_info);
                    case 2:
                        int i15 = OcRePayPreviewActivity.f29661w0;
                        return (Button) ocRePayPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 3:
                        int i16 = OcRePayPreviewActivity.f29661w0;
                        return (ModelPreviewPaymentMethodItem) ocRePayPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 4:
                        int i17 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 5:
                        int i18 = OcRePayPreviewActivity.f29661w0;
                        return (ModelCouponItem) ocRePayPreviewActivity.findViewById(e.itemCoupon);
                    case 6:
                        int i19 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_point_earned_item);
                    default:
                        int i110 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_fee_item);
                }
            }
        });
        final int i13 = 6;
        this.f29666q0 = C2131j.b(new Function0(this) { // from class: ub.H0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRePayPreviewActivity f42761b;

            {
                this.f42761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRePayPreviewActivity ocRePayPreviewActivity = this.f42761b;
                switch (i13) {
                    case 0:
                        int i14 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_amount_item);
                    case 1:
                        int i15 = OcRePayPreviewActivity.f29661w0;
                        return (PreviewTitleView) ocRePayPreviewActivity.findViewById(e.lite_repayment_title_info);
                    case 2:
                        int i16 = OcRePayPreviewActivity.f29661w0;
                        return (Button) ocRePayPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 3:
                        int i17 = OcRePayPreviewActivity.f29661w0;
                        return (ModelPreviewPaymentMethodItem) ocRePayPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 4:
                        int i18 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 5:
                        int i19 = OcRePayPreviewActivity.f29661w0;
                        return (ModelCouponItem) ocRePayPreviewActivity.findViewById(e.itemCoupon);
                    case 6:
                        int i110 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_point_earned_item);
                    default:
                        int i111 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_fee_item);
                }
            }
        });
        final int i14 = 7;
        this.f29667r0 = C2131j.b(new Function0(this) { // from class: ub.H0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRePayPreviewActivity f42761b;

            {
                this.f42761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRePayPreviewActivity ocRePayPreviewActivity = this.f42761b;
                switch (i14) {
                    case 0:
                        int i15 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_amount_item);
                    case 1:
                        int i16 = OcRePayPreviewActivity.f29661w0;
                        return (PreviewTitleView) ocRePayPreviewActivity.findViewById(e.lite_repayment_title_info);
                    case 2:
                        int i17 = OcRePayPreviewActivity.f29661w0;
                        return (Button) ocRePayPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 3:
                        int i18 = OcRePayPreviewActivity.f29661w0;
                        return (ModelPreviewPaymentMethodItem) ocRePayPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 4:
                        int i19 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 5:
                        int i110 = OcRePayPreviewActivity.f29661w0;
                        return (ModelCouponItem) ocRePayPreviewActivity.findViewById(e.itemCoupon);
                    case 6:
                        int i111 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_point_earned_item);
                    default:
                        int i112 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_fee_item);
                }
            }
        });
        final int i15 = 0;
        this.f29668s0 = C2131j.b(new Function0(this) { // from class: ub.H0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRePayPreviewActivity f42761b;

            {
                this.f42761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRePayPreviewActivity ocRePayPreviewActivity = this.f42761b;
                switch (i15) {
                    case 0:
                        int i16 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_amount_item);
                    case 1:
                        int i17 = OcRePayPreviewActivity.f29661w0;
                        return (PreviewTitleView) ocRePayPreviewActivity.findViewById(e.lite_repayment_title_info);
                    case 2:
                        int i18 = OcRePayPreviewActivity.f29661w0;
                        return (Button) ocRePayPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 3:
                        int i19 = OcRePayPreviewActivity.f29661w0;
                        return (ModelPreviewPaymentMethodItem) ocRePayPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 4:
                        int i110 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 5:
                        int i111 = OcRePayPreviewActivity.f29661w0;
                        return (ModelCouponItem) ocRePayPreviewActivity.findViewById(e.itemCoupon);
                    case 6:
                        int i112 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_point_earned_item);
                    default:
                        int i113 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_fee_item);
                }
            }
        });
        final int i16 = 1;
        this.f29669t0 = C2131j.b(new Function0(this) { // from class: ub.H0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRePayPreviewActivity f42761b;

            {
                this.f42761b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRePayPreviewActivity ocRePayPreviewActivity = this.f42761b;
                switch (i16) {
                    case 0:
                        int i17 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_amount_item);
                    case 1:
                        int i18 = OcRePayPreviewActivity.f29661w0;
                        return (PreviewTitleView) ocRePayPreviewActivity.findViewById(e.lite_repayment_title_info);
                    case 2:
                        int i19 = OcRePayPreviewActivity.f29661w0;
                        return (Button) ocRePayPreviewActivity.findViewById(e.top_up_preview_pay_bt);
                    case 3:
                        int i110 = OcRePayPreviewActivity.f29661w0;
                        return (ModelPreviewPaymentMethodItem) ocRePayPreviewActivity.findViewById(e.lite_payment_method_view);
                    case 4:
                        int i111 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_total_pay_item);
                    case 5:
                        int i112 = OcRePayPreviewActivity.f29661w0;
                        return (ModelCouponItem) ocRePayPreviewActivity.findViewById(e.itemCoupon);
                    case 6:
                        int i113 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_point_earned_item);
                    default:
                        int i114 = OcRePayPreviewActivity.f29661w0;
                        return (ModelItemFee) ocRePayPreviewActivity.findViewById(e.top_up_fee_item);
                }
            }
        });
    }

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
        if (T() == null) {
            return;
        }
        T().setPaymentMethod(this.f27789d);
        PaymentMethod paymentMethod = this.f27789d;
        ((v) this.f27350a).queryPreviewInfo(R(String.valueOf(paymentMethod != null ? paymentMethod.senderAccountType : 1)));
    }

    public final void Q(boolean z3) {
        T().d(z3);
        V(z3);
        if (z3) {
            return;
        }
        K();
    }

    public final PreviewPayInfoV2Req R(String str) {
        PreviewPayInfoV2Req previewPayInfoV2Req = new PreviewPayInfoV2Req();
        previewPayInfoV2Req.orderAmount = this.f29670u0;
        previewPayInfoV2Req.orderType = "33";
        previewPayInfoV2Req.isRedeemPoint = false;
        previewPayInfoV2Req.isUseCoupon = C();
        CouponItem couponItem = this.f27790e;
        if (couponItem != null) {
            previewPayInfoV2Req.couponId = Long.valueOf(couponItem.couponId);
            previewPayInfoV2Req.couponAmount = this.f27790e.nominaValue;
        }
        previewPayInfoV2Req.transType = TransType.TRANS_TYPE_OK_CARD;
        previewPayInfoV2Req.orderId = this.f27793i;
        previewPayInfoV2Req.payerAccountType = str;
        previewPayInfoV2Req.payeeAccountType = TransType.TRANS_TYPE_BIND_BANK_CARD;
        return previewPayInfoV2Req;
    }

    public final ModelCouponItem S() {
        Object value = this.f29665p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelCouponItem) value;
    }

    public final ModelPreviewPaymentMethodItem T() {
        Object value = this.f29663Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelPreviewPaymentMethodItem) value;
    }

    public final Button U() {
        Object value = this.f29662Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }

    public final void V(boolean z3) {
        U().setEnabled(z3);
        if (z3) {
            U().setBackgroundResource(Ya.d.cs_renew_tv_bg);
        } else {
            U().setBackgroundColor(getColor(L6.b.ppColorDividerLineDark));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_repay_preview_layout;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getOrderAmount, reason: from getter */
    public final long getF29800t0() {
        return this.f29670u0;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getTransType */
    public final String getF27551B0() {
        return TransType.TRANS_TYPE_OK_CARD;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        super.initData();
        Intent intent = getIntent();
        this.f27793i = intent.getStringExtra("ok_card_repay_order_no");
        this.f29670u0 = intent.getLongExtra("ok_card_repay_amount", 0L);
        Object value = this.f29668s0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ModelItemFee) value).setContent(r0.A(this.f29670u0));
        Object value2 = this.f29669t0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((PreviewTitleView) value2).setAmount(this.f29670u0);
        this.f27794j = R("1");
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        v vVar = new v();
        vVar.f41298f = this;
        return vVar;
    }

    @Override // com.transsnet.palmpay.credit.contract.OcPrePayPreviewContract.IPreviewView
    public final void launchPay(OcOrderRsp ocOrderRsp) {
        OcOrderData data;
        this.f27793i = (ocOrderRsp == null || (data = ocOrderRsp.getData()) == null) ? null : data.getOrderId();
        E();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.dialog.CoreSelectCouponForPaymentDialog.CallBack
    public final void onCouponClick(CouponItem couponItem) {
        this.f27790e = couponItem;
        S().setCoupon(this.f27790e);
        S().d();
        PaymentMethod paymentMethod = this.f27789d;
        ((v) this.f27350a).queryPreviewInfo(R(String.valueOf(paymentMethod != null ? paymentMethod.senderAccountType : 1)));
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
        T().setPaymentMethod(this.f27789d);
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ((TextView) findViewById(Ya.e.tvTitle)).setText(getString(Ya.g.cs_flex_repayment));
        V(false);
        Object value = this.f29664k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ModelItemFee) value).f();
        p220oa.h.l(new G0(this, 0), U());
        p220oa.h.l(new G0(this, 1), T());
        S().setOnClickListener(new G0(this, 2));
    }

    @Override // com.transsnet.palmpay.credit.contract.OcPrePayPreviewContract.IPreviewView
    public final void showPreviewInfo(PreviewPayInfoResp.DataBean dataBean) {
        showPreviewPayInfo(null, dataBean);
        I(dataBean);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void showPreviewPayInfo(PaymentMethod paymentMethod, PreviewPayInfoResp.DataBean dataBean) {
        ImageView tipsIv;
        this.f29671v0 = dataBean;
        setPayAmount(dataBean != null ? dataBean.payAmount : 0L);
        U().setText(getString(k.core_pay_amount, BaseApplication.getCurrencySymbol(), r0.A(this.f27791f)));
        PreviewPayInfoResp.DataBean dataBean2 = this.f29671v0;
        t tVar = this.f29664k0;
        t tVar2 = this.f29667r0;
        if (dataBean2 == null) {
            Object value = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((ModelItemFee) value).e(0L, 0L);
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((ModelItemFee) value2).setContent(r0.A(0L));
            V(false);
        } else {
            if (!TextUtils.isEmpty(dataBean2.interestPenaltyFeeTips)) {
                ToastUtils.showLong(dataBean2.interestPenaltyFeeTips, new Object[0]);
            }
            Object value3 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((ModelItemFee) value3).e(dataBean2.fee, dataBean2.vat);
            Object value4 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((ModelItemFee) value4).setVisibility(dataBean2.fee + dataBean2.vat > 0 ? 0 : 8);
            Object value5 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((ModelItemFee) value5).setContent(r0.A(dataBean2.payAmount));
            Object value6 = this.f29669t0.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            ((PreviewTitleView) value6).setAmount(dataBean2.totalAmount);
            q(dataBean2.couponId, dataBean2.couponAmount);
            S().setVisibility(0);
            ModelCouponItem modelCouponItemS = S();
            if (modelCouponItemS != null && (tipsIv = modelCouponItemS.getTipsIv()) != null) {
                p220oa.h.l(new G0(this, 3), tipsIv);
            }
            S().setAvailableCouponCount(this.f27779A);
            S().setCoupon(this.f27790e);
            S().setCouponDeductAmount(dataBean2.couponAmount);
            t tVar3 = this.f29666q0;
            Object value7 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
            ModelItemFee modelItemFee = (ModelItemFee) value7;
            PreviewPayInfoResp.DataBean dataBean3 = this.f29671v0;
            modelItemFee.setContent(String.valueOf(dataBean3 != null ? Integer.valueOf(dataBean3.returnPoint) : null));
            if (dataBean2.returnPoint <= 0) {
                Object value8 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                ((ModelItemFee) value8).setVisibility(8);
            } else {
                Object value9 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                ((ModelItemFee) value9).setVisibility(0);
            }
        }
        PaymentMethod paymentMethod2 = this.f27789d;
        if (paymentMethod2 == null) {
            V(false);
            return;
        }
        if (paymentMethod2.senderAccountType != 1) {
            Q(true);
            return;
        }
        PreviewPayInfoResp.DataBean dataBean4 = this.f29671v0;
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
        return "33";
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
