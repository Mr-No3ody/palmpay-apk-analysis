package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.f;
import Ac.i;
import C0.G;
import Fe.I;
import G.g;
import Me.A;
import Pa.F;
import Pa.RunnableC0527y;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import androidx.core.provider.m;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.utils.TextUtils;
import com.facebook.imagepipeline.nativecode.b;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.horcrux.svg.d0;
import com.palmpay.lib.apm.LibApm;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.adsdk.widgets.snackbar.SnackBarRecycle;
import com.transsnet.adsdk.widgets.splash.SplashAdView;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.bean.HomeFragmentCache;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.callback.HomeAcCallback;
import com.transsnet.palmpay.core.init.PpPerfTrace;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.managemoney.ui.view.c;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.activity.welcome.WelcomeBackActivity;
import com.transsnet.palmpay.ui.dialog.SendMoneyHandlerHomeDialog;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.ui.fragment.HomeMeFragment;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.ui.fragment.SplashFragment;
import com.transsnet.palmpay.ui.widget.HomeFragmentContainer;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.PerfTimer;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.viewmodule.PalmZoneViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p102ge.C1745s;
import p102ge.r;
import p102ge.u;
import p102ge.v;
import p189me.jessyan.autosize.internal.CancelAdapt;
import p355xf.C2131j;
import p355xf.t;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "PalmPay首页/Home", path = "/main/home")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/HomeActivity;", "Lcom/transsnet/palmpay/core/base/h;", "Lme/jessyan/autosize/internal/CancelAdapt;", "Lcom/transsnet/palmpay/core/callback/HomeAcCallback;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/transsnet/palmpay/ui/activity/HomeActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,848:1\n580#2,4:849\n580#2,4:854\n562#2,10:858\n1#3:853\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/transsnet/palmpay/ui/activity/HomeActivity\n*L\n118#1:849,4\n225#1:854,4\n338#1:858,10\n*E\n"})
public final class HomeActivity extends h implements CancelAdapt, HomeAcCallback {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f34463H = new a(null);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static boolean f34464L = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public FrameLayout f34465A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f34466B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SplashFragment f34470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f34471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HomeDialogState f34472e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f34474g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FrameLayout f34475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f34476j;
    public r t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f34479v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Trace f34480w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f34473f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedBlockingQueue f34477o = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f34478p = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f34467C = C2131j.b(new c(12));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String applyRouterRules$lambda$0(Intent intent, String key) {
            String queryParameter;
            Intrinsics.checkNotNullParameter(key, "key");
            Uri data = intent.getData();
            return (data == null || (queryParameter = data.getQueryParameter(key)) == null) ? intent.getStringExtra(key) : queryParameter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String applyRouterRules$lambda$6(Intent intent, String key) {
            String queryParameter;
            Intrinsics.checkNotNullParameter(key, "key");
            Uri data = intent.getData();
            return (data == null || (queryParameter = data.getQueryParameter(key)) == null) ? intent.getStringExtra(key) : queryParameter;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0048 A[PHI: r1
          0x0048: PHI (r1v7 java.lang.String) = (r1v6 java.lang.String), (r1v13 java.lang.String) binds: [B:15:0x0036, B:20:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x0077  */
        /* JADX WARN: Code duplicated, block: B:33:0x008e  */
        /* JADX WARN: Code duplicated, block: B:36:0x0095  */
        /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:58:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:71:0x00ff A[PHI: r2
          0x00ff: PHI (r2v11 java.lang.String) = (r2v10 java.lang.String), (r2v17 java.lang.String) binds: [B:64:0x00ee, B:69:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:81:0x0125  */
        /* JADX WARN: Code duplicated, block: B:84:0x012b  */
        /* JADX WARN: Code duplicated, block: B:87:0x013b  */
        /* JADX WARN: Code duplicated, block: B:90:0x0156  */
        /* JADX WARN: Code duplicated, block: B:92:0x015c  */
        @JvmStatic
        @Nullable
        public final Intent applyRouterRules(@NotNull final Intent intent) {
            String str;
            Intent intentA;
            boolean z3;
            Bundle extras;
            Intent intentA2;
            Bundle bundle;
            Bundle extras2;
            String strApplyRouterRules$lambda$0;
            String strApplyRouterRules$lambda$1;
            String str2;
            String string;
            String string2;
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!intent.getBooleanExtra("_route_rules_applied", false)) {
                if (p059e1.a.C("_show_rn_new_loan_home", false)) {
                    str = "LoanTabHome";
                } else {
                    str = p059e1.a.C("_show_rn_loan_home", false) ? "LoanHome" : null;
                }
                if (str != null) {
                    String stringExtra = intent.getStringExtra("tab");
                    if (stringExtra == null) {
                        Uri data = intent.getData();
                        stringExtra = data != null ? data.getQueryParameter("tab") : null;
                        if (stringExtra != null) {
                            if (stringExtra.equals("finance")) {
                                intentA2.putExtra("rn_module_name", str);
                                final int i7 = 0;
                                Eb.a.a(intent, new Function1() { // from class: ge.t
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        switch (i7) {
                                            case 0:
                                                return HomeActivity.a.applyRouterRules$lambda$0(intent, (String) obj);
                                            default:
                                                return HomeActivity.a.applyRouterRules$lambda$6(intent, (String) obj);
                                        }
                                    }
                                });
                                bundle = new Bundle();
                                extras2 = intent.getExtras();
                                if (extras2 != null) {
                                    Bundle bundle2 = new Bundle(extras2);
                                    bundle2.remove("tab");
                                    bundle2.remove("_route_rules_applied");
                                    intentA2.putExtras(bundle2);
                                    bundle.putAll(bundle2);
                                }
                                strApplyRouterRules$lambda$0 = applyRouterRules$lambda$0(intent, LoanHomeSource.TRACK_PARAM_KEY);
                                if (strApplyRouterRules$lambda$0 != null) {
                                    if (StringsKt.F(strApplyRouterRules$lambda$0)) {
                                        strApplyRouterRules$lambda$0 = null;
                                    }
                                    if (strApplyRouterRules$lambda$0 != null) {
                                        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, strApplyRouterRules$lambda$0);
                                    }
                                }
                                strApplyRouterRules$lambda$1 = applyRouterRules$lambda$0(intent, LoanHomeSource.TRACK_PARAM_KEY);
                                if (strApplyRouterRules$lambda$1 != null) {
                                    if (StringsKt.F(strApplyRouterRules$lambda$1)) {
                                    }
                                    if (str2 != null) {
                                        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str2);
                                    }
                                }
                                l.h(bundle, str);
                                intentA2.putExtra("rn_key_params", bundle);
                                if (b.o(str) != null) {
                                    intentA2.addFlags(537001984);
                                    return intentA2;
                                }
                                intentA2.addFlags(268435456);
                                return intentA2;
                            }
                        }
                    } else if (stringExtra.equals("finance") && (intentA2 = F.a(BaseApplication.getContext(), "/coreImpl/rn_host")) != null) {
                        intentA2.putExtra("rn_module_name", str);
                        final int i10 = 0;
                        Eb.a.a(intent, new Function1() { // from class: ge.t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i10) {
                                    case 0:
                                        return HomeActivity.a.applyRouterRules$lambda$0(intent, (String) obj);
                                    default:
                                        return HomeActivity.a.applyRouterRules$lambda$6(intent, (String) obj);
                                }
                            }
                        });
                        bundle = new Bundle();
                        extras2 = intent.getExtras();
                        if (extras2 != null) {
                            Bundle bundle3 = new Bundle(extras2);
                            bundle3.remove("tab");
                            bundle3.remove("_route_rules_applied");
                            intentA2.putExtras(bundle3);
                            bundle.putAll(bundle3);
                        }
                        strApplyRouterRules$lambda$0 = applyRouterRules$lambda$0(intent, LoanHomeSource.TRACK_PARAM_KEY);
                        if (strApplyRouterRules$lambda$0 != null) {
                            if (StringsKt.F(strApplyRouterRules$lambda$0)) {
                                strApplyRouterRules$lambda$0 = null;
                            }
                            if (strApplyRouterRules$lambda$0 != null && ((string2 = bundle.getString(LoanHomeSource.TRACK_PARAM_KEY)) == null || StringsKt.F(string2))) {
                                bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, strApplyRouterRules$lambda$0);
                            }
                        }
                        strApplyRouterRules$lambda$1 = applyRouterRules$lambda$0(intent, LoanHomeSource.TRACK_PARAM_KEY);
                        if (strApplyRouterRules$lambda$1 != null) {
                            str2 = StringsKt.F(strApplyRouterRules$lambda$1) ? null : strApplyRouterRules$lambda$1;
                            if (str2 != null && ((string = bundle.getString(LoanHomeSource.TRACK_PARAM_KEY)) == null || StringsKt.F(string))) {
                                bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str2);
                            }
                        }
                        l.h(bundle, str);
                        intentA2.putExtra("rn_key_params", bundle);
                        if (b.o(str) != null) {
                            intentA2.addFlags(537001984);
                            return intentA2;
                        }
                        intentA2.addFlags(268435456);
                        return intentA2;
                    }
                } else if (p059e1.a.C("_show_new_loan_home", false)) {
                    String stringExtra2 = intent.getStringExtra("tab");
                    if (stringExtra2 == null) {
                        Uri data2 = intent.getData();
                        stringExtra2 = data2 != null ? data2.getQueryParameter("tab") : null;
                        if (stringExtra2 != null) {
                            if (stringExtra2.equals("finance")) {
                                final int i11 = 1;
                                Function1 function1 = new Function1() { // from class: ge.t
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        switch (i11) {
                                            case 0:
                                                return HomeActivity.a.applyRouterRules$lambda$0(intent, (String) obj);
                                            default:
                                                return HomeActivity.a.applyRouterRules$lambda$6(intent, (String) obj);
                                        }
                                    }
                                };
                                String strU = Eb.a.u(intent, function1);
                                if (strU != null) {
                                }
                                Eb.a.a(intent, function1);
                                if (z3) {
                                    Eb.a.f2267a = LoanHomeSource.INSTANCE.normalize(LoanHomeSource.BOTTOM_TAB);
                                }
                                extras = intent.getExtras();
                                if (extras != null) {
                                    Bundle bundle4 = new Bundle(extras);
                                    bundle4.remove("tab");
                                    bundle4.remove("_route_rules_applied");
                                    intentA.putExtras(bundle4);
                                }
                                intentA.putExtra(LoanHomeSource.TRACK_PARAM_KEY, Eb.a.f2267a);
                                if (ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.credit.ui.activity.LoanHomeActivity") != null) {
                                    intentA.addFlags(67108864);
                                    return intentA;
                                }
                                intentA.addFlags(268435456);
                                return intentA;
                            }
                        }
                    } else if (stringExtra2.equals("finance") && (intentA = F.a(BaseApplication.getContext(), "/credit_score/loan_home_activity")) != null) {
                        final int i12 = 1;
                        Function1 function2 = new Function1() { // from class: ge.t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i12) {
                                    case 0:
                                        return HomeActivity.a.applyRouterRules$lambda$0(intent, (String) obj);
                                    default:
                                        return HomeActivity.a.applyRouterRules$lambda$6(intent, (String) obj);
                                }
                            }
                        };
                        String strU2 = Eb.a.u(intent, function2);
                        z3 = strU2 != null || StringsKt.F(strU2);
                        Eb.a.a(intent, function2);
                        if (z3) {
                            Eb.a.f2267a = LoanHomeSource.INSTANCE.normalize(LoanHomeSource.BOTTOM_TAB);
                        }
                        extras = intent.getExtras();
                        if (extras != null) {
                            Bundle bundle5 = new Bundle(extras);
                            bundle5.remove("tab");
                            bundle5.remove("_route_rules_applied");
                            intentA.putExtras(bundle5);
                        }
                        intentA.putExtra(LoanHomeSource.TRACK_PARAM_KEY, Eb.a.f2267a);
                        if (ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.credit.ui.activity.LoanHomeActivity") != null) {
                            intentA.addFlags(67108864);
                            return intentA;
                        }
                        intentA.addFlags(268435456);
                        return intentA;
                    }
                    return null;
                }
            }
            return intent;
        }

        private a() {
        }
    }

    @JvmStatic
    @Nullable
    public static final Intent applyRouterRules(@NotNull Intent intent) {
        return f34463H.applyRouterRules(intent);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void armIdleGate() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        String stringExtra = getIntent().getStringExtra("extra_type");
        if ("SplashActivity".equals(stringExtra) || getIntent().getBooleanExtra("extra_after_unlock_launch_home", false)) {
            this.f34469b = "SplashActivity".equals(stringExtra);
            setTheme(i.MainHomeTheme2);
        } else if ("FROM_REGISITER_PAGE".equals(stringExtra) || "FROM_LOGIN_PAGE".equals(stringExtra)) {
            setTheme(i.MainHomeTheme2);
        }
        return f.main_activity_home_new;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getNetworkCheckAvailable() {
        return 3;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.h, com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        super.initStatusBar();
        BarUtils.setStatusBarLightMode(this, !isDarkMode());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isMainBusiness() {
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.h
    public final void l() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void m(Intent intent) {
        HomeFragment homeFragmentQ;
        Intent intent2;
        HomeFragment homeFragmentQ2;
        HomeFragment homeFragmentQ3;
        HomePalmZoneTabV2 homePalmZoneTabV2B;
        PalmZoneViewModel palmZoneViewModel;
        if (intent == null) {
            return;
        }
        Uri data = intent.getData();
        String path = data != null ? data.getPath() : null;
        String queryParameter = getQueryParameter("claimId");
        String queryParameter2 = getQueryParameter("taskNo");
        String queryParameter3 = getQueryParameter("rewardId");
        Long lU = queryParameter3 != null ? StringsKt.U(queryParameter3) : null;
        if (path != null) {
            if ((!TextUtils.isEmpty(path) ? path : null) != null) {
                if (y.m(path, "/al/ReWard", false)) {
                    HomeFragment homeFragmentQ4 = q();
                    if (homeFragmentQ4 != null) {
                        homeFragmentQ4.J(queryParameter);
                    }
                    return;
                }
                if (y.m(path, "/al/cBE", false)) {
                    HomeFragment homeFragmentQ5 = q();
                    if (homeFragmentQ5 != null) {
                        homeFragmentQ5.H(homeFragmentQ5.D());
                        return;
                    }
                    return;
                }
                if (y.m(path, "/al/fLI", false)) {
                    HomeFragment homeFragmentQ6 = q();
                    if (homeFragmentQ6 != null) {
                        homeFragmentQ6.I(null);
                        return;
                    }
                    return;
                }
            }
        }
        String queryParameter4 = getQueryParameter("tab");
        String queryParameter5 = getQueryParameter("action");
        if (queryParameter5 != null && queryParameter5.equals("mobileInstallmentTab")) {
            d.F("/credit_score/oc_home_mobile_installment_standalone_activity");
            return;
        }
        F6.d.h("debug_tag", 3, G.o("checkGotoTab(), tab = ", queryParameter4));
        n0.g().getClass();
        if (queryParameter4 != null) {
            switch (queryParameter4.hashCode()) {
                case -1183703051:
                    if (queryParameter4.equals("invest") && (homeFragmentQ = q()) != null) {
                        homeFragmentQ.H(homeFragmentQ.D());
                    }
                    break;
                case -853258278:
                    if (queryParameter4.equals("finance")) {
                        C1745s c1745s = new C1745s(this, 1);
                        String strU = Eb.a.u(getIntent(), c1745s);
                        boolean z3 = strU == null || StringsKt.F(strU);
                        Eb.a.a(getIntent(), c1745s);
                        if (z3) {
                            Eb.a.f2267a = LoanHomeSource.INSTANCE.normalize(LoanHomeSource.BOTTOM_TAB);
                        }
                        Activity topActivity = ActivityUtils.getTopActivity();
                        String stringExtra = (topActivity == null || !topActivity.getClass().getName().equals("com.transsnet.palmpay.core.ui.activity.PPRNActivity") || (intent2 = topActivity.getIntent()) == null) ? null : intent2.getStringExtra("rn_module_name");
                        if (Intrinsics.c(stringExtra, "LoanHome") || Intrinsics.c(stringExtra, "LoanTabHome")) {
                            String str = Eb.a.f2267a;
                            if (!android.text.TextUtils.equals("borrow", queryParameter5)) {
                                r0.O1("NoticeLoanTabHomeSyncTabFromRepayment", "", l.d(null, str));
                            } else {
                                Intrinsics.checkNotNullParameter("borrow", "action");
                                r0.O1("NoticeLoanHomeWantBorrow", "", l.d("borrow", str));
                            }
                        } else {
                            String str2 = Eb.a.f2267a;
                            if (!StringsKt.F(str2) && b.o("LoanHome", "LoanTabHome") != null) {
                                r0.O1("NoticeLoanTabHomeSyncTabFromRepayment", "", l.d(null, str2));
                            }
                            HomeFragment homeFragmentQ7 = q();
                            if (homeFragmentQ7 != null) {
                                homeFragmentQ7.I(queryParameter5);
                            }
                        }
                        break;
                    }
                    break;
                case 3480:
                    if (queryParameter4.equals("me") && (homeFragmentQ2 = q()) != null) {
                        HomeFragmentContainer homeFragmentContainer = homeFragmentQ2.f35081B;
                        homeFragmentQ2.H(homeFragmentContainer != null ? homeFragmentContainer.c("me") : -1);
                    }
                    break;
                case 3208415:
                    if (queryParameter4.equals("home") && (homeFragmentQ3 = q()) != null) {
                        HomeFragmentContainer homeFragmentContainer2 = homeFragmentQ3.f35081B;
                        homeFragmentQ3.H(homeFragmentContainer2 != null ? homeFragmentContainer2.c("home") : -1);
                    }
                    break;
                case 1011129822:
                    if (queryParameter4.equals("palmzone")) {
                        if (TextUtils.isEmpty(queryParameter2) || lU == null) {
                            HomeFragment homeFragmentQ8 = q();
                            if (homeFragmentQ8 != null) {
                                homeFragmentQ8.J(queryParameter);
                            }
                            break;
                        } else {
                            HomeFragment homeFragmentQ9 = q();
                            if (homeFragmentQ9 != null) {
                                homeFragmentQ9.H(homeFragmentQ9.E());
                                if (queryParameter2 != null && queryParameter2.length() != 0 && (homePalmZoneTabV2B = homeFragmentQ9.B()) != null && (palmZoneViewModel = (PalmZoneViewModel) homePalmZoneTabV2B.f27333i) != null) {
                                    palmZoneViewModel.e(lU, queryParameter2);
                                    break;
                                }
                            }
                        }
                    }
                    break;
            }
        }
    }

    public final void n(Intent intent) {
        if (intent == null || !i0.W(this) || TextUtils.isEmpty(intent.getStringExtra("sendMoneyType"))) {
            return;
        }
        String stringExtra = intent.getStringExtra("sendMoneyType");
        String str = stringExtra == null ? "" : stringExtra;
        String stringExtra2 = intent.getStringExtra("sendMoneyAccountNo");
        String str2 = stringExtra2 == null ? "" : stringExtra2;
        String stringExtra3 = intent.getStringExtra("nickName");
        String str3 = stringExtra3 == null ? "" : stringExtra3;
        String stringExtra4 = intent.getStringExtra("header");
        this.f34473f.postDelayed(new g(this, new SendMoneyHandlerHomeDialog(this), str, str2, str3, stringExtra4 == null ? "" : stringExtra4, 2), 800L);
    }

    public final void o(String str) {
        Trace trace;
        Trace trace2 = this.f34480w;
        if (trace2 != null) {
            trace2.putAttribute("endType", str);
            Trace trace3 = this.f34480w;
            if (trace3 != null) {
                trace3.putAttribute("firstCreate", String.valueOf(f34464L));
            }
            f34464L = false;
            t tVar = this.f34467C;
            boolean z3 = ((PerfTimer) tVar.getValue()).parse(this.f34480w);
            ((PerfTimer) tVar.getValue()).clear();
            if (z3 && (trace = this.f34480w) != null) {
                trace.stop();
            }
            this.f34480w = null;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        F6.d.h(this.TAG, 3, "onAttachedToWindow");
        n(getIntent());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ((PerfTimer) this.f34467C.getValue()).mark(0);
        super.onCreate(bundle);
        if (BaseApplication.isFirebaseInitialized()) {
            try {
                Trace traceNewTrace = FirebasePerformance.getInstance().newTrace("HomeActivityV3");
                this.f34480w = traceNewTrace;
                if (traceNewTrace != null) {
                    traceNewTrace.start();
                }
            } catch (Exception unused) {
            }
        }
        if (bundle == null) {
            Looper.myQueue().addIdleHandler(new v(this));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        HomeFragment homeFragment;
        I i7;
        I i10;
        o("destroy");
        Handler handler = this.f34473f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        p().dismissDialog();
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
        WeakReference weakReference = this.f34471d;
        if (weakReference == null || (homeFragment = (HomeFragment) weakReference.get()) == null) {
            return;
        }
        I i11 = (I) homeFragment.f27328i;
        if (i11 != null) {
            i11.detachView();
        }
        try {
            HomeFragmentHomeTab homeFragmentHomeTab = homeFragment.f35088j;
            if (homeFragmentHomeTab != null && (i10 = (I) homeFragmentHomeTab.f27328i) != null) {
                i10.detachView();
            }
            homeFragment.f35088j = null;
            homeFragment.f35089o = null;
            HomeMeFragment homeMeFragment = homeFragment.f35090p;
            if (homeMeFragment != null && (i7 = (I) homeMeFragment.f27328i) != null) {
                i7.detachView();
            }
            homeFragment.f35090p = null;
            HomePalmZoneTabV2 homePalmZoneTabV2 = homeFragment.t;
            if (homePalmZoneTabV2 != null) {
                A a3 = homePalmZoneTabV2.f35147v;
                if (a3 != null) {
                    a3.q();
                }
                Me.r rVar = homePalmZoneTabV2.f35148w;
                if (rVar != null) {
                    rVar.m();
                }
            }
            homeFragment.t = null;
            HomeFragmentContainer homeFragmentContainer = homeFragment.f35081B;
            if (homeFragmentContainer != null) {
                Z childFragmentManager = homeFragment.getChildFragmentManager();
                childFragmentManager.getClass();
                C1161a c1161a = new C1161a(childFragmentManager);
                ArrayList<HomeFragmentCache> arrayList = homeFragmentContainer.f35349a;
                if (arrayList == null) {
                    return;
                }
                for (HomeFragmentCache homeFragmentCache : arrayList) {
                    Fragment fragment = homeFragmentCache.fragment;
                    if (fragment != null) {
                        c1161a.m(fragment);
                        homeFragmentCache.fragment = null;
                    }
                }
                c1161a.h(true);
                homeFragmentContainer.f35349a.clear();
            }
        } catch (Exception unused) {
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (372 == event.getEventType()) {
            HomeFragment homeFragmentQ = q();
            if (homeFragmentQ != null) {
                HomeFragmentContainer homeFragmentContainer = homeFragmentQ.f35081B;
                homeFragmentQ.H(homeFragmentContainer != null ? homeFragmentContainer.c("me") : -1);
                return;
            }
            return;
        }
        if (406 == event.getEventType()) {
            if (System.currentTimeMillis() - this.f34479v > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                this.f34479v = System.currentTimeMillis();
                t();
                return;
            }
            return;
        }
        if (514 != event.getEventType()) {
            if (529 == event.getEventType()) {
                p220oa.h.z(this, "Auto-logout turned on successfully", null, null, 61);
            }
        } else {
            HomeFragment homeFragmentQ2 = q();
            if (homeFragmentQ2 != null) {
                homeFragmentQ2.H(homeFragmentQ2.E());
            }
        }
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        F6.d.h(this.TAG, 3, G.o("onNewIntent ", intent.getAction()));
        n0.g().getClass();
        m(intent);
        n(intent);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((PerfTimer) this.f34467C.getValue()).mark(3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((PerfTimer) this.f34467C.getValue()).mark(1);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (z3) {
            o("onFocus");
        }
    }

    public final HomeDialogState p() {
        if (this.f34472e == null) {
            this.f34472e = new HomeDialogState(this);
        }
        HomeDialogState homeDialogState = this.f34472e;
        Intrinsics.e(homeDialogState);
        return homeDialogState;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Handler handler = this.f34473f;
        getWindow().getDecorView().post(new m(16, handler, this));
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.getBooleanExtra("JUMP_TO_SIGNUP_SUCCESS_PAGE", false)) {
                d.F("/account/sign_up_success");
                return;
            }
            Intrinsics.checkNotNullParameter("key_need_agree_privacy", "key");
            if (SPUtils.getInstance(p059e1.a.G("key_need_agree_privacy")).getBoolean("key_need_agree_privacy")) {
                p059e1.a.X("key_need_agree_privacy", false);
                if (handler != null) {
                    handler.postDelayed(new RunnableC0527y(10), 2000L);
                    return;
                }
                return;
            }
            if (intent.getBooleanExtra("FROM_LOGIN_PAGE", false)) {
                if (intent.getBooleanExtra("JUMP_TO_WELCOME_BACK_PAGE", false)) {
                    WelcomeBackActivity.f35031o.launch(this);
                    return;
                }
                if (!BaseApplication.hasLogin() || r0.o0() > 0 || d0.t()) {
                    return;
                }
                long jF = p059e1.a.F("main_sp_check_auto_logout");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jF == 0 || jF + 604800000 < jCurrentTimeMillis) {
                    handler.postDelayed(new H7.a(1, jCurrentTimeMillis, this), 5000L);
                }
            }
        }
    }

    public final HomeFragment q() {
        WeakReference weakReference = this.f34471d;
        if (weakReference != null) {
            return (HomeFragment) weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    public final void r() {
        long j6;
        PpPerfTrace.begin("Home.hideSplash.arm");
        try {
            Looper.myQueue().addIdleHandler(new com.transsnet.palmpay.core.base.d(1));
            if (this.f34474g == null) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f34476j;
            if (SplashAdView.isSplashImageExist()) {
                j6 = 3000;
            } else {
                DeviceUtils.LEVEL deviceLevel = DeviceUtils.getDeviceLevel(this);
                boolean zIsWarmStart = LibApm.INSTANCE.isWarmStart();
                int i7 = deviceLevel == null ? -1 : u.f37234a[deviceLevel.ordinal()];
                if (i7 != 1) {
                    if (i7 == 2) {
                        j6 = zIsWarmStart ? 500L : 1000L;
                    } else if (i7 != 3) {
                        j6 = zIsWarmStart ? 1500L : 2500L;
                    } else if (zIsWarmStart) {
                        j6 = 800;
                    } else {
                        j6 = 1200;
                    }
                } else if (!zIsWarmStart) {
                    j6 = 800;
                }
            }
            this.f34473f.postDelayed(new r(this, 0), jCurrentTimeMillis >= j6 ? 0L : j6 - jCurrentTimeMillis);
        } finally {
            PpPerfTrace.end();
        }
    }

    public final boolean s() {
        HomeFragmentContainer homeFragmentContainer;
        HomeFragment homeFragmentQ = q();
        return (homeFragmentQ == null || (homeFragmentContainer = homeFragmentQ.f35081B) == null || homeFragmentContainer.getCurrentItem() != homeFragmentQ.y()) ? false : true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        org.greenrobot.eventbus.c.b().j(this);
        this.f34468a = getIntent().getBooleanExtra("FROM_REGISITER_PAGE", false);
        this.f34465A = (FrameLayout) findViewById(R.id.content);
        boolean z3 = Intrinsics.c(getIntent().getStringExtra("extra_type"), "FROM_REGISITER_PAGE") || Intrinsics.c(getIntent().getStringExtra("extra_type"), "FROM_LOGIN_PAGE");
        boolean booleanExtra = getIntent().getBooleanExtra("extra_after_unlock_launch_home", false);
        if (booleanExtra) {
            getWindow().setBackgroundDrawable(null);
        }
        if (booleanExtra) {
            return;
        }
        if (this.f34469b || z3) {
            FrameLayout frameLayout = new FrameLayout(this);
            this.f34475i = frameLayout;
            frameLayout.setId(e.main_home_container);
            FrameLayout frameLayout2 = this.f34475i;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            }
            FrameLayout frameLayout3 = this.f34475i;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(4);
            }
            FrameLayout frameLayout4 = this.f34465A;
            if (frameLayout4 != null) {
                frameLayout4.addView(this.f34475i);
            }
            FrameLayout frameLayout5 = new FrameLayout(this);
            this.f34474g = frameLayout5;
            frameLayout5.setId(e.main_splash_container);
            FrameLayout frameLayout6 = this.f34474g;
            if (frameLayout6 != null) {
                frameLayout6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            }
            FrameLayout frameLayout7 = this.f34465A;
            if (frameLayout7 != null) {
                frameLayout7.addView(this.f34474g);
            }
            this.f34476j = System.currentTimeMillis();
            SplashFragment splashFragment = new SplashFragment();
            this.f34470c = splashFragment;
            Bundle bundle = new Bundle();
            bundle.putBoolean("showAd", !z3);
            splashFragment.setArguments(bundle);
            p220oa.h.i(this, e.main_splash_container, this.f34470c);
            p().freezeDialog(true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, com.transsnet.palmpay.core.callback.HomeAcCallback
    public final void showDialog(Dialog dialog, int i7) {
        runOnUiThread(new H0.a(this, dialog, i7, 11));
    }

    @Override // com.transsnet.palmpay.core.callback.HomeAcCallback
    public final void showSnackBar(SnackBarRecycle snackBarRecycle) {
        LinkedBlockingQueue linkedBlockingQueue = this.f34477o;
        try {
            boolean zIsEmpty = linkedBlockingQueue.isEmpty();
            linkedBlockingQueue.add(snackBarRecycle);
            if (zIsEmpty) {
                if (this.t == null) {
                    this.t = new r(this, 1);
                }
                r rVar = this.t;
                if (rVar != null) {
                    this.f34478p.post(rVar);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.transsnet.palmpay.core.callback.HomeAcCallback
    public final void switchToMainHomeTabOnLoanHomeExit() {
        runOnUiThread(new r(this, 2));
    }

    public final void t() {
        F6.d.h(this.TAG, 3, "reloadHomeFragment: ");
        n0.g().getClass();
        FrameLayout frameLayout = this.f34475i;
        if (frameLayout != null) {
            p220oa.h.s(frameLayout, true);
        }
        HomeFragment homeFragmentQ = q();
        if (homeFragmentQ != null) {
            Z supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1161a c1161a = new C1161a(supportFragmentManager);
            Intrinsics.checkNotNullExpressionValue(c1161a, "beginTransaction(...)");
            c1161a.m(homeFragmentQ);
            c1161a.h(true);
            this.f34471d = null;
        }
        HomeFragment homeFragment = new HomeFragment();
        this.f34471d = new WeakReference(homeFragment);
        if (this.f34475i != null) {
            p220oa.h.i(this, e.main_home_container, homeFragment);
        } else {
            p220oa.h.i(this, R.id.content, homeFragment);
        }
    }

    public final void u() {
        SplashFragment splashFragment = this.f34470c;
        if (splashFragment != null) {
            Z supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C1161a c1161a = new C1161a(supportFragmentManager);
            c1161a.m(splashFragment);
            c1161a.h(true);
        }
        this.f34470c = null;
        FrameLayout frameLayout = this.f34465A;
        if (frameLayout != null) {
            frameLayout.removeView(this.f34474g);
        }
        this.f34474g = null;
        HomeDialogState homeDialogState = this.f34472e;
        if (homeDialogState != null) {
            homeDialogState.freezeDialog(false);
        }
        getWindow().setBackgroundDrawable(null);
    }
}
