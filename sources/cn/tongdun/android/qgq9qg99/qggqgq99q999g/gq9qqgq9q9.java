package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import com.adjust.sdk.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class gq9qqgq9q9 {
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
            byte b10 = (byte) (bArr[0] ^ 82);
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

    public static String q999ggg99999qqggqqg9qg(Method method) {
        StringBuilder sb2 = new StringBuilder();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        sb2.append(method.getDeclaringClass().getName());
        sb2.append(q999ggg99999qqggqqg9qg("7c", 102));
        sb2.append(method.getName());
        sb2.append(q999ggg99999qqggqqg9qg("7a", 60));
        for (Type type : genericParameterTypes) {
            sb2.append(type.toString());
            sb2.append(q999ggg99999qqggqqg9qg("7e", 113));
        }
        if (genericParameterTypes.length > 0 && sb2.toString().length() > 0) {
            sb2.delete(sb2.length() - 1, sb2.length());
        }
        sb2.append(q999ggg99999qqggqqg9qg("7b", 0));
        return sb2.toString();
    }
}
