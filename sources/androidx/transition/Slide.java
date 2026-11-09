package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class Slide extends Visibility {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DecelerateInterpolator f17988b = new DecelerateInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AccelerateInterpolator f17989c = new AccelerateInterpolator();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G f17990d = new G(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final G f17991e = new G(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final H f17992f = new H(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final G f17993g = new G(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final G f17994i = new G(3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final H f17995j = new H(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CalculateSlide f17996a;

    public interface CalculateSlide {
        float getGoneX(ViewGroup viewGroup, View view);

        float getGoneY(ViewGroup viewGroup, View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({p192n.c.f39802c})
    public @interface GravityFlag {
    }

    public Slide(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        H h7 = f17995j;
        this.f17996a = h7;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K.f17953f);
        int iC = Y.a.c(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        if (iC == 3) {
            this.f17996a = f17990d;
        } else if (iC == 5) {
            this.f17996a = f17993g;
        } else if (iC == 48) {
            this.f17996a = f17992f;
        } else if (iC == 80) {
            this.f17996a = h7;
        } else if (iC == 8388611) {
            this.f17996a = f17991e;
        } else {
            if (iC != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f17996a = f17994i;
        }
        F f10 = new F();
        f10.f17935b = iC;
        setPropagation(f10);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureEndValues(f0 f0Var) {
        super.captureEndValues(f0Var);
        int[] iArr = new int[2];
        f0Var.f18046b.getLocationOnScreen(iArr);
        f0Var.f18045a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureStartValues(f0 f0Var) {
        super.captureStartValues(f0Var);
        int[] iArr = new int[2];
        f0Var.f18046b.getLocationOnScreen(iArr);
        f0Var.f18045a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, f0 f0Var, f0 f0Var2) {
        int[] iArr = (int[]) f0Var2.f18045a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return i0.a(view, f0Var2, iArr[0], iArr[1], this.f17996a.getGoneX(viewGroup, view), this.f17996a.getGoneY(viewGroup, view), translationX, translationY, f17988b, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, f0 f0Var, f0 f0Var2) {
        int[] iArr = (int[]) f0Var.f18045a.get("android:slide:screenPosition");
        return i0.a(view, f0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f17996a.getGoneX(viewGroup, view), this.f17996a.getGoneY(viewGroup, view), f17989c, this);
    }
}
