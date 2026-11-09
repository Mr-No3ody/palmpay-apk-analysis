package H5;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f3699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f3700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f3701c;

    public c(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f3699a = paint;
        paint.setAlpha(255);
    }

    public final boolean a(int[] iArr) {
        this.f3700b = iArr;
        ColorStateList colorStateList = this.f3701c;
        int defaultColor = colorStateList != null ? colorStateList.getDefaultColor() : 0;
        ColorStateList colorStateList2 = this.f3701c;
        if (colorStateList2 != null) {
            defaultColor = colorStateList2.getColorForState(this.f3700b, defaultColor);
        }
        Paint paint = this.f3699a;
        int color = paint.getColor();
        paint.setColor(defaultColor);
        return defaultColor != color;
    }

    public final boolean b() {
        ColorStateList colorStateList = this.f3701c;
        return colorStateList != null && colorStateList.isStateful();
    }

    public final void c(int i7) {
        Paint paint = this.f3699a;
        if (paint.getAlpha() != i7) {
            paint.setAlpha(i7);
        }
    }

    public final String toString() {
        return "color=#" + Integer.toHexString(this.f3699a.getColor()) + ", state=" + this.f3700b + ", colorList=" + this.f3701c;
    }
}
