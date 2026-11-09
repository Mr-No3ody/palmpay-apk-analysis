package com.google.android.material.transition;

import C0.G;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.transition.f0;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialSharedAxis extends MaterialVisibility<VisibilityAnimatorProvider> {

    @AttrRes
    private static final int DEFAULT_THEMED_DURATION_ATTR = R.attr.motionDurationLong1;

    @AttrRes
    private static final int DEFAULT_THEMED_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f22598X = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f22599Y = 1;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f22600Z = 2;
    private final int axis;
    private final boolean forward;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39801b})
    public @interface Axis {
    }

    public MaterialSharedAxis(int i7, boolean z3) {
        super(createPrimaryAnimatorProvider(i7, z3), createSecondaryAnimatorProvider());
        this.axis = i7;
        this.forward = z3;
    }

    private static VisibilityAnimatorProvider createPrimaryAnimatorProvider(int i7, boolean z3) {
        if (i7 == 0) {
            return new SlideDistanceProvider(z3 ? 8388613 : 8388611);
        }
        if (i7 == 1) {
            return new SlideDistanceProvider(z3 ? 80 : 48);
        }
        if (i7 == 2) {
            return new ScaleProvider(z3);
        }
        throw new IllegalArgumentException(G.m(i7, "Invalid axis: "));
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        return new FadeThroughProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    public int getAxis() {
        return this.axis;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @AttrRes
    public int getDurationThemeAttrResId(boolean z3) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @AttrRes
    public int getEasingThemeAttrResId(boolean z3) {
        return DEFAULT_THEMED_EASING_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @NonNull
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    @Nullable
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isForward() {
        return this.forward;
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Transition
    public /* bridge */ /* synthetic */ boolean isSeekingSupported() {
        return super.isSeekingSupported();
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, f0 f0Var, f0 f0Var2) {
        return super.onAppear(viewGroup, view, f0Var, f0Var2);
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, f0 f0Var, f0 f0Var2) {
        return super.onDisappear(viewGroup, view, f0Var, f0Var2);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(@NonNull VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(@Nullable VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}
