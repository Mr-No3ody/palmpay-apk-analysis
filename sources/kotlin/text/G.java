package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import p355xf.H;

/* JADX INFO: loaded from: classes4.dex */
public abstract class G {
    public static final boolean a(String str) {
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (Intrinsics.h(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    public static final byte b(String str) {
        p355xf.x xVar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        p355xf.A aD = d(str);
        if (aD != null) {
            int i7 = aD.f43946a;
            if (Integer.compare(Integer.MIN_VALUE ^ i7, -2147483393) > 0) {
                xVar = null;
            } else {
                xVar = new p355xf.x((byte) i7);
            }
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar.f43989a;
        }
        StringsKt__StringNumberConversionsKt.f(str);
        throw null;
    }

    public static final int c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        p355xf.A aD = d(str);
        if (aD != null) {
            return aD.f43946a;
        }
        StringsKt__StringNumberConversionsKt.f(str);
        throw null;
    }

    public static final p355xf.A d(String str) {
        int i7;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.h(cCharAt, 48) >= 0) {
            i7 = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i7 = 1;
        }
        p355xf.z zVar = p355xf.A.f43945b;
        int i11 = 119304647;
        int i12 = 119304647;
        while (i7 < length) {
            int iDigit = Character.digit((int) str.charAt(i7), 10);
            if (iDigit < 0) {
                return null;
            }
            int i13 = i10 ^ Integer.MIN_VALUE;
            if (Integer.compare(i13, i12 ^ Integer.MIN_VALUE) > 0) {
                if (i12 != i11) {
                    return null;
                }
                i12 = (int) ((((long) (-1)) & 4294967295L) / (((long) 10) & 4294967295L));
                if (Integer.compare(i13, i12 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i14 = i10 * 10;
            int i15 = i14 + iDigit;
            if (Integer.compare(i15 ^ Integer.MIN_VALUE, i14 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i7++;
            i10 = i15;
            i11 = 119304647;
        }
        return new p355xf.A(i10);
    }

    public static final long e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        p355xf.D dF = f(str);
        if (dF != null) {
            return dF.f43949a;
        }
        StringsKt__StringNumberConversionsKt.f(str);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00aa A[SYNTHETIC] */
    public static final p355xf.D f(String str) {
        int i7;
        long j6;
        int i10 = 1;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i11 = 10;
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (Intrinsics.h(cCharAt, 48) >= 0) {
            i7 = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i7 = 1;
        }
        long j10 = 10;
        p355xf.C c6 = p355xf.D.f43948b;
        long j11 = 0;
        long j12 = 512409557603043100L;
        while (i7 < length) {
            int i12 = i10;
            int iDigit = Character.digit((int) str.charAt(i7), i11);
            if (iDigit < 0) {
                return null;
            }
            int i13 = length;
            long j13 = j11 ^ Long.MIN_VALUE;
            int i14 = i7;
            if (Long.compare(j13, j12 ^ Long.MIN_VALUE) > 0) {
                if (j12 != 512409557603043100L) {
                    return null;
                }
                if (j10 < 0) {
                    if (Long.MAX_VALUE < (j10 ^ Long.MIN_VALUE)) {
                        j12 = 0;
                    } else {
                        j6 = 1;
                    }
                    if (Long.compare(j13, j12 ^ Long.MIN_VALUE) > 0) {
                        return null;
                    }
                } else {
                    long j14 = (Long.MAX_VALUE / j10) << i12;
                    j6 = j14 + ((long) ((((-1) - (j14 * j10)) ^ Long.MIN_VALUE) >= (j10 ^ Long.MIN_VALUE) ? i12 : 0));
                }
                j12 = j6;
                if (Long.compare(j13, j12 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j15 = j11 * j10;
            p355xf.z zVar = p355xf.A.f43945b;
            long j16 = (((long) iDigit) & 4294967295L) + j15;
            if (Long.compare(j16 ^ Long.MIN_VALUE, j15 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i7 = i14 + 1;
            j11 = j16;
            i10 = i12;
            length = i13;
            i11 = 10;
        }
        return new p355xf.D(j11);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    public static final short g(String str) {
        H h7;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        p355xf.A aD = d(str);
        if (aD != null) {
            int i7 = aD.f43946a;
            if (Integer.compare(Integer.MIN_VALUE ^ i7, -2147418113) > 0) {
                h7 = null;
            } else {
                h7 = new H((short) i7);
            }
        } else {
            h7 = null;
        }
        if (h7 != null) {
            return h7.f43953a;
        }
        StringsKt__StringNumberConversionsKt.f(str);
        throw null;
    }
}
