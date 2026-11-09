package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class Fade extends Visibility {
    public Fade(int i7) {
        setMode(i7);
    }

    public static float i(f0 f0Var, float f10) {
        Float f11;
        return (f0Var == null || (f11 = (Float) f0Var.f18045a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureStartValues(f0 f0Var) {
        super.captureStartValues(f0Var);
        Float fValueOf = (Float) f0Var.f18046b.getTag(E.transition_pause_alpha);
        if (fValueOf == null) {
            if (f0Var.f18046b.getVisibility() == 0) {
                fValueOf = Float.valueOf(k0.f18070a.d(f0Var.f18046b));
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        f0Var.f18045a.put("android:fade:transitionAlpha", fValueOf);
    }

    public final ObjectAnimator h(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        k0.b(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, k0.f18071b, f11);
        C1255p c1255p = new C1255p(view);
        objectAnimatorOfFloat.addListener(c1255p);
        getRootTransition().addListener(c1255p);
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, f0 f0Var, f0 f0Var2) {
        k0.f18070a.getClass();
        return h(view, i(f0Var, 0.0f), 1.0f);
    }

    @Override // androidx.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, f0 f0Var, f0 f0Var2) {
        k0.f18070a.getClass();
        ObjectAnimator objectAnimatorH = h(view, i(f0Var, 1.0f), 0.0f);
        if (objectAnimatorH == null) {
            k0.b(view, i(f0Var2, 1.0f));
        }
        return objectAnimatorH;
    }

    public Fade(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K.f17951d);
        setMode(Y.a.c(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        typedArrayObtainStyledAttributes.recycle();
    }
}
