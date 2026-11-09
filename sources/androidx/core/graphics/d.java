package androidx.core.graphics;

import android.graphics.Color;
import com.google.android.flexbox.FlexItem;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f16045a = new ThreadLocal();

    public static int a(double d2, double d10, double d11) {
        double d12 = (((-0.4986d) * d11) + (((-1.5372d) * d10) + (3.2406d * d2))) / 100.0d;
        double d13 = ((0.0415d * d11) + ((1.8758d * d10) + ((-0.9689d) * d2))) / 100.0d;
        double d14 = ((1.057d * d11) + (((-0.204d) * d10) + (0.0557d * d2))) / 100.0d;
        double dPow = d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d;
        double dPow2 = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        double dPow3 = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    public static int b(int i7, int i10, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f10) + (Color.alpha(i7) * f11)), (int) ((Color.red(i10) * f10) + (Color.red(i7) * f11)), (int) ((Color.green(i10) * f10) + (Color.green(i7) * f11)), (int) ((Color.blue(i10) * f10) + (Color.blue(i7) * f11)));
    }

    public static int c(int i7, int i10) {
        int iAlpha = Color.alpha(i10);
        int iAlpha2 = Color.alpha(i7);
        int i11 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i11, d(Color.red(i7), iAlpha2, Color.red(i10), iAlpha, i11), d(Color.green(i7), iAlpha2, Color.green(i10), iAlpha, i11), d(Color.blue(i7), iAlpha2, Color.blue(i10), iAlpha, i11));
    }

    public static int d(int i7, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return (((255 - i10) * (i11 * i12)) + ((i7 * 255) * i10)) / (i13 * 255);
    }

    public static int e(int i7, int i10) {
        if (i10 < 0 || i10 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i7 & FlexItem.MAX_SIZE) | (i10 << 24);
    }
}
