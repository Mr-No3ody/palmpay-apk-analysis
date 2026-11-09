package com.palmpay.lib.webview;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.MessageQueue;
import android.webkit.WebView;
import com.palmpay.lib.webview.cache.WebCache;
import com.palmpay.lib.webview.util.Reflection;

/* JADX INFO: loaded from: classes3.dex */
public class WebInit {

    public static class WebViewPoolHandler implements MessageQueue.IdleHandler {
        private final Context context;

        public WebViewPoolHandler(Context context) {
            this.context = context;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            WebInit.startChromiumEngine(this.context);
            return false;
        }
    }

    public static void init(Context context, boolean z3) {
        initWebCache(context, z3);
    }

    private static void initWebCache(Context context, boolean z3) {
        WebCache webCache = WebCache.INSTANCE;
        webCache.init(context, z3);
        webCache.enable(true);
    }

    public static Boolean startChromiumEngine(Context context) {
        try {
            Object objInvokeStaticMethod = Reflection.invokeStaticMethod(Class.forName("android.webkit.WebViewFactory"), "getProvider");
            Class[] clsArr = {Boolean.TYPE};
            Boolean bool = Boolean.TRUE;
            Reflection.invokeMethod(objInvokeStaticMethod, "startYourEngines", clsArr, new Object[]{bool});
            if (Build.VERSION.SDK_INT >= 28) {
                String processName = Application.getProcessName();
                if (!context.getPackageName().equals(processName)) {
                    WebView.setDataDirectorySuffix(processName);
                }
            }
            return bool;
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }
}
