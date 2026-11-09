package androidx.work.impl.utils;

import V0.C;
import V0.C0684c;
import V0.U;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    static {
        Intrinsics.checkNotNullExpressionValue(C.d("ProcessUtils"), "tagWithPrefix(\"ProcessUtils\")");
    }

    public static final boolean a(Context context, C0684c configuration) {
        String strA;
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            strA = a.a();
        } else {
            strA = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, U.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                Intrinsics.e(objInvoke);
                if (objInvoke instanceof String) {
                    strA = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    Intrinsics.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strA = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable unused) {
                C.c().getClass();
            }
        }
        configuration.getClass();
        return Intrinsics.c(strA, context.getApplicationInfo().processName);
    }
}
