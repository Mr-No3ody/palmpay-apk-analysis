package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.d;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int CHROMA_NEUTRAL = 6;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;
    private static final int TONE_SURFACE_CONTAINER_DARK = 12;
    private static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    private static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    private static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    private MaterialColors() {
    }

    @ColorInt
    public static int compositeARGBWithAlpha(@ColorInt int i7, @IntRange(from = 0, to = 255) int i10) {
        return d.e(i7, (Color.alpha(i7) * i10) / 255);
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i7) {
        return resolveColor(view.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view, i7));
    }

    @Nullable
    @ColorInt
    public static Integer getColorOrNull(@NonNull Context context, @AttrRes int i7) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i7);
        if (typedValueResolve != null) {
            return Integer.valueOf(resolveColor(context, typedValueResolve));
        }
        return null;
    }

    @ColorInt
    private static int getColorRole(@ColorInt int i7, @IntRange(from = 0, to = 100) int i10) {
        Hct hctFromInt = Hct.fromInt(i7);
        hctFromInt.setTone(i10);
        return hctFromInt.toInt();
    }

    @NonNull
    public static ColorRoles getColorRoles(@NonNull Context context, @ColorInt int i7) {
        return getColorRoles(i7, isLightTheme(context));
    }

    @NonNull
    public static ColorStateList getColorStateList(@NonNull Context context, @AttrRes int i7, @NonNull ColorStateList colorStateList) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i7);
        ColorStateList colorStateListResolveColorStateList = typedValueResolve != null ? resolveColorStateList(context, typedValueResolve) : null;
        return colorStateListResolveColorStateList == null ? colorStateList : colorStateListResolveColorStateList;
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@NonNull Context context, @AttrRes int i7) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i7);
        if (typedValueResolve == null) {
            return null;
        }
        int i10 = typedValueResolve.resourceId;
        if (i10 != 0) {
            return androidx.core.content.d.c(i10, context);
        }
        int i11 = typedValueResolve.data;
        if (i11 != 0) {
            return ColorStateList.valueOf(i11);
        }
        return null;
    }

    @ColorInt
    @RestrictTo({c.f39801b})
    public static int getSurfaceContainerFromSeed(@NonNull Context context, @ColorInt int i7) {
        return getColorRole(i7, isLightTheme(context) ? 94 : 12, 6);
    }

    @ColorInt
    @RestrictTo({c.f39801b})
    public static int getSurfaceContainerHighFromSeed(@NonNull Context context, @ColorInt int i7) {
        return getColorRole(i7, isLightTheme(context) ? 92 : 17, 6);
    }

    @ColorInt
    public static int harmonize(@ColorInt int i7, @ColorInt int i10) {
        return Blend.harmonize(i7, i10);
    }

    @ColorInt
    public static int harmonizeWithPrimary(@NonNull Context context, @ColorInt int i7) {
        return harmonize(i7, getColor(context, p241q.a.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(@ColorInt int i7) {
        if (i7 == 0) {
            return false;
        }
        ThreadLocal threadLocal = d.f16045a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i7);
        int iGreen = Color.green(i7);
        int iBlue = Color.blue(i7);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d2 = ((double) iRed) / 255.0d;
        double dPow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d10 = ((double) iGreen) / 255.0d;
        double dPow2 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) iBlue) / 255.0d;
        double dPow3 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d12 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d12;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d12 / 100.0d > 0.5d;
    }

    public static boolean isLightTheme(@NonNull Context context) {
        return MaterialAttributes.resolveBoolean(context, p241q.a.isLightTheme, true);
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i7, @AttrRes int i10) {
        return layer(view, i7, i10, 1.0f);
    }

    private static int resolveColor(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i7 = typedValue.resourceId;
        return i7 != 0 ? context.getColor(i7) : typedValue.data;
    }

    private static ColorStateList resolveColorStateList(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i7 = typedValue.resourceId;
        return i7 != 0 ? androidx.core.content.d.c(i7, context) : ColorStateList.valueOf(typedValue.data);
    }

    @NonNull
    public static ColorRoles getColorRoles(@ColorInt int i7, boolean z3) {
        return z3 ? new ColorRoles(getColorRole(i7, 40), getColorRole(i7, 100), getColorRole(i7, 90), getColorRole(i7, 10)) : new ColorRoles(getColorRole(i7, TONE_ACCENT_DARK), getColorRole(i7, 20), getColorRole(i7, 30), getColorRole(i7, 90));
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i7, @AttrRes int i10, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        return layer(getColor(view, i7), getColor(view, i10), f10);
    }

    @ColorInt
    public static int getColor(Context context, @AttrRes int i7, String str) {
        return resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, i7, str));
    }

    @ColorInt
    private static int getColorRole(@ColorInt int i7, @IntRange(from = 0, to = 100) int i10, int i11) {
        Hct hctFromInt = Hct.fromInt(getColorRole(i7, i10));
        hctFromInt.setChroma(i11);
        return hctFromInt.toInt();
    }

    @ColorInt
    public static int layer(@ColorInt int i7, @ColorInt int i10, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        return layer(i7, d.e(i10, Math.round(Color.alpha(i10) * f10)));
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i7, @ColorInt int i10) {
        return getColor(view.getContext(), i7, i10);
    }

    @ColorInt
    public static int getColor(@NonNull Context context, @AttrRes int i7, @ColorInt int i10) {
        Integer colorOrNull = getColorOrNull(context, i7);
        return colorOrNull != null ? colorOrNull.intValue() : i10;
    }

    @ColorInt
    public static int layer(@ColorInt int i7, @ColorInt int i10) {
        return d.c(i10, i7);
    }
}
