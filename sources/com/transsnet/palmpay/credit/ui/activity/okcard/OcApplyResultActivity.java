package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import Ce.DialogInterfaceOnDismissListenerC0168j;
import N8.q0;
import Pa.n0;
import Pa.r0;
import Ya.e;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.api.Service;
import com.horcrux.svg.d0;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.credit.bean.resp.OcApplyResultConfig;
import com.transsnet.palmpay.credit.bean.resp.OcApplyResultData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyResultActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcApplyResultExitDialog;
import com.transsnet.palmpay.credit.view.OpenResultTaskView;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p284sb.A;
import p294tb.C2055q;
import p310ub.C2096q;
import p310ub.RunnableC2094p;
import p310ub.r;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC授信结果页(废弃)", path = "/credit_score/oc_apply_result_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyResultActivity;", "LZa/d;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcApplyResultActivity extends Za.d {

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public static final /* synthetic */ int f29276O0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f29277A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final t f29278A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f29279B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final t f29280B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f29281C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final t f29282C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public OcApplyResultData f29283D0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f29287H;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final t f29289I0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final t f29291K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f29292L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f29294M;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final t f29296N0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f29297Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f29298X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29299Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29300Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29304g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29306j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f29307k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29308o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29309p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f29310p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f29311q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f29312r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f29313s0;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f29314t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final t f29315u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29316v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final t f29317v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29318w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final t f29319w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final t f29320x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final t f29321y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final t f29322z0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final long f29284E0 = 5000;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f29285F0 = 3;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f29286G0 = true;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final Handler f29288H0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final Handler f29290J0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f29293L0 = 10;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final Handler f29295M0 = new Handler(Looper.getMainLooper());

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

    public OcApplyResultActivity() {
        final int i7 = 0;
        this.f29301d = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i7) {
                    case 0:
                        int i10 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i11 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i12 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i13 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i14 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i15 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i16 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i17 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i18 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i19 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i20 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i21 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i22 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i23 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i30 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i31 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i32 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i10 = 2;
        this.f29302e = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i10) {
                    case 0:
                        int i11 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i12 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i13 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i14 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i15 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i16 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i17 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i18 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i19 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i20 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i21 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i22 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i23 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i30 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i31 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i32 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i11 = 14;
        this.f29303f = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i11) {
                    case 0:
                        int i12 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i13 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i14 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i15 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i16 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i17 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i18 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i19 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i20 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i21 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i22 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i23 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i30 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i31 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i32 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i12 = 25;
        this.f29304g = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i12) {
                    case 0:
                        int i13 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i14 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i15 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i16 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i17 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i18 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i19 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i20 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i21 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i22 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i23 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i30 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i31 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i32 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i13 = 26;
        this.f29305i = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i13) {
                    case 0:
                        int i14 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i15 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i16 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i17 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i18 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i19 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i20 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i21 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i22 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i23 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i30 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i31 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i32 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i14 = 27;
        this.f29306j = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i14) {
                    case 0:
                        int i15 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i16 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i17 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i18 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i19 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i20 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i21 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i22 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i23 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i30 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i31 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i32 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i15 = 28;
        this.f29308o = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i15) {
                    case 0:
                        int i16 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i17 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i18 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i19 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i20 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i21 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i22 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i23 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i30 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i31 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i32 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i16 = 29;
        this.f29309p = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i16) {
                    case 0:
                        int i17 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i18 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i19 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i20 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i21 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i22 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i23 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i30 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i31 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i32 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i17 = 0;
        this.t = C2131j.b(new Function0(this) { // from class: ub.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42893b;

            {
                this.f42893b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42893b;
                switch (i17) {
                    case 0:
                        int i18 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_end_iv);
                    case 1:
                        int i19 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_start_iv);
                    case 2:
                        int i20 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_pending_iv);
                    case 3:
                        int i21 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_pending_ll);
                    case 4:
                        int i22 = OcApplyResultActivity.f29276O0;
                        return (Button) ocApplyResultActivity.findViewById(e.use_coupon_bt);
                    case 5:
                        int i23 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.counter_tv);
                    case 6:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.close_tips_tv);
                    case 7:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_two_sav);
                    default:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_sav);
                }
            }
        });
        final int i18 = 1;
        this.f29316v = C2131j.b(new Function0(this) { // from class: ub.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42893b;

            {
                this.f42893b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42893b;
                switch (i18) {
                    case 0:
                        int i19 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_end_iv);
                    case 1:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_start_iv);
                    case 2:
                        int i20 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_pending_iv);
                    case 3:
                        int i21 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_pending_ll);
                    case 4:
                        int i22 = OcApplyResultActivity.f29276O0;
                        return (Button) ocApplyResultActivity.findViewById(e.use_coupon_bt);
                    case 5:
                        int i23 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.counter_tv);
                    case 6:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.close_tips_tv);
                    case 7:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_two_sav);
                    default:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_sav);
                }
            }
        });
        final int i19 = 11;
        this.f29318w = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i19) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i20 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i21 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i22 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i23 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i30 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i31 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i32 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i20 = 22;
        this.f29277A = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i20) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i21 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i22 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i23 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i30 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i31 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i32 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i21 = 2;
        this.f29279B = C2131j.b(new Function0(this) { // from class: ub.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42893b;

            {
                this.f42893b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42893b;
                switch (i21) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_end_iv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_start_iv);
                    case 2:
                        int i22 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_pending_iv);
                    case 3:
                        int i23 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_pending_ll);
                    case 4:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (Button) ocApplyResultActivity.findViewById(e.use_coupon_bt);
                    case 5:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.counter_tv);
                    case 6:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.close_tips_tv);
                    case 7:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_two_sav);
                    default:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_sav);
                }
            }
        });
        final int i22 = 3;
        this.f29281C = C2131j.b(new Function0(this) { // from class: ub.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42893b;

            {
                this.f42893b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42893b;
                switch (i22) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_end_iv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_start_iv);
                    case 2:
                        int i23 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_pending_iv);
                    case 3:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_pending_ll);
                    case 4:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (Button) ocApplyResultActivity.findViewById(e.use_coupon_bt);
                    case 5:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.counter_tv);
                    case 6:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.close_tips_tv);
                    case 7:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_two_sav);
                    default:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_sav);
                }
            }
        });
        final int i23 = 4;
        this.f29287H = C2131j.b(new Function0(this) { // from class: ub.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42893b;

            {
                this.f42893b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42893b;
                switch (i23) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_end_iv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_start_iv);
                    case 2:
                        int i24 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_pending_iv);
                    case 3:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_pending_ll);
                    case 4:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (Button) ocApplyResultActivity.findViewById(e.use_coupon_bt);
                    case 5:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.counter_tv);
                    case 6:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.close_tips_tv);
                    case 7:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_two_sav);
                    default:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_sav);
                }
            }
        });
        final int i24 = 5;
        this.f29292L = C2131j.b(new Function0(this) { // from class: ub.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42893b;

            {
                this.f42893b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42893b;
                switch (i24) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_end_iv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_start_iv);
                    case 2:
                        int i25 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_pending_iv);
                    case 3:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_pending_ll);
                    case 4:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (Button) ocApplyResultActivity.findViewById(e.use_coupon_bt);
                    case 5:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.counter_tv);
                    case 6:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.close_tips_tv);
                    case 7:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_two_sav);
                    default:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_sav);
                }
            }
        });
        final int i25 = 6;
        this.f29294M = C2131j.b(new Function0(this) { // from class: ub.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42893b;

            {
                this.f42893b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42893b;
                switch (i25) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_end_iv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_start_iv);
                    case 2:
                        int i26 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_pending_iv);
                    case 3:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_pending_ll);
                    case 4:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (Button) ocApplyResultActivity.findViewById(e.use_coupon_bt);
                    case 5:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.counter_tv);
                    case 6:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.close_tips_tv);
                    case 7:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_two_sav);
                    default:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_sav);
                }
            }
        });
        final int i26 = 7;
        this.f29297Q = C2131j.b(new Function0(this) { // from class: ub.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42893b;

            {
                this.f42893b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42893b;
                switch (i26) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_end_iv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_start_iv);
                    case 2:
                        int i27 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_pending_iv);
                    case 3:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_pending_ll);
                    case 4:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (Button) ocApplyResultActivity.findViewById(e.use_coupon_bt);
                    case 5:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.counter_tv);
                    case 6:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.close_tips_tv);
                    case 7:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_two_sav);
                    default:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_sav);
                }
            }
        });
        final int i27 = 8;
        this.f29298X = C2131j.b(new Function0(this) { // from class: ub.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42893b;

            {
                this.f42893b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42893b;
                switch (i27) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_end_iv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_first_start_iv);
                    case 2:
                        int i28 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_pending_iv);
                    case 3:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_pending_ll);
                    case 4:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (Button) ocApplyResultActivity.findViewById(e.use_coupon_bt);
                    case 5:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.counter_tv);
                    case 6:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.close_tips_tv);
                    case 7:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_two_sav);
                    default:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_bottom_sav);
                }
            }
        });
        final int i28 = 1;
        this.f29299Y = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i28) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i29 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i30 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i31 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i32 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i29 = 3;
        this.f29300Z = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i29) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i30 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i31 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i32 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i30 = 4;
        this.f29307k0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i30) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i31 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i32 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i31 = 5;
        this.f29310p0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i31) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i32 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i32 = 6;
        this.f29311q0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i32) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i33 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i33 = 7;
        this.f29312r0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i33) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i34 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i34 = 8;
        this.f29313s0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i34) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i35 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i314 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i35 = 9;
        this.f29314t0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i35) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i36 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i314 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i315 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i36 = 10;
        this.f29315u0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i36) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i37 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i314 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i315 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i316 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i37 = 12;
        this.f29317v0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i37) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i38 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i314 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i315 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i316 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i317 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i38 = 13;
        this.f29319w0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i38) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i39 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i314 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i315 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i316 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i317 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i318 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i39 = 15;
        this.f29320x0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i39) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i314 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i316 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i317 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i318 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i319 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i40 = 16;
        this.f29321y0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i40) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i314 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i316 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i317 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i318 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i319 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i41 = 17;
        this.f29322z0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i41) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i314 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i316 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i317 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i318 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i319 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i42 = 18;
        this.f29278A0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i42) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i314 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i316 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i317 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i318 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i319 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i43 = 19;
        this.f29280B0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i43) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i314 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i316 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i317 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i318 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i319 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i44 = 20;
        this.f29282C0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i44) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i314 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i316 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i317 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i318 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i319 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i45 = 21;
        this.f29289I0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i45) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i314 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i316 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i317 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i318 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i319 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i46 = 23;
        this.f29291K0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i46) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i314 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i316 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i317 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i318 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i319 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
        final int i47 = 24;
        this.f29296N0 = C2131j.b(new Function0(this) { // from class: ub.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42888b;

            {
                this.f42888b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcApplyResultActivity ocApplyResultActivity = this.f42888b;
                switch (i47) {
                    case 0:
                        int i110 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_four_tips_tv);
                    case 1:
                        int i111 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_right_sav);
                    case 2:
                        int i112 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_four_start_iv);
                    case 3:
                        int i113 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_middle_sav);
                    case 4:
                        int i114 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.success_left_sav);
                    case 5:
                        int i115 = OcApplyResultActivity.f29276O0;
                        return (SingleAdView) ocApplyResultActivity.findViewById(e.apply_result_sav);
                    case 6:
                        int i116 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.success_ad_ll);
                    case 7:
                        int i117 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvViewAccount);
                    case 8:
                        int i118 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.tvBackHome);
                    case 9:
                        int i119 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.layoutBtn);
                    case 10:
                        int i210 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.installment_content_tv);
                    case 11:
                        int i211 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tips_tv);
                    case 12:
                        int i212 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.apply_credit_amount_tv);
                    case 13:
                        int i213 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_success_ll);
                    case 14:
                        int i214 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_third_tips_tv);
                    case 15:
                        int i215 = OcApplyResultActivity.f29276O0;
                        return (OpenResultTaskView) ocApplyResultActivity.findViewById(e.apply_result_task_view);
                    case 16:
                        int i216 = OcApplyResultActivity.f29276O0;
                        return (PpButton) ocApplyResultActivity.findViewById(e.apply_back_bt);
                    case 17:
                        int i217 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.oc_apply_failed_content_tv);
                    case 18:
                        int i218 = OcApplyResultActivity.f29276O0;
                        return (LinearLayout) ocApplyResultActivity.findViewById(e.apply_failed_ll);
                    case 19:
                        int i219 = OcApplyResultActivity.f29276O0;
                        return (PpTitleBar) ocApplyResultActivity.findViewById(e.apply_result_mtb);
                    case 20:
                        int i310 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.apply_result_bg_img);
                    case 21:
                        int i311 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 3);
                    case 22:
                        int i312 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.countdown_tv);
                    case 23:
                        int i313 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 2);
                    case 24:
                        int i314 = OcApplyResultActivity.f29276O0;
                        return new RunnableC2094p(ocApplyResultActivity, 1);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_end_iv);
                    case 26:
                        int i316 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_third_start_iv);
                    case 27:
                        int i317 = OcApplyResultActivity.f29276O0;
                        return (TextView) ocApplyResultActivity.findViewById(e.pending_second_tips_tv);
                    case 28:
                        int i318 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_end_iv);
                    default:
                        int i319 = OcApplyResultActivity.f29276O0;
                        return (ImageView) ocApplyResultActivity.findViewById(e.pending_second_start_iv);
                }
            }
        });
    }

    public static final void n(OcApplyResultActivity ocApplyResultActivity, AdEntity adEntity) {
        try {
            org.chromium.support_lib_boundary.util.b.P(adEntity);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_apply_result_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final ImageView o() {
        Object value = this.f29279B.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        x();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
        o().clearAnimation();
        u().clearAnimation();
        v().clearAnimation();
        w().clearAnimation();
        try {
            this.f29288H0.removeCallbacks(t());
            this.f29290J0.removeCallbacks((Runnable) this.f29291K0.getValue());
            this.f29295M0.removeCallbacks((Runnable) this.f29296N0.getValue());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            this.f29288H0.removeCallbacks(t());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if ((pushMessage != null ? pushMessage.content : null) == null) {
            return;
        }
        F6.d.c(G.o("OcApply onReceivePushMessage: ", pushMessage.content.messageType), new Object[0]);
        boolean zEqualsIgnoreCase = PushMessage.MESSAGE_TYPE_OC_APPLY_SUCCESS.equalsIgnoreCase(pushMessage.content.messageType);
        Handler handler = this.f29288H0;
        if (zEqualsIgnoreCase || PushMessage.MESSAGE_TYPE_OC_APPLY_FAILED.equalsIgnoreCase(pushMessage.content.messageType)) {
            handler.removeCallbacks(t());
            r();
        } else if (PushMessage.MESSAGE_TYPE_OC_FAIL_TASK_DONE.equals(pushMessage.content.messageType)) {
            y();
            handler.postDelayed(new RunnableC2094p(this, 0), 3000L);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        Integer applyStatus;
        super.onResume();
        OcApplyResultData ocApplyResultData = this.f29283D0;
        if (((ocApplyResultData == null || (applyStatus = ocApplyResultData.getApplyStatus()) == null) ? 0 : applyStatus.intValue()) == 0) {
            this.f29288H0.postDelayed(t(), this.f29284E0);
        }
    }

    public final ImageView p() {
        Object value = this.f29282C0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    public final PpTitleBar q() {
        Object value = this.f29280B0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpTitleBar) value;
    }

    public final void r() {
        OcApplyResultData ocApplyResultData = this.f29283D0;
        String applyId = ocApplyResultData != null ? ocApplyResultData.getApplyId() : null;
        if (applyId == null || applyId.length() == 0) {
            return;
        }
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().queryOcStatus(applyId).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 9));
    }

    public final TextView s() {
        Object value = this.f29315u0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Integer applyStatus;
        org.greenrobot.eventbus.c.b().j(this);
        BarUtils.setStatusBarLightMode((Activity) this, true);
        String stringExtra = getIntent().getStringExtra("oc_apply_result");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f29283D0 = (OcApplyResultData) d0.l(OcApplyResultData.class, stringExtra);
        }
        OcApplyResultData ocApplyResultData = this.f29283D0;
        if (((ocApplyResultData == null || (applyStatus = ocApplyResultData.getApplyStatus()) == null) ? 0 : applyStatus.intValue()) == 0) {
            G.u(MessageEvent.EVENT_OC_ACTIVE_FINISH, org.greenrobot.eventbus.c.b());
        }
        z();
        final int i7 = 0;
        q().setBackButtonClickListener(new View.OnClickListener(this) { // from class: ub.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42895b;

            {
                this.f42895b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer applySource;
                OcApplyResultActivity ocApplyResultActivity = this.f42895b;
                switch (i7) {
                    case 0:
                        int i10 = OcApplyResultActivity.f29276O0;
                        ocApplyResultActivity.x();
                        n0.g().m("OcApplyResultActivity_element_click", "mtb_back_iv", "");
                        break;
                    case 1:
                        int i11 = OcApplyResultActivity.f29276O0;
                        d.H("/main/home", "tab", "finance");
                        n0.g().m(ocApplyResultActivity.getClass().getSimpleName().concat("_element_click"), "apply_back_bt", "");
                        break;
                    default:
                        OcApplyResultData ocApplyResultData2 = ocApplyResultActivity.f29283D0;
                        if (ocApplyResultData2 != null && (applySource = ocApplyResultData2.getApplySource()) != null && applySource.intValue() == 2) {
                            q0.u("/airtime/top_up_airtime");
                        }
                        ocApplyResultActivity.finish();
                        n0.g().m("OcApplyResultActivity_element_click", "use_coupon_bt", "");
                        break;
                }
            }
        });
        Object value = this.f29321y0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        PpButton ppButton = (PpButton) value;
        Intrinsics.f(ppButton, "null cannot be cast to non-null type com.palmpay.lib.ui.button.PpButton");
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42895b;

            {
                this.f42895b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer applySource;
                OcApplyResultActivity ocApplyResultActivity = this.f42895b;
                switch (i10) {
                    case 0:
                        int i11 = OcApplyResultActivity.f29276O0;
                        ocApplyResultActivity.x();
                        n0.g().m("OcApplyResultActivity_element_click", "mtb_back_iv", "");
                        break;
                    case 1:
                        int i12 = OcApplyResultActivity.f29276O0;
                        d.H("/main/home", "tab", "finance");
                        n0.g().m(ocApplyResultActivity.getClass().getSimpleName().concat("_element_click"), "apply_back_bt", "");
                        break;
                    default:
                        OcApplyResultData ocApplyResultData2 = ocApplyResultActivity.f29283D0;
                        if (ocApplyResultData2 != null && (applySource = ocApplyResultData2.getApplySource()) != null && applySource.intValue() == 2) {
                            q0.u("/airtime/top_up_airtime");
                        }
                        ocApplyResultActivity.finish();
                        n0.g().m("OcApplyResultActivity_element_click", "use_coupon_bt", "");
                        break;
                }
            }
        }, ppButton);
        Object value2 = this.f29310p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((SingleAdView) value2).setAdListener(new C2096q(this, 0));
        Object value3 = this.f29307k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((SingleAdView) value3).setAdListener(new C2096q(this, 1));
        Object value4 = this.f29300Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((SingleAdView) value4).setAdListener(new C2096q(this, 2));
        Object value5 = this.f29299Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((SingleAdView) value5).setAdListener(new C2096q(this, 3));
        Object value6 = this.f29298X.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((SingleAdView) value6).setAdListener(new C2096q(this, 4));
        Object value7 = this.f29297Q.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((SingleAdView) value7).setAdListener(new C2096q(this, 5));
        Object value8 = this.f29287H.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        final int i11 = 2;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultActivity f42895b;

            {
                this.f42895b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Integer applySource;
                OcApplyResultActivity ocApplyResultActivity = this.f42895b;
                switch (i11) {
                    case 0:
                        int i12 = OcApplyResultActivity.f29276O0;
                        ocApplyResultActivity.x();
                        n0.g().m("OcApplyResultActivity_element_click", "mtb_back_iv", "");
                        break;
                    case 1:
                        int i13 = OcApplyResultActivity.f29276O0;
                        d.H("/main/home", "tab", "finance");
                        n0.g().m(ocApplyResultActivity.getClass().getSimpleName().concat("_element_click"), "apply_back_bt", "");
                        break;
                    default:
                        OcApplyResultData ocApplyResultData2 = ocApplyResultActivity.f29283D0;
                        if (ocApplyResultData2 != null && (applySource = ocApplyResultData2.getApplySource()) != null && applySource.intValue() == 2) {
                            q0.u("/airtime/top_up_airtime");
                        }
                        ocApplyResultActivity.finish();
                        n0.g().m("OcApplyResultActivity_element_click", "use_coupon_bt", "");
                        break;
                }
            }
        }, (Button) value8);
        Object value9 = this.f29313s0.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        p220oa.h.l(new A(16), (TextView) value9);
        Object value10 = this.f29312r0.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        p220oa.h.l(new A(17), (TextView) value10);
    }

    public final Runnable t() {
        return (Runnable) this.f29289I0.getValue();
    }

    public final ImageView u() {
        Object value = this.f29316v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final ImageView v() {
        Object value = this.f29309p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final ImageView w() {
        Object value = this.f29305i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final void x() {
        Integer applyStatus;
        OcApplyResultConfig config;
        OcApplyResultConfig config2;
        Long stayQuota;
        OcApplyResultData ocApplyResultData = this.f29283D0;
        if (ocApplyResultData != null && (applyStatus = ocApplyResultData.getApplyStatus()) != null && applyStatus.intValue() == 1) {
            OcApplyResultData ocApplyResultData2 = this.f29283D0;
            if (((ocApplyResultData2 == null || (config2 = ocApplyResultData2.getConfig()) == null || (stayQuota = config2.getStayQuota()) == null) ? 0L : stayQuota.longValue()) > 0) {
                OcApplyResultData ocApplyResultData3 = this.f29283D0;
                OcApplyResultExitDialog ocApplyResultExitDialog = new OcApplyResultExitDialog(this, (ocApplyResultData3 == null || (config = ocApplyResultData3.getConfig()) == null) ? null : config.getStayQuota());
                ocApplyResultExitDialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC0168j(4));
                ocApplyResultExitDialog.show();
                return;
            }
        }
        com.palmpay.lib.apm.launchcounter.util.d.H("/main/home", "tab", "finance");
    }

    public final void y() {
        this.f29293L0 = 10;
        this.f29288H0.postDelayed(t(), this.f29284E0);
        q().getRightTextView().setVisibility(8);
        q().setBackgroundColor(0);
        Object value = this.f29278A0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        LinearLayout linearLayout = (LinearLayout) value;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        Object value2 = this.f29319w0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((LinearLayout) value2).setVisibility(8);
        Object value3 = this.f29281C.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((LinearLayout) value3).setVisibility(0);
        p().setVisibility(0);
        if (this.f29286G0) {
            this.f29286G0 = false;
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(1000L);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            o().startAnimation(rotateAnimation);
            this.f29295M0.post((Runnable) this.f29296N0.getValue());
        }
    }

    public final void z() {
        Integer applySource;
        Integer applySource2;
        Long creditQuota;
        Integer applySource3;
        Integer applyStatus;
        OcApplyResultData ocApplyResultData = this.f29283D0;
        int iIntValue = (ocApplyResultData == null || (applyStatus = ocApplyResultData.getApplyStatus()) == null) ? 0 : applyStatus.intValue();
        if (iIntValue == 0) {
            y();
            return;
        }
        Handler handler = this.f29290J0;
        Handler handler2 = this.f29288H0;
        t tVar = this.f29291K0;
        t tVar2 = this.f29281C;
        t tVar3 = this.f29319w0;
        t tVar4 = this.f29278A0;
        if (iIntValue != 1) {
            o().clearAnimation();
            handler2.removeCallbacks(t());
            G.u(MessageEvent.EVENT_OC_ACTIVE_FINISH, org.greenrobot.eventbus.c.b());
            initStatusBar(getColor(L6.b.ppColorBackgroundDark));
            BarUtils.setStatusBarLightMode((Activity) this, true);
            q().getRightTextView().setVisibility(8);
            q().setBackgroundColor(getColor(L6.b.ppColorBackgroundDark));
            Object value = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            LinearLayout linearLayout = (LinearLayout) value;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            Object value2 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((LinearLayout) value2).setVisibility(8);
            Object value3 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((LinearLayout) value3).setVisibility(8);
            p().setVisibility(8);
            Object value4 = this.f29322z0.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            TextView textView = (TextView) value4;
            OcApplyResultData ocApplyResultData2 = this.f29283D0;
            textView.setText(ocApplyResultData2 != null ? ocApplyResultData2.getErrorContent() : null);
            OcApplyResultData ocApplyResultData3 = this.f29283D0;
            if (ocApplyResultData3 != null && (applySource3 = ocApplyResultData3.getApplySource()) != null && applySource3.intValue() == 7) {
                handler.postDelayed((Runnable) tVar.getValue(), 1000L);
            }
            t tVar5 = this.f29320x0;
            Object value5 = tVar5.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            OpenResultTaskView openResultTaskView = (OpenResultTaskView) value5;
            if (openResultTaskView != null) {
                openResultTaskView.getTaskData();
            }
            Object value6 = tVar5.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            OpenResultTaskView openResultTaskView2 = (OpenResultTaskView) value6;
            if (openResultTaskView2 != null) {
                openResultTaskView2.setMTaskAllDoneInterface(new r(this));
                return;
            }
            return;
        }
        o().clearAnimation();
        handler2.removeCallbacks(t());
        org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_OC_ACTIVE_FINISH));
        q().getRightTextView().setVisibility(8);
        q().setBackgroundColor(0);
        Object value7 = tVar4.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        LinearLayout linearLayout2 = (LinearLayout) value7;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        Object value8 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        ((LinearLayout) value8).setVisibility(0);
        Object value9 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        ((LinearLayout) value9).setVisibility(8);
        p().setImageResource(Ya.d.cs_oc_open_success_top_bg);
        p().setVisibility(0);
        Object value10 = this.f29317v0.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        TextView textView2 = (TextView) value10;
        OcApplyResultData ocApplyResultData4 = this.f29283D0;
        textView2.setText(r0.B((ocApplyResultData4 == null || (creditQuota = ocApplyResultData4.getCreditQuota()) == null) ? 0L : creditQuota.longValue(), true));
        OcApplyResultData ocApplyResultData5 = this.f29283D0;
        t tVar6 = this.f29314t0;
        if (ocApplyResultData5 == null || (applySource2 = ocApplyResultData5.getApplySource()) == null || applySource2.intValue() != 7) {
            Object value11 = tVar6.getValue();
            Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
            ((LinearLayout) value11).setVisibility(0);
            s().setTextColor(getColor(L6.b.ppColorTextPrimary));
            s().setText(getString(Ya.g.cs_oc_apply_result_default_pay_method));
            s().setVisibility(0);
        } else {
            Object value12 = tVar6.getValue();
            Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
            ((LinearLayout) value12).setVisibility(8);
            s().setVisibility(0);
            Object value13 = this.f29294M.getValue();
            Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
            ((LinearLayout) value13).setVisibility(0);
            Object value14 = this.f29287H.getValue();
            Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
            ((Button) value14).setText(getString(Ya.g.cs_oc_continue_to_pay));
            handler.postDelayed((Runnable) tVar.getValue(), 1000L);
        }
        OcApplyResultData ocApplyResultData6 = this.f29283D0;
        if (!TextUtils.isEmpty(ocApplyResultData6 != null ? ocApplyResultData6.getChangeQuotaContent() : null)) {
            O6.c cVar = new O6.c(this);
            OcApplyResultData ocApplyResultData7 = this.f29283D0;
            cVar.f6598d = ocApplyResultData7 != null ? ocApplyResultData7.getChangeQuotaContent() : null;
            cVar.d(k.core_got_it, null);
            cVar.a().show();
        }
        OcApplyResultData ocApplyResultData8 = this.f29283D0;
        t tVar7 = this.f29297Q;
        t tVar8 = this.f29298X;
        t tVar9 = this.f29299Y;
        t tVar10 = this.f29300Z;
        t tVar11 = this.f29307k0;
        t tVar12 = this.f29310p0;
        if (ocApplyResultData8 == null || (applySource = ocApplyResultData8.getApplySource()) == null || applySource.intValue() != 2) {
            Object value15 = tVar12.getValue();
            Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
            ((SingleAdView) value15).setSlotId(null);
            Object value16 = tVar11.getValue();
            Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
            ((SingleAdView) value16).setSlotId(null);
            Object value17 = tVar10.getValue();
            Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
            ((SingleAdView) value17).setSlotId(null);
            Object value18 = tVar9.getValue();
            Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
            ((SingleAdView) value18).setSlotId(null);
            Object value19 = tVar8.getValue();
            Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
            ((SingleAdView) value19).setSlotId(null);
            Object value20 = tVar7.getValue();
            Intrinsics.checkNotNullExpressionValue(value20, "getValue(...)");
            ((SingleAdView) value20).setSlotId(null);
            return;
        }
        Object value21 = tVar12.getValue();
        Intrinsics.checkNotNullExpressionValue(value21, "getValue(...)");
        ((SingleAdView) value21).setSlotId(getString(Ya.g.oc_apply_result_slot_id));
        Object value22 = tVar11.getValue();
        Intrinsics.checkNotNullExpressionValue(value22, "getValue(...)");
        ((SingleAdView) value22).setSlotId(getString(Ya.g.oc_apply_result_left_slot_id));
        Object value23 = tVar10.getValue();
        Intrinsics.checkNotNullExpressionValue(value23, "getValue(...)");
        ((SingleAdView) value23).setSlotId(getString(Ya.g.oc_apply_result_middle_slot_id));
        Object value24 = tVar9.getValue();
        Intrinsics.checkNotNullExpressionValue(value24, "getValue(...)");
        ((SingleAdView) value24).setSlotId(getString(Ya.g.oc_apply_result_right_slot_id));
        Object value25 = tVar8.getValue();
        Intrinsics.checkNotNullExpressionValue(value25, "getValue(...)");
        ((SingleAdView) value25).setSlotId(getString(Ya.g.oc_apply_result_bottom_slot_id));
        Object value26 = tVar7.getValue();
        Intrinsics.checkNotNullExpressionValue(value26, "getValue(...)");
        ((SingleAdView) value26).setSlotId(getString(Ya.g.oc_apply_result_bottom_two_slot_id));
    }
}
