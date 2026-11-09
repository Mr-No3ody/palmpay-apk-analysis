package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.text.TextUtils;
import cn.tongdun.android.shell.common.HelperJNI;
import com.adjust.sdk.Constants;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p004a1.a;

/* JADX INFO: loaded from: classes.dex */
public final class gggggqq9g9qq9gqgq99 {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static final Map f19142q999ggg99999qqggqqg9qg = new HashMap();

    public static int gqg99q9q9q() {
        Integer num = (Integer) HelperJNI.q999ggg99999qqggqqg9qg(31, new Object[]{2333});
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static int gqgg9q99qg9() {
        int i7 = 0;
        try {
            HashSet<String> hashSet = new HashSet();
            Iterator it = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qq9gg99gqqqgqgq999gqg.q999ggg99999qqggqqg9qg().iterator();
            if (it == null) {
                return 0;
            }
            q999ggg99999qqggqqg9qg("6f4100", MsgEvent.MSG_EVENT_STOP_FOREGROUND);
            q999ggg99999qqggqqg9qg("6f0e4159", 49);
            q999ggg99999qqggqqg9qg("39392e2d273037212a3c3233", 74);
            q999ggg99999qqggqqg9qg("2d757b6a786f6c66714b4e63762a2d6c", 11);
            q999ggg99999qqggqqg9qg("22040a4b551a1c0f130a4d550e1f190f0e1b1d19", 115);
            q999ggg99999qqggqqg9qg("35524f4d4c4671754b41495d5f", 60);
            q999ggg99999qqggqqg9qg("61", 28);
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str) && (str.endsWith(q999ggg99999qqggqqg9qg("6f0c4d", 42)) || str.endsWith(q999ggg99999qqggqqg9qg("6f307f67", 15)))) {
                    hashSet.add(str.substring(str.lastIndexOf(q999ggg99999qqggqqg9qg("61", 33)) + 1));
                }
            }
            for (String str2 : hashSet) {
                String lowerCase = str2.toLowerCase();
                if (lowerCase.contains(q999ggg99999qqggqqg9qg("392e393a302720363d2b2524", 93)) || lowerCase.contains(q999ggg99999qqggqqg9qg("2d1c12031106050f1822270a1f434405", 98))) {
                    i7 |= 8;
                }
                if (str2.contains(q999ggg99999qqggqqg9qg("22505e1f014e485b475e19015a4b4d5b5a4f494d", 39))) {
                    i7 |= 2048;
                }
                if (str2.contains(q999ggg99999qqggqqg9qg("35160b09080235310f050d191b", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP))) {
                    i7 |= 32;
                }
            }
        } catch (Exception unused) {
        }
        return i7;
    }

    private static int q999ggg99999qqggqqg9qg(ClassLoader classLoader, String str) {
        String str2;
        if (classLoader == null || !(classLoader instanceof BaseDexClassLoader)) {
            return 0;
        }
        try {
            Class<?> cls = Class.forName(q999ggg99999qqggqqg9qg("2530382f2a3770683f3f32243d765f14281d04202911102f32", 78));
            Method method = Class.forName(q999ggg99999qqggqqg9qg("252f273035286f7720202d3b2269400b37021b3f360e0f302d7a4b032322222130", 81)).getMethod(q999ggg99999qqggqqg9qg("352f0813322f333d", 79), null);
            Field declaredField = cls.getDeclaredField(q999ggg99999qqggqqg9qg("254955756141404043524f", 51));
            declaredField.setAccessible(true);
            Field declaredField2 = BaseDexClassLoader.class.getDeclaredField(q999ggg99999qqggqqg9qg("3155515860615e43", 63));
            declaredField2.setAccessible(true);
            Object obj = declaredField.get(declaredField2.get(classLoader));
            return (Array.getLength(obj) <= 0 || (str2 = (String) method.invoke(Array.get(obj, 0), null)) == null || !str2.contains(str)) ? 0 : 1;
        } catch (Throwable unused) {
        }
    }

    public static String q9q999qgg99gq9qq9qqq9g() {
        StringBuilder sb2 = new StringBuilder();
        File file = new File(q999ggg99999qqggqqg9qg("6e2771717c6a733932727a617c27", 0));
        String strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("6f693321", 72);
        String[] list = file.list();
        if (list == null) {
            return sb2.toString();
        }
        for (String str : list) {
            if (str != null && str.endsWith(strQ999ggg99999qqggqqg9qg)) {
                if (sb2.length() > 0) {
                    sb2.append(q999ggg99999qqggqqg9qg("6d", 79));
                }
                sb2.append(str.substring(0, str.length() - 4));
            }
        }
        return (String) HelperJNI.q999ggg99999qqggqqg9qg(74, new Object[]{sb2.toString().getBytes(), Boolean.TRUE});
    }

    public static boolean qg9gqgqqggg9q9qg() {
        try {
            Class.forName(q999ggg99999qqggqqg9qg("2509435415051c504707021e150e05425e0017141e09427e2017141e092e3813050b0a", 115));
            return true;
        } catch (Throwable unused) {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    ArrayList arrayListQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(a.l(), true);
                    for (int i7 = 0; i7 < arrayListQ999ggg99999qqggqqg9qg.size(); i7++) {
                        try {
                            Class.forName(q999ggg99999qqggqqg9qg("2549031455455c100747425e554e45021e4057545e49023e6057545e496e7853454b4a", 51), false, a.k(arrayListQ999ggg99999qqggqqg9qg.get(i7)));
                            return true;
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable unused3) {
                }
            }
            return false;
        }
    }

    public static String qggqgq99q999g() {
        try {
            String[] strArrSplit = ((String) HelperJNI.q999ggg99999qqggqqg9qg(22, (Object) null)).split(q999ggg99999qqggqqg9qg("6d", 36));
            if (strArrSplit.length == 1) {
                return strArrSplit[0];
            }
            if (strArrSplit.length < 2) {
                return "";
            }
            if (strArrSplit[0].equals(strArrSplit[1])) {
                return strArrSplit[0];
            }
            return strArrSplit[0] + q999ggg99999qqggqqg9qg("6d", 52) + strArrSplit[1];
        } catch (Exception unused) {
            return "";
        }
    }

    public static int qgq9qg99(Context context) {
        q999ggg99999qqggqqg9qg("2552180f4e5e470b1c5c59454e555e19055b4c4f45521914544e54465e535a44", 40);
        q999ggg99999qqggqqg9qg("226a64253b7472617d64233b6071776160757377", 29);
        PackageManager packageManager = context.getPackageManager();
        int i7 = 0;
        try {
            cn.tongdun.android.qgq9qg99.qgqq999g.gqgg9q99qg9 gqgg9q99qg9Var = (cn.tongdun.android.qgq9qg99.qgqq999g.gqgg9q99qg9) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("225c110b4a505852404a111e5e5b474c575c1b0f4053595b575358544b56560c180f5119190f51471951194747190f4719197f5e4d", 42));
            if (gqgg9q99qg9Var != null) {
                PackageInfo packageInfoQ999ggg99999qqggqqg9qg = gqgg9q99qg9Var.q999ggg99999qqggqqg9qg(packageManager, q999ggg99999qqggqqg9qg("25672d3a7b6b723e29696c707b606b2c306e797a70672c21617b61736b666f71", 29));
                if (packageInfoQ999ggg99999qqggqqg9qg != null && q999ggg99999qqggqqg9qg("25400a1d5c4c55190e4e4b575c474c0b17495e5d57400b06465c46544c414856", 58).equals(packageInfoQ999ggg99999qqggqqg9qg.packageName)) {
                    i7 = 1;
                }
                PackageInfo packageInfoQ999ggg99999qqggqqg9qg2 = gqgg9q99qg9Var.q999ggg99999qqggqqg9qg(packageManager, q999ggg99999qqggqqg9qg("22414f0e105f594a564f08104b5a5c4a4b5e585c", 54));
                if (packageInfoQ999ggg99999qqggqqg9qg2 != null && q999ggg99999qqggqqg9qg("226b65243a7573607c65223a6170766061747276", 28).equals(packageInfoQ999ggg99999qqggqqg9qg2.packageName)) {
                    return i7 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                }
            }
        } catch (Throwable unused) {
        }
        return i7;
    }

    public static int qgqq999g() {
        String strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("197f484b415671674c5a54551c135c44", 44);
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        return (q999ggg99999qqggqqg9qg(systemClassLoader, strQ999ggg99999qqggqqg9qg) == 1 || q999ggg99999qqggqqg9qg(systemClassLoader.getParent(), strQ999ggg99999qqggqqg9qg) == 1) ? 1 : 0;
    }

    public static int qqggggg9g9q99q9gq() {
        try {
            throw new Exception(q999ggg99999qqggqqg9qg("251d0d0d1a0b48541b1c18", MsgEvent.MSG_EVENT_STOP_FOREGROUND));
        } catch (Exception e10) {
            int i7 = 0;
            int i10 = 0;
            for (StackTraceElement stackTraceElement : e10.getStackTrace()) {
                if (q999ggg99999qqggqqg9qg("2558120544544d011656534f445f54130f5146454f58132f7146454f587f6942545a5b", 34).equals(stackTraceElement.getClassName()) && q999ggg99999qqggqqg9qg("2c07030c", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR).equals(stackTraceElement.getMethodName())) {
                    i7 |= 2;
                }
                if (q999ggg99999qqggqqg9qg("25367c6b2a3a236f78383d212a313a7d613f282b21367d411f282b213611072c3a3435", 76).equals(stackTraceElement.getClassName()) && q999ggg99999qqggqqg9qg("293e383d3f3e1a10373339361e1f262b303c", 76).equals(stackTraceElement.getMethodName())) {
                    i7 |= 4;
                }
                if (q999ggg99999qqggqqg9qg("22747a3b3777726e657e75323f7f62696f6477753a3964250c5b66706369545f7f65", 3).equals(stackTraceElement.getClassName()) && (i10 = i10 + 1) == 2) {
                    i7 |= 512;
                }
                if (q999ggg99999qqggqqg9qg("22252b6a743b3d2e322b6c742f3e382e2f3a3c38624a375e3f", 82).equals(stackTraceElement.getClassName()) && q999ggg99999qqggqqg9qg("284f50514c4649", 51).equals(stackTraceElement.getMethodName())) {
                    i7 |= 1024;
                }
            }
            return i7;
        }
    }

    public static String q999ggg99999qqggqqg9qg() {
        return "";
    }

    public static void qgq9qg99() {
        f19142q999ggg99999qqggqqg9qg.clear();
    }

    public static String qqggggg9g9q99q9gq(Context context) {
        try {
            String packageName = context.getPackageName();
            return packageName + q999ggg99999qqggqqg9qg("6b0b", 124) + ((PackageInfo) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qgq9qg99(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.gqgg9q99qg9[0], new g9qg9q9ggq99g99qgq(context, packageName))).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String q999ggg99999qqggqqg9qg(Context context) {
        SigningInfo signingInfo;
        Signature[] apkContentsSigners;
        String packageName = context.getPackageName();
        try {
            Signature[] signatureArr = ((PackageInfo) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qgq9qg99(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.gqgg9q99qg9[1], new qgqgqq9gq9q9qqgggq9g99(context, packageName))).signatures;
            if (Build.VERSION.SDK_INT >= 28 && (signingInfo = context.getPackageManager().getPackageInfo(packageName, 134217728).signingInfo) != null && (apkContentsSigners = signingInfo.getApkContentsSigners()) != null) {
                String str = (String) HelperJNI.q999ggg99999qqggqqg9qg(73, new Object[]{apkContentsSigners[0].toByteArray()});
                if (!TextUtils.isEmpty(str)) {
                    HelperJNI.q999ggg99999qqggqqg9qg(72, new Object[]{str});
                }
            }
            return (String) HelperJNI.q999ggg99999qqggqqg9qg(73, new Object[]{signatureArr[0].toByteArray()});
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
            byte b7 = (byte) (i7 ^ 123);
            byte b10 = (byte) (bArr[0] ^ 65);
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

    private static synchronized ArrayList q999ggg99999qqggqqg9qg(Class cls, boolean z3) {
        ArrayList arrayList;
        arrayList = null;
        try {
            Object[][] objArr = (Object[][]) Class.forName(q999ggg99999qqggqqg9qg("254e465154490e1641414c5a43083350426a4c5c59", 48)).getDeclaredMethod(q999ggg99999qqggqqg9qg("262b38140e342e3c26242f3f15000c06243b293f3f", 82), Class[].class, Boolean.TYPE).invoke(null, new Class[]{cls}, Boolean.TRUE);
            if (objArr != null) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    for (Object[] objArr2 : objArr) {
                        arrayList2.addAll(Arrays.asList(objArr2));
                    }
                } catch (Throwable unused) {
                }
                arrayList = arrayList2;
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }

    public static Map q999ggg99999qqggqqg9qg(Context context, String str) {
        if (!q999ggg99999qqggqqg9qg("204d40", 59).equals(str)) {
            return f19142q999ggg99999qqggqqg9qg;
        }
        Map map = f19142q999ggg99999qqggqqg9qg;
        if (map.containsKey(str) || !cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("204f4a565d464d0a1e55575f445a405a46410027475a51575c4b51", 59))) {
            return map;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                arrayList.add(((NetworkInterface) it.next()).getName());
            }
            String string = arrayList.toString();
            f19142q999ggg99999qqggqqg9qg.put(q999ggg99999qqggqqg9qg("201518", 99), string.substring(1, string.length() - 1));
        } catch (SocketException unused) {
        }
        return f19142q999ggg99999qqggqqg9qg;
    }
}
