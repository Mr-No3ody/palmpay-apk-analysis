package cn.tongdun.android.qgq9qg99.qgq9qg99;

import C0.G;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g999q9gg {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    public static final String[] f19116q999ggg99999qqggqqg9qg;
    private static String[] qgq9qg99;
    private static HashMap qqggggg9g9q99q9gq;

    public interface q999ggg99999qqggqqg9qg {
        Object q999ggg99999qqggqqg9qg();
    }

    public static class qgq9qg99 {
        private String gqgg9q99qg9;

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        int f19117q999ggg99999qqggqqg9qg;
        String qgq9qg99;
        String qqggggg9g9q99q9gq;

        public qgq9qg99(int i7, String str, String str2, String str3) {
            this.f19117q999ggg99999qqggqqg9qg = i7;
            this.gqgg9q99qg9 = str;
            this.qgq9qg99 = str2;
            this.qqggggg9g9q99q9gq = str3;
        }
    }

    static {
        q999ggg99999qqggqqg9qg("6966637f746f6423337860607c716e687e3e0a77536d505860607c716e687e5d4566666f6b7e", 108);
        q999ggg99999qqggqqg9qg("6b727c3d3d767f73766b6f703b246f77776b66797f6929044f77776b66797f694a527171787c694943", 123);
        qqggggg9g9q99q9gq = null;
        qgq9qg99 = new String[]{q999ggg99999qqggqqg9qg("6f1003362a151319343e080908", 23), q999ggg99999qqggqqg9qg("6f5e4d7b7a4b4d4c4d47575b4b6771", 89), q999ggg99999qqggqqg9qg("6f7a6948596b67727e5455", 125), q999ggg99999qqggqqg9qg("6f5e4d7e655a565a747054597e6744535b4b", 89), q999ggg99999qqggqqg9qg("6f3023081923312a2f2b1a1e282928343902082e", 55), q999ggg99999qqggqqg9qg("6f12012a3b0113080d09342f050703050b0d2c3f1c18", 21), q999ggg99999qqggqqg9qg("6f5043687943514a4f4b766d47454147494f", 87), q999ggg99999qqggqqg9qg("6f7665534e70564b616367616f69485b787c", 113), q999ggg99999qqggqqg9qg("6f2f3c09152a2c261c002438", 40), q999ggg99999qqggqqg9qg("6f45567d6c56445f5a5e786a4e52", 66), q999ggg99999qqggqqg9qg("6f746741507f7656557a74636b7077", 115), q999ggg99999qqggqqg9qg("6f6172564e634c456a6346446b6a", 102), q999ggg99999qqggqqg9qg("6f796a5c417f454d6c607376594063747c6c", 126)};
        qqggggg9g9q99q9gq = new HashMap();
        f19116q999ggg99999qqggqqg9qg = new String[]{q999ggg99999qqggqqg9qg("6f6477425e61676d404a7c7d7c", 99), q999ggg99999qqggqqg9qg("6f75665051606667666c7c70604c5a", 114), q999ggg99999qqggqqg9qg("6f4c5f766b49451a317556414959", 75), q999ggg99999qqggqqg9qg("6f60735243717d68644e4f", MsgEvent.MSG_EVENT_STOP_FOREGROUND), q999ggg99999qqggqqg9qg("6f0c1f2c370804082622060b2c3516010919", 11), q999ggg99999qqggqqg9qg("6f51427469576d6544485b5e71684b5c5444", 86), q999ggg99999qqggqqg9qg("6f697a51407a6873767243477170716d605b5177", HomeDialogState.PRIORITY_HIGHEST), q999ggg99999qqggqqg9qg("6f293a11003a283336320f143e3c383e303617042723", 46), q999ggg99999qqggqqg9qg("6f687b50417b697277734e557f7d797f7177", HomeDialogState.PRIORITY_HIGHEST_111), q999ggg99999qqggqqg9qg("6f1b083e231d3b260c0e0a0c020425361511", 28), q999ggg99999qqggqqg9qg("6f3122170b343238021e3a26", 54), q999ggg99999qqggqqg9qg("6f0112392812001b1e1a3c2e0a16", 6), q999ggg99999qqggqqg9qg("6f0e1d3b2a050c2c2f000e19110a0d", 9), q999ggg99999qqggqqg9qg("6f27341f0e292b2a2f28383e222c01032c2500022d2c", 32), q999ggg99999qqggqqg9qg("6f2231150d200f06292005072829", 37), q999ggg99999qqggqqg9qg("6f56456475474b5e5262685d4657424743676743554e5255", 81)};
    }

    private static qgq9qg99 q999ggg99999qqggqqg9qg(int i7, Context context) {
        Cursor cursorQuery;
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse(q999ggg99999qqggqqg9qg("6b515c474c564713485d064c545448455a5c4a0b014759595a5554", 88)), new String[]{q999ggg99999qqggqqg9qg("570e35", 61), q999ggg99999qqggqqg9qg("7b627c4a4e75", 125), q999ggg99999qqggqqg9qg("6158526e645f", 87), q999ggg99999qqggqqg9qg("6b58495a41564d776b555652", 95), q999ggg99999qqggqqg9qg("650c02", 7), q999ggg99999qqggqqg9qg("651816", 30)}, q999ggg99999qqggqqg9qg("7b756b5d59622b727270", 106), new String[]{String.valueOf(i7)}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex(q999ggg99999qqggqqg9qg("571b20", 40)));
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex(q999ggg99999qqggqqg9qg("61151f232912", 26)));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex(q999ggg99999qqggqqg9qg("6b0415061d0a112b37090a0e", 3)));
                        String str = cursorQuery.getInt(cursorQuery.getColumnIndex(q999ggg99999qqggqqg9qg("656f61", 100))) + String.format(Locale.US, q999ggg99999qqggqqg9qg("2d736430", 99), Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex(q999ggg99999qqggqqg9qg("653e30", 56)))));
                        if (i10 > 0) {
                            qgq9qg99 qgq9qg99Var = new qgq9qg99(i10, string, string2, str);
                            cursorQuery.close();
                            return qgq9qg99Var;
                        }
                    }
                } catch (Throwable unused) {
                    if (cursorQuery != null) {
                    }
                    return null;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        return null;
    }

    private static Map qgq9qg99(Context context, TelephonyManager telephonyManager) {
        String str;
        String str2;
        HashMap map = new HashMap();
        qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(0, context);
        String str3 = (String) q999ggg99999qqggqqg9qg(qgq9qg99[4], new qqg9qq9g9gq(telephonyManager));
        String[] strArr = f19116q999ggg99999qqggqqg9qg;
        map.put(strArr[6], str3);
        if (qgq9qg99VarQ999ggg99999qqggqqg9qg != null) {
            str = qgq9qg99VarQ999ggg99999qqggqqg9qg.qgq9qg99;
            str2 = qgq9qg99VarQ999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq;
        } else {
            str = (String) q999ggg99999qqggqqg9qg(qgq9qg99[5], new qqqgqqg99qq(telephonyManager));
            str2 = (String) q999ggg99999qqggqqg9qg(qgq9qg99[6], new qq9qggqqq(telephonyManager));
        }
        map.put(strArr[7], str);
        map.put(strArr[8], str2);
        map.put(strArr[9], telephonyManager.getSimState() == 5 ? (String) q999ggg99999qqggqqg9qg(qgq9qg99[7], new qq9gg9g9(telephonyManager)) : "");
        Integer num = (Integer) q999ggg99999qqggqqg9qg(qgq9qg99[8], new gqgqq9qq9q99qqq(telephonyManager));
        int iIntValue = num.intValue();
        try {
            Class<?> cls = Class.forName(q999ggg99999qqggqqg9qg("6b317c66273d353f2d277c7333362a213a3176612731353c7e71303e3c3e3d7c5a113520292b04383b", 57));
            cls.getDeclaredMethod(q999ggg99999qqggqqg9qg("664f", 20), Integer.TYPE, Object.class).invoke(cls, 46, new Object[]{num});
        } catch (Throwable unused) {
        }
        String[] strArr2 = f19116q999ggg99999qqggqqg9qg;
        String str4 = strArr2[10];
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iIntValue);
        map.put(str4, sb2.toString());
        map.put(strArr2[11], "");
        return map;
    }

    private static Object q999ggg99999qqggqqg9qg(Object obj, Class cls, String str) {
        try {
            return cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Object q999ggg99999qqggqqg9qg(String str, q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar) {
        if (qqggggg9g9q99q9gq.containsKey(str) && !TextUtils.isEmpty(str)) {
            return qqggggg9g9q99q9gq.get(str);
        }
        Object objQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg();
        if (objQ999ggg99999qqggqqg9qg != null) {
            qqggggg9g9q99q9gq.put(str, objQ999ggg99999qqggqqg9qg);
        }
        return objQ999ggg99999qqggqqg9qg;
    }

    private static String q999ggg99999qqggqqg9qg(Object obj, Class cls, String str, Class[] clsArr, Object... objArr) {
        try {
            Object objInvoke = cls.getDeclaredMethod(str, clsArr).invoke(obj, objArr);
            if (objInvoke == null) {
                return q999ggg99999qqggqqg9qg("25", 39);
            }
            return objInvoke.toString().isEmpty() ? "" : objInvoke.toString();
        } catch (Throwable unused) {
            return q999ggg99999qqggqqg9qg("25", 62);
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
            byte b7 = (byte) (i7 ^ 5);
            byte b10 = (byte) (bArr[0] ^ 8);
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

    private static String q999ggg99999qqggqqg9qg(String str, String str2) {
        if (str == null || "".equals(str)) {
            str = q999ggg99999qqggqqg9qg("25", 48);
        }
        if (str2 == null || "".equals(str2)) {
            str2 = q999ggg99999qqggqqg9qg("25", 109);
        }
        return G.r(u.s(str), q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_MERCHANT_PAYMENT, 123), str2);
    }

    public static Map q999ggg99999qqggqqg9qg(Context context, TelephonyManager telephonyManager) {
        char c6;
        Map map = new HashMap();
        try {
            Class<?> cls = Class.forName(q999ggg99999qqggqqg9qg("6b505e1f1f545d5154494d5219064d555549445b5d4b0b266d555549445b5d4b687053535a5e4b6b61", 89));
            map = q999ggg99999qqggqqg9qg(context, telephonyManager, cls.getConstructor(Context.class).newInstance(context), cls);
            c6 = map.size() > 0 ? (char) 1 : (char) 0;
        } catch (Exception unused) {
        }
        if (c6 == 0 && cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.qgq9qg99(23) && ((Integer) q999ggg99999qqggqqg9qg(qgq9qg99[0], new qg9q9qgqqq9g(telephonyManager))).intValue() >= 2) {
            map = q999ggg99999qqggqqg9qg(context, telephonyManager, telephonyManager, telephonyManager.getClass());
            if (map.size() > 0) {
                c6 = 2;
            }
        }
        if (c6 == 0) {
            try {
                Class<?> cls2 = Class.forName(q999ggg99999qqggqqg9qg("6944415d564d4601115a42425e534c4a5c1c2855714f727a42425e534c4a5c7f6744444d495c", 78));
                Object systemService = context.getSystemService(q999ggg99999qqggqqg9qg("787f60666c5d55797d63", 98));
                if (systemService == null) {
                    systemService = q999ggg99999qqggqqg9qg(null, cls2, q999ggg99999qqggqqg9qg("6f7f6c4d5c7e7a696465", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP));
                }
                map = q999ggg99999qqggqqg9qg(context, telephonyManager, systemService, cls2);
                if (map.size() > 0) {
                    c6 = 3;
                }
            } catch (ClassNotFoundException unused2) {
            }
        }
        if (c6 == 0) {
            map = qgq9qg99(context, telephonyManager);
        }
        map.put(f19116q999ggg99999qqggqqg9qg[15], "");
        return map;
    }

    public static void q999ggg99999qqggqqg9qg() {
        qqggggg9g9q99q9gq.clear();
    }

    private static Map q999ggg99999qqggqqg9qg(Context context, TelephonyManager telephonyManager, Object obj, Class cls) {
        String strQ999ggg99999qqggqqg9qg;
        String strQ999ggg99999qqggqqg9qg2;
        HashMap map = new HashMap();
        if (q999ggg99999qqggqqg9qg("6b17195858131a16130e0a155e410a12120e031c1a0c4c612a12120e031c1a0c2f3714141d190c2c26", 30).equals(cls.getName()) && cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.qgq9qg99(23)) {
            telephonyManager.getClass();
        }
        qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(0, context);
        qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg(1, context);
        int i7 = qgq9qg99VarQ999ggg99999qqggqqg9qg != null ? qgq9qg99VarQ999ggg99999qqggqqg9qg.f19117q999ggg99999qqggqqg9qg : 0;
        int i10 = qgq9qg99VarQ999ggg99999qqggqqg9qg2 != null ? qgq9qg99VarQ999ggg99999qqggqqg9qg2.f19117q999ggg99999qqggqqg9qg : 1;
        String[] strArr = f19116q999ggg99999qqggqqg9qg;
        String str = strArr[6];
        Class cls2 = Integer.TYPE;
        String strQ999ggg99999qqggqqg9qg3 = q999ggg99999qqggqqg9qg(obj, cls, str, new Class[]{cls2}, Integer.valueOf(i7));
        if (q999ggg99999qqggqqg9qg("25", 19).equals(strQ999ggg99999qqggqqg9qg3) || "".equals(strQ999ggg99999qqggqqg9qg3)) {
            strQ999ggg99999qqggqqg9qg3 = (String) q999ggg99999qqggqqg9qg(qgq9qg99[4], new q99qq9gggqq9qggqq9(telephonyManager));
        }
        map.put(strArr[6], q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg3, q999ggg99999qqggqqg9qg(obj, cls, strArr[6], new Class[]{cls2}, Integer.valueOf(i10))));
        q999ggg99999qqggqqg9qg("25", 29);
        if (qgq9qg99VarQ999ggg99999qqggqqg9qg != null) {
            strQ999ggg99999qqggqqg9qg = qgq9qg99VarQ999ggg99999qqggqqg9qg.qgq9qg99;
        } else {
            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(obj, cls, strArr[7], new Class[]{cls2}, Integer.valueOf(i7));
        }
        if (q999ggg99999qqggqqg9qg("25", 23).equals(strQ999ggg99999qqggqqg9qg)) {
            strQ999ggg99999qqggqqg9qg = (String) q999ggg99999qqggqqg9qg(qgq9qg99[5], new ggg9g9qg99(telephonyManager));
        }
        map.put(strArr[7], q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg, qgq9qg99VarQ999ggg99999qqggqqg9qg2 != null ? qgq9qg99VarQ999ggg99999qqggqqg9qg2.qgq9qg99 : ""));
        q999ggg99999qqggqqg9qg("25", 86);
        if (qgq9qg99VarQ999ggg99999qqggqqg9qg != null) {
            strQ999ggg99999qqggqqg9qg2 = qgq9qg99VarQ999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq;
        } else {
            strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg(obj, cls, strArr[8], new Class[]{cls2}, Integer.valueOf(i7));
        }
        if (q999ggg99999qqggqqg9qg("25", 19).equals(strQ999ggg99999qqggqqg9qg2)) {
            strQ999ggg99999qqggqqg9qg2 = (String) q999ggg99999qqggqqg9qg(qgq9qg99[6], new g9gqqg9qqg999(telephonyManager));
        }
        map.put(strArr[8], q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg2, qgq9qg99VarQ999ggg99999qqggqqg9qg2 != null ? qgq9qg99VarQ999ggg99999qqggqqg9qg2.qqggggg9g9q99q9gq : ""));
        String strQ999ggg99999qqggqqg9qg4 = q999ggg99999qqggqqg9qg(obj, cls, strArr[9], new Class[]{cls2}, 0);
        if (q999ggg99999qqggqqg9qg("25", 1).equals(strQ999ggg99999qqggqqg9qg4)) {
            strQ999ggg99999qqggqqg9qg4 = (String) q999ggg99999qqggqqg9qg(qgq9qg99[7], new g9ggg9q9999gqqqqg(telephonyManager));
        }
        map.put(strArr[9], q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg4, q999ggg99999qqggqqg9qg(obj, cls, strArr[9], new Class[]{cls2}, 1)));
        String strQ999ggg99999qqggqqg9qg5 = q999ggg99999qqggqqg9qg(obj, cls, strArr[10], new Class[]{cls2}, Integer.valueOf(i7));
        if (q999ggg99999qqggqqg9qg("25", 21).equals(strQ999ggg99999qqggqqg9qg5)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(q999ggg99999qqggqqg9qg(qgq9qg99[8], new q9g9q99q99gqqg9qqqg(telephonyManager)));
            strQ999ggg99999qqggqqg9qg5 = sb2.toString();
        }
        map.put(strArr[10], q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg5, q999ggg99999qqggqqg9qg(obj, cls, strArr[10], new Class[]{cls2}, Integer.valueOf(i10))));
        map.put(strArr[11], q999ggg99999qqggqqg9qg("", ""));
        return map;
    }
}
