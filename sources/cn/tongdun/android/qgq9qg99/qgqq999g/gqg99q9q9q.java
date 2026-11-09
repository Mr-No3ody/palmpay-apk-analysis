package cn.tongdun.android.qgq9qg99.qgqq999g;

import android.hardware.SensorManager;
import com.adjust.sdk.Constants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class gqg99q9q9q extends q999ggg99999qqggqqg9qg {
    static {
        q999ggg99999qqggqqg9qg("1e7b362c6d777f75676d3639797c606b707b3c2b607d6b6a6b2a3f28763e3e2876603e763e60603e28603e3e587a6b", 78);
    }

    public gqg99q9q9q(Class cls) {
        super(cls);
        this.f19227q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("0e223a736b233e282928", 13);
        this.qgq9qg99 = q999ggg99999qqggqqg9qg("1e7538226379717b6963383777726e657e7532256e7365646524312678303026786e3078306e6e30266e3030567465", 64);
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
            byte b7 = (byte) (i7 ^ 56);
            byte b10 = (byte) (bArr[0] ^ 125);
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

    public final String gqgg9q99qg9() {
        String str = (String) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("1326", 68), new Object[0]);
        return str == null ? q999ggg99999qqggqqg9qg("2662", 92) : str;
    }

    public final String qg9gqgqqggg9q9qg() {
        String str = (String) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("1345", 37), new Object[0]);
        return str == null ? q999ggg99999qqggqqg9qg("2615", 43) : str;
    }

    public final String qgq9qg99() {
        String str = (String) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("1349", 45), new Object[0]);
        return str == null ? q999ggg99999qqggqqg9qg("2630", 14) : str;
    }

    public final String qgqq999g() {
        String str = (String) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("1372", 17), new Object[0]);
        return str == null ? q999ggg99999qqggqqg9qg("2605", 59) : str;
    }

    public final String qqggggg9g9q99q9gq() {
        String str = (String) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("1303", 102), new Object[0]);
        return str == null ? q999ggg99999qqggqqg9qg("2654", 106) : str;
    }

    public final void q999ggg99999qqggqqg9qg(SensorManager sensorManager) {
        q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("1369", 15), sensorManager);
    }

    public final void qgq9qg99(SensorManager sensorManager) {
        q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("1357", 48), sensorManager);
    }

    public final List qqggggg9g9q99q9gq(SensorManager sensorManager) {
        return (List) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("1348", 41), sensorManager);
    }
}
