package cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg {
    public static boolean ggq9qqq;
    public static String q999qqg;
    public static String q9q9gqgqg9qgqg9qggq9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    public static String f19076q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("13786a78", 78);
    public static String qgq9qg99 = qgq9qg99.qgqq999g;
    public static int qqggggg9g9q99q9gq = 1000;
    public static String gqgg9q99qg9 = qgq9qg99.qgq9qg99;
    public static String qgqq999g = qgq9qg99.f19077q999ggg99999qqggqqg9qg;
    public static boolean qg9gqgqqggg9q9qg = true;
    public static boolean gqg99q9q9q = true;
    public static boolean q9q999qgg99gq9qq9qqq9g = false;
    public static int qggqgq99q999g = Integer.MAX_VALUE;
    public static String q99q99qq99q9g = qgq9qg99.gqgg9q99qg9;
    public static String qqg999qq = qgq9qg99.qg9gqgqqggg9q9qg;
    public static boolean qq9gg99gqqqgqgq999gqg = true;
    public static boolean gqgqgq9qqqg999qggqqqg = true;
    public static boolean gq9gggq9gq9gg9q99g9q = true;
    public static boolean qq9gg9q = false;
    public static boolean ggq999qqgqgq9g9qqq = true;
    public static boolean g99q9ggqg9gqgq9 = true;
    public static boolean q99g9q99 = false;
    public static int gq9qqgq9q9 = 15000;
    public static String g9qqg99qqg = "";
    public static String g99gq9qg9gggq9qgg = "";
    public static boolean g9g9ggqqggqq99gqq9q99 = false;
    public static int qg9qqq999gq = 0;
    public static String g9g9q9qq9 = qgq9qg99.gqg99q9q9q;
    public static String ggg9gqqgq99q9g9gq9g9 = "";
    public static String gq9g999g999 = "";
    public static String gqq9gqqqq9qgqg9 = "";
    public static boolean qqqqgqg9qgqg9q99qq9qq = false;
    public static boolean gqqgggqgg99qg9 = true;
    public static boolean qgq9q9999qg = true;
    public static boolean qgqgq9qq9ggggg9g = false;

    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (bArr[0] ^ 96);
            bArr[0] = b7;
            for (int i12 = 1; i12 < length; i12++) {
                b7 = (byte) ((b7 ^ bArr[i12]) ^ 106);
                bArr[i12] = b7;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }
}
