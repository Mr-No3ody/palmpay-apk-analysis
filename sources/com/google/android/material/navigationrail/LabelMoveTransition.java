package com.google.android.material.navigationrail;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.transition.Transition;
import androidx.transition.f0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
class LabelMoveTransition extends Transition {
    private static final float HORIZONTAL_DISTANCE = -30.0f;
    private static final String LABEL_VISIBILITY = "NavigationRailLabelVisibility";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createAnimator$0(View view, ValueAnimator valueAnimator) {
        view.setTranslationX((1.0f - valueAnimator.getAnimatedFraction()) * HORIZONTAL_DISTANCE);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull f0 f0Var) {
        f0Var.f18045a.put(LABEL_VISIBILITY, Integer.valueOf(f0Var.f18046b.getVisibility()));
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull f0 f0Var) {
        f0Var.f18045a.put(LABEL_VISIBILITY, Integer.valueOf(f0Var.f18046b.getVisibility()));
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable f0 f0Var, @Nullable f0 f0Var2) {
        if (f0Var == null || f0Var2 == null) {
            return null;
        }
        HashMap map = f0Var.f18045a;
        if (map.get(LABEL_VISIBILITY) == null) {
            return null;
        }
        HashMap map2 = f0Var2.f18045a;
        if (map2.get(LABEL_VISIBILITY) == null || ((Integer) map.get(LABEL_VISIBILITY)).intValue() != 8 || ((Integer) map2.get(LABEL_VISIBILITY)).intValue() != 0) {
            return null;
        }
        final View view = f0Var2.f18046b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigationrail.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LabelMoveTransition.lambda$createAnimator$0(view, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }
}
