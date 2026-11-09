package cn.tongdun.android.qgq9qg99.qgqq999g;

import android.net.wifi.WifiInfo;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import com.transsnet.palmpay.bean.HomeDialogState;

/* JADX INFO: loaded from: classes.dex */
public class q9q999qgg99gq9qq9qqq9g extends q999ggg99999qqggqqg9qg {
    static {
        q999ggg99999qqggqqg9qg("71105d47061c141e0c065d5212170b001b1057440312121d1a15145c54431d5555431d0b551d550b0b55430b555533150c", HomeDialogState.PRIORITY_HIGHEST);
    }

    public q9q999qgg99gq9qq9qqq9g(Class cls) {
        super(cls);
        this.f19227q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("612038716d29383837303f3e", 68);
        this.qgq9qg99 = q999ggg99999qqggqqg9qg("71165b41001a12180a005b5414110d061d1651420514141b1c13125a52451b5353451b0d531b530d0d53450d535335130a", 104);
    }

    public final String q999ggg99999qqggqqg9qg(WifiInfo wifiInfo, String str) {
        return (String) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("7c5b", 118), wifiInfo, str, Boolean.valueOf(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg));
    }

    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 115);
            byte b10 = (byte) (bArr[0] ^ Ascii.DC2);
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
}
