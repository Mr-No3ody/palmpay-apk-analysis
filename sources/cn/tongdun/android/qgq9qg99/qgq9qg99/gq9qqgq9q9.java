package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import cn.tongdun.android.shell.TDOption;
import cn.tongdun.android.shell.common.HelperJNI;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class gq9qqgq9q9 {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static volatile gq9qqgq9q9 f19154q999ggg99999qqggqqg9qg;
    private WindowManager gqg99q9q9q;
    private TelephonyManager gqgg9q99qg9;
    private LocationManager q99q99qq99q9g;
    private ConnectivityManager q9q999qgg99gq9qq9qqq9g;
    private ActivityManager qg9gqgqqggg9q9qg;
    private SensorManager qggqgq99q999g;
    private cn.tongdun.android.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg qgq9qg99;
    private WifiManager qgqq999g;
    private gg9q9qgg9gg9qg9q9ggq9 qqg999qq;
    private Context qqggggg9g9q99q9gq;
    private long qq9gg99gqqqgqgq999gqg = 0;
    private final Object gqgqgq9qqqg999qggqqqg = new Object();

    private gq9qqgq9q9(Context context) {
        this.qgq9qg99 = null;
        this.gqgg9q99qg9 = null;
        this.qgqq999g = null;
        this.qg9gqgqqggg9q9qg = null;
        this.gqg99q9q9q = null;
        this.q9q999qgg99gq9qq9qqq9g = null;
        this.qggqgq99q999g = null;
        this.q99q99qq99q9g = null;
        this.qqg999qq = null;
        this.qqggggg9g9q99q9gq = context;
        this.qgq9qg99 = new cn.tongdun.android.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg();
        this.qqg999qq = new gg9q9qgg9gg9qg9q9ggq9();
        try {
            this.gqgg9q99qg9 = (TelephonyManager) context.getSystemService("phone");
            this.qgqq999g = (WifiManager) context.getSystemService("wifi");
            this.qg9gqgqqggg9q9qg = (ActivityManager) context.getSystemService("activity");
            this.gqg99q9q9q = (WindowManager) context.getSystemService("window");
            this.q9q999qgg99gq9qq9qqq9g = (ConnectivityManager) context.getSystemService("connectivity");
            this.q99q99qq99q9g = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
            if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gq9gggq9gq9gg9q99g9q) {
                this.qggqgq99q999g = (SensorManager) context.getSystemService("sensor");
            }
        } catch (Exception unused) {
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.q9q999qgg99gq9qq9qqq9g, "get system service error");
        }
    }

    public static String g99gq9qg9gggq9qgg() {
        cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q gqg99q9q9qVar = (cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg("cn.tongdun.android.sensor.g99q9ggq99qgq9gq9q_SN");
        return gqg99q9q9qVar != null ? gqg99q9q9qVar.qqggggg9g9q99q9gq() : "[]";
    }

    public static String g99q9ggqg9gqgq9() {
        return qg9qqq999gq.q9q9gqgqg9qgqg9qggq9();
    }

    public static String g9g9ggqqggqq99gqq9q99() {
        cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q gqg99q9q9qVar = (cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg("cn.tongdun.android.sensor.g99q9ggq99qgq9gq9q_SN");
        return gqg99q9q9qVar != null ? gqg99q9q9qVar.qgqq999g() : "[]";
    }

    public static String g9g9q9qq9() {
        cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q gqg99q9q9qVar = (cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg("cn.tongdun.android.sensor.g99q9ggq99qgq9gq9q_SN");
        return gqg99q9q9qVar != null ? gqg99q9q9qVar.gqgg9q99qg9() : "[]";
    }

    public static String g9qqg99qqg() {
        return qg9qqq999gq.g9qqg99qqg();
    }

    public static String ggg9gqqgq99q9g9gq9g9() {
        return qg9qqq999gq.gqgqgq9qqqg999qggqqqg();
    }

    public static String ggq999qqgqgq9g9qqq() {
        return qg9qqq999gq.gq9gggq9gq9gg9q99g9q();
    }

    public static Object ggq9qqq(Context context) {
        return qg9qqq999gq.gqq9gqqqq9qgqg9(context);
    }

    public static String gq9g999g999() {
        return qg9qqq999gq.g99gq9qg9gggq9qgg();
    }

    public static String gq9gggq9gq9gg9q99g9q() {
        return qg9qqq999gq.qgqq999g();
    }

    public static String gq9qqgq9q9() {
        return qg9qqq999gq.q99g9q99();
    }

    public static int gqgqgq9qqqg999qggqqqg() {
        return qg9qqq999gq.gqgg9q99qg9();
    }

    public static String gqq9gqqqq9qgqg9() {
        return qg9qqq999gq.g9g9ggqqggqq99gqq9q99();
    }

    public static String gqqgggqgg99qg9() {
        return qg9qqq999gq.gqg99q9q9q();
    }

    public static String q999qqg() {
        return qg9qqq999gq.qq9gg9q();
    }

    public static String q99g9q99() {
        return qg9qqq999gq.g99q9ggqg9gqgq9();
    }

    public static int q99q99qq99q9g(Context context) {
        return qg9qqq999gq.gqgqgq9qqqg999qggqqqg(context);
    }

    public static Integer q9q9gqgqg9qgqg9qggq9() {
        return qg9qqq999gq.q999qqg();
    }

    public static String qg9qqq999gq() {
        cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q gqg99q9q9qVar = (cn.tongdun.android.qgq9qg99.qgqq999g.gqg99q9q9q) cn.tongdun.android.qgq9qg99.qgqq999g.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg("cn.tongdun.android.sensor.g99q9ggq99qgq9gq9q_SN");
        return gqg99q9q9qVar != null ? gqg99q9q9qVar.qg9gqgqqggg9q9qg() : "[]";
    }

    public static String qgq9q9999qg(Context context) {
        return qg9qqq999gq.gq9g999g999(context);
    }

    public static int qgqgq9qq9ggggg9g(Context context) {
        return qg9qqq999gq.qqqqgqg9qgqg9q99qq9qq(context);
    }

    public static String qq9gg99gqqqgqgq999gqg() throws Throwable {
        return qg9qqq999gq.ggq999qqgqgq9g9qqq();
    }

    public static String qq9gg9q() {
        return qg9qqq999gq.qg9gqgqqggg9q9qg();
    }

    public static long qqg999qq(Context context) {
        return qg9qqq999gq.gqg99q9q9q(context);
    }

    public static String qqqqgqg9qgqg9q99qq9qq() {
        return qg9qqq999gq.qg9qqq999gq();
    }

    public static String g99q9ggqg9gqgq9(Context context) {
        return qg9qqq999gq.qq9gg9q(context);
    }

    public static String g9qqg99qqg(Context context) {
        return qg9qqq999gq.gq9qqgq9q9();
    }

    public static String ggg9gqqgq99q9g9gq9g9(Context context) {
        return qg9qqq999gq.g99gq9qg9gggq9qgg(context);
    }

    public static String ggq999qqgqgq9g9qqq(Context context) {
        return qg9qqq999gq.g9g9q9qq9(context);
    }

    public static String gq9g999g999(Context context) {
        return qg9qqq999gq.q9q9gqgqg9qgqg9qggq9(context);
    }

    public static String gq9gggq9gq9gg9q99g9q(Context context) {
        return qg9qqq999gq.q99q99qq99q9g(context);
    }

    public static String gq9qqgq9q9(Context context) {
        return qg9qqq999gq.qq9gg99gqqqgqgq999gqg(context);
    }

    public static String gqg99q9q9q(Context context) {
        return qg9qqq999gq.qgqq999g(context);
    }

    public static String gqgg9q99qg9() {
        return qg9qqq999gq.q999ggg99999qqggqqg9qg();
    }

    public static String gqgqgq9qqqg999qggqqqg(Context context) {
        return qg9qqq999gq.qggqgq99q999g(context);
    }

    public static String gqq9gqqqq9qgqg9(Context context) {
        return qg9qqq999gq.g9g9ggqqggqq99gqq9q99(context);
    }

    public static Object gqqgggqgg99qg9(Context context) {
        return qg9qqq999gq.ggg9gqqgq99q9g9gq9g9(context);
    }

    public static gq9qqgq9q9 q999ggg99999qqggqqg9qg(Context context) {
        if (f19154q999ggg99999qqggqqg9qg == null) {
            synchronized (gq9qqgq9q9.class) {
                try {
                    if (f19154q999ggg99999qqggqqg9qg == null) {
                        f19154q999ggg99999qqggqqg9qg = new gq9qqgq9q9(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19154q999ggg99999qqggqqg9qg;
    }

    public static String q999qqg(Context context) {
        return qg9qqq999gq.gq9gggq9gq9gg9q99g9q(context);
    }

    public static String q99g9q99(Context context) {
        return qg9qqq999gq.q999qqg(context);
    }

    public static String q99q99qq99q9g() {
        return qg9qqq999gq.qggqgq99q999g();
    }

    public static String q9q999qgg99gq9qq9qqq9g(Context context) {
        return qg9qqq999gq.qg9gqgqqggg9q9qg(context);
    }

    public static boolean q9q9gqgqg9qgqg9qggq9(Context context) {
        return qg9qqq999gq.ggq999qqgqgq9g9qqq(context);
    }

    public static String qg9gqgqqggg9q9qg(Context context) {
        return qg9qqq999gq.gqgg9q99qg9(context);
    }

    public static String qggqgq99q999g(Context context) {
        return cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q9gqgqg9qgqg9qggq9.q999ggg99999qqggqqg9qg(context);
    }

    public static String qgq9q9999qg() {
        return qg9qqq999gq.g9g9q9qq9();
    }

    public static String qgqq999g() {
        return qg9qqq999gq.qgq9qg99();
    }

    public static String qq9gg99gqqqgqgq999gqg(Context context) {
        return qg9qqq999gq.q9q999qgg99gq9qq9qqq9g(context);
    }

    public static String qq9gg9q(Context context) {
        return qg9qqq999gq.qqg999qq(context);
    }

    public static String qqg999qq() {
        return qg9qqq999gq.qq9gg99gqqqgqgq999gqg();
    }

    public static String qqqqgqg9qgqg9q99qq9qq(Context context) {
        return qg9qqq999gq.qg9qqq999gq(context);
    }

    @Nullable
    public final byte[] qgq9qg99() {
        try {
            return q999ggg99999qqggqqg9qg(this.qgq9qg99, "complete");
        } catch (Throwable th) {
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qg9gqgqqggg9q9qg, cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(th));
            return null;
        }
    }

    @Nullable
    public final String qqggggg9g9q99q9gq() {
        try {
            byte[] bArrQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg(this.qgq9qg99, "demotion");
            if (bArrQ999ggg99999qqggqqg9qg != null) {
                return new String(bArrQ999ggg99999qqggqqg9qg, "utf-8");
            }
            return null;
        } catch (Throwable th) {
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qg9gqgqqggg9q9qg, cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(th));
            return null;
        }
    }

    public static String gqg99q9q9q() {
        return cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q9gqgqg9qgqg9qggq9.q999ggg99999qqggqqg9qg();
    }

    public static String gqgg9q99qg9(Context context) {
        return qg9qqq999gq.qgq9qg99(context);
    }

    public static String q9q999qgg99gq9qq9qqq9g() {
        return qg9qqq999gq.q99q99qq99q9g();
    }

    public static String qg9gqgqqggg9q9qg() {
        return qg9qqq999gq.q9q999qgg99gq9qq9qqq9g();
    }

    public static String qggqgq99q999g() {
        return qg9qqq999gq.qqg999qq();
    }

    public static String qgqq999g(Context context) {
        return qg9qqq999gq.qqggggg9g9q99q9gq(context);
    }

    public static Integer g99gq9qg9gggq9qgg(Context context) {
        return qg9qqq999gq.g99q9ggqg9gqgq9(context);
    }

    public static String g9g9ggqqggqq99gqq9q99(Context context) {
        return qg9qqq999gq.gq9qqgq9q9(context);
    }

    public static String g9g9q9qq9(Context context) {
        return qg9qqq999gq.q99g9q99(context);
    }

    public static boolean qg9qqq999gq(Context context) {
        return qg9qqq999gq.g9qqg99qqg(context);
    }

    public static String qgq9qg99(Context context) {
        return qg9qqq999gq.q999ggg99999qqggqqg9qg(context);
    }

    public static String qgq9qg99(Context context, WifiManager wifiManager) {
        return qg9qqq999gq.qgq9qg99(context, wifiManager);
    }

    public static String qqggggg9g9q99q9gq(Context context) {
        return qg9qqq999gq.qqggggg9g9q99q9gq();
    }

    public static String qgq9qg99(Context context, ActivityManager activityManager) {
        return qg9qqq999gq.q999ggg99999qqggqqg9qg(activityManager);
    }

    public static Integer qqggggg9g9q99q9gq(Context context, WifiManager wifiManager) {
        return qg9qqq999gq.qqggggg9g9q99q9gq(context, wifiManager);
    }

    public static int qgq9qg99(Context context, LocationManager locationManager) {
        return qg9qqq999gq.qgq9qg99(context, locationManager);
    }

    public final void q999ggg99999qqggqqg9qg(TDOption tDOption, CountDownLatch countDownLatch, CountDownLatch countDownLatch2) {
        if (this.qgq9qg99 == null) {
            for (int i7 = 0; i7 < countDownLatch2.getCount(); i7++) {
                countDownLatch2.countDown();
            }
            return;
        }
        this.qq9gg99gqqqgqgq999gqg = System.currentTimeMillis();
        String partnerCode = TextUtils.isEmpty(tDOption.getPartnerCode()) ? cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g : tDOption.getPartnerCode();
        HelperJNI.q999ggg99999qqggqqg9qg(7, (Object) null);
        cn.tongdun.android.qgq9qg99.qggqgq99q999g.qq9gg99gqqqgqgq999gqg.qgq9qg99();
        cn.tongdun.android.qgq9qg99.qggqgq99q999g.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.SECONDS, new LinkedBlockingDeque(1), new cn.tongdun.android.q999ggg99999qqggqqg9qg.gqgg9q99qg9.qgq9qg99());
        cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVarQ999ggg99999qqggqqg9qg = cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
        threadPoolExecutor.execute(new g9qqg99qqg(this, q999ggg99999qqggqqg9qgVarQ999ggg99999qqggqqg9qg, partnerCode, tDOption, countDownLatch, countDownLatch2));
        threadPoolExecutor.execute(new g99gq9qg9gggq9qgg(this, partnerCode, tDOption, countDownLatch2));
        threadPoolExecutor.execute(new g9g9ggqqggqq99gqq9q99(this, partnerCode, tDOption, q999ggg99999qqggqqg9qgVarQ999ggg99999qqggqqg9qg, countDownLatch2));
        threadPoolExecutor.shutdown();
    }

    public final void q999ggg99999qqggqqg9qg() {
        cn.tongdun.android.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qgq9qg99;
        if (q999ggg99999qqggqqg9qgVar != null) {
            q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qq9gg99.q999ggg99999qqggqqg9qg(this.qq9gg99gqqqgqgq999gqg));
        }
    }

    @Nullable
    private byte[] q999ggg99999qqggqqg9qg(cn.tongdun.android.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, String str) throws Throwable {
        synchronized (this.gqgqgq9qqqg999qggqqqg) {
            try {
                cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgqq999g.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qgVar, str, null);
                byte[] bArr = (byte[]) HelperJNI.q999ggg99999qqggqqg9qg(12, new Object[]{Boolean.valueOf("demotion".equals(str))});
                if (bArr == null) {
                    return null;
                }
                if ("complete".equals(str)) {
                    return bArr;
                }
                return Base64.encode(bArr, 11);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String q999ggg99999qqggqqg9qg(Context context, TelephonyManager telephonyManager) {
        return qg9qqq999gq.q999ggg99999qqggqqg9qg(context, telephonyManager);
    }

    public static String q999ggg99999qqggqqg9qg(Context context, WifiManager wifiManager) {
        return qg9qqq999gq.q999ggg99999qqggqqg9qg(context, wifiManager);
    }

    public static String q999ggg99999qqggqqg9qg(Context context, ConnectivityManager connectivityManager, WifiManager wifiManager) {
        return qg9qqq999gq.q999ggg99999qqggqqg9qg(context, connectivityManager, wifiManager);
    }

    public static String q999ggg99999qqggqqg9qg(Context context, ConnectivityManager connectivityManager) {
        return qg9qqq999gq.q999ggg99999qqggqqg9qg(context, connectivityManager);
    }

    public static String q999ggg99999qqggqqg9qg(Context context, ActivityManager activityManager) {
        return new StringBuilder(cn.tongdun.android.qgq9qg99.qggqgq99q999g.q9q9gqgqg9qgqg9qggq9.q999ggg99999qqggqqg9qg(context, activityManager)).toString();
    }

    public static String q999ggg99999qqggqqg9qg(SensorManager sensorManager, WindowManager windowManager) {
        return qg9qqq999gq.q999ggg99999qqggqqg9qg(sensorManager, windowManager);
    }

    public static String q999ggg99999qqggqqg9qg(Context context, LocationManager locationManager) {
        return qg9qqq999gq.q999ggg99999qqggqqg9qg(context, locationManager);
    }

    public static Long q999ggg99999qqggqqg9qg(long j6) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j6;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 1;
        }
        return Long.valueOf(jCurrentTimeMillis);
    }

    public static String q999ggg99999qqggqqg9qg(Context context, WifiManager wifiManager, ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        return qg9qqq999gq.q999ggg99999qqggqqg9qg(context, wifiManager, connectivityManager, telephonyManager);
    }

    public static String q999ggg99999qqggqqg9qg(cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar) {
        return qg9qqq999gq.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qgVar);
    }
}
