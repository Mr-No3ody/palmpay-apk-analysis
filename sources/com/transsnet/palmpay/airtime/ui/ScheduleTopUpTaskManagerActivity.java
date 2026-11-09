package com.transsnet.palmpay.airtime.ui;

import C0.P;
import L6.b;
import Pd.c;
import Pd.d;
import Rd.C0609z;
import V8.w;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.u;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.b0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.airtime.viewmodel.ScheduleTopUpViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.K;
import o9.f0;
import p052da.ViewOnClickListenerC1649v;
import p059e1.a;
import p140j8.f;
import p141j9.C1798f;
import p141j9.q;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/airtime/airtime_schedule_topup_task_manager")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/ScheduleTopUpTaskManagerActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/airtime/viewmodel/ScheduleTopUpViewModel;", "LRd/z;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTopUpTaskManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTopUpTaskManagerActivity.kt\ncom/transsnet/palmpay/airtime/ui/ScheduleTopUpTaskManagerActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,98:1\n75#2,13:99\n115#3,8:112\n145#3:120\n*S KotlinDebug\n*F\n+ 1 ScheduleTopUpTaskManagerActivity.kt\ncom/transsnet/palmpay/airtime/ui/ScheduleTopUpTaskManagerActivity\n*L\n47#1:99,13\n87#1:112,8\n87#1:120\n*E\n"})
public final class ScheduleTopUpTaskManagerActivity extends BaseMvvmVBActivity<ScheduleTopUpViewModel, C0609z> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f26476o = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26480g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public P f26481i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f26477d = Boolean.FALSE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f26478e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0 f26482j = new b0(G.a(K.class), new q(this, 1), new q(this, 0), new q(this, 2));

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Fragment fragmentD = getSupportFragmentManager().D(c.navHostFragment);
        Intrinsics.f(fragmentD, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        this.f26481i = ((NavHostFragment) fragmentD).f();
        Integer num = this.f26478e;
        if (num != null) {
            if (num.intValue() != 0) {
                P p3 = this.f26481i;
                if (p3 != null) {
                    int i7 = c.fragmentEditManager;
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_data_1", this.f26479f);
                    Unit unit = Unit.f38893a;
                    p3.h(i7, bundle, null);
                    return;
                }
                return;
            }
            P p10 = this.f26481i;
            if (p10 != null) {
                int i10 = c.fragmentAddTask;
                Bundle bundle2 = new Bundle();
                Boolean bool = this.f26477d;
                bundle2.putBoolean("extra_type", bool != null ? bool.booleanValue() : false);
                bundle2.putString("key_phone", this.f26480g);
                Unit unit2 = Unit.f38893a;
                p10.h(i10, bundle2, null);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_schedule_top_up_task_manager, (ViewGroup) null, false);
        int i7 = c.navHostFragment;
        if (((FragmentContainerView) a.m(i7, viewInflate)) != null) {
            i7 = c.titleBar;
            PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
            if (ppTitleBar != null) {
                C0609z c0609z = new C0609z((LinearLayout) viewInflate, ppTitleBar);
                Intrinsics.checkNotNullExpressionValue(c0609z, "inflate(...)");
                return c0609z;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) l();
        if (scheduleTopUpViewModel != null) {
            f.v(scheduleTopUpViewModel, new f0(1, null), scheduleTopUpViewModel.f26643g, 0L);
        }
        ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) l();
        l lVar = scheduleTopUpViewModel2 != null ? scheduleTopUpViewModel2.f26643g : null;
        if (lVar != null) {
            lVar.e(this, new T8.f(new w(this, 14), (short) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        u.a(getOnBackPressedDispatcher(), this, new C1798f(this, 2));
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this), !isDarkMode());
        ARouter.getInstance().inject(this);
        C0609z c0609z = (C0609z) this.f27334c;
        if (c0609z != null) {
            c0609z.f8556b.setBackButtonClickListener(new ViewOnClickListenerC1649v(this, 18));
        }
    }
}
