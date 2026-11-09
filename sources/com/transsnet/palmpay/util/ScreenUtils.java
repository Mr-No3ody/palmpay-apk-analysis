package com.transsnet.palmpay.util;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes4.dex */
public final class ScreenUtils {
    private ScreenUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int dip2px(float f10) {
        return (int) ((getDensity() * f10) + 0.5f);
    }

    public static int getAppUsableScreenHeight() {
        WindowManager windowManager = (WindowManager) Utils.getApp().getSystemService("window");
        if (windowManager == null) {
            return Utils.getApp().getResources().getDisplayMetrics().heightPixels;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.y;
    }

    public static float getDensity() {
        DisplayMetrics displayMetrics = getDisplayMetrics();
        if (displayMetrics == null) {
            return -1.0f;
        }
        return displayMetrics.density;
    }

    public static int getDensityDpi() {
        DisplayMetrics displayMetrics = getDisplayMetrics();
        if (displayMetrics == null) {
            return -1;
        }
        return displayMetrics.densityDpi;
    }

    public static float getDensityScale() {
        DisplayMetrics displayMetrics = getDisplayMetrics();
        if (displayMetrics == null) {
            return -1.0f;
        }
        return displayMetrics.scaledDensity;
    }

    private static DisplayMetrics getDisplayMetrics() {
        if (Utils.getApp() == null) {
            return null;
        }
        return Utils.getApp().getResources().getDisplayMetrics();
    }

    public static int getScreenBrightness() {
        return Settings.System.getInt(Utils.getApp().getContentResolver(), "screen_brightness", 125);
    }

    public static float getScreenDensity() {
        return Utils.getApp().getResources().getDisplayMetrics().density;
    }

    public static int getScreenDensityDpi() {
        return Utils.getApp().getResources().getDisplayMetrics().densityDpi;
    }

    public static int getScreenHeight() {
        Display display;
        DisplayManager displayManager = (DisplayManager) Utils.getApp().getSystemService("display");
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            return Utils.getApp().getResources().getDisplayMetrics().heightPixels;
        }
        Point point = new Point();
        display.getRealSize(point);
        return point.y;
    }

    public static int getScreenManualMode() {
        return Settings.System.getInt(Utils.getApp().getContentResolver(), "screen_brightness_mode", 1);
    }

    public static int getScreenWidth() {
        Display display;
        DisplayManager displayManager = (DisplayManager) Utils.getApp().getSystemService("display");
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            return Utils.getApp().getResources().getDisplayMetrics().widthPixels;
        }
        Point point = new Point();
        display.getRealSize(point);
        return point.x;
    }

    private static int getWaterFallEdgeSize(String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                Resources resources = Utils.getApp().getResources();
                MMKV mmkvO = MMKV.o("BarUtils");
                int identifier = mmkvO.getInt(str, 0);
                if (identifier == 0) {
                    identifier = resources.getIdentifier(str, "dimen", "android");
                }
                mmkvO.putInt(str, identifier);
                return resources.getDimensionPixelSize(identifier);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return 0;
    }

    public static int getWaterFallLeftEdgeSize() {
        return getWaterFallEdgeSize("waterfall_display_left_edge_size");
    }

    public static boolean isWaterFallDisplay() {
        return getWaterFallLeftEdgeSize() > 0;
    }

    public static int px2dip(float f10) {
        return (int) ((f10 / getDensity()) + 0.5f);
    }

    public static int px2sp(float f10) {
        return (int) ((f10 / getDensityScale()) + 0.5f);
    }

    public static void setFullScreen(@NonNull Activity activity) {
        activity.getWindow().addFlags(1536);
    }

    public static int sp2px(float f10) {
        return (int) ((getDensityScale() * f10) + 0.5f);
    }
}
