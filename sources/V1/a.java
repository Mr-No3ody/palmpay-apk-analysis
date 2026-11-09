package V1;

import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f9981a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static int a(byte b7) {
        return b7 < 0 ? b7 + Ascii.NUL : b7;
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(Constants.ENCODING);
        } catch (UnsupportedEncodingException e10) {
            throw new Error(e10);
        }
    }

    public static String c(int i7, byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1) + (i7 > 0 ? length / i7 : 0)];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (i7 > 0 && i11 % i7 == 0 && i10 > 0) {
                cArr[i10] = '-';
                i10++;
            }
            int i12 = i10 + 1;
            char[] cArr2 = f9981a;
            byte b7 = bArr[i11];
            cArr[i10] = cArr2[(b7 & 240) >>> 4];
            i10 += 2;
            cArr[i12] = cArr2[b7 & Ascii.SI];
        }
        return new String(cArr);
    }

    public static String d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static double e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << Ascii.CAN) & (-16777216)) | ((bArr[1] << Ascii.DLE) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & UnsignedBytes.MAX_VALUE))) / 1.073741824E9d;
    }

    public static double f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << Ascii.CAN) & (-16777216)) | ((bArr[1] << Ascii.DLE) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & UnsignedBytes.MAX_VALUE))) / 65536.0d;
    }

    public static float g(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return ((short) (((short) ((bArr[0] << 8) & 65280)) | (bArr[1] & UnsignedBytes.MAX_VALUE))) / 256.0f;
    }

    public static int h(ByteBuffer byteBuffer) {
        return a(byteBuffer.get()) + (a(byteBuffer.get()) << 8);
    }

    public static int i(ByteBuffer byteBuffer) {
        return a(byteBuffer.get()) + (h(byteBuffer) << 8);
    }

    public static long j(ByteBuffer byteBuffer) {
        long j6 = byteBuffer.getInt();
        return j6 < 0 ? j6 + 4294967296L : j6;
    }

    public static long k(ByteBuffer byteBuffer) {
        long j6 = j(byteBuffer) << 32;
        if (j6 >= 0) {
            return j(byteBuffer) + j6;
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static int l(ByteBuffer byteBuffer) {
        return a(byteBuffer.get());
    }

    public static int m(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes(Constants.ENCODING).length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException();
        }
    }

    public static void n(ByteBuffer byteBuffer, double d2) {
        int i7 = (int) (d2 * 1.073741824E9d);
        byteBuffer.put((byte) (((-16777216) & i7) >> 24));
        byteBuffer.put((byte) ((16711680 & i7) >> 16));
        byteBuffer.put((byte) ((65280 & i7) >> 8));
        byteBuffer.put((byte) (i7 & 255));
    }

    public static void o(ByteBuffer byteBuffer, double d2) {
        int i7 = (int) (d2 * 65536.0d);
        byteBuffer.put((byte) (((-16777216) & i7) >> 24));
        byteBuffer.put((byte) ((16711680 & i7) >> 16));
        byteBuffer.put((byte) ((65280 & i7) >> 8));
        byteBuffer.put((byte) (i7 & 255));
    }

    public static void p(ByteBuffer byteBuffer, double d2) {
        short s3 = (short) (d2 * 256.0d);
        byteBuffer.put((byte) ((65280 & s3) >> 8));
        byteBuffer.put((byte) (s3 & 255));
    }

    public static void q(int i7, ByteBuffer byteBuffer) {
        s((65535 & i7) >> 8, byteBuffer);
        byteBuffer.put((byte) (i7 & 255));
    }

    public static void r(int i7, ByteBuffer byteBuffer) {
        q((16777215 & i7) >> 8, byteBuffer);
        byteBuffer.put((byte) (i7 & 255));
    }

    public static void s(int i7, ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (i7 & 255));
    }
}
