package com.transsnet.palmpay.ui.fragment;

import Ac.e;
import Ac.f;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseLazyMvvmFragment;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.viewmodule.HomeSavingsViewModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/HomeInvestFragment;", "Lcom/transsnet/palmpay/core/base/BaseLazyMvvmFragment;", "Lcom/transsnet/palmpay/viewmodule/HomeSavingsViewModel;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeInvestFragment extends BaseLazyMvvmFragment<HomeSavingsViewModel> {
    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_fragment_home_invest;
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        if (BaseApplication.hasLogin()) {
            try {
                Z childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                C1161a c1161a = new C1161a(childFragmentManager);
                c1161a.e(e.fin_fl, HomeSavingsUserV2Fragment.f35149F0.newInstance(), null);
                c1161a.h(true);
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        try {
            Z childFragmentManager2 = getChildFragmentManager();
            childFragmentManager2.getClass();
            C1161a c1161a2 = new C1161a(childFragmentManager2);
            c1161a2.e(e.fin_fl, InvestGuideFragment.f35185t0.newInstance(), null);
            c1161a2.h(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        E activity = getActivity();
        if (activity != null) {
            BarUtils.setStatusBarLightMode(activity, !m());
        }
    }
}
