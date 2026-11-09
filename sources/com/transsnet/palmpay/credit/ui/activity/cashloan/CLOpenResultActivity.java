package com.transsnet.palmpay.credit.ui.activity.cashloan;

import Ab.w;
import Bc.q;
import C0.G;
import F6.d;
import Oc.C0500c;
import Pa.AbstractC0511h;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Ya.g;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.api.Service;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.req.DoubleOpenStaySendCouponReq;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.credit.bean.req.CLQueryApplyAuditResultReq;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CardRiskLevelResp;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOpenResultActivity;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeSuccFragment;
import com.transsnet.palmpay.credit.ui.view.BorrowCLInfoView;
import com.transsnet.palmpay.credit.ui.viewmodel.OpenResultViewModel;
import com.transsnet.palmpay.credit.view.OpenResultTaskView;
import com.transsnet.palmpay.custom_view.CircleProgressView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.SpanUtils;
import io.reactivex.internal.operators.observable.C1762n;
import io.reactivex.internal.operators.observable.y;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p116hb.f;
import p141j9.C1798f;
import p143jb.j;
import p143jb.o;
import p161kf.e;
import p186mb.b;
import p220oa.h;
import p284sb.C2023v;
import p294tb.B;
import p294tb.C2055q;
import p294tb.D;
import p294tb.I;
import p294tb.J;
import p294tb.K;
import p294tb.L;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit授信结果页", path = "/credit_score/ol_open_result_activity")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLOpenResultActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/ui/viewmodel/OpenResultViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCLOpenResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CLOpenResultActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/cashloan/CLOpenResultActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,989:1\n171#2,12:990\n215#2:1002\n171#2,12:1003\n215#2:1015\n171#2,12:1016\n215#2:1028\n171#2,12:1029\n215#2:1041\n*S KotlinDebug\n*F\n+ 1 CLOpenResultActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/cashloan/CLOpenResultActivity\n*L\n206#1:990,12\n206#1:1002\n216#1:1003,12\n216#1:1015\n225#1:1016,12\n225#1:1028\n243#1:1029,12\n243#1:1041\n*E\n"})
public final class CLOpenResultActivity extends CreditBaseMvvmActivity<OpenResultViewModel> {

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final /* synthetic */ int f28955V0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f28956A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final t f28957A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f28958B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final t f28959B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f28960C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final t f28961C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final t f28962D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final t f28963E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final t f28964F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final t f28965G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f28966H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public CLOpenAccountData f28967H0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final t f28970K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f28971L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f28973M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public CLRepaymentPlanData f28974M0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public e f28977P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f28978Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public int f28979Q0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public final t f28982U0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f28983X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f28984Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f28985Z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f28986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28987g;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f28990k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28991o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28992p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f28993p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f28994q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f28995r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f28996s0;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f28997t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final t f28998u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f28999v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final t f29000v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29001w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final t f29002w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final t f29003x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final t f29004y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final t f29005z0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f28988i = C1850q.i("https://static.chuanyinet.com/images/loan_apply_result_instruction_1115ad4a9-7190-4d.webp", "https://static.chuanyinet.com/images/loan_apply_result_instruction_2601ab27d-3b45-4a.webp");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f28989j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f28968I0 = true;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final Handler f28969J0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f28972L0 = true;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final ArrayList f28975N0 = new ArrayList();

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public String f28976O0 = "CASH_LOAN";

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final long f28980R0 = 5000;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public int f28981S0 = 10;
    public final Handler T0 = new Handler(Looper.getMainLooper());

    public CLOpenResultActivity() {
        final int i7 = 10;
        this.f28991o = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i7) {
                    case 0:
                        int i10 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i11 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i12 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i13 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i14 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i15 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i16 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i17 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i18 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i19 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i20 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i21 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i22 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i23 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i10 = 2;
        this.f28992p = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i10) {
                    case 0:
                        int i11 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i12 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i13 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i14 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i15 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i16 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i17 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i18 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i19 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i20 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i21 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i22 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i23 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i11 = 14;
        this.t = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i11) {
                    case 0:
                        int i12 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i13 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i14 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i15 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i16 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i17 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i18 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i19 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i20 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i21 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i22 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i23 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i12 = 22;
        this.f28999v = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i12) {
                    case 0:
                        int i13 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i14 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i15 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i16 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i17 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i18 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i19 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i20 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i21 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i22 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i23 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i13 = 23;
        this.f29001w = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i13) {
                    case 0:
                        int i14 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i15 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i16 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i17 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i18 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i19 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i20 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i21 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i22 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i23 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i14 = 24;
        this.f28956A = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i14) {
                    case 0:
                        int i15 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i16 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i17 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i18 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i19 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i20 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i21 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i22 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i23 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i15 = 25;
        this.f28958B = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i15) {
                    case 0:
                        int i16 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i17 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i18 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i19 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i20 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i21 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i22 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i23 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i16 = 26;
        this.f28960C = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i16) {
                    case 0:
                        int i17 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i18 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i19 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i20 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i21 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i22 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i23 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i17 = 27;
        this.f28966H = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i17) {
                    case 0:
                        int i18 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i19 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i20 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i21 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i22 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i23 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i18 = 28;
        this.f28971L = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i18) {
                    case 0:
                        int i19 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i20 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i21 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i22 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i23 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i19 = 21;
        this.f28973M = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i19) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i20 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i21 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i22 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i23 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i20 = 29;
        this.f28978Q = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i20) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i21 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i22 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i23 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i21 = 0;
        this.f28983X = C2131j.b(new Function0(this) { // from class: tb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42406b;

            {
                this.f42406b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42406b;
                switch (i21) {
                    case 0:
                        int i22 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_open_agreement_tv);
                    case 1:
                        int i23 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_both_borrow_tv);
                    case 2:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_both_borrow_tips_tv);
                    case 3:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.borrow_cl_info_view);
                    case 4:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.credit_amount_tv);
                    default:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_open_agreement_tv);
                }
            }
        });
        final int i22 = 1;
        this.f28984Y = C2131j.b(new Function0(this) { // from class: tb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42406b;

            {
                this.f42406b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42406b;
                switch (i22) {
                    case 0:
                        int i23 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_open_agreement_tv);
                    case 1:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_both_borrow_tv);
                    case 2:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_both_borrow_tips_tv);
                    case 3:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.borrow_cl_info_view);
                    case 4:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.credit_amount_tv);
                    default:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_open_agreement_tv);
                }
            }
        });
        final int i23 = 2;
        this.f28985Z = C2131j.b(new Function0(this) { // from class: tb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42406b;

            {
                this.f42406b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42406b;
                switch (i23) {
                    case 0:
                        int i24 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_open_agreement_tv);
                    case 1:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_both_borrow_tv);
                    case 2:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_both_borrow_tips_tv);
                    case 3:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.borrow_cl_info_view);
                    case 4:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.credit_amount_tv);
                    default:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_open_agreement_tv);
                }
            }
        });
        final int i24 = 3;
        this.f28990k0 = C2131j.b(new Function0(this) { // from class: tb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42406b;

            {
                this.f42406b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42406b;
                switch (i24) {
                    case 0:
                        int i25 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_open_agreement_tv);
                    case 1:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_both_borrow_tv);
                    case 2:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_both_borrow_tips_tv);
                    case 3:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.borrow_cl_info_view);
                    case 4:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.credit_amount_tv);
                    default:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_open_agreement_tv);
                }
            }
        });
        final int i25 = 4;
        this.f28993p0 = C2131j.b(new Function0(this) { // from class: tb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42406b;

            {
                this.f42406b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42406b;
                switch (i25) {
                    case 0:
                        int i26 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_open_agreement_tv);
                    case 1:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_both_borrow_tv);
                    case 2:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_both_borrow_tips_tv);
                    case 3:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.borrow_cl_info_view);
                    case 4:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.credit_amount_tv);
                    default:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_open_agreement_tv);
                }
            }
        });
        final int i26 = 5;
        this.f28994q0 = C2131j.b(new Function0(this) { // from class: tb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42406b;

            {
                this.f42406b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42406b;
                switch (i26) {
                    case 0:
                        int i27 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_open_agreement_tv);
                    case 1:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_both_borrow_tv);
                    case 2:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_both_borrow_tips_tv);
                    case 3:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.borrow_cl_info_view);
                    case 4:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.credit_amount_tv);
                    default:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_open_agreement_tv);
                }
            }
        });
        final int i27 = 0;
        this.f28995r0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i27) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i28 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i28 = 1;
        this.f28996s0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i28) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i29 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i29 = 3;
        this.f28997t0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i29) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i30 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i30 = 4;
        this.f28998u0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i30) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i31 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i31 = 5;
        this.f29000v0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i31) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i32 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i311 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i32 = 6;
        this.f29002w0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i32) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i33 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i311 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i312 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i33 = 7;
        this.f29003x0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i33) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i34 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i311 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i312 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i313 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i34 = 8;
        this.f29004y0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i34) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i35 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i311 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i312 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i313 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i314 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i35 = 9;
        this.f29005z0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i35) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i36 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i311 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i312 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i313 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i314 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i315 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i36 = 11;
        this.f28957A0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i36) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i37 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i311 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i312 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i313 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i314 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i315 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i316 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i37 = 12;
        this.f28959B0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i37) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i38 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i311 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i312 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i313 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i314 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i315 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i316 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i317 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i38 = 13;
        this.f28961C0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i38) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i39 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i311 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i312 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i313 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i314 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i315 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i316 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i317 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i318 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i39 = 15;
        this.f28962D0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i39) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i311 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i312 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i313 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i314 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i316 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i317 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i318 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i319 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i40 = 16;
        this.f28963E0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i40) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i311 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i312 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i313 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i314 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i316 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i317 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i318 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i319 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i41 = 17;
        this.f28964F0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i41) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i311 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i312 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i313 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i314 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i316 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i317 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i318 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i319 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i42 = 18;
        this.f28965G0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i42) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i311 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i312 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i313 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i314 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i316 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i317 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i318 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i319 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i43 = 19;
        this.f28970K0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i43) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i311 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i312 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i313 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i314 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i316 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i317 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i318 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i319 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
        final int i44 = 20;
        this.f28982U0 = C2131j.b(new Function0(this) { // from class: tb.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultActivity f42401b;

            {
                this.f42401b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLOpenResultActivity cLOpenResultActivity = this.f42401b;
                switch (i44) {
                    case 0:
                        int i110 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_both_borrow_tv);
                    case 1:
                        int i111 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.cl_double_borrow_tips_tv);
                    case 2:
                        int i112 = CLOpenResultActivity.f28955V0;
                        return cLOpenResultActivity.findViewById(Ya.e.viewRoot);
                    case 3:
                        int i113 = CLOpenResultActivity.f28955V0;
                        return (BorrowCLInfoView) cLOpenResultActivity.findViewById(Ya.e.double_borrow_cl_info_view);
                    case 4:
                        int i114 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.double_credit_amount_tv);
                    case 5:
                        int i115 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_title_tv);
                    case 6:
                        int i116 = CLOpenResultActivity.f28955V0;
                        return (LinearLayout) cLOpenResultActivity.findViewById(Ya.e.double_repay_bill_ll);
                    case 7:
                        int i117 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.text2);
                    case 8:
                        int i118 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_double_open_success_stub);
                    case 9:
                        int i119 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_installment_success_stub);
                    case 10:
                        int i210 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 3);
                    case 11:
                        int i211 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_success_stub);
                    case 12:
                        int i212 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_pending_stub);
                    case 13:
                        int i213 = CLOpenResultActivity.f28955V0;
                        return (ViewStub) cLOpenResultActivity.findViewById(Ya.e.open_failed_stub);
                    case 14:
                        int i214 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvLearnMoreOpenResult);
                    case 15:
                        int i215 = CLOpenResultActivity.f28955V0;
                        return (PpTitleBar) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_mtb);
                    case 16:
                        int i216 = CLOpenResultActivity.f28955V0;
                        return (ConstraintLayout) cLOpenResultActivity.findViewById(Ya.e.cl_container_common);
                    case 17:
                        int i217 = CLOpenResultActivity.f28955V0;
                        return (FrameLayout) cLOpenResultActivity.findViewById(Ya.e.fl_container_installment);
                    case 18:
                        int i218 = CLOpenResultActivity.f28955V0;
                        return (OpenResultTaskView) cLOpenResultActivity.findViewById(Ya.e.apply_result_task_view);
                    case 19:
                        int i219 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 2);
                    case 20:
                        int i310 = CLOpenResultActivity.f28955V0;
                        return new B(cLOpenResultActivity, 1);
                    case 21:
                        int i311 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvContent);
                    case 22:
                        int i312 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvTips);
                    case 23:
                        int i313 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvDailyInterestLowRate);
                    case 24:
                        int i314 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tvPeriodResult);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.period_days_tv);
                    case 26:
                        int i316 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.available_amount_tv);
                    case 27:
                        int i317 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_borrowingTerm);
                    case 28:
                        int i318 = CLOpenResultActivity.f28955V0;
                        return (TextView) cLOpenResultActivity.findViewById(Ya.e.tv_loanAbleAmount);
                    default:
                        int i319 = CLOpenResultActivity.f28955V0;
                        return (SingleAdView) cLOpenResultActivity.findViewById(Ya.e.cl_open_result_sav);
                }
            }
        });
    }

    public static void z(CLOpenResultActivity cLOpenResultActivity, int i7) {
        Long dailyAmount;
        Double cashMinInterestRate;
        CardRiskLevelResp flexiCashRiskLevel;
        TextView textView;
        CardRiskLevelResp flexiCashRiskLevel2;
        Long creditLimit;
        Long creditLimit2;
        CLOpenAccountData cLOpenAccountData;
        Integer applyStatus;
        int i10 = 0;
        int iIntValue = ((i7 & 1) == 0 || (cLOpenAccountData = cLOpenResultActivity.f28967H0) == null || (applyStatus = cLOpenAccountData.getApplyStatus()) == null) ? 0 : applyStatus.intValue();
        d.h(cLOpenResultActivity.TAG, 3, G.m(iIntValue, "updateView >>>applyStatus="));
        Handler handler = cLOpenResultActivity.f28969J0;
        t tVar = cLOpenResultActivity.f29004y0;
        t tVar2 = cLOpenResultActivity.f28957A0;
        t tVar3 = cLOpenResultActivity.f28961C0;
        String strF = null;
        if (iIntValue != -1) {
            if (iIntValue == 0) {
                cLOpenResultActivity.x();
                return;
            }
            if (iIntValue == 1) {
                cLOpenResultActivity.f28979Q0++;
                handler.removeCallbacks(cLOpenResultActivity.s());
                G.u(MessageEvent.EVENT_CL_OPEN_SUCCESS, c.b());
                String str = cLOpenResultActivity.TAG;
                p186mb.a aVar = b.f39631b;
                d.h(str, 3, G.m(aVar.getInstance().f39633a, "FinanceManager.instance.openType = "));
                String str2 = cLOpenResultActivity.TAG;
                CLOpenAccountData cLOpenAccountData2 = cLOpenResultActivity.f28967H0;
                d.h(str2, 5, "installmentLoanInfo = " + (cLOpenAccountData2 != null ? cLOpenAccountData2.getInstallmentLoanInfo() : null));
                CLOpenAccountData cLOpenAccountData3 = cLOpenResultActivity.f28967H0;
                if (cLOpenAccountData3 != null ? Intrinsics.c(cLOpenAccountData3.getMigrateFlag(), Boolean.TRUE) : false) {
                    CLOpenAccountData cLOpenAccountData4 = cLOpenResultActivity.f28967H0;
                    if ((cLOpenAccountData4 != null ? cLOpenAccountData4.getMigrateUrl() : null) != null) {
                        CLOpenAccountData cLOpenAccountData5 = cLOpenResultActivity.f28967H0;
                        ActivityUtils.startActivity(IntentUtils.getOpenUrlIntent(cLOpenAccountData5 != null ? cLOpenAccountData5.getMigrateUrl() : null, true));
                        cLOpenResultActivity.goBackToHome();
                        return;
                    }
                }
                CLOpenAccountData cLOpenAccountData6 = cLOpenResultActivity.f28967H0;
                if ((cLOpenAccountData6 != null ? cLOpenAccountData6.getInstallmentLoanInfo() : null) != null) {
                    String str3 = cLOpenResultActivity.TAG;
                    CLOpenAccountData cLOpenAccountData7 = cLOpenResultActivity.f28967H0;
                    d.h(str3, 3, "showInstallmentApplyResult, applyStatus=" + (cLOpenAccountData7 != null ? cLOpenAccountData7.getApplyStatus() : null));
                    cLOpenResultActivity.o(false);
                    Z supportFragmentManager = cLOpenResultActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    C1161a c1161a = new C1161a(supportFragmentManager);
                    int i11 = Ya.e.fl_container_installment;
                    CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragmentNewInstance = CLInstallmentUpGradeSuccFragment.f30601q0.newInstance();
                    CLOpenAccountData cLOpenAccountData8 = cLOpenResultActivity.f28967H0;
                    cLInstallmentUpGradeSuccFragmentNewInstance.f30613k0 = cLOpenAccountData8 != null ? cLOpenAccountData8.getInstallmentLoanInfo() : null;
                    c1161a.e(i11, cLInstallmentUpGradeSuccFragmentNewInstance, null);
                    c1161a.h(true);
                    return;
                }
                CLOpenAccountData cLOpenAccountData9 = cLOpenResultActivity.f28967H0;
                if (TextUtils.equals(cLOpenAccountData9 != null ? cLOpenAccountData9.getLoanProduct() : null, "PALMPAY_CARD") && cLOpenResultActivity.f28979Q0 == 1) {
                    j jVar = o.f38542z;
                    jVar.getInstance().getClass();
                    o.d();
                    ActivityUtils.startActivity(F.a(cLOpenResultActivity, com.transsnet.palmpay.core.config.d.g(jVar.getInstance().f38560r)));
                    return;
                }
                long jLongValue = 0;
                if (aVar.getInstance().f39633a == 3) {
                    CLOpenAccountData cLOpenAccountData10 = cLOpenResultActivity.f28967H0;
                    if (cLOpenAccountData10 != null && (creditLimit2 = cLOpenAccountData10.getCreditLimit()) != null) {
                        jLongValue = creditLimit2.longValue();
                    }
                    cLOpenResultActivity.o(true);
                    ViewStub viewStub = (ViewStub) tVar3.getValue();
                    if (viewStub != null) {
                        viewStub.setVisibility(8);
                    }
                    cLOpenResultActivity.t();
                    ViewStub viewStub2 = (ViewStub) tVar2.getValue();
                    if (viewStub2 != null) {
                        viewStub2.setVisibility(8);
                    }
                    ViewStub viewStub3 = (ViewStub) tVar.getValue();
                    if (viewStub3 != null) {
                        viewStub3.setVisibility(0);
                    }
                    LinearLayout linearLayout = (LinearLayout) cLOpenResultActivity.f29002w0.getValue();
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    t tVar4 = cLOpenResultActivity.f28998u0;
                    TextView textView2 = (TextView) tVar4.getValue();
                    if (textView2 != null) {
                        textView2.setText(r0.F(jLongValue));
                    }
                    r0.R1((TextView) tVar4.getValue(), "fonts/PalmPayNum-Bold.ttf");
                    D d2 = new D(cLOpenResultActivity, 2);
                    t tVar5 = cLOpenResultActivity.f28995r0;
                    Object value = tVar5.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    h.q(d2, (TextView) value, cLOpenResultActivity.q());
                    cLOpenResultActivity.getOnBackPressedDispatcher().a(cLOpenResultActivity, new K(cLOpenResultActivity, i10));
                    cLOpenResultActivity.q().setPaintFlags(8);
                    cLOpenResultActivity.q().getPaint().setAntiAlias(true);
                    CLRepaymentPlanData cLRepaymentPlanData = cLOpenResultActivity.f28974M0;
                    if (cLRepaymentPlanData != null) {
                        t tVar6 = cLOpenResultActivity.f28997t0;
                        Object value2 = tVar6.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        BorrowCLInfoView borrowCLInfoView = (BorrowCLInfoView) value2;
                        if (borrowCLInfoView != null) {
                            borrowCLInfoView.d(cLRepaymentPlanData);
                        }
                        Object value3 = tVar6.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        h.s((BorrowCLInfoView) value3, true);
                    }
                    Object value4 = tVar5.getValue();
                    Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                    ((TextView) value4).setText(cLOpenResultActivity.getString(cLOpenResultActivity.f28974M0 != null ? f.cs_cl_borrow_take_out_all : k.core_borrow_now));
                    Object value5 = cLOpenResultActivity.f28996s0.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                    ((TextView) value5).setVisibility(cLOpenResultActivity.f28974M0 != null ? 0 : 4);
                    cLOpenResultActivity.q().setVisibility(cLOpenResultActivity.f28974M0 == null ? 4 : 0);
                    cLOpenResultActivity.p();
                    return;
                }
                n0.g().u((ViewEvent) G.g("Credit_result_Success", true));
                CLOpenAccountData cLOpenAccountData11 = cLOpenResultActivity.f28967H0;
                if (cLOpenAccountData11 != null && (creditLimit = cLOpenAccountData11.getCreditLimit()) != null) {
                    jLongValue = creditLimit.longValue();
                }
                cLOpenResultActivity.o(true);
                ViewStub viewStub4 = (ViewStub) tVar3.getValue();
                if (viewStub4 != null) {
                    viewStub4.setVisibility(8);
                }
                cLOpenResultActivity.t();
                ViewStub viewStub5 = (ViewStub) tVar.getValue();
                if (viewStub5 != null) {
                    viewStub5.setVisibility(8);
                }
                boolean zEquals = TextUtils.equals("CASH_INSTALLMENT_RAISE_AMOUNT", cLOpenResultActivity.f28976O0);
                t tVar7 = cLOpenResultActivity.f28983X;
                if (zEquals) {
                    ViewStub viewStub6 = (ViewStub) cLOpenResultActivity.f29005z0.getValue();
                    if (viewStub6 != null) {
                        viewStub6.setVisibility(0);
                    }
                    TextView textView3 = (TextView) cLOpenResultActivity.t.getValue();
                    if (textView3 != null) {
                        h.l(new D(cLOpenResultActivity, 1), textView3);
                    }
                    TextView textView4 = (TextView) cLOpenResultActivity.f28973M.getValue();
                    if (textView4 != null) {
                        AbstractC0511h.f7089a.richText(textView4, cLOpenResultActivity.getString(g.cs_enjoy_installment_stress_free), "STRESS-FREE", new C0500c(cLOpenResultActivity, 17));
                    }
                    TextView textView5 = (TextView) cLOpenResultActivity.f28960C.getValue();
                    if (textView5 != null) {
                        textView5.setText(r0.F(jLongValue));
                    }
                    SpannableStringBuilder spannableStringBuilderCreate = G.i("The loanable amount is ").setForegroundColor(cLOpenResultActivity.getResources().getColor(Ya.b.cs_cl_indicator_selected)).append(String.valueOf(r0.F(jLongValue))).setForegroundColor(cLOpenResultActivity.getResources().getColor(Ya.b.cs_oc_negative_txt_color)).setFontFamily("sans-serif-black").create();
                    SpanUtils foregroundColor = G.i("Borrowing term of ").setForegroundColor(cLOpenResultActivity.getResources().getColor(Ya.b.cs_cl_indicator_selected));
                    CLOpenAccountData cLOpenAccountData12 = cLOpenResultActivity.f28967H0;
                    SpanUtils fontFamily = foregroundColor.append((cLOpenAccountData12 != null ? cLOpenAccountData12.getMaxLoanDay() : null) + " days, ").setForegroundColor(cLOpenResultActivity.getResources().getColor(Ya.b.cs_oc_negative_txt_color)).setFontFamily("sans-serif-black");
                    CLOpenAccountData cLOpenAccountData13 = cLOpenResultActivity.f28967H0;
                    SpannableStringBuilder spannableStringBuilderCreate2 = fontFamily.append("repayment in " + ((cLOpenAccountData13 == null || (flexiCashRiskLevel2 = cLOpenAccountData13.getFlexiCashRiskLevel()) == null) ? null : flexiCashRiskLevel2.getTerm()) + " installments").setForegroundColor(cLOpenResultActivity.getResources().getColor(Ya.b.cs_cl_indicator_selected)).create();
                    Object value6 = cLOpenResultActivity.f28966H.getValue();
                    Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                    ((TextView) value6).setText(spannableStringBuilderCreate2);
                    Object value7 = cLOpenResultActivity.f28971L.getValue();
                    Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                    ((TextView) value7).setText(spannableStringBuilderCreate);
                    TextView textView6 = (TextView) cLOpenResultActivity.f28958B.getValue();
                    if (textView6 != null) {
                        CLOpenAccountData cLOpenAccountData14 = cLOpenResultActivity.f28967H0;
                        textView6.setText(String.valueOf(cLOpenAccountData14 != null ? cLOpenAccountData14.getMaxLoanDay() : null));
                    }
                    CLOpenAccountData cLOpenAccountData15 = cLOpenResultActivity.f28967H0;
                    if (cLOpenAccountData15 != null && (flexiCashRiskLevel = cLOpenAccountData15.getFlexiCashRiskLevel()) != null && (textView = (TextView) cLOpenResultActivity.f28956A.getValue()) != null) {
                        textView.setText(flexiCashRiskLevel.getTerm() + " terms, " + flexiCashRiskLevel.getTermSpan() + (Intrinsics.c(flexiCashRiskLevel.getTermSpanUnit(), "D") ? " days/term" : "month/tern"));
                    }
                    Object value8 = cLOpenResultActivity.f29001w.getValue();
                    Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                    TextView textView7 = (TextView) value8;
                    int i12 = g.cs_cl_daily_interest_rate;
                    DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                    CLOpenAccountData cLOpenAccountData16 = cLOpenResultActivity.f28967H0;
                    textView7.setText(cLOpenResultActivity.getString(i12, decimalFormat.format((cLOpenAccountData16 == null || (cashMinInterestRate = cLOpenAccountData16.getCashMinInterestRate()) == null) ? 0.003d : cashMinInterestRate.doubleValue())));
                    Object value9 = cLOpenResultActivity.f28999v.getValue();
                    Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                    TextView textView8 = (TextView) value9;
                    int i13 = g.cs_cl_daily_interest_amount;
                    CLOpenAccountData cLOpenAccountData17 = cLOpenResultActivity.f28967H0;
                    if (cLOpenAccountData17 != null && (dailyAmount = cLOpenAccountData17.getDailyAmount()) != null) {
                        strF = r0.F(dailyAmount.longValue());
                    }
                    textView8.setText(cLOpenResultActivity.getString(i13, strF));
                } else {
                    ViewStub viewStub7 = (ViewStub) tVar2.getValue();
                    if (viewStub7 != null) {
                        viewStub7.setVisibility(0);
                    }
                    t tVar8 = cLOpenResultActivity.f28993p0;
                    TextView textView9 = (TextView) tVar8.getValue();
                    if (textView9 != null) {
                        textView9.setText(r0.F(jLongValue));
                    }
                    r0.R1((TextView) tVar8.getValue(), "fonts/PalmPayNum-Bold.ttf");
                    TextView textView10 = (TextView) cLOpenResultActivity.f29000v0.getValue();
                    if (textView10 != null) {
                        textView10.setText(cLOpenResultActivity.getString(g.cs_you_have_flexi_cash_loan_amount_of));
                    }
                    CLRepaymentPlanData cLRepaymentPlanData2 = cLOpenResultActivity.f28974M0;
                    if (cLRepaymentPlanData2 != null) {
                        t tVar9 = cLOpenResultActivity.f28990k0;
                        BorrowCLInfoView borrowCLInfoView2 = (BorrowCLInfoView) tVar9.getValue();
                        if (borrowCLInfoView2 != null) {
                            borrowCLInfoView2.d(cLRepaymentPlanData2);
                        }
                        BorrowCLInfoView borrowCLInfoView3 = (BorrowCLInfoView) tVar9.getValue();
                        if (borrowCLInfoView3 != null) {
                            h.s(borrowCLInfoView3, true);
                        }
                    }
                    Object value10 = cLOpenResultActivity.f28985Z.getValue();
                    Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                    ((TextView) value10).setVisibility(cLOpenResultActivity.f28974M0 != null ? 0 : 4);
                    Object value11 = tVar7.getValue();
                    Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                    ((TextView) value11).setVisibility(cLOpenResultActivity.f28974M0 != null ? 0 : 4);
                }
                Object value12 = cLOpenResultActivity.f28978Q.getValue();
                Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                org.chromium.support_lib_boundary.util.b.d((SingleAdView) value12, Boolean.TRUE);
                D d10 = new D(cLOpenResultActivity, 3);
                t tVar10 = cLOpenResultActivity.f28984Y;
                TextView textView11 = (TextView) tVar10.getValue();
                Object value13 = tVar7.getValue();
                Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                h.q(d10, textView11, (TextView) value13);
                cLOpenResultActivity.getOnBackPressedDispatcher().a(cLOpenResultActivity, new I(cLOpenResultActivity, 0));
                TextView textView12 = (TextView) tVar10.getValue();
                if (textView12 != null) {
                    textView12.setText(cLOpenResultActivity.f28974M0 != null ? cLOpenResultActivity.getString(f.cs_cl_borrow_take_out_all) : cLOpenResultActivity.getString(k.core_borrow_now));
                }
                cLOpenResultActivity.p();
                return;
            }
            if (iIntValue != 2) {
                return;
            }
        }
        handler.removeCallbacks(cLOpenResultActivity.s());
        CLOpenAccountData cLOpenAccountData18 = cLOpenResultActivity.f28967H0;
        if (TextUtils.equals(cLOpenAccountData18 != null ? cLOpenAccountData18.getLoanProduct() : null, "PALMPAY_CARD")) {
            j jVar2 = o.f38542z;
            jVar2.getInstance().getClass();
            o.d();
            ActivityUtils.startActivity(F.a(cLOpenResultActivity, com.transsnet.palmpay.core.config.d.g(jVar2.getInstance().f38559q)));
            return;
        }
        c.b().f(new MessageEvent(MessageEvent.EVENT_CL_OPEN_FAILED));
        cLOpenResultActivity.o(true);
        ViewStub viewStub8 = (ViewStub) tVar3.getValue();
        if (viewStub8 != null) {
            viewStub8.setVisibility(0);
        }
        cLOpenResultActivity.t();
        ViewStub viewStub9 = (ViewStub) tVar2.getValue();
        if (viewStub9 != null) {
            viewStub9.setVisibility(8);
        }
        ViewStub viewStub10 = (ViewStub) tVar.getValue();
        if (viewStub10 != null) {
            viewStub10.setVisibility(8);
        }
        TextView textView13 = (TextView) cLOpenResultActivity.f29003x0.getValue();
        if (textView13 != null) {
            CLOpenAccountData cLOpenAccountData19 = cLOpenResultActivity.f28967H0;
            textView13.setText(cLOpenAccountData19 != null ? cLOpenAccountData19.getErrorContent() : null);
        }
        t tVar11 = cLOpenResultActivity.f28965G0;
        OpenResultTaskView openResultTaskView = (OpenResultTaskView) tVar11.getValue();
        if (openResultTaskView != null) {
            openResultTaskView.getTaskData();
        }
        OpenResultTaskView openResultTaskView2 = (OpenResultTaskView) tVar11.getValue();
        if (openResultTaskView2 != null) {
            openResultTaskView2.setMTaskAllDoneInterface(new L(cLOpenResultActivity));
        }
        n0.g().u((ViewEvent) G.g("Credit_result_Fail", true));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_cl_open_result_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        getWindow().addFlags(67108864);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public final void n() {
        Integer accountType;
        d.h(this.TAG, 3, "borrow >>>");
        n0.g().m("CLOpenResultActivity_element_click", "CashResultBorrowNow", "");
        e eVar = this.f28977P0;
        if (eVar != null) {
            p001if.a.a(eVar);
        }
        CLOpenAccountData cLOpenAccountData = this.f28967H0;
        int iIntValue = (cLOpenAccountData == null || (accountType = cLOpenAccountData.getAccountType()) == null) ? 7 : accountType.intValue();
        String str = (iIntValue == 7 || iIntValue == 9) ? "LoanBorrowFlexiLoan" : "LoanBorrowHome";
        Bundle bundle = new Bundle();
        bundle.putInt("accountType", iIntValue);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String str2 = Eb.a.f2267a;
        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str2);
        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str2);
        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, str);
    }

    public final void o(boolean z3) {
        Object value = this.f28964F0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        FrameLayout frameLayout = (FrameLayout) value;
        if (frameLayout != null) {
            frameLayout.setVisibility(z3 ? 8 : 0);
        }
        Object value2 = this.f28963E0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) value2;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(z3 ? 0 : 8);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        Integer applyStatus;
        CLOpenAccountData cLOpenAccountData = this.f28967H0;
        if (cLOpenAccountData == null || (applyStatus = cLOpenAccountData.getApplyStatus()) == null || applyStatus.intValue() != 0 || !TextUtils.equals(this.f28976O0, "PALMPAY_CARD")) {
            com.palmpay.lib.apm.launchcounter.util.d.H("/main/home", "tab", "finance");
            return;
        }
        j jVar = o.f38542z;
        if (TextUtils.isEmpty(jVar.getInstance().f38561s)) {
            jVar.getInstance().getClass();
            o.d();
            i0.c0(com.transsnet.palmpay.core.config.d.g(jVar.getInstance().f38559q));
        } else {
            jVar.getInstance().getClass();
            o.d();
            i0.c0(com.transsnet.palmpay.core.config.d.g(jVar.getInstance().f38561s));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
        e eVar = this.f28977P0;
        if (eVar != null) {
            p001if.a.a(eVar);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            this.f28969J0.removeCallbacks(s());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if ((pushMessage != null ? pushMessage.content : null) == null) {
            return;
        }
        d.c(G.o("CLOpenResultActivity onReceivePushMessage ", pushMessage.content.messageType), new Object[0]);
        boolean zEqualsIgnoreCase = PushMessage.MESSAGE_TYPE_CL_APPLY_SUCCESS.equalsIgnoreCase(pushMessage.content.messageType);
        Handler handler = this.f28969J0;
        if (zEqualsIgnoreCase) {
            handler.removeCallbacks(s());
            r();
        }
        if (PushMessage.MESSAGE_TYPE_OC_FAIL_TASK_DONE.equals(pushMessage.content.messageType)) {
            x();
            handler.postDelayed(new B(this, 0), 3000L);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        showLoadingDialog(false);
        this.f28969J0.postDelayed(s(), 5000L);
    }

    public final void p() {
        d.h(this.TAG, 3, "countDownForBorrow");
        e eVar = this.f28977P0;
        if (eVar != null) {
            p001if.a.a(eVar);
        }
        y yVarG = df.d.g(0L, 1L, TimeUnit.SECONDS, p071ef.b.a());
        p287se.d dVar = new p287se.d(new kotlin.text.D(27), 6);
        e eVar2 = new e(new p287se.d(new C1798f(this, 20), 7), new p287se.d(new kotlin.text.D(28), 8), new p287se.d(this, 9));
        try {
            try {
                yVarG.subscribe(new io.reactivex.internal.operators.observable.L(new C1762n(eVar2, dVar, 1)));
                this.f28977P0 = eVar2;
            } catch (NullPointerException e10) {
                throw e10;
            } catch (Throwable th) {
                D3.a.H(th);
                org.chromium.support_lib_boundary.util.b.V(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            D3.a.H(th2);
            org.chromium.support_lib_boundary.util.b.V(th2);
            NullPointerException nullPointerException2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException2.initCause(th2);
            throw nullPointerException2;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    public final TextView q() {
        Object value = this.f28994q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void r() {
        String applyId;
        IApiCreditService iApiCreditServiceH = G.h(p221ob.c.f40268a);
        CLOpenAccountData cLOpenAccountData = this.f28967H0;
        if (cLOpenAccountData == null || (applyId = cLOpenAccountData.getApplyId()) == null) {
            applyId = "";
        }
        iApiCreditServiceH.queryCashLoanStatus(new CLQueryApplyAuditResultReq(applyId)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new p294tb.F(this));
    }

    public final Runnable s() {
        return (Runnable) this.f28970K0.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Integer applyStatus;
        super.setupView();
        BarUtils.setStatusBarLightMode((Activity) this, true);
        c.b().j(this);
        String stringExtra = getIntent().getStringExtra("cl_loan_product_type");
        if (stringExtra == null) {
            stringExtra = "CASH_LOAN";
        }
        this.f28976O0 = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("cl_open_result");
        d.c("CLOpenResultActivity", G.p("mProductType = ", this.f28976O0, ", dataStr = ", stringExtra2));
        if (!TextUtils.isEmpty(stringExtra2)) {
            this.f28967H0 = (CLOpenAccountData) d0.l(CLOpenAccountData.class, stringExtra2);
        }
        CLOpenAccountData cLOpenAccountData = this.f28967H0;
        if (((cLOpenAccountData == null || (applyStatus = cLOpenAccountData.getApplyStatus()) == null) ? 0 : applyStatus.intValue()) == 0) {
            G.u(MessageEvent.EVENT_CL_OPEN_PENDING, c.b());
        }
        z(this, 2);
        PpTitleBar ppTitleBar = (PpTitleBar) this.f28962D0.getValue();
        if (ppTitleBar != null) {
            ppTitleBar.setBackButtonClickListener(new D(this, 0));
        }
        l lVar = ((OpenResultViewModel) l()).f30691e;
        if (lVar != null) {
            lVar.e(this, new C2023v(new p294tb.G(this, this, 0), 2));
        }
        l lVar2 = ((OpenResultViewModel) l()).f30692f;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new p294tb.G(this, this, 1), 2));
        }
        l lVar3 = ((OpenResultViewModel) l()).f30693g;
        if (lVar3 != null) {
            lVar3.e(this, new C2023v(new p294tb.G(this, this, 2), 2));
        }
        l lVar4 = ((OpenResultViewModel) l()).f30694i;
        if (lVar4 != null) {
            lVar4.e(this, new C2023v(new p294tb.G(this, this, 3), 2));
        }
    }

    public final void t() {
        q qVar = this.f28986f;
        if (qVar != null) {
            ((LinearLayout) qVar.f818e).setVisibility(8);
        }
        Object value = this.f28992p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((View) value).setBackgroundResource(L6.b.ppColorBackgroundDark);
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundDark, this));
    }

    public final void u() {
        Integer productSubId;
        CLBorrowCouponData coupon;
        Bundle bundle = new Bundle();
        CLRepaymentPlanData cLRepaymentPlanData = this.f28974M0;
        bundle.putString("loanAmount", String.valueOf(cLRepaymentPlanData != null ? cLRepaymentPlanData.getLoanAmount() : null));
        CLRepaymentPlanData cLRepaymentPlanData2 = this.f28974M0;
        bundle.putString("repaymentDate", String.valueOf(cLRepaymentPlanData2 != null ? cLRepaymentPlanData2.getRepaymentDate() : null));
        CLRepaymentPlanData cLRepaymentPlanData3 = this.f28974M0;
        bundle.putString("couponId", String.valueOf((cLRepaymentPlanData3 == null || (coupon = cLRepaymentPlanData3.getCoupon()) == null) ? null : coupon.getCouponId()));
        CLRepaymentPlanData cLRepaymentPlanData4 = this.f28974M0;
        bundle.putString("productSubId", String.valueOf(cLRepaymentPlanData4 != null ? cLRepaymentPlanData4.getProductSubId() : null));
        CLRepaymentPlanData cLRepaymentPlanData5 = this.f28974M0;
        if (cLRepaymentPlanData5 == null || (productSubId = cLRepaymentPlanData5.getProductSubId()) == null || productSubId.intValue() != 3) {
            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "NormalLoanAgreement");
        } else {
            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "PalLoanAgreement");
        }
    }

    public final void v(boolean z3) {
        ((AccountApiService) p324va.c.f43141a.f14623d).doubleOpenStaySendCoupon(new DoubleOpenStaySendCouponReq("CASH_INSTANT_LOAN", Boolean.valueOf(z3))).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 2));
    }

    public final void w() {
        if (this.f28988i.size() <= 1) {
            return;
        }
        Handler handler = this.f28989j;
        t tVar = this.f28991o;
        handler.removeCallbacks((Runnable) tVar.getValue());
        handler.postDelayed((Runnable) tVar.getValue(), 5000L);
    }

    public final void x() {
        ViewStub viewStub;
        View viewInflate;
        View viewM;
        View viewM2;
        o(true);
        ViewStub viewStub2 = (ViewStub) this.f28961C0.getValue();
        if (viewStub2 != null) {
            viewStub2.setVisibility(8);
        }
        if (this.f28986f == null && (viewStub = (ViewStub) this.f28959B0.getValue()) != null && (viewInflate = viewStub.inflate()) != null) {
            int i7 = Ya.e.apply_pending_ll;
            if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                i7 = Ya.e.countdown_tips_tv;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = Ya.e.countdown_tv;
                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView2 != null) {
                        i7 = Ya.e.pending_first_end_iv;
                        if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = Ya.e.pending_first_start_iv;
                            ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                            if (imageView != null) {
                                i7 = Ya.e.pending_first_tips_tv;
                                TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView3 != null && (viewM = p059e1.a.m((i7 = Ya.e.pending_risk_dot_first), viewInflate)) != null && (viewM2 = p059e1.a.m((i7 = Ya.e.pending_risk_dot_second), viewInflate)) != null) {
                                    i7 = Ya.e.pending_risk_indicator_ll;
                                    if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                        i7 = Ya.e.pending_risk_vp;
                                        ViewPager2 viewPager2 = (ViewPager2) p059e1.a.m(i7, viewInflate);
                                        if (viewPager2 != null) {
                                            i7 = Ya.e.progressBar;
                                            CircleProgressView circleProgressView = (CircleProgressView) p059e1.a.m(i7, viewInflate);
                                            if (circleProgressView != null) {
                                                this.f28986f = new q(linearLayout, textView, textView2, imageView, textView3, viewM, viewM2, viewPager2, circleProgressView);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
        }
        q qVar = this.f28986f;
        if (qVar != null) {
            ((LinearLayout) qVar.f818e).setVisibility(0);
        }
        Object value = this.f28992p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((View) value).setBackgroundResource(L6.b.ppColorBackgroundLight);
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
        ViewStub viewStub3 = (ViewStub) this.f28957A0.getValue();
        if (viewStub3 != null) {
            viewStub3.setVisibility(8);
        }
        ViewStub viewStub4 = (ViewStub) this.f29004y0.getValue();
        if (viewStub4 != null) {
            viewStub4.setVisibility(8);
        }
        this.f28969J0.postDelayed(s(), this.f28980R0);
        if (this.f28968I0) {
            this.f28968I0 = false;
            q qVar2 = this.f28986f;
            if (qVar2 != null) {
                ViewPager2 viewPager3 = (ViewPager2) qVar2.f820g;
                if (!this.f28987g) {
                    viewPager3.setAdapter(new w(this.f28988i));
                    viewPager3.setOffscreenPageLimit(1);
                    viewPager3.registerOnPageChangeCallback(new J(this));
                    y(viewPager3.getCurrentItem());
                    this.f28987g = true;
                }
                w();
            }
            this.T0.post((Runnable) this.f28982U0.getValue());
        }
    }

    public final void y(int i7) {
        boolean z3 = i7 % this.f28988i.size() == 0;
        q qVar = this.f28986f;
        if (qVar != null) {
            ((View) qVar.f821i).setBackgroundResource(z3 ? Ya.d.cs_cl_pending_dot_selected_bg : Ya.d.cs_cl_pending_dot_unselected_bg);
        }
        q qVar2 = this.f28986f;
        if (qVar2 != null) {
            ((View) qVar2.f819f).setBackgroundResource(z3 ? Ya.d.cs_cl_pending_dot_unselected_bg : Ya.d.cs_cl_pending_dot_selected_bg);
        }
    }
}
