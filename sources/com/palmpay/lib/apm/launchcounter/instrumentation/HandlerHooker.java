package com.palmpay.lib.apm.launchcounter.instrumentation;

import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.palmpay.lib.apm.launchcounter.reflection.Reflection;
import com.palmpay.lib.apm.launchcounter.util.LaunchUtils;
import com.palmpay.lib.apm.launchcounter.util.ReflectUtils;

/* JADX INFO: loaded from: classes3.dex */
public class HandlerHooker {
    private static final String TAG = "HandlerHooker";
    private static boolean isHookSucceed = false;

    public static void doHook(Application application) {
        if (application != null) {
            try {
                if (isHookSucceed()) {
                    return;
                }
                LaunchUtils.init(application);
                if (Build.VERSION.SDK_INT >= 28) {
                    Reflection.unseal(application);
                }
                hookInstrumentation();
                isHookSucceed = true;
            } catch (Exception e10) {
                Log.e(TAG, "doHook: ", e10);
            }
        }
    }

    private static void hookInstrumentation() {
        Handler handler = (Handler) ReflectUtils.reflect(ReflectUtils.reflect("android.app.ActivityThread").method("currentActivityThread").get()).field("mH").get();
        ReflectUtils.reflect(handler).field("mCallback", new ProxyHandlerCallback((Handler.Callback) ReflectUtils.reflect(handler).field("mCallback").get(), handler));
    }

    public static boolean isHookSucceed() {
        return isHookSucceed;
    }
}
