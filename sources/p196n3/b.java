package p196n3;

import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.common.i;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import p109h3.e;
import p213o2.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f39823a;

    static {
        c cVar = new c(4);
        Collections.addAll(cVar, 2, 7, 4, 5);
        Intrinsics.checkNotNullExpressionValue(cVar, "of(...)");
        f39823a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int a(i rotationOptions, e encodedImage) {
        int i7;
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        encodedImage.k();
        Integer numValueOf = Integer.valueOf(encodedImage.f37277d);
        c cVar = f39823a;
        int iIndexOf = cVar.indexOf(numValueOf);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        if (rotationOptions.a()) {
            i7 = 0;
        } else {
            if (rotationOptions.a()) {
                throw new IllegalStateException("Rotation is set to use EXIF");
            }
            i7 = rotationOptions.f21438a;
        }
        E e10 = cVar.get(((i7 / 90) + iIndexOf) % cVar.size());
        Intrinsics.checkNotNullExpressionValue(e10, "get(...)");
        return ((Number) e10).intValue();
    }

    public static final int b(i rotationOptions, e encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int i7 = 0;
        if (!(rotationOptions.f21438a != -2)) {
            return 0;
        }
        encodedImage.k();
        int i10 = encodedImage.f37276c;
        if (i10 == 90 || i10 == 180 || i10 == 270) {
            encodedImage.k();
            i7 = encodedImage.f37276c;
        }
        if (rotationOptions.a()) {
            return i7;
        }
        if (rotationOptions.a()) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return (rotationOptions.f21438a + i7) % MessageEvent.EVENT_CL_REPAYMENT_FAILED;
    }

    public static final int c(i rotationOptions, g gVar, e encodedImage, boolean z3) {
        int i7;
        int i10;
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (z3 && gVar != null) {
            int iB = b(rotationOptions, encodedImage);
            encodedImage.k();
            int iA = f39823a.contains(Integer.valueOf(encodedImage.f37277d)) ? a(rotationOptions, encodedImage) : 0;
            boolean z8 = iB == 90 || iB == 270 || iA == 5 || iA == 7;
            if (z8) {
                encodedImage.k();
                i7 = encodedImage.f37279f;
            } else {
                encodedImage.k();
                i7 = encodedImage.f37278e;
            }
            if (z8) {
                encodedImage.k();
                i10 = encodedImage.f37278e;
            } else {
                encodedImage.k();
                i10 = encodedImage.f37279f;
            }
            float f10 = i7;
            float f11 = i10;
            float fMax = Math.max(gVar.f21432a / f10, gVar.f21433b / f11);
            if (f10 * fMax > 2048.0f) {
                fMax = 2048.0f / f10;
            }
            if (f11 * fMax > 2048.0f) {
                fMax = 2048.0f / f11;
            }
            int i11 = (int) ((fMax * 8) + 0.6666667f);
            if (i11 <= 8) {
                if (i11 < 1) {
                    return 1;
                }
                return i11;
            }
        }
        return 8;
    }
}
