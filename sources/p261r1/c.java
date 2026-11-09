package p261r1;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.arouter.core.LogisticsCenter;
import com.alibaba.android.arouter.exception.HandlerException;
import com.alibaba.android.arouter.exception.InitException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.facade.service.InterceptorService;
import com.alibaba.android.arouter.facade.service.PathReplaceService;
import com.alibaba.android.arouter.facade.template.ILogger;
import com.alibaba.android.arouter.launcher.ARouter;
import com.alibaba.android.arouter.thread.DefaultPoolExecutor;
import com.alibaba.android.arouter.utils.DefaultLogger;
import com.alibaba.android.arouter.utils.TextUtils;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ILogger f41538a = new DefaultLogger("ARouter::");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f41539b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f41540c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile boolean f41541d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile c f41542e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f41543f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile ThreadPoolExecutor f41544g = DefaultPoolExecutor.getInstance();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Handler f41545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Application f41546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static InterceptorService f41547j;

    public static Postcard b(String str, String str2, Boolean bool) {
        PathReplaceService pathReplaceService;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new HandlerException("ARouter::Parameter is invalid!");
        }
        if (!bool.booleanValue() && (pathReplaceService = (PathReplaceService) ARouter.getInstance().navigation(PathReplaceService.class)) != null) {
            str = pathReplaceService.forString(str);
        }
        return new Postcard(str, str2);
    }

    public static synchronized void c() {
        try {
            if (f41540c) {
                f41543f = false;
                LogisticsCenter.suspend();
                f41538a.info("ARouter::", "ARouter destroy success!");
            } else {
                f41538a.error("ARouter::", "Destroy can be used in debug mode only!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("/")) {
            throw new HandlerException("ARouter::Extract the default group failed, the path must be start with '/' and contain more than 2 '/'!");
        }
        try {
            String strSubstring = str.substring(1, str.indexOf("/", 1));
            if (TextUtils.isEmpty(strSubstring)) {
                throw new HandlerException("ARouter::Extract the default group failed! There's nothing between 2 '/'!");
            }
            return strSubstring;
        } catch (Exception e10) {
            f41538a.warning("ARouter::", "Failed to extract default group! " + e10.getMessage());
            return null;
        }
    }

    public static c e() {
        if (!f41543f) {
            throw new InitException("ARouterCore::Init::Invoke init(context) first!");
        }
        if (f41542e == null) {
            synchronized (c.class) {
                try {
                    if (f41542e == null) {
                        f41542e = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f41542e;
    }

    public final Object a(Postcard postcard, int i7, NavigationCallback navigationCallback) {
        Context context = postcard.getContext();
        int i10 = b.f41537a[postcard.getType().ordinal()];
        if (i10 == 1) {
            Intent intent = new Intent(context, postcard.getDestination());
            intent.putExtras(postcard.getExtras());
            int flags = postcard.getFlags();
            if (flags != 0) {
                intent.setFlags(flags);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            String action = postcard.getAction();
            if (!TextUtils.isEmpty(action)) {
                intent.setAction(action);
            }
            a aVar = new a(this, i7, context, intent, postcard, navigationCallback);
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                f41545h.post(aVar);
                return null;
            }
            aVar.run();
            return null;
        }
        if (i10 == 2) {
            return postcard.getProvider();
        }
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            try {
                Object objNewInstance = postcard.getDestination().getConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof Fragment) {
                    ((Fragment) objNewInstance).setArguments(postcard.getExtras());
                    return objNewInstance;
                }
                if (objNewInstance instanceof androidx.fragment.app.Fragment) {
                    ((androidx.fragment.app.Fragment) objNewInstance).setArguments(postcard.getExtras());
                }
                return objNewInstance;
            } catch (Exception e10) {
                f41538a.error("ARouter::", "Fetch fragment instance error, " + TextUtils.formatStackTrace(e10.getStackTrace()));
            }
        }
        return null;
    }
}
