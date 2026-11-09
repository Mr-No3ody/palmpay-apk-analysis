package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.common.primitives.UnsignedBytes;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class gq9gggq9gq9gg9q99g9q extends cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99 {
    private static String gqgg9q99qg9 = "";
    private static String qgqq999g;
    private static gqg99q9q9q qqggggg9g9q99q9gq;

    public gq9gggq9gq9gg9q99g9q(Context context, cn.tongdun.android.qqggggg9g9q99q9gq.qgq9qg99 qgq9qg99Var) {
        super(context, qgq9qg99Var);
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private static String q999ggg99999qqggqqg9qg(Context context, String str) {
        Signature[] signatureArr;
        try {
            if (TextUtils.isEmpty(gqgg9q99qg9)) {
                gqgg9q99qg9 = context.getPackageName();
            }
            if (TextUtils.isEmpty(qgqq999g) && (signatureArr = ((PackageInfo) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qgq9qg99(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.gqgg9q99qg9[1], new qq9gg9q(context))).signatures) != null && signatureArr.length > 0) {
                byte[] bArrDigest = MessageDigest.getInstance(q999ggg99999qqggqqg9qg("1854463f", 126)).digest(signatureArr[0].toByteArray());
                StringBuilder sb2 = new StringBuilder();
                for (byte b7 : bArrDigest) {
                    sb2.append(Integer.toHexString((b7 & UnsignedBytes.MAX_VALUE) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER).substring(1, 3));
                }
                qgqq999g = sb2.toString();
            }
            String strQ999ggg99999qqggqqg9qg = ((gqg99q9q9q.q999ggg99999qqggqqg9qg.C0012q999ggg99999qqggqqg9qg) qqggggg9g9q99q9gq).q999ggg99999qqggqqg9qg(gqgg9q99qg9, qgqq999g, str);
            if (TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg)) {
                return null;
            }
            return strQ999ggg99999qqggqqg9qg;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String qgq9qg99(Context context, String str) {
        if (qqggggg9g9q99q9gq == null) {
            return null;
        }
        return q999ggg99999qqggqqg9qg(context, str);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String gqg99q9q9q() {
        return q999ggg99999qqggqqg9qg("04786778051960776a6a", 86);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String gqgg9q99qg9() {
        return qgq9qg99(this.f19241q999ggg99999qqggqqg9qg, q999ggg99999qqggqqg9qg("04111706", 58));
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final boolean q9q999qgg99gq9qq9qqq9g() {
        return !TextUtils.isEmpty(gqgg9q99qg9());
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String qg9gqgqqggg9q9qg() {
        return qgq9qg99(this.f19241q999ggg99999qqggqqg9qg, q999ggg99999qqggqqg9qg("0f0a0716", 42));
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String qgqq999g() {
        return qgq9qg99(this.f19241q999ggg99999qqggqqg9qg, q999ggg99999qqggqqg9qg("0a1a1203", 63));
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final Intent qqggggg9g9q99q9gq() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(q999ggg99999qqggqqg9qg("28555b1a14555a5a444445041a5749", 104), q999ggg99999qqggqqg9qg("28111f5e5c0201041b40401a0d1010577a301c1607001202372b0a1902171b", 44)));
        intent.setAction(q999ggg99999qqggqqg9qg("2a1b0e041f185954151b5a580605001f44441e091414537e1402150f0e1d06131f", 40));
        return intent;
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
            byte b7 = (byte) (i7 ^ 49);
            byte b10 = (byte) (bArr[0] ^ 75);
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

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg, cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String qgq9qg99() {
        return cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqg99q9q9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("394519144f445d5012004b4f59425e59181947584745455a", 105));
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final void q999ggg99999qqggqqg9qg(IBinder iBinder) {
        qqggggg9g9q99q9gq = gqg99q9q9q.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(iBinder);
        this.qgq9qg99.q999ggg99999qqggqqg9qg(this);
    }
}
