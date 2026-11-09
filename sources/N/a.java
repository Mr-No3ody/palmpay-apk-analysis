package N;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f6025a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f6026b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f6027c = new Object[0];

    public static final int a(int i7, int i10, int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i11 = i7 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = array[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final int b(long[] array, int i7, long j6) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i10 = i7 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j10 = array[i12];
            if (j10 < j6) {
                i11 = i12 + 1;
            } else {
                if (j10 <= j6) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }
}
