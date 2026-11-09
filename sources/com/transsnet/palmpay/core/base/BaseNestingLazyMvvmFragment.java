package com.transsnet.palmpay.core.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.transsnet.palmpay.core.base.BaseViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseNestingLazyMvvmFragment<VM extends BaseViewModel> extends BaseFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27336i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f27337j = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27338o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public BaseViewModel f27339p;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Class clsA = p002a.a.A(this);
        if (clsA != null) {
            this.f27339p = (BaseViewModel) new androidx.camera.video.internal.c(this).h(clsA);
            getLifecycle().a(this.f27339p);
            return 0;
        }
        throw new IllegalStateException("Cannot resolve ViewModel for " + getClass().getName() + ". Check R8 Signature keep for BaseNestingLazyMvvmFragment subclasses.");
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        F6.d.c(this.f27317a, "-----> ".concat(getClass().getSimpleName()));
        this.f27337j = true;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        F6.d.c(this.f27317a, "-----> ".concat(getClass().getSimpleName()));
        this.f27337j = false;
        this.f27336i = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        F6.d.c(this.f27317a, "-----> ".concat(getClass().getSimpleName()));
        if (isHidden() || !getUserVisibleHint()) {
            return;
        }
        t(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        F6.d.c(this.f27317a, "-----> ".concat(getClass().getSimpleName()));
        if (this.f27336i || isHidden() || getUserVisibleHint() || !this.f27338o) {
            return;
        }
        t(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        F6.d.c(this.f27317a, "-----> ".concat(getClass().getSimpleName()));
        if (isHidden() || !getUserVisibleHint()) {
            return;
        }
        t(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z3) {
        super.setUserVisibleHint(z3);
        F6.d.c(this.f27317a, z3 + "-----> " + getClass().getSimpleName());
        if (this.f27337j) {
            if (z3 && !this.f27338o) {
                t(true);
            } else {
                if (z3 || !this.f27338o) {
                    return;
                }
                t(false);
            }
        }
    }

    public final void t(boolean z3) {
        if (z3) {
            BaseLazyMvvmFragment baseLazyMvvmFragment = (BaseLazyMvvmFragment) getParentFragment();
            if (baseLazyMvvmFragment != null) {
                if (!baseLazyMvvmFragment.f27326o) {
                    return;
                }
            } else if (baseLazyMvvmFragment != null && !baseLazyMvvmFragment.f27326o) {
                return;
            }
        }
        if (this.f27338o == z3) {
            return;
        }
        this.f27338o = z3;
        String str = this.f27317a;
        if (!z3) {
            F6.d.c(str, getClass().getSimpleName().concat("不可见"));
            u(false);
            return;
        }
        if (this.f27336i) {
            this.f27336i = false;
            F6.d.c(str, getClass().getSimpleName().concat("首次可见"));
        } else {
            F6.d.c(str, getClass().getSimpleName().concat("可见"));
        }
        u(true);
    }

    public final void u(boolean z3) {
        List<Fragment> listF = getChildFragmentManager().f17069c.f();
        if (listF == null || listF.isEmpty()) {
            return;
        }
        for (Fragment fragment : listF) {
            if ((fragment instanceof BaseNestingLazyMvvmFragment) && !fragment.isHidden() && fragment.getUserVisibleHint()) {
                ((BaseNestingLazyMvvmFragment) fragment).t(z3);
            }
        }
    }
}
