package cn.tongdun.android.qgq9qg99.qgqq999g;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.adjust.sdk.Constants;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class qgqq999g extends q999ggg99999qqggqqg9qg {
    static {
        q999ggg99999qqggqqg9qg("5978352f6e747c76646e353a7a7f636873783f29627170616d72747e3e3c2b753d3d2b75633d753d63633d2b633d3d5b7877", 28);
    }

    public qgqq999g(Class cls) {
        super(cls);
        this.f19227q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("4951490019514243525e41474d", 47);
        this.qgq9qg99 = q999ggg99999qqggqqg9qg("592568723329212b3933686727223e352e2562743f2c2d3c302f292363617628606076283e6028603e3e60763e606006252a", 65);
    }

    public final String q999ggg99999qqggqqg9qg(Context context) {
        return (String) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("541b", 45), context);
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
            byte b7 = (byte) (i7 ^ 105);
            byte b10 = (byte) (bArr[0] ^ 58);
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

    public final Map q999ggg99999qqggqqg9qg(Context context, TelephonyManager telephonyManager) {
        return (Map) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("5466", 81), context, null, telephonyManager);
    }
}
