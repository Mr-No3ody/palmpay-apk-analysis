package kotlin.text;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.collections.AbstractC1836c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlin.text.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1865d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f39011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f39012b;

    static {
        int[] iArr = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        int i7 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = "0123456789abcdef".charAt(i10 & 15) | ("0123456789abcdef".charAt(i10 >> 4) << '\b');
        }
        f39011a = iArr;
        int[] iArr2 = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr2[i11] = "0123456789ABCDEF".charAt(i11 & 15) | ("0123456789ABCDEF".charAt(i11 >> 4) << '\b');
        }
        int[] iArr3 = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr3[i12] = -1;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        long[] jArr = new long[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        for (int i17 = 0; i17 < 256; i17++) {
            jArr[i17] = -1;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i18)] = i19;
            i18++;
            i19++;
        }
        int i20 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i7)] = i20;
            i7++;
            i20++;
        }
        f39012b = jArr;
    }

    public static final void a(int i7, int i10, String str) {
        int i11 = i10 - i7;
        if (i11 < 1) {
            String strSubstring = str.substring(i7, i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i7 + ", but was \"" + strSubstring + "\" of length " + i11);
        }
        if (i11 > 16) {
            int i12 = (i11 + i7) - 16;
            while (i7 < i12) {
                if (str.charAt(i7) != '0') {
                    StringBuilder sbE = androidx.camera.camera2.internal.F.e(i7, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbE.append(str.charAt(i7));
                    sbE.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbE.toString());
                }
                i7++;
            }
        }
    }

    public static long b(int i7, int i10, String str) {
        j format = j.f39018d.getDefault();
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractC1836c.f38922a.checkBoundsIndexes$kotlin_stdlib(i7, i10, str.length());
        if (format.f39023c.f39017a) {
            a(i7, i10, str);
            return c(i7, i10, str);
        }
        if (i10 - i7 > 0) {
            a(i7, i10, str);
            return c(i7, i10, str);
        }
        String strSubstring = str.substring(i7, i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException(C0.G.o("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ", strSubstring));
    }

    public static final long c(int i7, int i10, String str) {
        long j6 = 0;
        while (i7 < i10) {
            long j10 = j6 << 4;
            char cCharAt = str.charAt(i7);
            if ((cCharAt >>> '\b') == 0) {
                long j11 = f39012b[cCharAt];
                if (j11 >= 0) {
                    j6 = j10 | j11;
                    i7++;
                }
            }
            StringBuilder sbE = androidx.camera.camera2.internal.F.e(i7, "Expected a hexadecimal digit at index ", ", but was ");
            sbE.append(str.charAt(i7));
            throw new NumberFormatException(sbE.toString());
        }
        return j6;
    }
}
