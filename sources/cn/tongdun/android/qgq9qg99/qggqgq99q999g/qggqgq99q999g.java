package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import cn.tongdun.android.shell.common.HelperJNI;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class qggqgq99q999g {
    private static final qggqgq99q999g qgq9qg99 = new qggqgq99q999g();

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private Context f19107q999ggg99999qqggqqg9qg;

    private qggqgq99q999g() {
    }

    private static String gqgg9q99qg9() {
        String str = new String(qq9gg99gqqqgqgq999gqg.qgq9qg99(q999ggg99999qqggqqg9qg("4c08554a5b1b0b415e5d1e1b53424a4d52", 14)));
        if (str.length() == 0) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(q999ggg99999qqggqqg9qg("163021", 117));
        int iLastIndexOf2 = str.lastIndexOf(q999ggg99999qqggqqg9qg("4c480e1a", 78));
        if (iLastIndexOf < 0) {
            return null;
        }
        if (iLastIndexOf2 <= 0) {
            iLastIndexOf2 = str.length();
        }
        try {
            String strReplaceAll = str.substring(iLastIndexOf + 4, iLastIndexOf2).replaceAll(q999ggg99999qqggqqg9qg("69", 23), "");
            if (strReplaceAll != null && strReplaceAll.length() != 0) {
                for (int i7 = 0; i7 < strReplaceAll.length(); i7++) {
                    if (Character.isDigit(strReplaceAll.charAt(i7))) {
                    }
                }
                return String.format(Locale.US, q999ggg99999qqggqqg9qg("16745e0f7570", 104), Integer.valueOf(Integer.valueOf(strReplaceAll).intValue() - 10000));
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static qggqgq99q999g q999ggg99999qqggqqg9qg() {
        return qgq9qg99;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00fe A[Catch: Exception -> 0x010d, TRY_LEAVE, TryCatch #1 {Exception -> 0x010d, blocks: (B:40:0x00b8, B:42:0x00ca, B:44:0x00db, B:46:0x00ed, B:48:0x00fe), top: B:58:0x00b8 }] */
    private static JSONObject qgq9qg99() {
        Class<?> cls;
        Method declaredMethod;
        Object obj;
        Object objInvoke;
        Object objInvoke2;
        Class<?> cls2 = null;
        try {
            cls = Class.forName(q999ggg99999qqggqqg9qg("0243465a514a4106174d51490e31764b4547455d574d", 21));
            try {
                declaredMethod = cls.getDeclaredMethod(q999ggg99999qqggqqg9qg("04091a", 82), new Class[0]);
            } catch (Throwable unused) {
                declaredMethod = null;
            }
        } catch (Throwable unused2) {
            cls = null;
        }
        if (cls == null || declaredMethod == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Class<?> cls3 = Class.forName(q999ggg99999qqggqqg9qg("02080d111a010a4d481607596825101a18181a0a332b0808010510", 94));
                Field declaredField = cls3.getDeclaredField(q999ggg99999qqggqqg9qg("2a260c3933313133231a022121282c390f14292725273f352f", 119));
                declaredField.setAccessible(true);
                obj = declaredField.get(cls3);
            } catch (Throwable th) {
                th.printStackTrace();
                obj = null;
            }
        } else {
            try {
                Class<?> cls4 = Class.forName(q999ggg99999qqggqqg9qg("0226233f342f246366382977460b3e34363634241d0526262f2b3e15063c34363a", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR));
                Field declaredField2 = cls4.getDeclaredField(q999ggg99999qqggqqg9qg("0400022024373a3b", 122));
                declaredField2.setAccessible(true);
                obj = declaredField2.get(cls4);
            } catch (Exception unused3) {
                obj = null;
            }
        }
        if (obj == null) {
            return null;
        }
        try {
            objInvoke = declaredMethod.invoke(obj, new Object[0]);
        } catch (Exception unused4) {
            objInvoke = null;
        }
        Class<?> cls5 = objInvoke != null ? objInvoke.getClass() : null;
        if (cls5 != null) {
            try {
                objInvoke2 = cls5.getDeclaredMethod(q999ggg99999qqggqqg9qg("027f5c466a676c7a", 52), new Class[0]).invoke(objInvoke, new Object[0]);
            } catch (Throwable unused5) {
                objInvoke2 = null;
            }
        } else {
            objInvoke2 = null;
        }
        Class<?> cls6 = objInvoke2 != null ? objInvoke2.getClass() : null;
        if (objInvoke instanceof Proxy) {
            try {
                cls2 = Proxy.getInvocationHandler(objInvoke).getClass();
            } catch (Throwable unused6) {
            }
        }
        JSONObject jSONObject = new JSONObject();
        if (cls5 != null) {
            try {
                if (!q999ggg99999qqggqqg9qg("0260657972696225207e6f3108674d7872707072625b436060696d783918486e78291b4d72786e", 54).equals(cls5.getName())) {
                    jSONObject.put(q999ggg99999qqggqqg9qg("10031e101210080218", 64), cls5.getName());
                }
                if (cls6 != null && !q999ggg99999qqggqqg9qg("027a7f636873783f346928195e727f74625757686274", 44).equals(cls6.getName())) {
                    jSONObject.put(q999ggg99999qqggqqg9qg("012925282335", 123), cls6.getName());
                }
                if (cls2 != null) {
                    jSONObject.put(q999ggg99999qqggqqg9qg("0b72747173726c", 34), cls2.getName());
                }
            } catch (Exception unused7) {
            }
        } else {
            if (cls6 != null) {
                jSONObject.put(q999ggg99999qqggqqg9qg("012925282335", 123), cls6.getName());
            }
            if (cls2 != null) {
                jSONObject.put(q999ggg99999qqggqqg9qg("0b72747173726c", 34), cls2.getName());
            }
        }
        return jSONObject;
    }

    private static JSONObject qqggggg9g9q99q9gq() {
        String[] strArrSplit;
        JSONObject jSONObject = new JSONObject();
        String strGqgg9q99qg9 = gqgg9q99qg9();
        if (strGqgg9q99qg9 != null && strGqgg9q99qg9.length() != 0) {
            String str = (String) HelperJNI.q999ggg99999qqggqqg9qg(34, new Object[]{0});
            if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(q999ggg99999qqggqqg9qg("69", 0))) != null && strArrSplit.length > 0) {
                int i7 = 0;
                for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                    if (strArrSplit[i10].contains(strGqgg9q99qg9)) {
                        int iLastIndexOf = strArrSplit[i10].lastIndexOf(q999ggg99999qqggqqg9qg("43", 93));
                        String str2 = strArrSplit[i10];
                        File file = new File(String.format(Locale.US, q999ggg99999qqggqqg9qg("4c0f4151510a0f4151510a4e12", 29), str2.substring(iLastIndexOf <= 0 ? 0 : iLastIndexOf + 1, str2.length())));
                        if (file.exists()) {
                            try {
                                jSONObject.put(q999ggg99999qqggqqg9qg("053c362b2224", 106), strGqgg9q99qg9);
                                jSONObject.put(q999ggg99999qqggqqg9qg("007a7c77794f4d7c35", 40) + i10, file.getAbsolutePath());
                                jSONObject.put(q999ggg99999qqggqqg9qg("0043454e407674450c", 17) + i10 + q999ggg99999qqggqqg9qg("43145d5f531d", 1), strArrSplit[i10]);
                            } catch (JSONException e10) {
                                e10.printStackTrace();
                            }
                            i7++;
                        }
                    }
                }
                if (i7 > 1) {
                    return jSONObject;
                }
            }
        }
        return null;
    }

    public final String q999ggg99999qqggqqg9qg(Context context) {
        this.f19107q999ggg99999qqggqqg9qg = context.getApplicationContext();
        try {
            JSONObject jSONObjectQqggggg9g9q99q9gq = qqggggg9g9q99q9gq();
            String str = (String) HelperJNI.q999ggg99999qqggqqg9qg(25, new Object[]{1});
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObjectQgq9qg99 = qgq9qg99();
            JSONObject jSONObjectQ999ggg99999qqggqqg9qg = Build.VERSION.SDK_INT >= 26 ? q999ggg99999qqggqqg9qg(this.f19107q999ggg99999qqggqqg9qg.getApplicationInfo().dataDir) : null;
            jSONObject.put(q999ggg99999qqggqqg9qg("001e18131d3a240f313f1d4e", 76), str);
            if (jSONObjectQqggggg9g9q99q9gq == null && str == null && jSONObjectQgq9qg99 == null && jSONObjectQ999ggg99999qqggqqg9qg == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            if (jSONObjectQqggggg9g9q99q9gq != null && jSONObjectQqggggg9g9q99q9gq.length() != 0) {
                jSONArray.put(jSONObjectQqggggg9g9q99q9gq);
            }
            if (str != null && str.length() != 0) {
                jSONArray.put(jSONObject);
            }
            if (jSONObjectQgq9qg99 != null && jSONObjectQgq9qg99.length() != 0) {
                jSONArray.put(jSONObjectQgq9qg99);
            }
            if (jSONObjectQ999ggg99999qqggqqg9qg != null && jSONObjectQ999ggg99999qqggqqg9qg.length() != 0) {
                jSONArray.put(jSONObjectQ999ggg99999qqggqqg9qg);
            }
            if (jSONArray.length() == 0) {
                return null;
            }
            return jSONArray.toString();
        } catch (Exception unused) {
            return null;
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
            byte b7 = (byte) (i7 ^ 89);
            byte b10 = (byte) (bArr[0] ^ 99);
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

    /* JADX WARN: Code duplicated, block: B:51:0x0178 A[Catch: Exception -> 0x0186, TryCatch #5 {Exception -> 0x0186, blocks: (B:48:0x016f, B:49:0x0172, B:51:0x0178, B:53:0x0183), top: B:62:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0183 A[Catch: Exception -> 0x0186, TRY_LEAVE, TryCatch #5 {Exception -> 0x0186, blocks: (B:48:0x016f, B:49:0x0172, B:51:0x0178, B:53:0x0183), top: B:62:0x016f }] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d5, code lost:
    
        if (r1 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00d7, code lost:
    
        r1 = r1;
        r1 = r1;
        r9.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00da, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011e, code lost:
    
        if (r1 != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.RequiresApi(api = 26)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.json.JSONObject q999ggg99999qqggqqg9qg(java.lang.String r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.tongdun.android.qgq9qg99.qggqgq99q999g.qggqgq99q999g.q999ggg99999qqggqqg9qg(java.lang.String):org.json.JSONObject");
    }
}
