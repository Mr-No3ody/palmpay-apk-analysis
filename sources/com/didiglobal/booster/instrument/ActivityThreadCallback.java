package com.didiglobal.booster.instrument;

import android.app.ActivityThread;
import android.content.res.Resources;
import android.os.DeadSystemException;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.AndroidRuntimeException;
import android.view.WindowManager;
import com.alibaba.android.arouter.utils.Consts;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class ActivityThreadCallback implements Handler.Callback {
    private static final String ASSET_MANAGER_GET_RESOURCE_VALUE = "android.content.res.AssetManager.getResourceValue";
    private static final String LOADED_APK_GET_ASSETS = "android.app.LoadedApk.getAssets";
    private static final String[] SYSTEM_PACKAGE_PREFIXES = {"java.", "android.", "androidx.", "dalvik.", "com.android."};
    private final Handler.Callback mDelegate;
    private final Handler mHandler;
    private final Set<String> mIgnorePackages;

    public ActivityThreadCallback(String[] strArr) {
        HashSet hashSet = new HashSet(Arrays.asList(SYSTEM_PACKAGE_PREFIXES));
        for (String str : strArr) {
            if (str != null) {
                hashSet.add(str.endsWith(Consts.DOT) ? str : str.concat(Consts.DOT));
            }
        }
        hashSet.add(getClass().getPackage().getName() + Consts.DOT);
        this.mIgnorePackages = Collections.unmodifiableSet(hashSet);
        Handler handler = getHandler(getActivityThread());
        this.mHandler = handler;
        this.mDelegate = (Handler.Callback) Reflection.getFieldValue(handler, "mCallback");
    }

    private static boolean abort(Throwable th) {
        Process.killProcess(Process.myPid());
        System.exit(10);
        return true;
    }

    private static Object getActivityThread() {
        Object staticFieldValue;
        try {
            try {
                staticFieldValue = ActivityThread.currentActivityThread();
            } catch (Throwable unused) {
                staticFieldValue = null;
            }
        } catch (Throwable unused2) {
            staticFieldValue = Reflection.getStaticFieldValue(ActivityThread.class, "sCurrentActivityThread");
        }
        if (staticFieldValue != null) {
            return staticFieldValue;
        }
        return null;
    }

    private static Handler getHandler(Object obj) {
        if (obj == null) {
            return null;
        }
        Handler handler = (Handler) Reflection.getFieldValue(obj, "mH");
        if (handler != null) {
            return handler;
        }
        Handler handler2 = (Handler) Reflection.invokeMethod(obj, "getHandler");
        if (handler2 != null) {
            return handler2;
        }
        try {
            Handler handler3 = (Handler) Reflection.getFieldValue(obj, Class.forName("android.app.ActivityThread$H"));
            if (handler3 != null) {
                return handler3;
            }
            return null;
        } catch (ClassNotFoundException unused) {
        }
    }

    private static boolean hasStackTraceElement(Throwable th, String... strArr) {
        return hasStackTraceElement(th, new HashSet(Arrays.asList(strArr)));
    }

    @SafeVarargs
    private static boolean isCausedBy(Throwable th, Class<? extends Throwable>... clsArr) {
        return isCausedBy(th, new HashSet(Arrays.asList(clsArr)));
    }

    private boolean isCausedByUser(Throwable th) {
        if (th == null) {
            return false;
        }
        while (th != null) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (isUserStackTrace(stackTraceElement)) {
                    return true;
                }
            }
            th = th.getCause();
        }
        return false;
    }

    private boolean isUserStackTrace(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        Iterator<String> it = this.mIgnorePackages.iterator();
        while (it.hasNext()) {
            if (className.startsWith(it.next())) {
                return false;
            }
        }
        return true;
    }

    private void rethrowIfCausedByUser(RuntimeException runtimeException) {
        if (isCausedByUser(runtimeException)) {
            for (Throwable cause = runtimeException; cause != null; cause = cause.getCause()) {
                Intrinsics.sanitizeStackTrace(cause, getClass());
            }
            throw runtimeException;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            Handler.Callback callback = this.mDelegate;
            if (callback != null) {
                return callback.handleMessage(message);
            }
            Handler handler = this.mHandler;
            if (handler == null) {
                return true;
            }
            handler.handleMessage(message);
            return true;
        } catch (Resources.NotFoundException e10) {
            e = e10;
            rethrowIfCausedByUser(e);
            return true;
        } catch (AndroidRuntimeException e11) {
            e = e11;
            rethrowIfCausedByUser(e);
            return true;
        } catch (WindowManager.BadTokenException e12) {
            e = e12;
            rethrowIfCausedByUser(e);
            return true;
        } catch (Error e13) {
            rethrowIfCausedByUser(e13);
            return abort(e13);
        } catch (IllegalArgumentException e14) {
            e = e14;
            rethrowIfCausedByUser(e);
            return true;
        } catch (NullPointerException e15) {
            if (hasStackTraceElement(e15, ASSET_MANAGER_GET_RESOURCE_VALUE, LOADED_APK_GET_ASSETS)) {
                return abort(e15);
            }
            rethrowIfCausedByUser(e15);
            return true;
        } catch (SecurityException e16) {
            e = e16;
            rethrowIfCausedByUser(e);
            return true;
        } catch (RuntimeException e17) {
            Throwable cause = e17.getCause();
            if (isCausedBy(cause, (Class<? extends Throwable>[]) new Class[]{DeadSystemException.class}) || (isCausedBy(cause, (Class<? extends Throwable>[]) new Class[]{NullPointerException.class}) && hasStackTraceElement(e17, LOADED_APK_GET_ASSETS))) {
                return abort(e17);
            }
            rethrowIfCausedByUser(e17);
            return true;
        }
    }

    public boolean hook() {
        Handler.Callback callback = this.mDelegate;
        if (callback != null) {
            Objects.toString(callback);
        }
        return Reflection.setFieldValue(this.mHandler, "mCallback", this);
    }

    private static boolean hasStackTraceElement(Throwable th, Set<String> set) {
        if (th == null || set == null || set.isEmpty()) {
            return false;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (set.contains(stackTraceElement.getClassName() + Consts.DOT + stackTraceElement.getMethodName())) {
                return true;
            }
        }
        return hasStackTraceElement(th.getCause(), set);
    }

    private static boolean isCausedBy(Throwable th, Set<Class<? extends Throwable>> set) {
        if (th == null) {
            return false;
        }
        if (set.contains(th.getClass())) {
            return true;
        }
        return isCausedBy(th.getCause(), set);
    }

    private void rethrowIfCausedByUser(Error error) {
        if (isCausedByUser(error)) {
            for (Throwable cause = error; cause != null; cause = cause.getCause()) {
                Intrinsics.sanitizeStackTrace(cause, getClass());
            }
            throw error;
        }
    }
}
