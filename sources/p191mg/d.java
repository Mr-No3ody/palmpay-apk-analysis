package p191mg;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f39723a = new char[117];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f39724b = new byte[126];

    static {
        int i7 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
        }
        a(8, 'b');
        a(9, 't');
        a(10, 'n');
        a(12, 'f');
        a(13, 'r');
        a(47, '/');
        a(34, '\"');
        a(92, '\\');
        while (true) {
            byte[] bArr = f39724b;
            if (i7 >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i7] = Ascii.DEL;
            i7++;
        }
    }

    public static void a(int i7, char c6) {
        if (c6 != 'u') {
            f39723a[c6] = (char) i7;
        }
    }
}
