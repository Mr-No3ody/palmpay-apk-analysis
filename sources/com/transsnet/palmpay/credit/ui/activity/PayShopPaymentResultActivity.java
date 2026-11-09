package com.transsnet.palmpay.credit.ui.activity;

import C9.N;
import Oa.m;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import S6.a;
import V8.w;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.t0;
import Ya.e;
import Ya.g;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentResultActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.PayShopPaymentViewModel;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.send_money.bean.event.CouponEvent;
import com.transsnet.palmpay.send_money.bean.event.TransactionEvent;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.util.b;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p042cg.f;
import p051d9.C1605b;
import p054dd.n;
import p141j9.s;
import p220oa.h;
import p284sb.A;
import p284sb.C2025x;
import p284sb.D;
import p284sb.E;
import p284sb.F;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/pay_shop_payment_result")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/PayShopPaymentResultActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/ui/viewmodel/PayShopPaymentViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPayShopPaymentResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayShopPaymentResultActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/PayShopPaymentResultActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n562#2,10:488\n115#3,8:498\n145#3:506\n1#4:507\n*S KotlinDebug\n*F\n+ 1 PayShopPaymentResultActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/PayShopPaymentResultActivity\n*L\n153#1:488,10\n355#1:498,8\n355#1:506\n*E\n"})
public final class PayShopPaymentResultActivity extends CreditBaseMvvmActivity<PayShopPaymentViewModel> {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f28737Q = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public PayByOrderResp.DataBean f28738A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public QueryOrderDetailRsp f28739B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f28740C = true;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f28741H = 100;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public t0 f28742L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f28743M;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28745g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f28747j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28749p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f28750v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f28751w;

    public PayShopPaymentResultActivity() {
        final int i7 = 0;
        this.f28744f = C2131j.b(new Function0(this) { // from class: sb.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentResultActivity f42113b;

            {
                this.f42113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopPaymentResultActivity payShopPaymentResultActivity = this.f42113b;
                switch (i7) {
                    case 0:
                        int i10 = PayShopPaymentResultActivity.f28737Q;
                        return (Button) payShopPaymentResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        int i11 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.btnShareReceipt);
                    case 2:
                        int i12 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.result_two_btn_view);
                    case 3:
                        int i13 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback2);
                    case 4:
                        int i14 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback);
                    case 5:
                        int i15 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.ll_order_info);
                    case 6:
                        int i16 = PayShopPaymentResultActivity.f28737Q;
                        return (TransactionResultHeaderModel) payShopPaymentResultActivity.findViewById(e.progressView);
                    default:
                        int i17 = PayShopPaymentResultActivity.f28737Q;
                        return (PpTitleBar) payShopPaymentResultActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i10 = 1;
        this.f28745g = C2131j.b(new Function0(this) { // from class: sb.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentResultActivity f42113b;

            {
                this.f42113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopPaymentResultActivity payShopPaymentResultActivity = this.f42113b;
                switch (i10) {
                    case 0:
                        int i11 = PayShopPaymentResultActivity.f28737Q;
                        return (Button) payShopPaymentResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        int i12 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.btnShareReceipt);
                    case 2:
                        int i13 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.result_two_btn_view);
                    case 3:
                        int i14 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback2);
                    case 4:
                        int i15 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback);
                    case 5:
                        int i16 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.ll_order_info);
                    case 6:
                        int i17 = PayShopPaymentResultActivity.f28737Q;
                        return (TransactionResultHeaderModel) payShopPaymentResultActivity.findViewById(e.progressView);
                    default:
                        int i18 = PayShopPaymentResultActivity.f28737Q;
                        return (PpTitleBar) payShopPaymentResultActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i11 = 2;
        this.f28746i = C2131j.b(new Function0(this) { // from class: sb.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentResultActivity f42113b;

            {
                this.f42113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopPaymentResultActivity payShopPaymentResultActivity = this.f42113b;
                switch (i11) {
                    case 0:
                        int i12 = PayShopPaymentResultActivity.f28737Q;
                        return (Button) payShopPaymentResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        int i13 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.btnShareReceipt);
                    case 2:
                        int i14 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.result_two_btn_view);
                    case 3:
                        int i15 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback2);
                    case 4:
                        int i16 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback);
                    case 5:
                        int i17 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.ll_order_info);
                    case 6:
                        int i18 = PayShopPaymentResultActivity.f28737Q;
                        return (TransactionResultHeaderModel) payShopPaymentResultActivity.findViewById(e.progressView);
                    default:
                        int i19 = PayShopPaymentResultActivity.f28737Q;
                        return (PpTitleBar) payShopPaymentResultActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i12 = 3;
        this.f28747j = C2131j.b(new Function0(this) { // from class: sb.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentResultActivity f42113b;

            {
                this.f42113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopPaymentResultActivity payShopPaymentResultActivity = this.f42113b;
                switch (i12) {
                    case 0:
                        int i13 = PayShopPaymentResultActivity.f28737Q;
                        return (Button) payShopPaymentResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        int i14 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.btnShareReceipt);
                    case 2:
                        int i15 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.result_two_btn_view);
                    case 3:
                        int i16 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback2);
                    case 4:
                        int i17 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback);
                    case 5:
                        int i18 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.ll_order_info);
                    case 6:
                        int i19 = PayShopPaymentResultActivity.f28737Q;
                        return (TransactionResultHeaderModel) payShopPaymentResultActivity.findViewById(e.progressView);
                    default:
                        int i110 = PayShopPaymentResultActivity.f28737Q;
                        return (PpTitleBar) payShopPaymentResultActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i13 = 4;
        this.f28748o = C2131j.b(new Function0(this) { // from class: sb.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentResultActivity f42113b;

            {
                this.f42113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopPaymentResultActivity payShopPaymentResultActivity = this.f42113b;
                switch (i13) {
                    case 0:
                        int i14 = PayShopPaymentResultActivity.f28737Q;
                        return (Button) payShopPaymentResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        int i15 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.btnShareReceipt);
                    case 2:
                        int i16 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.result_two_btn_view);
                    case 3:
                        int i17 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback2);
                    case 4:
                        int i18 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback);
                    case 5:
                        int i19 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.ll_order_info);
                    case 6:
                        int i110 = PayShopPaymentResultActivity.f28737Q;
                        return (TransactionResultHeaderModel) payShopPaymentResultActivity.findViewById(e.progressView);
                    default:
                        int i111 = PayShopPaymentResultActivity.f28737Q;
                        return (PpTitleBar) payShopPaymentResultActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i14 = 5;
        this.f28749p = C2131j.b(new Function0(this) { // from class: sb.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentResultActivity f42113b;

            {
                this.f42113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopPaymentResultActivity payShopPaymentResultActivity = this.f42113b;
                switch (i14) {
                    case 0:
                        int i15 = PayShopPaymentResultActivity.f28737Q;
                        return (Button) payShopPaymentResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        int i16 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.btnShareReceipt);
                    case 2:
                        int i17 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.result_two_btn_view);
                    case 3:
                        int i18 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback2);
                    case 4:
                        int i19 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback);
                    case 5:
                        int i110 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.ll_order_info);
                    case 6:
                        int i111 = PayShopPaymentResultActivity.f28737Q;
                        return (TransactionResultHeaderModel) payShopPaymentResultActivity.findViewById(e.progressView);
                    default:
                        int i112 = PayShopPaymentResultActivity.f28737Q;
                        return (PpTitleBar) payShopPaymentResultActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i15 = 6;
        this.t = C2131j.b(new Function0(this) { // from class: sb.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentResultActivity f42113b;

            {
                this.f42113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopPaymentResultActivity payShopPaymentResultActivity = this.f42113b;
                switch (i15) {
                    case 0:
                        int i16 = PayShopPaymentResultActivity.f28737Q;
                        return (Button) payShopPaymentResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        int i17 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.btnShareReceipt);
                    case 2:
                        int i18 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.result_two_btn_view);
                    case 3:
                        int i19 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback2);
                    case 4:
                        int i110 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback);
                    case 5:
                        int i111 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.ll_order_info);
                    case 6:
                        int i112 = PayShopPaymentResultActivity.f28737Q;
                        return (TransactionResultHeaderModel) payShopPaymentResultActivity.findViewById(e.progressView);
                    default:
                        int i113 = PayShopPaymentResultActivity.f28737Q;
                        return (PpTitleBar) payShopPaymentResultActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i16 = 7;
        this.f28750v = C2131j.b(new Function0(this) { // from class: sb.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentResultActivity f42113b;

            {
                this.f42113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopPaymentResultActivity payShopPaymentResultActivity = this.f42113b;
                switch (i16) {
                    case 0:
                        int i17 = PayShopPaymentResultActivity.f28737Q;
                        return (Button) payShopPaymentResultActivity.findViewById(e.result_right_btn);
                    case 1:
                        int i18 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.btnShareReceipt);
                    case 2:
                        int i19 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.result_two_btn_view);
                    case 3:
                        int i110 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback2);
                    case 4:
                        int i111 = PayShopPaymentResultActivity.f28737Q;
                        return (SingleAdView) payShopPaymentResultActivity.findViewById(e.ad_cashback);
                    case 5:
                        int i112 = PayShopPaymentResultActivity.f28737Q;
                        return (LinearLayout) payShopPaymentResultActivity.findViewById(e.ll_order_info);
                    case 6:
                        int i113 = PayShopPaymentResultActivity.f28737Q;
                        return (TransactionResultHeaderModel) payShopPaymentResultActivity.findViewById(e.progressView);
                    default:
                        int i114 = PayShopPaymentResultActivity.f28737Q;
                        return (PpTitleBar) payShopPaymentResultActivity.findViewById(e.title_bar);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01a3  */
    public static final void n(PayShopPaymentResultActivity payShopPaymentResultActivity) {
        Long l5;
        int i7 = 1;
        PayByOrderResp.DataBean dataBean = payShopPaymentResultActivity.f28738A;
        boolean zC = Intrinsics.c(dataBean != null ? Integer.valueOf(dataBean.payStatus) : null, 1);
        Object value = payShopPaymentResultActivity.f28746i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        h.s((LinearLayout) value, payShopPaymentResultActivity.f28738A != null);
        Object value2 = payShopPaymentResultActivity.f28744f.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((Button) value2).setText(zC ? k.core_complete : g.cs_send_again);
        Object value3 = payShopPaymentResultActivity.f28745g.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        h.s((LinearLayout) value3, zC);
        PayByOrderResp.DataBean dataBean2 = payShopPaymentResultActivity.f28738A;
        if (dataBean2 != null) {
            int i10 = dataBean2.payStatus;
            if (i10 == 1) {
                payShopPaymentResultActivity.p().j();
                AutoTrackUtil.trackTransactionResult(payShopPaymentResultActivity, 1);
                o(payShopPaymentResultActivity, "TransferPaymentResultsView", "TransferPaymentSuccessfulPage");
                payShopPaymentResultActivity.p().g(TransactionResultHeaderModel.a.successIcon$default(TransactionResultHeaderModel.f31650j, payShopPaymentResultActivity, 0.0f, 2, null));
                if (TextUtils.isEmpty(dataBean2.successfulDesc)) {
                    h.c(payShopPaymentResultActivity.p().getOrderResultStatusTipsTv());
                } else {
                    payShopPaymentResultActivity.p().h(dataBean2.successfulDesc);
                }
                payShopPaymentResultActivity.f28742L = b.r(V.f(payShopPaymentResultActivity), 3000L, null, new E(payShopPaymentResultActivity, null), null, 46);
            } else if (i10 == 0) {
                AutoTrackUtil.trackTransactionResult(payShopPaymentResultActivity, 2);
                if (payShopPaymentResultActivity.f28740C) {
                    o(payShopPaymentResultActivity, "TransferPaymentResultsView", "TransferPaymentPendingPage");
                }
                TransactionResultHeaderModel transactionResultHeaderModelP = payShopPaymentResultActivity.p();
                C1605b c1605b = new C1605b(16, payShopPaymentResultActivity, dataBean2);
                F f10 = new F(dataBean2, payShopPaymentResultActivity, null);
                transactionResultHeaderModelP.f31657g = c1605b;
                transactionResultHeaderModelP.f31656f = f10;
                payShopPaymentResultActivity.p().i(dataBean2.pendingAcTime - System.currentTimeMillis(), V.f(payShopPaymentResultActivity));
                CoroutineScope coroutineScopeH = V.h(payShopPaymentResultActivity.l());
                f fVar = I.f10809a;
                AbstractC0780y.m(coroutineScopeH, p042cg.e.f19009c, null, new D(payShopPaymentResultActivity, null), 2);
                long j6 = payShopPaymentResultActivity.f28741H;
                if (j6 < 5000) {
                    payShopPaymentResultActivity.f28741H = j6 + ((long) 1500);
                }
            } else {
                payShopPaymentResultActivity.p().j();
                AutoTrackUtil.trackTransactionResult(payShopPaymentResultActivity, 3);
                o(payShopPaymentResultActivity, "TransferPaymentResultsView", "TransferPaymentFailedPage");
                payShopPaymentResultActivity.p().g(TransactionResultHeaderModel.a.failIcon$default(TransactionResultHeaderModel.f31650j, payShopPaymentResultActivity, 0.0f, 2, null));
                if (TextUtils.isEmpty(dataBean2.errorMsg)) {
                    h.c(payShopPaymentResultActivity.p().getOrderResultStatusTipsTv());
                } else {
                    payShopPaymentResultActivity.p().h(dataBean2.errorMsg);
                }
            }
            QueryOrderDetailRsp queryOrderDetailRsp = payShopPaymentResultActivity.f28739B;
            long jLongValue = 0;
            if (queryOrderDetailRsp != null) {
                View viewFindViewById = payShopPaymentResultActivity.findViewById(e.ll_order_result_list);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                m.a((LinearLayout) viewFindViewById, queryOrderDetailRsp.orderResultList, queryOrderDetailRsp.orderResultKeyDetail);
                Object value4 = payShopPaymentResultActivity.f28749p.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                LinearLayout linearLayout = (LinearLayout) value4;
                List<QueryOrderDetailRsp.OrderResultItemBean> list = queryOrderDetailRsp.orderResultList;
                h.s(linearLayout, !(list == null || list.isEmpty()));
                View viewFindViewById2 = payShopPaymentResultActivity.findViewById(e.tv_view_detail);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                h.l(new n(27, payShopPaymentResultActivity, queryOrderDetailRsp), viewFindViewById2);
                Long l6 = queryOrderDetailRsp.returnPoint;
                if ((l6 != null ? l6.longValue() : 0L) > 0) {
                    Object value5 = payShopPaymentResultActivity.f28748o.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                    SingleAdView singleAdView = (SingleAdView) value5;
                    singleAdView.setSlotId(payShopPaymentResultActivity.getString(k.ad_payshop_result_cash_back));
                    singleAdView.setAdListener(new C2025x(i7));
                } else {
                    Long l8 = queryOrderDetailRsp.cashEarned;
                    if ((l8 != null ? l8.longValue() : 0L) > 0) {
                        Object value6 = payShopPaymentResultActivity.f28748o.getValue();
                        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                        SingleAdView singleAdView2 = (SingleAdView) value6;
                        singleAdView2.setSlotId(payShopPaymentResultActivity.getString(k.ad_payshop_result_cash_back));
                        singleAdView2.setAdListener(new C2025x(i7));
                    }
                }
                if (Intrinsics.c(queryOrderDetailRsp.returnPointFlag, Boolean.TRUE) && !payShopPaymentResultActivity.f28743M) {
                    payShopPaymentResultActivity.r(true);
                }
            }
            payShopPaymentResultActivity.p().e(dataBean2.payStatusDesc);
            TransactionResultHeaderModel transactionResultHeaderModelP2 = payShopPaymentResultActivity.p();
            QueryOrderDetailRsp queryOrderDetailRsp2 = payShopPaymentResultActivity.f28739B;
            if (queryOrderDetailRsp2 != null && (l5 = queryOrderDetailRsp2.payAmount) != null) {
                jLongValue = l5.longValue();
            }
            transactionResultHeaderModelP2.c(r0.B(jLongValue, true));
        }
    }

    public static void o(PayShopPaymentResultActivity payShopPaymentResultActivity, String str, String str2) {
        payShopPaymentResultActivity.getClass();
        ClickEvent clickEventAdd = new ClickEvent(str).add("element_name", str2);
        if ("TransferPaymentResultsView".equalsIgnoreCase(str) || "TransferPaymentResultsClick".equalsIgnoreCase(str)) {
            clickEventAdd.afEvt(true);
        }
        n0.g().k(clickEventAdd);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_activity_pay_shop_payment_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new p7.h(uIHandler, 6, this, false));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        o(this, "TransferPaymentResultsClick", "BackTransferPage");
        q();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        t0 t0Var = this.f28742L;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
        AdManager.clearPreloadSingleAd();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        PayByOrderResp.DataBean dataBean;
        if ((pushMessage != null ? pushMessage.content : null) != null && PushMessage.MESSAGE_TYPE_ORDER_STATUS_CHANGE.equals(pushMessage.content.messageType) && (dataBean = this.f28738A) != null && dataBean.payStatus == 0) {
            ((PayShopPaymentViewModel) l()).d(dataBean.orderNo);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f28740C) {
            this.f28740C = false;
        }
    }

    public final TransactionResultHeaderModel p() {
        Object value = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TransactionResultHeaderModel) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((PayShopPaymentViewModel) l()).f30704e;
        if (lVar != null) {
            lVar.e(this, new s(new w(this, 24), (byte) 0, false));
        }
    }

    public final void q() {
        c cVarB = c.b();
        TransactionEvent transactionEvent = new TransactionEvent();
        transactionEvent.setSendAgain(false);
        cVarB.f(transactionEvent);
        Activity activityS = i0.S("/send/money");
        if (activityS == null) {
            i0.H(null);
        } else {
            ActivityUtils.finishToActivity(activityS, false);
            finish();
        }
    }

    public final void r(boolean z3) {
        String string = getString(k.ad_send_money_result_cash_back_pop_up);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        InterstitialAdView interstitialAdView = new InterstitialAdView(string, null);
        interstitialAdView.setInterstitialListener(new C2025x(2));
        Intrinsics.checkNotNullParameter(this, "<this>");
        interstitialAdView.show(this, new N(z3, this, 8));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        ARouter.getInstance().inject(this);
        c.b().j(this);
        t tVar = this.f28750v;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ImageView backImageView = ((PpTitleBar) value).getBackImageView();
        if (backImageView != null) {
            h.s(backImageView, false);
        }
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((PpTitleBar) value2).setRightImageView2Icon(a.pay_CustomerService);
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        final int i7 = 2;
        ((PpTitleBar) value3).setRightImageView2ClickListener(new View.OnClickListener(this) { // from class: sb.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentResultActivity f42195b;

            {
                this.f42195b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        PayShopPaymentResultActivity payShopPaymentResultActivity = this.f42195b;
                        PayByOrderResp.DataBean dataBean = payShopPaymentResultActivity.f28738A;
                        if (dataBean != null) {
                            if (dataBean.payStatus != 1) {
                                c.b().f(new CouponEvent());
                                c cVarB = c.b();
                                TransactionEvent transactionEvent = new TransactionEvent();
                                transactionEvent.setSendAgain(true);
                                cVarB.f(transactionEvent);
                                payShopPaymentResultActivity.q();
                            } else {
                                PayShopPaymentResultActivity.o(payShopPaymentResultActivity, "TransferPaymentResultsClick", "Complete");
                                payShopPaymentResultActivity.q();
                            }
                        }
                        break;
                    case 1:
                        PayShopPaymentResultActivity payShopPaymentResultActivity2 = this.f42195b;
                        PayByOrderResp.DataBean dataBean2 = payShopPaymentResultActivity2.f28738A;
                        if (dataBean2 != null) {
                            if (dataBean2.payStatus != 1) {
                                dataBean2 = null;
                            }
                            if (dataBean2 != null) {
                                PayShopPaymentResultActivity.o(payShopPaymentResultActivity2, "TransferPaymentResultsClick", "ViewReceipt");
                                ARouter.getInstance().build("/credit_score/trans_receipt").withString("orderId", dataBean2.orderNo).navigation();
                            }
                        }
                        break;
                    default:
                        PayShopPaymentResultActivity payShopPaymentResultActivity3 = this.f42195b;
                        PayShopPaymentResultActivity.o(payShopPaymentResultActivity3, "TransferPaymentResultsClick", "CustomerService");
                        QueryOrderDetailRsp queryOrderDetailRsp = payShopPaymentResultActivity3.f28739B;
                        if (queryOrderDetailRsp != null) {
                            OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
                            orderInfoForCustomerService.paymentType = "Money Transfer";
                            Long l5 = queryOrderDetailRsp.orderSuccessTime;
                            orderInfoForCustomerService.time = l5 != null ? l5.longValue() : 0L;
                            Long l6 = queryOrderDetailRsp.amount;
                            orderInfoForCustomerService.amount = l6 != null ? l6.longValue() : 0L;
                            Long l8 = queryOrderDetailRsp.payeeFee;
                            orderInfoForCustomerService.fee = l8 != null ? l8.longValue() : 0L;
                            Long l10 = queryOrderDetailRsp.deductionPointAmount;
                            orderInfoForCustomerService.pointsUsed = l10 != null ? l10.longValue() : 0L;
                            Long l11 = queryOrderDetailRsp.returnPoint;
                            orderInfoForCustomerService.pointsEarned = l11 != null ? l11.longValue() : 0L;
                            orderInfoForCustomerService.orderNumber = queryOrderDetailRsp.orderNo;
                            orderInfoForCustomerService.orderStatus = queryOrderDetailRsp.orderStatusDesc;
                            BillProcessDetail billProcessDetail = queryOrderDetailRsp.orderStatusInfo;
                            if (billProcessDetail != null) {
                                orderInfoForCustomerService.faqUrl = billProcessDetail.faqLink;
                            }
                            orderInfoForCustomerService.transType = TransType.TRANS_TYPE_PAY_SHOP;
                            i0.M(payShopPaymentResultActivity3, orderInfoForCustomerService);
                        }
                        break;
                }
            }
        });
        Object value4 = this.f28744f.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i10 = 0;
        h.l(new View.OnClickListener(this) { // from class: sb.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentResultActivity f42195b;

            {
                this.f42195b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        PayShopPaymentResultActivity payShopPaymentResultActivity = this.f42195b;
                        PayByOrderResp.DataBean dataBean = payShopPaymentResultActivity.f28738A;
                        if (dataBean != null) {
                            if (dataBean.payStatus != 1) {
                                c.b().f(new CouponEvent());
                                c cVarB = c.b();
                                TransactionEvent transactionEvent = new TransactionEvent();
                                transactionEvent.setSendAgain(true);
                                cVarB.f(transactionEvent);
                                payShopPaymentResultActivity.q();
                            } else {
                                PayShopPaymentResultActivity.o(payShopPaymentResultActivity, "TransferPaymentResultsClick", "Complete");
                                payShopPaymentResultActivity.q();
                            }
                        }
                        break;
                    case 1:
                        PayShopPaymentResultActivity payShopPaymentResultActivity2 = this.f42195b;
                        PayByOrderResp.DataBean dataBean2 = payShopPaymentResultActivity2.f28738A;
                        if (dataBean2 != null) {
                            if (dataBean2.payStatus != 1) {
                                dataBean2 = null;
                            }
                            if (dataBean2 != null) {
                                PayShopPaymentResultActivity.o(payShopPaymentResultActivity2, "TransferPaymentResultsClick", "ViewReceipt");
                                ARouter.getInstance().build("/credit_score/trans_receipt").withString("orderId", dataBean2.orderNo).navigation();
                            }
                        }
                        break;
                    default:
                        PayShopPaymentResultActivity payShopPaymentResultActivity3 = this.f42195b;
                        PayShopPaymentResultActivity.o(payShopPaymentResultActivity3, "TransferPaymentResultsClick", "CustomerService");
                        QueryOrderDetailRsp queryOrderDetailRsp = payShopPaymentResultActivity3.f28739B;
                        if (queryOrderDetailRsp != null) {
                            OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
                            orderInfoForCustomerService.paymentType = "Money Transfer";
                            Long l5 = queryOrderDetailRsp.orderSuccessTime;
                            orderInfoForCustomerService.time = l5 != null ? l5.longValue() : 0L;
                            Long l6 = queryOrderDetailRsp.amount;
                            orderInfoForCustomerService.amount = l6 != null ? l6.longValue() : 0L;
                            Long l8 = queryOrderDetailRsp.payeeFee;
                            orderInfoForCustomerService.fee = l8 != null ? l8.longValue() : 0L;
                            Long l10 = queryOrderDetailRsp.deductionPointAmount;
                            orderInfoForCustomerService.pointsUsed = l10 != null ? l10.longValue() : 0L;
                            Long l11 = queryOrderDetailRsp.returnPoint;
                            orderInfoForCustomerService.pointsEarned = l11 != null ? l11.longValue() : 0L;
                            orderInfoForCustomerService.orderNumber = queryOrderDetailRsp.orderNo;
                            orderInfoForCustomerService.orderStatus = queryOrderDetailRsp.orderStatusDesc;
                            BillProcessDetail billProcessDetail = queryOrderDetailRsp.orderStatusInfo;
                            if (billProcessDetail != null) {
                                orderInfoForCustomerService.faqUrl = billProcessDetail.faqLink;
                            }
                            orderInfoForCustomerService.transType = TransType.TRANS_TYPE_PAY_SHOP;
                            i0.M(payShopPaymentResultActivity3, orderInfoForCustomerService);
                        }
                        break;
                }
            }
        }, (Button) value4);
        Object value5 = this.f28745g.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        final int i11 = 1;
        h.l(new View.OnClickListener(this) { // from class: sb.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentResultActivity f42195b;

            {
                this.f42195b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        PayShopPaymentResultActivity payShopPaymentResultActivity = this.f42195b;
                        PayByOrderResp.DataBean dataBean = payShopPaymentResultActivity.f28738A;
                        if (dataBean != null) {
                            if (dataBean.payStatus != 1) {
                                c.b().f(new CouponEvent());
                                c cVarB = c.b();
                                TransactionEvent transactionEvent = new TransactionEvent();
                                transactionEvent.setSendAgain(true);
                                cVarB.f(transactionEvent);
                                payShopPaymentResultActivity.q();
                            } else {
                                PayShopPaymentResultActivity.o(payShopPaymentResultActivity, "TransferPaymentResultsClick", "Complete");
                                payShopPaymentResultActivity.q();
                            }
                        }
                        break;
                    case 1:
                        PayShopPaymentResultActivity payShopPaymentResultActivity2 = this.f42195b;
                        PayByOrderResp.DataBean dataBean2 = payShopPaymentResultActivity2.f28738A;
                        if (dataBean2 != null) {
                            if (dataBean2.payStatus != 1) {
                                dataBean2 = null;
                            }
                            if (dataBean2 != null) {
                                PayShopPaymentResultActivity.o(payShopPaymentResultActivity2, "TransferPaymentResultsClick", "ViewReceipt");
                                ARouter.getInstance().build("/credit_score/trans_receipt").withString("orderId", dataBean2.orderNo).navigation();
                            }
                        }
                        break;
                    default:
                        PayShopPaymentResultActivity payShopPaymentResultActivity3 = this.f42195b;
                        PayShopPaymentResultActivity.o(payShopPaymentResultActivity3, "TransferPaymentResultsClick", "CustomerService");
                        QueryOrderDetailRsp queryOrderDetailRsp = payShopPaymentResultActivity3.f28739B;
                        if (queryOrderDetailRsp != null) {
                            OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
                            orderInfoForCustomerService.paymentType = "Money Transfer";
                            Long l5 = queryOrderDetailRsp.orderSuccessTime;
                            orderInfoForCustomerService.time = l5 != null ? l5.longValue() : 0L;
                            Long l6 = queryOrderDetailRsp.amount;
                            orderInfoForCustomerService.amount = l6 != null ? l6.longValue() : 0L;
                            Long l8 = queryOrderDetailRsp.payeeFee;
                            orderInfoForCustomerService.fee = l8 != null ? l8.longValue() : 0L;
                            Long l10 = queryOrderDetailRsp.deductionPointAmount;
                            orderInfoForCustomerService.pointsUsed = l10 != null ? l10.longValue() : 0L;
                            Long l11 = queryOrderDetailRsp.returnPoint;
                            orderInfoForCustomerService.pointsEarned = l11 != null ? l11.longValue() : 0L;
                            orderInfoForCustomerService.orderNumber = queryOrderDetailRsp.orderNo;
                            orderInfoForCustomerService.orderStatus = queryOrderDetailRsp.orderStatusDesc;
                            BillProcessDetail billProcessDetail = queryOrderDetailRsp.orderStatusInfo;
                            if (billProcessDetail != null) {
                                orderInfoForCustomerService.faqUrl = billProcessDetail.faqLink;
                            }
                            orderInfoForCustomerService.transType = TransType.TRANS_TYPE_PAY_SHOP;
                            i0.M(payShopPaymentResultActivity3, orderInfoForCustomerService);
                        }
                        break;
                }
            }
        }, (LinearLayout) value5);
        h.l(new A(0), p().getOrderResultStatusTipsTv());
    }
}
