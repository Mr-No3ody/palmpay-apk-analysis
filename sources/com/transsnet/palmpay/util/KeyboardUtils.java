package com.transsnet.palmpay.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class KeyboardUtils {
    private static int sContentViewInvisibleHeightPre;

    public interface OnSoftInputChangedListener {
        void onSoftInputChanged(int i7);
    }

    private KeyboardUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void clickBlankArea2HideSoftInput() {
    }

    public static void fixSoftInputLeaks(Context context) {
        InputMethodManager inputMethodManager;
        if (context == null || (inputMethodManager = (InputMethodManager) Utils.getApp().getSystemService("input_method")) == null) {
            return;
        }
        String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
        for (int i7 = 0; i7 < 3; i7++) {
            try {
                Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i7]);
                if (declaredField != null) {
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    Object obj = declaredField.get(inputMethodManager);
                    if (obj != null && (obj instanceof View)) {
                        if (((View) obj).getContext() != context) {
                            return;
                        } else {
                            declaredField.set(inputMethodManager, null);
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getContentViewInvisibleHeight(Activity activity) {
        View viewFindViewById = activity.findViewById(android.R.id.content);
        Rect rect = new Rect();
        viewFindViewById.getWindowVisibleDisplayFrame(rect);
        return viewFindViewById.getBottom() - rect.bottom;
    }

    public static void hideSoftInput(Activity activity) {
        InputMethodManager inputMethodManager;
        if (activity == null || (inputMethodManager = (InputMethodManager) activity.getSystemService("input_method")) == null) {
            return;
        }
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public static boolean isSoftInputVisible(Activity activity) {
        return isSoftInputVisible(activity, 200);
    }

    public static void registerSoftInputChangedListener(final Activity activity, final OnSoftInputChangedListener onSoftInputChangedListener) {
        View viewFindViewById = activity.findViewById(android.R.id.content);
        sContentViewInvisibleHeightPre = getContentViewInvisibleHeight(activity);
        viewFindViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.transsnet.palmpay.util.KeyboardUtils.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int contentViewInvisibleHeight;
                if (onSoftInputChangedListener == null || KeyboardUtils.sContentViewInvisibleHeightPre == (contentViewInvisibleHeight = KeyboardUtils.getContentViewInvisibleHeight(activity))) {
                    return;
                }
                onSoftInputChangedListener.onSoftInputChanged(contentViewInvisibleHeight);
                KeyboardUtils.sContentViewInvisibleHeightPre = contentViewInvisibleHeight;
            }
        });
    }

    public static void showSoftInput(Activity activity) {
        InputMethodManager inputMethodManager;
        if (activity == null || (inputMethodManager = (InputMethodManager) activity.getSystemService("input_method")) == null) {
            return;
        }
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.showSoftInput(currentFocus, 2);
    }

    public static void toggleSoftInput() {
        InputMethodManager inputMethodManager;
        try {
            if (Utils.getApp() == null || (inputMethodManager = (InputMethodManager) Utils.getApp().getSystemService("input_method")) == null) {
                return;
            }
            inputMethodManager.toggleSoftInput(2, 0);
        } catch (Exception e10) {
            Log.e("toggleSoftInput", e10.getMessage());
        }
    }

    public static boolean isSoftInputVisible(Activity activity, int i7) {
        return getContentViewInvisibleHeight(activity) >= i7;
    }

    public static void hideSoftInput(View view) {
        InputMethodManager inputMethodManager;
        if (view == null) {
            return;
        }
        try {
            if (Utils.getApp() == null || (inputMethodManager = (InputMethodManager) Utils.getApp().getSystemService("input_method")) == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Exception e10) {
            Log.e("toggleSoftInput", e10.getMessage());
        }
    }

    public static void showSoftInput(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) Utils.getApp().getSystemService("input_method")) == null) {
            return;
        }
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManager.showSoftInput(view, 2);
    }
}
