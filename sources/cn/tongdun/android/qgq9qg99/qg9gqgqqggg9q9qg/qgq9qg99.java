package cn.tongdun.android.qgq9qg99.qg9gqgqqggg9q9qg;

import android.text.TextUtils;
import cn.tongdun.android.qgq9qg99.qgq9qg99.qggq9gqq9q99g99q;
import com.adjust.sdk.Constants;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class qgq9qg99 implements cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg {
    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 78);
            byte b10 = (byte) (bArr[0] ^ 100);
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

    @Override // cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg
    public final void q999ggg99999qqggqqg9qg(Map map) {
        if (map != null) {
            try {
                List list = (List) map.get(q999ggg99999qqggqqg9qg("372d0a4275371b1f1917", 85));
                if (list == null || list.size() <= 0) {
                    return;
                }
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    String str = (String) list.get(i7);
                    if (str.contains(q999ggg99999qqggqqg9qg("3c13021e6a", 93))) {
                        for (String str2 : str.split(q999ggg99999qqggqqg9qg("5f", 18))) {
                            if (str2.startsWith(q999ggg99999qqggqqg9qg("3c1f0e12", 81))) {
                                String strSubstring = str2.substring(5, str2.length());
                                if (!TextUtils.isEmpty(strSubstring)) {
                                    qggq9gqq9q99g99q.q999ggg99999qqggqqg9qg().q999ggg99999qqggqqg9qg(strSubstring);
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
