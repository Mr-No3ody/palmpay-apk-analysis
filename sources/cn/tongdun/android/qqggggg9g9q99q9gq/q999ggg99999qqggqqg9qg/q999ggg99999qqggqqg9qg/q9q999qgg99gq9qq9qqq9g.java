package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import fh.a;
import fh.b;

/* JADX INFO: loaded from: classes.dex */
public final class q9q999qgg99gq9qq9qqq9g extends cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99 {
    private static q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq;

    public q9q999qgg99gq9qq9qqq9g(Context context, cn.tongdun.android.qqggggg9g9q99q9gq.qgq9qg99 qgq9qg99Var) {
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
            byte b7 = (byte) i7;
            byte b10 = (byte) (bArr[0] ^ 96);
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
        return q999ggg99999qqggqqg9qg("2c67656f7777", HomeDialogState.PRIORITY_HIGHEST);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String gqgg9q99qg9() {
        q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = qqggggg9g9q99q9gq;
        if (q999ggg99999qqggqqg9qgVar == null) {
            return null;
        }
        try {
            return q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final boolean q9q999qgg99gq9qq9qqq9g() {
        q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = qqggggg9g9q99q9gq;
        if (q999ggg99999qqggqqg9qgVar == null) {
            return false;
        }
        try {
            return q999ggg99999qqggqqg9qgVar.qqggggg9g9q99q9gq();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String qg9gqgqqggg9q9qg() {
        q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = qqggggg9g9q99q9gq;
        if (q999ggg99999qqggqqg9qgVar == null) {
            return null;
        }
        try {
            return q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(this.f19241q999ggg99999qqggqqg9qg.getPackageName());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg, cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String qgq9qg99() {
        return cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqg99q9q9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("12702c2f64666c74742c2f776b33357e7a6c776b6c", 109));
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String qgqq999g() {
        q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = qqggggg9g9q99q9gq;
        if (q999ggg99999qqggqqg9qgVar == null) {
            return null;
        }
        try {
            return q999ggg99999qqggqqg9qgVar.qgq9qg99(this.f19241q999ggg99999qqggqqg9qg.getPackageName());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final Intent qqggggg9g9q99q9gq() {
        try {
            Intent intent = new Intent();
            intent.setClassName(q999ggg99999qqggqqg9qg("034e4001164d5e050843515d48444e4f555455465d4844", 66), q999ggg99999qqggqqg9qg("036c6223346f7c272a61737f6a666c6d777677647f6a662b0a41737f6a666c6d575677647f6a66", 96));
            return intent;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final void q999ggg99999qqggqqg9qg(IBinder iBinder) {
        q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar;
        if (iBinder == null) {
            int i7 = b.f36801a;
            q999ggg99999qqggqqg9qgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.a("594b450413485b000d4654584d414b4a50515043584d410c204a6654584d414b4a6a605d565053404541", 28));
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg)) {
                a aVar = new a();
                aVar.f36800a = iBinder;
                q999ggg99999qqggqqg9qgVar = aVar;
            } else {
                q999ggg99999qqggqqg9qgVar = (q999ggg99999qqggqqg9qg.gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg) iInterfaceQueryLocalInterface;
            }
        }
        qqggggg9g9q99q9gq = q999ggg99999qqggqqg9qgVar;
        this.qgq9qg99.q999ggg99999qqggqqg9qg(this);
    }
}
