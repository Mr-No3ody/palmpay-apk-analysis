package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import kh.a;
import kh.b;

/* JADX INFO: loaded from: classes.dex */
public final class ggq999qqgqgq9g9qqq extends cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99 {
    private q999ggg99999qqggqqg9qg.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq;

    public ggq999qqgqgq9g9qqq(Context context, cn.tongdun.android.qqggggg9g9q99q9gq.qgq9qg99 qgq9qg99Var) {
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
            byte b7 = (byte) (i7 ^ 24);
            byte b10 = (byte) (bArr[0] ^ 8);
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
        return q999ggg99999qqggqqg9qg("5b36283a223f2d", 60);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String gqgg9q99qg9() {
        q999ggg99999qqggqqg9qg.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
        if (q999ggg99999qqggqqg9qgVar == null) {
            return null;
        }
        try {
            return q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg();
        } catch (Throwable unused) {
            q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("4e260904080045551a4e460310554e0f090c4547151c034c521716051e0b07", 25));
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final boolean q9q999qgg99gq9qq9qqq9g() {
        return this.qqggggg9g9q99q9gq != null;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String qg9gqgqqggg9q9qg() {
        if (this.qqggggg9g9q99q9gq == null) {
            return null;
        }
        try {
            return this.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(this.f19241q999ggg99999qqggqqg9qg.getPackageName());
        } catch (Throwable unused) {
            q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("4e301f121e1653430c585015064341001f1a5351030a155a44010013081d11", 15));
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String qgqq999g() {
        if (this.qqggggg9g9q99q9gq == null) {
            return null;
        }
        try {
            return this.qqggggg9g9q99q9gq.qgq9qg99(this.f19241q999ggg99999qqggqqg9qg.getPackageName());
        } catch (Throwable unused) {
            q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("4e0e212c20286d7d32666e2b387d682921246d6f3d342b647a3f3e2d36232f", 49));
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final Intent qqggggg9g9q99q9gq() {
        Intent intent = new Intent();
        intent.setClassName(q999ggg99999qqggqqg9qg("6b010f4e501f01130b1604444202071b100b0047470c1e12070b01001a1b1a0912070b", 21), q999ggg99999qqggqqg9qg("6b1e10514f001e0c14091b5b5d1d18040f141f585813010d18141e1f050405160d1814597833010d18143e3f252405160d1814", 10));
        return intent;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final void q999ggg99999qqggqqg9qg(IBinder iBinder) {
        q999ggg99999qqggqqg9qg.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar;
        if (iBinder == null) {
            int i7 = b.f38890a;
            q999ggg99999qqggqqg9qgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.a("7c2826677936283a223f2d6d6b2b2e323922296e6e25373b2e222829333233203b2e226f432905373b2e220809131233203b2e22", HomeDialogState.PRIORITY_HIGHEST_111));
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof q999ggg99999qqggqqg9qg.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg)) {
                a aVar = new a();
                aVar.f38889a = iBinder;
                q999ggg99999qqggqqg9qgVar = aVar;
            } else {
                q999ggg99999qqggqqg9qgVar = (q999ggg99999qqggqqg9qg.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg) iInterfaceQueryLocalInterface;
            }
        }
        this.qqggggg9g9q99q9gq = q999ggg99999qqggqqg9qgVar;
        this.qgq9qg99.q999ggg99999qqggqqg9qg(this);
    }
}
