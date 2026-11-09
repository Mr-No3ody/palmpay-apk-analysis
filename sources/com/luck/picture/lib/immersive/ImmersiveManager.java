package com.luck.picture.lib.immersive;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.core.view.C;
import androidx.core.view.N;
import com.luck.picture.lib.utils.DensityUtil;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ImmersiveManager {
    private static final String TAG_FAKE_STATUS_BAR_VIEW = "TAG_FAKE_STATUS_BAR_VIEW";
    private static final String TAG_MARGIN_ADDED = "TAG_MARGIN_ADDED";
    private static final String TAG_NAVIGATION_BAR_VIEW = "TAG_NAVIGATION_BAR_VIEW";

    public static void immersiveAboveAPI23(AbstractActivityC0837o abstractActivityC0837o, int i7, int i10, boolean z3) {
        immersiveAboveAPI23(abstractActivityC0837o, false, false, i7, i10, z3);
    }

    private static void initBarBelowLOLLIPOP(Activity activity) {
        Window window = activity.getWindow();
        window.addFlags(67108864);
        setupStatusBarView(activity);
        if (DensityUtil.isNavBarVisible(activity)) {
            window.addFlags(134217728);
            setupNavBarView(activity);
        }
    }

    private static void setupNavBarView(Activity activity) {
        FrameLayout.LayoutParams layoutParams;
        Window window = activity.getWindow();
        View viewFindViewWithTag = window.getDecorView().findViewWithTag(TAG_NAVIGATION_BAR_VIEW);
        if (viewFindViewWithTag == null) {
            viewFindViewWithTag = new View(activity);
            viewFindViewWithTag.setTag(TAG_NAVIGATION_BAR_VIEW);
            ((ViewGroup) window.getDecorView()).addView(viewFindViewWithTag);
        }
        if (DensityUtil.isNavigationAtBottom(activity)) {
            layoutParams = new FrameLayout.LayoutParams(-1, DensityUtil.getNavigationBarHeight(activity));
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(DensityUtil.getNavigationBarWidth(activity), -1);
            layoutParams.gravity = 8388613;
        }
        viewFindViewWithTag.setLayoutParams(layoutParams);
        viewFindViewWithTag.setBackgroundColor(0);
        viewFindViewWithTag.setVisibility(0);
    }

    private static void setupStatusBarView(Activity activity) {
        Window window = activity.getWindow();
        View viewFindViewWithTag = window.getDecorView().findViewWithTag(TAG_FAKE_STATUS_BAR_VIEW);
        if (viewFindViewWithTag == null) {
            viewFindViewWithTag = new View(activity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, DensityUtil.getStatusBarHeight(activity));
            layoutParams.gravity = 48;
            viewFindViewWithTag.setLayoutParams(layoutParams);
            viewFindViewWithTag.setVisibility(0);
            viewFindViewWithTag.setTag(TAG_MARGIN_ADDED);
            ((ViewGroup) window.getDecorView()).addView(viewFindViewWithTag);
        }
        viewFindViewWithTag.setBackgroundColor(0);
    }

    public static void translucentStatusBar(Activity activity, boolean z3) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.setStatusBarColor(0);
        View decorView = window.getDecorView();
        if (z3) {
            decorView.setSystemUiVisibility(9472);
        } else {
            window.getDecorView().setSystemUiVisibility(1280);
        }
        View childAt = ((ViewGroup) window.findViewById(R.id.content)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
            WeakHashMap weakHashMap = N.f16168a;
            C.c(childAt);
        }
    }

    public static void immersiveAboveAPI23(AbstractActivityC0837o abstractActivityC0837o, boolean z3, boolean z8, int i7, int i10, boolean z10) {
        try {
            Window window = abstractActivityC0837o.getWindow();
            boolean z11 = true;
            if (z3 && z8) {
                window.clearFlags(201326592);
                LightStatusBarUtils.setLightStatusBar(abstractActivityC0837o, true, true, i7 == 0, z10);
                window.addFlags(Integer.MIN_VALUE);
            } else if (!z3 && !z8) {
                window.requestFeature(1);
                window.clearFlags(201326592);
                if (i7 != 0) {
                    z11 = false;
                }
                LightStatusBarUtils.setLightStatusBar(abstractActivityC0837o, false, false, z11, z10);
                window.addFlags(Integer.MIN_VALUE);
            } else {
                if (z3) {
                    return;
                }
                window.requestFeature(1);
                window.clearFlags(201326592);
                LightStatusBarUtils.setLightStatusBar(abstractActivityC0837o, false, true, i7 == 0, z10);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setStatusBarColor(i7);
            window.setNavigationBarColor(i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
