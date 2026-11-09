package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
abstract class HideViewOnScrollDelegate {
    public abstract <V extends View> int getSize(@NonNull V v3, @NonNull ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int getTargetTranslation();

    public abstract int getViewEdge();

    public abstract <V extends View> ViewPropertyAnimator getViewTranslationAnimator(@NonNull V v3, int i7);

    public abstract <V extends View> void setAdditionalHiddenOffset(@NonNull V v3, int i7, int i10);

    public abstract <V extends View> void setViewTranslation(@NonNull V v3, int i7);
}
