package com.yalantis.ucrop.statusbar;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class LightStatusBarUtils {
    private static void initStatusBarStyle(Activity activity, boolean z3, boolean z8) {
        if (z3 && z8) {
            activity.getWindow().getDecorView().setSystemUiVisibility(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            return;
        }
        if (!z3 && !z8) {
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        } else {
            if (z3 || !z8) {
                return;
            }
            activity.getWindow().getDecorView().setSystemUiVisibility(1280);
        }
    }

    @TargetApi(11)
    private static void setAndroidNativeLightStatusBar(Activity activity, boolean z3, boolean z8, boolean z10, boolean z11) {
        try {
            if (!z10) {
                View decorView = activity.getWindow().getDecorView();
                if (z11) {
                    decorView.setSystemUiVisibility(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                    return;
                } else {
                    decorView.setSystemUiVisibility(0);
                    return;
                }
            }
            Window window = activity.getWindow();
            if (z3 && z8) {
                if (z11) {
                    window.getDecorView().setSystemUiVisibility(8448);
                    return;
                } else {
                    window.getDecorView().setSystemUiVisibility(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
                    return;
                }
            }
            if (!z3 && !z8) {
                if (z11) {
                    window.getDecorView().setSystemUiVisibility(9472);
                    return;
                } else {
                    window.getDecorView().setSystemUiVisibility(1280);
                    return;
                }
            }
            if (z3 || !z8) {
                return;
            }
            if (z11) {
                window.getDecorView().setSystemUiVisibility(9472);
            } else {
                window.getDecorView().setSystemUiVisibility(1280);
            }
        } catch (Exception unused) {
        }
    }

    private static boolean setFlymeLightStatusBar(Activity activity, boolean z3, boolean z8, boolean z10, boolean z11) {
        boolean z12 = false;
        if (activity != null) {
            initStatusBarStyle(activity, z3, z8);
            try {
                WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i7 = declaredField.getInt(null);
                int i10 = declaredField2.getInt(attributes);
                declaredField2.setInt(attributes, z11 ? i7 | i10 : (~i7) & i10);
                activity.getWindow().setAttributes(attributes);
                try {
                    if (RomUtils.getFlymeVersion() < 7) {
                        return true;
                    }
                    setAndroidNativeLightStatusBar(activity, z3, z8, z10, z11);
                    return true;
                } catch (Exception unused) {
                    z12 = true;
                    setAndroidNativeLightStatusBar(activity, z3, z8, z10, z11);
                    return z12;
                }
            } catch (Exception unused2) {
            }
        }
        return z12;
    }

    public static void setLightStatusBar(Activity activity, boolean z3) {
        setLightStatusBar(activity, false, false, false, z3);
    }

    public static void setLightStatusBarAboveAPI23(Activity activity, boolean z3, boolean z8, boolean z10, boolean z11) {
        setLightStatusBar(activity, z3, z8, z10, z11);
    }

    private static boolean setMIUILightStatusBar(Activity activity, boolean z3, boolean z8, boolean z10, boolean z11) {
        initStatusBarStyle(activity, z3, z8);
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i7 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class cls3 = Integer.TYPE;
            cls.getMethod("setExtraFlags", cls3, cls3).invoke(activity.getWindow(), Integer.valueOf(z11 ? i7 : 0), Integer.valueOf(i7));
            return true;
        } catch (Exception unused) {
            setAndroidNativeLightStatusBar(activity, z3, z8, z10, z11);
            return false;
        }
    }

    public static void setLightStatusBar(Activity activity, boolean z3, boolean z8, boolean z10, boolean z11) {
        int lightStatausBarAvailableRomType = RomUtils.getLightStatausBarAvailableRomType();
        if (lightStatausBarAvailableRomType == 1) {
            if (RomUtils.getMIUIVersionCode() >= 7) {
                setAndroidNativeLightStatusBar(activity, z3, z8, z10, z11);
                return;
            } else {
                setMIUILightStatusBar(activity, z3, z8, z10, z11);
                return;
            }
        }
        if (lightStatausBarAvailableRomType == 2) {
            setFlymeLightStatusBar(activity, z3, z8, z10, z11);
        } else {
            if (lightStatausBarAvailableRomType != 3) {
                return;
            }
            setAndroidNativeLightStatusBar(activity, z3, z8, z10, z11);
        }
    }
}
