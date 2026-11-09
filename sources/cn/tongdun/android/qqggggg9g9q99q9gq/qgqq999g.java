package cn.tongdun.android.qqggggg9g9q99q9gq;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import com.transsnet.palmpay.bean.HomeDialogState;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class qgqq999g {
    private long gqg99q9q9q;
    private String gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    public String f19248q999ggg99999qqggqqg9qg;
    private String qg9gqgqqggg9q9qg;
    public String qgq9qg99;
    private String qgqq999g;
    private String qqggggg9g9q99q9gq;

    private qgqq999g(cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g qgqq999gVar, long j6) {
        this.f19248q999ggg99999qqggqqg9qg = qgqq999gVar.gqgg9q99qg9();
        this.qqggggg9g9q99q9gq = qgqq999gVar.qgqq999g();
        this.gqgg9q99qg9 = qgqq999gVar.qg9gqgqqggg9q9qg();
        this.qgqq999g = qgqq999gVar.gqg99q9q9q();
        this.qgq9qg99 = qgqq999gVar.qgq9qg99();
        this.qg9gqgqqggg9q9qg = qgqq999gVar.q999ggg99999qqggqqg9qg();
        this.gqg99q9q9q = j6;
    }

    public static qgqq999g q999ggg99999qqggqqg9qg(cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g qgqq999gVar, long j6) {
        return new qgqq999g(qgqq999gVar, j6);
    }

    public final boolean qgq9qg99() {
        return (this.f19248q999ggg99999qqggqqg9qg == null && this.qqggggg9g9q99q9gq == null && this.gqgg9q99qg9 == null) ? false : true;
    }

    public final JSONObject qqggggg9g9q99q9gq() {
        if (q999ggg99999qqggqqg9qg()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(q999ggg99999qqggqqg9qg("60080e0b", 59), this.f19248q999ggg99999qqggqqg9qg);
            jSONObject.put(q999ggg99999qqggqqg9qg("6e525a5f", HomeDialogState.PRIORITY_HIGHEST_111), this.qqggggg9g9q99q9gq);
            jSONObject.put(q999ggg99999qqggqqg9qg("79495653", 99), this.gqgg9q99qg9);
            jSONObject.put(q999ggg99999qqggqqg9qg("6d51524e4b", 124), this.qgqq999g);
            jSONObject.put(q999ggg99999qqggqqg9qg("79080c1a011d1a", 38), this.qgq9qg99);
            jSONObject.put(q999ggg99999qqggqqg9qg("623f2137253135", 10), this.qg9gqgqqggg9q9qg);
            jSONObject.put(q999ggg99999qqggqqg9qg("7b677e725c56667d", 71), this.gqg99q9q9q);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(q999ggg99999qqggqqg9qg("62757171", 65), jSONObject);
            return jSONObject2;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private qgqq999g(String str, long j6) {
        this.qg9gqgqqggg9q9qg = str;
        this.gqg99q9q9q = j6;
    }

    public static qgqq999g q999ggg99999qqggqqg9qg(String str, long j6) {
        return new qgqq999g(str, j6);
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
            byte b7 = (byte) (i7 ^ 61);
            byte b10 = (byte) (bArr[0] ^ Ascii.SI);
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

    public final boolean q999ggg99999qqggqqg9qg() {
        return this.f19248q999ggg99999qqggqqg9qg == null && this.qqggggg9g9q99q9gq == null && this.gqgg9q99qg9 == null && TextUtils.isEmpty(this.qgq9qg99) && TextUtils.isEmpty(this.qg9gqgqqggg9q9qg);
    }
}
