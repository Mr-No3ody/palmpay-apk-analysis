package p030c1;

import com.adjust.sdk.Constants;
import com.transsnet.palmpay.core.init.late.LateInitTask2;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LateInitTask2 f18852a;

    public static String a(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 96);
            byte b10 = (byte) (bArr[0] ^ 76);
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

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        LateInitTask2 lateInitTask2;
        if (method.getName().equals(a("382f0813322f333d", 84))) {
            return obj.getClass().toString();
        }
        if (method.getName().equals(a("24253e370700272d", 76))) {
            return Integer.valueOf(obj.getClass().hashCode());
        }
        if (method.getName().equals(a("297969796072", 13))) {
            return Boolean.valueOf(objArr != null && obj == objArr[0]);
        }
        if (!method.getName().equals(a("234c667e5e4657", 45)) || objArr.length != 1 || (lateInitTask2 = this.f18852a) == null) {
            return null;
        }
        lateInitTask2.onEvent(String.valueOf(objArr[0]));
        return null;
    }
}
