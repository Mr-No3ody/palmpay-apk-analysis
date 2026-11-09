package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import L6.i;
import Pa.r0;
import Wd.C0749x;
import Ya.e;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.viewmodel.ModelPaymentResultProgress;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayResultActivity;
import com.transsnet.palmpay.custom_view.model.ModelPreviewItem;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p284sb.C2025x;
import p285sc.x;
import p294tb.RunnableC2060w;
import p310ub.h1;
import p310ub.p1;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC还款结果页", path = "/credit_score/oc_repay_result_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcRepayResultActivity;", "LZa/b;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepayResultActivity extends Za.b {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f29829u0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f29830A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f29831B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f29832C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f29833H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f29834L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f29835M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f29836Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f29837X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f29838Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f29839Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29842f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29843g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29845j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f29846k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29847o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29848p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f29849p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f29850q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long f29851r0 = 5000;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Handler f29852s0 = new Handler(Looper.getMainLooper());
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f29853t0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29854v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29855w;

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

    public OcRepayResultActivity() {
        final int i7 = 8;
        this.f29840d = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i7) {
                    case 0:
                        int i10 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i11 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i12 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i13 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i14 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i15 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i16 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i17 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i18 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i19 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i20 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i21 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i22 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i23 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i10 = 16;
        this.f29841e = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i10) {
                    case 0:
                        int i11 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i12 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i13 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i14 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i15 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i16 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i17 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i18 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i19 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i20 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i21 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i22 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i23 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i11 = 0;
        this.f29842f = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i11) {
                    case 0:
                        int i12 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i13 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i14 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i15 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i16 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i17 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i18 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i19 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i20 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i21 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i22 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i23 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i12 = 1;
        this.f29843g = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i12) {
                    case 0:
                        int i13 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i14 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i15 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i16 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i17 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i18 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i19 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i112 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i20 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i21 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i22 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i23 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i13 = 2;
        this.f29844i = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i13) {
                    case 0:
                        int i14 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i15 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i16 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i17 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i18 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i19 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i112 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i113 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i20 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i21 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i22 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i23 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i14 = 3;
        this.f29845j = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i14) {
                    case 0:
                        int i15 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i16 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i17 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i18 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i19 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i112 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i113 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i114 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i20 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i21 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i22 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i23 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i15 = 4;
        this.f29847o = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i15) {
                    case 0:
                        int i16 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i17 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i18 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i19 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i112 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i113 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i114 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i115 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i20 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i21 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i22 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i23 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i16 = 5;
        this.f29848p = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i16) {
                    case 0:
                        int i17 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i18 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i19 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i112 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i113 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i114 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i115 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i116 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i20 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i21 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i22 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i23 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i17 = 6;
        this.t = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i17) {
                    case 0:
                        int i18 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i19 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i112 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i113 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i114 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i115 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i116 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i117 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i20 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i21 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i22 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i23 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i18 = 7;
        this.f29854v = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i18) {
                    case 0:
                        int i19 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i112 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i113 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i114 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i115 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i116 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i117 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i118 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i20 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i21 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i22 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i23 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i19 = 9;
        this.f29855w = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i19) {
                    case 0:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i112 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i113 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i114 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i115 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i116 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i117 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i118 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i119 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i20 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i21 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i22 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i23 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i20 = 10;
        this.f29830A = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i20) {
                    case 0:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i112 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i113 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i114 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i115 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i116 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i117 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i118 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i119 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i21 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i22 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i23 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i27 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i21 = 11;
        this.f29831B = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i21) {
                    case 0:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i112 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i113 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i114 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i115 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i116 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i117 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i118 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i119 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i22 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i23 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i27 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i28 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i22 = 12;
        this.f29832C = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i22) {
                    case 0:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i112 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i113 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i114 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i115 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i116 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i117 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i118 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i119 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i23 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i27 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i28 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i29 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i23 = 13;
        this.f29833H = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i23) {
                    case 0:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i112 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i113 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i114 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i115 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i116 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i117 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i118 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i119 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i24 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i27 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i28 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i29 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i210 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i24 = 14;
        this.f29834L = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i24) {
                    case 0:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i112 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i113 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i114 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i115 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i116 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i117 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i118 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i119 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i25 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i27 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i28 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i29 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i210 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i211 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
        final int i25 = 15;
        this.f29853t0 = C2131j.b(new Function0(this) { // from class: ub.o1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayResultActivity f42899b;

            {
                this.f42899b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayResultActivity ocRepayResultActivity = this.f42899b;
                switch (i25) {
                    case 0:
                        int i110 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_bottom_sav);
                    case 1:
                        int i111 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_third_sav);
                    case 2:
                        int i112 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_second_sav);
                    case 3:
                        int i113 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_middle_first_sav);
                    case 4:
                        int i114 = OcRepayResultActivity.f29829u0;
                        return (SingleAdView) ocRepayResultActivity.findViewById(e.oc_repay_result_top_sav);
                    case 5:
                        int i115 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_tv);
                    case 6:
                        int i116 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_payment_amount_tv);
                    case 7:
                        int i117 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.coming_due_date_tv);
                    case 8:
                        int i118 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_again_bt);
                    case 9:
                        int i119 = OcRepayResultActivity.f29829u0;
                        return (ConstraintLayout) ocRepayResultActivity.findViewById(e.upcoming_payment_cl);
                    case 10:
                        int i26 = OcRepayResultActivity.f29829u0;
                        return (TextView) ocRepayResultActivity.findViewById(e.repayment_plan_title_tv);
                    case 11:
                        int i27 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemTransType);
                    case 12:
                        int i28 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemPaymentMethod);
                    case 13:
                        int i29 = OcRepayResultActivity.f29829u0;
                        return (ModelPreviewItem) ocRepayResultActivity.findViewById(e.itemOrderNo);
                    case 14:
                        int i210 = OcRepayResultActivity.f29829u0;
                        return (ModelPaymentResultProgress) ocRepayResultActivity.findViewById(e.lite_repayment_result_progress_view);
                    case 15:
                        int i211 = OcRepayResultActivity.f29829u0;
                        return new RunnableC2060w(ocRepayResultActivity, 3);
                    default:
                        int i212 = OcRepayResultActivity.f29829u0;
                        return (Button) ocRepayResultActivity.findViewById(e.lite_result_complete_bt);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_repay_result_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Object value = this.f29841e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        p220oa.h.l(new h1(2), (Button) value);
        Object value2 = this.f29840d.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        p220oa.h.l(new x(this, 27), (Button) value2);
    }

    public final void m() {
        G.h(p221ob.c.f40268a).getOcRepayResult(this.f29837X, null).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new p1(this));
    }

    public final ModelPaymentResultProgress n() {
        Object value = this.f29834L.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelPaymentResultProgress) value;
    }

    public final Runnable o() {
        return (Runnable) this.f29853t0.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            this.f29852s0.removeCallbacks(o());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if ((pushMessage != null ? pushMessage.content : null) == null) {
            return;
        }
        if (PushMessage.MESSAGE_TYPE_ORDER_STATUS_CHANGE.equals(pushMessage.content.messageType) || "1000".equals(pushMessage.content.messageType) || "1036".equals(pushMessage.content.messageType)) {
            m();
        } else if (PushMessage.MESSAGE_TYPE_FLEXI_FROZEN.equals(pushMessage.content.messageType)) {
            int i7 = Ya.d.cs_icon_lock;
            n.O(this, 2, Integer.valueOf(Ya.g.cs_oc_flexi_account_frozen), null, Integer.valueOf(i7), null, null, null, null, getString(Ya.g.cs_how_to_unfreeze), new h1(1), null, null, null, null, false, i.ppFlexiDialogTheme, 8124916);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f29838Y) {
            this.f29852s0.postDelayed(o(), this.f29851r0);
        }
    }

    public final void p() {
        String string = getString(Ya.g.oc_repay_result_ad_slot_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        new InterstitialAdView(string, 0, new C2025x(14), new org.sufficientlysecure.htmltextview.h(9)).show(this, new C0749x(this, 3));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        m();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        org.greenrobot.eventbus.c.b().j(this);
        this.f29835M = getIntent().getStringExtra("payStatus");
        this.f29837X = getIntent().getStringExtra("orderNo");
        this.f29836Q = getIntent().getStringExtra("orderDesc");
        String str = this.f29835M;
        Integer num = 1;
        if (Intrinsics.c(str, num.toString())) {
            n().g(getString(Ya.g.cs_oc_result_success));
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_OC_REPAY_SUCCESS, ""));
        } else {
            Integer num2 = 2;
            if (Intrinsics.c(str, num2.toString())) {
                n().d(getString(Ya.g.cs_top_up_result_failed));
                org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_OC_REPAY_FAILED, ""));
            } else {
                n().f(this.f29849p0, this.f29846k0, this.f29850q0);
                org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_OC_REPAY_PENDING, ""));
            }
        }
        Object value = this.f29831B.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ModelPreviewItem) value).setContent(getString(Ya.g.cs_oc_ok_card));
        Object value2 = this.f29833H.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((ModelPreviewItem) value2).setContent(this.f29837X);
        if (TextUtils.isEmpty(this.f29836Q)) {
            return;
        }
        try {
            String str2 = this.f29836Q;
            Intrinsics.e(str2);
            JSONObject jSONObject = new JSONObject(str2);
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("amountInfo"));
            int iOptInt = jSONObject.optInt("payType");
            long jOptLong = jSONObject2.optLong("transAmount");
            String strOptString = jSONObject.optString("bankName");
            String strOptString2 = jSONObject.optString("bankCard");
            n().setAmount(jOptLong);
            Object value3 = this.f29832C.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((ModelPreviewItem) value3).setContent(r0.r0(iOptInt, strOptString, strOptString2));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        Object value4 = this.f29847o.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((SingleAdView) value4).setAdListener(new C2025x(9));
        Object value5 = this.f29845j.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((SingleAdView) value5).setAdListener(new C2025x(10));
        Object value6 = this.f29844i.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((SingleAdView) value6).setAdListener(new C2025x(11));
        Object value7 = this.f29843g.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((SingleAdView) value7).setAdListener(new C2025x(12));
        Object value8 = this.f29842f.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        ((SingleAdView) value8).setAdListener(new C2025x(13));
    }
}
