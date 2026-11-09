package com.transsnet.palmpay.send_money.ui.fragment;

import Cd.c;
import Cd.d;
import android.content.Intent;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.transsnet.palmpay.core.base.BaseFragment;
import p159kd.e;
import p159kd.f;

/* JADX INFO: loaded from: classes4.dex */
public class AddBeneficiaryFragment extends BaseFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray f33659i = new SparseArray(3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TabLayout f33660j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewPager f33661o;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.sm_add_beneficiary_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f33660j = (TabLayout) this.f27318b.findViewById(e.tabLayout);
        ViewPager viewPager = (ViewPager) this.f27318b.findViewById(e.viewpager);
        this.f33661o = viewPager;
        viewPager.addOnPageChangeListener(new c());
        this.f33661o.setAdapter(new d(this, getChildFragmentManager(), 0));
        this.f33661o.setOffscreenPageLimit(3);
        this.f33660j.setupWithViewPager(this.f33661o);
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        Fragment fragment = (Fragment) this.f33659i.get(this.f33661o.getCurrentItem());
        if (fragment == null || !fragment.isAdded()) {
            return;
        }
        fragment.onActivityResult(i7, i10, intent);
    }
}
