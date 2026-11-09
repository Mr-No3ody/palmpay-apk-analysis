package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import lh.a;
import lh.b;

/* JADX INFO: loaded from: classes.dex */
public final class q99q99qq99q9g extends cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99 {
    private q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq;

    public q99q99qq99q9g(Context context, cn.tongdun.android.qqggggg9g9q99q9gq.qgq9qg99 qgq9qg99Var) {
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
            byte b7 = (byte) (i7 ^ 42);
            byte b10 = (byte) (bArr[0] ^ 60);
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
        return q999ggg99999qqggqqg9qg("71636f", 87);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String gqgg9q99qg9() {
        q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
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
        q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
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
        q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
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
        q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
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
        Intent intent = new Intent(q999ggg99999qqggqqg9qg("5f18165758030f54570a065b5b160309121554581f131e040f55490203100b1e12", 62));
        intent.setClassName(q999ggg99999qqggqqg9qg("5f2729686822262661683539", 1), q999ggg99999qqggqqg9qg("5f1f1150501a1e1e59500d015c4e0504170c191558702d013b3e242504170c1915", 57));
        intent.putExtra(q999ggg99999qqggqqg9qg("5f3b35747b202c7774292578692624243b74692c3b3e383b3f", 29), this.f19241q999ggg99999qqggqqg9qg.getPackageName());
        return intent;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final void q999ggg99999qqggqqg9qg(IBinder iBinder) {
        q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar;
        if (iBinder == null) {
            int i7 = b.f39403a;
            q999ggg99999qqggqqg9qgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.a("59666829267d712a286f61260954784247474d707b7d7e6d686c", 46));
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg)) {
                a aVar = new a();
                aVar.f39402a = iBinder;
                q999ggg99999qqggqqg9qgVar = aVar;
            } else {
                q999ggg99999qqggqqg9qgVar = (q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg) iInterfaceQueryLocalInterface;
            }
        }
        this.qqggggg9g9q99q9gq = q999ggg99999qqggqqg9qgVar;
        this.qgq9qg99.q999ggg99999qqggqqg9qg(this);
        try {
            Intent intent = new Intent(q999ggg99999qqggqqg9qg("5f777938376c603b3865693434796c667d7a3b267c6e687d21266d6c7f64717d", 81));
            intent.setClassName(q999ggg99999qqggqqg9qg("5f2a2465652f2b2b6c653834", 12), q999ggg99999qqggqqg9qg("5f707e3f3f757171363f626e33216a6b7863767a371f426e565b434a6b7863767a", 86));
            intent.putExtra(q999ggg99999qqggqqg9qg("5f19175659020e55560b075a4b04060619564b0e191c1a191d", 63), this.f19241q999ggg99999qqggqqg9qg.getPackageName());
            if (Build.VERSION.SDK_INT < 26) {
                this.f19241q999ggg99999qqggqqg9qg.startService(intent);
            } else {
                this.f19241q999ggg99999qqggqqg9qg.startForegroundService(intent);
            }
        } catch (Throwable unused) {
        }
    }
}
