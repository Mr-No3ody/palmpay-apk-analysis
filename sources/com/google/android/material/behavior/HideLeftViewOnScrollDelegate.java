package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
final class HideLeftViewOnScrollDelegate extends HideViewOnScrollDelegate {
    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    public <V extends View> int getSize(@NonNull V v3, @NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return v3.getMeasuredWidth() + marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    public int getTargetTranslation() {
        return 0;
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    public int getViewEdge() {
        return 2;
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    public <V extends View> ViewPropertyAnimator getViewTranslationAnimator(@NonNull V v3, int i7) {
        return v3.animate().translationX(-i7);
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    public <V extends View> void setAdditionalHiddenOffset(@NonNull V v3, int i7, int i10) {
        v3.setTranslationX(i7 - i10);
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    public <V extends View> void setViewTranslation(@NonNull V v3, int i7) {
        v3.setTranslationX(-i7);
    }
}
