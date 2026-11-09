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
public final class qq9gg99gqqqgqgq999gqg extends cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99 {
    private static String gqgg9q99qg9 = "";
    private static String qgqq999g;
    private static qg9gqgqqggg9q9qg qqggggg9g9q99q9gq;

    public qq9gg99gqqqgqgq999gqg(Context context, cn.tongdun.android.qqggggg9g9q99q9gq.qgq9qg99 qgq9qg99Var) {
        super(context, qgq9qg99Var);
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private static String q999ggg99999qqggqqg9qg(Context context, String str) {
        Signature[] signatureArr;
        try {
            if (TextUtils.isEmpty(gqgg9q99qg9)) {
                gqgg9q99qg9 = context.getPackageName();
            }
            if (TextUtils.isEmpty(qgqq999g) && (signatureArr = ((PackageInfo) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qgq9qg99(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.gqgg9q99qg9[1], new gqgqgq9qqqg999qggqqqg(context))).signatures) != null && signatureArr.length > 0) {
                byte[] bArrDigest = MessageDigest.getInstance(q999ggg99999qqggqqg9qg("0111037a", 124)).digest(signatureArr[0].toByteArray());
                StringBuilder sb2 = new StringBuilder();
                for (byte b7 : bArrDigest) {
                    sb2.append(Integer.toHexString((b7 & UnsignedBytes.MAX_VALUE) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER).substring(1, 3));
                }
                qgqq999g = sb2.toString();
            }
            String strQ999ggg99999qqggqqg9qg = ((qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg.C0013q999ggg99999qqggqqg9qg) qqggggg9g9q99q9gq).q999ggg99999qqggqqg9qg(gqgg9q99qg9, qgqq999g, str);
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
        return q999ggg99999qqggqqg9qg("1d273827", 78);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String gqgg9q99qg9() {
        return qgq9qg99(this.f19241q999ggg99999qqggqqg9qg, q999ggg99999qqggqqg9qg("1d656372", 9));
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final boolean q9q999qgg99gq9qq9qqq9g() {
        return !TextUtils.isEmpty(gqgg9q99qg9());
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String qg9gqgqqggg9q9qg() {
        return qgq9qg99(this.f19241q999ggg99999qqggqqg9qg, q999ggg99999qqggqqg9qg("166b6677", 12));
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String qgqq999g() {
        return qgq9qg99(this.f19241q999ggg99999qqggqqg9qg, q999ggg99999qqggqqg9qg("13333b2a", 81));
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final Intent qqggggg9g9q99q9gq() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(q999ggg99999qqggqqg9qg("312b2564612a3b2a3236796638322c202a", 81), q999ggg99999qqggqqg9qg("314c4203064d5c4d55511e015f554b474d0a276d414b5a5d4f5f6a7657445f4a46", 54)));
        intent.setAction(q999ggg99999qqggqqg9qg("337e6b617a7d3c31707e3f3a716071696d223d6369777b71361d6369776d6a7167706a6b7863767a", 10));
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
            byte b7 = (byte) (i7 ^ 118);
            byte b10 = (byte) (bArr[0] ^ 82);
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
        return cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqg99q9q9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("20471b164d465f521002494d5b405c5b1a1b455a45474758", 44));
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgq9qg99
    public final void q999ggg99999qqggqqg9qg(IBinder iBinder) {
        qqggggg9g9q99q9gq = qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(iBinder);
        this.qgq9qg99.q999ggg99999qqggqqg9qg(this);
    }
}
