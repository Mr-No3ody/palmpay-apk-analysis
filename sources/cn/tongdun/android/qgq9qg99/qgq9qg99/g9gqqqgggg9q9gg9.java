package cn.tongdun.android.qgq9qg99.qgq9qg99;

import cn.tongdun.android.shell.inter.InvokeHandler;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
final class g9gqqqgggg9q9gg9 implements InvokeHandler {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ String[] f19130q999ggg99999qqggqqg9qg;

    public g9gqqqgggg9q9gg9(String[] strArr) {
        this.f19130q999ggg99999qqggqqg9qg = strArr;
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
            byte b7 = (byte) (i7 ^ 58);
            byte b10 = (byte) (bArr[0] ^ 94);
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

    @Override // cn.tongdun.android.shell.inter.InvokeHandler
    public final /* synthetic */ Object invoke() {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, this.f19130q999ggg99999qqggqqg9qg);
        return cn.tongdun.android.qgq9qg99.qggqgq99q999g.qq9gg99gqqqgqgq999gqg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("71356877662626796f766d6263", 80), arrayList, q999ggg99999qqggqqg9qg("64", 46));
    }
}
