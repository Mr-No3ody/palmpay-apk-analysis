package com.transsnet.palmpay.managemoney.ui.fragment;

import C9.C0158z;
import Qc.C0568i;
import Qc.C0575p;
import Qc.C0576q;
import Qc.C0577s;
import Wf.AbstractC0780y;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseLazyMvvmFragment;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.rsp.GetAutoTransferConfigResp;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.custom_view.EmptyView;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.bean.req.QueryCashBoxStatReq;
import com.transsnet.palmpay.managemoney.bean.resp.GetBeforeOrderResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxAccountInfoResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetInterestRateConfigResp;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxMainActivity;
import com.transsnet.palmpay.managemoney.ui.dialog.MoreFunctionDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.NewerTipDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.TurnOnAutoSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WithdrawInterceptDialogFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/CashBoxMainFragment;", "Lcom/transsnet/palmpay/core/base/BaseLazyMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxMainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxMainFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/CashBoxMainFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,1018:1\n1#2:1019\n115#3,8:1020\n145#3:1028\n115#3,8:1029\n145#3:1037\n115#3,8:1038\n145#3:1046\n115#3,8:1047\n145#3:1055\n383#3:1056\n401#3:1057\n115#3,8:1058\n145#3:1066\n260#3,10:1067\n296#3:1077\n115#3,8:1078\n145#3:1086\n171#3,12:1087\n215#3:1099\n*S KotlinDebug\n*F\n+ 1 CashBoxMainFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/CashBoxMainFragment\n*L\n486#1:1020,8\n486#1:1028\n559#1:1029,8\n559#1:1037\n620#1:1038,8\n620#1:1046\n629#1:1047,8\n629#1:1055\n633#1:1056\n633#1:1057\n653#1:1058,8\n653#1:1066\n658#1:1067,10\n658#1:1077\n690#1:1078,8\n690#1:1086\n697#1:1087,12\n697#1:1099\n*E\n"})
public final class CashBoxMainFragment extends BaseLazyMvvmFragment<CashBoxViewModel> {

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final a f32383V0 = new a(null);

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final p355xf.t f32385A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f32386B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final p355xf.t f32387B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p355xf.t f32388C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final p355xf.t f32389C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final p355xf.t f32390D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final p355xf.t f32391E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final p355xf.t f32392F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final p355xf.t f32393G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p355xf.t f32394H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final p355xf.t f32395H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final p355xf.t f32396I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final p355xf.t f32397J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final p355xf.t f32398K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p355xf.t f32399L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final p355xf.t f32400L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final p355xf.t f32401M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f32402M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public int f32403N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public boolean f32404O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public GetBeforeOrderResp.StateInfo f32405P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final p355xf.t f32406Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public GetCashBoxAccountInfoResp.CashBoxAccountInfo f32407Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final Nc.e f32408R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public GetAutoTransferConfigResp f32409S0;
    public long T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public int f32410U0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final p355xf.t f32411X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final p355xf.t f32412Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final p355xf.t f32413Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final p355xf.t f32414k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final p355xf.t f32415p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final p355xf.t f32416q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final p355xf.t f32417r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final p355xf.t f32418s0;
    public final p355xf.t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final p355xf.t f32419t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final p355xf.t f32420u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final p355xf.t f32422v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final p355xf.t f32424w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final p355xf.t f32425x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final p355xf.t f32426y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final p355xf.t f32427z0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f32421v = C2131j.b(new C1592n(this, 5));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f32423w = C2131j.b(new C1592n(this, 17));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f32384A = C2131j.b(new C1592n(this, 27));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CashBoxMainFragment newInstance() {
            return new CashBoxMainFragment();
        }

        private a() {
        }
    }

    public CashBoxMainFragment() {
        final int i7 = 2;
        this.t = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxMainFragment f32648b;

            {
                this.f32648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxMainFragment cashBoxMainFragment = this.f32648b;
                switch (i7) {
                    case 0:
                        CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                        View view = cashBoxMainFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvMiddleAdContent);
                        }
                        return null;
                    case 1:
                        CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                        View view2 = cashBoxMainFragment.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Jc.c.iv_middlePicUrl);
                        }
                        return null;
                    case 2:
                        CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                        View view3 = cashBoxMainFragment.f27318b;
                        if (view3 != null) {
                            return (EmptyView) view3.findViewById(Jc.c.emptyView);
                        }
                        return null;
                    case 3:
                        CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                        View view4 = cashBoxMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvMiddleAdTitle);
                        }
                        return null;
                    case 4:
                        CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                        View view5 = cashBoxMainFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutSad);
                        }
                        return null;
                    case 5:
                        CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                        View view6 = cashBoxMainFragment.f27318b;
                        if (view6 != null) {
                            return (BannerAdView) view6.findViewById(Jc.c.viewAd);
                        }
                        return null;
                    case 6:
                        CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                        View view7 = cashBoxMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Jc.c.tvExperienceGoldUnclaimed);
                        }
                        return null;
                    case 7:
                        CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                        View view8 = cashBoxMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvExperienceGoldBalance);
                        }
                        return null;
                    case 8:
                        CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                        View view9 = cashBoxMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(Jc.c.clTrialCash);
                        }
                        return null;
                    case 9:
                        CashBoxMainFragment.a aVar10 = CashBoxMainFragment.f32383V0;
                        View view10 = cashBoxMainFragment.f27318b;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(Jc.c.iv_trial_cash_bg);
                        }
                        return null;
                    default:
                        CashBoxMainFragment.a aVar11 = CashBoxMainFragment.f32383V0;
                        View view11 = cashBoxMainFragment.f27318b;
                        if (view11 != null) {
                            return (LinearLayout) view11.findViewById(Jc.c.trialCashModule);
                        }
                        return null;
                }
            }
        });
        C2131j.b(new C1592n(this, 28));
        this.f32386B = C2131j.b(new C1592n(this, 29));
        final int i10 = 0;
        this.f32388C = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxMainFragment f32648b;

            {
                this.f32648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxMainFragment cashBoxMainFragment = this.f32648b;
                switch (i10) {
                    case 0:
                        CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                        View view = cashBoxMainFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvMiddleAdContent);
                        }
                        return null;
                    case 1:
                        CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                        View view2 = cashBoxMainFragment.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Jc.c.iv_middlePicUrl);
                        }
                        return null;
                    case 2:
                        CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                        View view3 = cashBoxMainFragment.f27318b;
                        if (view3 != null) {
                            return (EmptyView) view3.findViewById(Jc.c.emptyView);
                        }
                        return null;
                    case 3:
                        CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                        View view4 = cashBoxMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvMiddleAdTitle);
                        }
                        return null;
                    case 4:
                        CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                        View view5 = cashBoxMainFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutSad);
                        }
                        return null;
                    case 5:
                        CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                        View view6 = cashBoxMainFragment.f27318b;
                        if (view6 != null) {
                            return (BannerAdView) view6.findViewById(Jc.c.viewAd);
                        }
                        return null;
                    case 6:
                        CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                        View view7 = cashBoxMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Jc.c.tvExperienceGoldUnclaimed);
                        }
                        return null;
                    case 7:
                        CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                        View view8 = cashBoxMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvExperienceGoldBalance);
                        }
                        return null;
                    case 8:
                        CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                        View view9 = cashBoxMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(Jc.c.clTrialCash);
                        }
                        return null;
                    case 9:
                        CashBoxMainFragment.a aVar10 = CashBoxMainFragment.f32383V0;
                        View view10 = cashBoxMainFragment.f27318b;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(Jc.c.iv_trial_cash_bg);
                        }
                        return null;
                    default:
                        CashBoxMainFragment.a aVar11 = CashBoxMainFragment.f32383V0;
                        View view11 = cashBoxMainFragment.f27318b;
                        if (view11 != null) {
                            return (LinearLayout) view11.findViewById(Jc.c.trialCashModule);
                        }
                        return null;
                }
            }
        });
        final int i11 = 1;
        this.f32394H = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxMainFragment f32648b;

            {
                this.f32648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxMainFragment cashBoxMainFragment = this.f32648b;
                switch (i11) {
                    case 0:
                        CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                        View view = cashBoxMainFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvMiddleAdContent);
                        }
                        return null;
                    case 1:
                        CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                        View view2 = cashBoxMainFragment.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Jc.c.iv_middlePicUrl);
                        }
                        return null;
                    case 2:
                        CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                        View view3 = cashBoxMainFragment.f27318b;
                        if (view3 != null) {
                            return (EmptyView) view3.findViewById(Jc.c.emptyView);
                        }
                        return null;
                    case 3:
                        CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                        View view4 = cashBoxMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvMiddleAdTitle);
                        }
                        return null;
                    case 4:
                        CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                        View view5 = cashBoxMainFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutSad);
                        }
                        return null;
                    case 5:
                        CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                        View view6 = cashBoxMainFragment.f27318b;
                        if (view6 != null) {
                            return (BannerAdView) view6.findViewById(Jc.c.viewAd);
                        }
                        return null;
                    case 6:
                        CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                        View view7 = cashBoxMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Jc.c.tvExperienceGoldUnclaimed);
                        }
                        return null;
                    case 7:
                        CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                        View view8 = cashBoxMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvExperienceGoldBalance);
                        }
                        return null;
                    case 8:
                        CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                        View view9 = cashBoxMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(Jc.c.clTrialCash);
                        }
                        return null;
                    case 9:
                        CashBoxMainFragment.a aVar10 = CashBoxMainFragment.f32383V0;
                        View view10 = cashBoxMainFragment.f27318b;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(Jc.c.iv_trial_cash_bg);
                        }
                        return null;
                    default:
                        CashBoxMainFragment.a aVar11 = CashBoxMainFragment.f32383V0;
                        View view11 = cashBoxMainFragment.f27318b;
                        if (view11 != null) {
                            return (LinearLayout) view11.findViewById(Jc.c.trialCashModule);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.f32399L = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxMainFragment f32648b;

            {
                this.f32648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxMainFragment cashBoxMainFragment = this.f32648b;
                switch (i12) {
                    case 0:
                        CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                        View view = cashBoxMainFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvMiddleAdContent);
                        }
                        return null;
                    case 1:
                        CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                        View view2 = cashBoxMainFragment.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Jc.c.iv_middlePicUrl);
                        }
                        return null;
                    case 2:
                        CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                        View view3 = cashBoxMainFragment.f27318b;
                        if (view3 != null) {
                            return (EmptyView) view3.findViewById(Jc.c.emptyView);
                        }
                        return null;
                    case 3:
                        CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                        View view4 = cashBoxMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvMiddleAdTitle);
                        }
                        return null;
                    case 4:
                        CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                        View view5 = cashBoxMainFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutSad);
                        }
                        return null;
                    case 5:
                        CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                        View view6 = cashBoxMainFragment.f27318b;
                        if (view6 != null) {
                            return (BannerAdView) view6.findViewById(Jc.c.viewAd);
                        }
                        return null;
                    case 6:
                        CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                        View view7 = cashBoxMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Jc.c.tvExperienceGoldUnclaimed);
                        }
                        return null;
                    case 7:
                        CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                        View view8 = cashBoxMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvExperienceGoldBalance);
                        }
                        return null;
                    case 8:
                        CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                        View view9 = cashBoxMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(Jc.c.clTrialCash);
                        }
                        return null;
                    case 9:
                        CashBoxMainFragment.a aVar10 = CashBoxMainFragment.f32383V0;
                        View view10 = cashBoxMainFragment.f27318b;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(Jc.c.iv_trial_cash_bg);
                        }
                        return null;
                    default:
                        CashBoxMainFragment.a aVar11 = CashBoxMainFragment.f32383V0;
                        View view11 = cashBoxMainFragment.f27318b;
                        if (view11 != null) {
                            return (LinearLayout) view11.findViewById(Jc.c.trialCashModule);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f32401M = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxMainFragment f32648b;

            {
                this.f32648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxMainFragment cashBoxMainFragment = this.f32648b;
                switch (i13) {
                    case 0:
                        CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                        View view = cashBoxMainFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvMiddleAdContent);
                        }
                        return null;
                    case 1:
                        CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                        View view2 = cashBoxMainFragment.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Jc.c.iv_middlePicUrl);
                        }
                        return null;
                    case 2:
                        CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                        View view3 = cashBoxMainFragment.f27318b;
                        if (view3 != null) {
                            return (EmptyView) view3.findViewById(Jc.c.emptyView);
                        }
                        return null;
                    case 3:
                        CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                        View view4 = cashBoxMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvMiddleAdTitle);
                        }
                        return null;
                    case 4:
                        CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                        View view5 = cashBoxMainFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutSad);
                        }
                        return null;
                    case 5:
                        CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                        View view6 = cashBoxMainFragment.f27318b;
                        if (view6 != null) {
                            return (BannerAdView) view6.findViewById(Jc.c.viewAd);
                        }
                        return null;
                    case 6:
                        CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                        View view7 = cashBoxMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Jc.c.tvExperienceGoldUnclaimed);
                        }
                        return null;
                    case 7:
                        CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                        View view8 = cashBoxMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvExperienceGoldBalance);
                        }
                        return null;
                    case 8:
                        CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                        View view9 = cashBoxMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(Jc.c.clTrialCash);
                        }
                        return null;
                    case 9:
                        CashBoxMainFragment.a aVar10 = CashBoxMainFragment.f32383V0;
                        View view10 = cashBoxMainFragment.f27318b;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(Jc.c.iv_trial_cash_bg);
                        }
                        return null;
                    default:
                        CashBoxMainFragment.a aVar11 = CashBoxMainFragment.f32383V0;
                        View view11 = cashBoxMainFragment.f27318b;
                        if (view11 != null) {
                            return (LinearLayout) view11.findViewById(Jc.c.trialCashModule);
                        }
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.f32406Q = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxMainFragment f32648b;

            {
                this.f32648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxMainFragment cashBoxMainFragment = this.f32648b;
                switch (i14) {
                    case 0:
                        CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                        View view = cashBoxMainFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvMiddleAdContent);
                        }
                        return null;
                    case 1:
                        CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                        View view2 = cashBoxMainFragment.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Jc.c.iv_middlePicUrl);
                        }
                        return null;
                    case 2:
                        CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                        View view3 = cashBoxMainFragment.f27318b;
                        if (view3 != null) {
                            return (EmptyView) view3.findViewById(Jc.c.emptyView);
                        }
                        return null;
                    case 3:
                        CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                        View view4 = cashBoxMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvMiddleAdTitle);
                        }
                        return null;
                    case 4:
                        CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                        View view5 = cashBoxMainFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutSad);
                        }
                        return null;
                    case 5:
                        CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                        View view6 = cashBoxMainFragment.f27318b;
                        if (view6 != null) {
                            return (BannerAdView) view6.findViewById(Jc.c.viewAd);
                        }
                        return null;
                    case 6:
                        CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                        View view7 = cashBoxMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Jc.c.tvExperienceGoldUnclaimed);
                        }
                        return null;
                    case 7:
                        CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                        View view8 = cashBoxMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvExperienceGoldBalance);
                        }
                        return null;
                    case 8:
                        CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                        View view9 = cashBoxMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(Jc.c.clTrialCash);
                        }
                        return null;
                    case 9:
                        CashBoxMainFragment.a aVar10 = CashBoxMainFragment.f32383V0;
                        View view10 = cashBoxMainFragment.f27318b;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(Jc.c.iv_trial_cash_bg);
                        }
                        return null;
                    default:
                        CashBoxMainFragment.a aVar11 = CashBoxMainFragment.f32383V0;
                        View view11 = cashBoxMainFragment.f27318b;
                        if (view11 != null) {
                            return (LinearLayout) view11.findViewById(Jc.c.trialCashModule);
                        }
                        return null;
                }
            }
        });
        final int i15 = 6;
        this.f32411X = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxMainFragment f32648b;

            {
                this.f32648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxMainFragment cashBoxMainFragment = this.f32648b;
                switch (i15) {
                    case 0:
                        CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                        View view = cashBoxMainFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvMiddleAdContent);
                        }
                        return null;
                    case 1:
                        CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                        View view2 = cashBoxMainFragment.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Jc.c.iv_middlePicUrl);
                        }
                        return null;
                    case 2:
                        CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                        View view3 = cashBoxMainFragment.f27318b;
                        if (view3 != null) {
                            return (EmptyView) view3.findViewById(Jc.c.emptyView);
                        }
                        return null;
                    case 3:
                        CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                        View view4 = cashBoxMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvMiddleAdTitle);
                        }
                        return null;
                    case 4:
                        CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                        View view5 = cashBoxMainFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutSad);
                        }
                        return null;
                    case 5:
                        CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                        View view6 = cashBoxMainFragment.f27318b;
                        if (view6 != null) {
                            return (BannerAdView) view6.findViewById(Jc.c.viewAd);
                        }
                        return null;
                    case 6:
                        CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                        View view7 = cashBoxMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Jc.c.tvExperienceGoldUnclaimed);
                        }
                        return null;
                    case 7:
                        CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                        View view8 = cashBoxMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvExperienceGoldBalance);
                        }
                        return null;
                    case 8:
                        CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                        View view9 = cashBoxMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(Jc.c.clTrialCash);
                        }
                        return null;
                    case 9:
                        CashBoxMainFragment.a aVar10 = CashBoxMainFragment.f32383V0;
                        View view10 = cashBoxMainFragment.f27318b;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(Jc.c.iv_trial_cash_bg);
                        }
                        return null;
                    default:
                        CashBoxMainFragment.a aVar11 = CashBoxMainFragment.f32383V0;
                        View view11 = cashBoxMainFragment.f27318b;
                        if (view11 != null) {
                            return (LinearLayout) view11.findViewById(Jc.c.trialCashModule);
                        }
                        return null;
                }
            }
        });
        final int i16 = 7;
        this.f32412Y = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxMainFragment f32648b;

            {
                this.f32648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxMainFragment cashBoxMainFragment = this.f32648b;
                switch (i16) {
                    case 0:
                        CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                        View view = cashBoxMainFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvMiddleAdContent);
                        }
                        return null;
                    case 1:
                        CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                        View view2 = cashBoxMainFragment.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Jc.c.iv_middlePicUrl);
                        }
                        return null;
                    case 2:
                        CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                        View view3 = cashBoxMainFragment.f27318b;
                        if (view3 != null) {
                            return (EmptyView) view3.findViewById(Jc.c.emptyView);
                        }
                        return null;
                    case 3:
                        CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                        View view4 = cashBoxMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvMiddleAdTitle);
                        }
                        return null;
                    case 4:
                        CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                        View view5 = cashBoxMainFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutSad);
                        }
                        return null;
                    case 5:
                        CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                        View view6 = cashBoxMainFragment.f27318b;
                        if (view6 != null) {
                            return (BannerAdView) view6.findViewById(Jc.c.viewAd);
                        }
                        return null;
                    case 6:
                        CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                        View view7 = cashBoxMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Jc.c.tvExperienceGoldUnclaimed);
                        }
                        return null;
                    case 7:
                        CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                        View view8 = cashBoxMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvExperienceGoldBalance);
                        }
                        return null;
                    case 8:
                        CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                        View view9 = cashBoxMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(Jc.c.clTrialCash);
                        }
                        return null;
                    case 9:
                        CashBoxMainFragment.a aVar10 = CashBoxMainFragment.f32383V0;
                        View view10 = cashBoxMainFragment.f27318b;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(Jc.c.iv_trial_cash_bg);
                        }
                        return null;
                    default:
                        CashBoxMainFragment.a aVar11 = CashBoxMainFragment.f32383V0;
                        View view11 = cashBoxMainFragment.f27318b;
                        if (view11 != null) {
                            return (LinearLayout) view11.findViewById(Jc.c.trialCashModule);
                        }
                        return null;
                }
            }
        });
        final int i17 = 8;
        this.f32413Z = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxMainFragment f32648b;

            {
                this.f32648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxMainFragment cashBoxMainFragment = this.f32648b;
                switch (i17) {
                    case 0:
                        CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                        View view = cashBoxMainFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvMiddleAdContent);
                        }
                        return null;
                    case 1:
                        CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                        View view2 = cashBoxMainFragment.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Jc.c.iv_middlePicUrl);
                        }
                        return null;
                    case 2:
                        CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                        View view3 = cashBoxMainFragment.f27318b;
                        if (view3 != null) {
                            return (EmptyView) view3.findViewById(Jc.c.emptyView);
                        }
                        return null;
                    case 3:
                        CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                        View view4 = cashBoxMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvMiddleAdTitle);
                        }
                        return null;
                    case 4:
                        CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                        View view5 = cashBoxMainFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutSad);
                        }
                        return null;
                    case 5:
                        CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                        View view6 = cashBoxMainFragment.f27318b;
                        if (view6 != null) {
                            return (BannerAdView) view6.findViewById(Jc.c.viewAd);
                        }
                        return null;
                    case 6:
                        CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                        View view7 = cashBoxMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Jc.c.tvExperienceGoldUnclaimed);
                        }
                        return null;
                    case 7:
                        CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                        View view8 = cashBoxMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvExperienceGoldBalance);
                        }
                        return null;
                    case 8:
                        CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                        View view9 = cashBoxMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(Jc.c.clTrialCash);
                        }
                        return null;
                    case 9:
                        CashBoxMainFragment.a aVar10 = CashBoxMainFragment.f32383V0;
                        View view10 = cashBoxMainFragment.f27318b;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(Jc.c.iv_trial_cash_bg);
                        }
                        return null;
                    default:
                        CashBoxMainFragment.a aVar11 = CashBoxMainFragment.f32383V0;
                        View view11 = cashBoxMainFragment.f27318b;
                        if (view11 != null) {
                            return (LinearLayout) view11.findViewById(Jc.c.trialCashModule);
                        }
                        return null;
                }
            }
        });
        final int i18 = 9;
        this.f32414k0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxMainFragment f32648b;

            {
                this.f32648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxMainFragment cashBoxMainFragment = this.f32648b;
                switch (i18) {
                    case 0:
                        CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                        View view = cashBoxMainFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvMiddleAdContent);
                        }
                        return null;
                    case 1:
                        CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                        View view2 = cashBoxMainFragment.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Jc.c.iv_middlePicUrl);
                        }
                        return null;
                    case 2:
                        CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                        View view3 = cashBoxMainFragment.f27318b;
                        if (view3 != null) {
                            return (EmptyView) view3.findViewById(Jc.c.emptyView);
                        }
                        return null;
                    case 3:
                        CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                        View view4 = cashBoxMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvMiddleAdTitle);
                        }
                        return null;
                    case 4:
                        CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                        View view5 = cashBoxMainFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutSad);
                        }
                        return null;
                    case 5:
                        CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                        View view6 = cashBoxMainFragment.f27318b;
                        if (view6 != null) {
                            return (BannerAdView) view6.findViewById(Jc.c.viewAd);
                        }
                        return null;
                    case 6:
                        CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                        View view7 = cashBoxMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Jc.c.tvExperienceGoldUnclaimed);
                        }
                        return null;
                    case 7:
                        CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                        View view8 = cashBoxMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvExperienceGoldBalance);
                        }
                        return null;
                    case 8:
                        CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                        View view9 = cashBoxMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(Jc.c.clTrialCash);
                        }
                        return null;
                    case 9:
                        CashBoxMainFragment.a aVar10 = CashBoxMainFragment.f32383V0;
                        View view10 = cashBoxMainFragment.f27318b;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(Jc.c.iv_trial_cash_bg);
                        }
                        return null;
                    default:
                        CashBoxMainFragment.a aVar11 = CashBoxMainFragment.f32383V0;
                        View view11 = cashBoxMainFragment.f27318b;
                        if (view11 != null) {
                            return (LinearLayout) view11.findViewById(Jc.c.trialCashModule);
                        }
                        return null;
                }
            }
        });
        final int i19 = 10;
        this.f32415p0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashBoxMainFragment f32648b;

            {
                this.f32648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashBoxMainFragment cashBoxMainFragment = this.f32648b;
                switch (i19) {
                    case 0:
                        CashBoxMainFragment.a aVar = CashBoxMainFragment.f32383V0;
                        View view = cashBoxMainFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(Jc.c.tvMiddleAdContent);
                        }
                        return null;
                    case 1:
                        CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                        View view2 = cashBoxMainFragment.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Jc.c.iv_middlePicUrl);
                        }
                        return null;
                    case 2:
                        CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                        View view3 = cashBoxMainFragment.f27318b;
                        if (view3 != null) {
                            return (EmptyView) view3.findViewById(Jc.c.emptyView);
                        }
                        return null;
                    case 3:
                        CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                        View view4 = cashBoxMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(Jc.c.tvMiddleAdTitle);
                        }
                        return null;
                    case 4:
                        CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                        View view5 = cashBoxMainFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(Jc.c.layoutSad);
                        }
                        return null;
                    case 5:
                        CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                        View view6 = cashBoxMainFragment.f27318b;
                        if (view6 != null) {
                            return (BannerAdView) view6.findViewById(Jc.c.viewAd);
                        }
                        return null;
                    case 6:
                        CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                        View view7 = cashBoxMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(Jc.c.tvExperienceGoldUnclaimed);
                        }
                        return null;
                    case 7:
                        CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                        View view8 = cashBoxMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(Jc.c.tvExperienceGoldBalance);
                        }
                        return null;
                    case 8:
                        CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                        View view9 = cashBoxMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(Jc.c.clTrialCash);
                        }
                        return null;
                    case 9:
                        CashBoxMainFragment.a aVar10 = CashBoxMainFragment.f32383V0;
                        View view10 = cashBoxMainFragment.f27318b;
                        if (view10 != null) {
                            return (ImageView) view10.findViewById(Jc.c.iv_trial_cash_bg);
                        }
                        return null;
                    default:
                        CashBoxMainFragment.a aVar11 = CashBoxMainFragment.f32383V0;
                        View view11 = cashBoxMainFragment.f27318b;
                        if (view11 != null) {
                            return (LinearLayout) view11.findViewById(Jc.c.trialCashModule);
                        }
                        return null;
                }
            }
        });
        this.f32416q0 = C2131j.b(new C1592n(this, 1));
        this.f32417r0 = C2131j.b(new C1592n(this, 2));
        this.f32418s0 = C2131j.b(new C1592n(this, 3));
        this.f32419t0 = C2131j.b(new C1592n(this, 4));
        this.f32420u0 = C2131j.b(new C1592n(this, 6));
        this.f32422v0 = C2131j.b(new C1592n(this, 7));
        this.f32424w0 = C2131j.b(new C1592n(this, 8));
        this.f32425x0 = C2131j.b(new C1592n(this, 9));
        this.f32426y0 = C2131j.b(new C1592n(this, 10));
        this.f32427z0 = C2131j.b(new C1592n(this, 12));
        this.f32385A0 = C2131j.b(new C1592n(this, 13));
        this.f32387B0 = C2131j.b(new C1592n(this, 14));
        this.f32389C0 = C2131j.b(new C1592n(this, 15));
        this.f32390D0 = C2131j.b(new C1592n(this, 16));
        this.f32391E0 = C2131j.b(new C1592n(this, 18));
        this.f32392F0 = C2131j.b(new C1592n(this, 19));
        this.f32393G0 = C2131j.b(new C1592n(this, 20));
        C2131j.b(new C1592n(this, 21));
        this.f32395H0 = C2131j.b(new C1592n(this, 22));
        this.f32396I0 = C2131j.b(new C1592n(this, 23));
        this.f32397J0 = C2131j.b(new C1592n(this, 24));
        this.f32398K0 = C2131j.b(new C1592n(this, 25));
        this.f32400L0 = C2131j.b(new C1592n(this, 26));
        this.f32402M0 = true;
        this.f32408R0 = new Nc.e(2);
        this.T0 = -1L;
    }

    public static final void w(CashBoxMainFragment cashBoxMainFragment) {
        TurnOnAutoSaveDialogFragment.a aVar = TurnOnAutoSaveDialogFragment.f32323L;
        GetAutoTransferConfigResp getAutoTransferConfigResp = cashBoxMainFragment.f32409S0;
        TurnOnAutoSaveDialogFragment turnOnAutoSaveDialogFragmentNewInstance = aVar.newInstance(getAutoTransferConfigResp != null ? getAutoTransferConfigResp.agreementUrl : null);
        C1592n turnOnButtonClick = new C1592n(cashBoxMainFragment, 0);
        turnOnAutoSaveDialogFragmentNewInstance.getClass();
        Intrinsics.checkNotNullParameter(turnOnButtonClick, "turnOnButtonClick");
        turnOnAutoSaveDialogFragmentNewInstance.f32324C = turnOnButtonClick;
        C1592n dialogClosedClick = new C1592n(cashBoxMainFragment, 11);
        Intrinsics.checkNotNullParameter(dialogClosedClick, "dialogClosedClick");
        turnOnAutoSaveDialogFragmentNewInstance.f32325H = dialogClosedClick;
        androidx.fragment.app.Z childFragmentManager = cashBoxMainFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        turnOnAutoSaveDialogFragmentNewInstance.show(childFragmentManager, "showTurnOnAutoSaveDialog");
    }

    public static final void x(CashBoxMainFragment cashBoxMainFragment) {
        p355xf.t tVar = cashBoxMainFragment.f32416q0;
        TextView textView = (TextView) tVar.getValue();
        if (textView != null) {
            GetAutoTransferConfigResp getAutoTransferConfigResp = cashBoxMainFragment.f32409S0;
            textView.setText((getAutoTransferConfigResp == null || getAutoTransferConfigResp.isAutoTransfer != 1) ? "OFF" : "ON");
        }
        TextView textView2 = (TextView) cashBoxMainFragment.f32400L0.getValue();
        if (textView2 != null) {
            GetAutoTransferConfigResp getAutoTransferConfigResp2 = cashBoxMainFragment.f32409S0;
            textView2.setText((getAutoTransferConfigResp2 == null || getAutoTransferConfigResp2.isAutoTransfer != 1) ? "Turn it on to earn money daily!" : "Your balance is earning daily now!");
        }
        TextView textView3 = (TextView) tVar.getValue();
        if (textView3 != null) {
            GetAutoTransferConfigResp getAutoTransferConfigResp3 = cashBoxMainFragment.f32409S0;
            textView3.setTextColor((getAutoTransferConfigResp3 == null || getAutoTransferConfigResp3.isAutoTransfer != 1) ? cashBoxMainFragment.requireContext().getColor(L6.b.ppColorError) : cashBoxMainFragment.requireContext().getColor(L6.b.ppColorSuccess));
        }
        TextView textView4 = (TextView) tVar.getValue();
        if (textView4 != null) {
            Drawable drawable = cashBoxMainFragment.requireContext().getDrawable(Jc.b.mm_bg_auto_save);
            Intrinsics.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.LevelListDrawable");
            LevelListDrawable levelListDrawable = (LevelListDrawable) drawable;
            GetAutoTransferConfigResp getAutoTransferConfigResp4 = cashBoxMainFragment.f32409S0;
            levelListDrawable.setLevel((getAutoTransferConfigResp4 == null || getAutoTransferConfigResp4.isAutoTransfer != 1) ? 0 : 1);
            textView4.setBackground(levelListDrawable);
        }
    }

    public final void A(boolean z3) {
        if (Pa.i0.W(getActivity()) && isAdded() && getContext() != null) {
            try {
                String string = getString(p025ba.k.ad_cashbox_home_pop_slot_id);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                new InterstitialAdView(string, 0, new Ab.k(15), new org.sufficientlysecure.htmltextview.h(9)).show(getContext(), new E.N(z3, 7));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void B(boolean z3) {
        IconicsImageView iconicsImageView;
        Context context = getContext();
        if (context == null || (iconicsImageView = (IconicsImageView) this.f32393G0.getValue()) == null) {
            return;
        }
        IconicsDrawable iconicsDrawable = new IconicsDrawable(context, z3 ? S6.a.pay_Show : S6.a.pay_Hide);
        iconicsDrawable.a(new p010a9.m(this, 15));
        iconicsImageView.setIcon(iconicsDrawable);
    }

    public final void C(boolean z3, GetCashBoxAccountInfoResp.CashBoxAccountInfo cashBoxAccountInfo) {
        String str;
        String strO;
        String strB;
        B(z3);
        RoundedTextView roundedTextView = (RoundedTextView) this.f32392F0.getValue();
        if (roundedTextView != null) {
            roundedTextView.setVisibility((cashBoxAccountInfo == null || cashBoxAccountInfo.getAccountStatus() != 3) ? 8 : 0);
        }
        long frozenBalance = cashBoxAccountInfo != null ? cashBoxAccountInfo.getFrozenBalance() : 0L;
        p355xf.t tVar = this.f32389C0;
        if (frozenBalance > 0) {
            LinearLayout linearLayout = (LinearLayout) tVar.getValue();
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            TextView textView = (TextView) this.f32387B0.getValue();
            if (textView != null) {
                C0.G.x("Frozen Amount:", Pa.r0.B(cashBoxAccountInfo != null ? cashBoxAccountInfo.getFrozenBalance() : 0L, true), textView);
            }
        }
        LinearLayout linearLayout2 = (LinearLayout) tVar.getValue();
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new p010a9.b(23, cashBoxAccountInfo, this));
        }
        p355xf.t tVar2 = this.f32391E0;
        TextView textView2 = (TextView) tVar2.getValue();
        if (textView2 != null) {
            textView2.setTextColor((cashBoxAccountInfo == null || cashBoxAccountInfo.getAccountStatus() != 3) ? requireContext().getColor(L6.b.ppColorTextPrimary) : requireContext().getColor(L6.b.ppColorTextDisable));
        }
        if (cashBoxAccountInfo != null) {
            p355xf.t tVar3 = this.f32425x0;
            p355xf.t tVar4 = this.f32385A0;
            if (z3) {
                TextView textView3 = (TextView) tVar2.getValue();
                if (textView3 != null) {
                    textView3.setText(Pa.r0.B(cashBoxAccountInfo.getCashBoxBalance(), true));
                }
                if (cashBoxAccountInfo.getStatus() == 1) {
                    TextView textView4 = (TextView) tVar4.getValue();
                    if (textView4 != null) {
                        textView4.setTypeface(Typeface.create("sans-serif", 0));
                    }
                    IconicsTextView iconicsTextViewY = y();
                    if (iconicsTextViewY != null) {
                        iconicsTextViewY.setTypeface(Typeface.create("sans-serif", 0));
                    }
                } else {
                    Pa.r0.R1((TextView) tVar4.getValue(), "fonts/PalmPayNum-Bold.ttf");
                    Pa.r0.R1(y(), "fonts/PalmPayNum-Bold.ttf");
                }
                TextView textView5 = (TextView) tVar4.getValue();
                if (textView5 != null) {
                    if (cashBoxAccountInfo.getStatus() == 1) {
                        strB = cashBoxAccountInfo.getMsg();
                    } else {
                        strB = cashBoxAccountInfo.getYesterdayIncome() == null ? "--" : Pa.r0.B(cashBoxAccountInfo.getYesterdayIncome().longValue(), true);
                    }
                    textView5.setText(strB != null ? strB : "--");
                }
                IconicsTextView iconicsTextViewY2 = y();
                if (iconicsTextViewY2 != null) {
                    iconicsTextViewY2.setText(cashBoxAccountInfo.getExperienceGoldStatus() == 1 ? cashBoxAccountInfo.getMsg() : Pa.r0.B(cashBoxAccountInfo.getExperienceGoldYesterdayIncome(), true));
                }
                long experienceGoldYesterdayIncome = cashBoxAccountInfo.getExperienceGoldYesterdayIncome();
                p355xf.t tVar5 = this.f32427z0;
                if (experienceGoldYesterdayIncome > 0) {
                    IconicsTextView iconicsTextViewY3 = y();
                    if (iconicsTextViewY3 != null) {
                        iconicsTextViewY3.setVisibility(0);
                    }
                    View view = (View) tVar5.getValue();
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    IconicsTextView iconicsTextViewY4 = y();
                    if (iconicsTextViewY4 != null) {
                        iconicsTextViewY4.setText(Pa.r0.B(cashBoxAccountInfo.getExperienceGoldYesterdayIncome(), true) + " From Trial Cash");
                    }
                } else {
                    View view2 = (View) tVar5.getValue();
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    IconicsTextView iconicsTextViewY5 = y();
                    if (iconicsTextViewY5 != null) {
                        iconicsTextViewY5.setVisibility(8);
                    }
                }
                TextView textView6 = (TextView) tVar3.getValue();
                if (textView6 != null) {
                    textView6.setText(Pa.r0.B(cashBoxAccountInfo.getTotalIncome(), true));
                }
            } else {
                TextView textView7 = (TextView) tVar2.getValue();
                if (textView7 != null) {
                    textView7.setText("****");
                }
                TextView textView8 = (TextView) tVar4.getValue();
                if (textView8 != null) {
                    textView8.setText("****");
                }
                TextView textView9 = (TextView) tVar3.getValue();
                if (textView9 != null) {
                    textView9.setText("****");
                }
                IconicsTextView iconicsTextViewY6 = y();
                if (iconicsTextViewY6 != null) {
                    iconicsTextViewY6.setText("****");
                }
            }
            if (cashBoxAccountInfo.getActivityIsOpen()) {
                LinearLayout linearLayout3 = (LinearLayout) this.f32415p0.getValue();
                if (linearLayout3 != null) {
                    p220oa.h.s(linearLayout3, true);
                }
                boolean experienceGoldIsOpen = cashBoxAccountInfo.getExperienceGoldIsOpen();
                p355xf.t tVar6 = this.f32413Z;
                p355xf.t tVar7 = this.f32414k0;
                if (experienceGoldIsOpen) {
                    ImageView imageView = (ImageView) tVar7.getValue();
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) tVar6.getValue();
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                    }
                    TextView textView10 = (TextView) this.f32412Y.getValue();
                    if (textView10 != null) {
                        String strB2 = Pa.r0.B(cashBoxAccountInfo.getExperienceGoldBalance(), true);
                        Intrinsics.checkNotNullExpressionValue(strB2, "getAmountStringWithCurrency(...)");
                        C0.G.x("Trial Cash: ", kotlin.text.y.k(strB2, ".00", ""), textView10);
                    }
                    TextView textView11 = (TextView) this.f32411X.getValue();
                    if (textView11 != null) {
                        if (cashBoxAccountInfo.getExperienceGoldUnclaimed() == 0) {
                            strO = "Earn More";
                        } else {
                            String strB3 = Pa.r0.B(cashBoxAccountInfo.getExperienceGoldUnclaimed(), true);
                            Intrinsics.checkNotNullExpressionValue(strB3, "getAmountStringWithCurrency(...)");
                            strO = C0.G.o("Available: ", kotlin.text.y.k(strB3, ".00", ""));
                        }
                        textView11.setText(strO);
                    }
                } else {
                    ImageView imageView2 = (ImageView) tVar7.getValue();
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) tVar6.getValue();
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(8);
                    }
                    Pa.r0.p1((ImageView) tVar7.getValue(), cashBoxAccountInfo.getBanner(), m());
                }
                this.f32410U0 = cashBoxAccountInfo.getExperienceGoldShowType();
                HashMap map = new HashMap();
                int i7 = this.f32410U0;
                if (i7 == 1) {
                    str = "PalmPay_CashBoxOld_Trial_Cash1_View";
                } else if (i7 == 2) {
                    str = "PalmPay_CashBoxOld_Trial_Cash2_View";
                } else if (i7 != 3) {
                    str = i7 != 4 ? "PalmPay_CashBoxOld_Trial_Cash_Other_View" : "PalmPay_CashBoxOld_Trial_Cash4_View";
                } else {
                    str = "PalmPay_CashBoxOld_Trial_Cash3_View";
                }
                map.put("element_name", str);
                Pa.n0.g().w("cashboxHomePageElementView", map);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Jc.d.mm_cash_box_main_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        z();
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.f32384A.getValue();
        if (appCompatTextView != null) {
            appCompatTextView.setText(getResources().getString(Jc.f.mm_money_in_amount, Pa.r0.B(0L, true)));
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.f32423w.getValue();
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(getResources().getString(Jc.f.mm_money_out_amount, Pa.r0.B(0L, true)));
        }
        C(p059e1.a.C("cash_box_saving_shown", true), this.f32407Q0);
        com.transsnet.palmpay.core.base.l lVar = ((CashBoxViewModel) this.f27327p).f32752q0;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new C1595q(this, 0), 19));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((CashBoxViewModel) this.f27327p).f32750p;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new C1595q(this, 1), 19));
        }
        com.transsnet.palmpay.core.base.l lVar3 = ((CashBoxViewModel) this.f27327p).f32733A;
        if (lVar3 != null) {
            lVar3.e(this, new Wd.I(new C1595q(this, 2), 19));
        }
        com.transsnet.palmpay.core.base.l lVar4 = ((CashBoxViewModel) this.f27327p).f32736H;
        if (lVar4 != null) {
            lVar4.e(this, new Wd.I(new C1595q(this, 3), 19));
        }
        com.transsnet.palmpay.core.base.l lVar5 = ((CashBoxViewModel) this.f27327p).f32734B;
        if (lVar5 != null) {
            lVar5.e(this, new Wd.I(new C1596s(lVar5, 0), 19));
        }
        com.transsnet.palmpay.core.base.l lVar6 = ((CashBoxViewModel) this.f27327p).f32741Y;
        if (lVar6 != null) {
            lVar6.e(this, new Wd.I(new C1595q(this, 4), 19));
        }
        com.transsnet.palmpay.core.base.l lVar7 = ((CashBoxViewModel) this.f27327p).f32748k0;
        if (lVar7 != null) {
            lVar7.e(this, new Wd.I(new r(this, this, 1), 19));
        }
        com.transsnet.palmpay.core.base.l lVar8 = ((CashBoxViewModel) this.f27327p).f32753r0;
        if (lVar8 != null) {
            lVar8.e(this, new Wd.I(new C1595q(this, 5), 19));
        }
        CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) this.f27327p;
        com.transsnet.palmpay.core.base.l lVar9 = cashBoxViewModel != null ? cashBoxViewModel.f32761x0 : null;
        if (lVar9 == null) {
            return 0;
        }
        lVar9.e(this, new Wd.I(new r(this, this, 0), 19));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        CashBoxViewModel cashBoxViewModel;
        String stringExtra;
        CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) this.f27327p;
        if (cashBoxViewModel2 != null) {
            p140j8.f.s(cashBoxViewModel2, new C0577s(1, null), cashBoxViewModel2.f32752q0, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        CashBoxViewModel cashBoxViewModel3 = (CashBoxViewModel) this.f27327p;
        if (cashBoxViewModel3 != null) {
            cashBoxViewModel3.h();
        }
        CashBoxViewModel cashBoxViewModel4 = (CashBoxViewModel) this.f27327p;
        if (cashBoxViewModel4 != null) {
            AbstractC0780y.m(androidx.lifecycle.V.h(cashBoxViewModel4), null, null, new C0575p(cashBoxViewModel4, null), 3);
        }
        androidx.fragment.app.E activity = getActivity();
        if (activity == null || !(activity instanceof CashBoxMainActivity)) {
            return;
        }
        Intent intent = ((CashBoxMainActivity) activity).getIntent();
        if (!Intrinsics.c((intent == null || (stringExtra = intent.getStringExtra("business")) == null) ? null : Boolean.valueOf(stringExtra.equals("CashCoupon")), Boolean.TRUE) || (cashBoxViewModel = (CashBoxViewModel) this.f27327p) == null) {
            return;
        }
        p140j8.f.s(cashBoxViewModel, new C0568i(Boolean.FALSE, null), cashBoxViewModel.f32761x0, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Pa.n0.g().v("CashBox_Homepage_View");
        if (!org.greenrobot.eventbus.c.b().e(this)) {
            org.greenrobot.eventbus.c.b().j(this);
        }
        p355xf.t tVar = this.f32397J0;
        PpTitleBar ppTitleBar = (PpTitleBar) tVar.getValue();
        if (ppTitleBar != null) {
            S6.a aVar = S6.a.pay_More;
            int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext());
            ImageView imageView = ppTitleBar.f24624e;
            if (imageView != null) {
                imageView.setImageDrawable(p059e1.a.h(ppTitleBar.getContext(), aVar, null, iColorInt, 24));
            }
        }
        PpTitleBar ppTitleBar2 = (PpTitleBar) tVar.getValue();
        if (ppTitleBar2 != null) {
            ppTitleBar2.c(S6.a.pay_ArrowLeft, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext()));
        }
        PpTitleBar ppTitleBar3 = (PpTitleBar) tVar.getValue();
        if (ppTitleBar3 != null) {
            final int i7 = 0;
            ppTitleBar3.setRightImageView1ClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxMainFragment f32650b;

                {
                    this.f32650b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = "PalmPay_CashBoxOld_Trial_Cash_Other_Click";
                    CashBoxMainFragment cashBoxMainFragment = this.f32650b;
                    switch (i7) {
                        case 0:
                            CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f32297C.newInstance(cashBoxMainFragment.f32405P0);
                            androidx.fragment.app.Z childFragmentManager = cashBoxMainFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showMoreFunctionDialog");
                            break;
                        case 1:
                            CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                            if (!BaseApplication.get().getUser().isTier3User()) {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxMainFragment.getString(Jc.f.mm_cashbox_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true), BaseApplication.get().getUser().getMobileMoneyAccountTier()), 14.0f, L6.b.ppColorTextDisable), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_exit)), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(22)), null, 16, null);
                                androidx.fragment.app.Z childFragmentManager2 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager2, "showCashBoxMaximumLimitTipsDialog");
                            } else {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, cashBoxMainFragment.getString(Jc.f.mm_cashbox_t3_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true)), cashBoxMainFragment.getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager3 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager3, "showCashBoxMaximumLimitTipsDialog");
                            }
                            break;
                        case 2:
                            int i10 = cashBoxMainFragment.f32410U0;
                            if (i10 == 3) {
                                str = "PalmPay_CashBoxOld_Trial_Cash3_Click";
                            } else if (i10 == 4) {
                                str = "PalmPay_CashBoxOld_Trial_Cash4_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 3:
                            int i11 = cashBoxMainFragment.f32410U0;
                            if (i11 == 1) {
                                str = "PalmPay_CashBoxOld_Trial_Cash1_Click";
                            } else if (i11 == 2) {
                                str = "PalmPay_CashBoxOld_Trial_Cash2_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 4:
                            CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxSave_Return_Click");
                            androidx.fragment.app.E activity = cashBoxMainFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 5:
                            CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 6:
                            CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 7:
                            CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Withdraw_Click");
                            if (cashBoxMainFragment.f32404O0 && p059e1.a.C("SHOW_INTERCEPT_DIALOG", true)) {
                                WithdrawInterceptDialogFragment withdrawInterceptDialogFragmentNewInstance$default = WithdrawInterceptDialogFragment.a.newInstance$default(WithdrawInterceptDialogFragment.f32335L, null, 1, null);
                                androidx.fragment.app.Z childFragmentManager4 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                                withdrawInterceptDialogFragmentNewInstance$default.show(childFragmentManager4, "showWithdrawDialog");
                            } else {
                                ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 2).navigation();
                            }
                            break;
                        case 8:
                            CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                            boolean z3 = !p059e1.a.C("cash_box_saving_shown", true);
                            cashBoxMainFragment.B(z3);
                            cashBoxMainFragment.C(z3, cashBoxMainFragment.f32407Q0);
                            p059e1.a.X("cash_box_saving_shown", z3);
                            break;
                        default:
                            CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Auto_Save_Click");
                            ARouter.getInstance().build("/manage_money/cash_box_auto_save_activity").withParcelable("auto_transfer_config", cashBoxMainFragment.f32409S0).navigation();
                            break;
                    }
                }
            });
        }
        PpTitleBar ppTitleBar4 = (PpTitleBar) tVar.getValue();
        if (ppTitleBar4 != null) {
            final int i10 = 4;
            ppTitleBar4.setBackButtonClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxMainFragment f32650b;

                {
                    this.f32650b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = "PalmPay_CashBoxOld_Trial_Cash_Other_Click";
                    CashBoxMainFragment cashBoxMainFragment = this.f32650b;
                    switch (i10) {
                        case 0:
                            CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f32297C.newInstance(cashBoxMainFragment.f32405P0);
                            androidx.fragment.app.Z childFragmentManager = cashBoxMainFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showMoreFunctionDialog");
                            break;
                        case 1:
                            CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                            if (!BaseApplication.get().getUser().isTier3User()) {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxMainFragment.getString(Jc.f.mm_cashbox_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true), BaseApplication.get().getUser().getMobileMoneyAccountTier()), 14.0f, L6.b.ppColorTextDisable), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_exit)), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(22)), null, 16, null);
                                androidx.fragment.app.Z childFragmentManager2 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager2, "showCashBoxMaximumLimitTipsDialog");
                            } else {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, cashBoxMainFragment.getString(Jc.f.mm_cashbox_t3_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true)), cashBoxMainFragment.getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager3 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager3, "showCashBoxMaximumLimitTipsDialog");
                            }
                            break;
                        case 2:
                            int i11 = cashBoxMainFragment.f32410U0;
                            if (i11 == 3) {
                                str = "PalmPay_CashBoxOld_Trial_Cash3_Click";
                            } else if (i11 == 4) {
                                str = "PalmPay_CashBoxOld_Trial_Cash4_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 3:
                            int i12 = cashBoxMainFragment.f32410U0;
                            if (i12 == 1) {
                                str = "PalmPay_CashBoxOld_Trial_Cash1_Click";
                            } else if (i12 == 2) {
                                str = "PalmPay_CashBoxOld_Trial_Cash2_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 4:
                            CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxSave_Return_Click");
                            androidx.fragment.app.E activity = cashBoxMainFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 5:
                            CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 6:
                            CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 7:
                            CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Withdraw_Click");
                            if (cashBoxMainFragment.f32404O0 && p059e1.a.C("SHOW_INTERCEPT_DIALOG", true)) {
                                WithdrawInterceptDialogFragment withdrawInterceptDialogFragmentNewInstance$default = WithdrawInterceptDialogFragment.a.newInstance$default(WithdrawInterceptDialogFragment.f32335L, null, 1, null);
                                androidx.fragment.app.Z childFragmentManager4 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                                withdrawInterceptDialogFragmentNewInstance$default.show(childFragmentManager4, "showWithdrawDialog");
                            } else {
                                ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 2).navigation();
                            }
                            break;
                        case 8:
                            CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                            boolean z3 = !p059e1.a.C("cash_box_saving_shown", true);
                            cashBoxMainFragment.B(z3);
                            cashBoxMainFragment.C(z3, cashBoxMainFragment.f32407Q0);
                            p059e1.a.X("cash_box_saving_shown", z3);
                            break;
                        default:
                            CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Auto_Save_Click");
                            ARouter.getInstance().build("/manage_money/cash_box_auto_save_activity").withParcelable("auto_transfer_config", cashBoxMainFragment.f32409S0).navigation();
                            break;
                    }
                }
            });
        }
        p355xf.t tVar2 = this.f32421v;
        RecyclerView recyclerView = (RecyclerView) tVar2.getValue();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        RecyclerView recyclerView2 = (RecyclerView) tVar2.getValue();
        Nc.e eVar = this.f32408R0;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(eVar);
        }
        BannerAdView bannerAdView = (BannerAdView) this.f32406Q.getValue();
        if (bannerAdView != null) {
            org.chromium.support_lib_boundary.util.b.c(bannerAdView);
        }
        p355xf.t tVar3 = this.f32422v0;
        Pa.r0.R1((TextView) tVar3.getValue(), "fonts/PalmPayNum-Bold.ttf");
        TextView textView = (TextView) tVar3.getValue();
        if (textView != null) {
            final int i11 = 5;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxMainFragment f32650b;

                {
                    this.f32650b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = "PalmPay_CashBoxOld_Trial_Cash_Other_Click";
                    CashBoxMainFragment cashBoxMainFragment = this.f32650b;
                    switch (i11) {
                        case 0:
                            CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f32297C.newInstance(cashBoxMainFragment.f32405P0);
                            androidx.fragment.app.Z childFragmentManager = cashBoxMainFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showMoreFunctionDialog");
                            break;
                        case 1:
                            CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                            if (!BaseApplication.get().getUser().isTier3User()) {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxMainFragment.getString(Jc.f.mm_cashbox_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true), BaseApplication.get().getUser().getMobileMoneyAccountTier()), 14.0f, L6.b.ppColorTextDisable), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_exit)), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(22)), null, 16, null);
                                androidx.fragment.app.Z childFragmentManager2 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager2, "showCashBoxMaximumLimitTipsDialog");
                            } else {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, cashBoxMainFragment.getString(Jc.f.mm_cashbox_t3_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true)), cashBoxMainFragment.getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager3 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager3, "showCashBoxMaximumLimitTipsDialog");
                            }
                            break;
                        case 2:
                            int i12 = cashBoxMainFragment.f32410U0;
                            if (i12 == 3) {
                                str = "PalmPay_CashBoxOld_Trial_Cash3_Click";
                            } else if (i12 == 4) {
                                str = "PalmPay_CashBoxOld_Trial_Cash4_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 3:
                            int i13 = cashBoxMainFragment.f32410U0;
                            if (i13 == 1) {
                                str = "PalmPay_CashBoxOld_Trial_Cash1_Click";
                            } else if (i13 == 2) {
                                str = "PalmPay_CashBoxOld_Trial_Cash2_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 4:
                            CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxSave_Return_Click");
                            androidx.fragment.app.E activity = cashBoxMainFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 5:
                            CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 6:
                            CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 7:
                            CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Withdraw_Click");
                            if (cashBoxMainFragment.f32404O0 && p059e1.a.C("SHOW_INTERCEPT_DIALOG", true)) {
                                WithdrawInterceptDialogFragment withdrawInterceptDialogFragmentNewInstance$default = WithdrawInterceptDialogFragment.a.newInstance$default(WithdrawInterceptDialogFragment.f32335L, null, 1, null);
                                androidx.fragment.app.Z childFragmentManager4 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                                withdrawInterceptDialogFragmentNewInstance$default.show(childFragmentManager4, "showWithdrawDialog");
                            } else {
                                ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 2).navigation();
                            }
                            break;
                        case 8:
                            CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                            boolean z3 = !p059e1.a.C("cash_box_saving_shown", true);
                            cashBoxMainFragment.B(z3);
                            cashBoxMainFragment.C(z3, cashBoxMainFragment.f32407Q0);
                            p059e1.a.X("cash_box_saving_shown", z3);
                            break;
                        default:
                            CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Auto_Save_Click");
                            ARouter.getInstance().build("/manage_money/cash_box_auto_save_activity").withParcelable("auto_transfer_config", cashBoxMainFragment.f32409S0).navigation();
                            break;
                    }
                }
            });
        }
        IconicsImageView iconicsImageView = (IconicsImageView) this.f32420u0.getValue();
        if (iconicsImageView != null) {
            final int i12 = 6;
            iconicsImageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxMainFragment f32650b;

                {
                    this.f32650b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = "PalmPay_CashBoxOld_Trial_Cash_Other_Click";
                    CashBoxMainFragment cashBoxMainFragment = this.f32650b;
                    switch (i12) {
                        case 0:
                            CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f32297C.newInstance(cashBoxMainFragment.f32405P0);
                            androidx.fragment.app.Z childFragmentManager = cashBoxMainFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showMoreFunctionDialog");
                            break;
                        case 1:
                            CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                            if (!BaseApplication.get().getUser().isTier3User()) {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxMainFragment.getString(Jc.f.mm_cashbox_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true), BaseApplication.get().getUser().getMobileMoneyAccountTier()), 14.0f, L6.b.ppColorTextDisable), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_exit)), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(22)), null, 16, null);
                                androidx.fragment.app.Z childFragmentManager2 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager2, "showCashBoxMaximumLimitTipsDialog");
                            } else {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, cashBoxMainFragment.getString(Jc.f.mm_cashbox_t3_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true)), cashBoxMainFragment.getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager3 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager3, "showCashBoxMaximumLimitTipsDialog");
                            }
                            break;
                        case 2:
                            int i13 = cashBoxMainFragment.f32410U0;
                            if (i13 == 3) {
                                str = "PalmPay_CashBoxOld_Trial_Cash3_Click";
                            } else if (i13 == 4) {
                                str = "PalmPay_CashBoxOld_Trial_Cash4_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 3:
                            int i14 = cashBoxMainFragment.f32410U0;
                            if (i14 == 1) {
                                str = "PalmPay_CashBoxOld_Trial_Cash1_Click";
                            } else if (i14 == 2) {
                                str = "PalmPay_CashBoxOld_Trial_Cash2_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 4:
                            CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxSave_Return_Click");
                            androidx.fragment.app.E activity = cashBoxMainFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 5:
                            CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 6:
                            CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 7:
                            CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Withdraw_Click");
                            if (cashBoxMainFragment.f32404O0 && p059e1.a.C("SHOW_INTERCEPT_DIALOG", true)) {
                                WithdrawInterceptDialogFragment withdrawInterceptDialogFragmentNewInstance$default = WithdrawInterceptDialogFragment.a.newInstance$default(WithdrawInterceptDialogFragment.f32335L, null, 1, null);
                                androidx.fragment.app.Z childFragmentManager4 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                                withdrawInterceptDialogFragmentNewInstance$default.show(childFragmentManager4, "showWithdrawDialog");
                            } else {
                                ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 2).navigation();
                            }
                            break;
                        case 8:
                            CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                            boolean z3 = !p059e1.a.C("cash_box_saving_shown", true);
                            cashBoxMainFragment.B(z3);
                            cashBoxMainFragment.C(z3, cashBoxMainFragment.f32407Q0);
                            p059e1.a.X("cash_box_saving_shown", z3);
                            break;
                        default:
                            CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Auto_Save_Click");
                            ARouter.getInstance().build("/manage_money/cash_box_auto_save_activity").withParcelable("auto_transfer_config", cashBoxMainFragment.f32409S0).navigation();
                            break;
                    }
                }
            });
        }
        RoundedTextView roundedTextView = (RoundedTextView) this.f32424w0.getValue();
        if (roundedTextView != null) {
            final int i13 = 7;
            roundedTextView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxMainFragment f32650b;

                {
                    this.f32650b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = "PalmPay_CashBoxOld_Trial_Cash_Other_Click";
                    CashBoxMainFragment cashBoxMainFragment = this.f32650b;
                    switch (i13) {
                        case 0:
                            CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f32297C.newInstance(cashBoxMainFragment.f32405P0);
                            androidx.fragment.app.Z childFragmentManager = cashBoxMainFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showMoreFunctionDialog");
                            break;
                        case 1:
                            CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                            if (!BaseApplication.get().getUser().isTier3User()) {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxMainFragment.getString(Jc.f.mm_cashbox_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true), BaseApplication.get().getUser().getMobileMoneyAccountTier()), 14.0f, L6.b.ppColorTextDisable), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_exit)), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(22)), null, 16, null);
                                androidx.fragment.app.Z childFragmentManager2 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager2, "showCashBoxMaximumLimitTipsDialog");
                            } else {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, cashBoxMainFragment.getString(Jc.f.mm_cashbox_t3_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true)), cashBoxMainFragment.getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager3 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager3, "showCashBoxMaximumLimitTipsDialog");
                            }
                            break;
                        case 2:
                            int i14 = cashBoxMainFragment.f32410U0;
                            if (i14 == 3) {
                                str = "PalmPay_CashBoxOld_Trial_Cash3_Click";
                            } else if (i14 == 4) {
                                str = "PalmPay_CashBoxOld_Trial_Cash4_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 3:
                            int i15 = cashBoxMainFragment.f32410U0;
                            if (i15 == 1) {
                                str = "PalmPay_CashBoxOld_Trial_Cash1_Click";
                            } else if (i15 == 2) {
                                str = "PalmPay_CashBoxOld_Trial_Cash2_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 4:
                            CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxSave_Return_Click");
                            androidx.fragment.app.E activity = cashBoxMainFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 5:
                            CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 6:
                            CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 7:
                            CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Withdraw_Click");
                            if (cashBoxMainFragment.f32404O0 && p059e1.a.C("SHOW_INTERCEPT_DIALOG", true)) {
                                WithdrawInterceptDialogFragment withdrawInterceptDialogFragmentNewInstance$default = WithdrawInterceptDialogFragment.a.newInstance$default(WithdrawInterceptDialogFragment.f32335L, null, 1, null);
                                androidx.fragment.app.Z childFragmentManager4 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                                withdrawInterceptDialogFragmentNewInstance$default.show(childFragmentManager4, "showWithdrawDialog");
                            } else {
                                ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 2).navigation();
                            }
                            break;
                        case 8:
                            CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                            boolean z3 = !p059e1.a.C("cash_box_saving_shown", true);
                            cashBoxMainFragment.B(z3);
                            cashBoxMainFragment.C(z3, cashBoxMainFragment.f32407Q0);
                            p059e1.a.X("cash_box_saving_shown", z3);
                            break;
                        default:
                            CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Auto_Save_Click");
                            ARouter.getInstance().build("/manage_money/cash_box_auto_save_activity").withParcelable("auto_transfer_config", cashBoxMainFragment.f32409S0).navigation();
                            break;
                    }
                }
            });
        }
        RoundedTextView roundedTextView2 = (RoundedTextView) this.f32419t0.getValue();
        if (roundedTextView2 != null) {
            roundedTextView2.setOnClickListener(new ViewOnClickListenerC1478l(21));
        }
        IconicsTextView iconicsTextView = (IconicsTextView) this.f32398K0.getValue();
        if (iconicsTextView != null) {
            iconicsTextView.setOnClickListener(new ViewOnClickListenerC1478l(22));
        }
        IconicsImageView iconicsImageView2 = (IconicsImageView) this.f32393G0.getValue();
        if (iconicsImageView2 != null) {
            final int i14 = 8;
            iconicsImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxMainFragment f32650b;

                {
                    this.f32650b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = "PalmPay_CashBoxOld_Trial_Cash_Other_Click";
                    CashBoxMainFragment cashBoxMainFragment = this.f32650b;
                    switch (i14) {
                        case 0:
                            CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f32297C.newInstance(cashBoxMainFragment.f32405P0);
                            androidx.fragment.app.Z childFragmentManager = cashBoxMainFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showMoreFunctionDialog");
                            break;
                        case 1:
                            CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                            if (!BaseApplication.get().getUser().isTier3User()) {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxMainFragment.getString(Jc.f.mm_cashbox_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true), BaseApplication.get().getUser().getMobileMoneyAccountTier()), 14.0f, L6.b.ppColorTextDisable), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_exit)), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(22)), null, 16, null);
                                androidx.fragment.app.Z childFragmentManager2 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager2, "showCashBoxMaximumLimitTipsDialog");
                            } else {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, cashBoxMainFragment.getString(Jc.f.mm_cashbox_t3_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true)), cashBoxMainFragment.getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager3 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager3, "showCashBoxMaximumLimitTipsDialog");
                            }
                            break;
                        case 2:
                            int i15 = cashBoxMainFragment.f32410U0;
                            if (i15 == 3) {
                                str = "PalmPay_CashBoxOld_Trial_Cash3_Click";
                            } else if (i15 == 4) {
                                str = "PalmPay_CashBoxOld_Trial_Cash4_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 3:
                            int i16 = cashBoxMainFragment.f32410U0;
                            if (i16 == 1) {
                                str = "PalmPay_CashBoxOld_Trial_Cash1_Click";
                            } else if (i16 == 2) {
                                str = "PalmPay_CashBoxOld_Trial_Cash2_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 4:
                            CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxSave_Return_Click");
                            androidx.fragment.app.E activity = cashBoxMainFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 5:
                            CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 6:
                            CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 7:
                            CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Withdraw_Click");
                            if (cashBoxMainFragment.f32404O0 && p059e1.a.C("SHOW_INTERCEPT_DIALOG", true)) {
                                WithdrawInterceptDialogFragment withdrawInterceptDialogFragmentNewInstance$default = WithdrawInterceptDialogFragment.a.newInstance$default(WithdrawInterceptDialogFragment.f32335L, null, 1, null);
                                androidx.fragment.app.Z childFragmentManager4 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                                withdrawInterceptDialogFragmentNewInstance$default.show(childFragmentManager4, "showWithdrawDialog");
                            } else {
                                ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 2).navigation();
                            }
                            break;
                        case 8:
                            CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                            boolean z3 = !p059e1.a.C("cash_box_saving_shown", true);
                            cashBoxMainFragment.B(z3);
                            cashBoxMainFragment.C(z3, cashBoxMainFragment.f32407Q0);
                            p059e1.a.X("cash_box_saving_shown", z3);
                            break;
                        default:
                            CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Auto_Save_Click");
                            ARouter.getInstance().build("/manage_money/cash_box_auto_save_activity").withParcelable("auto_transfer_config", cashBoxMainFragment.f32409S0).navigation();
                            break;
                    }
                }
            });
        }
        Pa.r0.R1((TextView) this.f32391E0.getValue(), "fonts/PalmPayNum-Bold.ttf");
        Pa.r0.R1((TextView) this.f32385A0.getValue(), "fonts/PalmPayNum-Bold.ttf");
        Pa.r0.R1(y(), "fonts/PalmPayNum-Bold.ttf");
        Pa.r0.R1((TextView) this.f32425x0.getValue(), "fonts/PalmPayNum-Bold.ttf");
        com.transsnet.palmpay.core.ui.activity.Z itemClickListener = new com.transsnet.palmpay.core.ui.activity.Z(this, 16);
        eVar.getClass();
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        eVar.f6314d = itemClickListener;
        LinearLayout linearLayout = (LinearLayout) this.f32417r0.getValue();
        if (linearLayout != null) {
            final int i15 = 9;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxMainFragment f32650b;

                {
                    this.f32650b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = "PalmPay_CashBoxOld_Trial_Cash_Other_Click";
                    CashBoxMainFragment cashBoxMainFragment = this.f32650b;
                    switch (i15) {
                        case 0:
                            CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f32297C.newInstance(cashBoxMainFragment.f32405P0);
                            androidx.fragment.app.Z childFragmentManager = cashBoxMainFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showMoreFunctionDialog");
                            break;
                        case 1:
                            CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                            if (!BaseApplication.get().getUser().isTier3User()) {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxMainFragment.getString(Jc.f.mm_cashbox_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true), BaseApplication.get().getUser().getMobileMoneyAccountTier()), 14.0f, L6.b.ppColorTextDisable), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_exit)), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(22)), null, 16, null);
                                androidx.fragment.app.Z childFragmentManager2 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager2, "showCashBoxMaximumLimitTipsDialog");
                            } else {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, cashBoxMainFragment.getString(Jc.f.mm_cashbox_t3_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true)), cashBoxMainFragment.getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager3 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager3, "showCashBoxMaximumLimitTipsDialog");
                            }
                            break;
                        case 2:
                            int i16 = cashBoxMainFragment.f32410U0;
                            if (i16 == 3) {
                                str = "PalmPay_CashBoxOld_Trial_Cash3_Click";
                            } else if (i16 == 4) {
                                str = "PalmPay_CashBoxOld_Trial_Cash4_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 3:
                            int i17 = cashBoxMainFragment.f32410U0;
                            if (i17 == 1) {
                                str = "PalmPay_CashBoxOld_Trial_Cash1_Click";
                            } else if (i17 == 2) {
                                str = "PalmPay_CashBoxOld_Trial_Cash2_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 4:
                            CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxSave_Return_Click");
                            androidx.fragment.app.E activity = cashBoxMainFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 5:
                            CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 6:
                            CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 7:
                            CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Withdraw_Click");
                            if (cashBoxMainFragment.f32404O0 && p059e1.a.C("SHOW_INTERCEPT_DIALOG", true)) {
                                WithdrawInterceptDialogFragment withdrawInterceptDialogFragmentNewInstance$default = WithdrawInterceptDialogFragment.a.newInstance$default(WithdrawInterceptDialogFragment.f32335L, null, 1, null);
                                androidx.fragment.app.Z childFragmentManager4 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                                withdrawInterceptDialogFragmentNewInstance$default.show(childFragmentManager4, "showWithdrawDialog");
                            } else {
                                ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 2).navigation();
                            }
                            break;
                        case 8:
                            CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                            boolean z3 = !p059e1.a.C("cash_box_saving_shown", true);
                            cashBoxMainFragment.B(z3);
                            cashBoxMainFragment.C(z3, cashBoxMainFragment.f32407Q0);
                            p059e1.a.X("cash_box_saving_shown", z3);
                            break;
                        default:
                            CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Auto_Save_Click");
                            ARouter.getInstance().build("/manage_money/cash_box_auto_save_activity").withParcelable("auto_transfer_config", cashBoxMainFragment.f32409S0).navigation();
                            break;
                    }
                }
            });
        }
        IconicsImageView iconicsImageView3 = (IconicsImageView) this.f32390D0.getValue();
        if (iconicsImageView3 != null) {
            final int i16 = 1;
            iconicsImageView3.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxMainFragment f32650b;

                {
                    this.f32650b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = "PalmPay_CashBoxOld_Trial_Cash_Other_Click";
                    CashBoxMainFragment cashBoxMainFragment = this.f32650b;
                    switch (i16) {
                        case 0:
                            CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f32297C.newInstance(cashBoxMainFragment.f32405P0);
                            androidx.fragment.app.Z childFragmentManager = cashBoxMainFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showMoreFunctionDialog");
                            break;
                        case 1:
                            CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                            if (!BaseApplication.get().getUser().isTier3User()) {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxMainFragment.getString(Jc.f.mm_cashbox_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true), BaseApplication.get().getUser().getMobileMoneyAccountTier()), 14.0f, L6.b.ppColorTextDisable), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_exit)), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(22)), null, 16, null);
                                androidx.fragment.app.Z childFragmentManager2 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager2, "showCashBoxMaximumLimitTipsDialog");
                            } else {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, cashBoxMainFragment.getString(Jc.f.mm_cashbox_t3_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true)), cashBoxMainFragment.getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager3 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager3, "showCashBoxMaximumLimitTipsDialog");
                            }
                            break;
                        case 2:
                            int i17 = cashBoxMainFragment.f32410U0;
                            if (i17 == 3) {
                                str = "PalmPay_CashBoxOld_Trial_Cash3_Click";
                            } else if (i17 == 4) {
                                str = "PalmPay_CashBoxOld_Trial_Cash4_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 3:
                            int i18 = cashBoxMainFragment.f32410U0;
                            if (i18 == 1) {
                                str = "PalmPay_CashBoxOld_Trial_Cash1_Click";
                            } else if (i18 == 2) {
                                str = "PalmPay_CashBoxOld_Trial_Cash2_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 4:
                            CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxSave_Return_Click");
                            androidx.fragment.app.E activity = cashBoxMainFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 5:
                            CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 6:
                            CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 7:
                            CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Withdraw_Click");
                            if (cashBoxMainFragment.f32404O0 && p059e1.a.C("SHOW_INTERCEPT_DIALOG", true)) {
                                WithdrawInterceptDialogFragment withdrawInterceptDialogFragmentNewInstance$default = WithdrawInterceptDialogFragment.a.newInstance$default(WithdrawInterceptDialogFragment.f32335L, null, 1, null);
                                androidx.fragment.app.Z childFragmentManager4 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                                withdrawInterceptDialogFragmentNewInstance$default.show(childFragmentManager4, "showWithdrawDialog");
                            } else {
                                ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 2).navigation();
                            }
                            break;
                        case 8:
                            CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                            boolean z3 = !p059e1.a.C("cash_box_saving_shown", true);
                            cashBoxMainFragment.B(z3);
                            cashBoxMainFragment.C(z3, cashBoxMainFragment.f32407Q0);
                            p059e1.a.X("cash_box_saving_shown", z3);
                            break;
                        default:
                            CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Auto_Save_Click");
                            ARouter.getInstance().build("/manage_money/cash_box_auto_save_activity").withParcelable("auto_transfer_config", cashBoxMainFragment.f32409S0).navigation();
                            break;
                    }
                }
            });
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f32395H0.getValue();
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new ViewOnClickListenerC1478l(19));
        }
        int screenWidth = (ScreenUtils.getScreenWidth() - DensityUtil.dp2px(66.0f)) / 2;
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.f32384A.getValue();
        if (appCompatTextView != null) {
            appCompatTextView.setMaxWidth(screenWidth);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.f32423w.getValue();
        if (appCompatTextView2 != null) {
            appCompatTextView2.setMaxWidth(screenWidth);
        }
        if (p059e1.a.C("SHOW_NEWER_TIP", false)) {
            NewerTipDialogFragment newerTipDialogFragmentNewInstance = NewerTipDialogFragment.f32298C.newInstance();
            androidx.fragment.app.Z childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            newerTipDialogFragmentNewInstance.show(childFragmentManager, "showNewerDialog");
        }
        A(false);
        TextView textView2 = (TextView) this.f32411X.getValue();
        if (textView2 != null) {
            final int i17 = 2;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxMainFragment f32650b;

                {
                    this.f32650b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = "PalmPay_CashBoxOld_Trial_Cash_Other_Click";
                    CashBoxMainFragment cashBoxMainFragment = this.f32650b;
                    switch (i17) {
                        case 0:
                            CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f32297C.newInstance(cashBoxMainFragment.f32405P0);
                            androidx.fragment.app.Z childFragmentManager2 = cashBoxMainFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager2, "showMoreFunctionDialog");
                            break;
                        case 1:
                            CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                            if (!BaseApplication.get().getUser().isTier3User()) {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxMainFragment.getString(Jc.f.mm_cashbox_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true), BaseApplication.get().getUser().getMobileMoneyAccountTier()), 14.0f, L6.b.ppColorTextDisable), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_exit)), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(22)), null, 16, null);
                                androidx.fragment.app.Z childFragmentManager3 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager3, "showCashBoxMaximumLimitTipsDialog");
                            } else {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, cashBoxMainFragment.getString(Jc.f.mm_cashbox_t3_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true)), cashBoxMainFragment.getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager4 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager4, "showCashBoxMaximumLimitTipsDialog");
                            }
                            break;
                        case 2:
                            int i18 = cashBoxMainFragment.f32410U0;
                            if (i18 == 3) {
                                str = "PalmPay_CashBoxOld_Trial_Cash3_Click";
                            } else if (i18 == 4) {
                                str = "PalmPay_CashBoxOld_Trial_Cash4_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 3:
                            int i19 = cashBoxMainFragment.f32410U0;
                            if (i19 == 1) {
                                str = "PalmPay_CashBoxOld_Trial_Cash1_Click";
                            } else if (i19 == 2) {
                                str = "PalmPay_CashBoxOld_Trial_Cash2_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 4:
                            CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxSave_Return_Click");
                            androidx.fragment.app.E activity = cashBoxMainFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 5:
                            CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 6:
                            CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 7:
                            CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Withdraw_Click");
                            if (cashBoxMainFragment.f32404O0 && p059e1.a.C("SHOW_INTERCEPT_DIALOG", true)) {
                                WithdrawInterceptDialogFragment withdrawInterceptDialogFragmentNewInstance$default = WithdrawInterceptDialogFragment.a.newInstance$default(WithdrawInterceptDialogFragment.f32335L, null, 1, null);
                                androidx.fragment.app.Z childFragmentManager5 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager5, "getChildFragmentManager(...)");
                                withdrawInterceptDialogFragmentNewInstance$default.show(childFragmentManager5, "showWithdrawDialog");
                            } else {
                                ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 2).navigation();
                            }
                            break;
                        case 8:
                            CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                            boolean z3 = !p059e1.a.C("cash_box_saving_shown", true);
                            cashBoxMainFragment.B(z3);
                            cashBoxMainFragment.C(z3, cashBoxMainFragment.f32407Q0);
                            p059e1.a.X("cash_box_saving_shown", z3);
                            break;
                        default:
                            CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Auto_Save_Click");
                            ARouter.getInstance().build("/manage_money/cash_box_auto_save_activity").withParcelable("auto_transfer_config", cashBoxMainFragment.f32409S0).navigation();
                            break;
                    }
                }
            });
        }
        IconicsTextView iconicsTextViewY = y();
        if (iconicsTextViewY != null) {
            iconicsTextViewY.setOnClickListener(new ViewOnClickListenerC1478l(20));
        }
        ImageView imageView2 = (ImageView) this.f32414k0.getValue();
        if (imageView2 != null) {
            final int i18 = 3;
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CashBoxMainFragment f32650b;

                {
                    this.f32650b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = "PalmPay_CashBoxOld_Trial_Cash_Other_Click";
                    CashBoxMainFragment cashBoxMainFragment = this.f32650b;
                    switch (i18) {
                        case 0:
                            CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                            MoreFunctionDialogFragment moreFunctionDialogFragmentNewInstance = MoreFunctionDialogFragment.f32297C.newInstance(cashBoxMainFragment.f32405P0);
                            androidx.fragment.app.Z childFragmentManager2 = cashBoxMainFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                            moreFunctionDialogFragmentNewInstance.show(childFragmentManager2, "showMoreFunctionDialog");
                            break;
                        case 1:
                            CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                            if (!BaseApplication.get().getUser().isTier3User()) {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, new com.transsnet.palmpay.custom_view.dialog.v(cashBoxMainFragment.getString(Jc.f.mm_cashbox_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true), BaseApplication.get().getUser().getMobileMoneyAccountTier()), 14.0f, L6.b.ppColorTextDisable), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_exit)), new com.transsnet.palmpay.custom_view.dialog.c(cashBoxMainFragment.getString(Jc.f.mm_action_upgrade), new com.transsnet.palmpay.core.ui.activity.T(22)), null, 16, null);
                                androidx.fragment.app.Z childFragmentManager3 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager3, "showCashBoxMaximumLimitTipsDialog");
                            } else {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, cashBoxMainFragment.getString(Jc.f.mm_cashbox_t3_maximum_limit_tips, Pa.r0.B(cashBoxMainFragment.T0, true)), cashBoxMainFragment.getString(p025ba.k.core_confirm), null, 8, null);
                                androidx.fragment.app.Z childFragmentManager4 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager4, "showCashBoxMaximumLimitTipsDialog");
                            }
                            break;
                        case 2:
                            int i19 = cashBoxMainFragment.f32410U0;
                            if (i19 == 3) {
                                str = "PalmPay_CashBoxOld_Trial_Cash3_Click";
                            } else if (i19 == 4) {
                                str = "PalmPay_CashBoxOld_Trial_Cash4_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 3:
                            int i110 = cashBoxMainFragment.f32410U0;
                            if (i110 == 1) {
                                str = "PalmPay_CashBoxOld_Trial_Cash1_Click";
                            } else if (i110 == 2) {
                                str = "PalmPay_CashBoxOld_Trial_Cash2_Click";
                            }
                            Pa.n0.g().m("cashboxHomePageElementClick", str, "");
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TrialCashHome");
                            break;
                        case 4:
                            CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxSave_Return_Click");
                            androidx.fragment.app.E activity = cashBoxMainFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                            break;
                        case 5:
                            CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 6:
                            CashBoxMainFragment.a aVar6 = CashBoxMainFragment.f32383V0;
                            if (cashBoxMainFragment.f32403N0 != 1) {
                                Pa.i0.b0("/cashbox/interest-rates-overview.html");
                            } else {
                                Pa.i0.b0("/cashbox/interest-setting");
                            }
                            break;
                        case 7:
                            CashBoxMainFragment.a aVar7 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Withdraw_Click");
                            if (cashBoxMainFragment.f32404O0 && p059e1.a.C("SHOW_INTERCEPT_DIALOG", true)) {
                                WithdrawInterceptDialogFragment withdrawInterceptDialogFragmentNewInstance$default = WithdrawInterceptDialogFragment.a.newInstance$default(WithdrawInterceptDialogFragment.f32335L, null, 1, null);
                                androidx.fragment.app.Z childFragmentManager5 = cashBoxMainFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager5, "getChildFragmentManager(...)");
                                withdrawInterceptDialogFragmentNewInstance$default.show(childFragmentManager5, "showWithdrawDialog");
                            } else {
                                ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 2).navigation();
                            }
                            break;
                        case 8:
                            CashBoxMainFragment.a aVar8 = CashBoxMainFragment.f32383V0;
                            boolean z3 = !p059e1.a.C("cash_box_saving_shown", true);
                            cashBoxMainFragment.B(z3);
                            cashBoxMainFragment.C(z3, cashBoxMainFragment.f32407Q0);
                            p059e1.a.X("cash_box_saving_shown", z3);
                            break;
                        default:
                            CashBoxMainFragment.a aVar9 = CashBoxMainFragment.f32383V0;
                            Pa.n0.g().l("PalmPay_CashBoxOld_Auto_Save_Click");
                            ARouter.getInstance().build("/manage_money/cash_box_auto_save_activity").withParcelable("auto_transfer_config", cashBoxMainFragment.f32409S0).navigation();
                            break;
                    }
                }
            });
        }
        MarqueeViewV2 marqueeViewV2 = (MarqueeViewV2) this.f32396I0.getValue();
        if (marqueeViewV2 != null) {
            marqueeViewV2.setAdListener(new C0158z(this, 16));
        }
        super.o();
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i10 == -1 && i7 == 120) {
            this.f32405P0 = intent != null ? (GetBeforeOrderResp.StateInfo) intent.getParcelableExtra("state_info") : null;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 548) {
            z();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) this.f27327p;
        cashBoxViewModel.getClass();
        p140j8.f.s(cashBoxViewModel, new C0576q(1, null), cashBoxViewModel.f32750p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) this.f27327p;
        QueryCashBoxStatReq queryCashBoxStatReq = new QueryCashBoxStatReq(0, 0, 0, 0, 0, 0, 0L, 0L, 255, null);
        cashBoxViewModel2.getClass();
        p140j8.f.s(cashBoxViewModel2, new Qc.H(queryCashBoxStatReq, null), cashBoxViewModel2.f32733A, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        if (!this.f32402M0) {
            ((CashBoxViewModel) this.f27327p).f();
        }
        this.f32402M0 = false;
    }

    public final IconicsTextView y() {
        return (IconicsTextView) this.f32426y0.getValue();
    }

    public final void z() {
        int iD = p059e1.a.D(0, "invest_interest_disable");
        this.f32403N0 = iD;
        p355xf.t tVar = this.f32422v0;
        if (iD == 1) {
            TextView textView = (TextView) tVar.getValue();
            if (textView != null) {
                textView.setText(getString(p025ba.k.core_disabled));
                return;
            }
            return;
        }
        TextView textView2 = (TextView) tVar.getValue();
        if (textView2 != null) {
            GetInterestRateConfigResp getInterestRateConfigResp = Kc.f.f4999b.getInstance().f5000a;
            String str = String.format("%s%%", Arrays.copyOf(new Object[]{Pa.r0.z0(String.valueOf(Pa.r0.w1(getInterestRateConfigResp != null ? getInterestRateConfigResp.getProductRate() : null, "100")))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView2.setText(str.concat(" p.a."));
        }
    }
}
