package cn.tongdun.android.readphone.q999ggg99999qqggqqg9qg;

import C0.G;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static String[] f19254q999ggg99999qqggqqg9qg;
    private static HashMap qgq9qg99;
    private static String[] qqggggg9g9q99q9gq;

    /* JADX INFO: renamed from: cn.tongdun.android.readphone.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg$q999ggg99999qqggqqg9qg, reason: collision with other inner class name */
    public interface InterfaceC0014q999ggg99999qqggqqg9qg {
        Object q999ggg99999qqggqqg9qg();
    }

    public static class qgq9qg99 {
        private String gqgg9q99qg9;

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        int f19255q999ggg99999qqggqqg9qg;
        String qgq9qg99;
        String qqggggg9g9q99q9gq;

        public qgq9qg99(int i7, String str, String str2, String str3) {
            this.f19255q999ggg99999qqggqqg9qg = i7;
            this.gqgg9q99qg9 = str;
            this.qgq9qg99 = str2;
            this.qqggggg9g9q99q9gq = str3;
        }
    }

    static {
        q999ggg99999qqggqqg9qg("3441445853484304145f47475b56494f59192d50744a777f47475b56494f597a624141484c59", 74);
        q999ggg99999qqggqqg9qg("364c42030348414d4855514e051a5149495558474157173a7149495558474157746c4f4f464257777d", 68);
        qgq9qg99 = null;
        f19254q999ggg99999qqggqqg9qg = new String[]{q999ggg99999qqggqqg9qg("323f2c19053a3c361b11272627", 57), q999ggg99999qqggqqg9qg("32716254556462636268787464485e", 119), q999ggg99999qqggqqg9qg("321c0f2e3f0d0114183233", 26), q999ggg99999qqggqqg9qg("3203102338070b07292d0904233a190e0616", 5), q999ggg99999qqggqqg9qg("3244577c6d57455e5b5f6e6a5c5d5c404d767c5a", 66), q999ggg99999qqggqqg9qg("3242517a6b5143585d59647f555753555b5d7c6f4c48", 68), q999ggg99999qqggqqg9qg("3236250e1f25372c292d100b212327212f29", 48), q999ggg99999qqggqqg9qg("325546706d537568424044424c4a6b785b5f", 83), q999ggg99999qqggqqg9qg("325e4d78645b5d576d715549", 88), q999ggg99999qqggqqg9qg("327b684352687a6164604654706c", 125), q999ggg99999qqggqqg9qg("32445771604f4666654a44535b4047", 66), q999ggg99999qqggqqg9qg("3217042038153a331c1530321d1c", 17), q999ggg99999qqggqqg9qg("325b487e635d676f4e4251547b6241565e4e", 93)};
        qgq9qg99 = new HashMap();
        qqggggg9g9q99q9gq = new String[]{q999ggg99999qqggqqg9qg("321d0e3b27181e143933050405", 27), q999ggg99999qqggqqg9qg("3205162021101617161c0c00103c2a", 3), q999ggg99999qqggqqg9qg("3267745d40626e311a5e7d6a6272", 97), q999ggg99999qqggqqg9qg("3246557465575b4e426869", 64), q999ggg99999qqggqqg9qg("32180b38231c101c3236121f382102151d0d", 30), q999ggg99999qqggqqg9qg("323d2e18053b0109282437321d0427303828", 59), q999ggg99999qqggqqg9qg("3265765d4c76647f7a7e4f4b7d7c7d616c575d7b", 99), q999ggg99999qqggqqg9qg("3276654e5f65776c696d504b616367616f69485b787c", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR), q999ggg99999qqggqqg9qg("32786b40516b796267635e456f6d696f6167", 126), q999ggg99999qqggqqg9qg("32786b5d407e58456f6d696f616746557672", 126), q999ggg99999qqggqqg9qg("326c7f4a56696f655f43677b", 106), q999ggg99999qqggqqg9qg("324152796852405b5e5a7c6e4a56", 71), q999ggg99999qqggqqg9qg("32485b7d6c434a6a6946485f574c4b", 78), q999ggg99999qqggqqg9qg("3272614a5b7c7e7f7a7d6d6b77795456797055577879", 116), q999ggg99999qqggqqg9qg("324e5d79614c636a454c696b4445", 72), q999ggg99999qqggqqg9qg("320d1e3f2e1c1005093933061d0c191c183c3c180e15090e", 11)};
    }

    private static qgq9qg99 q999ggg99999qqggqqg9qg(int i7, Context context) {
        Cursor cursorQuery;
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse(q999ggg99999qqggqqg9qg("36616c777c667723786d367c646478756a6c7a3b317769696a6564", 105)), new String[]{q999ggg99999qqggqqg9qg("0a251e", 23), q999ggg99999qqggqqg9qg("26180630340f", 6), q999ggg99999qqggqqg9qg("3c353f030932", 59), q999ggg99999qqggqqg9qg("363d2c3f243328120e303337", 59), q999ggg99999qqggqqg9qg("381c12", 22), q999ggg99999qqggqqg9qg("387a74", 125)}, q999ggg99999qqggqqg9qg("26607e484c773e676765", 126), new String[]{String.valueOf(i7)}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex(q999ggg99999qqggqqg9qg("0a6c57", 94)));
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex(q999ggg99999qqggqqg9qg("3c070d313b00", 9)));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex(q999ggg99999qqggqqg9qg("363d2c3f243328120e303337", 59)));
                        String str = cursorQuery.getInt(cursorQuery.getColumnIndex(q999ggg99999qqggqqg9qg("38020c", 8))) + String.format(Locale.US, q999ggg99999qqggqqg9qg("70687f2b", 121), Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex(q999ggg99999qqggqqg9qg("387f71", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP)))));
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
        map.put(qqggggg9g9q99q9gq[6], (String) q999ggg99999qqggqqg9qg(f19254q999ggg99999qqggqqg9qg[4], new gqg99q9q9q(telephonyManager)));
        if (qgq9qg99VarQ999ggg99999qqggqqg9qg != null) {
            str = qgq9qg99VarQ999ggg99999qqggqqg9qg.qgq9qg99;
            str2 = qgq9qg99VarQ999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq;
        } else {
            str = (String) q999ggg99999qqggqqg9qg(f19254q999ggg99999qqggqqg9qg[5], new q9q999qgg99gq9qq9qqq9g(telephonyManager));
            str2 = (String) q999ggg99999qqggqqg9qg(f19254q999ggg99999qqggqqg9qg[6], new qggqgq99q999g(telephonyManager));
        }
        map.put(qqggggg9g9q99q9gq[7], str);
        map.put(qqggggg9g9q99q9gq[8], str2);
        map.put(qqggggg9g9q99q9gq[9], telephonyManager.getSimState() == 5 ? (String) q999ggg99999qqggqqg9qg(f19254q999ggg99999qqggqqg9qg[7], new q99q99qq99q9g(telephonyManager)) : "");
        Integer num = (Integer) q999ggg99999qqggqqg9qg(f19254q999ggg99999qqggqqg9qg[8], new qqg999qq(telephonyManager));
        int iIntValue = num.intValue();
        try {
            Class<?> cls = Class.forName(q999ggg99999qqggqqg9qg("36135e44051f171d0f055e5111140803181354430513171e5c53121c1e1c1f5e783317020b09261a19", 26));
            cls.getDeclaredMethod(q999ggg99999qqggqqg9qg("3b46", 28), Integer.TYPE, Object.class).invoke(cls, 46, new Object[]{num});
        } catch (Throwable unused) {
        }
        String str3 = qqggggg9g9q99q9gq[10];
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iIntValue);
        map.put(str3, sb2.toString());
        map.put(qqggggg9g9q99q9gq[11], cn.tongdun.android.readphone.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context) ? String.valueOf(q999ggg99999qqggqqg9qg(f19254q999ggg99999qqggqqg9qg[9], new qq9gg99gqqqgqgq999gqg(telephonyManager))) : "");
        return map;
    }

    private static Object q999ggg99999qqggqqg9qg(Object obj, Class cls, String str) {
        try {
            return cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Object q999ggg99999qqggqqg9qg(String str, InterfaceC0014q999ggg99999qqggqqg9qg interfaceC0014q999ggg99999qqggqqg9qg) {
        if (qgq9qg99.containsKey(str) && !TextUtils.isEmpty(str)) {
            return qgq9qg99.get(str);
        }
        Object objQ999ggg99999qqggqqg9qg = interfaceC0014q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
        if (objQ999ggg99999qqggqqg9qg != null) {
            qgq9qg99.put(str, objQ999ggg99999qqggqqg9qg);
        }
        return objQ999ggg99999qqggqqg9qg;
    }

    private static String q999ggg99999qqggqqg9qg(Object obj, Class cls, String str, Class[] clsArr, Object... objArr) {
        try {
            Object objInvoke = cls.getDeclaredMethod(str, clsArr).invoke(obj, objArr);
            if (objInvoke == null) {
                return q999ggg99999qqggqqg9qg("78", 19);
            }
            return objInvoke.toString().isEmpty() ? "" : objInvoke.toString();
        } catch (Throwable unused) {
            return q999ggg99999qqggqqg9qg("78", 11);
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
            byte b7 = (byte) (i7 ^ 4);
            byte b10 = (byte) (bArr[0] ^ 85);
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
            str = q999ggg99999qqggqqg9qg("78", 74);
        }
        if (str2 == null || "".equals(str2)) {
            str2 = q999ggg99999qqggqqg9qg("78", 78);
        }
        return G.r(u.s(str), q999ggg99999qqggqqg9qg("79", 68), str2);
    }

    public static Map q999ggg99999qqggqqg9qg(Context context, TelephonyManager telephonyManager) {
        char c6;
        String deviceSoftwareVersion;
        Map map = new HashMap();
        try {
            Class<?> cls = Class.forName(q999ggg99999qqggqqg9qg("3676783939727b77726f6b743f206b73736f627d7b6d2d004b73736f627d7b6d4e5675757c786d4d47", 126));
            map = q999ggg99999qqggqqg9qg(context, telephonyManager, cls.getConstructor(Context.class).newInstance(context), cls);
            c6 = map.size() > 0 ? (char) 1 : (char) 0;
        } catch (Exception unused) {
        }
        if (c6 == 0 && cn.tongdun.android.readphone.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(23) && ((Integer) q999ggg99999qqggqqg9qg(f19254q999ggg99999qqggqqg9qg[0], new cn.tongdun.android.readphone.q999ggg99999qqggqqg9qg.qgq9qg99(telephonyManager))).intValue() >= 2) {
            map = q999ggg99999qqggqqg9qg(context, telephonyManager, telephonyManager, telephonyManager.getClass());
            if (map.size() > 0) {
                c6 = 2;
            }
        }
        if (c6 == 0) {
            try {
                Class<?> cls2 = Class.forName(q999ggg99999qqggqqg9qg("3423263a312a2166763d252539342b2d3b7b4f321628151d252539342b2d3b180023232a2e3b", 40));
                Object systemService = context.getSystemService(q999ggg99999qqggqqg9qg("254a55535968604c4856", 86));
                if (systemService == null) {
                    systemService = q999ggg99999qqggqqg9qg(null, cls2, q999ggg99999qqggqqg9qg("326a7958496b6f7c7170", 108));
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
        if (cn.tongdun.android.readphone.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context)) {
            try {
                deviceSoftwareVersion = telephonyManager.getDeviceSoftwareVersion();
            } catch (Throwable unused3) {
                deviceSoftwareVersion = "";
            }
        } else {
            deviceSoftwareVersion = "";
        }
        map.put(qqggggg9g9q99q9gq[15], deviceSoftwareVersion);
        return map;
    }

    public static void q999ggg99999qqggqqg9qg() {
        qgq9qg99.clear();
    }

    private static Map q999ggg99999qqggqqg9qg(Context context, TelephonyManager telephonyManager, Object obj, Class cls) {
        String strQ999ggg99999qqggqqg9qg;
        String strQ999ggg99999qqggqqg9qg2;
        String strQ999ggg99999qqggqqg9qg3;
        HashMap map = new HashMap();
        if (q999ggg99999qqggqqg9qg("361b1554541f161a1f020619524d061e1e020f101600406d261e1e020f101600233b1818111500202a", 19).equals(cls.getName()) && cn.tongdun.android.readphone.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(23)) {
            telephonyManager.getClass();
        }
        qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(0, context);
        qgq9qg99 qgq9qg99VarQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg(1, context);
        int i7 = qgq9qg99VarQ999ggg99999qqggqqg9qg != null ? qgq9qg99VarQ999ggg99999qqggqqg9qg.f19255q999ggg99999qqggqqg9qg : 0;
        int i10 = qgq9qg99VarQ999ggg99999qqggqqg9qg2 != null ? qgq9qg99VarQ999ggg99999qqggqqg9qg2.f19255q999ggg99999qqggqqg9qg : 1;
        String str = qqggggg9g9q99q9gq[6];
        Class cls2 = Integer.TYPE;
        String strQ999ggg99999qqggqqg9qg4 = q999ggg99999qqggqqg9qg(obj, cls, str, new Class[]{cls2}, Integer.valueOf(i7));
        String str2 = "";
        if (q999ggg99999qqggqqg9qg("78", 26).equals(strQ999ggg99999qqggqqg9qg4) || "".equals(strQ999ggg99999qqggqqg9qg4)) {
            strQ999ggg99999qqggqqg9qg4 = (String) q999ggg99999qqggqqg9qg(f19254q999ggg99999qqggqqg9qg[4], new gqgqgq9qqqg999qggqqqg(telephonyManager));
        }
        map.put(qqggggg9g9q99q9gq[6], q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg4, q999ggg99999qqggqqg9qg(obj, cls, qqggggg9g9q99q9gq[6], new Class[]{cls2}, Integer.valueOf(i10))));
        q999ggg99999qqggqqg9qg("78", 91);
        if (qgq9qg99VarQ999ggg99999qqggqqg9qg != null) {
            strQ999ggg99999qqggqqg9qg = qgq9qg99VarQ999ggg99999qqggqqg9qg.qgq9qg99;
        } else {
            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(obj, cls, qqggggg9g9q99q9gq[7], new Class[]{cls2}, Integer.valueOf(i7));
        }
        if (q999ggg99999qqggqqg9qg("78", 100).equals(strQ999ggg99999qqggqqg9qg)) {
            strQ999ggg99999qqggqqg9qg = (String) q999ggg99999qqggqqg9qg(f19254q999ggg99999qqggqqg9qg[5], new gq9gggq9gq9gg9q99g9q(telephonyManager));
        }
        map.put(qqggggg9g9q99q9gq[7], q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg, qgq9qg99VarQ999ggg99999qqggqqg9qg2 != null ? qgq9qg99VarQ999ggg99999qqggqqg9qg2.qgq9qg99 : ""));
        q999ggg99999qqggqqg9qg("78", 83);
        if (qgq9qg99VarQ999ggg99999qqggqqg9qg != null) {
            strQ999ggg99999qqggqqg9qg2 = qgq9qg99VarQ999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq;
        } else {
            strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg(obj, cls, qqggggg9g9q99q9gq[8], new Class[]{cls2}, Integer.valueOf(i7));
        }
        if (q999ggg99999qqggqqg9qg("78", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP).equals(strQ999ggg99999qqggqqg9qg2)) {
            strQ999ggg99999qqggqqg9qg2 = (String) q999ggg99999qqggqqg9qg(f19254q999ggg99999qqggqqg9qg[6], new qqggggg9g9q99q9gq(telephonyManager));
        }
        map.put(qqggggg9g9q99q9gq[8], q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg2, qgq9qg99VarQ999ggg99999qqggqqg9qg2 != null ? qgq9qg99VarQ999ggg99999qqggqqg9qg2.qqggggg9g9q99q9gq : ""));
        String strQ999ggg99999qqggqqg9qg5 = q999ggg99999qqggqqg9qg(obj, cls, qqggggg9g9q99q9gq[9], new Class[]{cls2}, 0);
        if (q999ggg99999qqggqqg9qg("78", 32).equals(strQ999ggg99999qqggqqg9qg5)) {
            strQ999ggg99999qqggqqg9qg5 = (String) q999ggg99999qqggqqg9qg(f19254q999ggg99999qqggqqg9qg[7], new gqgg9q99qg9(telephonyManager));
        }
        map.put(qqggggg9g9q99q9gq[9], q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg5, q999ggg99999qqggqqg9qg(obj, cls, qqggggg9g9q99q9gq[9], new Class[]{cls2}, 1)));
        String strQ999ggg99999qqggqqg9qg6 = q999ggg99999qqggqqg9qg(obj, cls, qqggggg9g9q99q9gq[10], new Class[]{cls2}, Integer.valueOf(i7));
        if (q999ggg99999qqggqqg9qg("78", 82).equals(strQ999ggg99999qqggqqg9qg6)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(q999ggg99999qqggqqg9qg(f19254q999ggg99999qqggqqg9qg[8], new qgqq999g(telephonyManager)));
            strQ999ggg99999qqggqqg9qg6 = sb2.toString();
        }
        map.put(qqggggg9g9q99q9gq[10], q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg6, q999ggg99999qqggqqg9qg(obj, cls, qqggggg9g9q99q9gq[10], new Class[]{cls2}, Integer.valueOf(i10))));
        if (cn.tongdun.android.readphone.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context)) {
            String strQ999ggg99999qqggqqg9qg7 = q999ggg99999qqggqqg9qg(obj, cls, qqggggg9g9q99q9gq[11], new Class[]{cls2}, Integer.valueOf(i7));
            if (q999ggg99999qqggqqg9qg("78", 80).equals(strQ999ggg99999qqggqqg9qg7)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(q999ggg99999qqggqqg9qg(f19254q999ggg99999qqggqqg9qg[9], new qg9gqgqqggg9q9qg(telephonyManager)));
                strQ999ggg99999qqggqqg9qg7 = sb3.toString();
            }
            str2 = strQ999ggg99999qqggqqg9qg7;
            strQ999ggg99999qqggqqg9qg3 = q999ggg99999qqggqqg9qg(obj, cls, qqggggg9g9q99q9gq[11], new Class[]{cls2}, Integer.valueOf(i10));
        } else {
            strQ999ggg99999qqggqqg9qg3 = "";
        }
        map.put(qqggggg9g9q99q9gq[11], q999ggg99999qqggqqg9qg(str2, strQ999ggg99999qqggqqg9qg3));
        return map;
    }
}
