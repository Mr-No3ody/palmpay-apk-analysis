package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class q999qqg extends cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg {
    static {
        q999ggg99999qqggqqg9qg("5269647f746e7f2b7065296967263d7a7a7c243d7e7b3802485147787c7a686472380348646e7f786a6a69725e482e056b6d68", 86);
        q999ggg99999qqggqqg9qg("50030b0e", 48);
        q999ggg99999qqggqqg9qg("52313c272c362773283d71313f7e652222247c652623605a10091f202422303c2a605b103c3627203232312a061076442a353026", 14);
        q999ggg99999qqggqqg9qg("525f52494258491d46531f5f51100b4c4c4a120b484d0e347e67714e4a4c5e52440e357e5258494e5c5c5f44687e183d535b5e48", 96);
        q999ggg99999qqggqqg9qg("472d37232a", 9);
        q999ggg99999qqggqqg9qg("5e080e0b", 53);
        q999ggg99999qqggqqg9qg("663d24262930", 16);
        q999ggg99999qqggqqg9qg("47223d38", 6);
    }

    public q999qqg(Context context, cn.tongdun.android.qqggggg9g9q99q9gq.qgq9qg99 qgq9qg99Var) {
        super(context, qgq9qg99Var);
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
            byte b7 = (byte) (i7 ^ 51);
            byte b10 = (byte) (bArr[0] ^ 49);
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
        return q999ggg99999qqggqqg9qg("671a1a1c", 54);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String gqgg9q99qg9() {
        return q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("5e4d4b4e", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR), "");
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final boolean q9q999qgg99gq9qq9qqq9g() {
        try {
            return q999ggg99999qqggqqg9qg(TransType.TRANS_SCENE_REFUND, 25).equals(cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqg99q9q9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("41060412090914494e19194e541e1218090e1c1c1f04081e594e1516130c0e150212", 32)));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String qg9gqgqqggg9q9qg() {
        return q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("47405f5a", 100), q999ggg99999qqggqqg9qg("00404143424544464f", 114));
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg, cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String qgq9qg99() {
        return cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqg99q9q9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("434d11084f4f4911114c0d084347514a5651", 99));
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String qgqq999g() {
        return q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("5040484d", 115), q999ggg99999qqggqqg9qg("00404143424544464f", 114));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    private String q999ggg99999qqggqqg9qg(String str, String str2) {
        byte b7;
        String strQ999ggg99999qqggqqg9qg;
        Cursor cursorQuery;
        StringBuilder sb2;
        String str3;
        int i7;
        int iHashCode = str.hashCode();
        if (iHashCode != 2986299) {
            if (iHashCode != 3403373) {
                if (iHashCode == 3611910 && str.equals(q999ggg99999qqggqqg9qg("474b5451", HomeDialogState.PRIORITY_HIGHEST_111))) {
                    b7 = 2;
                } else {
                    b7 = -1;
                }
            } else if (str.equals(q999ggg99999qqggqqg9qg("5e7b7d78", 70))) {
                b7 = 0;
            } else {
                b7 = -1;
            }
        } else if (str.equals(q999ggg99999qqggqqg9qg("501e1613", 45))) {
            b7 = 1;
        } else {
            b7 = -1;
        }
        if (b7 != 0) {
            if (b7 == 1) {
                sb2 = new StringBuilder();
                str3 = "52363b202b3120742f3a76363879622525237b622124675d170e18272325373b2d675c173b3120273535362d011771543a323721";
                i7 = 9;
            } else {
                if (b7 != 2) {
                    q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("722c010e0f155a48071415044a47034a5a03071b", 61));
                    return null;
                }
                sb2 = new StringBuilder();
                str3 = "52656873786273277c6925656b2a3176767028317277340e445d4b74707664687e340f44686273746666657e524422107e616472";
                i7 = 90;
            }
            sb2.append(q999ggg99999qqggqqg9qg(str3, i7));
            sb2.append(str2);
            strQ999ggg99999qqggqqg9qg = sb2.toString();
        } else {
            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("5278756e657f6e3a6174387876372c6b6b6d352c6f6a2913594056696d6b797563291259757f6e697b7b78634f593f147a7c79", 71);
        }
        try {
            cursorQuery = this.f19241q999ggg99999qqggqqg9qg.getContentResolver().query(Uri.parse(strQ999ggg99999qqggqqg9qg), null, null, null, null);
        } catch (Throwable unused) {
            cursorQuery = null;
        }
        if (cursorQuery != null && cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex(q999ggg99999qqggqqg9qg("4733293d34", 23)));
                cursorQuery.close();
                return string;
            } catch (Throwable th) {
                try {
                    q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("7455627f7f30357d6f692c307566676f656b25216e63787369784455747e61787175302b652c", 81) + "q999qqg" + q999ggg99999qqggqqg9qg("3b4e3c1a0714051c0700551b", 50) + th);
                    Log.e(q999ggg99999qqggqqg9qg("66736a68677e", 94), q999ggg99999qqggqqg9qg("5445", 107), th);
                } finally {
                    cursorQuery.close();
                }
            }
        }
        return null;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final void q999ggg99999qqggqqg9qg(ThreadPoolExecutor threadPoolExecutor) {
        this.qgq9qg99.q999ggg99999qqggqqg9qg(this);
    }
}
