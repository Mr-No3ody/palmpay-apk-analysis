package cn.tongdun.android.qgq9qg99.gqg99q9q9q;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cn.tongdun.android.qgq9qg99.qggqgq99q999g.q999qqg;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg extends BroadcastReceiver {
    private static boolean qqggggg9g9q99q9gq = false;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private List f19083q999ggg99999qqggqqg9qg = new ArrayList();
    private int qgq9qg99 = -1;

    /* JADX INFO: renamed from: cn.tongdun.android.qgq9qg99.gqg99q9q9q.q999ggg99999qqggqqg9qg$q999ggg99999qqggqqg9qg, reason: collision with other inner class name */
    public static class C0007q999ggg99999qqggqqg9qg {

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        private static final q999ggg99999qqggqqg9qg f19084q999ggg99999qqggqqg9qg = new q999ggg99999qqggqqg9qg();
    }

    public interface qgq9qg99 {
        void q999ggg99999qqggqqg9qg();
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
            byte b7 = (byte) (i7 ^ 125);
            byte b10 = (byte) (bArr[0] ^ 109);
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

    public static void qgq9qg99(Context context) {
        if (qqggggg9g9q99q9gq) {
            context.unregisterReceiver(C0007q999ggg99999qqggqqg9qg.f19084q999ggg99999qqggqqg9qg);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iQ999ggg99999qqggqqg9qg;
        if (intent != null) {
            try {
                if (!q999ggg99999qqggqqg9qg("0c000519120902454f041e5542030e0f4f62030e0f04091812101012020913040600060d", 114).equals(intent.getAction()) || this.qgq9qg99 == (iQ999ggg99999qqggqqg9qg = q999qqg.q999ggg99999qqggqqg9qg(context))) {
                    return;
                }
                if (q999qqg.qgq9qg99(context)) {
                    for (qgq9qg99 qgq9qg99Var : this.f19083q999ggg99999qqggqqg9qg) {
                    }
                    if (this.qgq9qg99 == 0) {
                        for (qgq9qg99 qgq9qg99Var2 : this.f19083q999ggg99999qqggqqg9qg) {
                            if (qgq9qg99Var2 != null) {
                                qgq9qg99Var2.q999ggg99999qqggqqg9qg();
                            }
                        }
                    }
                } else {
                    for (qgq9qg99 qgq9qg99Var3 : this.f19083q999ggg99999qqggqqg9qg) {
                    }
                }
                this.qgq9qg99 = iQ999ggg99999qqggqqg9qg;
            } catch (Throwable unused) {
            }
        }
    }

    public static void q999ggg99999qqggqqg9qg(Context context) {
        try {
            Intent intentRegisterReceiver = context.registerReceiver(C0007q999ggg99999qqggqqg9qg.f19084q999ggg99999qqggqqg9qg, new IntentFilter(q999ggg99999qqggqqg9qg("0c505549425952151f544e0512535e5f1f32535e5f54594842404042525943545650565d", 34)), q999ggg99999qqggqqg9qg("0e010f4e53181a1209170d170b0c4d411d1003080a0f1f0a57571d", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR), null);
            if (intentRegisterReceiver != null) {
                C0007q999ggg99999qqggqqg9qg.f19084q999ggg99999qqggqqg9qg.onReceive(context, intentRegisterReceiver);
            }
            qqggggg9g9q99q9gq = true;
        } catch (Throwable unused) {
        }
    }

    public static void q999ggg99999qqggqqg9qg(qgq9qg99 qgq9qg99Var) {
        if (qgq9qg99Var == null || C0007q999ggg99999qqggqqg9qg.f19084q999ggg99999qqggqqg9qg.f19083q999ggg99999qqggqqg9qg.contains(qgq9qg99Var)) {
            return;
        }
        C0007q999ggg99999qqggqqg9qg.f19084q999ggg99999qqggqqg9qg.f19083q999ggg99999qqggqqg9qg.add(qgq9qg99Var);
    }
}
