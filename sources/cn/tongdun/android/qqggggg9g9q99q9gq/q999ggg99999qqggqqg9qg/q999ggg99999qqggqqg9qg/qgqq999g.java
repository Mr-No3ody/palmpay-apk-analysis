package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import ih.a;
import ih.b;

/* JADX INFO: loaded from: classes.dex */
public final class qgqq999g extends cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99 {
    private q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq;

    static {
        q999ggg99999qqggqqg9qg("69746d6f6079", 1);
    }

    public qgqq999g(Context context, cn.tongdun.android.qqggggg9g9q99q9gq.qgq9qg99 qgq9qg99Var) {
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
            byte b7 = (byte) (i7 ^ 107);
            byte b10 = (byte) (bArr[0] ^ 62);
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
        return q999ggg99999qqggqqg9qg("767970727668", 15);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String gqgg9q99qg9() {
        try {
            q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
            if (q999ggg99999qqggqqg9qgVar != null) {
                return q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final boolean q9q999qgg99gq9qq9qqq9g() {
        return !TextUtils.isEmpty(gqgg9q99qg9());
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String qg9gqgqqggg9q9qg() {
        return null;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg, cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String qgq9qg99() {
        return cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqg99q9q9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("4c4915184348515c1e0c4743554e5255141f5c4c48", 63));
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String qgqq999g() {
        return null;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final Intent qqggggg9g9q99q9gq() {
        Intent intent = new Intent(q999ggg99999qqggqqg9qg("5d2d23627a3b2a2c3b7c603e342a2b20323e2b276a403e342a262c362d2d3736253e2b27", 74));
        intent.setPackage(q999ggg99999qqggqqg9qg("5d323c7d78232a282c327978212033", 85));
        return intent;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final void q999ggg99999qqggqqg9qg(IBinder iBinder) {
        q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar;
        if (iBinder == null) {
            int i7 = b.f37627a;
            q999ggg99999qqggqqg9qgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.a("4a4d43021a5b4a4c5b1c005e544a4b40525e4b470a0e494c4903207e544a6b60525e4b476d6c404a5b5c4e4e4d56607756455e4b47", 76));
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg)) {
                a aVar = new a();
                aVar.f37626a = iBinder;
                q999ggg99999qqggqqg9qgVar = aVar;
            } else {
                q999ggg99999qqggqqg9qgVar = (q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg) iInterfaceQueryLocalInterface;
            }
        }
        this.qqggggg9g9q99q9gq = q999ggg99999qqggqqg9qgVar;
        this.qgq9qg99.q999ggg99999qqggqqg9qg(this);
    }
}
