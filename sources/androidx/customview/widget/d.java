package androidx.customview.widget;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        float f11 = f10 - 1.0f;
        return (f11 * f11 * f11 * f11 * f11) + 1.0f;
    }
}
