package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f12852a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f12853b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f12854c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f12855d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f12856e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f12857f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f12858g = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p241q.j.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(p241q.j.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(int i7, Context context) {
        ColorStateList colorStateListD = d(i7, context);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f12853b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = f12852a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        int iC = c(i7, context);
        return androidx.core.graphics.d.e(iC, Math.round(Color.alpha(iC) * f10));
    }

    public static int c(int i7, Context context) {
        int[] iArr = f12858g;
        iArr[0] = i7;
        Z0 z0E = Z0.e(context, null, iArr);
        try {
            return z0E.f12863b.getColor(0, 0);
        } finally {
            z0E.g();
        }
    }

    public static ColorStateList d(int i7, Context context) {
        int[] iArr = f12858g;
        iArr[0] = i7;
        Z0 z0E = Z0.e(context, null, iArr);
        try {
            return z0E.a(0);
        } finally {
            z0E.g();
        }
    }
}
