package cn.tongdun.android.qgq9qg99.gqgg9q99qg9;

import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes.dex */
public final class qgqq999g {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private String f19090q999ggg99999qqggqqg9qg;
    private long qgq9qg99;

    public qgqq999g(String str, long j6) {
        this.f19090q999ggg99999qqggqqg9qg = str;
        this.qgq9qg99 = j6;
    }

    public final String q999ggg99999qqggqqg9qg() {
        return this.f19090q999ggg99999qqggqqg9qg;
    }

    public final long qgq9qg99() {
        return this.qgq9qg99;
    }

    @NonNull
    public final String toString() {
        return this.qgq9qg99 + q999ggg99999qqggqqg9qg("3303", 83) + this.f19090q999ggg99999qqggqqg9qg;
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
            byte b7 = (byte) (bArr[0] ^ Ascii.ETB);
            bArr[0] = b7;
            for (int i12 = 1; i12 < length; i12++) {
                b7 = (byte) ((b7 ^ bArr[i12]) ^ 3);
                bArr[i12] = b7;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }
}
