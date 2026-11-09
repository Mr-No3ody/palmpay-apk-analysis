package Z5;

import com.google.common.primitives.UnsignedBytes;
import p377z5.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {
    public static b c(byte[] bArr) {
        int i7;
        String str;
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            str = "";
        } else {
            int i10 = length / 3;
            int i11 = i10 * 3;
            if (length == 0) {
                i7 = 0;
            } else {
                i7 = i10 << 2;
                int i12 = length % 3;
                if (i12 != 0) {
                    i7 = i7 + i12 + 1;
                }
            }
            byte[] bArr2 = new byte[i7];
            int i13 = 0;
            int i14 = 0;
            while (i13 < i11) {
                int i15 = i13 + 2;
                int i16 = ((bArr[i13 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i13] & UnsignedBytes.MAX_VALUE) << 16);
                i13 += 3;
                int i17 = i16 | (bArr[i15] & UnsignedBytes.MAX_VALUE);
                bArr2[i14] = l.g((i17 >>> 18) & 63);
                bArr2[i14 + 1] = l.g((i17 >>> 12) & 63);
                int i18 = i14 + 3;
                bArr2[i14 + 2] = l.g((i17 >>> 6) & 63);
                i14 += 4;
                bArr2[i18] = l.g(i17 & 63);
            }
            int i19 = length - i11;
            if (i19 > 0) {
                int i20 = ((bArr[i11] & UnsignedBytes.MAX_VALUE) << 10) | (i19 == 2 ? (bArr[length - 1] & UnsignedBytes.MAX_VALUE) << 2 : 0);
                if (i19 == 2) {
                    bArr2[i7 - 3] = l.g(i20 >> 12);
                    bArr2[i7 - 2] = l.g((i20 >>> 6) & 63);
                    bArr2[i7 - 1] = l.g(i20 & 63);
                } else {
                    bArr2[i7 - 2] = l.g(i20 >> 12);
                    bArr2[i7 - 1] = l.g((i20 >>> 6) & 63);
                }
            }
            str = new String(bArr2, e.f11524a);
        }
        return new b(str);
    }

    @Override // Z5.a
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f11522a.equals(((a) obj).f11522a);
        }
        return false;
    }
}
