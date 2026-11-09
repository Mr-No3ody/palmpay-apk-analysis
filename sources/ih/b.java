package ih;

import android.os.Binder;
import com.adjust.sdk.Constants;
import q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends Binder implements q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f37627a = 0;

    static {
        a("4a252b6a72332224337468363c2223283a36232f62662124216b48163c2203083a36232f0504282233342626253e081f3e2d36232f", 36);
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
            byte b7 = (byte) (i7 ^ 13);
            byte b10 = (byte) (bArr[0] ^ 41);
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
