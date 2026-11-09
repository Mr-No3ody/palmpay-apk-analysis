package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.Visibility;
import androidx.transition.f0;

/* JADX INFO: loaded from: classes2.dex */
public final class Hold extends Visibility {
    @Override // androidx.transition.Visibility
    @NonNull
    public Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable f0 f0Var, @Nullable f0 f0Var2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // androidx.transition.Visibility
    @NonNull
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable f0 f0Var, @Nullable f0 f0Var2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
