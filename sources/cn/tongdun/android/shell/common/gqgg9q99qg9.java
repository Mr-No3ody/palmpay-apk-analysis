package cn.tongdun.android.shell.common;

import com.adjust.sdk.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class gqgg9q99qg9 {
    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (bArr[0] ^ 95);
            bArr[0] = b7;
            for (int i12 = 1; i12 < length; i12++) {
                b7 = (byte) ((b7 ^ bArr[i12]) ^ 69);
                bArr[i12] = b7;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String q999ggg99999qqggqqg9qg(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b7 : bArr) {
            sb2.append(String.format(Locale.US, q999ggg99999qqggqqg9qg("7a50470f", 28), Byte.valueOf(b7)));
        }
        return sb2.toString();
    }
}
