package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChangeScroll extends Transition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f17924a = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void f(f0 f0Var) {
        HashMap map = f0Var.f18045a;
        map.put("android:changeScroll:x", Integer.valueOf(f0Var.f18046b.getScrollX()));
        map.put("android:changeScroll:y", Integer.valueOf(f0Var.f18046b.getScrollY()));
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(f0 f0Var) {
        f(f0Var);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(f0 f0Var) {
        f(f0Var);
    }

    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, f0 f0Var, f0 f0Var2) {
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (f0Var == null || f0Var2 == null) {
            return null;
        }
        View view = f0Var2.f18046b;
        HashMap map = f0Var.f18045a;
        int iIntValue = ((Integer) map.get("android:changeScroll:x")).intValue();
        HashMap map2 = f0Var2.f18045a;
        int iIntValue2 = ((Integer) map2.get("android:changeScroll:x")).intValue();
        int iIntValue3 = ((Integer) map.get("android:changeScroll:y")).intValue();
        int iIntValue4 = ((Integer) map2.get("android:changeScroll:y")).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        boolean z3 = e0.f18037a;
        if (objectAnimatorOfInt == null) {
            return objectAnimatorOfInt2;
        }
        if (objectAnimatorOfInt2 == null) {
            return objectAnimatorOfInt;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2);
        return animatorSet;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return f17924a;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }
}
