package com.palmpay.lib.webview.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¨\u0006\u0015"}, d2 = {"Lcom/palmpay/lib/webview/util/WebUtil;", "", "<init>", "()V", "getStatusBarHeight", "", "context", "Landroid/content/Context;", "transparencyBar", "", "activity", "Landroid/app/Activity;", "statusBarLightMode", "type", "statusBarDarkMode", "flymeSetStatusBarLightMode", "", "window", "Landroid/view/Window;", "dark", "mIUISetStatusBarLightMode", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebUtil {

    @NotNull
    public static final WebUtil INSTANCE = new WebUtil();

    private WebUtil() {
    }

    private final boolean flymeSetStatusBarLightMode(Window window, boolean dark) {
        if (window == null) {
            return false;
        }
        try {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Intrinsics.checkNotNullExpressionValue(declaredField, "getDeclaredField(...)");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            Intrinsics.checkNotNullExpressionValue(declaredField2, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i7 = declaredField.getInt(null);
            int i10 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, dark ? i10 | i7 : (~i7) & i10);
            window.setAttributes(attributes);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private final boolean mIUISetStatusBarLightMode(Activity activity, boolean dark) {
        Window window = activity.getWindow();
        if (window == null) {
            return false;
        }
        Class<?> cls = window.getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            Field field = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE");
            Intrinsics.checkNotNullExpressionValue(field, "getField(...)");
            int i7 = field.getInt(cls2);
            Class cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            if (dark) {
                method.invoke(window, Integer.valueOf(i7), Integer.valueOf(i7));
            } else {
                method.invoke(window, 0, Integer.valueOf(i7));
            }
            try {
                if (dark) {
                    activity.getWindow().getDecorView().setSystemUiVisibility(9216);
                    return true;
                }
                activity.getWindow().getDecorView().setSystemUiVisibility(0);
                return true;
            } catch (Exception unused) {
                return true;
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    @SuppressLint({"InternalInsetResource", "DiscouragedApi"})
    public final int getStatusBarHeight(@Nullable Context context) {
        Context applicationContext;
        Resources resources;
        DisplayMetrics displayMetrics;
        Context applicationContext2;
        Resources resources2;
        try {
            int identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = (context == null || (applicationContext2 = context.getApplicationContext()) == null || (resources2 = applicationContext2.getResources()) == null) ? 0 : resources2.getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize && Build.VERSION.SDK_INT < 29) {
                    return dimensionPixelSize2;
                }
                float f10 = (dimensionPixelSize * Resources.getSystem().getDisplayMetrics().density) / ((context == null || (applicationContext = context.getApplicationContext()) == null || (resources = applicationContext.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density);
                return (int) (f10 >= 0.0f ? f10 + 0.5f : f10 - 0.5f);
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    public final void statusBarDarkMode(@NotNull Activity activity, int type) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (type == 1) {
            mIUISetStatusBarLightMode(activity, false);
        } else if (type == 2) {
            flymeSetStatusBarLightMode(activity.getWindow(), false);
        } else {
            if (type != 3) {
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(0);
        }
    }

    public final int statusBarLightMode(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (mIUISetStatusBarLightMode(activity, true)) {
            return 1;
        }
        if (flymeSetStatusBarLightMode(activity.getWindow(), true)) {
            return 2;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(9216);
        return 3;
    }

    @TargetApi(19)
    public final void transparencyBar(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public final int statusBarDarkMode(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (mIUISetStatusBarLightMode(activity, false)) {
            return 1;
        }
        if (flymeSetStatusBarLightMode(activity.getWindow(), false)) {
            return 2;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(0);
        return 3;
    }

    public final void statusBarLightMode(@NotNull Activity activity, int type) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (type == 1) {
            mIUISetStatusBarLightMode(activity, true);
        } else if (type == 2) {
            flymeSetStatusBarLightMode(activity.getWindow(), true);
        } else {
            if (type != 3) {
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(9216);
        }
    }
}
