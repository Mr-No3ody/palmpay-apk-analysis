package com.transsnet.analysis.utils;

import android.os.Build;
import androidx.annotation.RequiresApi;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ThreadLocalRandom;
import p307u8.c;
import p307u8.d;

/* JADX INFO: loaded from: classes3.dex */
public class StringUtil {

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private static final char[] f25683ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1'};
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static ThreadLocal<MessageDigest> MD5_DIGEST = null;

    private static String bytes2HexString(final byte[] bytes) {
        int length;
        if (bytes == null || (length = bytes.length) <= 0) {
            return null;
        }
        char[] cArr = new char[length << 1];
        int i7 = 0;
        for (byte b7 : bytes) {
            int i10 = b7 & UnsignedBytes.MAX_VALUE;
            int i11 = i7 + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i7] = cArr2[i10 >> 4];
            i7 += 2;
            cArr[i11] = cArr2[b7 & Ascii.SI];
        }
        return new String(cArr);
    }

    public static synchronized String createRandomString(int length) {
        try {
            if (length <= 0) {
                if (length == 0) {
                    return "";
                }
                throw new IllegalArgumentException();
            }
            char[] cArr = new char[length];
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            int iNextInt = threadLocalRandomCurrent.nextInt();
            int i7 = 0;
            int i10 = 0;
            while (i7 < length % 5) {
                cArr[i10] = f25683ch[iNextInt & 63];
                iNextInt >>= 6;
                i7++;
                i10++;
            }
            for (int i11 = 0; i11 < length / 5; i11++) {
                int iNextInt2 = threadLocalRandomCurrent.nextInt();
                int i12 = 0;
                while (i12 < 5) {
                    cArr[i10] = f25683ch[iNextInt2 & 63];
                    iNextInt2 >>= 6;
                    i12++;
                    i10++;
                }
            }
            return new String(cArr, 0, length);
        } catch (Throwable th) {
            throw th;
        }
    }

    private static byte[] encryptMD5(final byte[] data) {
        ThreadLocal<MessageDigest> mD5Digest;
        if (data != null && data.length != 0) {
            try {
                if (Build.VERSION.SDK_INT < 26 || (mD5Digest = getMD5Digest()) == null) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(data);
                    return messageDigest.digest();
                }
                MessageDigest messageDigest2 = mD5Digest.get();
                messageDigest2.reset();
                return messageDigest2.digest(data);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static String encryptMD5String(final String originData) {
        byte[] bArrEncryptMD5;
        if (originData == null || (bArrEncryptMD5 = encryptMD5(originData.getBytes(StandardCharsets.UTF_8))) == null) {
            return null;
        }
        return bytes2HexString(bArrEncryptMD5);
    }

    @RequiresApi(api = 26)
    private static ThreadLocal<MessageDigest> getMD5Digest() {
        if (MD5_DIGEST == null) {
            MD5_DIGEST = new d(new c(1), 1);
        }
        return MD5_DIGEST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MessageDigest lambda$getMD5Digest$0() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
