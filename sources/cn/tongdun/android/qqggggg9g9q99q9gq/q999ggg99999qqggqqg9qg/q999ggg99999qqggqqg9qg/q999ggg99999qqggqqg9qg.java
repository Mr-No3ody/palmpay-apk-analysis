package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import jh.a;
import jh.b;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg extends cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99 {
    private q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq;

    public q999ggg99999qqggqqg9qg(Context context, cn.tongdun.android.qqggggg9g9q99q9gq.qgq9qg99 qgq9qg99Var) {
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
            byte b7 = (byte) (i7 ^ 100);
            byte b10 = (byte) (bArr[0] ^ 103);
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
        return q999ggg99999qqggqqg9qg("266d7979", 27);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String gqgg9q99qg9() {
        q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
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
    public final boolean q9q999qgg99gq9qq9qqq9g() {
        q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
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
        q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
        if (q999ggg99999qqggqqg9qgVar == null) {
            return null;
        }
        try {
            return q999ggg99999qqggqqg9qgVar.gqgg9q99qg9();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String qgqq999g() {
        q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
        if (q999ggg99999qqggqqg9qgVar == null) {
            return null;
        }
        try {
            return q999ggg99999qqggqqg9qgVar.qgqq999g();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final Intent qqggggg9g9q99q9gq() {
        Intent intent = new Intent(q999ggg99999qqggqqg9qg("044b4504085541411a045955080845505a4146072845474151474b5c4a4a", 35));
        intent.setComponent(new ComponentName(q999ggg99999qqggqqg9qg("041816575b06121249570a065b69321114081d1c1c1f0e01071f291919", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR), q999ggg99999qqggqqg9qg("04050b4a461b0f0f544a171b46742f0c091500010102131c1a0234040463742f0c091500010102131c1a023404041e3f1e0d16030f", 109)));
        return intent;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final void q999ggg99999qqggqqg9qg(IBinder iBinder) {
        q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar;
        if (iBinder == null) {
            int i7 = b.f38603a;
            q999ggg99999qqggqqg9qgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.a("25636d2c207d6969322c717d2012496a6f7366676764757a7c6452626205086242624a4762674a48757e787b686d69", 48));
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg)) {
                a aVar = new a();
                aVar.f38602a = iBinder;
                q999ggg99999qqggqqg9qgVar = aVar;
            } else {
                q999ggg99999qqggqqg9qgVar = (q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg) iInterfaceQueryLocalInterface;
            }
        }
        this.qqggggg9g9q99q9gq = q999ggg99999qqggqqg9qgVar;
        this.qgq9qg99.q999ggg99999qqggqqg9qg(this);
    }
}
