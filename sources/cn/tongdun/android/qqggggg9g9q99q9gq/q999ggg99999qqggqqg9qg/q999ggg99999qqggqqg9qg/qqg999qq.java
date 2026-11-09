package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class qqg999qq extends cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg {
    private static final Uri qqggggg9g9q99q9gq = Uri.parse(q999ggg99999qqggqqg9qg("14262b303b2130643f2a66276a6a313d2122656d272b21303737277c6c272b2130373727", 24));
    private boolean gqgg9q99qg9;

    public qqg999qq(Context context, cn.tongdun.android.qqggggg9g9q99q9gq.qgq9qg99 qgq9qg99Var) {
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
            byte b7 = (byte) (i7 ^ 50);
            byte b10 = (byte) (bArr[0] ^ 119);
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

    private boolean qqggggg9g9q99q9gq() {
        String strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("1e655f597a7f606279", 77);
        String strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg("1e756f696a6f707269", 93);
        try {
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.f19241q999ggg99999qqggqqg9qg.getContentResolver().acquireUnstableContentProviderClient(qqggggg9g9q99q9gq);
            Bundle bundleCall = null;
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call(strQ999ggg99999qqggqqg9qg, null, null);
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            if (bundleCall == null || bundleCall.getInt(q999ggg99999qqggqqg9qg("14444349", 122), -1) != 0) {
                return false;
            }
            return bundleCall.getBoolean(strQ999ggg99999qqggqqg9qg2, true);
        } catch (Exception e10) {
            q999ggg99999qqggqqg9qg(e10);
            return false;
        }
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final String gqg99q9q9q() {
        return q999ggg99999qqggqqg9qg("39161a0605", 63);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String gqgg9q99qg9() {
        return null;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final boolean q9q999qgg99gq9qq9qqq9g() {
        return qqggggg9g9q99q9gq();
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String qg9gqgqqggg9q9qg() {
        return null;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String qgqq999g() {
        return null;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final void q999ggg99999qqggqqg9qg(ThreadPoolExecutor threadPoolExecutor) {
        this.qgq9qg99.q999ggg99999qqggqqg9qg(this);
    }
}
