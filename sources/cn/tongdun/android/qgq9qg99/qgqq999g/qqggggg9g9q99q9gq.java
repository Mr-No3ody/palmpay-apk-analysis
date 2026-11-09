package cn.tongdun.android.qgq9qg99.qgqq999g;

import android.content.Context;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public class qqggggg9g9q99q9gq extends q999ggg99999qqggqqg9qg {
    static {
        q999ggg99999qqggqqg9qg("332568723329212b3933686727223e352e25626a2b242a3d352e2968617628606076283e6028603e3e60763e6060063023", 60);
    }

    public qqggggg9g9q99q9gq(Class cls) {
        super(cls);
        this.f19227q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("2350480106444b45525a4146", 83);
        this.qgq9qg99 = q999ggg99999qqggqqg9qg("332e637938222a203238636c2c29353e252e6961202f21363e2522636a7d236b6b7d23356b236b35356b7d356b6b0d3b28", 55);
    }

    public final String q999ggg99999qqggqqg9qg(Context context, LocationManager locationManager) {
        return (String) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("3e5a", 16), context, locationManager, Boolean.valueOf(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg), 53);
    }

    public final String q999ggg99999qqggqqg9qg(WifiInfo wifiInfo) {
        return (String) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("3e58", 16), wifiInfo);
    }

    public final String q999ggg99999qqggqqg9qg(WifiManager wifiManager) {
        return (String) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("3e32", 124), wifiManager);
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
            byte b7 = (byte) (i7 ^ 20);
            byte b10 = (byte) (bArr[0] ^ 80);
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
