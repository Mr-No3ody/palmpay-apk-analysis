package com.transsnet.palmpay.managemoney.ui.activity;

import Oc.C0500c;
import Pa.AbstractC0511h;
import Pa.C0510g;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Qc.C0560a;
import Qc.C0561b;
import Qc.C0562c;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.bean.CouponRecord;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxCampaignViewModel;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/cash_box_campaign_activity")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/CashBoxCampaignMainActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxCampaignViewModel;", "Landroid/animation/Animator$AnimatorListener;", "<init>", "()V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxCampaignMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxCampaignMainActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/CashBoxCampaignMainActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,387:1\n171#2,12:388\n215#2:400\n171#2,12:401\n215#2:413\n171#2,12:414\n215#2:426\n562#3,10:427\n*S KotlinDebug\n*F\n+ 1 CashBoxCampaignMainActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/CashBoxCampaignMainActivity\n*L\n155#1:388,12\n155#1:400\n177#1:401,12\n177#1:413\n190#1:414,12\n190#1:426\n248#1:427,10\n*E\n"})
public final class CashBoxCampaignMainActivity extends BaseMvvmActivity<CashBoxCampaignViewModel> implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ int f32019X = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f32020A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f32021B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p355xf.t f32022C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p355xf.t f32023H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p355xf.t f32024L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public CouponRecord f32025M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public AnimatorSet f32026Q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f32027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f32028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f32029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f32030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f32031g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p355xf.t f32032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32033j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32035p;
    public final p355xf.t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f32036v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f32037w;

    public CashBoxCampaignMainActivity() {
        final int i7 = 8;
        this.f32027c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i7) {
                    case 0:
                        int i10 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i11 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i12 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i13 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i14 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i15 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i16 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i17 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i18 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i19 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i20 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i21 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i22 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i23 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i10 = 16;
        this.f32028d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i10) {
                    case 0:
                        int i11 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i12 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i13 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i14 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i15 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i16 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i17 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i18 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i19 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i20 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i21 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i22 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i23 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i11 = 0;
        this.f32029e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i11) {
                    case 0:
                        int i12 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i13 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i14 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i15 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i16 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i17 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i18 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i19 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i20 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i21 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i22 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i23 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i12 = 1;
        this.f32030f = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i12) {
                    case 0:
                        int i13 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i14 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i15 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i16 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i17 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i18 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i19 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i112 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i20 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i21 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i22 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i23 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i13 = 2;
        this.f32031g = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i13) {
                    case 0:
                        int i14 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i15 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i16 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i17 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i18 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i19 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i112 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i113 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i20 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i21 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i22 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i23 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i14 = 3;
        this.f32032i = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i14) {
                    case 0:
                        int i15 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i16 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i17 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i18 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i19 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i112 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i113 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i114 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i20 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i21 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i22 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i23 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i15 = 4;
        this.f32033j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i15) {
                    case 0:
                        int i16 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i17 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i18 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i19 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i112 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i113 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i114 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i115 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i20 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i21 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i22 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i23 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i16 = 5;
        this.f32034o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i16) {
                    case 0:
                        int i17 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i18 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i19 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i112 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i113 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i114 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i115 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i116 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i20 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i21 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i22 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i23 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i17 = 6;
        this.f32035p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i17) {
                    case 0:
                        int i18 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i19 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i112 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i113 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i114 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i115 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i116 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i117 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i20 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i21 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i22 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i23 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i18 = 7;
        this.t = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i18) {
                    case 0:
                        int i19 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i112 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i113 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i114 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i115 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i116 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i117 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i118 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i20 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i21 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i22 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i23 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i19 = 9;
        this.f32036v = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i19) {
                    case 0:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i112 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i113 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i114 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i115 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i116 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i117 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i118 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i119 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i20 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i21 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i22 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i23 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i20 = 10;
        this.f32037w = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i20) {
                    case 0:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i112 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i113 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i114 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i115 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i116 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i117 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i118 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i119 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i21 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i22 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i23 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i27 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i21 = 11;
        this.f32020A = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i21) {
                    case 0:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i112 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i113 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i114 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i115 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i116 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i117 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i118 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i119 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i22 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i23 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i27 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i28 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i22 = 12;
        this.f32021B = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i22) {
                    case 0:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i112 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i113 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i114 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i115 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i116 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i117 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i118 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i119 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i23 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i27 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i28 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i29 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i23 = 13;
        this.f32022C = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i23) {
                    case 0:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i112 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i113 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i114 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i115 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i116 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i117 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i118 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i119 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i24 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i27 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i28 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i29 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i210 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i24 = 14;
        this.f32023H = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i24) {
                    case 0:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i112 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i113 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i114 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i115 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i116 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i117 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i118 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i119 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i25 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i27 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i28 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i29 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i210 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i211 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
        final int i25 = 15;
        this.f32024L = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32226b;

            {
                this.f32226b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32226b;
                switch (i25) {
                    case 0:
                        int i110 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvProtocol);
                    case 1:
                        int i111 = CashBoxCampaignMainActivity.f32019X;
                        return (CheckBox) cashBoxCampaignMainActivity.findViewById(Jc.c.ckProtocol);
                    case 2:
                        int i112 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivWinLotteryPrize);
                    case 3:
                        int i113 = CashBoxCampaignMainActivity.f32019X;
                        return (TextView) cashBoxCampaignMainActivity.findViewById(Jc.c.tvCouponAmount);
                    case 4:
                        int i114 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupOldUser);
                    case 5:
                        int i115 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowAnimView);
                    case 6:
                        int i116 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCampaignDice);
                    case 7:
                        int i117 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivOldCashboxUsersText);
                    case 8:
                        int i118 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupWinLotteryPrize);
                    case 9:
                        int i119 = CashBoxCampaignMainActivity.f32019X;
                        return (Group) cashBoxCampaignMainActivity.findViewById(Jc.c.groupNewUserNoLotter);
                    case 10:
                        int i26 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.openNowAnimView);
                    case 11:
                        int i27 = CashBoxCampaignMainActivity.f32019X;
                        return (LottieAnimationView) cashBoxCampaignMainActivity.findViewById(Jc.c.openBoxAnimView);
                    case 12:
                        int i28 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivCampaignDiceBg);
                    case 13:
                        int i29 = CashBoxCampaignMainActivity.f32019X;
                        return (ImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivNewUserCampaignTop);
                    case 14:
                        int i210 = CashBoxCampaignMainActivity.f32019X;
                        return (PpTitleBar) cashBoxCampaignMainActivity.findViewById(Jc.c.ctb);
                    case 15:
                        int i211 = CashBoxCampaignMainActivity.f32019X;
                        return (AppCompatImageView) cashBoxCampaignMainActivity.findViewById(Jc.c.ivDivergenceBg);
                    default:
                        int i212 = CashBoxCampaignMainActivity.f32019X;
                        return (ConstraintLayout) cashBoxCampaignMainActivity.findViewById(Jc.c.saveNowForFreeAnimView);
                }
            }
        });
    }

    public static final void m(CashBoxCampaignMainActivity cashBoxCampaignMainActivity, boolean z3) {
        Object value = cashBoxCampaignMainActivity.f32036v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((Group) value).setVisibility(z3 ? 0 : 8);
        if (!z3) {
            cashBoxCampaignMainActivity.p().a();
            cashBoxCampaignMainActivity.p().setProgress(0.0f);
            cashBoxCampaignMainActivity.r();
            return;
        }
        try {
            int i7 = Jc.e.mm_open_box;
            com.airbnb.lottie.p.f(cashBoxCampaignMainActivity, i7, com.airbnb.lottie.p.m(i7, cashBoxCampaignMainActivity)).b(new C1555a(cashBoxCampaignMainActivity, 0));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        Object value2 = cashBoxCampaignMainActivity.f32037w.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        cashBoxCampaignMainActivity.q((ConstraintLayout) value2);
    }

    public static final void n(CashBoxCampaignMainActivity cashBoxCampaignMainActivity, CouponRecord couponRecord) {
        Object value = cashBoxCampaignMainActivity.f32027c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((Group) value).setVisibility(0);
        Object value2 = cashBoxCampaignMainActivity.f32032i.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).setText(r0.F(couponRecord != null ? couponRecord.getNominalValue() : 0L));
        C0510g c0510g = AbstractC0511h.f7089a;
        p355xf.t tVar = cashBoxCampaignMainActivity.f32029e;
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        c0510g.richText((TextView) value3, ((TextView) value4).getText().toString(), "Terms and Conditions for CashBox", new C0500c(cashBoxCampaignMainActivity, 9));
        Object value5 = cashBoxCampaignMainActivity.f32031g.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        r0.h1((ImageView) value5, r0.y0("/mm_icon_win_lottery_prize.png"), Jc.b.mm_icon_win_lottery_prize);
        Object value6 = cashBoxCampaignMainActivity.f32028d.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        cashBoxCampaignMainActivity.q((ConstraintLayout) value6);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_cash_box_campaign_main_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        com.transsnet.palmpay.core.base.l lVar = ((CashBoxCampaignViewModel) l()).f32722e;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new C1558d(this, this, 0), 8));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((CashBoxCampaignViewModel) l()).f32723f;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new C1558d(this, this, 1), 8));
        }
        com.transsnet.palmpay.core.base.l lVar3 = ((CashBoxCampaignViewModel) l()).f32724g;
        if (lVar3 != null) {
            lVar3.e(this, new Wd.I(new C1558d(this, this, 2), 8));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(true);
        BarUtils.setStatusBarLightMode((Activity) this, false);
    }

    public final PpTitleBar o() {
        Object value = this.f32023H.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpTitleBar) value;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        if (!i0.X(this)) {
            r();
            return;
        }
        AnimatorSet animatorSet = this.f32026Q;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        LottieAnimationView lottieAnimationViewP = p();
        if (lottieAnimationViewP != null) {
            lottieAnimationViewP.a();
        }
        r();
    }

    public final LottieAnimationView p() {
        Object value = this.f32020A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LottieAnimationView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        CashBoxCampaignViewModel cashBoxCampaignViewModel = (CashBoxCampaignViewModel) l();
        cashBoxCampaignViewModel.getClass();
        p140j8.f.s(cashBoxCampaignViewModel, new C0561b(1, null), cashBoxCampaignViewModel.f32722e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new androidx.core.provider.m(12, uIHandler, this));
    }

    public final void q(ConstraintLayout constraintLayout) {
        AnimatorSet.Builder builderWith;
        AnimatorSet.Builder builderWith2;
        try {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.SCALE_X, 1.0f, 0.9f, 0.8f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.SCALE_Y, 1.0f, 0.9f, 0.8f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(constraintLayout, "pivotX", ScreenUtils.getScreenWidth() * 0.5f);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(constraintLayout, "pivotY", constraintLayout.getHeight() * 0.5f);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f32026Q = animatorSet;
            AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat2);
            if (builderPlay != null && (builderWith = builderPlay.with(objectAnimatorOfFloat)) != null && (builderWith2 = builderWith.with(objectAnimatorOfFloat3)) != null) {
                builderWith2.with(objectAnimatorOfFloat4);
            }
            AnimatorSet animatorSet2 = this.f32026Q;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(500L);
            }
            AnimatorSet animatorSet3 = this.f32026Q;
            if (animatorSet3 != null) {
                animatorSet3.setInterpolator(new AccelerateDecelerateInterpolator());
            }
            AnimatorSet animatorSet4 = this.f32026Q;
            if (animatorSet4 != null) {
                animatorSet4.addListener(this);
            }
            AnimatorSet animatorSet5 = this.f32026Q;
            if (animatorSet5 != null) {
                animatorSet5.setStartDelay(1000L);
            }
            AnimatorSet animatorSet6 = this.f32026Q;
            if (animatorSet6 != null) {
                animatorSet6.start();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void r() {
        AnimatorSet animatorSet = this.f32026Q;
        if (animatorSet != null) {
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
            }
            AnimatorSet animatorSet2 = this.f32026Q;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.f32026Q = null;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        requestLayoutFullScreen();
        PpTitleBar ppTitleBarO = o();
        ViewGroup.LayoutParams layoutParams = o().getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = BarUtils.getStatusBarHeight();
        ppTitleBarO.setLayoutParams(layoutParams2);
        o().c(S6.a.pay_ArrowLeft, CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
        TextView rightTextView = o().getRightTextView();
        if (rightTextView != null) {
            rightTextView.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextBase, this));
        }
        o().setRightTextViewClickListener(new ViewOnClickListenerC1478l(9));
        Object value = this.f32037w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i7 = 0;
        ((ConstraintLayout) value).setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32228b;

            {
                this.f32228b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32228b;
                switch (i7) {
                    case 0:
                        int i10 = CashBoxCampaignMainActivity.f32019X;
                        n0.g().l("CashBoxActivity_OpenNow_Click");
                        CashBoxCampaignViewModel cashBoxCampaignViewModel = (CashBoxCampaignViewModel) cashBoxCampaignMainActivity.l();
                        cashBoxCampaignViewModel.getClass();
                        p140j8.f.s(cashBoxCampaignViewModel, new C0562c(1, null), cashBoxCampaignViewModel.f32723f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        break;
                    case 1:
                        int i11 = CashBoxCampaignMainActivity.f32019X;
                        ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 1).withBoolean("from_activity", true).navigation();
                        cashBoxCampaignMainActivity.finish();
                        break;
                    default:
                        int i12 = CashBoxCampaignMainActivity.f32019X;
                        n0.g().l("CashBoxActivity_UseNow_Click");
                        Object value2 = cashBoxCampaignMainActivity.f32030f.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        if (!((CheckBox) value2).isChecked()) {
                            p220oa.h.x(cashBoxCampaignMainActivity, cashBoxCampaignMainActivity.getString(Jc.f.mm_read_cconsent_agreement));
                        } else {
                            CashBoxCampaignViewModel cashBoxCampaignViewModel2 = (CashBoxCampaignViewModel) cashBoxCampaignMainActivity.l();
                            CouponRecord couponRecord = cashBoxCampaignMainActivity.f32025M;
                            String couponId = couponRecord != null ? couponRecord.getCouponId() : null;
                            cashBoxCampaignViewModel2.getClass();
                            p140j8.f.s(cashBoxCampaignViewModel2, new C0560a(couponId, cashBoxCampaignViewModel2, null), cashBoxCampaignViewModel2.f32724g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                        break;
                }
            }
        });
        Object value2 = this.f32034o.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i10 = 1;
        ((ConstraintLayout) value2).setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32228b;

            {
                this.f32228b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32228b;
                switch (i10) {
                    case 0:
                        int i11 = CashBoxCampaignMainActivity.f32019X;
                        n0.g().l("CashBoxActivity_OpenNow_Click");
                        CashBoxCampaignViewModel cashBoxCampaignViewModel = (CashBoxCampaignViewModel) cashBoxCampaignMainActivity.l();
                        cashBoxCampaignViewModel.getClass();
                        p140j8.f.s(cashBoxCampaignViewModel, new C0562c(1, null), cashBoxCampaignViewModel.f32723f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        break;
                    case 1:
                        int i12 = CashBoxCampaignMainActivity.f32019X;
                        ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 1).withBoolean("from_activity", true).navigation();
                        cashBoxCampaignMainActivity.finish();
                        break;
                    default:
                        int i13 = CashBoxCampaignMainActivity.f32019X;
                        n0.g().l("CashBoxActivity_UseNow_Click");
                        Object value3 = cashBoxCampaignMainActivity.f32030f.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        if (!((CheckBox) value3).isChecked()) {
                            p220oa.h.x(cashBoxCampaignMainActivity, cashBoxCampaignMainActivity.getString(Jc.f.mm_read_cconsent_agreement));
                        } else {
                            CashBoxCampaignViewModel cashBoxCampaignViewModel2 = (CashBoxCampaignViewModel) cashBoxCampaignMainActivity.l();
                            CouponRecord couponRecord = cashBoxCampaignMainActivity.f32025M;
                            String couponId = couponRecord != null ? couponRecord.getCouponId() : null;
                            cashBoxCampaignViewModel2.getClass();
                            p140j8.f.s(cashBoxCampaignViewModel2, new C0560a(couponId, cashBoxCampaignViewModel2, null), cashBoxCampaignViewModel2.f32724g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                        break;
                }
            }
        });
        Object value3 = this.f32028d.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        final int i11 = 2;
        ((ConstraintLayout) value3).setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxCampaignMainActivity f32228b;

            {
                this.f32228b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashBoxCampaignMainActivity cashBoxCampaignMainActivity = this.f32228b;
                switch (i11) {
                    case 0:
                        int i12 = CashBoxCampaignMainActivity.f32019X;
                        n0.g().l("CashBoxActivity_OpenNow_Click");
                        CashBoxCampaignViewModel cashBoxCampaignViewModel = (CashBoxCampaignViewModel) cashBoxCampaignMainActivity.l();
                        cashBoxCampaignViewModel.getClass();
                        p140j8.f.s(cashBoxCampaignViewModel, new C0562c(1, null), cashBoxCampaignViewModel.f32723f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        break;
                    case 1:
                        int i13 = CashBoxCampaignMainActivity.f32019X;
                        ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 1).withBoolean("from_activity", true).navigation();
                        cashBoxCampaignMainActivity.finish();
                        break;
                    default:
                        int i14 = CashBoxCampaignMainActivity.f32019X;
                        n0.g().l("CashBoxActivity_UseNow_Click");
                        Object value4 = cashBoxCampaignMainActivity.f32030f.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        if (!((CheckBox) value4).isChecked()) {
                            p220oa.h.x(cashBoxCampaignMainActivity, cashBoxCampaignMainActivity.getString(Jc.f.mm_read_cconsent_agreement));
                        } else {
                            CashBoxCampaignViewModel cashBoxCampaignViewModel2 = (CashBoxCampaignViewModel) cashBoxCampaignMainActivity.l();
                            CouponRecord couponRecord = cashBoxCampaignMainActivity.f32025M;
                            String couponId = couponRecord != null ? couponRecord.getCouponId() : null;
                            cashBoxCampaignViewModel2.getClass();
                            p140j8.f.s(cashBoxCampaignViewModel2, new C0560a(couponId, cashBoxCampaignViewModel2, null), cashBoxCampaignViewModel2.f32724g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                        break;
                }
            }
        });
        Object value4 = this.f32035p.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        r0.h1((ImageView) value4, r0.y0("mm_bg_old_campaign_dice.webp"), Jc.b.mm_bg_old_campaign_dice);
        Object value5 = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        r0.h1((ImageView) value5, r0.y0("mm_icon_old_cashbox_users_text.png"), Jc.b.mm_icon_old_cashbox_users_text);
        Object value6 = this.f32022C.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        r0.h1((ImageView) value6, r0.y0("mm_icon_campaign_top.png"), Jc.b.mm_icon_campaign_top);
        Object value7 = this.f32021B.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        r0.h1((ImageView) value7, r0.y0("mm_bg_campaign_dice.png"), Jc.b.mm_bg_campaign_dice);
    }
}
