package com.transsnet.palmpay.util;

import android.util.Base64;
import com.google.common.base.Ascii;
import com.microsoft.codepush.react.CodePushConstants;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class EncryptUtils {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private EncryptUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static byte[] base64Decode(byte[] bArr) {
        return Base64.decode(bArr, 2);
    }

    private static byte[] base64Encode(byte[] bArr) {
        return Base64.encode(bArr, 2);
    }

    private static String bytes2HexString(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        char[] cArr = new char[length << 1];
        int i7 = 0;
        for (byte b7 : bArr) {
            int i10 = i7 + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i7] = cArr2[(b7 >>> 4) & 15];
            i7 += 2;
            cArr[i10] = cArr2[b7 & Ascii.SI];
        }
        return new String(cArr);
    }

    public static byte[] decrypt3DES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "DESede", str, bArr3, false);
    }

    public static byte[] decryptAES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "AES", str, bArr3, false);
    }

    public static byte[] decryptBase64AES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return decryptAES(base64Decode(bArr), bArr2, str, bArr3);
    }

    public static byte[] decryptBase64DES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return decryptDES(base64Decode(bArr), bArr2, str, bArr3);
    }

    public static byte[] decryptBase64_3DES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return decrypt3DES(base64Decode(bArr), bArr2, str, bArr3);
    }

    public static byte[] decryptDES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "DES", str, bArr3, false);
    }

    public static byte[] decryptHexString3DES(String str, byte[] bArr, String str2, byte[] bArr2) {
        return decrypt3DES(hexString2Bytes(str), bArr, str2, bArr2);
    }

    public static byte[] decryptHexStringAES(String str, byte[] bArr, String str2, byte[] bArr2) {
        return decryptAES(hexString2Bytes(str), bArr, str2, bArr2);
    }

    public static byte[] decryptHexStringDES(String str, byte[] bArr, String str2, byte[] bArr2) {
        return decryptDES(hexString2Bytes(str), bArr, str2, bArr2);
    }

    public static byte[] encrypt3DES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "DESede", str, bArr3, true);
    }

    public static byte[] encrypt3DES2Base64(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return base64Encode(encrypt3DES(bArr, bArr2, str, bArr3));
    }

    public static String encrypt3DES2HexString(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return bytes2HexString(encrypt3DES(bArr, bArr2, str, bArr3));
    }

    public static byte[] encryptAES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "AES", str, bArr3, true);
    }

    public static byte[] encryptAES2Base64(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return base64Encode(encryptAES(bArr, bArr2, str, bArr3));
    }

    public static String encryptAES2HexString(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return bytes2HexString(encryptAES(bArr, bArr2, str, bArr3));
    }

    public static byte[] encryptDES(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return symmetricTemplate(bArr, bArr2, "DES", str, bArr3, true);
    }

    public static byte[] encryptDES2Base64(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return base64Encode(encryptDES(bArr, bArr2, str, bArr3));
    }

    public static String encryptDES2HexString(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return bytes2HexString(encryptDES(bArr, bArr2, str, bArr3));
    }

    public static byte[] encryptHmacMD5(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacMD5");
    }

    public static String encryptHmacMD5ToString(String str, String str2) {
        return encryptHmacMD5ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA1(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA1");
    }

    public static String encryptHmacSHA1ToString(String str, String str2) {
        return encryptHmacSHA1ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA224(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA224");
    }

    public static String encryptHmacSHA224ToString(String str, String str2) {
        return encryptHmacSHA224ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA256(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA256");
    }

    public static String encryptHmacSHA256ToString(String str, String str2) {
        return encryptHmacSHA256ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA384(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA384");
    }

    public static String encryptHmacSHA384ToString(String str, String str2) {
        return encryptHmacSHA384ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptHmacSHA512(byte[] bArr, byte[] bArr2) {
        return hmacTemplate(bArr, bArr2, "HmacSHA512");
    }

    public static String encryptHmacSHA512ToString(String str, String str2) {
        return encryptHmacSHA512ToString(str.getBytes(), str2.getBytes());
    }

    public static byte[] encryptMD5(byte[] bArr) {
        return hashTemplate(bArr, "MD5");
    }

    public static byte[] encryptMD5File(String str) {
        return encryptMD5File(isSpace(str) ? null : new File(str));
    }

    public static String encryptMD5File2String(String str) {
        return encryptMD5File2String(isSpace(str) ? null : new File(str));
    }

    public static String encryptMD5ToString(String str) {
        return encryptMD5ToString(str.getBytes());
    }

    public static byte[] encryptSHA1(byte[] bArr) {
        return hashTemplate(bArr, "SHA1");
    }

    public static String encryptSHA1ToString(String str) {
        return encryptSHA1ToString(str.getBytes());
    }

    public static byte[] encryptSHA224(byte[] bArr) {
        return hashTemplate(bArr, "SHA224");
    }

    public static String encryptSHA224ToString(String str) {
        return encryptSHA224ToString(str.getBytes());
    }

    public static byte[] encryptSHA256(byte[] bArr) {
        return hashTemplate(bArr, "SHA256");
    }

    public static String encryptSHA256ToString(String str) {
        return encryptSHA256ToString(str.getBytes());
    }

    public static String getFileMD5(File file) {
        MessageDigest messageDigest;
        if (file == null || !file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                while (true) {
                    int i7 = fileInputStream.read(bArr, 0, 1024);
                    if (i7 == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i7);
                }
                fileInputStream.close();
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
            }
        } catch (Exception e11) {
            e = e11;
            messageDigest = null;
        }
        if (messageDigest != null) {
            return Base64.encodeToString(messageDigest.digest(), 2);
        }
        return null;
    }

    private static byte[] hashTemplate(byte[] bArr, String str) {
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    private static int hex2Dec(char c6) {
        if (c6 >= '0' && c6 <= '9') {
            return c6 - '0';
        }
        if (c6 < 'A' || c6 > 'F') {
            throw new IllegalArgumentException();
        }
        return c6 - '7';
    }

    private static byte[] hexString2Bytes(String str) {
        if (isSpace(str)) {
            return null;
        }
        int length = str.length();
        if (length % 2 != 0) {
            str = "0".concat(str);
            length++;
        }
        char[] charArray = str.toUpperCase().toCharArray();
        byte[] bArr = new byte[length >> 1];
        for (int i7 = 0; i7 < length; i7 += 2) {
            bArr[i7 >> 1] = (byte) ((hex2Dec(charArray[i7]) << 4) | hex2Dec(charArray[i7 + 1]));
        }
        return bArr;
    }

    private static byte[] hmacTemplate(byte[] bArr, byte[] bArr2, String str) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
                Mac mac = Mac.getInstance(str);
                mac.init(secretKeySpec);
                return mac.doFinal(bArr);
            } catch (InvalidKeyException | NoSuchAlgorithmException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!Character.isWhitespace(str.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    private static byte[] symmetricTemplate(byte[] bArr, byte[] bArr2, String str, String str2, byte[] bArr3, boolean z3) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
                Cipher cipher = Cipher.getInstance(str2);
                if (bArr3 == null || bArr3.length == 0) {
                    cipher.init(z3 ? 1 : 2, secretKeySpec);
                } else {
                    cipher.init(z3 ? 1 : 2, secretKeySpec, new IvParameterSpec(bArr3));
                }
                return cipher.doFinal(bArr);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public static String encryptHmacMD5ToString(byte[] bArr, byte[] bArr2) {
        return bytes2HexString(encryptHmacMD5(bArr, bArr2));
    }

    public static String encryptHmacSHA1ToString(byte[] bArr, byte[] bArr2) {
        return bytes2HexString(encryptHmacSHA1(bArr, bArr2));
    }

    public static String encryptHmacSHA224ToString(byte[] bArr, byte[] bArr2) {
        return bytes2HexString(encryptHmacSHA224(bArr, bArr2));
    }

    public static String encryptHmacSHA256ToString(byte[] bArr, byte[] bArr2) {
        return bytes2HexString(encryptHmacSHA256(bArr, bArr2));
    }

    public static String encryptHmacSHA384ToString(byte[] bArr, byte[] bArr2) {
        return bytes2HexString(encryptHmacSHA384(bArr, bArr2));
    }

    public static String encryptHmacSHA512ToString(byte[] bArr, byte[] bArr2) {
        return bytes2HexString(encryptHmacSHA512(bArr, bArr2));
    }

    public static String encryptMD5ToString(String str, String str2) {
        return bytes2HexString(encryptMD5((str + str2).getBytes()));
    }

    public static String encryptSHA1ToString(byte[] bArr) {
        return bytes2HexString(encryptSHA1(bArr));
    }

    public static String encryptSHA224ToString(byte[] bArr) {
        return bytes2HexString(encryptSHA224(bArr));
    }

    public static String encryptSHA256ToString(byte[] bArr) {
        return bytes2HexString(encryptSHA256(bArr));
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0031: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:13:0x0031 */
    public static byte[] encryptMD5File(File file) throws Throwable {
        Closeable closeable;
        FileInputStream fileInputStream;
        Closeable closeable2 = null;
        try {
            if (file == null) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, MessageDigest.getInstance("MD5"));
                    while (digestInputStream.read(new byte[CodePushConstants.DOWNLOAD_BUFFER_SIZE]) > 0) {
                    }
                    byte[] bArrDigest = digestInputStream.getMessageDigest().digest();
                    CloseUtils.closeIO(fileInputStream);
                    return bArrDigest;
                } catch (IOException e10) {
                    e = e10;
                    e.printStackTrace();
                    CloseUtils.closeIO(fileInputStream);
                    return null;
                } catch (NoSuchAlgorithmException e11) {
                    e = e11;
                    e.printStackTrace();
                    CloseUtils.closeIO(fileInputStream);
                    return null;
                }
            } catch (IOException e12) {
                e = e12;
                fileInputStream = null;
                e.printStackTrace();
                CloseUtils.closeIO(fileInputStream);
                return null;
            } catch (NoSuchAlgorithmException e13) {
                e = e13;
                fileInputStream = null;
                e.printStackTrace();
                CloseUtils.closeIO(fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                CloseUtils.closeIO(closeable2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
        }
    }

    public static String encryptMD5File2String(File file) {
        return bytes2HexString(encryptMD5File(file));
    }

    public static String encryptMD5ToString(byte[] bArr) {
        return bytes2HexString(encryptMD5(bArr));
    }

    public static String encryptMD5ToString(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bytes2HexString(encryptMD5(bArr3));
    }
}
