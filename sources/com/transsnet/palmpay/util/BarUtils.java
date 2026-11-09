package com.transsnet.palmpay.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: loaded from: classes4.dex */
public final class BarUtils {
    private static final int DEFAULT_ALPHA = 112;
    private static final String TAG = "BarUtils";
    private static final String TAG_ALPHA = "TAG_ALPHA";
    private static final String TAG_COLOR = "TAG_COLOR";
    private static final int TAG_OFFSET = -123;

    private BarUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static void addStatusBarAlpha(Activity activity, int i7, boolean z3) {
        ViewGroup viewGroup = z3 ? (ViewGroup) activity.getWindow().getDecorView() : (ViewGroup) activity.findViewById(android.R.id.content);
        View viewFindViewWithTag = viewGroup.findViewWithTag(TAG_ALPHA);
        if (viewFindViewWithTag == null) {
            viewGroup.addView(createAlphaStatusBarView(viewGroup.getContext(), i7));
            return;
        }
        if (viewFindViewWithTag.getVisibility() == 8) {
            viewFindViewWithTag.setVisibility(0);
        }
        viewFindViewWithTag.setBackgroundColor(Color.argb(i7, 0, 0, 0));
    }

    private static void addStatusBarColor(Activity activity, int i7, int i10, boolean z3) {
        ViewGroup viewGroup = z3 ? (ViewGroup) activity.getWindow().getDecorView() : (ViewGroup) activity.findViewById(android.R.id.content);
        View viewFindViewWithTag = viewGroup.findViewWithTag(TAG_COLOR);
        if (viewFindViewWithTag == null) {
            viewGroup.addView(createColorStatusBarView(viewGroup.getContext(), i7, i10));
            return;
        }
        if (viewFindViewWithTag.getVisibility() == 8) {
            viewFindViewWithTag.setVisibility(0);
        }
        viewFindViewWithTag.setBackgroundColor(getStatusBarColor(i7, i10));
    }

    private static View createAlphaStatusBarView(Context context, int i7) {
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, getStatusBarHeight()));
        view.setBackgroundColor(Color.argb(i7, 0, 0, 0));
        view.setTag(TAG_ALPHA);
        return view;
    }

    private static View createColorStatusBarView(Context context, int i7, int i10) {
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, getStatusBarHeight()));
        view.setBackgroundColor(getStatusBarColor(i7, i10));
        view.setTag(TAG_COLOR);
        return view;
    }

    public static int getActionBarHeight() {
        TypedValue typedValue = new TypedValue();
        if (Utils.getApp().getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, Utils.getApp().getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static int getNavBarHeight() {
        Resources resources = Utils.getApp().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static int getStatusBarColor(int i7, int i10) {
        if (i10 == 0) {
            return i7;
        }
        float f10 = 1.0f - (i10 / 255.0f);
        return Color.argb(255, (int) (((double) (((i7 >> 16) & 255) * f10)) + 0.5d), (int) (((double) (((i7 >> 8) & 255) * f10)) + 0.5d), (int) (((double) ((i7 & 255) * f10)) + 0.5d));
    }

    public static int getStatusBarHeight() {
        try {
            int identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier <= 0) {
                return 0;
            }
            int dimensionPixelSize = Utils.getApp().getResources().getDimensionPixelSize(identifier);
            int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
            if (dimensionPixelSize2 >= dimensionPixelSize && Build.VERSION.SDK_INT < 29) {
                return dimensionPixelSize2;
            }
            float f10 = (dimensionPixelSize * Resources.getSystem().getDisplayMetrics().density) / Utils.getApp().getResources().getDisplayMetrics().density;
            return (int) (f10 >= 0.0f ? f10 + 0.5f : f10 - 0.5f);
        } catch (Resources.NotFoundException unused) {
            return 0;
        }
    }

    private static void hideAlphaView(Activity activity) {
        View viewFindViewWithTag = ((ViewGroup) activity.getWindow().getDecorView()).findViewWithTag(TAG_ALPHA);
        if (viewFindViewWithTag == null) {
            return;
        }
        viewFindViewWithTag.setVisibility(8);
    }

    private static void hideColorView(Activity activity) {
        View viewFindViewWithTag = ((ViewGroup) activity.getWindow().getDecorView()).findViewWithTag(TAG_COLOR);
        if (viewFindViewWithTag == null) {
            return;
        }
        viewFindViewWithTag.setVisibility(8);
    }

    private static void invokePanels(String str) {
        try {
            Class.forName("android.app.StatusBarManager").getMethod(str, new Class[0]).invoke(Utils.getApp().getSystemService("statusbar"), new Object[0]);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean isNavBarVisible(@NonNull Activity activity) {
        return isNavBarVisible(activity.getWindow());
    }

    public static boolean isStatusBarVisible(@NonNull Activity activity) {
        return (activity.getWindow().getAttributes().flags & 1024) == 0;
    }

    @TargetApi(19)
    public static void setNavBarImmersive(@NonNull Activity activity) {
        setNavBarImmersive(activity.getWindow());
    }

    public static void setNavBarVisibility(@NonNull Activity activity, boolean z3) {
        setNavBarVisibility(activity.getWindow(), z3);
    }

    @RequiresPermission("android.permission.EXPAND_STATUS_BAR")
    public static void setNotificationBarVisibility(boolean z3) {
        invokePanels(z3 ? "expandNotificationsPanel" : "collapsePanels");
    }

    public static void setStatusBarAlpha(@NonNull Activity activity) {
        setStatusBarAlpha(activity, 112, false);
    }

    public static void setStatusBarAlpha4Drawer(@NonNull Activity activity, @NonNull DrawerLayout drawerLayout, @NonNull View view, boolean z3) {
        setStatusBarAlpha4Drawer(activity, drawerLayout, view, 112, z3);
    }

    public static void setStatusBarColor(@NonNull Activity activity, @ColorInt int i7) {
        setStatusBarColor(activity, i7, 112, false);
    }

    public static void setStatusBarColor4Drawer(@NonNull Activity activity, @NonNull DrawerLayout drawerLayout, @NonNull View view, @ColorInt int i7, boolean z3) {
        setStatusBarColor4Drawer(activity, drawerLayout, view, i7, 112, z3);
    }

    public static void setStatusBarLightMode(Activity activity, boolean z3) {
        if (activity == null) {
            return;
        }
        setStatusBarLightMode(activity.getWindow(), z3);
    }

    public static void setStatusBarVisibility(@NonNull Activity activity, boolean z3) {
        setStatusBarVisibility(activity.getWindow(), z3);
    }

    public static void transparentStatusBar(Activity activity) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(1280);
        window.setStatusBarColor(0);
    }

    public static boolean isNavBarVisible(@NonNull Window window) {
        return (window.getAttributes().flags & 512) == 0 && (window.getDecorView().getSystemUiVisibility() & 2) == 0;
    }

    @TargetApi(19)
    public static void setNavBarImmersive(@NonNull Window window) {
        View decorView = window.getDecorView();
        window.clearFlags(512);
        decorView.setSystemUiVisibility(4610);
    }

    public static void setNavBarVisibility(@NonNull Window window, boolean z3) {
        if (z3) {
            window.clearFlags(512);
            return;
        }
        window.addFlags(512);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-4097));
    }

    public static void setStatusBarAlpha(@NonNull Activity activity, @IntRange(from = 0, to = 255) int i7) {
        setStatusBarAlpha(activity, i7, false);
    }

    public static void setStatusBarAlpha4Drawer(@NonNull Activity activity, @NonNull DrawerLayout drawerLayout, @NonNull View view, @IntRange(from = 0, to = 255) int i7, boolean z3) {
        drawerLayout.setFitsSystemWindows(false);
        transparentStatusBar(activity);
        setStatusBarAlpha(view, z3 ? i7 : 0);
        int childCount = drawerLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            drawerLayout.getChildAt(i10).setFitsSystemWindows(false);
        }
        if (z3) {
            hideAlphaView(activity);
        } else {
            addStatusBarAlpha(activity, i7, false);
        }
    }

    public static void setStatusBarColor(@NonNull Activity activity, @ColorInt int i7, @IntRange(from = 0, to = 255) int i10) {
        setStatusBarColor(activity, i7, i10, false);
    }

    public static void setStatusBarColor4Drawer(@NonNull Activity activity, @NonNull DrawerLayout drawerLayout, @NonNull View view, @ColorInt int i7, @IntRange(from = 0, to = 255) int i10, boolean z3) {
        drawerLayout.setFitsSystemWindows(false);
        transparentStatusBar(activity);
        setStatusBarColor(view, i7, z3 ? i10 : 0);
        int childCount = drawerLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            drawerLayout.getChildAt(i11).setFitsSystemWindows(false);
        }
        if (z3) {
            hideAlphaView(activity);
        } else {
            addStatusBarAlpha(activity, i10, false);
        }
    }

    public static void setStatusBarLightMode(Window window, boolean z3) {
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            View decorView = window.getDecorView();
            if (decorView != null) {
                int systemUiVisibility = decorView.getSystemUiVisibility();
                window.addFlags(Integer.MIN_VALUE);
                decorView.setSystemUiVisibility(z3 ? systemUiVisibility | UserMetadata.MAX_INTERNAL_KEY_SIZE : systemUiVisibility & (-8193));
                return;
            }
            return;
        }
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController != null) {
            if (z3) {
                insetsController.setSystemBarsAppearance(8, 8);
            } else {
                insetsController.setSystemBarsAppearance(0, 8);
            }
        }
    }

    public static void setStatusBarVisibility(@NonNull Window window, boolean z3) {
        if (z3) {
            window.clearFlags(1024);
        } else {
            window.addFlags(1024);
        }
    }

    public static void setStatusBarAlpha(@NonNull Activity activity, @IntRange(from = 0, to = 255) int i7, boolean z3) {
        hideColorView(activity);
        transparentStatusBar(activity);
        addStatusBarAlpha(activity, i7, z3);
    }

    public static void setStatusBarColor(@NonNull Activity activity, @ColorInt int i7, @IntRange(from = 0, to = 255) int i10, boolean z3) {
        hideAlphaView(activity);
        transparentStatusBar(activity);
        addStatusBarColor(activity, i7, i10, z3);
    }

    public static void setStatusBarAlpha(@NonNull View view) {
        setStatusBarAlpha(view, 112);
    }

    public static void setStatusBarColor(@NonNull View view, @ColorInt int i7) {
        setStatusBarColor(view, i7, 112);
    }

    public static void setStatusBarAlpha(@NonNull View view, @IntRange(from = 0, to = 255) int i7) {
        view.setVisibility(0);
        transparentStatusBar((Activity) view.getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = getStatusBarHeight();
        view.setBackgroundColor(Color.argb(i7, 0, 0, 0));
    }

    public static void setStatusBarColor(@NonNull View view, @ColorInt int i7, @IntRange(from = 0, to = 255) int i10) {
        view.setVisibility(0);
        transparentStatusBar((Activity) view.getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = getStatusBarHeight();
        view.setBackgroundColor(getStatusBarColor(i7, i10));
    }
}
