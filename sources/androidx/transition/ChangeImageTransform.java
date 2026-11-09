package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChangeImageTransform extends Transition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f17921a = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1247h f17922b = new C1247h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1241b f17923c = new C1241b("animatedTransform", 5, Matrix.class);

    public ChangeImageTransform(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void f(f0 f0Var, boolean z3) {
        Matrix matrix;
        View view = f0Var.f18046b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap map = f0Var.f18045a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix2 = z3 ? (Matrix) imageView.getTag(E.transition_image_transform) : null;
            if (matrix2 == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix2 = new Matrix(imageView.getImageMatrix());
                } else {
                    int i7 = AbstractC1248i.f18063a[imageView.getScaleType().ordinal()];
                    if (i7 == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = new Matrix();
                        matrix.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    } else if (i7 != 2) {
                        matrix2 = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = imageView.getWidth();
                        float f10 = intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = imageView.getHeight();
                        float f11 = intrinsicHeight;
                        float fMax = Math.max(width / f10, height / f11);
                        int iRound = Math.round((width - (f10 * fMax)) / 2.0f);
                        int iRound2 = Math.round((height - (f11 * fMax)) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(fMax, fMax);
                        matrix.postTranslate(iRound, iRound2);
                    }
                    matrix2 = matrix;
                }
            }
            map.put("android:changeImageTransform:matrix", matrix2);
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
        Rect rect = (Rect) map.get("android:changeImageTransform:bounds");
        HashMap map2 = f0Var2.f18045a;
        Rect rect2 = (Rect) map2.get("android:changeImageTransform:bounds");
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) map.get("android:changeImageTransform:matrix");
        Matrix matrix2 = (Matrix) map2.get("android:changeImageTransform:matrix");
        boolean z3 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z3) {
            return null;
        }
        ImageView imageView = (ImageView) f0Var2.f18046b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        C1241b c1241b = f17923c;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            C1247h c1247h = f17922b;
            A a3 = B.f17910a;
            return ObjectAnimator.ofObject(imageView, c1241b, c1247h, a3, a3);
        }
        if (matrix == null) {
            matrix = B.f17910a;
        }
        if (matrix2 == null) {
            matrix2 = B.f17910a;
        }
        c1241b.getClass();
        K.b(imageView, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(imageView, c1241b, new d0(), matrix, matrix2);
        C1249j c1249j = new C1249j(imageView, matrix, matrix2);
        objectAnimatorOfObject.addListener(c1249j);
        objectAnimatorOfObject.addPauseListener(c1249j);
        addListener(c1249j);
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return f17921a;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }
}
