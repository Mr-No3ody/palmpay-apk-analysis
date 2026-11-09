package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {
    public static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(W.c.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static q0 b(@NonNull View view, @NonNull q0 q0Var, @NonNull Rect rect) {
        WindowInsets windowInsetsG = q0Var.g();
        if (windowInsetsG != null) {
            return q0.h(view, view.computeSystemWindowInsets(windowInsetsG, rect));
        }
        rect.setEmpty();
        return q0Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    public static String f(View view) {
        return view.getTransitionName();
    }

    public static float g(View view) {
        return view.getTranslationZ();
    }

    public static float h(@NonNull View view) {
        return view.getZ();
    }

    public static boolean i(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void j(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void k(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void l(View view, float f10) {
        view.setElevation(f10);
    }

    public static void m(View view, boolean z3) {
        view.setNestedScrollingEnabled(z3);
    }

    public static void n(@NonNull View view, @Nullable OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(W.c.tag_on_apply_window_listener, onApplyWindowInsetsListener);
        }
        if (onApplyWindowInsetsListener == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(W.c.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new D(view, onApplyWindowInsetsListener));
        }
    }

    public static void o(View view, String str) {
        view.setTransitionName(str);
    }

    public static void p(View view, float f10) {
        view.setTranslationZ(f10);
    }

    public static void q(View view) {
        view.stopNestedScroll();
    }
}
