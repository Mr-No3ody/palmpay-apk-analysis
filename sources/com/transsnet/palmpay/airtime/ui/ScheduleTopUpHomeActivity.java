package com.transsnet.palmpay.airtime.ui;

import C0.P;
import Hb.A;
import L6.b;
import Pa.n0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Rd.C0586b;
import T8.o;
import V8.w;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.u;
import androidx.core.provider.m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.b0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAuthorizeInfoResp;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpHomeActivity;
import com.transsnet.palmpay.airtime.viewmodel.ScheduleTopUpViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import io.fastkv.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.L;
import o9.e0;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p051d9.C1624v;
import p054dd.q;
import p059e1.a;
import p140j8.f;
import p141j9.C1805m;
import p141j9.C1807o;
import p141j9.C1808p;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "话费/Schedule Topup Home", path = "/airtime/auto_top_up_route_page")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/ScheduleTopUpHomeActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/airtime/viewmodel/ScheduleTopUpViewModel;", "LRd/b;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "messageEvent", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTopUpHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTopUpHomeActivity.kt\ncom/transsnet/palmpay/airtime/ui/ScheduleTopUpHomeActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,224:1\n75#2,13:225\n383#3:238\n401#3:239\n260#3,10:240\n296#3:250\n562#4,10:251\n*S KotlinDebug\n*F\n+ 1 ScheduleTopUpHomeActivity.kt\ncom/transsnet/palmpay/airtime/ui/ScheduleTopUpHomeActivity\n*L\n51#1:225,13\n142#1:238\n142#1:239\n152#1:240,10\n152#1:250\n170#1:251,10\n*E\n"})
public final class ScheduleTopUpHomeActivity extends BaseMvvmVBActivity<ScheduleTopUpViewModel, C0586b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f26471i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScheduleTopUpAuthorizeInfoResp f26473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f26474f = new b0(G.a(L.class), new C1808p(this, 1), new C1808p(this, 0), new C1808p(this, 2));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public P f26475g;

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        n.B(this, ((ScheduleTopUpViewModel) l()).f26638M, this, new C1807o(this, 0), new C1624v(23), false, null, 240);
        ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) l();
        l lVar = scheduleTopUpViewModel != null ? scheduleTopUpViewModel.f26646o : null;
        if (lVar != null) {
            lVar.e(this, new q(new w(13, lVar, this), 7));
        }
        l lVar2 = ((ScheduleTopUpViewModel) l()).f26645j;
        if (lVar2 != null) {
            lVar2.e(this, new q(new o(29, this, this), 7));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_airtime_schedule_top_up_home, (ViewGroup) null, false);
        int i7 = c.navHostFragment;
        if (((FragmentContainerView) a.m(i7, viewInflate)) != null) {
            i7 = c.titleBar;
            PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
            if (ppTitleBar != null) {
                i7 = c.tvNotice;
                if (((MarqueeViewV2) a.m(i7, viewInflate)) != null) {
                    C0586b c0586b = new C0586b((LinearLayout) viewInflate, ppTitleBar);
                    Intrinsics.checkNotNullExpressionValue(c0586b, "inflate(...)");
                    return c0586b;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void n(String str, Function0 function0) {
        ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) l();
        String memberId = BaseApplication.getInstance().getUser().getMemberId();
        Intrinsics.checkNotNullExpressionValue(memberId, "getMemberId(...)");
        A function = new A(this, 7, str, function0);
        scheduleTopUpViewModel.getClass();
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(function, "function");
        e0 e0Var = new e0(memberId, null);
        l lVar = scheduleTopUpViewModel.f26638M;
        lVar.f27356m = function;
        Unit unit = Unit.f38893a;
        f.v(scheduleTopUpViewModel, e0Var, lVar, 0L);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable MessageEvent messageEvent) {
        if (messageEvent != null && messageEvent.getEventType() == 550) {
            ((ScheduleTopUpViewModel) l()).h();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f26472d) {
            List list = (List) ((L) this.f26474f.getValue()).f40122d.d();
            if (list != null) {
                if (list.isEmpty()) {
                    P p3 = this.f26475g;
                    if (p3 != null) {
                        p3.j();
                    }
                    P p10 = this.f26475g;
                    if (p10 != null) {
                        p10.h(c.fragmentGuide, null, null);
                    }
                } else {
                    P p11 = this.f26475g;
                    if (p11 != null) {
                        p11.j();
                    }
                    P p12 = this.f26475g;
                    if (p12 != null) {
                        p12.h(c.fragmentManager, null, null);
                    }
                }
            }
            this.f26472d = false;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (bundle == null) {
            Handler uIHandler = getUIHandler();
            Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
            getWindow().getDecorView().post(new m(21, uIHandler, this));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        u.a(getOnBackPressedDispatcher(), this, new C1805m(this, 0));
        ARouter.getInstance().inject(this);
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this), !isDarkMode());
        org.greenrobot.eventbus.c.b().j(this);
        C0586b c0586b = (C0586b) this.f27334c;
        if (c0586b != null) {
            final int i7 = 0;
            c0586b.f8208b.setBackButtonClickListener(new View.OnClickListener(this) { // from class: j9.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScheduleTopUpHomeActivity f38418b;

                {
                    this.f38418b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ScheduleTopUpHomeActivity scheduleTopUpHomeActivity = this.f38418b;
                    switch (i7) {
                        case 0:
                            int i10 = ScheduleTopUpHomeActivity.f26471i;
                            scheduleTopUpHomeActivity.getOnBackPressedDispatcher().d();
                            break;
                        default:
                            int i11 = ScheduleTopUpHomeActivity.f26471i;
                            if (!r0.U0()) {
                                scheduleTopUpHomeActivity.n("/main/set_payment_method", new com.transsnet.palmpay.managemoney.ui.view.c(22));
                                n0.g().l("Schedule_Top_Up_Airtime_Homepage_Payment_Method");
                                break;
                            }
                            break;
                    }
                }
            });
        }
        Fragment fragmentD = getSupportFragmentManager().D(c.navHostFragment);
        Intrinsics.f(fragmentD, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        this.f26475g = ((NavHostFragment) fragmentD).f();
        C0586b c0586b2 = (C0586b) this.f27334c;
        if (c0586b2 != null) {
            final int i10 = 1;
            c0586b2.f8208b.setRightTextViewClickListener(new View.OnClickListener(this) { // from class: j9.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScheduleTopUpHomeActivity f38418b;

                {
                    this.f38418b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ScheduleTopUpHomeActivity scheduleTopUpHomeActivity = this.f38418b;
                    switch (i10) {
                        case 0:
                            int i11 = ScheduleTopUpHomeActivity.f26471i;
                            scheduleTopUpHomeActivity.getOnBackPressedDispatcher().d();
                            break;
                        default:
                            int i12 = ScheduleTopUpHomeActivity.f26471i;
                            if (!r0.U0()) {
                                scheduleTopUpHomeActivity.n("/main/set_payment_method", new com.transsnet.palmpay.managemoney.ui.view.c(22));
                                n0.g().l("Schedule_Top_Up_Airtime_Homepage_Payment_Method");
                                break;
                            }
                            break;
                    }
                }
            });
        }
        ((L) this.f26474f.getValue()).f40122d.e(this, new T8.f(new C1805m(this, 1)));
    }
}
