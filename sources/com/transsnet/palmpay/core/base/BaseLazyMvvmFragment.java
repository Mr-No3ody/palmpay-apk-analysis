package com.transsnet.palmpay.core.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.transsnet.palmpay.core.base.BaseViewModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseLazyMvvmFragment<VM extends BaseViewModel> extends BaseFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27324i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f27325j = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27326o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public BaseViewModel f27327p;

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public int o() {
        Class clsA = p002a.a.A(this);
        if (clsA != null) {
            this.f27327p = (BaseViewModel) new androidx.camera.video.internal.c(this).h(clsA);
            getLifecycle().a(this.f27327p);
            return 0;
        }
        throw new IllegalStateException("Cannot resolve ViewModel for " + getClass().getName() + ". Check R8 Signature keep for BaseLazyMvvmFragment subclasses.");
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        F6.d.c(this.f27317a, "-----> ".concat(getClass().getSimpleName()));
        this.f27325j = true;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        F6.d.c(this.f27317a, "-----> ".concat(getClass().getSimpleName()));
        this.f27325j = false;
        this.f27324i = true;
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
    public void onResume() {
        super.onResume();
        F6.d.c(this.f27317a, "-----> ".concat(getClass().getSimpleName()));
        if (this.f27324i || isHidden() || getUserVisibleHint() || !this.f27326o) {
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
        if (this.f27325j) {
            if (z3 && !this.f27326o) {
                t(true);
            } else {
                if (z3 || !this.f27326o) {
                    return;
                }
                t(false);
            }
        }
    }

    public final void t(boolean z3) {
        this.f27326o = z3;
        if (!z3) {
            F6.d.c(this.f27317a, getClass().getSimpleName().concat("不可见"));
        } else if (!this.f27324i) {
            v();
        } else {
            this.f27324i = false;
            u();
        }
    }

    public void u() {
        F6.d.c(this.f27317a, getClass().getSimpleName().concat("首次可见"));
    }

    public void v() {
        F6.d.c(this.f27317a, getClass().getSimpleName().concat("可见"));
    }
}
