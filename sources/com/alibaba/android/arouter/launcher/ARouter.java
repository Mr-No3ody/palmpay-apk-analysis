package com.alibaba.android.arouter.launcher;

import Na.a;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.alibaba.android.arouter.core.InstrumentationHook;
import com.alibaba.android.arouter.core.LogisticsCenter;
import com.alibaba.android.arouter.exception.HandlerException;
import com.alibaba.android.arouter.exception.InitException;
import com.alibaba.android.arouter.exception.NoRouteFoundException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.service.AutowiredService;
import com.alibaba.android.arouter.facade.service.DegradeService;
import com.alibaba.android.arouter.facade.service.InterceptorService;
import com.alibaba.android.arouter.facade.service.PathReplaceService;
import com.alibaba.android.arouter.facade.service.PretreatmentService;
import com.alibaba.android.arouter.facade.template.ILogger;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.utils.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import p141j9.B;
import p261r1.c;

/* JADX INFO: loaded from: classes.dex */
public final class ARouter {
    public static final String AUTO_INJECT = "wmHzgD4lOj5o4241";
    public static final String RAW_URI = "NTeRQWvye18AkPd6G";
    private static volatile boolean hasInit = false;
    private static volatile ARouter instance;
    public static ILogger logger;

    private ARouter() {
    }

    @Deprecated
    public static void attachBaseContext() {
        ILogger iLogger = c.f41538a;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mInstrumentation");
            declaredField.setAccessible(true);
            declaredField.set(objInvoke, new InstrumentationHook());
        } catch (Exception e10) {
            Log.e("ARouter::", "ARouter hook instrumentation failed! [" + e10.getMessage() + "]");
        }
    }

    @Deprecated
    public static boolean canAutoInject() {
        return c.f41541d;
    }

    public static boolean debuggable() {
        return c.f41540c;
    }

    @Deprecated
    public static synchronized void enableAutoInject() {
        ILogger iLogger = c.f41538a;
        synchronized (c.class) {
            c.f41541d = true;
        }
    }

    public static ARouter getInstance() {
        if (!hasInit) {
            throw new InitException("ARouter::Init::Invoke init(context) first!");
        }
        if (instance == null) {
            synchronized (ARouter.class) {
                try {
                    if (instance == null) {
                        instance = new ARouter();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public static void init(Application application) {
        if (hasInit) {
            return;
        }
        ILogger iLogger = c.f41538a;
        logger = iLogger;
        iLogger.info("ARouter::", "ARouter init start.");
        synchronized (c.class) {
            c.f41546i = application;
            LogisticsCenter.init(application, c.f41544g);
            c.f41538a.info("ARouter::", "ARouter init success!");
            c.f41543f = true;
            c.f41545h = new Handler(Looper.getMainLooper());
        }
        hasInit = true;
        if (hasInit) {
            c.f41547j = (InterceptorService) getInstance().build("/arouter/service/interceptor").navigation();
        }
        c.f41538a.info("ARouter::", "ARouter init over.");
    }

    public static boolean isMonitorMode() {
        return c.f41539b;
    }

    public static synchronized void monitorMode() {
        ILogger iLogger = c.f41538a;
        synchronized (c.class) {
            c.f41539b = true;
            c.f41538a.info("ARouter::", "ARouter monitorMode on");
        }
    }

    public static synchronized void openDebug() {
        ILogger iLogger = c.f41538a;
        synchronized (c.class) {
            c.f41540c = true;
            c.f41538a.info("ARouter::", "ARouter openDebug");
        }
    }

    public static synchronized void openLog() {
        ILogger iLogger = c.f41538a;
        synchronized (c.class) {
            c.f41538a.showLog(true);
            c.f41538a.info("ARouter::", "ARouter openLog");
        }
    }

    public static synchronized void printStackTrace() {
        ILogger iLogger = c.f41538a;
        synchronized (c.class) {
            c.f41538a.showStackTrace(true);
            c.f41538a.info("ARouter::", "ARouter printStackTrace");
        }
    }

    public static synchronized void setExecutor(ThreadPoolExecutor threadPoolExecutor) {
        ILogger iLogger = c.f41538a;
        synchronized (c.class) {
            c.f41544g = threadPoolExecutor;
        }
    }

    public static void setLogger(ILogger iLogger) {
        if (iLogger != null) {
            c.f41538a = iLogger;
        } else {
            ILogger iLogger2 = c.f41538a;
        }
    }

    public boolean addRouteGroup(IRouteGroup iRouteGroup) {
        c.e().getClass();
        if (iRouteGroup == null) {
            return false;
        }
        try {
            HashMap map = new HashMap();
            iRouteGroup.loadInto(map);
            String str = null;
            for (Map.Entry entry : map.entrySet()) {
                String strD = c.d((String) entry.getKey());
                RouteMeta routeMeta = (RouteMeta) entry.getValue();
                if (str == null) {
                    str = strD;
                }
                if (str != null && str.equals(strD) && str.equals(routeMeta.getGroup())) {
                }
                return false;
            }
            LogisticsCenter.addRouteGroupDynamic(str, iRouteGroup);
            c.f41538a.info("ARouter::", "Add route group [" + str + "] finish, " + map.size() + " new route meta.");
            return true;
        } catch (Exception e10) {
            c.f41538a.error("ARouter::", "Add route group dynamic exception!", e10);
            return false;
        }
    }

    public Postcard build(String str) {
        c.e().getClass();
        if (TextUtils.isEmpty(str)) {
            throw new HandlerException("ARouter::Parameter is invalid!");
        }
        PathReplaceService pathReplaceService = (PathReplaceService) getInstance().navigation(PathReplaceService.class);
        if (pathReplaceService != null) {
            str = pathReplaceService.forString(str);
        }
        return c.b(str, c.d(str), Boolean.TRUE);
    }

    public synchronized void destroy() {
        c.c();
        hasInit = false;
    }

    public void inject(Object obj) {
        ILogger iLogger = c.f41538a;
        AutowiredService autowiredService = (AutowiredService) getInstance().build("/arouter/service/autowired").navigation();
        if (autowiredService != null) {
            autowiredService.autowire(obj);
        }
    }

    public <T> T navigation(Class<? extends T> cls) {
        c.e().getClass();
        try {
            Postcard postcardBuildProvider = LogisticsCenter.buildProvider(cls.getName());
            if (postcardBuildProvider == null) {
                postcardBuildProvider = LogisticsCenter.buildProvider(cls.getSimpleName());
            }
            if (postcardBuildProvider == null) {
                return null;
            }
            postcardBuildProvider.setContext(c.f41546i);
            LogisticsCenter.completion(postcardBuildProvider);
            return (T) postcardBuildProvider.getProvider();
        } catch (NoRouteFoundException e10) {
            c.f41538a.warning("ARouter::", e10.getMessage());
            return null;
        }
    }

    @Deprecated
    public Postcard build(String str, String str2) {
        c cVarE = c.e();
        Boolean bool = Boolean.FALSE;
        cVarE.getClass();
        return c.b(str, str2, bool);
    }

    public Postcard build(Uri uri) {
        c.e().getClass();
        if (uri != null && !TextUtils.isEmpty(uri.toString())) {
            PathReplaceService pathReplaceService = (PathReplaceService) getInstance().navigation(PathReplaceService.class);
            if (pathReplaceService != null) {
                uri = pathReplaceService.forUri(uri);
            }
            return new Postcard(uri.getPath(), c.d(uri.getPath()), uri, null);
        }
        throw new HandlerException("ARouter::Parameter invalid!");
    }

    public Object navigation(Context context, Postcard postcard, int i7, NavigationCallback navigationCallback) {
        c cVarE = c.e();
        cVarE.getClass();
        PretreatmentService pretreatmentService = (PretreatmentService) getInstance().navigation(PretreatmentService.class);
        if (pretreatmentService == null || pretreatmentService.onPretreatment(context, postcard)) {
            postcard.setContext(context == null ? c.f41546i : context);
            try {
                LogisticsCenter.completion(postcard);
                if (navigationCallback != null) {
                    navigationCallback.onFound(postcard);
                }
                if (!postcard.isGreenChannel()) {
                    c.f41547j.doInterceptions(postcard, new a(cVarE, i7, navigationCallback, postcard));
                    return null;
                }
                return cVarE.a(postcard, i7, navigationCallback);
            } catch (NoRouteFoundException e10) {
                c.f41538a.warning("ARouter::", e10.getMessage());
                if (c.f41540c) {
                    B b7 = new B(postcard, 7);
                    if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                        c.f41545h.post(b7);
                    } else {
                        b7.run();
                    }
                }
                if (navigationCallback != null) {
                    navigationCallback.onLost(postcard);
                } else {
                    DegradeService degradeService = (DegradeService) getInstance().navigation(DegradeService.class);
                    if (degradeService != null) {
                        degradeService.onLost(context, postcard);
                    }
                }
            }
        }
        return null;
    }
}
