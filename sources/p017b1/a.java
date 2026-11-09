package p017b1;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.facebook.imagepipeline.nativecode.b;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18750a = 0;

    static {
        b(TransType.TRANS_TYPE_P2P_CASH_IN, 68);
        b(TransType.TRANS_TYPE_P2P_CASH_OUT, 16);
        b(TransType.TRANS_TYPE_COMMISSION, 116);
    }

    public static String a() {
        Context context;
        try {
            String strI = b.I("5759140e4f555d57454f141b5b5e424952591e094f595d54163c5f5872565f4e", 63);
            String strI2 = b.I("5b331901213928", 89);
            synchronized (p059e1.a.class) {
                context = p059e1.a.f35989b;
            }
            Object[] objArr = {context};
            Object objInvoke = null;
            try {
                for (Method method : Class.forName(strI).getDeclaredMethods()) {
                    if (method.getName().equals(strI2)) {
                        method.setAccessible(true);
                        objInvoke = method.invoke(null, objArr);
                        break;
                    }
                }
            } catch (Throwable unused) {
            }
            return (String) objInvoke;
        } catch (Throwable th) {
            String strValueOf = String.valueOf(b.J(th));
            b.I("53180b2c3417181233370d5800", 113);
            int i7 = p059e1.b.f35993a;
            return strValueOf;
        }
    }

    public static String b(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 3);
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
