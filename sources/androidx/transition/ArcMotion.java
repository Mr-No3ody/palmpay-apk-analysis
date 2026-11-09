package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class ArcMotion extends PathMotion {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f17906d = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17909c;

    public ArcMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17907a = 0.0f;
        this.f17908b = 0.0f;
        this.f17909c = f17906d;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K.f17955h);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f17908b = a(!Y.a.e(xmlPullParser, "minimumVerticalAngle") ? 0.0f : typedArrayObtainStyledAttributes.getFloat(1, 0.0f));
        this.f17907a = a(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "minimumHorizontalAngle") != null ? typedArrayObtainStyledAttributes.getFloat(0, 0.0f) : 0.0f);
        this.f17909c = a(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "maximumAngle") != null ? typedArrayObtainStyledAttributes.getFloat(2, 70.0f) : 70.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f10) {
        if (f10 < 0.0f || f10 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f10 / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    public final Path getPath(float f10, float f11, float f12, float f13) {
        float fE;
        float fE2;
        float f14;
        Path path = new Path();
        path.moveTo(f10, f11);
        float f15 = f12 - f10;
        float f16 = f13 - f11;
        float f17 = (f16 * f16) + (f15 * f15);
        float f18 = (f10 + f12) / 2.0f;
        float f19 = (f11 + f13) / 2.0f;
        float f20 = 0.25f * f17;
        boolean z3 = f11 > f13;
        if (Math.abs(f15) < Math.abs(f16)) {
            float fAbs = Math.abs(f17 / (f16 * 2.0f));
            if (z3) {
                fE2 = fAbs + f13;
                fE = f12;
            } else {
                fE2 = fAbs + f11;
                fE = f10;
            }
            f14 = this.f17908b;
        } else {
            float f21 = f17 / (f15 * 2.0f);
            if (z3) {
                fE2 = f11;
                fE = f21 + f10;
            } else {
                fE = f12 - f21;
                fE2 = f13;
            }
            f14 = this.f17907a;
        }
        float f22 = f20 * f14 * f14;
        float f23 = f18 - fE;
        float f24 = f19 - fE2;
        float f25 = (f24 * f24) + (f23 * f23);
        float f26 = this.f17909c;
        float f27 = f20 * f26 * f26;
        if (f25 >= f22) {
            f22 = f25 > f27 ? f27 : 0.0f;
        }
        if (f22 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f22 / f25);
            fE = com.horcrux.svg.d0.e(fE, f18, fSqrt, f18);
            fE2 = com.horcrux.svg.d0.e(fE2, f19, fSqrt, f19);
        }
        path.cubicTo((f10 + fE) / 2.0f, (f11 + fE2) / 2.0f, (fE + f12) / 2.0f, (fE2 + f13) / 2.0f, f12, f13);
        return path;
    }
}
