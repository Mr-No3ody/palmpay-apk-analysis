package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import cn.tongdun.android.shell.common.HelperJNI;
import com.adjust.sdk.Constants;
import com.google.mlkit.common.MlKitException;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class qgqq999g {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static final List f19110q999ggg99999qqggqqg9qg;
    private static final List qgq9qg99;

    static {
        q999ggg99999qqggqqg9qg("0e0d031c1d081010", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP);
        q999ggg99999qqggqqg9qg("096f666c7573686f", 23);
        f19110q999ggg99999qqggqqg9qg = Arrays.asList(214, 10, 11, 12, 13, 67, 27, 69, 79, 90, 86, 91, 101, 102, Integer.valueOf(MsgEvent.MSG_EVENT_STOP_FOREGROUND), Integer.valueOf(MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR), 49, 36, 80, 50, 39, 199, 26, 92);
        qgq9qg99 = Arrays.asList(126, 213, 121, 88, 72, 73, 70, 66, 145, 33, Integer.valueOf(MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD), 58, 123, 57, 25, 98, 87, 107, 128, 106, 132, 108, 64, 212, 47, 74, 127, 93, 22, 24, 220, 221);
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
            byte b7 = (byte) (i7 ^ 121);
            byte b10 = (byte) (bArr[0] ^ 109);
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

    /* JADX WARN: Code duplicated, block: B:24:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ed  */
    public static void q999ggg99999qqggqqg9qg(cn.tongdun.android.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, String str, List list) throws IllegalAccessException {
        List list2;
        Object obj;
        Object obj2;
        HashSet hashSet = new HashSet();
        boolean z3 = true;
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qg9qqq999gq == 1) {
            hashSet.addAll(f19110q999ggg99999qqggqqg9qg);
            list2 = qgq9qg99;
        } else {
            list2 = f19110q999ggg99999qqggqqg9qg;
        }
        hashSet.addAll(list2);
        HelperJNI.q999ggg99999qqggqqg9qg(35, new Object[]{str});
        boolean zEquals = q999ggg99999qqggqqg9qg("09252c263f392225", 93).equals(str);
        Field[] declaredFields = q999ggg99999qqggqqg9qgVar.getClass().getDeclaredFields();
        int length = declaredFields.length;
        Object obj3 = null;
        int i7 = 0;
        long jLongValue = 0;
        long jLongValue2 = 0;
        while (i7 < length) {
            Field field = declaredFields[i7];
            if (field.isAnnotationPresent(cn.tongdun.android.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.class)) {
                field.setAccessible(z3);
                cn.tongdun.android.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar2 = (cn.tongdun.android.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg) field.getAnnotation(cn.tongdun.android.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.class);
                int iQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qgVar2 != null ? q999ggg99999qqggqqg9qgVar2.q999ggg99999qqggqqg9qg() : 0;
                if (iQ999ggg99999qqggqqg9qg >= 0) {
                    cn.tongdun.android.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg.C0008q999ggg99999qqggqqg9qg c0008q999ggg99999qqggqqg9qg = (cn.tongdun.android.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg.C0008q999ggg99999qqggqqg9qg) field.get(q999ggg99999qqggqqg9qgVar);
                    if (c0008q999ggg99999qqggqqg9qg != null) {
                        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg.C0008q999ggg99999qqggqqg9qg c0008q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg.C0008q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(c0008q999ggg99999qqggqqg9qg);
                        if (iQ999ggg99999qqggqqg9qg == 51) {
                            Object obj4 = c0008q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.f19088q999ggg99999qqggqqg9qg;
                            if (obj4 instanceof Long) {
                                jLongValue2 = ((Long) obj4).longValue();
                                obj3 = c0008q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.f19088q999ggg99999qqggqqg9qg;
                            } else {
                                if (iQ999ggg99999qqggqqg9qg == 42) {
                                    obj2 = c0008q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.f19088q999ggg99999qqggqqg9qg;
                                    if (obj2 instanceof Long) {
                                        jLongValue = ((Long) obj2).longValue();
                                    }
                                }
                                obj = c0008q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.f19088q999ggg99999qqggqqg9qg;
                                if (obj == null && !"".equals(obj) && !q999ggg99999qqggqqg9qg("3662", 29).equals(c0008q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.f19088q999ggg99999qqggqqg9qg) && !q999ggg99999qqggqqg9qg("1674", 11).equals(c0008q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.f19088q999ggg99999qqggqqg9qg) && c0008q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.gqgg9q99qg9) {
                                    if (!zEquals) {
                                        HelperJNI.q999ggg99999qqggqqg9qg(36, new Object[]{Integer.valueOf(iQ999ggg99999qqggqqg9qg), c0008q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.f19088q999ggg99999qqggqqg9qg});
                                    } else if (!hashSet.contains(Integer.valueOf(iQ999ggg99999qqggqqg9qg))) {
                                        HelperJNI.q999ggg99999qqggqqg9qg(36, new Object[]{Integer.valueOf(iQ999ggg99999qqggqqg9qg), c0008q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.f19088q999ggg99999qqggqqg9qg});
                                    }
                                }
                            }
                        } else {
                            if (iQ999ggg99999qqggqqg9qg == 42) {
                                obj2 = c0008q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.f19088q999ggg99999qqggqqg9qg;
                                if (obj2 instanceof Long) {
                                    jLongValue = ((Long) obj2).longValue();
                                }
                            }
                            obj = c0008q999ggg99999qqggqqg9qgQ999ggg99999qqggqqg9qg.f19088q999ggg99999qqggqqg9qg;
                            if (obj == null) {
                            }
                        }
                    }
                }
            }
            i7++;
            z3 = true;
        }
        if (jLongValue != 0 && obj3 != null) {
            HelperJNI.q999ggg99999qqggqqg9qg(36, new Object[]{51, Long.valueOf(jLongValue2 ^ jLongValue)});
        }
        if (zEquals) {
            return;
        }
        String strGqgg9q99qg9 = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.gqgg9q99qg9();
        if (g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg(strGqgg9q99qg9) || q999ggg99999qqggqqg9qg("3655", 42).equals(strGqgg9q99qg9)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(q999ggg99999qqggqqg9qg("021314051f", 113), strGqgg9q99qg9);
        } catch (JSONException unused) {
        }
        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg.C0008q999ggg99999qqggqqg9qg c0008q999ggg99999qqggqqg9qg2 = new cn.tongdun.android.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg.C0008q999ggg99999qqggqqg9qg();
        c0008q999ggg99999qqggqqg9qg2.gqgg9q99qg9 = true;
        c0008q999ggg99999qqggqqg9qg2.qgq9qg99 = 2;
        c0008q999ggg99999qqggqqg9qg2.f19088q999ggg99999qqggqqg9qg = jSONObject.toString();
        HelperJNI.q999ggg99999qqggqqg9qg(36, new Object[]{199, c0008q999ggg99999qqggqqg9qg2.f19088q999ggg99999qqggqqg9qg});
    }
}
