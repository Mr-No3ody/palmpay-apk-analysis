package G6;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.n;
import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f3027a = {"huawei"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f3028b = {Constants.REFERRER_API_VIVO};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f3029c = {Constants.REFERRER_API_XIAOMI};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f3030d = {"oppo"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f3031e = {"leeco", "letv"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f3032f = {"360", "qiku"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f3033g = {"zte"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f3034h = {"oneplus"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f3035i = {"nubia"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f3036j = {"coolpad", "yulong"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f3037k = {"lg", "lge"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f3038l = {Constants.REFERRER_API_GOOGLE};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f3039m = {Constants.REFERRER_API_SAMSUNG};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f3040n = {"meizu"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f3041o = {"lenovo"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f3042p = {"smartisan", "deltainno"};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String[] f3043q = {"htc"};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f3044r = {"sony"};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f3045s = {"gionee", "amigo"};
    public static final String[] t = {"motorola"};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static b f3046u = null;

    public static String a() {
        String strTrim;
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        String str2;
        String str3 = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            strTrim = bufferedReader.readLine().trim();
            bufferedReader.close();
        } catch (Exception e10) {
            e10.printStackTrace();
            strTrim = "";
        }
        if (!TextUtils.isEmpty(strTrim)) {
            return strTrim;
        }
        try {
            ActivityManager activityManager = (ActivityManager) n.l().getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                int iMyPid = Process.myPid();
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid && (str2 = next.processName) != null) {
                        str = str2;
                        break;
                    }
                }
            } else {
                str = "";
                break;
            }
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Application applicationL = n.l();
            Field field = applicationL.getClass().getField("mLoadedApk");
            field.setAccessible(true);
            Object obj = field.get(applicationL);
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            str3 = (String) obj2.getClass().getDeclaredMethod("getProcessName", new Class[0]).invoke(obj2, new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return str3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d A[PHI: r0
      0x004d: PHI (r0v10 java.lang.String) = (r0v2 java.lang.String), (r0v4 java.lang.String), (r0v4 java.lang.String) binds: [B:23:0x004b, B:29:0x0071, B:32:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:40:0x00a5, B:42:0x00ad), top: B:53:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String b(String str) {
        String str2;
        String property;
        String lowerCase = "";
        if (!TextUtils.isEmpty(str)) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(str)).getInputStream()), 1024);
                    try {
                        property = bufferedReader2.readLine();
                        if (property != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused) {
                            }
                        } else {
                            bufferedReader2.close();
                            property = "";
                        }
                    } catch (IOException unused2) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        property = "";
                        if (TextUtils.isEmpty(property)) {
                            try {
                                Properties properties = new Properties();
                                properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
                                property = properties.getProperty(str, "");
                            } catch (Exception unused3) {
                                property = "";
                            }
                            if (TextUtils.isEmpty(property)) {
                                try {
                                    Class<?> cls = Class.forName("android.os.SystemProperties");
                                    lowerCase = (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
                                } catch (Exception unused4) {
                                }
                            } else {
                                lowerCase = property;
                            }
                        } else {
                            lowerCase = property;
                        }
                        if (TextUtils.isEmpty(lowerCase)) {
                            str2 = Build.DISPLAY;
                            if (!TextUtils.isEmpty(str2)) {
                                lowerCase = str2.toLowerCase();
                            }
                        } else {
                            try {
                                str2 = Build.DISPLAY;
                                if (!TextUtils.isEmpty(str2)) {
                                    lowerCase = str2.toLowerCase();
                                }
                            } catch (Throwable unused5) {
                            }
                        }
                        if (TextUtils.isEmpty(lowerCase)) {
                            return "unknown";
                        }
                        return lowerCase;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused6) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused7) {
                }
            } catch (IOException unused8) {
            } catch (Throwable th2) {
                th = th2;
            }
            if (TextUtils.isEmpty(property)) {
                lowerCase = property;
            } else {
                Properties properties2 = new Properties();
                properties2.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
                property = properties2.getProperty(str, "");
                if (TextUtils.isEmpty(property) && Build.VERSION.SDK_INT < 28) {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    lowerCase = (String) cls2.getMethod("get", String.class, String.class).invoke(cls2, str, "");
                } else {
                    lowerCase = property;
                }
            }
        }
        if (TextUtils.isEmpty(lowerCase) || lowerCase.equals("unknown")) {
            str2 = Build.DISPLAY;
            if (!TextUtils.isEmpty(str2)) {
                lowerCase = str2.toLowerCase();
            }
        }
        if (TextUtils.isEmpty(lowerCase)) {
            return "unknown";
        }
        return lowerCase;
    }

    public static boolean c(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!Character.isWhitespace(str.charAt(i7))) {
                return false;
            }
        }
        return true;
    }
}
