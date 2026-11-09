package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.aidl.MsgEvent;
import hh.a;
import hh.b;

/* JADX INFO: loaded from: classes.dex */
public final class gqgg9q99qg9 extends cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99 {
    private q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq;

    public gqgg9q99qg9(Context context, cn.tongdun.android.qqggggg9g9q99q9gq.qgq9qg99 qgq9qg99Var) {
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
            byte b7 = (byte) (i7 ^ 18);
            byte b10 = (byte) (bArr[0] ^ 125);
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
        return q999ggg99999qqggqqg9qg("3b4d6e797171", 107);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String gqgg9q99qg9() {
        q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
        if (q999ggg99999qqggqqg9qgVar == null) {
            return null;
        }
        try {
            return q999ggg99999qqggqqg9qgVar.qgq9qg99();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final boolean q9q999qgg99gq9qq9qqq9g() {
        q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
        if (q999ggg99999qqggqqg9qgVar == null) {
            return false;
        }
        try {
            return q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String qg9gqgqqggg9q9qg() {
        q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
        if (q999ggg99999qqggqqg9qgVar == null) {
            return null;
        }
        try {
            return q999ggg99999qqggqqg9qgVar.qqggggg9g9q99q9gq();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String qgqq999g() {
        return null;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final Intent qqggggg9g9q99q9gq() {
        Intent intent = new Intent(q999ggg99999qqggqqg9qg("1c707569627972352269687b60757934307d6862797e3f3c616d", 109));
        intent.setPackage(q999ggg99999qqggqqg9qg("1e7977363a7a7f636873783f38646271606e68", MsgEvent.MSG_EVENT_STOP_FOREGROUND));
        return intent;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final void q999ggg99999qqggqqg9qg(IBinder iBinder) {
        q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar;
        if (iBinder == null) {
            int i7 = b.f37390a;
            q999ggg99999qqggqqg9qgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.a("5b4c42030f4f4a565d464d0a0d515744555b5d1c276d57606645405c454c57", 56));
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg)) {
                a aVar = new a();
                aVar.f37389a = iBinder;
                q999ggg99999qqggqqg9qgVar = aVar;
            } else {
                q999ggg99999qqggqqg9qgVar = (q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg) iInterfaceQueryLocalInterface;
            }
        }
        this.qqggggg9g9q99q9gq = q999ggg99999qqggqqg9qgVar;
        this.qgq9qg99.q999ggg99999qqggqqg9qg(this);
    }
}
