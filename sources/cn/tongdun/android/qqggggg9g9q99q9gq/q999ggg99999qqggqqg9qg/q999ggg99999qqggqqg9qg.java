package cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class q999ggg99999qqggqqg9qg implements qgqq999g {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    protected Context f19241q999ggg99999qqggqqg9qg;
    protected qg9gqgqqggg9q9qg qgq9qg99;
    private List qqggggg9g9q99q9gq = new ArrayList();

    static {
        q999ggg99999qqggqqg9qg("096a73717e67", 30);
    }

    public q999ggg99999qqggqqg9qg(Context context, qg9gqgqqggg9q9qg qg9gqgqqggg9q9qgVar) {
        this.f19241q999ggg99999qqggqqg9qg = context;
        this.qgq9qg99 = qg9gqgqqggg9q9qgVar;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public final String q999ggg99999qqggqqg9qg() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.qqggggg9g9q99q9gq.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append('\n');
        }
        String string = sb2.toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    @Override // cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g
    @Nullable
    public String qgq9qg99() {
        return null;
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
            byte b7 = (byte) (i7 ^ 106);
            byte b10 = (byte) (bArr[0] ^ 94);
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

    public final void q999ggg99999qqggqqg9qg(Exception exc) {
        this.qqggggg9g9q99q9gq.add(q999ggg99999qqggqqg9qg("1b7d5b4655445d4641145a", 42) + exc);
    }

    public final void q999ggg99999qqggqqg9qg(String str) {
        this.qqggggg9g9q99q9gq.add(str);
    }
}
