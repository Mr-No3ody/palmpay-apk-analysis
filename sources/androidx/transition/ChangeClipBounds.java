package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChangeClipBounds extends Transition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f17919a = {"android:clipBounds:clip"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rect f17920b = new Rect();

    public ChangeClipBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void f(f0 f0Var, boolean z3) {
        View view = f0Var.f18046b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z3 ? (Rect) view.getTag(E.transition_clip) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != f17920b ? clipBounds : null;
        HashMap map = f0Var.f18045a;
        map.put("android:clipBounds:clip", rect);
        if (rect == null) {
            map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(f0 f0Var) {
        f(f0Var, false);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(f0 f0Var) {
        f(f0Var, true);
    }

    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, f0 f0Var, f0 f0Var2) {
        if (f0Var == null || f0Var2 == null) {
            return null;
        }
        HashMap map = f0Var.f18045a;
        if (!map.containsKey("android:clipBounds:clip")) {
            return null;
        }
        HashMap map2 = f0Var2.f18045a;
        if (!map2.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) map.get("android:clipBounds:clip");
        Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) map.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) map2.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        f0Var2.f18046b.setClipBounds(rect);
        Rect rect5 = new Rect();
        C1256q c1256q = new C1256q(1);
        c1256q.f18097b = rect5;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(f0Var2.f18046b, k0.f18072c, c1256q, rect3, rect4);
        C1246g c1246g = new C1246g(f0Var2.f18046b, rect, rect2);
        objectAnimatorOfObject.addListener(c1246g);
        addListener(c1246g);
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return f17919a;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }
}
