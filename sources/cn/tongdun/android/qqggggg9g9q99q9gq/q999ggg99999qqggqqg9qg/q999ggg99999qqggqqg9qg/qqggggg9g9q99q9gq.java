package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class qqggggg9g9q99q9gq extends cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg {
    private final KeyguardManager qqggggg9g9q99q9gq;

    public qqggggg9g9q99q9gq(Context context, cn.tongdun.android.qqggggg9g9q99q9gq.qgq9qg99 qgq9qg99Var) {
        super(context, qgq9qg99Var);
        this.qqggggg9g9q99q9gq = (KeyguardManager) context.getSystemService(q999ggg99999qqggqqg9qg("3b4755575b5d5a5f", 86));
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
            byte b7 = (byte) (i7 ^ 31);
            byte b10 = (byte) (bArr[0] ^ 80);
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

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String gqg99q9q9q() {
        return q999ggg99999qqggqqg9qg("13406c707a68", 115);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String gqgg9q99qg9() {
        KeyguardManager keyguardManager = this.qqggggg9g9q99q9gq;
        if (keyguardManager != null) {
            try {
                Object objInvoke = keyguardManager.getClass().getDeclaredMethod(q999ggg99999qqggqqg9qg("3f3e25263b34121d3b3e", 44), new Class[0]).invoke(this.qqggggg9g9q99q9gq, new Object[0]);
                if (objInvoke == null) {
                    return null;
                }
                return objInvoke.toString();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final boolean q9q999qgg99gq9qq9qqq9g() {
        KeyguardManager keyguardManager = this.qqggggg9g9q99q9gq;
        if (keyguardManager == null) {
            return false;
        }
        try {
            Object objInvoke = keyguardManager.getClass().getDeclaredMethod(q999ggg99999qqggqqg9qg("39556f694a4f5052495e4e", 80), new Class[0]).invoke(this.qqggggg9g9q99q9gq, new Object[0]);
            if (objInvoke == null) {
                return false;
            }
            return ((Boolean) objInvoke).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String qg9gqgqqggg9q9qg() {
        return null;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String qgqq999g() {
        return null;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final void q999ggg99999qqggqqg9qg(ThreadPoolExecutor threadPoolExecutor) {
        this.qgq9qg99.q999ggg99999qqggqqg9qg(this);
    }
}
