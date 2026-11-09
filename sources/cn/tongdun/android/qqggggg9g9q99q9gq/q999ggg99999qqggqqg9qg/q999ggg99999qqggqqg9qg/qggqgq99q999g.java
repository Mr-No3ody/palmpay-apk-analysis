package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.lang.reflect.Method;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class qggqgq99q999g extends cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg {
    private boolean qqggggg9g9q99q9gq;

    static {
        q999ggg99999qqggqqg9qg("7c20282d", 119);
        q999ggg99999qqggqqg9qg("78253021232f39", HomeDialogState.PRIORITY_HIGHEST_111);
        q999ggg99999qqggqqg9qg("6b4953474e", 9);
        q999ggg99999qqggqqg9qg("72494f4a", 16);
        q999ggg99999qqggqqg9qg("7e01060c", 90);
        q999ggg99999qqggqqg9qg("6e4c4f4a55574c5b4b", 29);
        q999ggg99999qqggqqg9qg("7e535e454e5445114a5f13535d1c1c57534c500417554a4b57141e404a5458524848501b", 8);
        q999ggg99999qqggqqg9qg("6b5b4441", 27);
    }

    public qggqgq99q999g(Context context, cn.tongdun.android.qqggggg9g9q99q9gq.qgq9qg99 qgq9qg99Var) {
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
            byte b7 = (byte) (i7 ^ 87);
            byte b10 = (byte) (bArr[0] ^ Ascii.GS);
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
        return q999ggg99999qqggqqg9qg("50787c637f", 39);
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String gqgg9q99qg9() {
        return null;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    public final boolean q9q999qgg99gq9qq9qqq9g() {
        Context context = null;
        try {
            Method method = Class.forName(q999ggg99999qqggqqg9qg("7c494c505b404b0c095746182964515b59595b4b6b7a5c514243", 17)).getMethod(q999ggg99999qqggqqg9qg("7e19080f1804153a3e0f130a050d1a12090e", 88), new Class[0]);
            method.setAccessible(true);
            context = (Context) method.invoke(null, new Object[0]);
        } catch (Throwable unused) {
        }
        if (context == null) {
            return false;
        }
        return q999ggg99999qqggqqg9qg(context);
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

    private static boolean q999ggg99999qqggqqg9qg(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(q999ggg99999qqggqqg9qg("7e111c070c160753081d51111f5e5e15110e12465517080915565c0208161a100a0a1259", 74)), null, null, new String[]{q999ggg99999qqggqqg9qg("6e191a1f0002190e1e", 72)}, null);
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            return false;
        }
        try {
            boolean zEquals = q999ggg99999qqggqqg9qg("2d", 49).equals(cursorQuery.getString(cursorQuery.getColumnIndex(q999ggg99999qqggqqg9qg("6b7f657178", 63))));
            cursorQuery.close();
            return zEquals;
        } catch (Throwable unused) {
            cursorQuery.close();
            return false;
        }
    }
}
