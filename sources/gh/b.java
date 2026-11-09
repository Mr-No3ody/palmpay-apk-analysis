package gh;

import android.os.Binder;
import com.adjust.sdk.Constants;
import q999ggg99999qqggqqg9qg.gqgg9q99qg9.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends Binder implements q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f37249a = 0;

    static {
        a("0d303e7f71303c3f202d3976763d2f23363a30312b3a393c23213a665b311d2f23363a1011151033333a3e2b", 75);
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
            byte b7 = (byte) (i7 ^ 119);
            byte b10 = (byte) (bArr[0] ^ 110);
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
