package com.google.android.material.search;

import android.animation.Animator;
import android.view.View;
import androidx.core.view.q0;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements AnimatableView.Listener, ViewUtils.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f22543a;

    public /* synthetic */ c(Object obj) {
        this.f22543a = obj;
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public void onAnimationEnd() {
        ((Animator) this.f22543a).start();
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public q0 onApplyWindowInsets(View view, q0 q0Var, ViewUtils.RelativePadding relativePadding) {
        return ((SearchView) this.f22543a).lambda$setUpToolbarInsetListener$4(view, q0Var, relativePadding);
    }
}
