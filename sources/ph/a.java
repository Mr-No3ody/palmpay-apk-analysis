package ph;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public enum a {
    SINGLE;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f41317a = {-1, -40, -1};

    public static boolean a(int i7, String str) {
        if (i7 <= 0) {
            return true;
        }
        File file = new File(str);
        return file.exists() && file.length() > (((long) i7) << 10);
    }

    public static int b(byte[] bArr, int i7, int i10, boolean z3) {
        int i11;
        if (z3) {
            i7 += i10 - 1;
            i11 = -1;
        } else {
            i11 = 1;
        }
        int i12 = 0;
        while (true) {
            int i13 = i10 - 1;
            if (i10 <= 0) {
                return i12;
            }
            i12 = (bArr[i7] & UnsignedBytes.MAX_VALUE) | (i12 << 8);
            i7 += i11;
            i10 = i13;
        }
    }

    public static byte[] c(InputStream inputStream) {
        if (inputStream == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                try {
                    int i7 = inputStream.read(bArr, 0, 4096);
                    if (i7 != -1) {
                        byteArrayOutputStream.write(bArr, 0, i7);
                    } else {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            } catch (Exception unused3) {
                byte[] bArr2 = new byte[0];
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused4) {
                }
                return bArr2;
            }
        }
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
