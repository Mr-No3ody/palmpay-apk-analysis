package Fe;

import Ad.C0058e;
import Wf.AbstractC0780y;
import androidx.lifecycle.AbstractC1207q;
import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.main.export.bean.req.ClaimRewardReq;
import com.transsnet.palmpay.main.export.bean.req.ClearRewardCacheReq;
import com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter;
import com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends com.transsnet.palmpay.core.base.j implements HomeFragmentContract$IPresenter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f2735f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2737e;

    static {
        new C0263k(null);
        f2735f = true;
    }

    public final void b() {
        HomeFragmentContract$IView homeFragmentContract$IView;
        AbstractC1207q coroutineScope;
        if (!BaseApplication.hasLogin() || (homeFragmentContract$IView = (HomeFragmentContract$IView) this.f27351a) == null || (coroutineScope = homeFragmentContract$IView.getCoroutineScope()) == null) {
            return;
        }
        p042cg.f fVar = Wf.I.f10809a;
        AbstractC0780y.m(coroutineScope, p042cg.e.f19009c, null, new C0266n(this, null), 2);
    }

    public final void c(boolean z3, boolean z8) {
        kotlin.jvm.internal.B b7 = new kotlin.jvm.internal.B();
        b7.f38947a = f2735f;
        f2735f = false;
        J3.a.D(this, (HomeFragmentContract$IView) this.f27351a, new C0273v(z8, b7, this, null), new C0262j(this, z3, b7), new C0261i(z3, this, 2), false, false);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter
    public final void claimRewardsCenterReward(ClaimRewardReq claimRewardReq) {
        J3.a.D(this, (HomeFragmentContract$IView) this.f27351a, new C0267o(claimRewardReq, null), new C0260h(this, 12), new C0260h(this, 13), false, false);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter
    public final void claimTaskCenterReward(String taskSceneType) {
        Intrinsics.checkNotNullParameter(taskSceneType, "taskSceneType");
        if (BaseApplication.hasLogin()) {
            J3.a.D(this, (HomeFragmentContract$IView) this.f27351a, new C0268p(taskSceneType, null), new C0260h(this, 14), new C0260h(this, 15), false, true);
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter
    public final void clearRewardsResultCache(ClearRewardCacheReq clearRewardCacheReq) {
        J3.a.D(this, (HomeFragmentContract$IView) this.f27351a, new C0269q(clearRewardCacheReq, null), new C0260h(this, 10), new C0260h(this, 11), false, false);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter
    public final void loanEnterPreCheck() {
        J3.a.D(this, (HomeFragmentContract$IView) this.f27351a, new r(1, null), new C0260h(this, 4), new C0260h(this, 5), false, true);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter
    public final void queryClipboardMatchInfo(String accountNo) {
        Intrinsics.checkNotNullParameter(accountNo, "accountNo");
        J3.a.D(this, (HomeFragmentContract$IView) this.f27351a, new C0270s(accountNo, null), new C0058e(9, this, accountNo), new Ab.B(22), false, false);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter
    public final boolean queryHomeAccountInfo(boolean z3) {
        if (BaseApplication.hasLogin()) {
            if (NQEManager.INSTANCE.isNetworkOffline()) {
                HomeFragmentContract$IView homeFragmentContract$IView = (HomeFragmentContract$IView) this.f27351a;
                if (homeFragmentContract$IView != null) {
                    homeFragmentContract$IView.handleHomeAccountInfo(null);
                    return false;
                }
            } else if (System.currentTimeMillis() - this.f2736d >= 5000 || z3) {
                J3.a.D(this, (HomeFragmentContract$IView) this.f27351a, new C0271t(1, null), new C0261i(this, z3), new C0261i(z3, this, 1), false, false);
                this.f2736d = System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter
    public final void queryHomeBannerInfo(boolean z3) {
        c(true, z3);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter
    public final void queryHomeBusinessInfo() {
        AbstractC1207q coroutineScope;
        HomeFragmentContract$IView homeFragmentContract$IView = (HomeFragmentContract$IView) this.f27351a;
        if (homeFragmentContract$IView != null && (coroutineScope = homeFragmentContract$IView.getCoroutineScope()) != null) {
            p042cg.f fVar = Wf.I.f10809a;
            AbstractC0780y.m(coroutineScope, p015ag.o.f11960a, null, new C0275x(this, null), 2);
        }
        if (BaseApplication.hasLogin()) {
            J3.a.D(this, (HomeFragmentContract$IView) this.f27351a, new C0276y(1, null), new C0260h(this, 8), new C0260h(this, 9), false, false);
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter
    public final void queryHomeRewardTasks() {
        J3.a.E(this, (HomeFragmentContract$IView) this.f27351a, new C0277z(this, null), new C0260h(this, 1), null, false, false, 8);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter
    public final void queryLastTransactionHistory() {
        if (BaseApplication.hasLogin()) {
            J3.a.D(this, (HomeFragmentContract$IView) this.f27351a, new A(1, null), new C0260h(this, 0), new Ab.B(20), false, false);
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter
    public final void queryMeTabTotalAssetInfo() {
        if (BaseApplication.hasLogin()) {
            J3.a.D(this, (HomeFragmentContract$IView) this.f27351a, new B(1, null), new C0260h(this, 6), new C0260h(this, 7), false, false);
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter
    public final void queryMenuList() {
        AbstractC1207q coroutineScope;
        if (NQEManager.INSTANCE.isNetworkOffline()) {
            HomeFragmentContract$IView homeFragmentContract$IView = (HomeFragmentContract$IView) this.f27351a;
            if (homeFragmentContract$IView != null) {
                homeFragmentContract$IView.showSlideMenuList(null);
                return;
            }
            return;
        }
        HomeFragmentContract$IView homeFragmentContract$IView2 = (HomeFragmentContract$IView) this.f27351a;
        if (homeFragmentContract$IView2 == null || (coroutineScope = homeFragmentContract$IView2.getCoroutineScope()) == null) {
            return;
        }
        p042cg.f fVar = Wf.I.f10809a;
        AbstractC0780y.m(coroutineScope, p015ag.o.f11960a, null, new G(homeFragmentContract$IView2, null, this), 2);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter
    public final void queryMessages() {
        if (BaseApplication.hasLogin()) {
            J3.a.D(this, (HomeFragmentContract$IView) this.f27351a, new H(1, null), new C0260h(this, 2), new C0260h(this, 3), false, false);
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IPresenter
    public final void smDialogShown(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        J3.a.C(this, (HomeFragmentContract$IView) this.f27351a, new C0259g(orderId, 0), new Ab.B(21), null, false, false, 8);
    }
}
