package com.transsnet.palmpay.account.ui.activity;

import Ab.D;
import Bc.C0104a;
import C0.G;
import C9.C0138e;
import C9.Q;
import F8.h;
import Gb.T;
import La.i;
import N8.ViewOnClickListenerC0480y;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.account.bean.RealNameAuthInfoRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckApplyTier3Rsp;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelV2Activity;
import com.transsnet.palmpay.account.ui.viewmodel.PalmPayLevelViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import io.fastkv.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p082f9.b;
import p082f9.d;
import p082f9.e;
import p294tb.K;
import p298tf.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "用户等级页", path = "/account/palmpayLevel")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/PalmPayLevelV2Activity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/account/ui/viewmodel/PalmPayLevelViewModel;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPalmPayLevelV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PalmPayLevelV2Activity.kt\ncom/transsnet/palmpay/account/ui/activity/PalmPayLevelV2Activity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n171#2,12:460\n215#2:472\n1#3:473\n1869#4,2:474\n*S KotlinDebug\n*F\n+ 1 PalmPayLevelV2Activity.kt\ncom/transsnet/palmpay/account/ui/activity/PalmPayLevelV2Activity\n*L\n208#1:460,12\n208#1:472\n416#1:474,2\n*E\n"})
public final class PalmPayLevelV2Activity extends BaseMvvmActivity<PalmPayLevelViewModel> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f25925p = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f25926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f25927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f25928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PreCheckApplyTier3Rsp f25929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25930g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0104a f25931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RealNameAuthInfoRsp f25932j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f25933o = C2131j.b(new i(11));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void navigateFromKycComplete(@Nullable Context context) {
            if (context == null) {
                return;
            }
            if (ActivityUtils.isActivityExistsInStack((Class<?>) PalmPayLevelV2Activity.class)) {
                ActivityUtils.finishToActivity((Class<?>) PalmPayLevelV2Activity.class, false);
            } else {
                ARouter.getInstance().build("/account/palmpayLevel").withFlags(268468224).navigation(context);
            }
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        C0104a c0104a;
        String mobileMoneyAccountTier = BaseApplication.get().getUser().getMobileMoneyAccountTier();
        n0.g().u(new ViewEvent("kyc_level_page_exposure").add(FirebaseAnalytics.Param.LEVEL, mobileMoneyAccountTier));
        if (Intrinsics.c(mobileMoneyAccountTier, "1")) {
            C0104a c0104a2 = this.f25931i;
            if (c0104a2 != null) {
                ((PpButton) c0104a2.f660v).setText("Upgrade to Tier 2");
            }
        } else if (Intrinsics.c(mobileMoneyAccountTier, "2") && (c0104a = this.f25931i) != null) {
            ((PpButton) c0104a.f660v).setText("Upgrade to Tier 3");
        }
        C0104a c0104a3 = this.f25931i;
        if (c0104a3 != null) {
            ((PpButton) c0104a3.f660v).setOnClickListener(new T(18, mobileMoneyAccountTier, this));
        }
        C0104a c0104a4 = this.f25931i;
        org.chromium.support_lib_boundary.util.b.c(c0104a4 != null ? (SingleAdView) c0104a4.f652d : null);
        C0104a c0104a5 = this.f25931i;
        org.chromium.support_lib_boundary.util.b.c(c0104a5 != null ? (SingleAdView) c0104a5.f653e : null);
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("_dialog_title");
            String stringExtra2 = intent.getStringExtra("_dialog_message");
            if (TextUtils.isEmpty(stringExtra2)) {
                return;
            }
            n.O(this, 0, null, stringExtra, null, null, null, stringExtra2, Integer.valueOf(h.ac_confirm), null, null, null, null, null, null, false, 0, 8388219);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundDark, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(F8.e.ac_activity_palm_pay_level_v2, (ViewGroup) null, false);
        int i7 = F8.d.bottomAd;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null) {
            i7 = F8.d.bottomAd2;
            SingleAdView singleAdView2 = (SingleAdView) p059e1.a.m(i7, viewInflate);
            if (singleAdView2 != null && (viewM = p059e1.a.m((i7 = F8.d.bottomView), viewInflate)) != null) {
                Pb.a.bind(viewM);
                i7 = F8.d.cornerAd;
                SingleAdView singleAdView3 = (SingleAdView) p059e1.a.m(i7, viewInflate);
                if (singleAdView3 != null) {
                    i7 = F8.d.layoutCurrentLevelStub;
                    ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
                    if (viewStub != null) {
                        i7 = F8.d.layoutLevelBenefitStub;
                        ViewStub viewStub2 = (ViewStub) p059e1.a.m(i7, viewInflate);
                        if (viewStub2 != null) {
                            i7 = F8.d.layoutLinkIdStub;
                            ViewStub viewStub3 = (ViewStub) p059e1.a.m(i7, viewInflate);
                            if (viewStub3 != null) {
                                i7 = F8.d.layoutTier3Review;
                                CardView cardView = (CardView) p059e1.a.m(i7, viewInflate);
                                if (cardView != null) {
                                    i7 = F8.d.titleBar;
                                    PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                    if (ppTitleBar != null) {
                                        i7 = F8.d.tvT3Info;
                                        IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                        if (iconicsTextView != null) {
                                            i7 = F8.d.tvT3PendingInfo;
                                            IconicsTextView iconicsTextView2 = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                            if (iconicsTextView2 != null) {
                                                i7 = F8.d.tvUpgrade;
                                                PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                                                if (ppButton != null) {
                                                    i7 = F8.d.viewContainer;
                                                    if (((ScrollView) p059e1.a.m(i7, viewInflate)) != null) {
                                                        C0104a c0104a = new C0104a((ConstraintLayout) viewInflate, singleAdView, singleAdView2, singleAdView3, viewStub, viewStub2, viewStub3, cardView, ppTitleBar, iconicsTextView, iconicsTextView2, ppButton);
                                                        this.f25931i = c0104a;
                                                        return c0104a;
                                                    }
                                                }
                                            }
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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m(boolean z3, PreCheckApplyTier3Rsp preCheckApplyTier3Rsp) {
        this.f25929f = preCheckApplyTier3Rsp;
        if (!z3) {
            if ((preCheckApplyTier3Rsp != null ? preCheckApplyTier3Rsp.lastApplyOrder : null) != null && preCheckApplyTier3Rsp != null && !preCheckApplyTier3Rsp.isApplyFailed()) {
                n.O(this, 0, null, "Upgrade under review", null, null, null, "Your upgrade application is currently under review. Please be patient and wait for review.", Integer.valueOf(k.core_got_it), null, new ViewOnClickListenerC0480y(this, 1), null, null, null, null, false, 0, 8387195);
                return;
            }
            PreCheckApplyTier3Rsp preCheckApplyTier3Rsp2 = this.f25929f;
            if (preCheckApplyTier3Rsp2 == null || preCheckApplyTier3Rsp2.canApply || TextUtils.isEmpty(preCheckApplyTier3Rsp2.errorMsg)) {
                PreCheckApplyTier3Rsp preCheckApplyTier3Rsp3 = this.f25929f;
                if (preCheckApplyTier3Rsp3 != null) {
                    preCheckApplyTier3Rsp3.applyTier3(this.f25932j);
                }
            } else {
                PreCheckApplyTier3Rsp preCheckApplyTier3Rsp4 = this.f25929f;
                n.O(this, 0, null, null, null, null, null, preCheckApplyTier3Rsp4 != null ? preCheckApplyTier3Rsp4.errorMsg : null, Integer.valueOf(k.core_got_it), null, null, null, null, null, null, false, 0, 8388223);
            }
        }
        n0.g().k((ClickEvent) G.f("PalmPay_T3UpdateResults", "Result", "success"));
        C0104a c0104a = this.f25931i;
        if (c0104a != null) {
            ((PpButton) c0104a.f660v).setEnabled(true);
        }
        if (preCheckApplyTier3Rsp.lastApplyOrder == null) {
            C0104a c0104a2 = this.f25931i;
            if (c0104a2 != null) {
                p220oa.h.C((PpButton) c0104a2.f660v);
            }
            n();
            C0104a c0104a3 = this.f25931i;
            if (c0104a3 != null) {
                p220oa.h.c((CardView) c0104a3.f658o);
            }
        } else {
            C0104a c0104a4 = this.f25931i;
            if (c0104a4 != null) {
                p220oa.h.C((CardView) c0104a4.f658o);
            }
            C0104a c0104a5 = this.f25931i;
            if (c0104a5 != null) {
                p220oa.h.C((PpButton) c0104a5.f660v);
            }
            n();
            if (preCheckApplyTier3Rsp.lastApplyOrder != null) {
                if (preCheckApplyTier3Rsp.isApplyFailed()) {
                    C0104a c0104a6 = this.f25931i;
                    if (c0104a6 != null) {
                        p220oa.h.C((IconicsTextView) c0104a6.f659p);
                    }
                    C0104a c0104a7 = this.f25931i;
                    if (c0104a7 != null) {
                        p220oa.h.c((IconicsTextView) c0104a7.t);
                    }
                    C0104a c0104a8 = this.f25931i;
                    if (c0104a8 != null) {
                        ((CardView) c0104a8.f658o).setCardBackgroundColor(CommonViewExtKt.colorInt(L6.b.ppColorErrorBackground, this));
                    }
                } else {
                    C0104a c0104a9 = this.f25931i;
                    if (c0104a9 != null) {
                        ((CardView) c0104a9.f658o).setCardBackgroundColor(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
                    }
                    C0104a c0104a10 = this.f25931i;
                    if (c0104a10 != null) {
                        p220oa.h.c((IconicsTextView) c0104a10.f659p);
                    }
                    C0104a c0104a11 = this.f25931i;
                    if (c0104a11 != null) {
                        ((PpButton) c0104a11.f660v).setEnabled(false);
                    }
                    C0104a c0104a12 = this.f25931i;
                    if (c0104a12 != null) {
                        p220oa.h.C((IconicsTextView) c0104a12.t);
                    }
                }
                C0104a c0104a13 = this.f25931i;
                if (c0104a13 != null) {
                    ((CardView) c0104a13.f658o).setOnClickListener(new T(19, preCheckApplyTier3Rsp, this));
                }
            }
        }
        List<String> list = preCheckApplyTier3Rsp.imgUrlList;
        if (list != null) {
            List<String> list2 = list.isEmpty() ? null : list;
            if (list2 != null) {
                for (String str : list2) {
                    if (!TextUtils.isEmpty(str)) {
                        r0.D1(this, str);
                    }
                }
            }
        }
    }

    public final void n() {
        SingleAdView singleAdView;
        SingleAdView singleAdView2;
        ConstraintLayout constraintLayout;
        C0104a c0104a = this.f25931i;
        if (c0104a != null && (singleAdView2 = (SingleAdView) c0104a.f654f) != null) {
            singleAdView2.setSlotId(CommonViewExtKt.string(h.ac_ad_palmpay_level_corner_slot_id, (c0104a == null || (constraintLayout = (ConstraintLayout) c0104a.f650b) == null) ? null : constraintLayout.getContext()));
        }
        C0104a c0104a2 = this.f25931i;
        if (c0104a2 != null && (singleAdView = (SingleAdView) c0104a2.f654f) != null) {
            p220oa.h.c(singleAdView);
        }
        C0104a c0104a3 = this.f25931i;
        org.chromium.support_lib_boundary.util.b.c(c0104a3 != null ? (SingleAdView) c0104a3.f654f : null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f25930g = true;
        ((Handler) this.f25933o.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f25930g) {
            BaseApplication.get().getUserDataSource().a().k(f.f42629b).i(p071ef.b.a()).subscribe(new D(this, 22));
            ((PalmPayLevelViewModel) l()).d(false);
            this.f25930g = false;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        final int i7 = 0;
        n.B(this, ((PalmPayLevelViewModel) l()).f26430e, this, new Function2(this) { // from class: N8.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PalmPayLevelV2Activity f6262b;

            {
                this.f6262b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:187:0x0333 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:188:0x0335  */
            /* JADX WARN: Code duplicated, block: B:190:0x0344  */
            /* JADX WARN: Code duplicated, block: B:192:0x034d  */
            /* JADX WARN: Code duplicated, block: B:194:0x0354  */
            /* JADX WARN: Code duplicated, block: B:196:0x035d  */
            /* JADX WARN: Code duplicated, block: B:198:0x0366  */
            /* JADX WARN: Code duplicated, block: B:200:0x036f  */
            /* JADX WARN: Code duplicated, block: B:231:0x03da  */
            /* JADX WARN: Code duplicated, block: B:233:0x03de  */
            /* JADX WARN: Code duplicated, block: B:236:0x03e9  */
            /* JADX WARN: Code duplicated, block: B:34:0x008f  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C0104a c0104a;
                C0104a c0104a2;
                boolean z3;
                TextView textView;
                View viewInflate;
                String strF;
                Long l5;
                String strConcat;
                String str;
                switch (i7) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        CommonBeanResult response = (CommonBeanResult) obj2;
                        PalmPayLevelV2Activity.a aVar = PalmPayLevelV2Activity.f25925p;
                        Intrinsics.checkNotNullParameter(response, "response");
                        boolean zIsSuccess = response.isSuccess();
                        PalmPayLevelV2Activity palmPayLevelV2Activity = this.f6262b;
                        if (zIsSuccess) {
                            boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                            T data = response.data;
                            Intrinsics.checkNotNullExpressionValue(data, "data");
                            palmPayLevelV2Activity.m(zBooleanValue, (PreCheckApplyTier3Rsp) data);
                        } else {
                            Pa.n0.g().k(((ClickEvent) C0.G.f("PalmPay_T3UpdateResults", "Result", "fail")).add("ErrorCode", response.getRespMsg()));
                            if (Intrinsics.c(bool, Boolean.FALSE)) {
                                io.fastkv.n.O(palmPayLevelV2Activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, response.getRespMsg(), Integer.valueOf(p025ba.k.core_confirm), null, null, null, null, null, null, false, 0, 8388221);
                            }
                        }
                        return Unit.f38893a;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        CommonBeanResult rsp = (CommonBeanResult) obj2;
                        PalmPayLevelV2Activity.a aVar2 = PalmPayLevelV2Activity.f25925p;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        boolean zIsSuccess2 = rsp.isSuccess();
                        PalmPayLevelV2Activity palmPayLevelV2Activity2 = this.f6262b;
                        if (zIsSuccess2) {
                            palmPayLevelV2Activity2.f25932j = (RealNameAuthInfoRsp) rsp.data;
                        }
                        C0104a c0104a3 = palmPayLevelV2Activity2.f25931i;
                        if (c0104a3 != null) {
                            ((PpButton) c0104a3.f660v).b(false);
                        }
                        if (!Intrinsics.c(bool2, Boolean.TRUE)) {
                            RealNameAuthInfoRsp realNameAuthInfoRsp = (RealNameAuthInfoRsp) rsp.data;
                            if (realNameAuthInfoRsp != null) {
                                if (palmPayLevelV2Activity2.f25926c == null) {
                                    C0104a c0104a4 = palmPayLevelV2Activity2.f25931i;
                                    ViewStub viewStub = c0104a4 != null ? (ViewStub) c0104a4.f655g : null;
                                    palmPayLevelV2Activity2.getIntent().getBooleanExtra("extra_flag", false);
                                    p082f9.d dVar = new p082f9.d();
                                    View viewInflate2 = viewStub != null ? viewStub.inflate() : null;
                                    dVar.f36433b = viewInflate2;
                                    new WeakReference(palmPayLevelV2Activity2);
                                    if (viewInflate2 != null) {
                                        dVar.f36432a = viewInflate2.getContext();
                                        int i10 = F8.d.groupTier;
                                        Group group = (Group) p059e1.a.m(i10, viewInflate2);
                                        if (group != null) {
                                            i10 = F8.d.guideline;
                                            if (((Guideline) p059e1.a.m(i10, viewInflate2)) != null) {
                                                i10 = F8.d.ivBg;
                                                AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i10, viewInflate2);
                                                if (appCompatImageView != null) {
                                                    i10 = F8.d.ivDailyLimitTips;
                                                    IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i10, viewInflate2);
                                                    if (iconicsImageView != null) {
                                                        i10 = F8.d.ivStateBg;
                                                        if (((AppCompatImageView) p059e1.a.m(i10, viewInflate2)) != null) {
                                                            i10 = F8.d.ivTier;
                                                            ImageView imageView = (ImageView) p059e1.a.m(i10, viewInflate2);
                                                            if (imageView != null) {
                                                                i10 = F8.d.layoutState;
                                                                Group group2 = (Group) p059e1.a.m(i10, viewInflate2);
                                                                if (group2 != null) {
                                                                    i10 = F8.d.space;
                                                                    if (((Space) p059e1.a.m(i10, viewInflate2)) != null) {
                                                                        i10 = F8.d.tvAmount1;
                                                                        TextView textView2 = (TextView) p059e1.a.m(i10, viewInflate2);
                                                                        if (textView2 != null) {
                                                                            i10 = F8.d.tvAmount2;
                                                                            TextView textView3 = (TextView) p059e1.a.m(i10, viewInflate2);
                                                                            if (textView3 != null) {
                                                                                i10 = F8.d.tvDailyLimit;
                                                                                TextView textView4 = (TextView) p059e1.a.m(i10, viewInflate2);
                                                                                if (textView4 != null) {
                                                                                    i10 = F8.d.tvMaxBalance;
                                                                                    TextView textView5 = (TextView) p059e1.a.m(i10, viewInflate2);
                                                                                    if (textView5 != null) {
                                                                                        i10 = F8.d.tvQuota;
                                                                                        IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i10, viewInflate2);
                                                                                        if (iconicsTextView != null) {
                                                                                            i10 = F8.d.tvState;
                                                                                            if (((IconicsTextView) p059e1.a.m(i10, viewInflate2)) != null) {
                                                                                                i10 = F8.d.tvTier;
                                                                                                TextView textView6 = (TextView) p059e1.a.m(i10, viewInflate2);
                                                                                                if (textView6 != null) {
                                                                                                    dVar.f36434c = new C0104a((ConstraintLayout) viewInflate2, group, appCompatImageView, iconicsImageView, imageView, group2, textView2, textView3, textView4, textView5, iconicsTextView, textView6);
                                                                                                    iconicsTextView.setOnClickListener(new p054dd.d(6));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i10)));
                                    }
                                    palmPayLevelV2Activity2.f25926c = dVar;
                                }
                                if (palmPayLevelV2Activity2.f25927d == null) {
                                    C0104a c0104a5 = palmPayLevelV2Activity2.f25931i;
                                    palmPayLevelV2Activity2.f25927d = new p082f9.b(c0104a5 != null ? (ViewStub) c0104a5.f657j : null, palmPayLevelV2Activity2);
                                }
                                p082f9.d dVar2 = palmPayLevelV2Activity2.f25926c;
                                if (dVar2 != null && realNameAuthInfoRsp.limitT1 != null && realNameAuthInfoRsp.getCurrentTierLimit() != null) {
                                    C0104a c0104a6 = dVar2.f36434c;
                                    if (c0104a6 != null) {
                                        TextView textView7 = (TextView) c0104a6.f660v;
                                        String str2 = realNameAuthInfoRsp.mobileMoneyAccountTier;
                                        if (str2 == null || (strConcat = "Tier ".concat(str2)) == null) {
                                            strConcat = "Unverified";
                                        }
                                        textView7.setText(strConcat);
                                    }
                                    if (c0104a6 != null) {
                                        p220oa.h.s((Group) c0104a6.f652d, true);
                                    }
                                    if (c0104a6 != null) {
                                        p220oa.h.s((ImageView) c0104a6.f655g, true);
                                    }
                                    if (c0104a6 != null) {
                                        p220oa.h.s((TextView) c0104a6.f658o, true);
                                    }
                                    if (c0104a6 != null) {
                                        p220oa.h.s(c0104a6.f659p, true);
                                    }
                                    if (c0104a6 != null) {
                                        p220oa.h.s((Group) c0104a6.f656i, false);
                                    }
                                    long jLongValue = realNameAuthInfoRsp.transactionLimit;
                                    if (jLongValue <= 0) {
                                        RealNameAuthInfoRsp.TierLimit currentTierLimit = realNameAuthInfoRsp.getCurrentTierLimit();
                                        jLongValue = (currentTierLimit == null || (l5 = currentTierLimit.transactionLimit) == null) ? 0L : l5.longValue();
                                    }
                                    if (c0104a6 != null) {
                                        ((TextView) c0104a6.f658o).setText(r0.F(jLongValue));
                                    }
                                    if (c0104a6 != null) {
                                        TextView textView8 = c0104a6.f659p;
                                        RealNameAuthInfoRsp.TierLimit currentTierLimit2 = realNameAuthInfoRsp.getCurrentTierLimit();
                                        Long l6 = currentTierLimit2 != null ? currentTierLimit2.balanceLimit : null;
                                        if (l6 == null) {
                                            Context context = dVar2.f36432a;
                                            strF = context != null ? context.getString(F8.h.ac_unlimited_2) : null;
                                        } else {
                                            strF = r0.F(l6.longValue());
                                        }
                                        textView8.setText(strF);
                                    }
                                    if (c0104a6 != null) {
                                        p220oa.h.s((IconicsTextView) c0104a6.f651c, false);
                                    }
                                    String str3 = realNameAuthInfoRsp.mobileMoneyAccountTier;
                                    if (str3 != null) {
                                        switch (str3) {
                                            case "1":
                                                if (c0104a6 != null) {
                                                    ((ImageView) c0104a6.f655g).setImageResource(com.transsnet.palmpay.custom_view.r.cv_tier_1);
                                                }
                                            case "2":
                                                if (c0104a6 != null) {
                                                    ((ImageView) c0104a6.f655g).setImageResource(com.transsnet.palmpay.custom_view.r.cv_tier_2);
                                                }
                                            case "3":
                                                if (c0104a6 != null) {
                                                    p220oa.h.s((IconicsTextView) c0104a6.f651c, realNameAuthInfoRsp.canShowDefault);
                                                }
                                            default:
                                                if (c0104a6 != null) {
                                                    ((TextView) c0104a6.f660v).setText(r0.H0(p025ba.k.core_unverified));
                                                }
                                        }
                                    } else if (c0104a6 != null) {
                                        ((TextView) c0104a6.f660v).setText(r0.H0(p025ba.k.core_unverified));
                                    }
                                }
                                p082f9.b bVar = palmPayLevelV2Activity2.f25927d;
                                if (bVar != null) {
                                    bVar.g(realNameAuthInfoRsp);
                                }
                                String str4 = realNameAuthInfoRsp.mobileMoneyAccountTier;
                                if (str4 != null) {
                                    switch (str4) {
                                        case "1":
                                            C0104a c0104a7 = palmPayLevelV2Activity2.f25931i;
                                            if (c0104a7 != null) {
                                                ((PpButton) c0104a7.f660v).setEnabled(true);
                                            }
                                            C0104a c0104a8 = palmPayLevelV2Activity2.f25931i;
                                            if (c0104a8 != null) {
                                                p220oa.h.s((PpButton) c0104a8.f660v, true);
                                            }
                                            palmPayLevelV2Activity2.n();
                                            break;
                                        case "2":
                                            ((PalmPayLevelViewModel) palmPayLevelV2Activity2.l()).e(true);
                                            break;
                                        case "3":
                                            C0104a c0104a9 = palmPayLevelV2Activity2.f25931i;
                                            if (c0104a9 != null) {
                                                p220oa.h.s((PpButton) c0104a9.f660v, false);
                                            }
                                            C0104a c0104a10 = palmPayLevelV2Activity2.f25931i;
                                            if (c0104a10 != null) {
                                                p220oa.h.s((SingleAdView) c0104a10.f654f, false);
                                            }
                                            break;
                                        default:
                                            c0104a = palmPayLevelV2Activity2.f25931i;
                                            if (c0104a != null) {
                                                ((PpButton) c0104a.f660v).setEnabled(true);
                                            }
                                            c0104a2 = palmPayLevelV2Activity2.f25931i;
                                            if (c0104a2 != null) {
                                                p220oa.h.s((PpButton) c0104a2.f660v, true);
                                            }
                                            palmPayLevelV2Activity2.n();
                                            break;
                                    }
                                } else {
                                    c0104a = palmPayLevelV2Activity2.f25931i;
                                    if (c0104a != null) {
                                        ((PpButton) c0104a.f660v).setEnabled(true);
                                    }
                                    c0104a2 = palmPayLevelV2Activity2.f25931i;
                                    if (c0104a2 != null) {
                                        p220oa.h.s((PpButton) c0104a2.f660v, true);
                                    }
                                    palmPayLevelV2Activity2.n();
                                }
                                if (!TextUtils.isEmpty(realNameAuthInfoRsp.mobileMoneyAccountTier)) {
                                    BaseApplication.get().getUser().setMobileMoneyAccountTier(realNameAuthInfoRsp.mobileMoneyAccountTier);
                                }
                                if (realNameAuthInfoRsp.limitT1 != null) {
                                    ArrayList list = new ArrayList();
                                    RealNameAuthInfoRsp.TierLimit tierLimit = realNameAuthInfoRsp.limitT1;
                                    if (tierLimit != null) {
                                        String strConcat2 = "Tier ".concat("1");
                                        if (strConcat2 == null) {
                                            strConcat2 = "Unknown";
                                        }
                                        tierLimit.name = strConcat2;
                                    }
                                    RealNameAuthInfoRsp.TierLimit limitT1 = realNameAuthInfoRsp.limitT1;
                                    Intrinsics.checkNotNullExpressionValue(limitT1, "limitT1");
                                    list.add(limitT1);
                                    RealNameAuthInfoRsp.TierLimit tierLimit2 = realNameAuthInfoRsp.limitT2;
                                    if (tierLimit2 != null) {
                                        String strConcat3 = "Tier ".concat("2");
                                        if (strConcat3 == null) {
                                            strConcat3 = "Unknown";
                                        }
                                        tierLimit2.name = strConcat3;
                                    }
                                    RealNameAuthInfoRsp.TierLimit limitT2 = realNameAuthInfoRsp.limitT2;
                                    Intrinsics.checkNotNullExpressionValue(limitT2, "limitT2");
                                    list.add(limitT2);
                                    RealNameAuthInfoRsp.TierLimit tierLimit3 = realNameAuthInfoRsp.limitT3;
                                    if (tierLimit3 != null) {
                                        String strConcat4 = "Tier ".concat("3");
                                        tierLimit3.name = strConcat4 != null ? strConcat4 : "Unknown";
                                    }
                                    RealNameAuthInfoRsp.TierLimit limitT3 = realNameAuthInfoRsp.limitT3;
                                    Intrinsics.checkNotNullExpressionValue(limitT3, "limitT3");
                                    list.add(limitT3);
                                    if (palmPayLevelV2Activity2.f25928e == null) {
                                        C0104a c0104a11 = palmPayLevelV2Activity2.f25931i;
                                        ViewStub viewStub2 = c0104a11 != null ? (ViewStub) c0104a11.f656i : null;
                                        p082f9.e eVar = new p082f9.e();
                                        if (viewStub2 != null && (viewInflate = viewStub2.inflate()) != null) {
                                            int i11 = F8.d.glDailyLimit;
                                            if (((Guideline) p059e1.a.m(i11, viewInflate)) != null) {
                                                i11 = F8.d.glDailyLimit1;
                                                if (((Guideline) p059e1.a.m(i11, viewInflate)) != null) {
                                                    i11 = F8.d.glDailyLimit2;
                                                    if (((Guideline) p059e1.a.m(i11, viewInflate)) != null) {
                                                        i11 = F8.d.glDailyLimit3;
                                                        if (((Guideline) p059e1.a.m(i11, viewInflate)) != null) {
                                                            i11 = F8.d.ivTier1Selected;
                                                            IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i11, viewInflate);
                                                            if (iconicsImageView2 != null) {
                                                                i11 = F8.d.ivTier2Selected;
                                                                IconicsImageView iconicsImageView3 = (IconicsImageView) p059e1.a.m(i11, viewInflate);
                                                                if (iconicsImageView3 != null) {
                                                                    i11 = F8.d.ivTier3Selected;
                                                                    IconicsImageView iconicsImageView4 = (IconicsImageView) p059e1.a.m(i11, viewInflate);
                                                                    if (iconicsImageView4 != null) {
                                                                        i11 = F8.d.layoutTier1;
                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i11, viewInflate);
                                                                        if (constraintLayout != null) {
                                                                            i11 = F8.d.layoutTier2;
                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i11, viewInflate);
                                                                            if (constraintLayout2 != null) {
                                                                                i11 = F8.d.layoutTier3;
                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) p059e1.a.m(i11, viewInflate);
                                                                                if (constraintLayout3 != null) {
                                                                                    i11 = F8.d.tvHeaderDailyLimit;
                                                                                    TextView textView9 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                    if (textView9 != null) {
                                                                                        i11 = F8.d.tvHeaderLevel;
                                                                                        TextView textView10 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                        if (textView10 != null) {
                                                                                            i11 = F8.d.tvHeaderMaxBalance;
                                                                                            TextView textView11 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                            if (textView11 != null) {
                                                                                                i11 = F8.d.tvTier1;
                                                                                                TextView textView12 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                                if (textView12 != null) {
                                                                                                    i11 = F8.d.tvTier1Amount1;
                                                                                                    TextView textView13 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                                    if (textView13 != null) {
                                                                                                        i11 = F8.d.tvTier1Amount2;
                                                                                                        TextView textView14 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                                        if (textView14 != null) {
                                                                                                            i11 = F8.d.tvTier1NextLevel;
                                                                                                            TextView textView15 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                                            if (textView15 != null) {
                                                                                                                i11 = F8.d.tvTier2;
                                                                                                                TextView textView16 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                                                if (textView16 != null) {
                                                                                                                    i11 = F8.d.tvTier2Amount1;
                                                                                                                    TextView textView17 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                                                    if (textView17 != null) {
                                                                                                                        i11 = F8.d.tvTier2Amount2;
                                                                                                                        TextView textView18 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                                                        if (textView18 != null) {
                                                                                                                            i11 = F8.d.tvTier2NextLevel;
                                                                                                                            TextView textView19 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                                                            if (textView19 != null) {
                                                                                                                                i11 = F8.d.tvTier3;
                                                                                                                                TextView textView20 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                                                                if (textView20 != null) {
                                                                                                                                    i11 = F8.d.tvTier3Amount1;
                                                                                                                                    TextView textView21 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                                                                    if (textView21 != null) {
                                                                                                                                        i11 = F8.d.tvTier3Amount2;
                                                                                                                                        TextView textView22 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                                                                        if (textView22 != null) {
                                                                                                                                            i11 = F8.d.tvTier3NextLevel;
                                                                                                                                            TextView textView23 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                                                                            if (textView23 != null) {
                                                                                                                                                i11 = F8.d.tvTitle;
                                                                                                                                                TextView textView24 = (TextView) p059e1.a.m(i11, viewInflate);
                                                                                                                                                if (textView24 != null) {
                                                                                                                                                    eVar.f36435a = new I8.x((ConstraintLayout) viewInflate, iconicsImageView2, iconicsImageView3, iconicsImageView4, constraintLayout, constraintLayout2, constraintLayout3, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24);
                                                                                                                                                    r0.R1(textView13, "fonts/PalmPayNum-Regular.ttf");
                                                                                                                                                    r0.R1(textView14, "fonts/PalmPayNum-Regular.ttf");
                                                                                                                                                    r0.R1(textView17, "fonts/PalmPayNum-Regular.ttf");
                                                                                                                                                    r0.R1(textView18, "fonts/PalmPayNum-Regular.ttf");
                                                                                                                                                    r0.R1(textView21, "fonts/PalmPayNum-Regular.ttf");
                                                                                                                                                    r0.R1(textView22, "fonts/PalmPayNum-Regular.ttf");
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
                                        }
                                        palmPayLevelV2Activity2.f25928e = eVar;
                                    }
                                    p082f9.e eVar2 = palmPayLevelV2Activity2.f25928e;
                                    if (eVar2 != null) {
                                        String str5 = realNameAuthInfoRsp.mobileMoneyAccountTier;
                                        Intrinsics.checkNotNullParameter(list, "list");
                                        int size = list.size();
                                        I8.x xVar = eVar2.f36435a;
                                        if (size >= 3) {
                                            if (xVar != null) {
                                                p220oa.h.s(xVar.f4260a, true);
                                            }
                                            byte b7 = Intrinsics.c(str5, "1") ? (byte) 1 : Intrinsics.c(str5, "2") ? (byte) 2 : (byte) -1;
                                            eVar2.b(xVar != null ? xVar.f4264e : null, xVar != null ? xVar.f4261b : null, xVar != null ? xVar.f4270p : null, xVar != null ? xVar.f4272w : null, xVar != null ? xVar.t : null, xVar != null ? xVar.f4271v : null, (RealNameAuthInfoRsp.TierLimit) list.get(0), Intrinsics.c(str5, "1"), b7 == 0);
                                            eVar2.b(xVar != null ? xVar.f4265f : null, xVar != null ? xVar.f4262c : null, xVar != null ? xVar.f4251A : null, xVar != null ? xVar.f4254H : null, xVar != null ? xVar.f4252B : null, xVar != null ? xVar.f4253C : null, (RealNameAuthInfoRsp.TierLimit) list.get(1), Intrinsics.c(str5, "2"), b7 == 1);
                                            ConstraintLayout constraintLayout4 = xVar != null ? xVar.f4266g : null;
                                            IconicsImageView iconicsImageView5 = xVar != null ? xVar.f4263d : null;
                                            TextView textView25 = xVar != null ? xVar.f4255L : null;
                                            TextView textView26 = xVar != null ? xVar.f4258X : null;
                                            TextView textView27 = xVar != null ? xVar.f4256M : null;
                                            TextView textView28 = xVar != null ? xVar.f4257Q : null;
                                            RealNameAuthInfoRsp.TierLimit tierLimit4 = (RealNameAuthInfoRsp.TierLimit) list.get(2);
                                            boolean zC = Intrinsics.c(str5, "3");
                                            if (b7 == 2) {
                                                textView = textView25;
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                                textView = textView25;
                                            }
                                            eVar2.b(constraintLayout4, iconicsImageView5, textView, textView26, textView27, textView28, tierLimit4, zC, z3);
                                        } else if (xVar != null) {
                                            p220oa.h.s(xVar.f4260a, false);
                                        }
                                    }
                                }
                            }
                        } else if (rsp.isSuccess()) {
                            RealNameAuthInfoRsp realNameAuthInfoRsp2 = (RealNameAuthInfoRsp) rsp.data;
                            if (TextUtils.isEmpty(realNameAuthInfoRsp2 != null ? realNameAuthInfoRsp2.jumpPath : null)) {
                                String mobileMoneyAccountTier = BaseApplication.get().getUser().getMobileMoneyAccountTier();
                                if ("1".equals(mobileMoneyAccountTier)) {
                                    String stringExtra = palmPayLevelV2Activity2.getIntent().getStringExtra("jump_source");
                                    if (stringExtra == null) {
                                        str = "MP_KYC_LEVEL";
                                    } else {
                                        str = !TextUtils.isEmpty(stringExtra) ? stringExtra : null;
                                        if (str == null) {
                                            str = "MP_KYC_LEVEL";
                                        }
                                    }
                                    com.palmpay.lib.apm.launchcounter.util.d.H("/account/upgrade", "jump_source", str);
                                } else if ("2".equals(mobileMoneyAccountTier)) {
                                    Pa.n0.g().l("KYC_KycVerify_Click");
                                    PreCheckApplyTier3Rsp preCheckApplyTier3Rsp = palmPayLevelV2Activity2.f25929f;
                                    if (preCheckApplyTier3Rsp == null) {
                                        ((PalmPayLevelViewModel) palmPayLevelV2Activity2.l()).e(false);
                                    } else {
                                        palmPayLevelV2Activity2.m(false, preCheckApplyTier3Rsp);
                                    }
                                }
                            } else {
                                RealNameAuthInfoRsp realNameAuthInfoRsp3 = (RealNameAuthInfoRsp) rsp.data;
                                ActivityUtils.startActivity(Pa.F.a(palmPayLevelV2Activity2, realNameAuthInfoRsp3 != null ? realNameAuthInfoRsp3.jumpPath : null));
                            }
                        }
                        return Unit.f38893a;
                }
            }
        }, new Function1(this) { // from class: N8.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PalmPayLevelV2Activity f6264b;

            {
                this.f6264b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PpButton ppButton;
                PalmPayLevelV2Activity palmPayLevelV2Activity = this.f6264b;
                String it = (String) obj;
                switch (i7) {
                    case 0:
                        PalmPayLevelV2Activity.a aVar = PalmPayLevelV2Activity.f25925p;
                        Intrinsics.checkNotNullParameter(it, "it");
                        p220oa.h.x(palmPayLevelV2Activity, it);
                        break;
                    default:
                        PalmPayLevelV2Activity.a aVar2 = PalmPayLevelV2Activity.f25925p;
                        Intrinsics.checkNotNullParameter(it, "it");
                        C0104a c0104a = palmPayLevelV2Activity.f25931i;
                        if (c0104a != null && (ppButton = (PpButton) c0104a.f660v) != null) {
                            ppButton.b(false);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, true, null, 224);
        ((PalmPayLevelViewModel) l()).d(false);
        final int i10 = 1;
        n.B(this, ((PalmPayLevelViewModel) l()).f26431f, this, new Function2(this) { // from class: N8.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PalmPayLevelV2Activity f6262b;

            {
                this.f6262b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:187:0x0333 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:188:0x0335  */
            /* JADX WARN: Code duplicated, block: B:190:0x0344  */
            /* JADX WARN: Code duplicated, block: B:192:0x034d  */
            /* JADX WARN: Code duplicated, block: B:194:0x0354  */
            /* JADX WARN: Code duplicated, block: B:196:0x035d  */
            /* JADX WARN: Code duplicated, block: B:198:0x0366  */
            /* JADX WARN: Code duplicated, block: B:200:0x036f  */
            /* JADX WARN: Code duplicated, block: B:231:0x03da  */
            /* JADX WARN: Code duplicated, block: B:233:0x03de  */
            /* JADX WARN: Code duplicated, block: B:236:0x03e9  */
            /* JADX WARN: Code duplicated, block: B:34:0x008f  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C0104a c0104a;
                C0104a c0104a2;
                boolean z3;
                TextView textView;
                View viewInflate;
                String strF;
                Long l5;
                String strConcat;
                String str;
                switch (i10) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        CommonBeanResult response = (CommonBeanResult) obj2;
                        PalmPayLevelV2Activity.a aVar = PalmPayLevelV2Activity.f25925p;
                        Intrinsics.checkNotNullParameter(response, "response");
                        boolean zIsSuccess = response.isSuccess();
                        PalmPayLevelV2Activity palmPayLevelV2Activity = this.f6262b;
                        if (zIsSuccess) {
                            boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                            T data = response.data;
                            Intrinsics.checkNotNullExpressionValue(data, "data");
                            palmPayLevelV2Activity.m(zBooleanValue, (PreCheckApplyTier3Rsp) data);
                        } else {
                            Pa.n0.g().k(((ClickEvent) C0.G.f("PalmPay_T3UpdateResults", "Result", "fail")).add("ErrorCode", response.getRespMsg()));
                            if (Intrinsics.c(bool, Boolean.FALSE)) {
                                io.fastkv.n.O(palmPayLevelV2Activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, response.getRespMsg(), Integer.valueOf(p025ba.k.core_confirm), null, null, null, null, null, null, false, 0, 8388221);
                            }
                        }
                        return Unit.f38893a;
                    default:
                        Boolean bool2 = (Boolean) obj;
                        CommonBeanResult rsp = (CommonBeanResult) obj2;
                        PalmPayLevelV2Activity.a aVar2 = PalmPayLevelV2Activity.f25925p;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        boolean zIsSuccess2 = rsp.isSuccess();
                        PalmPayLevelV2Activity palmPayLevelV2Activity2 = this.f6262b;
                        if (zIsSuccess2) {
                            palmPayLevelV2Activity2.f25932j = (RealNameAuthInfoRsp) rsp.data;
                        }
                        C0104a c0104a3 = palmPayLevelV2Activity2.f25931i;
                        if (c0104a3 != null) {
                            ((PpButton) c0104a3.f660v).b(false);
                        }
                        if (!Intrinsics.c(bool2, Boolean.TRUE)) {
                            RealNameAuthInfoRsp realNameAuthInfoRsp = (RealNameAuthInfoRsp) rsp.data;
                            if (realNameAuthInfoRsp != null) {
                                if (palmPayLevelV2Activity2.f25926c == null) {
                                    C0104a c0104a4 = palmPayLevelV2Activity2.f25931i;
                                    ViewStub viewStub = c0104a4 != null ? (ViewStub) c0104a4.f655g : null;
                                    palmPayLevelV2Activity2.getIntent().getBooleanExtra("extra_flag", false);
                                    p082f9.d dVar = new p082f9.d();
                                    View viewInflate2 = viewStub != null ? viewStub.inflate() : null;
                                    dVar.f36433b = viewInflate2;
                                    new WeakReference(palmPayLevelV2Activity2);
                                    if (viewInflate2 != null) {
                                        dVar.f36432a = viewInflate2.getContext();
                                        int i11 = F8.d.groupTier;
                                        Group group = (Group) p059e1.a.m(i11, viewInflate2);
                                        if (group != null) {
                                            i11 = F8.d.guideline;
                                            if (((Guideline) p059e1.a.m(i11, viewInflate2)) != null) {
                                                i11 = F8.d.ivBg;
                                                AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i11, viewInflate2);
                                                if (appCompatImageView != null) {
                                                    i11 = F8.d.ivDailyLimitTips;
                                                    IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i11, viewInflate2);
                                                    if (iconicsImageView != null) {
                                                        i11 = F8.d.ivStateBg;
                                                        if (((AppCompatImageView) p059e1.a.m(i11, viewInflate2)) != null) {
                                                            i11 = F8.d.ivTier;
                                                            ImageView imageView = (ImageView) p059e1.a.m(i11, viewInflate2);
                                                            if (imageView != null) {
                                                                i11 = F8.d.layoutState;
                                                                Group group2 = (Group) p059e1.a.m(i11, viewInflate2);
                                                                if (group2 != null) {
                                                                    i11 = F8.d.space;
                                                                    if (((Space) p059e1.a.m(i11, viewInflate2)) != null) {
                                                                        i11 = F8.d.tvAmount1;
                                                                        TextView textView2 = (TextView) p059e1.a.m(i11, viewInflate2);
                                                                        if (textView2 != null) {
                                                                            i11 = F8.d.tvAmount2;
                                                                            TextView textView3 = (TextView) p059e1.a.m(i11, viewInflate2);
                                                                            if (textView3 != null) {
                                                                                i11 = F8.d.tvDailyLimit;
                                                                                TextView textView4 = (TextView) p059e1.a.m(i11, viewInflate2);
                                                                                if (textView4 != null) {
                                                                                    i11 = F8.d.tvMaxBalance;
                                                                                    TextView textView5 = (TextView) p059e1.a.m(i11, viewInflate2);
                                                                                    if (textView5 != null) {
                                                                                        i11 = F8.d.tvQuota;
                                                                                        IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i11, viewInflate2);
                                                                                        if (iconicsTextView != null) {
                                                                                            i11 = F8.d.tvState;
                                                                                            if (((IconicsTextView) p059e1.a.m(i11, viewInflate2)) != null) {
                                                                                                i11 = F8.d.tvTier;
                                                                                                TextView textView6 = (TextView) p059e1.a.m(i11, viewInflate2);
                                                                                                if (textView6 != null) {
                                                                                                    dVar.f36434c = new C0104a((ConstraintLayout) viewInflate2, group, appCompatImageView, iconicsImageView, imageView, group2, textView2, textView3, textView4, textView5, iconicsTextView, textView6);
                                                                                                    iconicsTextView.setOnClickListener(new p054dd.d(6));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i11)));
                                    }
                                    palmPayLevelV2Activity2.f25926c = dVar;
                                }
                                if (palmPayLevelV2Activity2.f25927d == null) {
                                    C0104a c0104a5 = palmPayLevelV2Activity2.f25931i;
                                    palmPayLevelV2Activity2.f25927d = new p082f9.b(c0104a5 != null ? (ViewStub) c0104a5.f657j : null, palmPayLevelV2Activity2);
                                }
                                p082f9.d dVar2 = palmPayLevelV2Activity2.f25926c;
                                if (dVar2 != null && realNameAuthInfoRsp.limitT1 != null && realNameAuthInfoRsp.getCurrentTierLimit() != null) {
                                    C0104a c0104a6 = dVar2.f36434c;
                                    if (c0104a6 != null) {
                                        TextView textView7 = (TextView) c0104a6.f660v;
                                        String str2 = realNameAuthInfoRsp.mobileMoneyAccountTier;
                                        if (str2 == null || (strConcat = "Tier ".concat(str2)) == null) {
                                            strConcat = "Unverified";
                                        }
                                        textView7.setText(strConcat);
                                    }
                                    if (c0104a6 != null) {
                                        p220oa.h.s((Group) c0104a6.f652d, true);
                                    }
                                    if (c0104a6 != null) {
                                        p220oa.h.s((ImageView) c0104a6.f655g, true);
                                    }
                                    if (c0104a6 != null) {
                                        p220oa.h.s((TextView) c0104a6.f658o, true);
                                    }
                                    if (c0104a6 != null) {
                                        p220oa.h.s(c0104a6.f659p, true);
                                    }
                                    if (c0104a6 != null) {
                                        p220oa.h.s((Group) c0104a6.f656i, false);
                                    }
                                    long jLongValue = realNameAuthInfoRsp.transactionLimit;
                                    if (jLongValue <= 0) {
                                        RealNameAuthInfoRsp.TierLimit currentTierLimit = realNameAuthInfoRsp.getCurrentTierLimit();
                                        jLongValue = (currentTierLimit == null || (l5 = currentTierLimit.transactionLimit) == null) ? 0L : l5.longValue();
                                    }
                                    if (c0104a6 != null) {
                                        ((TextView) c0104a6.f658o).setText(r0.F(jLongValue));
                                    }
                                    if (c0104a6 != null) {
                                        TextView textView8 = c0104a6.f659p;
                                        RealNameAuthInfoRsp.TierLimit currentTierLimit2 = realNameAuthInfoRsp.getCurrentTierLimit();
                                        Long l6 = currentTierLimit2 != null ? currentTierLimit2.balanceLimit : null;
                                        if (l6 == null) {
                                            Context context = dVar2.f36432a;
                                            strF = context != null ? context.getString(F8.h.ac_unlimited_2) : null;
                                        } else {
                                            strF = r0.F(l6.longValue());
                                        }
                                        textView8.setText(strF);
                                    }
                                    if (c0104a6 != null) {
                                        p220oa.h.s((IconicsTextView) c0104a6.f651c, false);
                                    }
                                    String str3 = realNameAuthInfoRsp.mobileMoneyAccountTier;
                                    if (str3 != null) {
                                        switch (str3) {
                                            case "1":
                                                if (c0104a6 != null) {
                                                    ((ImageView) c0104a6.f655g).setImageResource(com.transsnet.palmpay.custom_view.r.cv_tier_1);
                                                }
                                            case "2":
                                                if (c0104a6 != null) {
                                                    ((ImageView) c0104a6.f655g).setImageResource(com.transsnet.palmpay.custom_view.r.cv_tier_2);
                                                }
                                            case "3":
                                                if (c0104a6 != null) {
                                                    p220oa.h.s((IconicsTextView) c0104a6.f651c, realNameAuthInfoRsp.canShowDefault);
                                                }
                                            default:
                                                if (c0104a6 != null) {
                                                    ((TextView) c0104a6.f660v).setText(r0.H0(p025ba.k.core_unverified));
                                                }
                                        }
                                    } else if (c0104a6 != null) {
                                        ((TextView) c0104a6.f660v).setText(r0.H0(p025ba.k.core_unverified));
                                    }
                                }
                                p082f9.b bVar = palmPayLevelV2Activity2.f25927d;
                                if (bVar != null) {
                                    bVar.g(realNameAuthInfoRsp);
                                }
                                String str4 = realNameAuthInfoRsp.mobileMoneyAccountTier;
                                if (str4 != null) {
                                    switch (str4) {
                                        case "1":
                                            C0104a c0104a7 = palmPayLevelV2Activity2.f25931i;
                                            if (c0104a7 != null) {
                                                ((PpButton) c0104a7.f660v).setEnabled(true);
                                            }
                                            C0104a c0104a8 = palmPayLevelV2Activity2.f25931i;
                                            if (c0104a8 != null) {
                                                p220oa.h.s((PpButton) c0104a8.f660v, true);
                                            }
                                            palmPayLevelV2Activity2.n();
                                            break;
                                        case "2":
                                            ((PalmPayLevelViewModel) palmPayLevelV2Activity2.l()).e(true);
                                            break;
                                        case "3":
                                            C0104a c0104a9 = palmPayLevelV2Activity2.f25931i;
                                            if (c0104a9 != null) {
                                                p220oa.h.s((PpButton) c0104a9.f660v, false);
                                            }
                                            C0104a c0104a10 = palmPayLevelV2Activity2.f25931i;
                                            if (c0104a10 != null) {
                                                p220oa.h.s((SingleAdView) c0104a10.f654f, false);
                                            }
                                            break;
                                        default:
                                            c0104a = palmPayLevelV2Activity2.f25931i;
                                            if (c0104a != null) {
                                                ((PpButton) c0104a.f660v).setEnabled(true);
                                            }
                                            c0104a2 = palmPayLevelV2Activity2.f25931i;
                                            if (c0104a2 != null) {
                                                p220oa.h.s((PpButton) c0104a2.f660v, true);
                                            }
                                            palmPayLevelV2Activity2.n();
                                            break;
                                    }
                                } else {
                                    c0104a = palmPayLevelV2Activity2.f25931i;
                                    if (c0104a != null) {
                                        ((PpButton) c0104a.f660v).setEnabled(true);
                                    }
                                    c0104a2 = palmPayLevelV2Activity2.f25931i;
                                    if (c0104a2 != null) {
                                        p220oa.h.s((PpButton) c0104a2.f660v, true);
                                    }
                                    palmPayLevelV2Activity2.n();
                                }
                                if (!TextUtils.isEmpty(realNameAuthInfoRsp.mobileMoneyAccountTier)) {
                                    BaseApplication.get().getUser().setMobileMoneyAccountTier(realNameAuthInfoRsp.mobileMoneyAccountTier);
                                }
                                if (realNameAuthInfoRsp.limitT1 != null) {
                                    ArrayList list = new ArrayList();
                                    RealNameAuthInfoRsp.TierLimit tierLimit = realNameAuthInfoRsp.limitT1;
                                    if (tierLimit != null) {
                                        String strConcat2 = "Tier ".concat("1");
                                        if (strConcat2 == null) {
                                            strConcat2 = "Unknown";
                                        }
                                        tierLimit.name = strConcat2;
                                    }
                                    RealNameAuthInfoRsp.TierLimit limitT1 = realNameAuthInfoRsp.limitT1;
                                    Intrinsics.checkNotNullExpressionValue(limitT1, "limitT1");
                                    list.add(limitT1);
                                    RealNameAuthInfoRsp.TierLimit tierLimit2 = realNameAuthInfoRsp.limitT2;
                                    if (tierLimit2 != null) {
                                        String strConcat3 = "Tier ".concat("2");
                                        if (strConcat3 == null) {
                                            strConcat3 = "Unknown";
                                        }
                                        tierLimit2.name = strConcat3;
                                    }
                                    RealNameAuthInfoRsp.TierLimit limitT2 = realNameAuthInfoRsp.limitT2;
                                    Intrinsics.checkNotNullExpressionValue(limitT2, "limitT2");
                                    list.add(limitT2);
                                    RealNameAuthInfoRsp.TierLimit tierLimit3 = realNameAuthInfoRsp.limitT3;
                                    if (tierLimit3 != null) {
                                        String strConcat4 = "Tier ".concat("3");
                                        tierLimit3.name = strConcat4 != null ? strConcat4 : "Unknown";
                                    }
                                    RealNameAuthInfoRsp.TierLimit limitT3 = realNameAuthInfoRsp.limitT3;
                                    Intrinsics.checkNotNullExpressionValue(limitT3, "limitT3");
                                    list.add(limitT3);
                                    if (palmPayLevelV2Activity2.f25928e == null) {
                                        C0104a c0104a11 = palmPayLevelV2Activity2.f25931i;
                                        ViewStub viewStub2 = c0104a11 != null ? (ViewStub) c0104a11.f656i : null;
                                        p082f9.e eVar = new p082f9.e();
                                        if (viewStub2 != null && (viewInflate = viewStub2.inflate()) != null) {
                                            int i12 = F8.d.glDailyLimit;
                                            if (((Guideline) p059e1.a.m(i12, viewInflate)) != null) {
                                                i12 = F8.d.glDailyLimit1;
                                                if (((Guideline) p059e1.a.m(i12, viewInflate)) != null) {
                                                    i12 = F8.d.glDailyLimit2;
                                                    if (((Guideline) p059e1.a.m(i12, viewInflate)) != null) {
                                                        i12 = F8.d.glDailyLimit3;
                                                        if (((Guideline) p059e1.a.m(i12, viewInflate)) != null) {
                                                            i12 = F8.d.ivTier1Selected;
                                                            IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i12, viewInflate);
                                                            if (iconicsImageView2 != null) {
                                                                i12 = F8.d.ivTier2Selected;
                                                                IconicsImageView iconicsImageView3 = (IconicsImageView) p059e1.a.m(i12, viewInflate);
                                                                if (iconicsImageView3 != null) {
                                                                    i12 = F8.d.ivTier3Selected;
                                                                    IconicsImageView iconicsImageView4 = (IconicsImageView) p059e1.a.m(i12, viewInflate);
                                                                    if (iconicsImageView4 != null) {
                                                                        i12 = F8.d.layoutTier1;
                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i12, viewInflate);
                                                                        if (constraintLayout != null) {
                                                                            i12 = F8.d.layoutTier2;
                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i12, viewInflate);
                                                                            if (constraintLayout2 != null) {
                                                                                i12 = F8.d.layoutTier3;
                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) p059e1.a.m(i12, viewInflate);
                                                                                if (constraintLayout3 != null) {
                                                                                    i12 = F8.d.tvHeaderDailyLimit;
                                                                                    TextView textView9 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                    if (textView9 != null) {
                                                                                        i12 = F8.d.tvHeaderLevel;
                                                                                        TextView textView10 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                        if (textView10 != null) {
                                                                                            i12 = F8.d.tvHeaderMaxBalance;
                                                                                            TextView textView11 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                            if (textView11 != null) {
                                                                                                i12 = F8.d.tvTier1;
                                                                                                TextView textView12 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                                if (textView12 != null) {
                                                                                                    i12 = F8.d.tvTier1Amount1;
                                                                                                    TextView textView13 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                                    if (textView13 != null) {
                                                                                                        i12 = F8.d.tvTier1Amount2;
                                                                                                        TextView textView14 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                                        if (textView14 != null) {
                                                                                                            i12 = F8.d.tvTier1NextLevel;
                                                                                                            TextView textView15 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                                            if (textView15 != null) {
                                                                                                                i12 = F8.d.tvTier2;
                                                                                                                TextView textView16 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                                                if (textView16 != null) {
                                                                                                                    i12 = F8.d.tvTier2Amount1;
                                                                                                                    TextView textView17 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                                                    if (textView17 != null) {
                                                                                                                        i12 = F8.d.tvTier2Amount2;
                                                                                                                        TextView textView18 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                                                        if (textView18 != null) {
                                                                                                                            i12 = F8.d.tvTier2NextLevel;
                                                                                                                            TextView textView19 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                                                            if (textView19 != null) {
                                                                                                                                i12 = F8.d.tvTier3;
                                                                                                                                TextView textView20 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                                                                if (textView20 != null) {
                                                                                                                                    i12 = F8.d.tvTier3Amount1;
                                                                                                                                    TextView textView21 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                                                                    if (textView21 != null) {
                                                                                                                                        i12 = F8.d.tvTier3Amount2;
                                                                                                                                        TextView textView22 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                                                                        if (textView22 != null) {
                                                                                                                                            i12 = F8.d.tvTier3NextLevel;
                                                                                                                                            TextView textView23 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                                                                            if (textView23 != null) {
                                                                                                                                                i12 = F8.d.tvTitle;
                                                                                                                                                TextView textView24 = (TextView) p059e1.a.m(i12, viewInflate);
                                                                                                                                                if (textView24 != null) {
                                                                                                                                                    eVar.f36435a = new I8.x((ConstraintLayout) viewInflate, iconicsImageView2, iconicsImageView3, iconicsImageView4, constraintLayout, constraintLayout2, constraintLayout3, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24);
                                                                                                                                                    r0.R1(textView13, "fonts/PalmPayNum-Regular.ttf");
                                                                                                                                                    r0.R1(textView14, "fonts/PalmPayNum-Regular.ttf");
                                                                                                                                                    r0.R1(textView17, "fonts/PalmPayNum-Regular.ttf");
                                                                                                                                                    r0.R1(textView18, "fonts/PalmPayNum-Regular.ttf");
                                                                                                                                                    r0.R1(textView21, "fonts/PalmPayNum-Regular.ttf");
                                                                                                                                                    r0.R1(textView22, "fonts/PalmPayNum-Regular.ttf");
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
                                        }
                                        palmPayLevelV2Activity2.f25928e = eVar;
                                    }
                                    p082f9.e eVar2 = palmPayLevelV2Activity2.f25928e;
                                    if (eVar2 != null) {
                                        String str5 = realNameAuthInfoRsp.mobileMoneyAccountTier;
                                        Intrinsics.checkNotNullParameter(list, "list");
                                        int size = list.size();
                                        I8.x xVar = eVar2.f36435a;
                                        if (size >= 3) {
                                            if (xVar != null) {
                                                p220oa.h.s(xVar.f4260a, true);
                                            }
                                            byte b7 = Intrinsics.c(str5, "1") ? (byte) 1 : Intrinsics.c(str5, "2") ? (byte) 2 : (byte) -1;
                                            eVar2.b(xVar != null ? xVar.f4264e : null, xVar != null ? xVar.f4261b : null, xVar != null ? xVar.f4270p : null, xVar != null ? xVar.f4272w : null, xVar != null ? xVar.t : null, xVar != null ? xVar.f4271v : null, (RealNameAuthInfoRsp.TierLimit) list.get(0), Intrinsics.c(str5, "1"), b7 == 0);
                                            eVar2.b(xVar != null ? xVar.f4265f : null, xVar != null ? xVar.f4262c : null, xVar != null ? xVar.f4251A : null, xVar != null ? xVar.f4254H : null, xVar != null ? xVar.f4252B : null, xVar != null ? xVar.f4253C : null, (RealNameAuthInfoRsp.TierLimit) list.get(1), Intrinsics.c(str5, "2"), b7 == 1);
                                            ConstraintLayout constraintLayout4 = xVar != null ? xVar.f4266g : null;
                                            IconicsImageView iconicsImageView5 = xVar != null ? xVar.f4263d : null;
                                            TextView textView25 = xVar != null ? xVar.f4255L : null;
                                            TextView textView26 = xVar != null ? xVar.f4258X : null;
                                            TextView textView27 = xVar != null ? xVar.f4256M : null;
                                            TextView textView28 = xVar != null ? xVar.f4257Q : null;
                                            RealNameAuthInfoRsp.TierLimit tierLimit4 = (RealNameAuthInfoRsp.TierLimit) list.get(2);
                                            boolean zC = Intrinsics.c(str5, "3");
                                            if (b7 == 2) {
                                                textView = textView25;
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                                textView = textView25;
                                            }
                                            eVar2.b(constraintLayout4, iconicsImageView5, textView, textView26, textView27, textView28, tierLimit4, zC, z3);
                                        } else if (xVar != null) {
                                            p220oa.h.s(xVar.f4260a, false);
                                        }
                                    }
                                }
                            }
                        } else if (rsp.isSuccess()) {
                            RealNameAuthInfoRsp realNameAuthInfoRsp2 = (RealNameAuthInfoRsp) rsp.data;
                            if (TextUtils.isEmpty(realNameAuthInfoRsp2 != null ? realNameAuthInfoRsp2.jumpPath : null)) {
                                String mobileMoneyAccountTier = BaseApplication.get().getUser().getMobileMoneyAccountTier();
                                if ("1".equals(mobileMoneyAccountTier)) {
                                    String stringExtra = palmPayLevelV2Activity2.getIntent().getStringExtra("jump_source");
                                    if (stringExtra == null) {
                                        str = "MP_KYC_LEVEL";
                                    } else {
                                        str = !TextUtils.isEmpty(stringExtra) ? stringExtra : null;
                                        if (str == null) {
                                            str = "MP_KYC_LEVEL";
                                        }
                                    }
                                    com.palmpay.lib.apm.launchcounter.util.d.H("/account/upgrade", "jump_source", str);
                                } else if ("2".equals(mobileMoneyAccountTier)) {
                                    Pa.n0.g().l("KYC_KycVerify_Click");
                                    PreCheckApplyTier3Rsp preCheckApplyTier3Rsp = palmPayLevelV2Activity2.f25929f;
                                    if (preCheckApplyTier3Rsp == null) {
                                        ((PalmPayLevelViewModel) palmPayLevelV2Activity2.l()).e(false);
                                    } else {
                                        palmPayLevelV2Activity2.m(false, preCheckApplyTier3Rsp);
                                    }
                                }
                            } else {
                                RealNameAuthInfoRsp realNameAuthInfoRsp3 = (RealNameAuthInfoRsp) rsp.data;
                                ActivityUtils.startActivity(Pa.F.a(palmPayLevelV2Activity2, realNameAuthInfoRsp3 != null ? realNameAuthInfoRsp3.jumpPath : null));
                            }
                        }
                        return Unit.f38893a;
                }
            }
        }, new Function1(this) { // from class: N8.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PalmPayLevelV2Activity f6264b;

            {
                this.f6264b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PpButton ppButton;
                PalmPayLevelV2Activity palmPayLevelV2Activity = this.f6264b;
                String it = (String) obj;
                switch (i10) {
                    case 0:
                        PalmPayLevelV2Activity.a aVar = PalmPayLevelV2Activity.f25925p;
                        Intrinsics.checkNotNullParameter(it, "it");
                        p220oa.h.x(palmPayLevelV2Activity, it);
                        break;
                    default:
                        PalmPayLevelV2Activity.a aVar2 = PalmPayLevelV2Activity.f25925p;
                        Intrinsics.checkNotNullParameter(it, "it");
                        C0104a c0104a = palmPayLevelV2Activity.f25931i;
                        if (c0104a != null && (ppButton = (PpButton) c0104a.f660v) != null) {
                            ppButton.b(false);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, false, null, 224);
        l lVar = ((PalmPayLevelViewModel) l()).f26436p;
        if (lVar != null) {
            lVar.e(this, new C0138e(new Q(22, this, this), (byte) 0, 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        C0104a c0104a = this.f25931i;
        if (c0104a != null) {
            ((PpTitleBar) c0104a.f651c).setBackButtonClickListener(new ViewOnClickListenerC0480y(this, 0));
        }
        getOnBackPressedDispatcher().a(this, new K(this, 2));
    }
}
