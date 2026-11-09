package com.transsnet.palmpay.cash_in.ui.activity;

import Ab.ViewOnClickListenerC0053e;
import Ad.C0058e;
import C9.C0138e;
import C9.C0139f;
import C9.K;
import C9.L;
import C9.M;
import C9.N;
import L6.b;
import Oa.m;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.t0;
import android.app.Activity;
import android.os.Bundle;
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
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawAgentPaymentResultActivity;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawDetailViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p042cg.e;
import p042cg.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;
import p366y9.d;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cash_in_out/withdraw_agent_payment_result")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/activity/WithdrawAgentPaymentResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/cash_in/ui/viewmodel/WithdrawDetailViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "a", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawAgentPaymentResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawAgentPaymentResultActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/WithdrawAgentPaymentResultActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,505:1\n115#2,8:506\n145#2:514\n1#3:515\n*S KotlinDebug\n*F\n+ 1 WithdrawAgentPaymentResultActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/WithdrawAgentPaymentResultActivity\n*L\n342#1:506,8\n342#1:514\n*E\n"})
public final class WithdrawAgentPaymentResultActivity extends BaseMvvmActivity<WithdrawDetailViewModel> {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f26909H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f26910A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public t0 f26911B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f26912C;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f26913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f26914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f26915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f26916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f26917g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f26918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f26919j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f26920o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PayByOrderResp.DataBean f26921p;
    public QueryOrderDetailRsp t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f26922v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f26923w = 100;

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

    public WithdrawAgentPaymentResultActivity() {
        final int i7 = 0;
        this.f26913c = C2131j.b(new Function0(this) { // from class: C9.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentPaymentResultActivity f1259b;

            {
                this.f1259b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = this.f1259b;
                switch (i7) {
                    case 0:
                        int i10 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (Button) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_right_btn);
                    case 1:
                        int i11 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.btnShareReceipt);
                    case 2:
                        int i12 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_two_btn_view);
                    case 3:
                        int i13 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback2);
                    case 4:
                        int i14 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback);
                    case 5:
                        int i15 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ll_order_info);
                    case 6:
                        int i16 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (TransactionResultHeaderModel) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.progressView);
                    default:
                        int i17 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (PpTitleBar) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.title_bar);
                }
            }
        });
        final int i10 = 1;
        this.f26914d = C2131j.b(new Function0(this) { // from class: C9.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentPaymentResultActivity f1259b;

            {
                this.f1259b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = this.f1259b;
                switch (i10) {
                    case 0:
                        int i11 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (Button) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_right_btn);
                    case 1:
                        int i12 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.btnShareReceipt);
                    case 2:
                        int i13 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_two_btn_view);
                    case 3:
                        int i14 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback2);
                    case 4:
                        int i15 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback);
                    case 5:
                        int i16 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ll_order_info);
                    case 6:
                        int i17 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (TransactionResultHeaderModel) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.progressView);
                    default:
                        int i18 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (PpTitleBar) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.title_bar);
                }
            }
        });
        final int i11 = 2;
        this.f26915e = C2131j.b(new Function0(this) { // from class: C9.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentPaymentResultActivity f1259b;

            {
                this.f1259b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = this.f1259b;
                switch (i11) {
                    case 0:
                        int i12 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (Button) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_right_btn);
                    case 1:
                        int i13 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.btnShareReceipt);
                    case 2:
                        int i14 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_two_btn_view);
                    case 3:
                        int i15 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback2);
                    case 4:
                        int i16 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback);
                    case 5:
                        int i17 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ll_order_info);
                    case 6:
                        int i18 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (TransactionResultHeaderModel) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.progressView);
                    default:
                        int i19 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (PpTitleBar) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.title_bar);
                }
            }
        });
        final int i12 = 3;
        this.f26916f = C2131j.b(new Function0(this) { // from class: C9.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentPaymentResultActivity f1259b;

            {
                this.f1259b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = this.f1259b;
                switch (i12) {
                    case 0:
                        int i13 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (Button) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_right_btn);
                    case 1:
                        int i14 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.btnShareReceipt);
                    case 2:
                        int i15 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_two_btn_view);
                    case 3:
                        int i16 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback2);
                    case 4:
                        int i17 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback);
                    case 5:
                        int i18 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ll_order_info);
                    case 6:
                        int i19 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (TransactionResultHeaderModel) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.progressView);
                    default:
                        int i110 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (PpTitleBar) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.title_bar);
                }
            }
        });
        final int i13 = 4;
        this.f26917g = C2131j.b(new Function0(this) { // from class: C9.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentPaymentResultActivity f1259b;

            {
                this.f1259b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = this.f1259b;
                switch (i13) {
                    case 0:
                        int i14 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (Button) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_right_btn);
                    case 1:
                        int i15 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.btnShareReceipt);
                    case 2:
                        int i16 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_two_btn_view);
                    case 3:
                        int i17 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback2);
                    case 4:
                        int i18 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback);
                    case 5:
                        int i19 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ll_order_info);
                    case 6:
                        int i110 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (TransactionResultHeaderModel) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.progressView);
                    default:
                        int i111 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (PpTitleBar) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.title_bar);
                }
            }
        });
        final int i14 = 5;
        this.f26918i = C2131j.b(new Function0(this) { // from class: C9.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentPaymentResultActivity f1259b;

            {
                this.f1259b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = this.f1259b;
                switch (i14) {
                    case 0:
                        int i15 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (Button) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_right_btn);
                    case 1:
                        int i16 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.btnShareReceipt);
                    case 2:
                        int i17 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_two_btn_view);
                    case 3:
                        int i18 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback2);
                    case 4:
                        int i19 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback);
                    case 5:
                        int i110 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ll_order_info);
                    case 6:
                        int i111 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (TransactionResultHeaderModel) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.progressView);
                    default:
                        int i112 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (PpTitleBar) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.title_bar);
                }
            }
        });
        final int i15 = 6;
        this.f26919j = C2131j.b(new Function0(this) { // from class: C9.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentPaymentResultActivity f1259b;

            {
                this.f1259b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = this.f1259b;
                switch (i15) {
                    case 0:
                        int i16 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (Button) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_right_btn);
                    case 1:
                        int i17 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.btnShareReceipt);
                    case 2:
                        int i18 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_two_btn_view);
                    case 3:
                        int i19 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback2);
                    case 4:
                        int i110 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback);
                    case 5:
                        int i111 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ll_order_info);
                    case 6:
                        int i112 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (TransactionResultHeaderModel) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.progressView);
                    default:
                        int i113 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (PpTitleBar) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.title_bar);
                }
            }
        });
        final int i16 = 7;
        this.f26920o = C2131j.b(new Function0(this) { // from class: C9.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentPaymentResultActivity f1259b;

            {
                this.f1259b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = this.f1259b;
                switch (i16) {
                    case 0:
                        int i17 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (Button) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_right_btn);
                    case 1:
                        int i18 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.btnShareReceipt);
                    case 2:
                        int i19 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.result_two_btn_view);
                    case 3:
                        int i110 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback2);
                    case 4:
                        int i111 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (SingleAdView) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ad_cashback);
                    case 5:
                        int i112 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (LinearLayout) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.ll_order_info);
                    case 6:
                        int i113 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (TransactionResultHeaderModel) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.progressView);
                    default:
                        int i114 = WithdrawAgentPaymentResultActivity.f26909H;
                        return (PpTitleBar) withdrawAgentPaymentResultActivity.findViewById(p366y9.b.title_bar);
                }
            }
        });
    }

    public static void m(WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity, String str, String str2) {
        withdrawAgentPaymentResultActivity.getClass();
        ClickEvent clickEventAdd = new ClickEvent(str).add("element_name", str2);
        if ("TransferPaymentResultsView".equalsIgnoreCase(str) || "TransferPaymentResultsClick".equalsIgnoreCase(str)) {
            clickEventAdd.afEvt(true);
        }
        n0.g().k(clickEventAdd);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.ci_activity_withdraw_agent_payment_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        PayByOrderResp.DataBean dataBean = this.f26921p;
        if (dataBean != null) {
            C0525w c0525wF = C0525w.f();
            String str = dataBean.orderData;
            c0525wF.getClass();
            this.t = (QueryOrderDetailRsp) C0525w.d(str, QueryOrderDetailRsp.class);
            p();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final TransactionResultHeaderModel n() {
        Object value = this.f26919j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TransactionResultHeaderModel) value;
    }

    public final void o() {
        Activity activityS = i0.S("/send/money");
        if (activityS == null) {
            i0.H(null);
        } else {
            ActivityUtils.finishToActivity(activityS, false);
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        m(this, "TransferPaymentResultsClick", "BackTransferPage");
        o();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        t0 t0Var = this.f26911B;
        if (t0Var != null) {
            this.f26910A = true;
            t0Var.cancel((CancellationException) null);
        }
        AdManager.clearPreloadSingleAd();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        PayByOrderResp.DataBean dataBean;
        if ((pushMessage != null ? pushMessage.content : null) != null && PushMessage.MESSAGE_TYPE_ORDER_STATUS_CHANGE.equals(pushMessage.content.messageType) && (dataBean = this.f26921p) != null && dataBean.payStatus == 0) {
            ((WithdrawDetailViewModel) l()).d(dataBean.orderNo);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f26922v) {
            this.f26922v = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01a3  */
    public final void p() {
        Long l5;
        int i7 = 3;
        PayByOrderResp.DataBean dataBean = this.f26921p;
        boolean zC = Intrinsics.c(dataBean != null ? Integer.valueOf(dataBean.payStatus) : null, 1);
        Object value = this.f26915e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        h.s((LinearLayout) value, this.f26921p != null);
        Object value2 = this.f26913c.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((Button) value2).setText(zC ? k.core_complete : d.ci_another_transfer_text);
        Object value3 = this.f26914d.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        h.s((LinearLayout) value3, zC);
        PayByOrderResp.DataBean dataBean2 = this.f26921p;
        if (dataBean2 != null) {
            int i10 = dataBean2.payStatus;
            if (i10 == 1) {
                n().j();
                AutoTrackUtil.trackTransactionResult(this, 1);
                m(this, "TransferPaymentResultsView", "TransferPaymentSuccessfulPage");
                n().g(TransactionResultHeaderModel.a.successIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
                if (TextUtils.isEmpty(dataBean2.successfulDesc)) {
                    h.c(n().getOrderResultStatusTipsTv());
                } else {
                    n().h(dataBean2.successfulDesc);
                }
                this.f26911B = org.chromium.support_lib_boundary.util.b.r(V.f(this), 3000L, null, new L(this, null), null, 46);
            } else if (i10 == 0) {
                AutoTrackUtil.trackTransactionResult(this, 2);
                if (this.f26922v) {
                    m(this, "TransferPaymentResultsView", "TransferPaymentPendingPage");
                }
                TransactionResultHeaderModel transactionResultHeaderModelN = n();
                C0058e c0058e = new C0058e(i7, this, dataBean2);
                M m7 = new M(dataBean2, this, null);
                transactionResultHeaderModelN.f31657g = c0058e;
                transactionResultHeaderModelN.f31656f = m7;
                n().i(dataBean2.pendingAcTime - System.currentTimeMillis(), V.f(this));
                CoroutineScope coroutineScopeH = V.h(l());
                f fVar = I.f10809a;
                AbstractC0780y.m(coroutineScopeH, e.f19009c, null, new K(this, null), 2);
                long j6 = this.f26923w;
                if (j6 < 5000) {
                    this.f26923w = j6 + ((long) 1500);
                }
            } else {
                n().j();
                AutoTrackUtil.trackTransactionResult(this, 3);
                m(this, "TransferPaymentResultsView", "TransferPaymentFailedPage");
                n().g(TransactionResultHeaderModel.a.failIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
                if (TextUtils.isEmpty(dataBean2.errorMsg)) {
                    h.c(n().getOrderResultStatusTipsTv());
                } else {
                    n().h(dataBean2.errorMsg);
                }
            }
            QueryOrderDetailRsp queryOrderDetailRsp = this.t;
            long jLongValue = 0;
            if (queryOrderDetailRsp != null) {
                View viewFindViewById = findViewById(p366y9.b.ll_order_result_list);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                m.a((LinearLayout) viewFindViewById, queryOrderDetailRsp.orderResultList, queryOrderDetailRsp.orderResultKeyDetail);
                Object value4 = this.f26918i.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                LinearLayout linearLayout = (LinearLayout) value4;
                List<QueryOrderDetailRsp.OrderResultItemBean> list = queryOrderDetailRsp.orderResultList;
                h.s(linearLayout, !(list == null || list.isEmpty()));
                View viewFindViewById2 = findViewById(p366y9.b.tv_view_detail);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                h.l(new A8.c(5, this, queryOrderDetailRsp), viewFindViewById2);
                Long l6 = queryOrderDetailRsp.returnPoint;
                if ((l6 != null ? l6.longValue() : 0L) > 0) {
                    Object value5 = this.f26917g.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                    SingleAdView singleAdView = (SingleAdView) value5;
                    singleAdView.setSlotId(getString(k.ad_payshop_result_cash_back));
                    singleAdView.setAdListener(new Ab.k(2));
                } else {
                    Long l8 = queryOrderDetailRsp.cashEarned;
                    if ((l8 != null ? l8.longValue() : 0L) > 0) {
                        Object value6 = this.f26917g.getValue();
                        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                        SingleAdView singleAdView2 = (SingleAdView) value6;
                        singleAdView2.setSlotId(getString(k.ad_payshop_result_cash_back));
                        singleAdView2.setAdListener(new Ab.k(2));
                    }
                }
                if (Intrinsics.c(queryOrderDetailRsp.returnPointFlag, Boolean.TRUE) && !this.f26912C) {
                    q(true);
                }
            }
            n().e(dataBean2.payStatusDesc);
            TransactionResultHeaderModel transactionResultHeaderModelN2 = n();
            QueryOrderDetailRsp queryOrderDetailRsp2 = this.t;
            if (queryOrderDetailRsp2 != null && (l5 = queryOrderDetailRsp2.payAmount) != null) {
                jLongValue = l5.longValue();
            }
            transactionResultHeaderModelN2.c(r0.B(jLongValue, true));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((WithdrawDetailViewModel) l()).f27106f;
        if (lVar != null) {
            lVar.e(this, new C0138e(new C0139f(this, 2), (byte) 0));
        }
    }

    public final void q(boolean z3) {
        String string = getString(k.ad_send_money_result_cash_back_pop_up);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        InterstitialAdView interstitialAdView = new InterstitialAdView(string, null);
        interstitialAdView.setInterstitialListener(new Ab.k(3));
        Intrinsics.checkNotNullParameter(this, "<this>");
        interstitialAdView.show(this, new N(z3, this, 0));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        org.greenrobot.eventbus.c.b().j(this);
        t tVar = this.f26920o;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ImageView backImageView = ((PpTitleBar) value).getBackImageView();
        Intrinsics.checkNotNullExpressionValue(backImageView, "getBackImageView(...)");
        h.c(backImageView);
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((PpTitleBar) value2).setRightImageView1Icon(S6.a.pay_CustomerService);
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        final int i7 = 2;
        ((PpTitleBar) value3).setRightImageView1ClickListener(new View.OnClickListener(this) { // from class: C9.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentPaymentResultActivity f1257b;

            {
                this.f1257b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = this.f1257b;
                        PayByOrderResp.DataBean dataBean = withdrawAgentPaymentResultActivity.f26921p;
                        if (dataBean != null) {
                            if (dataBean.payStatus != 1) {
                                withdrawAgentPaymentResultActivity.o();
                            } else {
                                WithdrawAgentPaymentResultActivity.m(withdrawAgentPaymentResultActivity, "TransferPaymentResultsClick", "Complete");
                                withdrawAgentPaymentResultActivity.o();
                            }
                        }
                        break;
                    case 1:
                        WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity2 = this.f1257b;
                        PayByOrderResp.DataBean dataBean2 = withdrawAgentPaymentResultActivity2.f26921p;
                        if (dataBean2 != null) {
                            if (dataBean2.payStatus != 1) {
                                dataBean2 = null;
                            }
                            if (dataBean2 != null) {
                                WithdrawAgentPaymentResultActivity.m(withdrawAgentPaymentResultActivity2, "TransferPaymentResultsClick", "ViewReceipt");
                                ARouter.getInstance().build("/cash_in_out/trans_receipt").withString("transType", TransType.TRANS_TYPE_WITHDRAW_TO_AGENT).withString("orderId", dataBean2.orderNo).navigation();
                            }
                        }
                        break;
                    default:
                        WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity3 = this.f1257b;
                        WithdrawAgentPaymentResultActivity.m(withdrawAgentPaymentResultActivity3, "TransferPaymentResultsClick", "CustomerService");
                        QueryOrderDetailRsp queryOrderDetailRsp = withdrawAgentPaymentResultActivity3.t;
                        if (queryOrderDetailRsp != null) {
                            OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
                            orderInfoForCustomerService.paymentType = withdrawAgentPaymentResultActivity3.getString(p366y9.d.ci_withdraw_agent_label);
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
                            orderInfoForCustomerService.transType = TransType.TRANS_TYPE_WITHDRAW_TO_AGENT;
                            i0.M(withdrawAgentPaymentResultActivity3, orderInfoForCustomerService);
                        }
                        break;
                }
            }
        });
        Object value4 = this.f26913c.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i10 = 0;
        ((Button) value4).setOnClickListener(new View.OnClickListener(this) { // from class: C9.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentPaymentResultActivity f1257b;

            {
                this.f1257b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = this.f1257b;
                        PayByOrderResp.DataBean dataBean = withdrawAgentPaymentResultActivity.f26921p;
                        if (dataBean != null) {
                            if (dataBean.payStatus != 1) {
                                withdrawAgentPaymentResultActivity.o();
                            } else {
                                WithdrawAgentPaymentResultActivity.m(withdrawAgentPaymentResultActivity, "TransferPaymentResultsClick", "Complete");
                                withdrawAgentPaymentResultActivity.o();
                            }
                        }
                        break;
                    case 1:
                        WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity2 = this.f1257b;
                        PayByOrderResp.DataBean dataBean2 = withdrawAgentPaymentResultActivity2.f26921p;
                        if (dataBean2 != null) {
                            if (dataBean2.payStatus != 1) {
                                dataBean2 = null;
                            }
                            if (dataBean2 != null) {
                                WithdrawAgentPaymentResultActivity.m(withdrawAgentPaymentResultActivity2, "TransferPaymentResultsClick", "ViewReceipt");
                                ARouter.getInstance().build("/cash_in_out/trans_receipt").withString("transType", TransType.TRANS_TYPE_WITHDRAW_TO_AGENT).withString("orderId", dataBean2.orderNo).navigation();
                            }
                        }
                        break;
                    default:
                        WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity3 = this.f1257b;
                        WithdrawAgentPaymentResultActivity.m(withdrawAgentPaymentResultActivity3, "TransferPaymentResultsClick", "CustomerService");
                        QueryOrderDetailRsp queryOrderDetailRsp = withdrawAgentPaymentResultActivity3.t;
                        if (queryOrderDetailRsp != null) {
                            OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
                            orderInfoForCustomerService.paymentType = withdrawAgentPaymentResultActivity3.getString(p366y9.d.ci_withdraw_agent_label);
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
                            orderInfoForCustomerService.transType = TransType.TRANS_TYPE_WITHDRAW_TO_AGENT;
                            i0.M(withdrawAgentPaymentResultActivity3, orderInfoForCustomerService);
                        }
                        break;
                }
            }
        });
        Object value5 = this.f26914d.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        final int i11 = 1;
        ((LinearLayout) value5).setOnClickListener(new View.OnClickListener(this) { // from class: C9.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentPaymentResultActivity f1257b;

            {
                this.f1257b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = this.f1257b;
                        PayByOrderResp.DataBean dataBean = withdrawAgentPaymentResultActivity.f26921p;
                        if (dataBean != null) {
                            if (dataBean.payStatus != 1) {
                                withdrawAgentPaymentResultActivity.o();
                            } else {
                                WithdrawAgentPaymentResultActivity.m(withdrawAgentPaymentResultActivity, "TransferPaymentResultsClick", "Complete");
                                withdrawAgentPaymentResultActivity.o();
                            }
                        }
                        break;
                    case 1:
                        WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity2 = this.f1257b;
                        PayByOrderResp.DataBean dataBean2 = withdrawAgentPaymentResultActivity2.f26921p;
                        if (dataBean2 != null) {
                            if (dataBean2.payStatus != 1) {
                                dataBean2 = null;
                            }
                            if (dataBean2 != null) {
                                WithdrawAgentPaymentResultActivity.m(withdrawAgentPaymentResultActivity2, "TransferPaymentResultsClick", "ViewReceipt");
                                ARouter.getInstance().build("/cash_in_out/trans_receipt").withString("transType", TransType.TRANS_TYPE_WITHDRAW_TO_AGENT).withString("orderId", dataBean2.orderNo).navigation();
                            }
                        }
                        break;
                    default:
                        WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity3 = this.f1257b;
                        WithdrawAgentPaymentResultActivity.m(withdrawAgentPaymentResultActivity3, "TransferPaymentResultsClick", "CustomerService");
                        QueryOrderDetailRsp queryOrderDetailRsp = withdrawAgentPaymentResultActivity3.t;
                        if (queryOrderDetailRsp != null) {
                            OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
                            orderInfoForCustomerService.paymentType = withdrawAgentPaymentResultActivity3.getString(p366y9.d.ci_withdraw_agent_label);
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
                            orderInfoForCustomerService.transType = TransType.TRANS_TYPE_WITHDRAW_TO_AGENT;
                            i0.M(withdrawAgentPaymentResultActivity3, orderInfoForCustomerService);
                        }
                        break;
                }
            }
        });
        n().getOrderResultStatusTipsTv().setOnClickListener(new ViewOnClickListenerC0053e(2));
        t tVar2 = this.f26916f;
        Object value6 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        SingleAdView singleAdView = (SingleAdView) value6;
        singleAdView.setSlotId(getString(k.ad_send_money_result_cash_back2));
        Object value7 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        singleAdView.setAdListener(new com.chuanyi.ad.a((SingleAdView) value7, ""));
        q(false);
    }
}
