package Qg;

import Pg.B;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f7851a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c6) {
        if ('0' <= c6 && c6 < ':') {
            return c6 - '0';
        }
        if ('a' <= c6 && c6 < 'g') {
            return c6 - 'W';
        }
        if ('A' <= c6 && c6 < 'G') {
            return c6 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c6);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    public static final int b(B b7, int i7) {
        int i10;
        Intrinsics.checkNotNullParameter(b7, "<this>");
        int[] iArr = b7.f7335g;
        int i11 = i7 + 1;
        int length = b7.f7334f.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i12 = length - 1;
        int i13 = 0;
        while (i13 <= i12) {
            i10 = (i13 + i12) >>> 1;
            int i14 = iArr[i10];
            if (i14 < i11) {
                i13 = i10 + 1;
            } else {
                if (i14 <= i11) {
                    if (i10 >= 0) {
                        return i10;
                    }
                    return ~i10;
                }
                i12 = i10 - 1;
            }
        }
        i10 = (-i13) - 1;
        if (i10 >= 0) {
            return i10;
        }
        return ~i10;
    }
}
