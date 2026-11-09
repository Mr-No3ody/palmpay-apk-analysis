package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import cn.tongdun.android.qgq9qg99.qgq9qg99.g999q9gg;
import cn.tongdun.android.qgq9qg99.qgq9qg99.g9ggqqgggg9999q99qgqg9;
import cn.tongdun.android.qgq9qg99.qgq9qg99.gggggqq9g9qq9gqgq99;
import cn.tongdun.android.qgq9qg99.qgq9qg99.q9g9qqqq9;
import cn.tongdun.android.shell.common.HelperJNI;
import cn.tongdun.android.shell.inter.InvokeHandler;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qg9gqgqqggg9q9qg {
    private static String[] gqg99q9q9q;
    public static final String[] gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    public static final String[] f19106q999ggg99999qqggqqg9qg;
    private static boolean q9q999qgg99gq9qq9qqq9g;
    private static String[] qg9gqgqqggg9q9qg;
    private static final HashSet qggqgq99q999g = new HashSet();
    public static final String[] qgq9qg99;
    public static final String[] qgqq999g;
    public static final String[] qqggggg9g9q99q9gq;

    static {
        String[] strArr = {q999ggg99999qqggqqg9qg("6f7e6d4b507d7c777a6b617a7d5b5b7475", 117), q999ggg99999qqggqqg9qg("6f0a193824031b312f0001", 1), q999ggg99999qqggqqg9qg("6127190332321116323e33343c", 52), q999ggg99999qqggqqg9qg("6f273402253f28", 44)};
        f19106q999ggg99999qqggqqg9qg = strArr;
        String[] strArr2 = {q999ggg99999qqggqqg9qg("6f6a794c506f69634e44727372", 97), q999ggg99999qqggqqg9qg("6f04172120111716171d0d01113d2b", 15), q999ggg99999qqggqqg9qg("6f4a5978695b57424e6465", 65), q999ggg99999qqggqqg9qg("6f6172415a6569654b4f6b6641587b6c6474", 106), q999ggg99999qqggqqg9qg("6f26351e0f35273c393d0c083e3f3e222f141e38", 45), q999ggg99999qqggqqg9qg("6f02113a2b1103181d19243f151713151b1d3c2f0c08", 9), q999ggg99999qqggqqg9qg("6f7f6c47566c7e6560645942686a6e686660", 116), q999ggg99999qqggqqg9qg("6f5645736e50766b414347414f49687b585c", 93), q999ggg99999qqggqqg9qg("6f584b7e625d5b516b77534f", 83), q999ggg99999qqggqqg9qg("6f65765d4c76647f7a7e584a6e72", HomeDialogState.PRIORITY_HIGHEST), q999ggg99999qqggqqg9qg("6f62715746696040436c62757d6661", 105), q999ggg99999qqggqqg9qg("6f0f1c38200d222b040d282a0504", 4), q999ggg99999qqggqqg9qg("6f4a596f724c767e5f5340456a7350474f5f", 65)};
        qgq9qg99 = strArr2;
        qg9gqgqqggg9q9qg = new String[]{q999ggg99999qqggqqg9qg("6f425166675b404747497375525858", 73)};
        String[] strArr3 = {q999ggg99999qqggqqg9qg("6f6e7d594e7b71737f47477d6f7471754e4b6465", 101)};
        qqggggg9g9q99q9gq = strArr3;
        String[] strArr4 = {q999ggg99999qqggqqg9qg("6f495a6f7a4943414d49676c4342", 66), q999ggg99999qqggqqg9qg("6f45566376454f4d41456b604f4e7b7d494e487261405751", 78)};
        gqgg9q99qg9 = strArr4;
        String[] strArr5 = {q999ggg99999qqggqqg9qg("6b362039222d2c", 44), q999ggg99999qqggqqg9qg("4a25121b1a100b1017222e0e1a0f1a1c", 2)};
        qgqq999g = strArr5;
        gqg99q9q9q = new String[]{q999ggg99999qqggqqg9qg("654f4145797e4e414f58504b4c", 68), q999ggg99999qqggqqg9qg("69282b101726222e23242c", 36), q999ggg99999qqggqqg9qg("7b565751464d777b565d48495a5c4d5046", 79), q999ggg99999qqggqqg9qg("697e7b676c777c4a477c", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP), q999ggg99999qqggqqg9qg("6c0e0c081b1617243908110a0e243d071e130804", 6)};
        q999ggg99999qqggqqg9qg(strArr);
        q999ggg99999qqggqqg9qg(strArr2);
        q999ggg99999qqggqqg9qg(qg9gqgqqggg9q9qg);
        q999ggg99999qqggqqg9qg(strArr3);
        q999ggg99999qqggqqg9qg(strArr4);
        q999ggg99999qqggqqg9qg(strArr5);
        q999ggg99999qqggqqg9qg(gqg99q9q9q);
    }

    private static Object q999ggg99999qqggqqg9qg(String str) {
        Object objQ999ggg99999qqggqqg9qg;
        if (TextUtils.isEmpty(str) || (objQ999ggg99999qqggqqg9qg = HelperJNI.q999ggg99999qqggqqg9qg(49, new Object[]{str})) == null) {
            return null;
        }
        return objQ999ggg99999qqggqqg9qg;
    }

    public static Object qgq9qg99(String str, InvokeHandler invokeHandler) {
        return q999ggg99999qqggqqg9qg(gqgg9q99qg9, str, invokeHandler);
    }

    public static Object qqggggg9g9q99q9gq(String str, InvokeHandler invokeHandler) {
        return q999ggg99999qqggqqg9qg(qgqq999g, str, invokeHandler);
    }

    public static Object q999ggg99999qqggqqg9qg(String str, g9ggqqgggg9999q99qgqg9 g9ggqqgggg9999q99qgqg9Var) {
        return q999ggg99999qqggqqg9qg(qgq9qg99, str, g9ggqqgggg9999q99qgqg9Var);
    }

    public static Object q999ggg99999qqggqqg9qg(String str, q9g9qqqq9 q9g9qqqq9Var) {
        return q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gq, str, q9g9qqqq9Var);
    }

    public static Object q999ggg99999qqggqqg9qg(String str, InvokeHandler invokeHandler) {
        return q999ggg99999qqggqqg9qg(f19106q999ggg99999qqggqqg9qg, str, invokeHandler);
    }

    private static Object q999ggg99999qqggqqg9qg(String[] strArr, String str, InvokeHandler invokeHandler) {
        Object objQ999ggg99999qqggqqg9qg;
        if (!q999ggg99999qqggqqg9qg(strArr, str)) {
            return null;
        }
        Method[] methods = InvokeHandler.class.getMethods();
        if (methods.length <= 0 || TextUtils.isEmpty(str) || invokeHandler == null || (objQ999ggg99999qqggqqg9qg = HelperJNI.q999ggg99999qqggqqg9qg(43, new Object[]{str, invokeHandler, InvokeHandler.class, methods[0].getName()})) == null) {
            return null;
        }
        return objQ999ggg99999qqggqqg9qg;
    }

    public static String q999ggg99999qqggqqg9qg(Context context, String str, String str2) {
        String strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(context, str);
        return strQ999ggg99999qqggqqg9qg == null ? str2 : strQ999ggg99999qqggqqg9qg;
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
            byte b7 = (byte) (i7 ^ 9);
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

    public static void q999ggg99999qqggqqg9qg() {
        HelperJNI.q999ggg99999qqggqqg9qg(44, (Object) null);
        q9q999qgg99gq9qq9qqq9g = false;
        gggggqq9g9qq9gqgq99.qgq9qg99();
        List listQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
        if (listQ999ggg99999qqggqqg9qg != null) {
            Iterator it = listQ999ggg99999qqggqqg9qg.iterator();
            while (it.hasNext()) {
                ((cn.tongdun.android.qgq9qg99.qgqq999g.qg9gqgqqggg9q9qg) it.next()).q999ggg99999qqggqqg9qg();
            }
        }
        g999q9gg.q999ggg99999qqggqqg9qg();
    }

    private static void q999ggg99999qqggqqg9qg(String[] strArr) {
        for (String str : strArr) {
            qggqgq99q999g.add(str);
        }
    }

    private static boolean q999ggg99999qqggqqg9qg(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c3 A[EXC_TOP_SPLITTER, PHI: r6
      0x00c3: PHI (r6v3 android.database.Cursor) = (r6v2 android.database.Cursor), (r6v7 android.database.Cursor) binds: [B:38:0x00c8, B:34:0x00c1] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static synchronized String q999ggg99999qqggqqg9qg(Context context, String str) {
        Cursor cursorQuery;
        Object objQ999ggg99999qqggqqg9qg;
        if (q9q999qgg99gq9qq9qqq9g) {
            return (String) q999ggg99999qqggqqg9qg(str);
        }
        HashSet<Uri> hashSet = new HashSet();
        hashSet.add(Settings.Secure.CONTENT_URI);
        hashSet.add(Settings.System.CONTENT_URI);
        hashSet.add(Settings.Global.CONTENT_URI);
        HashSet hashSet2 = new HashSet();
        for (Uri uri : hashSet) {
            ContentResolver contentResolver = context.getContentResolver();
            int i7 = 0;
            while (true) {
                String[] strArr = gqg99q9q9q;
                if (i7 < strArr.length) {
                    try {
                        String str2 = strArr[i7];
                        if (!hashSet2.contains(str2)) {
                            cursorQuery = contentResolver.query(uri, new String[]{q999ggg99999qqggqqg9qg("66010206", 7), q999ggg99999qqggqqg9qg("7e213b2f26", 63)}, q999ggg99999qqggqqg9qg("666d6e6a277f7f7d", 107), new String[]{str2}, null);
                            if (cursorQuery != null) {
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        String string = cursorQuery.getString(cursorQuery.getColumnIndex(q999ggg99999qqggqqg9qg("66020105", 4)));
                                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex(q999ggg99999qqggqqg9qg("7e62786c65", 124)));
                                        if (!TextUtils.isEmpty(string2)) {
                                            hashSet2.add(string);
                                            if (!TextUtils.isEmpty(string) && string2 != null && (objQ999ggg99999qqggqqg9qg = HelperJNI.q999ggg99999qqggqqg9qg(48, new Object[]{string, string2})) != null) {
                                            }
                                        }
                                    } catch (Throwable unused) {
                                        if (cursorQuery != null) {
                                            try {
                                                cursorQuery.close();
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        }
                    } catch (Throwable unused3) {
                        cursorQuery = null;
                    }
                    i7++;
                }
            }
            q9q999qgg99gq9qq9qqq9g = true;
        }
        return (String) q999ggg99999qqggqqg9qg(str);
    }
}
