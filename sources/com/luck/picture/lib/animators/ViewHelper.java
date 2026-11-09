package com.luck.picture.lib.animators;

import android.view.View;
import androidx.core.view.N;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewHelper {
    public static void clear(View view) {
        view.setAlpha(1.0f);
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(0.0f);
        view.setRotationY(0.0f);
        view.setRotationX(0.0f);
        view.setPivotY(view.getMeasuredHeight() / 2);
        view.setPivotX(view.getMeasuredWidth() / 2);
        WeakReference weakReference = N.a(view).f16184a;
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.animate().setInterpolator(null);
        }
        View view3 = (View) weakReference.get();
        if (view3 != null) {
            view3.animate().setStartDelay(0L);
        }
    }
}
