package cn.tongdun.android.q999ggg99999qqggqqg9qg;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
final class qqggggg9g9q99q9gq implements HostnameVerifier {
    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 90);
            byte b10 = (byte) (bArr[0] ^ 37);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.endsWith(q999ggg99999qqggqqg9qg("0b3f7e646c66747e25256e74", 63)) && !str.endsWith(q999ggg99999qqggqqg9qg("0b4f11191d104a400b11", 90))) {
            return false;
        }
        String peerHost = sSLSession.getPeerHost();
        return peerHost.endsWith(q999ggg99999qqggqqg9qg("0b7938222a20323863632832", 121)) || peerHost.endsWith(q999ggg99999qqggqqg9qg("0b164840444913195248", 3));
    }
}
