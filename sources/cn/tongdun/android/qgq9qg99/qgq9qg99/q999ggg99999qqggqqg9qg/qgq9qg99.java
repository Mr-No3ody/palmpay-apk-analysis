package cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg;

import com.adjust.sdk.Constants;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
final class qgq9qg99 implements ThreadFactory {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ q999ggg99999qqggqqg9qg f19166q999ggg99999qqggqqg9qg;

    public qgq9qg99(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar) {
        this.f19166q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qgVar;
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
            byte b7 = (byte) (bArr[0] ^ 88);
            bArr[0] = b7;
            for (int i12 = 1; i12 < length; i12++) {
                b7 = (byte) ((b7 ^ bArr[i12]) ^ 70);
                bArr[i12] = b7;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(this.f19166q999ggg99999qqggqqg9qg.qgqq999g + q999ggg99999qqggqqg9qg("07", 8) + thread.getName());
        return thread;
    }
}
