package lh;

import android.os.Binder;
import com.adjust.sdk.Constants;
import q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends Binder implements q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f39403a = 0;

    static {
        a("591f11505f0408535116185f702d013b3e3e3409020407141115", 87);
    }

    public static String a(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 68);
            byte b10 = (byte) (bArr[0] ^ 58);
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
}
