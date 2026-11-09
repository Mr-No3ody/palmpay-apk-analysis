package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChangeBounds extends Transition {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f17911b = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1241b f17912c = new C1241b("topLeft", 0, PointF.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1241b f17913d = new C1241b("bottomRight", 1, PointF.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1241b f17914e = new C1241b("bottomRight", 2, PointF.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1241b f17915f = new C1241b("topLeft", 3, PointF.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1241b f17916g = new C1241b(ViewProps.POSITION, 4, PointF.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1256q f17917i = new C1256q(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17918a;

    public ChangeBounds() {
        this.f17918a = false;
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(f0 f0Var) {
        captureValues(f0Var);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(f0 f0Var) {
        Rect rect;
        captureValues(f0Var);
        if (!this.f17918a || (rect = (Rect) f0Var.f18046b.getTag(E.transition_clip)) == null) {
            return;
        }
        f0Var.f18045a.put("android:changeBounds:clip", rect);
    }

    public final void captureValues(f0 f0Var) {
        View view = f0Var.f18046b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = f0Var.f18045a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", f0Var.f18046b.getParent());
        if (this.f17918a) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, f0 f0Var, f0 f0Var2) {
        int i7;
        int i10;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorA;
        if (f0Var != null && f0Var2 != null) {
            HashMap map = f0Var.f18045a;
            HashMap map2 = f0Var2.f18045a;
            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                View view = f0Var2.f18046b;
                Rect rect2 = (Rect) map.get("android:changeBounds:bounds");
                Rect rect3 = (Rect) map2.get("android:changeBounds:bounds");
                int i11 = rect2.left;
                int i12 = rect3.left;
                int i13 = rect2.top;
                int i14 = rect3.top;
                int i15 = rect2.right;
                int i16 = rect3.right;
                int i17 = rect2.bottom;
                int i18 = rect3.bottom;
                int i19 = i15 - i11;
                int i20 = i17 - i13;
                int i21 = i16 - i12;
                int i22 = i18 - i14;
                Rect rect4 = (Rect) map.get("android:changeBounds:clip");
                Rect rect5 = (Rect) map2.get("android:changeBounds:clip");
                if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
                    i7 = 0;
                } else {
                    i7 = (i11 == i12 && i13 == i14) ? 0 : 1;
                    if (i15 != i16 || i17 != i18) {
                        i7++;
                    }
                }
                if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                    i7++;
                }
                if (i7 <= 0) {
                    return null;
                }
                boolean z3 = this.f17918a;
                C1241b c1241b = f17916g;
                if (z3) {
                    k0.a(view, i11, i13, i11 + Math.max(i19, i21), i13 + Math.max(i20, i22));
                    ObjectAnimator objectAnimatorA = (i11 == i12 && i13 == i14) ? null : C.a(view, c1241b, getPathMotion().getPath(i11, i13, i12, i14));
                    boolean z8 = rect4 == null;
                    if (z8) {
                        i10 = 0;
                        rect = new Rect(0, 0, i19, i20);
                    } else {
                        i10 = 0;
                        rect = rect4;
                    }
                    boolean z10 = rect5 == null ? 1 : i10;
                    Rect rect6 = z10 != 0 ? new Rect(i10, i10, i21, i22) : rect5;
                    if (rect.equals(rect6)) {
                        objectAnimatorOfObject = null;
                    } else {
                        view.setClipBounds(rect);
                        objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f17917i, rect, rect6);
                        C1243d c1243d = new C1243d(view, rect, z8, rect6, z10, i11, i13, i15, i17, i12, i14, i16, i18);
                        objectAnimatorOfObject.addListener(c1243d);
                        addListener(c1243d);
                    }
                    boolean z11 = e0.f18037a;
                    animatorA = objectAnimatorA;
                    if (objectAnimatorA == null) {
                        animatorA = objectAnimatorOfObject;
                    } else if (objectAnimatorOfObject != null) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorA, objectAnimatorOfObject);
                        animatorA = animatorSet;
                    }
                } else {
                    k0.a(view, i11, i13, i15, i17);
                    if (i7 != 2) {
                        animatorA = (i11 == i12 && i13 == i14) ? C.a(view, f17914e, getPathMotion().getPath(i15, i17, i16, i18)) : C.a(view, f17915f, getPathMotion().getPath(i11, i13, i12, i14));
                    } else if (i19 == i21 && i20 == i22) {
                        animatorA = C.a(view, c1241b, getPathMotion().getPath(i11, i13, i12, i14));
                    } else {
                        C1245f c1245f = new C1245f(view);
                        ObjectAnimator objectAnimatorA2 = C.a(c1245f, f17912c, getPathMotion().getPath(i11, i13, i12, i14));
                        ObjectAnimator objectAnimatorA3 = C.a(c1245f, f17913d, getPathMotion().getPath(i15, i17, i16, i18));
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(objectAnimatorA2, objectAnimatorA3);
                        animatorSet2.addListener(new C1242c(c1245f));
                        animatorA = animatorSet2;
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    K.h(viewGroup4, true);
                    getRootTransition().addListener(new C1244e(viewGroup4));
                }
                return animatorA;
            }
        }
        return null;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return f17911b;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }

    public ChangeBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17918a = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K.f17949b);
        boolean z3 = Y.a.e((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
        typedArrayObtainStyledAttributes.recycle();
        this.f17918a = z3;
    }
}
