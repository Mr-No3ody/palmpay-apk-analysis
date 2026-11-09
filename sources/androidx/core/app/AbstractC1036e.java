package androidx.core.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.app.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1036e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f15969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f15970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f15971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f15972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f15973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f15974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Handler f15975g = new Handler(Looper.getMainLooper());

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f15969a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f15970b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f15971c = declaredField2;
        Class cls2 = f15969a;
        Class cls3 = Boolean.TYPE;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls3, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        f15972d = declaredMethod;
        Class cls4 = f15969a;
        if (cls4 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls3);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f15973e = declaredMethod2;
        Class cls5 = f15969a;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 == 26 || i7 == 27) && cls5 != null) {
            try {
                Class cls6 = Integer.TYPE;
                Class cls7 = Boolean.TYPE;
                Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls6, cls7, Configuration.class, Configuration.class, cls7, cls7);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f15974f = method;
    }
}
