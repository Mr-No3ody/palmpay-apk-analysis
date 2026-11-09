package com.transsnet.palmpay.managemoney.ui.fragment;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.managemoney.ui.viewmodel.UserFixedSavingViewModel;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserFixedSavingFragment f32685a;

    public z0(UserFixedSavingFragment userFixedSavingFragment) {
        this.f32685a = userFixedSavingFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        UserFixedSavingFragment.a aVar = UserFixedSavingFragment.f32574v;
        UserFixedSavingFragment userFixedSavingFragment = this.f32685a;
        if (userFixedSavingFragment.u() == 0) {
            UserFixedSavingViewModel userFixedSavingViewModel = (UserFixedSavingViewModel) userFixedSavingFragment.f27333i;
            if (userFixedSavingViewModel != null) {
                userFixedSavingViewModel.e(userFixedSavingFragment.t(), false);
                return;
            }
            return;
        }
        UserFixedSavingViewModel userFixedSavingViewModel2 = (UserFixedSavingViewModel) userFixedSavingFragment.f27333i;
        if (userFixedSavingViewModel2 != null) {
            userFixedSavingViewModel2.d(userFixedSavingFragment.t(), false);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        UserFixedSavingFragment.a aVar = UserFixedSavingFragment.f32574v;
        UserFixedSavingFragment userFixedSavingFragment = this.f32685a;
        if (userFixedSavingFragment.u() == 0) {
            UserFixedSavingViewModel userFixedSavingViewModel = (UserFixedSavingViewModel) userFixedSavingFragment.f27333i;
            if (userFixedSavingViewModel != null) {
                userFixedSavingViewModel.e(userFixedSavingFragment.t(), true);
                return;
            }
            return;
        }
        UserFixedSavingViewModel userFixedSavingViewModel2 = (UserFixedSavingViewModel) userFixedSavingFragment.f27333i;
        if (userFixedSavingViewModel2 != null) {
            userFixedSavingViewModel2.d(userFixedSavingFragment.t(), true);
        }
    }
}
