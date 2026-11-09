package cn.tongdun.android.qgq9qg99;

import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
final class q99q99qq99q9g implements Runnable {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ byte[] f19095q999ggg99999qqggqqg9qg;
    private /* synthetic */ q999ggg99999qqggqqg9qg qgq9qg99;

    public q99q99qq99q9g(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, byte[] bArr) {
        this.qgq9qg99 = q999ggg99999qqggqqg9qgVar;
        this.f19095q999ggg99999qqggqqg9qg = bArr;
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
            byte b7 = (byte) (bArr[0] ^ 93);
            bArr[0] = b7;
            for (int i12 = 1; i12 < length; i12++) {
                b7 = (byte) ((b7 ^ bArr[i12]) ^ 117);
                bArr[i12] = b7;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.qgq9qg99.q999ggg99999qqggqqg9qg(this.f19095q999ggg99999qqggqqg9qg);
        } catch (Exception e10) {
            this.qgq9qg99.qgq9qg99 = q999ggg99999qqggqqg9qg("3b727d707c74", 124);
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qgq9qg99, e10.toString());
        }
    }
}
