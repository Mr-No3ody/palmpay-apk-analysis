package com.luck.picture.lib.utils;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: loaded from: classes3.dex */
public class AnimUtils {
    public static final int DURATION = 250;

    public static void rotateArrow(ImageView imageView, boolean z3) {
        float f10 = 180.0f;
        float f11 = 0.0f;
        if (z3) {
            f11 = 180.0f;
            f10 = 0.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, ViewProps.ROTATION, f10, f11);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.start();
    }

    public static void selectZoom(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, ViewProps.SCALE_X, 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(view, ViewProps.SCALE_Y, 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.start();
    }
}
