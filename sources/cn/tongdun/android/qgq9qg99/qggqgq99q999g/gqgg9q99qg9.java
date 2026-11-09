package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import cn.tongdun.android.shell.common.HelperJNI;
import com.adjust.sdk.Constants;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class gqgg9q99qg9 {
    private static cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g qgq9qg99;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static final Object f19104q999ggg99999qqggqqg9qg = new Object();
    private static final HashSet qqggggg9g9q99q9gq = new HashSet();
    private static int gqgg9q99qg9 = 0;

    @Nullable
    public static String gqgg9q99qg9(Context context) {
        if (context == null) {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(qgq9qg99("2f607372505b766f646071667651597a757f5e5a602f347b766d666a7b233e6d24396c6e77", 61), new Object[0]);
            return null;
        }
        String strQgq9qg99 = cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, qqggggg9g9q99q9gq(qgq9qg99("2979202a6569", 35)), (String) null);
        if (TextUtils.isEmpty(strQgq9qg99) || !strQgq9qg99.contains(qgq9qg99("792b", 97))) {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(qgq9qg99("2f0f1c1d3f3419000b0f1e09193e36151a1031350f4051024b560301185457054a5d10051c15", 82), new Object[0]);
            return null;
        }
        int iIndexOf = strQgq9qg99.indexOf(qgq9qg99("792e", 100));
        String strQgq9qg910 = g99gq9qg9gggq9qgg.qgq9qg99(strQgq9qg99.substring(iIndexOf + 2));
        if (System.currentTimeMillis() - Long.parseLong(strQgq9qg99.substring(0, iIndexOf), 16) <= 259200000) {
            return strQgq9qg910;
        }
        return null;
    }

    @Nullable
    public static cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g q999ggg99999qqggqqg9qg() {
        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g qgqq999gVar;
        synchronized (f19104q999ggg99999qqggqqg9qg) {
            qgqq999gVar = qgq9qg99;
        }
        return qgqq999gVar;
    }

    @Nullable
    public static cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g qgq9qg99(Context context) {
        gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(context);
        String strQ999ggg99999qqggqqg9qg = cn.tongdun.android.shell.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg(context, qqggggg9g9q99q9gq());
        if (TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg) || !strQ999ggg99999qqggqqg9qg.contains(qgq9qg99("7961", 43))) {
            return null;
        }
        int iIndexOf = strQ999ggg99999qqggqqg9qg.indexOf(qgq9qg99("7972", 56));
        return new cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g(g99gq9qg9gggq9qgg.qgq9qg99(strQ999ggg99999qqggqqg9qg.substring(iIndexOf + 2)), Long.parseLong(strQ999ggg99999qqggqqg9qg.substring(0, iIndexOf), 16));
    }

    private static String qqggggg9g9q99q9gq() {
        return qqg999qq.q999ggg99999qqggqqg9qg() != null ? gq9gggq9gq9gg9q99g9q.qqggggg9g9q99q9gq(qgq9qg99("290d54440010", 87)) : gq9gggq9gq9gg9q99g9q.qgq9qg99(qgq9qg99("297c25357161", 38));
    }

    @NonNull
    public static String q999ggg99999qqggqqg9qg(Context context) {
        if (context == null) {
            try {
                context = cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.qgq9qg99();
            } catch (Throwable th) {
                JSONObject jSONObjectQ999ggg99999qqggqqg9qg = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(th);
                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(qgq9qg99("32664c54746c7d297d", 45) + jSONObjectQ999ggg99999qqggqqg9qg);
                return jSONObjectQ999ggg99999qqggqqg9qg.toString();
            }
        }
        JSONObject jSONObject = new JSONObject();
        String strQgq9qg99 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qgq9qg99();
        String strGqgg9q99qg9 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.gqgg9q99qg9();
        jSONObject.put(qgq9qg99(TransType.TRANS_TYPE_EX_GRATIA_BONUS, 108), strQgq9qg99);
        jSONObject.put(qgq9qg99("302d27", 121), strGqgg9q99qg9);
        long jCurrentTimeMillis = System.currentTimeMillis();
        jSONObject.put(qgq9qg99("3e26", 123), jCurrentTimeMillis);
        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g qgqq999gVarQgq9qg99 = qgq9qg99(context);
        String str = "";
        if (qgqq999gVarQgq9qg99 == null || TextUtils.isEmpty(qgqq999gVarQgq9qg99.q999ggg99999qqggqqg9qg())) {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(qgq9qg99("3f4e455c516e65707e515c7777545b5170744e01155a555b5461625d57527e741d10430a17424059", 19), new Object[0]);
            jSONObject.put(qgq9qg99("394d", 23), "");
        } else {
            jSONObject.put(qgq9qg99("394e", 20), qgqq999gVarQgq9qg99.q999ggg99999qqggqqg9qg());
        }
        String strQgq9qg910 = qgq9qg99("2d", 125);
        String str2 = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g;
        if (str2 != null) {
            str = str2;
        }
        jSONObject.put(strQgq9qg910, str);
        jSONObject.put(qgq9qg99(TransType.TRANS_TYPE_EX_GRATIA_OTHER, 71), cn.tongdun.android.shell.common.qgq9qg99.q999ggg99999qqggqqg9qg(context, jCurrentTimeMillis));
        jSONObject.put(qgq9qg99("3215", 67), 1);
        jSONObject.put(qgq9qg99("2b", 14), qgq9qg99("690808080f0f09", 88));
        return qgq9qg99(cn.tongdun.android.shell.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(jSONObject, cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qggqgq99q999g));
    }

    private static String qgq9qg99(String str) throws UnsupportedEncodingException {
        return qgq9qg99("291d0f1b", 71) + Base64.encodeToString(str.getBytes(qgq9qg99("2870633a64", 59)), 11);
    }

    @NonNull
    private static String qqggggg9g9q99q9gq(String str) {
        String str2 = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg + qgq9qg99("70", 0) + cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq;
        StringBuilder sbS = u.s(str);
        sbS.append(qgq9qg99("70", 43));
        sbS.append(cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.qgq9qg99(str2));
        return sbS.toString();
    }

    @NonNull
    public static String q999ggg99999qqggqqg9qg(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(qgq9qg99("3224", 114), 1);
            jSONObject.put(qgq9qg99("2b", 60), qgq9qg99("694a4a4a4d4d4b", 26));
            String strQgq9qg99 = qgq9qg99("2d", 47);
            String str2 = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put(strQgq9qg99, str2);
            String strQgq9qg910 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qgq9qg99();
            String strGqgg9q99qg9 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.gqgg9q99qg9();
            if (!TextUtils.isEmpty(strQgq9qg910) && !qgq9qg99("066d", 33).equals(strQgq9qg910)) {
                jSONObject.put(qgq9qg99(TransType.TRANS_TYPE_EX_GRATIA_BONUS, 54), strQgq9qg910);
            }
            if (!TextUtils.isEmpty(strGqgg9q99qg9)) {
                jSONObject.put(qgq9qg99("30242e", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR), strGqgg9q99qg9);
            }
            String str4 = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9g9q9qq9;
            if (str4 != null) {
                str3 = str4;
            }
            if (!TextUtils.isEmpty(str3) && cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq()) {
                jSONObject.put(qgq9qg99("3c63", 35), str3);
            }
            jSONObject.put(qgq9qg99(TransType.TRANS_TYPE_EX_GRATIA_OTHER, 125), str);
            jSONObject.put(qgq9qg99("2e37", 122), System.currentTimeMillis());
            return qgq9qg99(cn.tongdun.android.shell.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(jSONObject, cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qggqgq99q999g));
        } catch (Throwable th) {
            JSONObject jSONObjectQ999ggg99999qqggqqg9qg = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(th);
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(qgq9qg99("325379614159481c48", 24) + jSONObjectQ999ggg99999qqggqqg9qg);
            return jSONObjectQ999ggg99999qqggqqg9qg.toString();
        }
    }

    private static String qgq9qg99(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 74);
            byte b10 = (byte) (bArr[0] ^ 93);
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

    public static String q999ggg99999qqggqqg9qg(String str, int i7) {
        while (!TextUtils.isEmpty(str)) {
            HashSet hashSet = qqggggg9g9q99q9gq;
            if (hashSet.size() >= 1000) {
                hashSet.clear();
                gqgg9q99qg9 = 0;
            }
            Object objQ999ggg99999qqggqqg9qg = HelperJNI.q999ggg99999qqggqqg9qg(47, new Object[]{str, Integer.valueOf(i7)});
            if (objQ999ggg99999qqggqqg9qg != null) {
                String str2 = (String) objQ999ggg99999qqggqqg9qg;
                if (hashSet.add(str2)) {
                    return str2;
                }
                int i10 = gqgg9q99qg9;
                if (i10 >= 20) {
                    gqgg9q99qg9 = 0;
                    return str2;
                }
                gqgg9q99qg9 = i10 + 1;
            }
        }
        return str;
    }

    public static void qgq9qg99(Context context, String str, long j6) {
        if (context == null) {
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(qgq9qg99("2e2623271218352c2723322535121a39363c1d19236c7738352e252938607d2e677a2f2d34", 126), new Object[0]);
            return;
        }
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, qqggggg9g9q99q9gq(qgq9qg99("293168622d21", 107)), String.format(Locale.US, qgq9qg99("785657000156", 74), Long.toHexString(j6), g99gq9qg9gggq9qgg.qgq9qg99(str)));
    }

    public static void q999ggg99999qqggqqg9qg(Context context, String str, long j6) {
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, qqggggg9g9q99q9gq(), String.format(Locale.US, qgq9qg99("786c6d3a3b6c", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR), Long.toHexString(j6 - DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM), g99gq9qg9gggq9qgg.qgq9qg99(str)));
    }

    public static boolean qgq9qg99() {
        synchronized (f19104q999ggg99999qqggqqg9qg) {
            cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g qgqq999gVar = qgq9qg99;
            if (qgqq999gVar != null && !TextUtils.isEmpty(qgqq999gVar.q999ggg99999qqggqqg9qg())) {
                return System.currentTimeMillis() - qgq9qg99.qgq9qg99() <= 259200000;
            }
            return false;
        }
    }

    public static void q999ggg99999qqggqqg9qg(String str, long j6, boolean z3) {
        synchronized (f19104q999ggg99999qqggqqg9qg) {
            qgq9qg99 = new cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g(str, j6 - (z3 ? DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM : 0L));
        }
    }

    public static boolean qqggggg9g9q99q9gq(Context context) {
        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g qgqq999gVarQgq9qg99 = qgq9qg99(context);
        if (qgqq999gVarQgq9qg99 == null) {
            return false;
        }
        return System.currentTimeMillis() - qgqq999gVarQgq9qg99.qgq9qg99() <= 259200000;
    }
}
