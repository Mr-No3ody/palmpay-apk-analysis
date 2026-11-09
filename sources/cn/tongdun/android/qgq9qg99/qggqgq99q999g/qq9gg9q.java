package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import C0.G;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qq9gg9q {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static volatile qq9gg9q f19112q999ggg99999qqggqqg9qg;

    static {
        q999ggg99999qqggqqg9qg("412a32", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR);
        q999ggg99999qqggqqg9qg("5244", 15);
        q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_PALMFORCE_REWARD, 85);
        q999ggg99999qqggqqg9qg("422c", 98);
        q999ggg99999qqggqqg9qg("422a", 119);
        q999ggg99999qqggqqg9qg("5c3920", 99);
        q999ggg99999qqggqqg9qg("00095952010c4d42021f484e1e0f5d59", 23);
    }

    private qq9gg9q() {
    }

    public static qq9gg9q q999ggg99999qqggqqg9qg() {
        if (f19112q999ggg99999qqggqqg9qg == null) {
            synchronized (qq9gg9q.class) {
                try {
                    if (f19112q999ggg99999qqggqqg9qg == null) {
                        f19112q999ggg99999qqggqqg9qg = new qq9gg9q();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19112q999ggg99999qqggqqg9qg;
    }

    private static String qqggggg9g9q99q9gq(String str) {
        try {
            return new String(Base64.decode(str, 0), q999ggg99999qqggqqg9qg("4465762f71", 58));
        } catch (Throwable unused) {
            return "";
        }
    }

    public final cn.tongdun.android.qgq9qg99.gqgg9q99qg9.gqgg9q99qg9 qgq9qg99(Context context) {
        try {
            String strQqggggg9g9q99q9gq = qqggggg9g9q99q9gq(qgq9qg99(context, q999ggg99999qqggqqg9qg("4210", 94), ""));
            if (TextUtils.isEmpty(strQqggggg9g9q99q9gq)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strQqggggg9g9q99q9gq);
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(q999ggg99999qqggqqg9qg("41051d", 95));
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(q999ggg99999qqggqqg9qg("4254", 9));
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(q999ggg99999qqggqqg9qg("5c130a", 73));
            if (jSONArrayOptJSONArray != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i7);
                    if (!TextUtils.isEmpty(strOptString)) {
                        copyOnWriteArrayList.add(strOptString);
                    }
                }
            }
            if (jSONArrayOptJSONArray2 != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                    String string = jSONArrayOptJSONArray2.getString(i10);
                    if (!TextUtils.isEmpty(string)) {
                        copyOnWriteArrayList2.add(string);
                    }
                }
            }
            if (jSONArrayOptJSONArray3 != null) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray3.length(); i11++) {
                    String strOptString2 = jSONArrayOptJSONArray3.optString(i11);
                    if (!TextUtils.isEmpty(strOptString2)) {
                        copyOnWriteArrayList3.add(strOptString2);
                    }
                }
            }
            return new cn.tongdun.android.qgq9qg99.gqgg9q99qg9.gqgg9q99qg9(copyOnWriteArrayList, copyOnWriteArrayList2, copyOnWriteArrayList3);
        } catch (Throwable unused) {
            return null;
        }
    }

    private String qgq9qg99(Context context, String str, String str2) {
        return cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, q999ggg99999qqggqqg9qg(str), str2);
    }

    @NonNull
    public final String q999ggg99999qqggqqg9qg(Context context) {
        return qgq9qg99(context, q999ggg99999qqggqqg9qg("5274", 63), q999ggg99999qqggqqg9qg("01", 13));
    }

    @NonNull
    private static String q999ggg99999qqggqqg9qg(String str) {
        return G.r(u.s(str), q999ggg99999qqggqqg9qg("1c", 66), cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.qgq9qg99(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg + q999ggg99999qqggqqg9qg("1c", 46) + cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq));
    }

    private static String qgq9qg99(String str) {
        try {
            return new String(Base64.encode(str.getBytes(q999ggg99999qqggqqg9qg("442d3e6739", 114)), 0), q999ggg99999qqggqqg9qg("44091a431d", 86));
        } catch (Throwable unused) {
            return "";
        }
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
            byte b7 = (byte) (i7 ^ 94);
            byte b10 = (byte) (bArr[0] ^ 49);
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

    private void q999ggg99999qqggqqg9qg(Context context, String str, String str2) {
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg(str), str2);
    }

    public final void q999ggg99999qqggqqg9qg(Context context, JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_PALMFORCE_REWARD, 118));
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString(q999ggg99999qqggqqg9qg("5203", 72));
                String strOptString2 = jSONObjectOptJSONObject.optString(q999ggg99999qqggqqg9qg("4247", 9));
                if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                    return;
                }
                String strQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(strOptString2, q999ggg99999qqggqqg9qg("0007575c0f02434c0c11464010015357", 25));
                if (TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg)) {
                    return;
                }
                q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("5274", 63), strOptString);
                q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("4200", 78), qgq9qg99(strQ999ggg99999qqggqqg9qg));
            }
        } catch (Throwable unused) {
        }
    }
}
