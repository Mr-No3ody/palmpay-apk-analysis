package com.transsnet.palmpay.jara_packet.ui.activity;

import Pa.n0;
import Pa.r0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import com.airbnb.lottie.LottieAnimationView;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnHomeResp;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnRewardDialogActivity;
import com.transsnet.palmpay.jara_packet.ui.viewmodel.ReferEarnViewModel;
import df.i;
import io.reactivex.internal.operators.observable.A;
import io.reactivex.internal.operators.observable.C1760l;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.D;
import org.jetbrains.annotations.NotNull;
import p045d3.k;
import p141j9.C1794b;
import p220oa.h;
import p236pc.c;
import p236pc.d;
import p236pc.e;
import p285sc.x;
import p298tf.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/activity/ReferEarnRewardDialogActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/jara_packet/ui/viewmodel/ReferEarnViewModel;", "<init>", "()V", "a", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnRewardDialogActivity extends BaseMvvmActivity<ReferEarnViewModel> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final a f31932q0 = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f31933A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f31934B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f31935C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f31936H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f31937L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f31938M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f31939Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f31940X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f31941Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f31942Z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f31945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f31946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f31947g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f31948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f31949j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f31950k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f31951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f31952p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ReferEarnHomeResp f31953p0;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f31954v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f31955w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startActivity(@NotNull Activity context, @NotNull ReferEarnHomeResp data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Intent intent = new Intent(context, (Class<?>) ReferEarnRewardDialogActivity.class);
            intent.putExtra("KEY_REFER_EARN_HOME", data);
            context.startActivity(intent);
            context.overridePendingTransition(0, 0);
        }

        private a() {
        }
    }

    public ReferEarnRewardDialogActivity() {
        final int i7 = 0;
        this.f31943c = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i7) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i10 = 2;
        this.f31944d = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i10) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i11 = 6;
        this.f31945e = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i11) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i12 = 7;
        this.f31946f = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i12) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i13 = 8;
        this.f31947g = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i13) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i14 = 9;
        this.f31948i = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i14) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i15 = 10;
        this.f31949j = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i15) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i16 = 12;
        this.f31951o = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i16) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i17 = 13;
        this.f31952p = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i17) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i18 = 14;
        this.t = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i18) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i19 = 11;
        this.f31954v = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i19) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i20 = 15;
        this.f31955w = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i20) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i21 = 16;
        this.f31933A = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i21) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i22 = 17;
        this.f31934B = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i22) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i23 = 18;
        this.f31935C = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i23) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i24 = 19;
        this.f31936H = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i24) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i25 = 20;
        this.f31937L = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i25) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i26 = 21;
        this.f31938M = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i26) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i27 = 22;
        this.f31939Q = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i27) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i28 = 1;
        this.f31940X = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i28) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i29 = 3;
        this.f31941Y = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i29) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i30 = 4;
        this.f31942Z = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i30) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
        final int i31 = 5;
        this.f31950k0 = C2131j.b(new Function0(this) { // from class: sc.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRewardDialogActivity f42202b;

            {
                this.f42202b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRewardDialogActivity referEarnRewardDialogActivity = this.f42202b;
                switch (i31) {
                    case 0:
                        ReferEarnRewardDialogActivity.a aVar = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_received);
                    case 1:
                        ReferEarnRewardDialogActivity.a aVar2 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_earn);
                    case 2:
                        ReferEarnRewardDialogActivity.a aVar3 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three_img);
                    case 3:
                        ReferEarnRewardDialogActivity.a aVar4 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_title);
                    case 4:
                        ReferEarnRewardDialogActivity.a aVar5 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick);
                    case 5:
                        ReferEarnRewardDialogActivity.a aVar6 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LottieAnimationView) referEarnRewardDialogActivity.findViewById(d.jarrd_lottie);
                    case 6:
                        ReferEarnRewardDialogActivity.a aVar7 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_case_three);
                    case 7:
                        ReferEarnRewardDialogActivity.a aVar8 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ImageView) referEarnRewardDialogActivity.findViewById(d.ivClose);
                    case 8:
                        ReferEarnRewardDialogActivity.a aVar9 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_auto_close);
                    case 9:
                        ReferEarnRewardDialogActivity.a aVar10 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_action_btn);
                    case 10:
                        ReferEarnRewardDialogActivity.a aVar11 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_invite_claim_layout);
                    case 11:
                        ReferEarnRewardDialogActivity.a aVar12 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_two);
                    case 12:
                        ReferEarnRewardDialogActivity.a aVar13 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_3);
                    case 13:
                        ReferEarnRewardDialogActivity.a aVar14 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_2);
                    case 14:
                        ReferEarnRewardDialogActivity.a aVar15 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_two_1);
                    case 15:
                        ReferEarnRewardDialogActivity.a aVar16 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_3);
                    case 16:
                        ReferEarnRewardDialogActivity.a aVar17 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_2);
                    case 17:
                        ReferEarnRewardDialogActivity.a aVar18 = ReferEarnRewardDialogActivity.f31932q0;
                        return (TextView) referEarnRewardDialogActivity.findViewById(d.jarrd_reward_cases_one_1);
                    case 18:
                        ReferEarnRewardDialogActivity.a aVar19 = ReferEarnRewardDialogActivity.f31932q0;
                        return (ConstraintLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_cases_reward_one);
                    case 19:
                        ReferEarnRewardDialogActivity.a aVar20 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_3);
                    case 20:
                        ReferEarnRewardDialogActivity.a aVar21 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_2);
                    case 21:
                        ReferEarnRewardDialogActivity.a aVar22 = ReferEarnRewardDialogActivity.f31932q0;
                        return (RelativeLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_1);
                    default:
                        ReferEarnRewardDialogActivity.a aVar23 = ReferEarnRewardDialogActivity.f31932q0;
                        return (LinearLayout) referEarnRewardDialogActivity.findViewById(d.jarrd_pick_layout);
                }
            }
        });
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.jp_activity_referearn_reward_dialog;
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

    public final TextView m() {
        Object value = this.f31940X.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final LottieAnimationView n() {
        Object value = this.f31950k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LottieAnimationView) value;
    }

    public final ImageView o() {
        Object value = this.f31941Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final void p() {
        h.s(o(), false);
        Object value = this.f31939Q.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        h.s((LinearLayout) value, false);
        h.s(m(), false);
        Object value2 = this.f31946f.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        h.s((ImageView) value2, false);
        n().postDelayed(new b(this, 25), 500L);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        int i7 = 2;
        int i10 = 1;
        ReferEarnHomeResp referEarnHomeResp = (ReferEarnHomeResp) getIntent().getSerializableExtra("KEY_REFER_EARN_HOME");
        this.f31953p0 = referEarnHomeResp;
        t tVar = this.f31945e;
        if (referEarnHomeResp != null) {
            if (referEarnHomeResp.isDialog1Type()) {
                n0.g().m("event_track_dialog_screen", "Popwindow_Earn300", "");
                h.s(m(), true);
                m().setText("Earn " + BaseApplication.getCurrencySymbol() + r0.E(referEarnHomeResp.msg));
                r0.h1(o(), r0.y0("jp_pickcard_title.webp"), c.jp_pickcard_title);
            } else if (referEarnHomeResp.isDialog2Type()) {
                m().setVisibility(4);
                n0.g().m("event_track_dialog_screen", "Popwindow_cash", "");
                r0.h1(o(), r0.y0("jp_pickcard_title_2.webp"), c.jp_pickcard_title_2);
            } else if (referEarnHomeResp.isDialog3Type()) {
                n0.g().m("event_track_dialog_screen", "Popwindow_cash_still", "");
                h.s(n(), false);
                Object value = this.f31942Z.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                h.s((LinearLayout) value, false);
                Object value2 = this.f31944d.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                r0.l1("https://d1me2081qmgmx2.cloudfront.net/palmpay_app_icon/jp_pick_three_case.webp", (ImageView) value2);
                Object value3 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                h.s((RelativeLayout) value3, true);
                Object value4 = this.f31943c.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                ((TextView) value4).setText(BaseApplication.getCurrencySymbol() + r0.E(referEarnHomeResp.msg) + " Cash");
            }
        }
        x xVar = new x(this, i7);
        Object value5 = this.f31938M.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        Object value6 = this.f31937L.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        Object value7 = this.f31936H.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        Object value8 = this.f31946f.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        Object value9 = this.f31948i.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        Object value10 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        h.q(xVar, (RelativeLayout) value5, (RelativeLayout) value6, (RelativeLayout) value7, (ImageView) value8, (TextView) value9, (RelativeLayout) value10);
        n().f19579e.f20305b.addListener(new p179m1.b(this, i10));
    }

    public final void q() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        i iVar = f.f42628a;
        p147jf.a.a(timeUnit, "unit is null");
        p147jf.a.a(iVar, "scheduler is null");
        new C1760l(new A(5L, Math.max(0L, 0L), Math.max(0L, 1L), iVar), new C1794b(new D(24), 29), 2).k(f.f42629b).i(p071ef.b.a()).subscribe(new k(this, 26));
    }
}
