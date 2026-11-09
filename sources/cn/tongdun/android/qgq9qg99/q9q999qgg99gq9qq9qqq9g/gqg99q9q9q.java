package cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g;

import android.os.Build;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
final class gqg99q9q9q implements qqggggg9g9q99q9gq.qgq9qg99 {
    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 122);
            byte b10 = (byte) (bArr[0] ^ Ascii.EM);
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

    @Override // cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g.qqggggg9g9q99q9gq.qgq9qg99
    public final void qgq9qg99(String str) {
        if (!new File(str).exists()) {
            throw new UnsatisfiedLinkError(q999ggg99999qqggqqg9qg("552c024b4f060c004c4708125d4c1418130e0e", 115));
        }
        System.load(str);
    }

    @Override // cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g.qqggggg9g9q99q9gq.qgq9qg99
    public final String qqggggg9g9q99q9gq(String str) {
        return (str.startsWith(q999ggg99999qqggqqg9qg("757d73", 2)) && str.endsWith(q999ggg99999qqggqqg9qg("376829", 79))) ? str : System.mapLibraryName(str);
    }

    @Override // cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g.qqggggg9g9q99q9gq.qgq9qg99
    public final void q999ggg99999qqggqqg9qg(String str) {
        System.loadLibrary(str);
    }

    @Override // cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g.qqggggg9g9q99q9gq.qgq9qg99
    public final String[] q999ggg99999qqggqqg9qg() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !q9q999qgg99gq9qq9qqq9g.q999ggg99999qqggqqg9qg(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }
}
