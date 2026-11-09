package kotlin.ranges;

import Rf.h;
import androidx.camera.video.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class b extends h {
    public static float b(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int c(int i7, int i10, int i11) {
        if (i10 <= i11) {
            if (i7 < i10) {
                return i10;
            }
            return i7 > i11 ? i11 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    public static long d(long j6, long j10, long j11) {
        if (j10 <= j11) {
            if (j6 < j10) {
                return j10;
            }
            return j6 > j11 ? j11 : j6;
        }
        StringBuilder sbR = u.r(j11, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbR.append(j10);
        sbR.append('.');
        throw new IllegalArgumentException(sbR.toString());
    }

    public static a e(IntRange intRange, int i7) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        h.a(i7 > 0, Integer.valueOf(i7));
        Rf.a aVar = a.f38976d;
        int i10 = intRange.f38977a;
        if (intRange.f38979c <= 0) {
            i7 = -i7;
        }
        return aVar.fromClosedRange(i10, intRange.f38978b, i7);
    }

    public static IntRange f(int i7, int i10) {
        return i10 <= Integer.MIN_VALUE ? IntRange.INSTANCE.getEMPTY() : new IntRange(i7, i10 - 1, 1);
    }
}
