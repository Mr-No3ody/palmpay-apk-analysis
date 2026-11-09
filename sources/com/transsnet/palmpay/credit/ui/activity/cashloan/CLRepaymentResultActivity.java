package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import F6.d;
import L6.i;
import Pa.n0;
import Pa.r0;
import Ya.e;
import Ya.f;
import Ya.g;
import Za.b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.horcrux.svg.d0;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.credit.bean.CLPromoteData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCashLoanBill;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCreditCard;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.ProductSubs;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentResultActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLIncreaseAmountDialogFragment;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SpanUtils;
import io.fastkv.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p025ba.k;
import p220oa.h;
import p221ob.c;
import p284sb.A;
import p285sc.x;
import p294tb.RunnableC2060w;
import p294tb.k0;
import p294tb.l0;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit还款结果页", path = "/credit_score/cl_repayment_result_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLRepaymentResultActivity;", "LZa/b;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRepaymentResultActivity extends b {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f29111q0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f29112A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f29113B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f29114C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f29115H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f29116L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f29117M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CLMainData f29118Q;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ProductSubs f29120Y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29125g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29126i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29127j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29129o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29130p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29132v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29133w;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f29119X = -1;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final Handler f29121Z = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final long f29128k0 = 3000;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final RunnableC2060w f29131p0 = new RunnableC2060w(this, 1);

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

    public CLRepaymentResultActivity() {
        final int i7 = 7;
        this.f29122d = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i7) {
                    case 0:
                        int i10 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i11 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i12 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i13 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i14 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i15 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i16 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i17 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i18 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i19 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i20 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i21 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i22 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i23 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
        final int i10 = 13;
        this.f29123e = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i10) {
                    case 0:
                        int i11 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i12 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i13 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i14 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i15 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i16 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i17 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i18 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i19 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i110 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i20 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i21 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i22 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i23 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
        final int i11 = 14;
        this.f29124f = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i11) {
                    case 0:
                        int i12 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i13 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i14 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i15 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i16 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i17 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i18 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i19 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i110 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i111 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i20 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i21 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i22 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i23 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
        final int i12 = 0;
        this.f29125g = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i12) {
                    case 0:
                        int i13 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i14 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i15 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i16 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i17 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i18 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i19 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i110 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i111 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i112 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i20 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i21 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i22 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i23 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
        final int i13 = 1;
        this.f29126i = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i13) {
                    case 0:
                        int i14 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i15 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i16 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i17 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i18 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i19 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i110 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i111 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i112 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i113 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i20 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i21 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i22 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i23 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
        final int i14 = 2;
        this.f29127j = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i14) {
                    case 0:
                        int i15 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i16 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i17 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i18 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i19 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i110 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i111 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i112 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i113 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i114 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i20 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i21 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i22 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i23 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
        final int i15 = 3;
        this.f29129o = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i15) {
                    case 0:
                        int i16 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i17 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i18 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i19 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i110 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i111 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i112 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i113 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i114 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i115 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i20 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i21 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i22 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i23 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
        final int i16 = 4;
        this.f29130p = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i16) {
                    case 0:
                        int i17 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i18 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i19 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i110 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i111 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i112 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i113 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i114 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i115 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i116 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i20 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i21 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i22 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i23 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
        final int i17 = 5;
        this.t = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i17) {
                    case 0:
                        int i18 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i19 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i110 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i111 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i112 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i113 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i114 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i115 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i116 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i117 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i20 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i21 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i22 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i23 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
        final int i18 = 6;
        this.f29132v = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i18) {
                    case 0:
                        int i19 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i110 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i111 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i112 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i113 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i114 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i115 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i116 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i117 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i118 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i20 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i21 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i22 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i23 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
        final int i19 = 8;
        this.f29133w = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i19) {
                    case 0:
                        int i110 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i111 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i112 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i113 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i114 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i115 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i116 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i117 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i118 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i119 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i20 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i21 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i22 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i23 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
        final int i20 = 9;
        this.f29112A = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i20) {
                    case 0:
                        int i110 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i111 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i112 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i113 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i114 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i115 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i116 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i117 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i118 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i119 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i21 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i22 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i23 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i25 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
        final int i21 = 10;
        this.f29113B = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i21) {
                    case 0:
                        int i110 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i111 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i112 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i113 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i114 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i115 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i116 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i117 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i118 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i119 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i22 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i23 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i25 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i26 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
        final int i22 = 11;
        this.f29114C = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i22) {
                    case 0:
                        int i110 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i111 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i112 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i113 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i114 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i115 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i116 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i117 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i118 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i119 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i23 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i25 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i26 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i27 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
        final int i23 = 12;
        this.f29115H = C2131j.b(new Function0(this) { // from class: tb.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentResultActivity f42481b;

            {
                this.f42481b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentResultActivity cLRepaymentResultActivity = this.f42481b;
                switch (i23) {
                    case 0:
                        int i110 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.top_left_interest_tv);
                    case 1:
                        int i111 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv);
                    case 2:
                        int i112 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.period_days_tv);
                    case 3:
                        int i113 = CLRepaymentResultActivity.f29111q0;
                        return (ConstraintLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll);
                    case 4:
                        int i114 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.agreement_ll);
                    case 5:
                        int i115 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.borrow_other_amount_tv);
                    case 6:
                        int i116 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.available_amount_tv2);
                    case 7:
                        int i117 = CLRepaymentResultActivity.f29111q0;
                        return (SingleAdView) cLRepaymentResultActivity.findViewById(e.cl_repayment_result_bottom_sav);
                    case 8:
                        int i118 = CLRepaymentResultActivity.f29111q0;
                        return (LinearLayout) cLRepaymentResultActivity.findViewById(e.top_acc_ll_one_borrow);
                    case 9:
                        int i119 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_content_tv);
                    case 10:
                        int i24 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.status_title_tv);
                    case 11:
                        int i25 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.repayment_status_img);
                    case 12:
                        int i26 = CLRepaymentResultActivity.f29111q0;
                        return (ImageView) cLRepaymentResultActivity.findViewById(e.backBtn);
                    case 13:
                        int i27 = CLRepaymentResultActivity.f29111q0;
                        return (Button) cLRepaymentResultActivity.findViewById(e.repay_complete_bt);
                    default:
                        int i28 = CLRepaymentResultActivity.f29111q0;
                        return (TextView) cLRepaymentResultActivity.findViewById(e.cl_borrow_tv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_repayment_result_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final LinearLayout m() {
        Object value = this.f29130p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final void n() {
        G.h(c.f40268a).getOcRepayResult(this.f29117M, null).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new l0(this));
    }

    public final Button o() {
        Object value = this.f29123e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        org.greenrobot.eventbus.c.b().l(this);
        this.f29121Z.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if ((pushMessage != null ? pushMessage.content : null) == null) {
            return;
        }
        d.c("wanggang：" + pushMessage.content, new Object[0]);
        if (!PushMessage.MESSAGE_TYPE_CASH_INCREASE.equals(pushMessage.content.messageType) && !TextUtils.equals(PushMessage.MESSAGE_TYPE_CASH_NO_INCREASE, pushMessage.content.messageType)) {
            if (PushMessage.MESSAGE_TYPE_CASH_FROZEN.equals(pushMessage.content.messageType)) {
                n.O(this, 2, Integer.valueOf(g.cs_cl_flexi_cash_account_frozen), null, Integer.valueOf(Ya.d.cs_icon_lock), null, null, null, null, getString(g.cs_how_to_unfreeze), new A(13), null, null, null, null, false, i.ppFlexiCashDialogTheme, 8124916);
                return;
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(pushMessage.content.businessInfo);
            int i7 = jSONObject.getInt("calculateType");
            if (i7 == 20) {
                long j6 = jSONObject.getLong("creditQuota");
                int i10 = jSONObject.getInt(FirebaseAnalytics.Param.TERM);
                int i11 = jSONObject.getInt("maxLoanDays");
                double d2 = jSONObject.getDouble("interestRatio");
                long j10 = jSONObject.getLong("loanAmount");
                long j11 = jSONObject.getLong("dailyInterest");
                int i12 = jSONObject.getInt("termSpan");
                String string = jSONObject.getString("termSpanUnit");
                if (SPUtils.get().getBoolean(BaseApplication.get().getUser().getMemberId() + "show_installment_increase_dialog", true)) {
                    CLIncreaseAmountDialogFragment.a aVar = CLIncreaseAmountDialogFragment.f29944C;
                    Integer numValueOf = Integer.valueOf(i7);
                    Long lValueOf = Long.valueOf(j6);
                    Integer numValueOf2 = Integer.valueOf(i10);
                    Integer numValueOf3 = Integer.valueOf(i11);
                    Double dValueOf = Double.valueOf(d2);
                    Long lValueOf2 = Long.valueOf(j10);
                    Long lValueOf3 = Long.valueOf(j11);
                    Integer numValueOf4 = Integer.valueOf(i12);
                    Intrinsics.e(string);
                    CLIncreaseAmountDialogFragment cLIncreaseAmountDialogFragmentNewInstance = aVar.newInstance(new CLPromoteData(numValueOf, lValueOf, numValueOf2, numValueOf3, dValueOf, lValueOf2, lValueOf3, numValueOf4, string));
                    Z supportFragmentManager = getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    cLIncreaseAmountDialogFragmentNewInstance.show(supportFragmentManager, "showCLIncreaseAmountDialog");
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x02a8  */
    public final void p(int i7) {
        String string;
        CLMainCashLoanBill currentCashLoanBill;
        Long maxLoanAmt;
        Long maxLoanAmt2;
        Integer maxLoanDay;
        Long exampleLoanDailyAmount;
        Long exampleAmount;
        List<ProductSubs> productSubs;
        t tVar = this.f29112A;
        t tVar2 = this.f29113B;
        t tVar3 = this.f29114C;
        if (i7 != 1) {
            t tVar4 = this.f29133w;
            if (i7 != 2) {
                org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_CL_REPAYMENT_PENDING));
                Object value = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((ImageView) value).setImageResource(Ya.d.cs_cl_borrow_pending_icon);
                Object value2 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((TextView) value2).setText(getString(g.cs_cl_sixty_sec));
                Object value3 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                ((TextView) value3).setText(getString(g.cs_cl_borrow_pending_content));
                o().setText(getString(k.core_back));
                h.s(o(), true);
                Object value4 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                h.s((LinearLayout) value4, false);
                h.s(m(), false);
            } else {
                org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_CL_REPAYMENT_FAILED));
                n0.g().v("RepayFail");
                Object value5 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((ImageView) value5).setImageResource(Ya.d.cs_operation_fail_icon);
                Object value6 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                ((TextView) value6).setText(getString(g.cs_cl_repayment_failed));
                Object value7 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                ((TextView) value7).setText(getString(g.cs_cl_check_your_bank_account));
                o().setText(getString(k.core_back));
                h.s(o(), true);
                Object value8 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                h.s((LinearLayout) value8, false);
                h.s(m(), false);
            }
        } else {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_CL_REPAYMENT_SUCCESS));
            n0.g().u((ViewEvent) G.g("RepaySuccess", true));
            CLMainData cLMainData = this.f29118Q;
            if (cLMainData != null && (productSubs = cLMainData.getProductSubs()) != null) {
                for (ProductSubs productSubs2 : productSubs) {
                    Integer productSubId = productSubs2.getProductSubId();
                    if (productSubId != null && productSubId.intValue() == 2) {
                        this.f29120Y = productSubs2;
                    }
                    Integer productSubId2 = productSubs2.getProductSubId();
                    if (productSubId2 != null && productSubId2.intValue() == 1 && this.f29120Y == null) {
                        this.f29120Y = productSubs2;
                    }
                    Integer productSubId3 = productSubs2.getProductSubId();
                    if (productSubId3 != null && productSubId3.intValue() == 3 && this.f29120Y == null) {
                        this.f29120Y = productSubs2;
                    }
                }
            }
            Object value9 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
            ((ImageView) value9).setImageResource(Ya.d.cs_cl_borrow_success_icon);
            Object value10 = this.f29125g.getValue();
            Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
            TextView textView = (TextView) value10;
            SpanUtils spanUtilsAppend = new SpanUtils().append(getString(g.cs_cl_card_interest_borrow));
            CLMainData cLMainData2 = this.f29118Q;
            SpanUtils spanUtilsAppend2 = d0.k(" ", r0.F((cLMainData2 == null || (exampleAmount = cLMainData2.getExampleAmount()) == null) ? 100000L : exampleAmount.longValue()), " ", spanUtilsAppend).setForegroundColor(getColor(Ya.b.cs_cl_main_color)).setBold().append(", Daily interest only  ");
            CLMainData cLMainData3 = this.f29118Q;
            textView.setText(d0.k(" ", r0.F((cLMainData3 == null || (exampleLoanDailyAmount = cLMainData3.getExampleLoanDailyAmount()) == null) ? 100L : exampleLoanDailyAmount.longValue()), " ", spanUtilsAppend2).setForegroundColor(getColor(Ya.b.cs_cl_main_color)).setBold().create());
            Object value11 = this.f29127j.getValue();
            Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
            TextView textView2 = (TextView) value11;
            ProductSubs productSubs3 = this.f29120Y;
            if (productSubs3 == null || (maxLoanDay = productSubs3.getMaxLoanDay()) == null || (string = maxLoanDay.toString()) == null) {
                string = "";
            }
            textView2.setText(string);
            Object value12 = this.f29126i.getValue();
            Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
            TextView textView3 = (TextView) value12;
            ProductSubs productSubs4 = this.f29120Y;
            textView3.setText(r0.F((productSubs4 == null || (maxLoanAmt2 = productSubs4.getMaxLoanAmt()) == null) ? 0L : maxLoanAmt2.longValue()));
            Object value13 = this.f29132v.getValue();
            Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
            TextView textView4 = (TextView) value13;
            ProductSubs productSubs5 = this.f29120Y;
            textView4.setText(r0.F((productSubs5 == null || (maxLoanAmt = productSubs5.getMaxLoanAmt()) == null) ? 0L : maxLoanAmt.longValue()));
            Object value14 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
            ((TextView) value14).setText(getString(g.cs_cl_repayment_success));
            Object value15 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
            ((TextView) value15).setText(getString(g.cs_cl_all_repay_success_content));
            CLMainData cLMainData4 = this.f29118Q;
            CLMainCreditCard creditCard = cLMainData4 != null ? cLMainData4.getCreditCard() : null;
            t tVar5 = this.f29129o;
            if (creditCard == null) {
                Object value16 = tVar5.getValue();
                Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                h.s((ConstraintLayout) value16, false);
                h.s(o(), true);
                h.s(m(), false);
                showLoadingDialog(true);
                c.f40268a.getInstance().getClass();
                c.a().queryLoanUserConfig().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new k0(this, 1));
            } else {
                CLMainData cLMainData5 = this.f29118Q;
                if (((cLMainData5 == null || (currentCashLoanBill = cLMainData5.getCurrentCashLoanBill()) == null) ? 0L : currentCashLoanBill.getOutstandingAmount()) == 0) {
                    Object value17 = tVar5.getValue();
                    Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                    h.s((ConstraintLayout) value17, true);
                    h.s(o(), false);
                    h.s(m(), false);
                } else {
                    Object value18 = tVar5.getValue();
                    Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                    h.s((ConstraintLayout) value18, false);
                    h.s(o(), true);
                    h.s(m(), false);
                    showLoadingDialog(true);
                    c.f40268a.getInstance().getClass();
                    c.a().queryLoanUserConfig().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new k0(this, 1));
                }
            }
        }
        if (TextUtils.isEmpty(this.f29116L)) {
            return;
        }
        try {
            String str = this.f29116L;
            Intrinsics.e(str);
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("amountInfo"));
            jSONObject.optInt("payType");
            jSONObject2.optLong("transAmount");
            jSONObject.optString("bankName");
            jSONObject.optString("bankCard");
            jSONObject.optString("receiveAccount");
            jSONObject.optLong("billId");
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundDark));
        org.greenrobot.eventbus.c.b().j(this);
        getIntent().getStringExtra("payStatus");
        this.f29117M = getIntent().getStringExtra("orderNo");
        this.f29116L = getIntent().getStringExtra("orderDesc");
        Object value = this.f29122d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        org.chromium.support_lib_boundary.util.b.c((SingleAdView) value);
        x xVar = new x(this, 12);
        Object value2 = this.f29115H.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        Button buttonO = o();
        Object value3 = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        Object value4 = this.f29124f.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        h.q(xVar, (ImageView) value2, buttonO, (TextView) value3, (TextView) value4);
    }
}
