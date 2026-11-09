package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.d;
import androidx.core.view.C1052d;
import androidx.core.view.r0;
import androidx.core.view.s0;
import androidx.core.view.u0;
import androidx.core.view.v0;
import com.google.android.material.color.MaterialColors;
import io.fastkv.n;
import org.chromium.support_lib_boundary.util.b;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z3) {
        applyEdgeToEdge(window, z3, null, null);
    }

    private static int getNavigationBarColor(Context context, boolean z3) {
        if (z3 && Build.VERSION.SDK_INT < 27) {
            return d.e(MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z3) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216);
    }

    private static int getStatusBarColor(Context context, boolean z3) {
        if (z3) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean isUsingLightSystemBar(int i7, boolean z3) {
        if (MaterialColors.isColorLight(i7)) {
            return true;
        }
        return i7 == 0 && z3;
    }

    public static void setLightNavigationBar(@NonNull Window window, boolean z3) {
        b s0Var;
        C1052d c1052d = new C1052d(window.getDecorView(), 4);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            s0Var = new v0(window, c1052d);
        } else if (i7 >= 30) {
            s0Var = new u0(window, c1052d);
        } else {
            s0Var = i7 >= 26 ? new s0(window, c1052d) : new r0(window, c1052d);
        }
        s0Var.c0(z3);
    }

    public static void setLightStatusBar(@NonNull Window window, boolean z3) {
        b s0Var;
        C1052d c1052d = new C1052d(window.getDecorView(), 4);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            s0Var = new v0(window, c1052d);
        } else if (i7 >= 30) {
            s0Var = new u0(window, c1052d);
        } else {
            s0Var = i7 >= 26 ? new s0(window, c1052d) : new r0(window, c1052d);
        }
        s0Var.d0(z3);
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z3, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2) {
        boolean z8 = num == null || num.intValue() == 0;
        boolean z10 = num2 == null || num2.intValue() == 0;
        if (z8 || z10) {
            int color = MaterialColors.getColor(window.getContext(), R.attr.colorBackground, -16777216);
            if (z8) {
                num = Integer.valueOf(color);
            }
            if (z10) {
                num2 = Integer.valueOf(color);
            }
        }
        n.K(window, !z3);
        int statusBarColor = getStatusBarColor(window.getContext(), z3);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z3);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, MaterialColors.isColorLight(num2.intValue())));
    }
}
