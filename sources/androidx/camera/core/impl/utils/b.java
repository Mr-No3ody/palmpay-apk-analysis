package androidx.camera.core.impl.utils;

import android.util.Rational;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Rational f14143a = new Rational(4, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rational f14144b = new Rational(3, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rational f14145c = new Rational(16, 9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Rational f14146d = new Rational(9, 16);

    public static boolean a(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        Size size3 = androidx.camera.core.internal.utils.d.f14361a;
        if (size.getHeight() * size.getWidth() >= androidx.camera.core.internal.utils.d.a(size2)) {
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i7 = width % 16;
            if (i7 == 0 && height % 16 == 0) {
                if (b(Math.max(0, height - 16), width, rational) || b(Math.max(0, width - 16), height, rational2)) {
                    return true;
                }
            } else {
                if (i7 == 0) {
                    return b(height, width, rational);
                }
                if (height % 16 == 0) {
                    return b(width, height, rational2);
                }
            }
        }
        return false;
    }

    public static boolean b(int i7, int i10, Rational rational) {
        p118hf.a.f(i10 % 16 == 0);
        double numerator = ((double) (rational.getNumerator() * i7)) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i10 + (-16))) && numerator < ((double) (i10 + 16));
    }
}
