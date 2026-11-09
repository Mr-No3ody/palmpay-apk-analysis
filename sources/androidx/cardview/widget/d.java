package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f15038a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z3) {
        if (!z3) {
            return f10;
        }
        return (float) (((1.0d - f15038a) * ((double) f11)) + ((double) f10));
    }

    public static float b(float f10, float f11, boolean z3) {
        if (!z3) {
            return f10 * 1.5f;
        }
        return (float) (((1.0d - f15038a) * ((double) f11)) + ((double) (f10 * 1.5f)));
    }
}
