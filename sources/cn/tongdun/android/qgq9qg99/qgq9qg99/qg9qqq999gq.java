package cn.tongdun.android.qgq9qg99.qgq9qg99;

import C0.G;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.Instrumentation;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaDrm;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.IBinder;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.video.u;
import cn.tongdun.android.shell.common.HelperJNI;
import com.adjust.sdk.Constants;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.horcrux.svg.d0;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class qg9qqq999gq {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static int f19187q999ggg99999qqggqqg9qg;
    private static final String[] qgq9qg99;
    private static final String[] qqggggg9g9q99q9gq;

    static {
        q999ggg99999qqggqqg9qg("23333e", 21);
        q999ggg99999qqggqqg9qg("233c39252e353e79743429223829697c31242e3532735f302633222438352f383a3c3a3132", 24);
        q999ggg99999qqggqqg9qg("7322", 8);
        q999ggg99999qqggqqg9qg("32040444", 47);
        q999ggg99999qqggqqg9qg("7061", 73);
        q999ggg99999qqggqqg9qg("737f", 80);
        q999ggg99999qqggqqg9qg("235a5f434853581f17565957404853541532507659574048535476795a5a5357420322725442132177484254", 126);
        q999ggg99999qqggqqg9qg("70", 94);
        q999ggg99999qqggqqg9qg("36312b", 27);
        q999ggg99999qqggqqg9qg("323d3d7d520f312f25", 22);
        q999ggg99999qqggqqg9qg("6f3c", 11);
        q999ggg99999qqggqqg9qg("2a48525e434056", 106);
        q999ggg99999qqggqqg9qg("73", 113);
        q999ggg99999qqggqqg9qg("7366", 72);
        q999ggg99999qqggqqg9qg("360a103a39071913", 32);
        q999ggg99999qqggqqg9qg("252431321f052a", 24);
        q999ggg99999qqggqqg9qg("7333", 26);
        q999ggg99999qqggqqg9qg("237c79656e757e393e7f7269627869292d6e30146a42717b7975715b5f7c7c75716425045472643507516e6472", 88);
        q999ggg99999qqggqqg9qg("72", 66);
        q999ggg99999qqggqqg9qg("1c20", 11);
        f19187q999ggg99999qqggqqg9qg = 0;
        qgq9qg99 = new String[]{q999ggg99999qqggqqg9qg("21010f4e4103185a470216110018", 38), q999ggg99999qqggqqg9qg("2127296869252c60753a3838262b2222", 0), q999ggg99999qqggqqg9qg("214e4001095f59444b42474a4d4f44090853564f4f4a4f", 105), q999ggg99999qqggqqg9qg("2b266178376f6b3d283f3c3621", 11), q999ggg99999qqggqqg9qg("21474908094840561c1354504d4a5f46", 96), q999ggg99999qqggqqg9qg("212826677b3c252324656728222a2e", 15), q999ggg99999qqggqqg9qg("2b65223b7c786562776e6e7263", 72), q999ggg99999qqggqqg9qg("21707e3f367d777b60273f64656461", 87), q999ggg99999qqggqqg9qg("3a697e7d7760", 74), q999ggg99999qqggqqg9qg("21030d4c4000051912090245470a0d0307181c", 36)};
        qqggggg9g9q99q9gq = new String[]{q999ggg99999qqggqqg9qg("6d5a0c0c01170e4445030d4b45030d073a340a0b06050a3a3d070111143e28120e1e5d5b1a", 45), q999ggg99999qqggqqg9qg("6d114747111359455567664b5e4f4b", 102), q999ggg99999qqggqqg9qg("6d693f3f32243d77783e32746b213d2d6d6837282a36", 30), q999ggg99999qqggqqg9qg("6d115b490306465652544b01044e52424b", 113), q999ggg99999qqggqqg9qg("6d4b0113595e1408182a2f191915", 43), q999ggg99999qqggqqg9qg("6d4f05175d5818080c0a155f4c060f1319", 47), q999ggg99999qqggqqg9qg("6d43091b5154140400061953450b1a1e0f0b070233300a031f15", 35), q999ggg99999qqggqqg9qg("6d6b3d3d6b7c3624283d31216b6b3d3d30263f757b24326d7b243272287b243224232023696b27353a32303e0f0b21301a0e232023", 28), q999ggg99999qqggqqg9qg("6d6e383835233a707f3935737c3d38242f0b29526f302f2d", 25), q999ggg99999qqggqqg9qg("6d7a2c2c21372e646b2d216764222c373b3f393d207f7b243b39", 13), q999ggg99999qqggqqg9qg("6d5701010c1a0349480e0046480e000d1d160d065b475d5617", 32), q999ggg99999qqggqqg9qg("6d035555584e571d1254581e07415855494249435e", 116), q999ggg99999qqggqqg9qg("6d7f292924322b616e282462612729323e3a3c382533", 8), q999ggg99999qqggqqg9qg("6d5600000d1b024847010d4b4b0b1d5f57081715", 33), q999ggg99999qqggqqg9qg("6d7e282825332a606f29256379220039427f203f3d", 9), q999ggg99999qqggqqg9qg("6d1a4c4c41574e040b4d41070d505b404b160a131b445b59", 109), q999ggg99999qqggqqg9qg("6d034d5d5d0649044651585e4f5d4a405015164a5557", 99), q999ggg99999qqggqqg9qg("6d743a2a2a717c3c333d327c642622606428737d3d32343a363b393d3425", 20), q999ggg99999qqggqqg9qg("6d7e352520313469236a7622", 9), q999ggg99999qqggqqg9qg("6d440f1f1a0b0e5319504c180567201f1913343f101159504c18", 51), q999ggg99999qqggqqg9qg("6d0f445451404518521b07534e0b5c5b4a59", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP), q999ggg99999qqggqqg9qg("6d5b11034949041d071d160607", 59), q999ggg99999qqggqqg9qg("6d43091b51511c051f171a181e0f", 35), q999ggg99999qqggqqg9qg("6d7b2d2d20362f656a2c20666f252c303c2435312024282d", 12)};
    }

    public static String g99gq9qg9gggq9qgg() {
        String strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("190a", 39);
        cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q gqg99q9q9qVar = (cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("21521f05445e565c4e441f10505549425952150249544243420316015f1717015f49175f1749491701491717715342", 116));
        return gqg99q9q9qVar != null ? gqg99q9q9qVar.qgq9qg99() : strQ999ggg99999qqggqqg9qg;
    }

    public static Integer g99q9ggqg9gqgq9(Context context) {
        return Integer.valueOf(Integer.parseInt(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("232f2c171021252924232b", 1), q999ggg99999qqggqqg9qg("72", 124))));
    }

    public static String g9g9ggqqggqq99gqq9q99() {
        return String.format(Locale.US, q999ggg99999qqggqqg9qg("672c40012c40012c40012c", 70), Long.valueOf(TrafficStats.getMobileRxBytes()), Long.valueOf(TrafficStats.getMobileTxBytes()), Long.valueOf(TrafficStats.getTotalTxBytes()), Long.valueOf(TrafficStats.getTotalRxBytes()));
    }

    public static String g9g9q9qq9() {
        return Locale.getDefault().getCountry();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034 A[PHI: r2
      0x0034: PHI (r2v4 java.lang.StringBuilder) = (r2v3 java.lang.StringBuilder), (r2v7 java.lang.StringBuilder) binds: [B:16:0x004a, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static String g9qqg99qqg() {
        StringBuilder sbS;
        StringBuilder sb2;
        int i7;
        Object objValueOf;
        String string = "";
        int i10 = 0;
        while (true) {
            String[] strArr = qqggggg9g9q99q9gq;
            if (i10 >= strArr.length) {
                return string;
            }
            if (new File(strArr[i10]).exists()) {
                if (i10 != 7) {
                    sbS = u.s(string);
                    if (string.length() > 0) {
                        sb2 = new StringBuilder();
                        i7 = 33;
                        objValueOf = d0.n(i10, q999ggg99999qqggqqg9qg("6e", i7), sb2);
                    } else {
                        objValueOf = Integer.valueOf(i10);
                    }
                    sbS.append(objValueOf);
                    string = sbS.toString();
                }
            } else if (i10 == 7) {
                sbS = u.s(string);
                if (string.length() > 0) {
                    sb2 = new StringBuilder();
                    i7 = 19;
                    objValueOf = d0.n(i10, q999ggg99999qqggqqg9qg("6e", i7), sb2);
                } else {
                    objValueOf = Integer.valueOf(i10);
                }
                sbS.append(objValueOf);
                string = sbS.toString();
            }
            i10++;
        }
    }

    public static Object ggg9gqqgq99q9g9gq9g9(Context context) {
        cn.tongdun.android.qgq9qg99.qggqgq99q999g.qq9gg9q qq9gg9qVarQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qq9gg9q.q999ggg99999qqggqqg9qg();
        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.gqgg9q99qg9 gqgg9q99qg9VarQgq9qg99 = qq9gg9qVarQ999ggg99999qqggqqg9qg.qgq9qg99(context);
        if (gqgg9q99qg9VarQgq9qg99 != null) {
            HelperJNI.q999ggg99999qqggqqg9qg(63, new Object[]{gqgg9q99qg9VarQgq9qg99.q999ggg99999qqggqqg9qg(), gqgg9q99qg9VarQgq9qg99.qgq9qg99(), gqgg9q99qg9VarQgq9qg99.qqggggg9g9q99q9gq()});
        }
        return qq9gg9qVarQ999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context);
    }

    public static boolean ggq999qqgqgq9g9qqq(Context context) {
        return Integer.parseInt(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("2f5856526e695956584f475c5b", 113), q999ggg99999qqggqqg9qg("72", 123))) != 0;
    }

    public static String gq9g999g999(Context context) {
        return qgqq999g.q999ggg99999qqggqqg9qg(context);
    }

    public static String gq9gggq9gq9gg9q99g9q() {
        String str = (String) HelperJNI.q999ggg99999qqggqqg9qg(5, new Object[]{1});
        return str == null ? "" : str;
    }

    public static String gq9qqgq9q9() {
        return cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgq9qg99;
    }

    public static String gqg99q9q9q() {
        try {
            JSONObject jSONObject = new JSONObject();
            String[] strArr = {q999ggg99999qqggqqg9qg("31277a7333362a213a31", 23), q999ggg99999qqggqqg9qg("312c7170333f3b", 28), q999ggg99999qqggqqg9qg("31431e014657575c545a", 115)};
            String[] strArr2 = {q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_P2P_CASH_OUT, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP), q999ggg99999qqggqqg9qg("20", HomeDialogState.PRIORITY_HIGHEST_111), q999ggg99999qqggqqg9qg(TransType.TRANS_TYPE_REPAY_AIRTIME_LOAN, 43)};
            for (int i7 = 0; i7 < 3; i7++) {
                Object objQ999ggg99999qqggqqg9qg = HelperJNI.q999ggg99999qqggqqg9qg(52, new Object[]{strArr[i7]});
                if (objQ999ggg99999qqggqqg9qg != null) {
                    String str = (String) objQ999ggg99999qqggqqg9qg;
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put(strArr2[i7], str);
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception e10) {
            return e10.getMessage();
        }
    }

    public static int gqgg9q99qg9() {
        return ggg9gqqgq99q9g9gq9g9() ? 1 : 0;
    }

    public static int gqgqgq9qqqg999qggqqqg(Context context) {
        return context.getResources().getConfiguration().keyboard;
    }

    private static String gqq9gqqqq9qgqg9() {
        int i7 = 0;
        try {
            File[] fileArrListFiles = new File(q999ggg99999qqggqqg9qg("6d3d6b6b3d2a60727e6b67773d3d6b6b667069232d72643b", 74)).listFiles();
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i10 = 0;
                while (i7 < length) {
                    try {
                        if (fileArrListFiles[i7].getName().matches(q999ggg99999qqggqqg9qg("1c745a4c6722545d2d3f46", 98))) {
                            i10++;
                        }
                        i7++;
                    } catch (Throwable unused) {
                    }
                }
                i7 = i10;
            }
        } catch (Throwable unused2) {
        }
        return i7 == 0 ? "" : String.valueOf(i7);
    }

    private static JSONObject gqqgggqgg99qg9(Context context) {
        Object obj;
        try {
            Field declaredField = Class.forName(q999ggg99999qqggqqg9qg("235a5f434853581f175659574048535415377659574048535476795a5a535742", 126)).getDeclaredField(q999ggg99999qqggqqg9qg("2f0e0627342f3a36", 27));
            declaredField.setAccessible(true);
            obj = declaredField.get(context.getSystemService(q999ggg99999qqggqqg9qg("2e5956584f475c5b", 113)));
        } catch (Throwable unused) {
            obj = null;
        }
        Class<?> cls = obj != null ? obj.getClass() : null;
        Class<?> cls2 = obj instanceof Proxy ? Proxy.getInvocationHandler(obj).getClass() : null;
        try {
            JSONObject jSONObject = new JSONObject();
            if (cls != null && !q999ggg99999qqggqqg9qg("234f4a565d464d0a02434c42555d4641002745634c42555d4641636c4f4f46425716376741570634625d5741", 107).equals(cls.getName())) {
                jSONObject.put(q999ggg99999qqggqqg9qg("31606172697c70", 93), cls.getName());
            }
            if (cls2 != null) {
                jSONObject.put(q999ggg99999qqggqqg9qg("2a31373230312f", 19), cls2.getName());
            }
            if (jSONObject.length() <= 0) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(q999ggg99999qqggqqg9qg("2e60", 84), jSONObject);
            return jSONObject2;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static String q999ggg99999qqggqqg9qg() {
        return q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("765959595e5e58", 104), q999ggg99999qqggqqg9qg("236c69757e656e", 72));
    }

    public static Integer q999qqg() {
        String str = (String) HelperJNI.q999ggg99999qqggqqg9qg(8, new Object[]{0});
        int i7 = !TextUtils.isEmpty(str) ? Integer.parseInt(str) : 0;
        if (Debug.isDebuggerConnected()) {
            i7 |= 32;
        }
        if (!cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gqg99q9q9q && i7 != 0) {
            HelperJNI.q999ggg99999qqggqqg9qg(9, new Object[]{0});
            int iMyPid = Process.myPid();
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("0612342421333124021f323338352422327733783136337f63312e3f3525331b", 24) + iMyPid + q999ggg99999qqggqqg9qg("1f", 113));
            Process.killProcess(iMyPid);
            System.exit(0);
        }
        return Integer.valueOf(i7);
    }

    public static String q99g9q99() {
        long blockSizeLong;
        long availableBlocksLong;
        long blockCountLong;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.q999ggg99999qqggqqg9qg(18)) {
            blockSizeLong = statFs.getBlockSize();
            availableBlocksLong = statFs.getAvailableBlocks();
            blockCountLong = statFs.getBlockCount();
        } else {
            blockSizeLong = statFs.getBlockSizeLong();
            availableBlocksLong = statFs.getAvailableBlocksLong();
            blockCountLong = statFs.getBlockCountLong();
        }
        return q999ggg99999qqggqqg9qg(Long.valueOf(blockCountLong * blockSizeLong), Long.valueOf(availableBlocksLong * blockSizeLong));
    }

    public static String q99q99qq99q9g() {
        try {
            Class<?> cls = Class.forName(q999ggg99999qqggqqg9qg("235e5b474c575c1b1e40510f3e73464c4e4e4c5c7c6d4b465554", 122));
            Method declaredMethod = cls.getDeclaredMethod(q999ggg99999qqggqqg9qg("21021314031f0e213603090b0b091939280e031011", 63), new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField(q999ggg99999qqggqqg9qg("2f74774d57565748585b4a45454d5651", 123));
            declaredField.setAccessible(true);
            Instrumentation instrumentation = (Instrumentation) declaredField.get(objInvoke);
            return instrumentation.toString() + q999ggg99999qqggqqg9qg("61", 89) + instrumentation.getClass().getName();
        } catch (Exception e10) {
            e10.printStackTrace();
            return e10.getMessage();
        }
    }

    public static String q9q999qgg99gq9qq9qqq9g() {
        return q999ggg99999qqggqqg9qg(Long.valueOf(System.currentTimeMillis()), Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(SystemClock.uptimeMillis()));
    }

    public static String q9q9gqgqg9qgqg9qggq9() throws Throwable {
        String[] strArr = {q999ggg99999qqggqqg9qg("124a75646e7e687475", 67), q999ggg99999qqggqqg9qg("0a310b0e0b0e0b0f", 51), q999ggg99999qqggqqg9qg("2f3b3238307577363531", 18)};
        Map map = (Map) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qqggggg9g9q99q9gq(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qgqq999g[0], new q9qqqq99gg9q99gq(strArr));
        String strQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qq9gg99gqqqgqgq999gqg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("6d0452520413594b47525e4e040452525f49501a144b5d02144b5d1d47144b5d4b4c4f4c06144b5d445f5051686a54417f614c4f4c", 115));
        String strGqq9gqqqq9qgqg9 = gqq9gqqqq9qgqg9();
        return (map.isEmpty() || map.size() < 2) ? q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg, null, null, strGqq9gqqqq9qgqg9) : q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg, map.get(strArr[0]), map.get(strArr[1]), strGqq9gqqqq9qgqg9);
    }

    public static String qg9gqgqqggg9q9qg() {
        String[] strArrSplit;
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        try {
            int length = qgq9qg99.length;
            Iterator it = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qq9gg99gqqqgqgq999gqg.q999ggg99999qqggqqg9qg().iterator();
            String strSubstring = "";
            if (it == null) {
                return "";
            }
            ApplicationInfo applicationInfo = cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg().getApplicationInfo();
            if (applicationInfo != null) {
                strSubstring = applicationInfo.nativeLibraryDir;
                if (!TextUtils.isEmpty(strSubstring)) {
                    strSubstring = strSubstring.substring(1);
                    stringBuffer.append(strSubstring);
                    stringBuffer.append(q999ggg99999qqggqqg9qg("6631", 26));
                }
            }
            q999ggg99999qqggqqg9qg("6c1c5d", 106);
            q999ggg99999qqggqqg9qg("6d06485858", 102);
            q999ggg99999qqggqqg9qg("68", 82);
            q999ggg99999qqggqqg9qg("61", 93);
            q999ggg99999qqggqqg9qg("626e", 74);
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!TextUtils.isEmpty(str2)) {
                    if (str2.contains(q999ggg99999qqggqqg9qg("6c6627", 16)) && str2.contains(q999ggg99999qqggqqg9qg("6d06485858", 102)) && (strArrSplit = str2.split(q999ggg99999qqggqqg9qg("6208", 44))) != null && strArrSplit.length > 1 && !stringBuffer.toString().contains(strArrSplit[1])) {
                        if (TextUtils.isEmpty(strSubstring) || !strArrSplit[1].startsWith(strSubstring)) {
                            str = strArrSplit[1] + q999ggg99999qqggqqg9qg("61", 96);
                            if (!arrayList.contains(str)) {
                                stringBuffer.append(str);
                                arrayList.add(str);
                            }
                        } else {
                            str = strArrSplit[1].replaceAll(strSubstring, q999ggg99999qqggqqg9qg("68", 86)) + q999ggg99999qqggqqg9qg("61", 8);
                            if (!arrayList.contains(str)) {
                                stringBuffer.append(str);
                                arrayList.add(str);
                            }
                        }
                    }
                    for (int i7 = 0; i7 < length; i7++) {
                        if (str2.contains(qgq9qg99[i7]) && !stringBuffer2.toString().contains(String.valueOf(i7))) {
                            stringBuffer2.append(i7);
                            stringBuffer2.append(q999ggg99999qqggqqg9qg("61", 58));
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (stringBuffer.toString().endsWith(q999ggg99999qqggqqg9qg("6637", 28))) {
            stringBuffer.delete(0, stringBuffer.length());
        }
        return q999ggg99999qqggqqg9qg(stringBuffer2.toString(), stringBuffer.toString());
    }

    public static String qg9qqq999gq() {
        JSONObject jSONObject = new JSONObject();
        String[] strArr = {q999ggg99999qqggqqg9qg("2b7f7f6522257d6d35206c756f387663266e69797d", 83), q999ggg99999qqggqqg9qg("2b0c0c1651560e1e46411d160d065b47", 32), q999ggg99999qqggqqg9qg("2b0b0b115651091941531804141d", 39), q999ggg99999qqggqqg9qg("2b7e7e6423247c6c34247f534d626b6855427c7d717b78", 82), q999ggg99999qqggqqg9qg("2b1a1a0047401808505d1c0a01", 54), q999ggg99999qqggqqg9qg("2b6f6f7532356d7d2532684a737a4f286673367e79696d", 67), q999ggg99999qqggqqg9qg("2b5d5d4700075f4f170c5a495c444e", 113), q999ggg99999qqggqqg9qg("2b1b1b0146411909515f18160d010503071a0c", 55), q999ggg99999qqggqqg9qg("304814105b42495e5c171a5a5f434853581f0a415d4d44", 126), q999ggg99999qqggqqg9qg("2302071b1034166e5519001a2a361914", 38), q999ggg99999qqggqqg9qg("237e7b676c486a1229657c665649646260694643737a70", 90), q999ggg99999qqggqqg9qg("301b4758041b0d1710115c450a091d1501041107011111", 45), q999ggg99999qqggqqg9qg("324b495f444459040046595f55151953", 117), q999ggg99999qqggqqg9qg("320507110a0a174a56111d112a7e11101717", 59), q999ggg99999qqggqqg9qg("321b190f14140954480f030f34290e0e0e", 37), q999ggg99999qqggqqg9qg("33302c3c7f79316c6c232e2a1e1826282c3337", 15), q999ggg99999qqggqqg9qg("334f534300064e1319545c60605a5046414656", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR), q999ggg99999qqggqqg9qg("303d616c2d203b38232e252137", 11), q999ggg99999qqggqqg9qg("2b0e0e1453540c1c44561d011151540b14160a", 34)};
        for (int i7 = 0; i7 < 19; i7++) {
            try {
                Object objQ999ggg99999qqggqqg9qg = HelperJNI.q999ggg99999qqggqqg9qg(52, new Object[]{strArr[i7]});
                if (objQ999ggg99999qqggqqg9qg != null) {
                    String str = (String) objQ999ggg99999qqggqqg9qg;
                    if (TextUtils.isEmpty(str)) {
                        continue;
                    } else {
                        jSONObject.put(String.valueOf(i7), str);
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (jSONObject.length() > 0) {
            return jSONObject.toString();
        }
        return null;
    }

    public static String qggqgq99q999g() {
        String[] strArr = {q999ggg99999qqggqqg9qg("12546b7a7060766a6b", 93), q999ggg99999qqggqqg9qg("0a271d181d181d19", 37), q999ggg99999qqggqqg9qg("2f737a70783d3f7e7d79", 90)};
        Map map = (Map) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qqggggg9g9q99q9gq(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qgqq999g[0], new g9gqqqgggg9q9gg9(strArr));
        if (map != null) {
            return (String) map.get(strArr[2]);
        }
        return null;
    }

    public static int qgq9qg99(Context context, LocationManager locationManager) {
        if (!cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg) {
            return -1;
        }
        boolean zQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("2346435f544f4403175c5e564d5349534f4809264b494f5f49455545475a485f535a4a454b5c544f48", 98), q999ggg99999qqggqqg9qg("2311140803181354400b09011a041e04181f5e711c1e18081e1207111915040d1d121c0b03181f", 53));
        int i7 = (locationManager.isProviderEnabled(q999ggg99999qqggqqg9qg("254e5a", 114)) || locationManager.isProviderEnabled(q999ggg99999qqggqqg9qg("2c5e44564d484c", 126))) ? 1 : 0;
        int i10 = Build.VERSION.SDK_INT;
        if (zQ999ggg99999qqggqqg9qg) {
            i7 |= 2;
        }
        return (i10 <= 28 || !cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("231c19050e151e594d06040c170913091512537c11131505131f0e10111b1f060e0908190800101f11060e1512", 56))) ? i7 : i7 | 4;
    }

    public static String qgqq999g() {
        String[] strArr = {q999ggg99999qqggqqg9qg("30520e12595e4e4a48515c545c59050c4d444e", 100), q999ggg99999qqggqqg9qg("303d61652e373c2b29627f342838", 11)};
        JSONObject jSONObject = new JSONObject();
        for (int i7 = 0; i7 < 2; i7++) {
            Object objQ999ggg99999qqggqqg9qg = HelperJNI.q999ggg99999qqggqqg9qg(52, new Object[]{strArr[i7]});
            if (objQ999ggg99999qqggqqg9qg != null) {
                String str = (String) objQ999ggg99999qqggqqg9qg;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        jSONObject.put(String.valueOf(i7), str);
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject.length() == 0 ? "" : jSONObject.toString();
    }

    public static String qq9gg99gqqqgqgq999gqg() {
        return (String) HelperJNI.q999ggg99999qqggqqg9qg(18, (Object) null);
    }

    public static String qq9gg9q() {
        String str = (String) HelperJNI.q999ggg99999qqggqqg9qg(6, new Object[]{1});
        return str == null ? "" : str;
    }

    public static String qqg999qq() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = (String) HelperJNI.q999ggg99999qqggqqg9qg(34, new Object[]{0});
            if (str != null && str.contains(q999ggg99999qqggqqg9qg("211b155458181d010a111a5d5a1b15171b181d004a54151612190b", 60))) {
                jSONObject.put(q999ggg99999qqggqqg9qg("2f", 84), 1);
            }
        } catch (Throwable unused) {
        }
        if (ActivityManager.isUserAMonkey()) {
            try {
                jSONObject.put(q999ggg99999qqggqqg9qg("2f", 122), 1);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    public static Integer qqggggg9g9q99q9gq(Context context, WifiManager wifiManager) {
        String str;
        int i7 = 3;
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg && cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.qgq9qg99(context, q999ggg99999qqggqqg9qg("235a5f434853581f0b40424a514f554f5354153a57555343555949595b4654434f4656595740485354", 126), q999ggg99999qqggqqg9qg("2345405c574c4700145f5d554e504a504c4b0a25484a4c5c4a4653454d4150594946485f574c4b", 97))) {
            String[] strArr = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.f19106q999ggg99999qqggqqg9qg;
            str = (String) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(strArr[3], new gq9g999g999((WifiInfo) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(strArr[0], new ggg9gqqgq99q9g9gq9g9(wifiManager))));
        } else {
            str = "";
        }
        PackageManager packageManager = context.getPackageManager();
        if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q9gqgqg9qgqg9qggq9.q999ggg99999qqggqqg9qg(packageManager, q999ggg99999qqggqqg9qg("21652832797e6f756f282f75797e6f756f", 67)) != null) {
            i7 = 1;
        } else if (!TextUtils.isEmpty(str) && str.contains(q999ggg99999qqggqqg9qg("2d5258464f404e", 102))) {
            i7 = 2;
        } else if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q9gqgqg9qgqg9qggq9.q999ggg99999qqggqqg9qg(packageManager, q999ggg99999qqggqqg9qg("21777938216a70767d70612122696a6a6d7c", 80)) == null && cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q9gqgqg9qgqg9qggq9.q999ggg99999qqggqqg9qg(packageManager, q999ggg99999qqggqqg9qg("21454b0a135842444f425313105b58585f4e131455405b5647555244475a5f", 98)) == null) {
            if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(packageManager, str)) {
                i7 = 4;
            } else if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(packageManager)) {
                i7 = 5;
            } else if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.g9g9ggqqggqq99gqq9q99.q999ggg99999qqggqqg9qg(str)) {
                i7 = 6;
            } else if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.q99g9q99.q999ggg99999qqggqqg9qg(context, str)) {
                i7 = 7;
            } else if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgqgq9qqqg999qggqqqg.q999ggg99999qqggqqg9qg()) {
                i7 = 8;
            } else {
                i7 = (cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q9gqgqg9qgqg9qggq9.q999ggg99999qqggqqg9qg(packageManager, q999ggg99999qqggqqg9qg("21373978763438212a7179362f203630362c7a", 16)) == null && cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q9gqgqg9qgqg9qggq9.q999ggg99999qqggqqg9qg(packageManager, q999ggg99999qqggqqg9qg("21080647460c4e53081f19031f1913", 47)) == null && cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q9gqgqg9qgqg9qggq9.q999ggg99999qqggqqg9qg(packageManager, q999ggg99999qqggqqg9qg("21414f0e0f45071a4156505b5a4952474b", 102)) == null) ? -1 : 23;
            }
        }
        return Integer.valueOf(i7);
    }

    public static int qqqqgqg9qgqg9q99qq9qq(Context context) {
        return ((AudioManager) context.getSystemService(q999ggg99999qqggqqg9qg("2373766a61", 76))).getMode();
    }

    @TargetApi(14)
    public static String g99gq9qg9gggq9qgg(Context context) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        ServiceInfo serviceInfo;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService(q999ggg99999qqggqqg9qg("23303234243228393937372f3f", 25));
        PackageManager packageManager = context.getPackageManager();
        if (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1)) == null || enabledAccessibilityServiceList.size() == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = it.next().getResolveInfo();
            if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!TextUtils.isEmpty(str2) && !hashSet.contains(str2)) {
                    hashSet.add(str2);
                    String string = packageManager != null ? resolveInfo.loadLabel(packageManager).toString() : "";
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(str);
                    arrayList2.add(str2);
                    arrayList2.add(string);
                    arrayList.add(arrayList2.toString());
                }
            }
        }
        return arrayList.toString();
    }

    public static String g99q9ggqg9gqgq9() {
        try {
            cn.tongdun.android.qgq9qg99.qggqgq99q999g.q99q99qq99q9g q99q99qq99q9gVar = new cn.tongdun.android.qgq9qg99.qggqgq99q999g.q99q99qq99q9g(null, 2);
            q99q99qq99q9gVar.q999ggg99999qqggqqg9qg(EGL14.EGL_NO_SURFACE);
            String strGlGetString = GLES20.glGetString(7937);
            String strGlGetString2 = GLES20.glGetString(7936);
            String strGlGetString3 = GLES20.glGetString(7938);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(q999ggg99999qqggqqg9qg("301804050e181818", 36), strGlGetString);
            jSONObject.put(q999ggg99999qqggqqg9qg("340810111006", 48), strGlGetString2);
            jSONObject.put(q999ggg99999qqggqqg9qg("345f5b", MsgEvent.MSG_EVENT_STOP_FOREGROUND), strGlGetString3);
            String string = jSONObject.toString();
            try {
                q99q99qq99q9gVar.q999ggg99999qqggqqg9qg();
                return string;
            } catch (Throwable unused) {
                return string;
            }
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String g9g9ggqqggqq99gqq9q99(Context context) {
        String strQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("261d1f1b080504372a1b02191d372e140d001b17", 55));
        String strJoin = "";
        if (strQ999ggg99999qqggqqg9qg == null) {
            strQ999ggg99999qqggqqg9qg = "";
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(q999ggg99999qqggqqg9qg("2b0d140f0b2138021b160d01", 33));
        if (inputMethodManager != null) {
            ArrayList arrayList = new ArrayList();
            for (InputMethodInfo inputMethodInfo : inputMethodManager.getInputMethodList()) {
                StringBuilder sb2 = new StringBuilder();
                String packageName = inputMethodInfo.getPackageName();
                String strReplace = inputMethodInfo.getServiceName().replace(packageName, q999ggg99999qqggqqg9qg("6d", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR));
                sb2.append(packageName);
                sb2.append(strReplace);
                if (!strQ999ggg99999qqggqqg9qg.equals(sb2.toString())) {
                    arrayList.add(sb2.toString());
                }
            }
            if (arrayList.size() != 0) {
                strJoin = TextUtils.join(q999ggg99999qqggqqg9qg("6e", 69), arrayList);
            }
        }
        return q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg, strJoin);
    }

    public static String g9g9q9qq9(Context context) {
        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qgqq999g qgqq999gVarQgq9qg99;
        return (cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.qqggggg9g9q99q9gq(context) && (qgqq999gVarQgq9qg99 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.gqgg9q99qg9.qgq9qg99(context)) != null) ? qgqq999gVarQgq9qg99.q999ggg99999qqggqqg9qg() : "";
    }

    private static boolean ggg9gqqgq99q9g9gq9g9() {
        try {
            Class<?> cls = Class.forName(q999ggg99999qqggqqg9qg("2149470603585153574902184f4f42544d06297259404d6478", HomeDialogState.PRIORITY_HIGHEST));
            return q999ggg99999qqggqqg9qg("2a3b212d303325", 25).equals(cls.getMethod(q999ggg99999qqggqqg9qg("252b38121518193a2623", 2), new Class[0]).invoke(cls, new Object[0]));
        } catch (Exception unused) {
            return false;
        }
    }

    public static String ggq999qqgqgq9g9qqq() throws Throwable {
        ClassLoader systemClassLoader;
        Class<?> clsLoadClass;
        Map map;
        Field declaredField;
        String strQ999ggg99999qqggqqg9qg;
        String strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg("26044e591808115d4a0a0f131803084f530d1a1913044f732d1a19130423351e080607", 46);
        try {
            systemClassLoader = ClassLoader.getSystemClassLoader();
            try {
                clsLoadClass = systemClassLoader.loadClass(strQ999ggg99999qqggqqg9qg2);
                if (clsLoadClass == null) {
                    try {
                        throw new NullPointerException(q999ggg99999qqggqqg9qg("210b09160428032c1b18120522341f090706414d1e574a1f1d04", 47));
                    } catch (Exception unused) {
                        try {
                            Field declaredField2 = Class.forName(q999ggg99999qqggqqg9qg("23313428233833747f22634308293a21343816123131383c29", 21)).getDeclaredField(q999ggg99999qqggqqg9qg("312e3c1c1513", 53));
                            declaredField2.setAccessible(true);
                            Map map2 = (Map) declaredField2.get(null);
                            Iterator it = map2.keySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    systemClassLoader = null;
                                    break;
                                }
                                ClassLoader classLoader = ((IBinder) map2.get((String) it.next())).getClass().getClassLoader();
                                if (classLoader instanceof PathClassLoader) {
                                    systemClassLoader = classLoader;
                                    break;
                                }
                            }
                            if (systemClassLoader != null) {
                                DexClassLoader dexClassLoader = Build.VERSION.SDK_INT < 26 ? new DexClassLoader("", cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg().getCacheDir().getAbsolutePath(), "", systemClassLoader) : new DexClassLoader("", "", "", systemClassLoader);
                                strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg("2662283f7e6e773b2c6c69757e656e29356b7c7f75622909427e6b7c7f75624553786e6061", 72);
                                clsLoadClass = dexClassLoader.loadClass(strQ999ggg99999qqggqqg9qg2);
                            }
                        } catch (Throwable unused2) {
                        }
                        if (systemClassLoader != null) {
                        }
                        return "";
                    }
                }
            } catch (Exception unused3) {
                clsLoadClass = null;
            }
        } catch (Exception unused4) {
            systemClassLoader = null;
            clsLoadClass = null;
        }
        if (systemClassLoader != null || clsLoadClass == null) {
            return "";
        }
        try {
            Field[] declaredFields = clsLoadClass.getDeclaredFields();
            int length = declaredFields.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    declaredField = null;
                    break;
                }
                Field field = declaredFields[i7];
                if (q999ggg99999qqggqqg9qg("31071b3c38323d15142d203b371b1e313c323f3e3424", 23).equals(field.getName())) {
                    strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("31170b2c28222d05043d302b270b0e212c222f2e2434", 7);
                } else if (q999ggg99999qqggqqg9qg("2a6364606a654d4c7578636f434669646a67666c7c", 79).equals(field.getName())) {
                    strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("2a1e191d1718303108051e123e3b1419171a1b1101", 50);
                } else {
                    i7++;
                }
                declaredField = clsLoadClass.getDeclaredField(strQ999ggg99999qqggqqg9qg);
                break;
            }
            if (declaredField != null) {
                declaredField.setAccessible(true);
                map = (Map) declaredField.get(null);
            } else {
                map = null;
            }
        } catch (Exception unused5) {
        }
        if (map == null) {
            return "";
        }
        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar = new cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qqggggg9g9q99q9gq();
        qqggggg9g9q99q9gqVar.q999ggg99999qqggqqg9qg();
        try {
            Class<?> clsLoadClass2 = systemClassLoader.loadClass(strQ999ggg99999qqggqqg9qg2 + q999ggg99999qqggqqg9qg("666a2112043b2c342816101c3b31100b1c0c3a3b1c", 38));
            Method declaredMethod = clsLoadClass2.getDeclaredMethod(q999ggg99999qqggqqg9qg("254b586e7446584a524e52", 98), new Class[0]);
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : map.entrySet()) {
                Member member = (Member) entry.getKey();
                if ((member instanceof Method) && hashSet.size() < 50 && hashSet.toString().length() < 5000) {
                    hashSet.add(cn.tongdun.android.qgq9qg99.qggqgq99q999g.gq9qqgq9q9.q999ggg99999qqggqqg9qg((Method) member));
                }
                Object value = entry.getValue();
                int iQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.gqgg9q99qg9.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(member.toString());
                if (iQ999ggg99999qqggqqg9qg != -1) {
                    Object[] array = clsLoadClass2.isInstance(value) ? (Object[]) declaredMethod.invoke(value, new Object[0]) : value instanceof TreeSet ? ((TreeSet) value).toArray() : null;
                    if (array != null) {
                        for (Object obj : array) {
                            String string = obj.getClass().getClassLoader().toString();
                            String str = "\"";
                            if (string.split(str).length > 1) {
                                qqggggg9g9q99q9gqVar.q999ggg99999qqggqqg9qg(string.split(str)[1], iQ999ggg99999qqggqqg9qg);
                            }
                        }
                    }
                }
            }
            String string2 = qqggggg9g9q99q9gqVar.toString();
            HelperJNI.q999ggg99999qqggqqg9qg(57, new Object[]{hashSet});
            return string2;
        } catch (Exception unused6) {
            return qqggggg9g9q99q9gqVar.toString();
        }
    }

    private static boolean gq9g999g999() {
        try {
            Class.forName(q999ggg99999qqggqqg9qg("2f0043511a041213155343150017141e094263350017141e092e3813050b0a", 35));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String gq9gggq9gq9gg9q99g9q(Context context) {
        return gggggqq9g9qq9gqgq99.qqggggg9g9q99q9gq(context);
    }

    public static String gq9qqgq9q9(Context context) {
        try {
            PackageInfo packageInfo = (PackageInfo) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qgq9qg99(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.gqgg9q99qg9[0], new gqqgggqgg99qg9(context));
            return String.valueOf(packageInfo.firstInstallTime) + q999ggg99999qqggqqg9qg("61", 49) + String.valueOf(packageInfo.lastUpdateTime);
        } catch (Exception e10) {
            return e10.getMessage();
        }
    }

    public static long gqg99q9q9q(Context context) {
        int i7;
        int iGqg99q9q9q = gggggqq9g9qq9gqgq99.gqg99q9q9q();
        if ((f19187q999ggg99999qqggqqg9qg & 1) == 1) {
            return iGqg99q9q9q;
        }
        int iQgq9qg99 = gggggqq9g9qq9gqgq99.qgq9qg99(context);
        int iQqggggg9g9q99q9gq = gggggqq9g9qq9gqgq99.qqggggg9g9q99q9gq();
        int iGqgg9q99qg9 = gggggqq9g9qq9gqgq99.gqgg9q99qg9();
        if ((iGqgg9q99qg9 & 8) == 0 && (gggggqq9g9qq9gqgq99.qgqq999g() == 1 || gggggqq9g9qq9gqgq99.qg9gqgqqggg9q9qg())) {
            iGqgg9q99qg9 |= 8;
        }
        Object objQ999ggg99999qqggqqg9qg = HelperJNI.q999ggg99999qqggqqg9qg(38, new Object[0]);
        if (objQ999ggg99999qqggqqg9qg != null ? ((Boolean) objQ999ggg99999qqggqqg9qg).booleanValue() : false) {
            Object objQ999ggg99999qqggqqg9qg2 = HelperJNI.q999ggg99999qqggqqg9qg(39, new Object[0]);
            i7 = (objQ999ggg99999qqggqqg9qg2 == null || !((Boolean) objQ999ggg99999qqggqqg9qg2).booleanValue()) ? 16384 : 49152;
        } else {
            i7 = 0;
        }
        Object objQ999ggg99999qqggqqg9qg3 = HelperJNI.q999ggg99999qqggqqg9qg(56, new Object[]{21});
        int i10 = objQ999ggg99999qqggqqg9qg3 != null ? ((Boolean) objQ999ggg99999qqggqqg9qg3).booleanValue() : false ? 65536 : 0;
        int i11 = gq9g999g999() ? 16 : 0;
        Object objQ999ggg99999qqggqqg9qg4 = HelperJNI.q999ggg99999qqggqqg9qg(68, new Object[]{22});
        return iQgq9qg99 | i11 | iQqggggg9g9q99q9gq | iGqgg9q99qg9 | iGqg99q9q9q | i7 | i10 | (objQ999ggg99999qqggqqg9qg4 != null ? ((Boolean) objQ999ggg99999qqggqqg9qg4).booleanValue() : false ? CodePushConstants.DOWNLOAD_BUFFER_SIZE : 0);
    }

    public static String gqgg9q99qg9(Context context) {
        Map mapQ999ggg99999qqggqqg9qg = gggggqq9g9qq9gqgq99.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("23000d", 38));
        return (mapQ999ggg99999qqggqqg9qg == null || mapQ999ggg99999qqggqqg9qg.isEmpty()) ? "" : (String) mapQ999ggg99999qqggqqg9qg.get(q999ggg99999qqggqqg9qg("23121f", 52));
    }

    public static String gqgqgq9qqqg999qggqqqg() {
        return (String) HelperJNI.q999ggg99999qqggqqg9qg(19, (Object) null);
    }

    public static String gqq9gqqqq9qgqg9(Context context) {
        try {
            Display[] displays = ((DisplayManager) context.getSystemService(q999ggg99999qqggqqg9qg("2645524b544550", 99))).getDisplays();
            if (displays == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            int i7 = 0;
            for (Display display : displays) {
                if (display != null) {
                    sb2.append(display.getName());
                    sb2.append(q999ggg99999qqggqqg9qg("61", 24));
                    sb3.append(display.getFlags());
                    sb3.append(q999ggg99999qqggqqg9qg("61", 37));
                    sb4.append(q999ggg99999qqggqqg9qg(display));
                    sb4.append(q999ggg99999qqggqqg9qg("61", 83));
                    i7++;
                    if (i7 == 10) {
                        break;
                    }
                }
            }
            if (sb2.length() > 0) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            if (sb3.length() > 0) {
                sb3.deleteCharAt(sb3.length() - 1);
            }
            if (sb4.length() > 0) {
                sb4.deleteCharAt(sb4.length() - 1);
            }
            return String.format(Locale.US, q999ggg99999qqggqqg9qg("672d74222d74223a63222d", 80), sb2, sb3, Integer.valueOf(displays.length), sb4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String q999ggg99999qqggqqg9qg(ActivityManager activityManager) throws Throwable {
        long j6;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        long j10 = memoryInfo.availMem;
        if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.qgq9qg99(16)) {
            j6 = memoryInfo.totalMem;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(q999ggg99999qqggqqg9qg("0f04241517373921", 7));
            Map mapQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qq9gg99gqqqgqgq999gqg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("6d0d504f5e1e105a5a56555a5b", 121), arrayList, q999ggg99999qqggqqg9qg("78", 65));
            if (mapQ999ggg99999qqggqqg9qg.isEmpty()) {
                j6 = 0;
            } else {
                j6 = (mapQ999ggg99999qqggqqg9qg.get(q999ggg99999qqggqqg9qg("0f3e1e2f2d0d031b", 61)) == null || "".equals(mapQ999ggg99999qqggqqg9qg.get(q999ggg99999qqggqqg9qg("0f34142527070911", 55)))) ? -1L : Long.parseLong(((String) mapQ999ggg99999qqggqqg9qg.get(q999ggg99999qqggqqg9qg("0f2b0b3a3818160e", 40))).replaceAll(q999ggg99999qqggqqg9qg("1e0275", 49), "")) << 10;
            }
        }
        return q999ggg99999qqggqqg9qg(Long.valueOf(j6), Long.valueOf(j10));
    }

    public static String q999qqg(Context context) {
        String strQ999ggg99999qqggqqg9qg = qggq9gqq9q99g99q.q999ggg99999qqggqqg9qg().q999ggg99999qqggqqg9qg(context);
        if (strQ999ggg99999qqggqqg9qg == null || strQ999ggg99999qqggqqg9qg.length() > 70) {
            return strQ999ggg99999qqggqqg9qg;
        }
        return null;
    }

    public static String q99g9q99(Context context) {
        MediaDrm mediaDrm;
        String str = Build.BRAND;
        String str2 = Build.MODEL;
        if (q999ggg99999qqggqqg9qg("315947554d5042", 96).equals(str) && (q999ggg99999qqggqqg9qg("11621c100d7f7d08", 87).equals(str2) || q999ggg99999qqggqqg9qg("11235d514c3e3c42", 22).equals(str2))) {
            return null;
        }
        String strQgq9qg99 = cn.tongdun.android.qgq9qg99.qggqgq99q999g.g9qqg99qqg.qgq9qg99(context, q999ggg99999qqggqqg9qg("362b72723636", 16), null);
        if (!TextUtils.isEmpty(strQgq9qg99)) {
            return strQgq9qg99;
        }
        int i7 = Build.VERSION.SDK_INT;
        UUID uuid = new UUID(-1301668207276963122L, -6645017420763422227L);
        try {
            if (!MediaDrm.isCryptoSchemeSupported(uuid)) {
                return null;
            }
            mediaDrm = new MediaDrm(uuid);
            try {
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray(q999ggg99999qqggqqg9qg("265c4e42575b6d665a45594d7170", 118));
                HelperJNI.q999ggg99999qqggqqg9qg(76, new Object[]{mediaDrm});
                String strQ999ggg99999qqggqqg9qg = cn.tongdun.android.shell.common.gqgg9q99qg9.q999ggg99999qqggqqg9qg(propertyByteArray);
                cn.tongdun.android.qgq9qg99.qggqgq99q999g.g9qqg99qqg.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("360158581c1c", 58), strQ999ggg99999qqggqqg9qg);
                if (i7 >= 28) {
                    mediaDrm.release();
                    return strQ999ggg99999qqggqqg9qg;
                }
                mediaDrm.release();
                return strQ999ggg99999qqggqqg9qg;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            mediaDrm = null;
        }
        if (mediaDrm != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                mediaDrm.release();
            } else {
                mediaDrm.release();
            }
        }
        return null;
    }

    public static String q99q99qq99q9g(Context context) {
        TimeZone timeZone = TimeZone.getDefault();
        String id2 = timeZone != null ? timeZone.getID() : "";
        String language = Locale.getDefault().getLanguage();
        String strQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("312b2a2c3b300a062b2035342721302d3b", 16));
        int i7 = !TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg) ? Integer.parseInt(strQ999ggg99999qqggqqg9qg) : 0;
        if (i7 < 0) {
            i7 = -1;
        } else if (i7 > 255) {
            i7 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        return q999ggg99999qqggqqg9qg(id2, language, Integer.valueOf(i7));
    }

    public static String q9q999qgg99gq9qq9qqq9g(Context context) {
        return q999ggg99999qqggqqg9qg(gggggqq9g9qq9gqgq99.q999ggg99999qqggqqg9qg(context));
    }

    public static String q9q9gqgqg9qgqg9qggq9(Context context) {
        return cn.tongdun.android.qgq9qg99.qggqgq99q999g.qggqgq99q999g.q999ggg99999qqggqqg9qg().q999ggg99999qqggqqg9qg(context);
    }

    public static String qg9gqgqqggg9q9qg(Context context) {
        return context.getFilesDir() != null ? context.getFilesDir().getAbsolutePath() : q999ggg99999qqggqqg9qg("212a273c373b2a7c6f24371409232f30110b3d7c272f6f3c75683d3f26", 13);
    }

    public static String qg9qqq999gq(Context context) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectGqqgggqgg99qg9 = gqqgggqgg99qg9(context);
        if (jSONObjectGqqgggqgg99qg9 != null) {
            jSONArray.put(jSONObjectGqqgggqgg99qg9);
        }
        JSONObject jSONObjectQqqqgqg9qgqg9q99qq9qq = qqqqgqg9qgqg9q99qq9qq();
        if (jSONObjectQqqqgqg9qgqg9q99qq9qq != null) {
            jSONArray.put(jSONObjectQqqqgqg9qgqg9q99qq9qq);
        }
        return jSONArray.toString();
    }

    public static String qggqgq99q999g(Context context) {
        String str;
        int i7;
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter(q999ggg99999qqggqqg9qg("23080d111a010a4d40001d160c1d5d4805101a0106476b04120716100c011b0c0e080e0506", 44)), q999ggg99999qqggqqg9qg("213e30716c27252d362832283433727e222f3c3735302035686822", 25), null);
        if (intentRegisterReceiver == null) {
            return q999ggg99999qqggqqg9qg(null, null, null);
        }
        int intExtra = intentRegisterReceiver.getIntExtra(q999ggg99999qqggqqg9qg("316674746067", 74), 0);
        int intExtra2 = intentRegisterReceiver.getIntExtra(q999ggg99999qqggqqg9qg("2e677d7d67", 69), 0);
        int intExtra3 = intentRegisterReceiver.getIntExtra(q999ggg99999qqggqqg9qg("36677e6b63616563777161", 93), 0);
        int intExtra4 = intentRegisterReceiver.getIntExtra(q999ggg99999qqggqqg9qg("321712190b090a", 32), -1);
        int intExtra5 = Build.VERSION.SDK_INT >= 34 ? intentRegisterReceiver.getIntExtra(q999ggg99999qqggqqg9qg("23282d313a212a6d663b7a6c3a2b2134684a3d3d282e3d3b2b3d3c3d", 12), -1) : -1;
        String strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("37736d6d697071", 67);
        if (intExtra == 1) {
            str = "373628282c3534";
            i7 = 6;
        } else if (intExtra == 2) {
            str = "2164667c7a616866";
            i7 = 68;
        } else if (intExtra == 3) {
            str = "26786f657e7c66607b727c";
            i7 = 94;
        } else {
            if (intExtra != 4) {
                if (intExtra == 5) {
                    str = "247e746d";
                    i7 = 70;
                }
                HelperJNI.q999ggg99999qqggqqg9qg(45, new Object[]{Integer.valueOf(intExtra), Integer.valueOf(intExtra4)});
                return q999ggg99999qqggqqg9qg(Integer.valueOf(intExtra2), strQ999ggg99999qqggqqg9qg, Integer.valueOf(intExtra3), Integer.valueOf(intExtra5));
            }
            str = "2c5b410e195153494f545d53";
            i7 = 113;
        }
        strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(str, i7);
        HelperJNI.q999ggg99999qqggqqg9qg(45, new Object[]{Integer.valueOf(intExtra), Integer.valueOf(intExtra4)});
        return q999ggg99999qqggqqg9qg(Integer.valueOf(intExtra2), strQ999ggg99999qqggqqg9qg, Integer.valueOf(intExtra3), Integer.valueOf(intExtra5));
    }

    public static String qgq9qg99() {
        String lowerCase = "";
        String lowerCase2 = (TextUtils.isEmpty(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9qqg99qqg) || cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9qqg99qqg.length() != 64) ? "" : cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g9qqg99qqg.toLowerCase();
        if (!TextUtils.isEmpty(cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g99gq9qg9gggq9qgg) && cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g99gq9qg9gggq9qgg.length() == 64) {
            lowerCase = cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g99gq9qg9gggq9qgg.toLowerCase();
        }
        return q999ggg99999qqggqqg9qg(lowerCase2, lowerCase);
    }

    public static String qgqq999g(Context context) {
        String[] strArr = {q999ggg99999qqggqqg9qg("210806474b0800434e151e1802011001111513585f18", 47), q999ggg99999qqggqqg9qg("21535d1c10535b181d524b4452545a574e5942", 116), q999ggg99999qqggqqg9qg("21505e1f1350581b01564b515b4d46405c4a4b5843565a4a", 119), q999ggg99999qqggqqg9qg("21656b2a256770797f6e7c6b6171342f6e6b61", 66), q999ggg99999qqggqqg9qg("217779383775626b6d7c6e7973632622657c7170637f6e747e72737774747d796c", 80), q999ggg99999qqggqqg9qg("21080647480a1d14120311060c1c595912150419030d10", 47), q999ggg99999qqggqqg9qg("214b45040b495e57514052454f5f1a0b495e57514052454f5f58444b45525a414659455a5e584a4650", 108), q999ggg99999qqggqqg9qg("21535d1c1351464f49584a5d574702104e5f5c494e5f4258564b", 116), q999ggg99999qqggqqg9qg("216769282765727b7d6c7e69637336277a6c796268636a7c", 64), q999ggg99999qqggqqg9qg("21656b2a256770797f6e7c6b61713405586e5e456b696566635d4b74656f7f697574", 66), q999ggg99999qqggqqg9qg("211a14555a180f06001103141e0e4b4b5754", 61), q999ggg99999qqggqqg9qg("211f11505f1d0a03051406111b0b4e4e05021216", 56), q999ggg99999qqggqqg9qg("217779383e7175647e3e7b7a642166737461667374666d6c7f686c", 80), q999ggg99999qqggqqg9qg("210a0445431d0c0f5b400b0f1a131117000d1c1711", 45), q999ggg99999qqggqqg9qg("21181657511e1a0b115114150b4e091c1b0e091c1b13101c", 63), q999ggg99999qqggqqg9qg("210806474b0b0e121902094e4e0517170d071b190c0f1e2f2812150419030d10", 47), q999ggg99999qqggqqg9qg("21101e5f5313160a011a1156561d0f0f151f0301141706", 55), q999ggg99999qqggqqg9qg("210806474b0b0e121902094e491202031f0605070806090d53", 47), q999ggg99999qqggqqg9qg("2176783931676376676673313575706c677c7730356b6360", 81), q999ggg99999qqggqqg9qg("21111f5e541f160a091f06001b1c5d401b18080a1a1b0b0a", 54), q999ggg99999qqggqqg9qg("21747a3b317a736f6c7a63657e793835777d616a75766b6e6c7a656f79", 83), q999ggg99999qqggqqg9qg("21040a4b531e455e080a01554d06141305061b1e", 35), q999ggg99999qqggqqg9qg("21474908105d061d4b4942", 96), q999ggg99999qqggqqg9qg("21323c7d7230272e7578232a313768382771383c3524", 21), q999ggg99999qqggqqg9qg("213a34757a382f267d702b22393f60302f743b222d3b3d3b21", 29), q999ggg99999qqggqqg9qg("211d13525d1f08015a570c051e18471708561519", 58), q999ggg99999qqggqqg9qg("216c622323646a717d797f7b663a29727c6d61", 75), q999ggg99999qqggqqg9qg("213a347575323c272b2f292d306c753a252f3827", 29), q999ggg99999qqggqqg9qg("21060849490e001b171315110c5049020212160e02", 33), q999ggg99999qqggqqg9qg("217c31366c6a71726e2c296a32337c656a7c7a7c66", 90), q999ggg99999qqggqqg9qg("21400d0a50564d4e521015560e134f505a4c", 102), q999ggg99999qqggqqg9qg("2145080f5553484b571510530b1554415a5746545345465b5e", 99), q999ggg99999qqggqqg9qg("215a17104a4c5754480a1840455e5b444e5946", 124), q999ggg99999qqggqqg9qg("21111f5e401700577a1915", 54), q999ggg99999qqggqqg9qg("21333d7c733431363e2869702e3f616238242228747933", 20), q999ggg99999qqggqqg9qg("21353b7a75323730382e6f7b342d223432342e", 18), q999ggg99999qqggqqg9qg("21656b2a25626760687e3f2678693737716e6862", 66), q999ggg99999qqggqqg9qg("212b25646b2c292e263071683627796726302c313023382d21", 12), q999ggg99999qqggqqg9qg("21444a0b0747425e554e450208495f404d4e53", 99), q999ggg99999qqggqqg9qg("211a1455501f1e121a000019564813100d", 61), q999ggg99999qqggqqg9qg("2f35767b34353931727b3034212e3b36272c2a", 22), q999ggg99999qqggqqg9qg("2f3c7f723d3c30387b7b3b3e222932393126342e2e33", 31), q999ggg99999qqggqqg9qg("213d3372682f363b272c2766733c252a3c3a3c26", 26), q999ggg99999qqggqqg9qg("21000e4f55120b061a111a5b510a09191b0b0a1a1b", 39), q999ggg99999qqggqqg9qg("21717f3e24637a776b606b2a3f7069667076706a", 86), q999ggg99999qqggqqg9qg("213e30716b2c3538242f246575363a", 25), q999ggg99999qqggqqg9qg("217876373b7b7e626972793e33736e6563687b79363e796e7768796c233962756f6e752e3f7c6c6d7961697275343f7c6c3175", 95), q999ggg99999qqggqqg9qg("21040a4b4707021e150e054243001011051d13155455160a0c0619191e0f0f", 35), q999ggg99999qqggqqg9qg("21515f1e145f564a495f46405b5c1d145f564a40", 118), q999ggg99999qqggqqg9qg("21545a1b1d5256475d1d58594702455057424550575f5c50", 115), q999ggg99999qqggqqg9qg("2126286970372225303722256a6d2e22", 1), q999ggg99999qqggqqg9qg("21666829297272723128677e716761677d", 65), q999ggg99999qqggqqg9qg("283b32382b213d727f3f3a262d363d2021272f", 27), q999ggg99999qqggqqg9qg("2f67242d663279206065797269626a7d6f757568", 68), q999ggg99999qqggqqg9qg("21707e3f2a676f6071642b2a67737168677177716b", 87), q999ggg99999qqggqqg9qg("21252b6a6626232922233f746b243d322422243e", 2), q999ggg99999qqggqqg9qg("2d41491515494b58494e485b404106135356410b134d5c415e5d5b414741", 119), q999ggg99999qqggqqg9qg("2d626a36366a687b6a6d6b786362253070756228387b77", 84), q999ggg99999qqggqqg9qg("214947061d435d42444e474343430a0d4255435742", HomeDialogState.PRIORITY_HIGHEST), q999ggg99999qqggqqg9qg("21323c7d73242d3c7876313b3736323131383c29", 21), q999ggg99999qqggqqg9qg("213e30717f2821307478322f", 25), q999ggg99999qqggqqg9qg("216a64252b7c7564202f7165", 77), q999ggg99999qqggqqg9qg("21727c3d33646d7c38347e6329236e6f697e7563657965", 85), q999ggg99999qqggqqg9qg("212f21606e393021656c32233e2f303a2d32", 8), q999ggg99999qqggqqg9qg("21404e0f0e424a06064c515c4844", MsgEvent.MSG_EVENT_STOP_FOREGROUND), q999ggg99999qqggqqg9qg("214e40010e4c5b52090a4d474b4a4e4d4d444055", 105), q999ggg99999qqggqqg9qg("2118165756191b161104184f5718070d1a05", 63), q999ggg99999qqggqqg9qg("21727c3d38636a717737397a76", 85), q999ggg99999qqggqqg9qg("214d43020a5c5a47484144494e4c470a1b47524e5c544e4448", 106), q999ggg99999qqggqqg9qg("2179773622656d6d7d7a7c3c3a7067627a7873746263647568727c", 94), q999ggg99999qqggqqg9qg("214947061d5e4759181958474d58", HomeDialogState.PRIORITY_HIGHEST), q999ggg99999qqggqqg9qg("210a04455e1d041a5b4b131d0a14061c1c0113091c", 45), q999ggg99999qqggqqg9qg("216769283370697736267e707561616c7a6372706b68", 64)};
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        for (int i7 = 0; i7 < 73; i7++) {
            try {
                if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q9gqgqg9qgqg9qggq9.q999ggg99999qqggqqg9qg(packageManager, strArr[i7]) != null) {
                    arrayList.add(Integer.valueOf(i7));
                }
            } catch (Throwable unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        if (arrayList.size() <= 10) {
            return arrayList.toString();
        }
        f19187q999ggg99999qqggqqg9qg |= 1;
        return "";
    }

    public static String qq9gg99gqqqgqgq999gqg(Context context) {
        String strQ999ggg99999qqggqqg9qg;
        String string;
        int simState;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(q999ggg99999qqggqqg9qg("327e61676d", 77));
        if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.qgq9qg99(23)) {
            int iIntValue = ((Integer) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qgq9qg99[0], new g9ggqqgggg9999q99qgqg9(telephonyManager))).intValue();
            String strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg("6f3d", 9);
            if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g99q9ggqg9gqgq9 && cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.q999ggg99999qqggqqg9qg(context)) {
                cn.tongdun.android.qgq9qg99.qgqq999g.qgqq999g qgqq999gVar = (cn.tongdun.android.qgq9qg99.qgqq999g.qgqq999g) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("215e130948525a504248131c5c59454e555e190f445756474b545258181a0d531b1b0d53451b531b45451b0d451b1b7d5e51", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP));
                if (qgqq999gVar != null) {
                    strQ999ggg99999qqggqqg9qg2 = qgqq999gVar.q999ggg99999qqggqqg9qg(context);
                }
            } else {
                strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg("6f6a", 93);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(iIntValue);
            strQ999ggg99999qqggqqg9qg = G.r(sb2, q999ggg99999qqggqqg9qg("3e", 102), strQ999ggg99999qqggqqg9qg2);
            JSONArray jSONArray = new JSONArray();
            if (iIntValue > 2) {
                iIntValue--;
            }
            for (int i7 = 0; i7 < iIntValue; i7++) {
                try {
                    simState = telephonyManager.getSimState(i7);
                } catch (Throwable unused) {
                    simState = -1;
                }
                jSONArray.put(simState);
            }
            string = jSONArray.toString();
        } else {
            strQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("6f1a", 45);
            string = "";
        }
        return q999ggg99999qqggqqg9qg(strQ999ggg99999qqggqqg9qg, string);
    }

    public static String qq9gg9q(Context context) {
        try {
            Set<String> setKeySet = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.keySet();
            if (setKeySet != null) {
                return TextUtils.join(q999ggg99999qqggqqg9qg("61", 49), setKeySet);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String qqg999qq(Context context) {
        try {
            return cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("2337322e253e35030e35", 19));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String qqggggg9g9q99q9gq() {
        int i7 = Build.VERSION.SDK_INT;
        String str = Build.VERSION.RELEASE;
        String strSubstring = Build.MODEL;
        if (strSubstring != null && strSubstring.length() > 30) {
            strSubstring = strSubstring.substring(0, 30);
        }
        String str2 = Build.PRODUCT;
        String strSubstring2 = Build.BRAND;
        if (strSubstring2 != null && strSubstring2.length() > 30) {
            strSubstring2 = strSubstring2.substring(0, 30);
        }
        String str3 = Build.DISPLAY;
        String str4 = Build.HOST;
        String str5 = Build.DEVICE;
        String strSubstring3 = Build.HARDWARE;
        if (strSubstring3 != null && strSubstring3.length() > 30) {
            strSubstring3 = strSubstring3.substring(0, 30);
        }
        return q999ggg99999qqggqqg9qg(Integer.valueOf(i7), str, strSubstring, str2, strSubstring2, "", str3, str4, str5, strSubstring3, Build.TAGS, Build.FINGERPRINT);
    }

    private static JSONObject qqqqgqg9qgqg9q99qq9qq() {
        Object objInvoke;
        try {
            Class<?> cls = Class.forName(q999ggg99999qqggqqg9qg("23080d111a010a4d481607596825101a18181a0a2a3b1d100302", 44));
            Method declaredMethod = cls.getDeclaredMethod(q999ggg99999qqggqqg9qg("251300352013191b1713393d1e1e171306", 58), new Class[0]);
            declaredMethod.setAccessible(true);
            objInvoke = declaredMethod.invoke(cls, new Object[0]);
        } catch (Exception unused) {
            objInvoke = null;
        }
        if (objInvoke == null) {
            return null;
        }
        try {
            Class<?> cls2 = objInvoke instanceof Proxy ? Proxy.getInvocationHandler(objInvoke).getClass() : null;
            JSONObject jSONObject = new JSONObject();
            if (!q999ggg99999qqggqqg9qg("232c29353e252e696e2f2239322839797d3e60443a12212b2925210b0f2c2c25213475540422346557013e3422", 8).equals(objInvoke.getClass().getName())) {
                jSONObject.put(q999ggg99999qqggqqg9qg("31010013081d11", 60), objInvoke.getClass().getName());
            }
            if (cls2 != null) {
                jSONObject.put(q999ggg99999qqggqqg9qg("2a161015171608", 52), cls2.getName());
            }
            if (jSONObject.length() <= 0) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(q999ggg99999qqggqqg9qg("3210", 56), jSONObject);
            return jSONObject2;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static String q999ggg99999qqggqqg9qg(Context context) {
        return q999ggg99999qqggqqg9qg(ggq999qqgqgq9g9qqq.q999ggg99999qqggqqg9qg(context), Integer.valueOf(ggq999qqgqgq9g9qqq.q999ggg99999qqggqqg9qg()), ggq999qqgqgq9g9qqq.qgq9qg99());
    }

    public static String qgq9qg99(Context context) {
        int port;
        String property;
        if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.qgq9qg99(14)) {
            property = System.getProperty(q999ggg99999qqggqqg9qg("2a1c00045e5e021d170131271c07", 43));
            String property2 = System.getProperty(q999ggg99999qqggqqg9qg("2a6a76722828746b61775f496b70", 93));
            if (property2 == null || "".equals(property2)) {
                property2 = q999ggg99999qqggqqg9qg("6f12", 37);
            }
            port = Integer.parseInt(property2);
        } else {
            String host = android.net.Proxy.getHost(context);
            port = android.net.Proxy.getPort(context);
            property = host;
        }
        if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg(property)) {
            return "";
        }
        return d0.n(port, q999ggg99999qqggqqg9qg("78", 11), u.s(property));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public static String qqggggg9g9q99q9gq(Context context) {
        String str;
        String string;
        Map mapQ999ggg99999qqggqqg9qg = gggggqq9g9qq9gqgq99.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("32353575", 30));
        String strR = "";
        if (mapQ999ggg99999qqggqqg9qg == null || mapQ999ggg99999qqggqqg9qg.isEmpty()) {
            str = "";
            string = str;
        } else {
            str = (String) mapQ999ggg99999qqggqqg9qg.get(q999ggg99999qqggqqg9qg("326b6b2b", 64));
            string = (String) mapQ999ggg99999qqggqqg9qg.get(q999ggg99999qqggqqg9qg("365a40", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR));
        }
        if (str == null && string == null) {
            string = "";
        } else {
            if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg(str)) {
                str = "";
            }
            if (!cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg(str)) {
                StringBuilder sbS = u.s(str);
                sbS.append(cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg(string) ? "" : G.r(new StringBuilder(), q999ggg99999qqggqqg9qg("6e", 3), string));
                string = sbS.toString();
            } else if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg(string)) {
                string = "";
            }
        }
        if (!cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg(string)) {
            String str2 = (String) mapQ999ggg99999qqggqqg9qg.get(q999ggg99999qqggqqg9qg("327171311e437d6369", 90));
            String str3 = (String) mapQ999ggg99999qqggqqg9qg.get(q999ggg99999qqggqqg9qg("36716b41427c6268", 91));
            if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg(str2)) {
                str2 = "";
            }
            if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg(str3)) {
                str3 = "";
            }
            StringBuilder sbS2 = u.s(str2);
            if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg(str2)) {
                strR = str3;
            } else if (!cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99gq9qg9gggq9qgg.q999ggg99999qqggqqg9qg(str3)) {
                strR = G.r(new StringBuilder(), q999ggg99999qqggqqg9qg("6e", 86), str3);
            }
            sbS2.append(strR);
            strR = sbS2.toString();
        }
        return q999ggg99999qqggqqg9qg(string, strR);
    }

    public static String q999ggg99999qqggqqg9qg(Context context, LocationManager locationManager) {
        cn.tongdun.android.qgq9qg99.qgqq999g.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar = (cn.tongdun.android.qgq9qg99.qgqq999g.qqggggg9g9q99q9gq) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("214d001a5b414943515b000f4f4a565d464d0a02434c42555d464100091e4008081e40560840085656081e5608086e584b", 107));
        return qqggggg9g9q99q9gqVar != null ? qqggggg9g9q99q9gqVar.q999ggg99999qqggqqg9qg(context, locationManager) : "";
    }

    public static String q999ggg99999qqggqqg9qg(Context context, ConnectivityManager connectivityManager, WifiManager wifiManager) {
        return gggggqq9g9qq9gqgq99.q999ggg99999qqggqqg9qg();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0094  */
    public static String q999ggg99999qqggqqg9qg(Context context, WifiManager wifiManager) {
        String strQ999ggg99999qqggqqg9qg;
        String strQ999ggg99999qqggqqg9qg2;
        int i7;
        WifiInfo wifiInfo;
        cn.tongdun.android.qgq9qg99.qgqq999g.q9q999qgg99gq9qq9qqq9g q9q999qgg99gq9qq9qqq9gVar;
        cn.tongdun.android.qgq9qg99.qgqq999g.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar;
        String[] strArr = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.f19106q999ggg99999qqggqqg9qg;
        boolean zBooleanValue = ((Boolean) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(strArr[2], new g9g9q9qq9(wifiManager))).booleanValue();
        if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("2306031f140f0443571c1e160d1309130f0849660b090f1f0905011706061f050e1c1c18", 34)) && zBooleanValue) {
            if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg) {
                wifiInfo = (WifiInfo) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(strArr[0], new ggq9qqq(wifiManager));
                if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.qgq9qg99(context, q999ggg99999qqggqqg9qg("2375706c677c7730246f6d657e607a607c7b3a15787a7c6c7a76667674697b6c60697976786f677c7b", 81), q999ggg99999qqggqqg9qg("2302071b100b004753181a1209170d170b0c4d620f0d0b1b0d0114020a06171e0e010f18100b0c", 38)) && (qqggggg9g9q99q9gqVar = (cn.tongdun.android.qgq9qg99.qgqq999g.qqggggg9g9q99q9gq) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("2179342e6f757d77656f343b7b7e626972793e3677787661697275343d2a743c3c2a74623c743c62623c2a623c3c5a6c7f", 95))) != null) {
                    strQ999ggg99999qqggqqg9qg = qqggggg9g9q99q9gqVar.q999ggg99999qqggqqg9qg(wifiInfo);
                }
                i7 = ((DhcpInfo) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(strArr[1], new qgqgq9qq9ggggg9g(wifiManager))).gateway;
                if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qq9gg9q || (q9q999qgg99gq9qq9qqq9gVar = (cn.tongdun.android.qgq9qg99.qgqq999g.q9q999qgg99gq9qq9qqq9g) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("21420f15544e464c5e540f0040455952494205165140404f4847460e06114f0707114f59074f075959071159070761475e", 100))) == null) {
                    strQ999ggg99999qqggqqg9qg2 = "";
                } else {
                    strQ999ggg99999qqggqqg9qg2 = q9q999qgg99gq9qq9qqq9gVar.q999ggg99999qqggqqg9qg(wifiInfo, "");
                }
            } else {
                wifiInfo = null;
            }
            strQ999ggg99999qqggqqg9qg = "";
            i7 = ((DhcpInfo) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(strArr[1], new qgqgq9qq9ggggg9g(wifiManager))).gateway;
            if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qq9gg9q) {
                strQ999ggg99999qqggqqg9qg2 = "";
            } else {
                strQ999ggg99999qqggqqg9qg2 = "";
            }
        } else {
            strQ999ggg99999qqggqqg9qg = "";
            strQ999ggg99999qqggqqg9qg2 = strQ999ggg99999qqggqqg9qg;
            i7 = 0;
        }
        return q999ggg99999qqggqqg9qg("", strQ999ggg99999qqggqqg9qg2, strQ999ggg99999qqggqqg9qg, Integer.valueOf(i7), 0);
    }

    public static String q999ggg99999qqggqqg9qg(Context context, WifiManager wifiManager, ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        int i7;
        String[] strArr = {q999ggg99999qqggqqg9qg("2377726e657e7532266d6f677c6278627e7938046f7c7d6377607f797362747f6d6d69", 83), q999ggg99999qqggqqg9qg("2306031f140f0443571c1e160d1309130f0849751e0d0c12131405181e1506041a050e12141a0f0b", 34), q999ggg99999qqggqqg9qg("236c69757e656e293d76747c677963796562230c61636575636f7a6c64687970606f61767e6562", 72), q999ggg99999qqggqqg9qg("230a0f131803084f5b10121a011f051f0304457c001e18141f1f18091412190a081609021e18160307", 46), q999ggg99999qqggqqg9qg("2375706c677c7730246f6d657e607a607c7b3a1d7d606b6d66716b", 81), q999ggg99999qqggqqg9qg("2376736f647f7433276c6e667d6379637f7839167b797f6f7975716776766f757e6c6c68", 82), q999ggg99999qqggqqg9qg("2325203c372c2760743f3d352e302a302c2b6a4d2d372d3f272a39253b2822202c283c", 1), q999ggg99999qqggqqg9qg("235d58444f545f180c47454d564852485453123e5c4b42434952494e", 121), q999ggg99999qqggqqg9qg("2350554942595215014a48405b455f45595e1f305d5f59495f534353514c5e49454c5c535d4a42595e", 116), q999ggg99999qqggqqg9qg("2345405c574c4700145f5d554e504a504c4b0a2644535a5b514a51565d56464b4a414c5d", 97), q999ggg99999qqggqqg9qg("231c19050e151e594d06040c170913091512536c17030418150d1e13001c02111b19151105", 56), q999ggg99999qqggqqg9qg("217b75343e7f777f7c7e3c38787d616a717a3d3e7d692a29626068736d776d71763718726c617a", 92)};
        int i10 = 0;
        for (int i11 = 0; i11 < 12; i11++) {
            if (cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.q999ggg99999qqggqqg9qg(context, strArr[i11])) {
                i10 |= 1 << i11;
            }
        }
        try {
            BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qqggggg9g9q99q9gq(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qgqq999g[1], new gqq9gqqqq9qgqg9());
            i7 = (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) ? 0 : 1;
        } catch (Exception unused) {
        }
        boolean zBooleanValue = ((Boolean) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.f19106q999ggg99999qqggqqg9qg[2], new qqqqgqg9qgqg9q99qq9qq(wifiManager))).booleanValue();
        if (wifiManager != null && zBooleanValue) {
            i7 |= 2;
        }
        TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService(q999ggg99999qqggqqg9qg("322c33353f", 31));
        try {
            Method declaredMethod = telephonyManager2.getClass().getDeclaredMethod(q999ggg99999qqggqqg9qg("251d0e2f3a0a0a3b34101c11161e", 52), new Class[0]);
            if (declaredMethod != null && ((Boolean) declaredMethod.invoke(telephonyManager2, new Object[0])).booleanValue()) {
                i7 |= 4;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            if (((Boolean) telephonyManager.getClass().getMethod(q999ggg99999qqggqqg9qg("250d1e3f2a1a1a2b24000c01060e", 36), new Class[0]).invoke(telephonyManager, new Object[0])).booleanValue()) {
                i7 |= 4;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return String.valueOf(i10) + q999ggg99999qqggqqg9qg("61", 21) + String.valueOf(i7);
    }

    public static String q999ggg99999qqggqqg9qg(Context context, TelephonyManager telephonyManager) {
        cn.tongdun.android.qgq9qg99.qgqq999g.qgqq999g qgqq999gVar;
        if (!cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.g99q9ggqg9gqgq9) {
            return q999ggg99999qqggqqg9qg("", "", "", "", "", "", "", "", "", "", "", "", "");
        }
        if (!cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.q999ggg99999qqggqqg9qg(context) || (qgqq999gVar = (cn.tongdun.android.qgq9qg99.qgqq999g.qgqq999g) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("21430e14554f474d5f550e014144585348430412594a4b5a56494f450507104e0606104e58064e065858061058060660434c", 101))) == null) {
            Map mapQ999ggg99999qqggqqg9qg = g999q9gg.q999ggg99999qqggqqg9qg(context, telephonyManager);
            String[] strArr = g999q9gg.f19116q999ggg99999qqggqqg9qg;
            return q999ggg99999qqggqqg9qg(mapQ999ggg99999qqggqqg9qg.get(strArr[1]), mapQ999ggg99999qqggqqg9qg.get(strArr[2]), mapQ999ggg99999qqggqqg9qg.get(strArr[3]), mapQ999ggg99999qqggqqg9qg.get(strArr[4]), mapQ999ggg99999qqggqqg9qg.get(strArr[5]), mapQ999ggg99999qqggqqg9qg.get(strArr[6]), mapQ999ggg99999qqggqqg9qg.get(strArr[7]), mapQ999ggg99999qqggqqg9qg.get(strArr[8]), mapQ999ggg99999qqggqqg9qg.get(strArr[9]), mapQ999ggg99999qqggqqg9qg.get(strArr[10]), mapQ999ggg99999qqggqqg9qg.get(strArr[11]), mapQ999ggg99999qqggqqg9qg.get(strArr[12]), mapQ999ggg99999qqggqqg9qg.get(strArr[15]));
        }
        Map mapQ999ggg99999qqggqqg9qg2 = qgqq999gVar.q999ggg99999qqggqqg9qg(context, telephonyManager);
        if (mapQ999ggg99999qqggqqg9qg2 == null) {
            mapQ999ggg99999qqggqqg9qg2 = new HashMap();
        }
        String[] strArr2 = g999q9gg.f19116q999ggg99999qqggqqg9qg;
        return q999ggg99999qqggqqg9qg(mapQ999ggg99999qqggqqg9qg2.get(strArr2[1]), mapQ999ggg99999qqggqqg9qg2.get(strArr2[2]), mapQ999ggg99999qqggqqg9qg2.get(strArr2[3]), mapQ999ggg99999qqggqqg9qg2.get(strArr2[4]), mapQ999ggg99999qqggqqg9qg2.get(strArr2[5]), mapQ999ggg99999qqggqqg9qg2.get(strArr2[6]), mapQ999ggg99999qqggqqg9qg2.get(strArr2[7]), mapQ999ggg99999qqggqqg9qg2.get(strArr2[8]), mapQ999ggg99999qqggqqg9qg2.get(strArr2[9]), mapQ999ggg99999qqggqqg9qg2.get(strArr2[10]), mapQ999ggg99999qqggqqg9qg2.get(strArr2[11]), mapQ999ggg99999qqggqqg9qg2.get(strArr2[12]), mapQ999ggg99999qqggqqg9qg2.get(strArr2[15]));
    }

    private static String q999ggg99999qqggqqg9qg(Display display) {
        try {
            Object objInvoke = Display.class.getDeclaredMethod(q999ggg99999qqggqqg9qg("2532210b08293b27120132383a36321b1f3c38", 27), new Class[0]).invoke(display, new Object[0]);
            return objInvoke != null ? (String) objInvoke : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String q999ggg99999qqggqqg9qg(cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar) {
        if (q999ggg99999qqggqqg9qgVar == null || q999ggg99999qqggqqg9qgVar.qgq9qg99() == null || q999ggg99999qqggqqg9qgVar.qgq9qg99().q999ggg99999qqggqqg9qg() == null) {
            return null;
        }
        return q999ggg99999qqggqqg9qgVar.qgq9qg99().q999ggg99999qqggqqg9qg().toString();
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
            byte b7 = (byte) (i7 ^ 43);
            byte b10 = (byte) (bArr[0] ^ 66);
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

    private static String q999ggg99999qqggqqg9qg(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = objArr[i7];
            if (obj == null) {
                obj = "";
            }
            if (i7 != 0) {
                sb2.append(q999ggg99999qqggqqg9qg("1c58", 115));
            }
            sb2.append(obj);
        }
        return sb2.toString();
    }

    public static String qgq9qg99(Context context, WifiManager wifiManager) {
        cn.tongdun.android.qgq9qg99.qgqq999g.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar;
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qg9gqgqqggg9q9qg && cn.tongdun.android.qgq9qg99.qggqgq99q999g.g99q9ggqg9gqgq9.qgq9qg99(context, q999ggg99999qqggqqg9qg("2306031f140f0443571c1e160d1309130f0849660b090f1f09051505071a081f131a0a050b1c140f08", 34), q999ggg99999qqggqqg9qg("23484d515a414a0d19525058435d475d4146072845474151474b5e48404c5d54444b45525a4146", 108)) && (qqggggg9g9q99q9gqVar = (cn.tongdun.android.qgq9qg99.qgqq999g.qqggggg9g9q99q9gq) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("217e332968727a706268333c7c79656e757e3931707f71666e7572333a2d733b3b2d73653b733b65653b2d653b3b5d6b78", 88))) != null) {
            return qqggggg9g9q99q9gqVar.q999ggg99999qqggqqg9qg(wifiManager);
        }
        return null;
    }

    public static boolean g9qqg99qqg(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = (PackageInfo) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qgq9qg99(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.gqgg9q99qg9[0], new qgq9q9999qg(context));
        } catch (Throwable unused) {
            packageInfo = null;
        }
        if (packageInfo == null) {
            return false;
        }
        int i7 = packageInfo.applicationInfo.flags;
        return ((i7 & 1) == 1) || ((i7 & 128) == 1);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b9 A[PHI: r4
      0x00b9: PHI (r4v2 int) = (r4v1 int), (r4v1 int), (r4v3 int), (r4v4 int) binds: [B:38:0x00a7, B:40:0x00af, B:43:0x00b7, B:46:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    public static String q999ggg99999qqggqqg9qg(Context context, ConnectivityManager connectivityManager) {
        String str;
        NetworkCapabilities networkCapabilities;
        String typeName;
        String str2;
        int i7;
        int i10 = 0;
        NetworkInfo networkInfo = (NetworkInfo) cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.qqggggg9g9q99q9gq[0], new q9g9qqqq9(connectivityManager));
        String str3 = "";
        if (networkInfo != null) {
            if (networkInfo.getType() == 0) {
                Map mapQ999ggg99999qqggqqg9qg = gggggqq9g9qq9gqgq99.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("257e6b68455f70", 66));
                if (mapQ999ggg99999qqggqqg9qg != null && !mapQ999ggg99999qqggqqg9qg.isEmpty()) {
                    str3 = (String) mapQ999ggg99999qqggqqg9qg.get(q999ggg99999qqggqqg9qg("254752517c6649", 123));
                }
                switch (networkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 11:
                    case 16:
                    case 17:
                        str2 = "7060";
                        i7 = 62;
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        str2 = "714e";
                        i7 = 17;
                        break;
                    case 13:
                        str2 = "760e";
                        i7 = 86;
                        break;
                    case 18:
                        str2 = "0b2c293f3d";
                        i7 = 25;
                        break;
                    case 19:
                    default:
                        str2 = "171f0101051c1d";
                        i7 = 47;
                        break;
                    case 20:
                        str2 = "7737";
                        i7 = HomeDialogState.PRIORITY_HIGHEST;
                        break;
                }
                typeName = q999ggg99999qqggqqg9qg(str2, i7);
            } else {
                typeName = networkInfo.getTypeName();
            }
            String str4 = str3;
            str3 = typeName;
            str = str4;
        } else {
            str = "";
        }
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (Exception unused) {
            networkCapabilities = null;
        }
        if (networkCapabilities == null) {
            HelperJNI.q999ggg99999qqggqqg9qg(61, new Object[]{-1});
        } else {
            if (!networkCapabilities.hasTransport(0)) {
                i10 = 1;
                if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(5)) {
                    int i11 = 2;
                    if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                        i11 = 3;
                        if (networkCapabilities.hasTransport(2)) {
                            i10 = i11;
                        } else {
                            i11 = 4;
                            if (networkCapabilities.hasTransport(3)) {
                                i10 = i11;
                            } else {
                                i10 = networkCapabilities.hasTransport(4) ? 5 : 6;
                            }
                        }
                    } else {
                        i10 = i11;
                    }
                }
            }
            HelperJNI.q999ggg99999qqggqqg9qg(61, new Object[]{Integer.valueOf(i10)});
        }
        return q999ggg99999qqggqqg9qg(str, str3);
    }

    public static String q999ggg99999qqggqqg9qg(SensorManager sensorManager, WindowManager windowManager) {
        String strN = null;
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gq9gggq9gq9gg9q99g9q && sensorManager != null) {
            cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q gqg99q9q9qVar = (cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("210e435918020a001218434c0c09151e050e495e15081e1f1e5f4a5d034b4b5d03154b034b15154b5d154b4b2d0f1e", 40));
            List listQqggggg9g9q99q9gq = gqg99q9q9qVar != null ? gqg99q9q9qVar.qqggggg9g9q99q9gq(sensorManager) : null;
            if (listQqggggg9g9q99q9gq != null) {
                HelperJNI.q999ggg99999qqggqqg9qg(42, new Object[]{listQqggggg9g9q99q9gq});
            }
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = windowManager.getDefaultDisplay();
        defaultDisplay.getRealMetrics(displayMetrics);
        String str = displayMetrics.widthPixels + q999ggg99999qqggqqg9qg("3a", 31) + displayMetrics.heightPixels;
        String str2 = displayMetrics.xdpi + q999ggg99999qqggqqg9qg("3a", 91) + displayMetrics.ydpi;
        String strQ9q999qgg99gq9qq9qqq9g = gggggqq9g9qq9gqgq99.q9q999qgg99gq9qq9qqq9g();
        String strQggqgq99q999g = gggggqq9g9qq9gqgq99.qggqgq99q999g();
        String str3 = (String) HelperJNI.q999ggg99999qqggqqg9qg(71, (Object) null);
        int i7 = displayMetrics.widthPixels;
        int i10 = displayMetrics.heightPixels;
        Display.Mode[] supportedModes = defaultDisplay.getSupportedModes();
        if (supportedModes != null) {
            float f10 = i7 * i10;
            for (Display.Mode mode : supportedModes) {
                if (mode != null) {
                    int physicalWidth = mode.getPhysicalWidth();
                    int physicalHeight = mode.getPhysicalHeight();
                    float f11 = physicalWidth * physicalHeight;
                    if (f11 >= f10) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(physicalWidth);
                        strN = d0.n(physicalHeight, q999ggg99999qqggqqg9qg("3a", 60), sb2);
                        f10 = f11;
                    }
                }
            }
        }
        return q999ggg99999qqggqqg9qg("", str, strQ9q999qgg99gq9qq9qqq9g, "", strQggqgq99q999g, str3, str2, strN);
    }
}
