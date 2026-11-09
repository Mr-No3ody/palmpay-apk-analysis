package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class g99gq9qg9gggq9qgg {
    static {
        Pattern.compile(q999ggg99999qqggqqg9qg("19563a274e4b3d3848016e494b3d3949211838074b3d3c4c4243187b43186d215452263a274e4b3d3848016e494b3d3949211838074b3d3c4c4243187b43186d2072686e79", 1));
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
            byte b7 = (byte) (bArr[0] ^ 71);
            bArr[0] = b7;
            for (int i12 = 1; i12 < length; i12++) {
                b7 = (byte) ((b7 ^ bArr[i12]) ^ 32);
                bArr[i12] = b7;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String qgq9qg99(String str) {
        return TextUtils.isEmpty(str) ? str : new StringBuilder(str).reverse().toString();
    }

    public static List q999ggg99999qqggqqg9qg(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (str != null && str.length() != 0) {
            if (str2 == null || str2.length() == 0) {
                arrayList.add(str);
            } else if (!str.equals(str2)) {
                while (true) {
                    int iIndexOf = str.indexOf(str2);
                    if (iIndexOf == -1) {
                        break;
                    }
                    if (iIndexOf != 0) {
                        if (iIndexOf > 0) {
                            arrayList.add(str.substring(0, iIndexOf));
                        }
                    }
                    str = str.substring(str2.length() + iIndexOf);
                }
                if (!q999ggg99999qqggqqg9qg(str)) {
                    arrayList.add(str);
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public static boolean q999ggg99999qqggqqg9qg(String str) {
        return str == null || "".equals(str.trim()) || str.length() == 0;
    }

    public static boolean q999ggg99999qqggqqg9qg(String... strArr) {
        int length = strArr.length;
        for (int i7 = 0; i7 < 4; i7++) {
            String str = strArr[i7];
            if (str != null && !"".equals(str) && str.length() > 0) {
                return false;
            }
        }
        return true;
    }
}
