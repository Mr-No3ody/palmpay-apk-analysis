package Z5;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;
import p377z5.l;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11522a;

    public a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The Base64 value must not be null");
        }
        this.f11522a = str;
    }

    public final byte[] a() {
        char c6;
        String str = this.f11522a;
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(e.f11524a);
        int length = bytes.length;
        long j6 = (((long) length) * 6) >> 3;
        int i7 = (int) j6;
        if (i7 != j6) {
            throw new IllegalArgumentException(j6 + " cannot be cast to int without changing its value.");
        }
        byte[] bArr = new byte[i7];
        int i10 = 0;
        int i11 = 0;
        while (i10 < bytes.length) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < 4 && i10 < length) {
                int i14 = i10 + 1;
                byte b7 = bytes[i10];
                int iM = l.M(b7, 64) & l.N(b7, 91);
                int iM2 = l.M(b7, 96) & l.N(b7, 123);
                int iM3 = l.M(b7, 47) & l.N(b7, 58);
                int iL = l.L(b7, 43) | l.L(b7, 45);
                int iL2 = l.L(b7, 47) | l.L(b7, 95);
                byte[] bArr2 = bytes;
                int iO = l.O(iM2, b7 - 71, 0) | l.O(iM, b7 - 65, 0) | l.O(iM3, b7 + 4, 0) | l.O(iL, 62, 0) | l.O(iL2, 63, 0) | l.O(iM | iM2 | iM3 | iL | iL2, 0, -1);
                if (iO >= 0) {
                    i13 |= iO << (18 - (i12 * 6));
                    i12++;
                }
                i10 = i14;
                bytes = bArr2;
            }
            byte[] bArr3 = bytes;
            if (i12 >= 2) {
                int i15 = i11 + 1;
                bArr[i11] = (byte) (i13 >> 16);
                c6 = 3;
                if (i12 >= 3) {
                    int i16 = i11 + 2;
                    bArr[i15] = (byte) (i13 >> 8);
                    if (i12 >= 4) {
                        i11 += 3;
                        bArr[i16] = (byte) i13;
                    } else {
                        i11 = i16;
                    }
                } else {
                    i11 = i15;
                }
            } else {
                c6 = 3;
            }
            bytes = bArr3;
        }
        return Arrays.copyOf(bArr, i11);
    }

    public final BigInteger b() {
        return new BigInteger(1, a());
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f11522a.equals(((a) obj).f11522a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11522a.hashCode();
    }

    public final String toString() {
        return this.f11522a;
    }
}
