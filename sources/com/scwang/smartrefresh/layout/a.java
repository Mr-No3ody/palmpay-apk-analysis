package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout.RefreshKernelImpl f25104a;

    public a(SmartRefreshLayout.RefreshKernelImpl refreshKernelImpl) {
        this.f25104a = refreshKernelImpl;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        SmartRefreshLayout.this.f25065n1.setState(RefreshState.TwoLevel);
    }
}
