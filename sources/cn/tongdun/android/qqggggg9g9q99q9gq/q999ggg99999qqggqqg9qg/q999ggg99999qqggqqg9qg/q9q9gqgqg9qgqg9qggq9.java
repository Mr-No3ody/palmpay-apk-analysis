package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import C0.G;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class q9q9gqgqg9qgqg9qggq9 extends cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg {
    private Object gqgg9q99qg9;
    private Class qqggggg9g9q99q9gq;

    public q9q9gqgqg9qgqg9qggq9(Context context, cn.tongdun.android.qqggggg9g9q99q9gq.qgq9qg99 qgq9qg99Var) {
        super(context, qgq9qg99Var);
        try {
            Class<?> cls = Class.forName(q999ggg99999qqggqqg9qg("27515f1e1252574b405b50171a50171a5940411f3a70697f404442505c4a66794041", 19));
            this.qqggggg9g9q99q9gq = cls;
            this.gqgg9q99qg9 = cls.newInstance();
        } catch (Throwable unused) {
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
            byte b7 = (byte) (i7 ^ 78);
            byte b10 = (byte) (bArr[0] ^ 68);
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
        return q999ggg99999qqggqqg9qg("1c6871777b7d", 55);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String gqgg9q99qg9() {
        if (this.gqgg9q99qg9 == null) {
            return null;
        }
        try {
            return (String) this.qqggggg9g9q99q9gq.getDeclaredMethod(q999ggg99999qqggqqg9qg("2357446e5b5d58", 27), Context.class).invoke(this.gqgg9q99qg9, this.f19241q999ggg99999qqggqqg9qg);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final boolean q9q999qgg99gq9qq9qqq9g() {
        return (this.qqggggg9g9q99q9gq == null && this.gqgg9q99qg9 == null) ? false : true;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String qg9gqgqqggg9q9qg() {
        if (this.gqgg9q99qg9 == null) {
            return null;
        }
        try {
            return (String) this.qqggggg9g9q99q9gq.getDeclaredMethod(q999ggg99999qqggqqg9qg("23372417223d38", 123), Context.class).invoke(this.gqgg9q99qg9, this.f19241q999ggg99999qqggqqg9qg);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg, cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String qgq9qg99() {
        String strQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqg99q9q9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("3604585a1d05055e42055e410a0e18031f185959161511", 87));
        String strQ999ggg99999qqggqqg9qg2 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqg99q9q9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("360e5250170f0f544b000412091512535e1f181229380e171b", 93));
        String strQ999ggg99999qqggqqg9qg3 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqg99q9q9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("360f5351160e0e55490e554a010513081413525f1e1913", 92));
        if (TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg3) && TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg2) && TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg)) {
            return null;
        }
        String strQ999ggg99999qqggqqg9qg4 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqg99q9q9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("367428257e756c6123317a7e68736f68292e6e64787e616162737c64", 39));
        StringBuilder sbS = u.s(strQ999ggg99999qqggqqg9qg3);
        sbS.append(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_EX_GRATIA_BONUS, 69));
        sbS.append(strQ999ggg99999qqggqqg9qg4);
        sbS.append(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_EX_GRATIA_BONUS, 79));
        sbS.append(strQ999ggg99999qqggqqg9qg);
        return G.r(sbS, q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_EX_GRATIA_BONUS, 16), strQ999ggg99999qqggqqg9qg2);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String qgqq999g() {
        if (this.gqgg9q99qg9 == null) {
            return null;
        }
        try {
            return (String) this.qqggggg9g9q99q9gq.getDeclaredMethod(q999ggg99999qqggqqg9qg("237c6f4b7e7673", 48), Context.class).invoke(this.gqgg9q99qg9, this.f19241q999ggg99999qqggqqg9qg);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final void q999ggg99999qqggqqg9qg(ThreadPoolExecutor threadPoolExecutor) {
        this.qgq9qg99.q999ggg99999qqggqqg9qg(this);
    }
}
