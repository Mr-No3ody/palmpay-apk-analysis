package com.transsnet.palmpay.send_money.ui.activity.kkcar;

import C0.AbstractC0130w;
import C0.C0119k;
import C0.K;
import C0.N;
import C0.P;
import C0.S;
import Kd.C0376g;
import Kd.C0379h;
import L6.b;
import Rd.C0592h;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.NavController$OnDestinationChangedListener;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.kkcar.KkCarHostActivity;
import com.transsnet.palmpay.send_money.util.kkcar.KkCarPassengerAuthStore;
import com.transsnet.palmpay.send_money.viewmodel.KkCarHostViewModel;
import kotlin.Metadata;
import kotlin.collections.C1843j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;
import p141j9.s;
import p141j9.t;
import p159kd.e;
import p159kd.f;
import p159kd.g;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "转账/KK车乘客端", path = "/kkcar/passenger", remark = "KK 车乘客端宿主页：承载引导开通与乘车码主页两个 Fragment")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/kkcar/KkCarHostActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/KkCarHostViewModel;", "LRd/h;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKkCarHostActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KkCarHostActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/kkcar/KkCarHostActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,129:1\n171#2,12:130\n215#2:142\n*S KotlinDebug\n*F\n+ 1 KkCarHostActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/kkcar/KkCarHostActivity\n*L\n71#1:130,12\n71#1:142\n*E\n"})
public final class KkCarHostActivity extends BaseMvvmVBActivity<KkCarHostViewModel, C0592h> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33301e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P f33302d;

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((KkCarHostViewModel) l()).f33968e;
        if (lVar != null) {
            lVar.e(this, new s(new t(this, this, 19), (char) 0, 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        int authStatus = KkCarPassengerAuthStore.INSTANCE.readAuthStatus();
        if (((authStatus == 1 || authStatus == 2) ? e.kkCarPassengerFragment : e.kkCarOnboardingFragment) == e.kkCarPassengerFragment) {
            initStatusBar(CommonViewExtKt.colorInt(b.ppColorTextPrimary, this), false);
        } else {
            initStatusBar(CommonViewExtKt.colorInt(p159kd.b.sm_kk_color_onboarding_status_bar, this), true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(f.sm_kk_activity_host, (ViewGroup) null, false);
        int i7 = e.navKkHost;
        if (((FragmentContainerView) a.m(i7, viewInflate)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
        }
        C0592h c0592h = new C0592h((ConstraintLayout) viewInflate, 5);
        Intrinsics.checkNotNullExpressionValue(c0592h, "inflate(...)");
        return c0592h;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        KkCarHostViewModel kkCarHostViewModel = (KkCarHostViewModel) l();
        kkCarHostViewModel.getClass();
        p140j8.f.s(kkCarHostViewModel, new C0376g(1, null), kkCarHostViewModel.f33969f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        if (KkCarPassengerAuthStore.INSTANCE.readAuthStatus() == -1) {
            KkCarHostViewModel kkCarHostViewModel2 = (KkCarHostViewModel) l();
            kkCarHostViewModel2.getClass();
            p140j8.f.s(kkCarHostViewModel2, new C0379h(1, null), kkCarHostViewModel2.f33968e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        Fragment fragmentD = getSupportFragmentManager().D(e.navKkHost);
        NavHostFragment navHostFragment = fragmentD instanceof NavHostFragment ? (NavHostFragment) fragmentD : null;
        if (navHostFragment == null) {
            return;
        }
        P pF = navHostFragment.f();
        this.f33302d = pF;
        N graph = ((S) pF.f1099B.getValue()).b(g.sm_kk_nav_graph);
        int authStatus = KkCarPassengerAuthStore.INSTANCE.readAuthStatus();
        graph.h((authStatus == 1 || authStatus == 2) ? e.kkCarPassengerFragment : e.kkCarOnboardingFragment);
        Intrinsics.checkNotNullParameter(graph, "graph");
        pF.q(graph, null);
        NavController$OnDestinationChangedListener listener = new NavController$OnDestinationChangedListener() { // from class: sd.a
            @Override // androidx.navigation.NavController$OnDestinationChangedListener
            public final void onDestinationChanged(AbstractC0130w abstractC0130w, K destination, Bundle bundle) {
                int i7 = KkCarHostActivity.f33301e;
                Intrinsics.checkNotNullParameter(abstractC0130w, "<unused var>");
                Intrinsics.checkNotNullParameter(destination, "destination");
                int i10 = destination.f961i;
                KkCarHostActivity kkCarHostActivity = this.f42240a;
                if (i10 == e.kkCarPassengerFragment) {
                    kkCarHostActivity.initStatusBar(CommonViewExtKt.colorInt(b.ppColorTextPrimary, kkCarHostActivity), false);
                } else {
                    kkCarHostActivity.initStatusBar(CommonViewExtKt.colorInt(p159kd.b.sm_kk_color_onboarding_status_bar, kkCarHostActivity), true);
                }
            }
        };
        Intrinsics.checkNotNullParameter(listener, "listener");
        pF.f1116p.add(listener);
        C1843j c1843j = pF.f1107g;
        if (c1843j.isEmpty()) {
            return;
        }
        C0119k c0119k = (C0119k) c1843j.last();
        listener.onDestinationChanged(pF, c0119k.f1051b, c0119k.a());
    }
}
