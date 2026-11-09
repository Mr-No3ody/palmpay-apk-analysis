package Ag;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f355a = {0, 0, -92, -127};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f356b = {0, 0, -19, 65};

    public static byte[] a(char[] cArr) {
        try {
            ByteBuffer byteBufferEncode = b.f357a.encode(CharBuffer.wrap(cArr));
            byte[] bArr = new byte[byteBufferEncode.limit()];
            byteBufferEncode.get(bArr);
            return bArr;
        } catch (Exception unused) {
            byte[] bArr2 = new byte[cArr.length];
            for (int i7 = 0; i7 < cArr.length; i7++) {
                bArr2[i7] = (byte) cArr[i7];
            }
            return bArr2;
        }
    }

    public static long b(long j6) {
        long j10;
        if (j6 < 0) {
            return 2162688L;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        int i7 = calendar.get(1);
        if (i7 < 1980) {
            j10 = 2162688;
        } else {
            j10 = (calendar.get(13) >> 1) | ((i7 - 1980) << 25) | ((calendar.get(2) + 1) << 21) | (calendar.get(5) << 16) | (calendar.get(11) << 11) | (calendar.get(12) << 5);
        }
        if (j10 != 2162688) {
            return j10 + ((j6 % 2000) << 32);
        }
        return 2162688L;
    }

    public static boolean c(String str) {
        return str != null && str.trim().length() > 0;
    }

    public static boolean d(String str) {
        return str.endsWith("/") || str.endsWith("\\");
    }

    public static byte e(byte b7, int i7) {
        return (byte) (b7 | (1 << i7));
    }
}
