package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC1102h f16817a;

    static {
        f16817a = (w2.f16804e && w2.f16803d && !AbstractC1086d.a()) ? new x2(1) : new x2(0);
    }

    public static int a(byte[] bArr, int i7, int i10) {
        byte b7 = bArr[i7 - 1];
        int i11 = i10 - i7;
        if (i11 == 0) {
            if (b7 > -12) {
                return -1;
            }
            return b7;
        }
        if (i11 == 1) {
            return c(b7, bArr[i7]);
        }
        if (i11 == 2) {
            return d(b7, bArr[i7], bArr[i7 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(String str) {
        int length = str.length();
        int i7 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i10 < length2) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 2048) {
                        i7 += (127 - cCharAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new y2(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i7;
                break;
            }
            i11 += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i11) + 4294967296L));
    }

    public static int c(int i7, int i10) {
        if (i7 > -12 || i10 > -65) {
            return -1;
        }
        return i7 ^ (i10 << 8);
    }

    public static int d(int i7, int i10, int i11) {
        if (i7 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i7 ^ (i10 << 8)) ^ (i11 << 16);
    }
}
