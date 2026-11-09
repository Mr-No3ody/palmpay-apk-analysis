package cn.tongdun.android.qgq9qg99.qgqq999g;

import com.adjust.sdk.Constants;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class q999ggg99999qqggqqg9qg implements qg9gqgqqggg9q9qg {
    private Method[] gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    protected String f19227q999ggg99999qqggqqg9qg;
    protected String qgq9qg99;
    private Class qqggggg9g9q99q9gq;

    public q999ggg99999qqggqqg9qg(Class cls) {
        if (cls == null) {
            throw new NullPointerException(q999ggg99999qqggqqg9qg("1045541c0a4e56121f5e5b5b5c587f76544b590a1a5b565958420d1b5e1c17424059", 85));
        }
        this.qqggggg9g9q99q9gq = cls;
        this.gqgg9q99qg9 = cls.getDeclaredMethods();
    }

    public final Object q999ggg99999qqggqqg9qg(String str, Class[] clsArr, Object... objArr) {
        try {
            Method declaredMethod = this.qqggggg9g9q99q9gq.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(this.qqggggg9g9q99q9gq, objArr);
        } catch (Throwable unused) {
            return null;
        }
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
            byte b7 = (byte) (i7 ^ 12);
            byte b10 = (byte) (bArr[0] ^ 100);
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

    @Override // cn.tongdun.android.qgq9qg99.qgqq999g.qg9gqgqqggg9q9qg
    public final void q999ggg99999qqggqqg9qg() {
        q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("0a481617", 27), new Object[0]);
    }

    public final Object q999ggg99999qqggqqg9qg(String str, Object... objArr) {
        try {
            if (this.gqgg9q99qg9 == null) {
                this.gqgg9q99qg9 = this.qqggggg9g9q99q9gq.getDeclaredMethods();
            }
            for (Method method : this.gqgg9q99qg9) {
                if (method.getName().equals(str)) {
                    method.setAccessible(true);
                    return method.invoke(this.qqggggg9g9q99q9gq, objArr);
                }
            }
            method = null;
            method.setAccessible(true);
            return method.invoke(this.qqggggg9g9q99q9gq, objArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
