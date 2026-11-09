package com.gyf.immersionbar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
class SpecialBarFontUtils {
    private static int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
    private static Method mSetStatusBarColorIcon;
    private static Method mSetStatusBarDarkIcon;
    private static Field mStatusBarColorFiled;

    static {
        try {
            mSetStatusBarColorIcon = Activity.class.getMethod("setStatusBarDarkIcon", Integer.TYPE);
        } catch (NoSuchMethodException unused) {
        }
        try {
            mSetStatusBarDarkIcon = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            mStatusBarColorFiled = WindowManager.LayoutParams.class.getField("statusBarColor");
        } catch (NoSuchFieldException unused3) {
        }
        try {
            SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
        } catch (IllegalAccessException | NoSuchFieldException unused4) {
        }
    }

    private static boolean changeMeizuFlag(WindowManager.LayoutParams layoutParams, String str, boolean z3) {
        try {
            Field declaredField = layoutParams.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            int i7 = declaredField.getInt(layoutParams);
            Field declaredField2 = layoutParams.getClass().getDeclaredField("meizuFlags");
            declaredField2.setAccessible(true);
            int i10 = declaredField2.getInt(layoutParams);
            int i11 = z3 ? i7 | i10 : (~i7) & i10;
            if (i10 == i11) {
                return false;
            }
            declaredField2.setInt(layoutParams, i11);
            return true;
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return false;
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return false;
        } catch (NoSuchFieldException e12) {
            e12.printStackTrace();
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean isBlackColor(int i7, int i10) {
        return toGrey(i7) < i10;
    }

    @SuppressLint({"PrivateApi"})
    public static void setMIUIBarDark(Window window, String str, boolean z3) {
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i7 = cls2.getField(str).getInt(cls2);
                Class cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                if (z3) {
                    method.invoke(window, Integer.valueOf(i7), Integer.valueOf(i7));
                } else {
                    method.invoke(window, 0, Integer.valueOf(i7));
                }
            } catch (Exception unused) {
            }
        }
    }

    private static void setStatusBarColor(Window window, int i7) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        Field field = mStatusBarColorFiled;
        if (field != null) {
            try {
                if (field.getInt(attributes) != i7) {
                    mStatusBarColorFiled.set(attributes, Integer.valueOf(i7));
                    window.setAttributes(attributes);
                }
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void setStatusBarDarkIcon(Activity activity, int i7) {
        Method method = mSetStatusBarColorIcon;
        if (method == null) {
            boolean zIsBlackColor = isBlackColor(i7, 50);
            if (mStatusBarColorFiled == null) {
                setStatusBarDarkIcon(activity, zIsBlackColor);
                return;
            } else {
                setStatusBarDarkIcon(activity, zIsBlackColor, zIsBlackColor);
                setStatusBarDarkIcon(activity.getWindow(), i7);
                return;
            }
        }
        try {
            method.invoke(activity, Integer.valueOf(i7));
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InvocationTargetException e11) {
            e11.printStackTrace();
        }
    }

    public static int toGrey(int i7) {
        return (((i7 & 255) * 15) + ((((65280 & i7) >> 8) * 75) + (((i7 & 16711680) >> 16) * 38))) >> 7;
    }

    public static void setStatusBarDarkIcon(Window window, int i7) {
        try {
            setStatusBarColor(window, i7);
            setStatusBarDarkIcon(window.getDecorView(), true);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void setStatusBarDarkIcon(Activity activity, boolean z3) {
        setStatusBarDarkIcon(activity, z3, true);
    }

    private static void setStatusBarDarkIcon(View view, boolean z3) {
        int i7;
        int systemUiVisibility = view.getSystemUiVisibility();
        if (z3) {
            i7 = SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | systemUiVisibility;
        } else {
            i7 = (~SYSTEM_UI_FLAG_LIGHT_STATUS_BAR) & systemUiVisibility;
        }
        if (i7 != systemUiVisibility) {
            view.setSystemUiVisibility(i7);
        }
    }

    public static void setStatusBarDarkIcon(Window window, boolean z3) {
        setStatusBarDarkIcon(window.getDecorView(), z3);
        setStatusBarColor(window, 0);
    }

    private static void setStatusBarDarkIcon(Activity activity, boolean z3, boolean z8) {
        Method method = mSetStatusBarDarkIcon;
        if (method == null) {
            if (z8) {
                setStatusBarDarkIcon(activity.getWindow(), z3);
                return;
            }
            return;
        }
        try {
            method.invoke(activity, Boolean.valueOf(z3));
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InvocationTargetException e11) {
            e11.printStackTrace();
        }
    }
}
