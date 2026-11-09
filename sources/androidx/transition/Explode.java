package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class Explode extends Visibility {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DecelerateInterpolator f17932b = new DecelerateInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AccelerateInterpolator f17933c = new AccelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f17934a;

    public Explode(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17934a = new int[2];
        setPropagation(new C1254o());
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureEndValues(f0 f0Var) {
        super.captureEndValues(f0Var);
        i(f0Var);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void captureStartValues(f0 f0Var) {
        super.captureStartValues(f0Var);
        i(f0Var);
    }

    public final void h(ViewGroup viewGroup, Rect rect, int[] iArr) {
        int iCenterX;
        int iCenterY;
        int[] iArr2 = this.f17934a;
        viewGroup.getLocationOnScreen(iArr2);
        int i7 = iArr2[0];
        int i10 = iArr2[1];
        Rect epicenter = getEpicenter();
        if (epicenter == null) {
            iCenterX = Math.round(viewGroup.getTranslationX()) + (viewGroup.getWidth() / 2) + i7;
            iCenterY = Math.round(viewGroup.getTranslationY()) + (viewGroup.getHeight() / 2) + i10;
        } else {
            iCenterX = epicenter.centerX();
            iCenterY = epicenter.centerY();
        }
        float fCenterX = rect.centerX() - iCenterX;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fSqrt = (float) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
        int i11 = iCenterX - i7;
        int i12 = iCenterY - i10;
        float fMax = Math.max(i11, viewGroup.getWidth() - i11);
        float fMax2 = Math.max(i12, viewGroup.getHeight() - i12);
        float fSqrt2 = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
        iArr[0] = Math.round((fCenterX / fSqrt) * fSqrt2);
        iArr[1] = Math.round(fSqrt2 * (fCenterY / fSqrt));
    }

    public final void i(f0 f0Var) {
        View view = f0Var.f18046b;
        int[] iArr = this.f17934a;
        view.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        int i10 = iArr[1];
        f0Var.f18045a.put("android:explode:screenBounds", new Rect(i7, i10, view.getWidth() + i7, view.getHeight() + i10));
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, f0 f0Var, f0 f0Var2) {
        Rect rect = (Rect) f0Var2.f18045a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = this.f17934a;
        h(viewGroup, rect, iArr);
        return i0.a(view, f0Var2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f17932b, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, f0 f0Var, f0 f0Var2) {
        float f10;
        float f11;
        Rect rect = (Rect) f0Var.f18045a.get("android:explode:screenBounds");
        int i7 = rect.left;
        int i10 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) f0Var.f18046b.getTag(E.transition_position);
        if (iArr != null) {
            int i11 = iArr[0];
            f10 = (i11 - rect.left) + translationX;
            int i12 = iArr[1];
            f11 = (i12 - rect.top) + translationY;
            rect.offsetTo(i11, i12);
        } else {
            f10 = translationX;
            f11 = translationY;
        }
        int[] iArr2 = this.f17934a;
        h(viewGroup, rect, iArr2);
        return i0.a(view, f0Var, i7, i10, translationX, translationY, f10 + iArr2[0], f11 + iArr2[1], f17933c, this);
    }
}
