package com.palmpay.lib.ui.dialog.loading;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes3.dex */
public class LoadingView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RotateAnimation f24352a;

    public LoadingView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f24352a = rotateAnimation;
        rotateAnimation.setDuration(1000L);
        this.f24352a.setRepeatCount(-1);
        this.f24352a.setFillAfter(true);
        this.f24352a.setInterpolator(new LinearInterpolator());
        startAnimation(this.f24352a);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RotateAnimation rotateAnimation = this.f24352a;
        if (rotateAnimation != null) {
            rotateAnimation.cancel();
        }
        this.f24352a = null;
        clearAnimation();
    }
}
