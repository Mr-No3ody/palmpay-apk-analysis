package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.BaseInterpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static ObjectAnimator a(View view, f0 f0Var, int i7, int i10, float f10, float f11, float f12, float f13, BaseInterpolator baseInterpolator, Visibility visibility) {
        float f14;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) f0Var.f18046b.getTag(E.transition_position);
        if (iArr != null) {
            f10 = (iArr[0] - i7) + translationX;
            f14 = (iArr[1] - i10) + translationY;
        } else {
            f14 = f11;
        }
        view.setTranslationX(f10);
        view.setTranslationY(f14);
        if (f10 == f12 && f14 == f13) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f14, f13));
        h0 h0Var = new h0(view, f0Var.f18046b, translationX, translationY);
        visibility.addListener(h0Var);
        objectAnimatorOfPropertyValuesHolder.addListener(h0Var);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(baseInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
