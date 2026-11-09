package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class MaterialAttributes {
    @Nullable
    public static TypedValue resolve(@NonNull Context context, @AttrRes int i7) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(@NonNull Context context, @AttrRes int i7, boolean z3) {
        TypedValue typedValueResolve = resolve(context, i7);
        if (typedValueResolve == null || typedValueResolve.type != 18) {
            return z3;
        }
        return typedValueResolve.data != 0;
    }

    public static boolean resolveBooleanOrThrow(@NonNull Context context, @AttrRes int i7, @NonNull String str) {
        return resolveOrThrow(context, i7, str) != 0;
    }

    @Px
    public static int resolveDimension(@NonNull Context context, @AttrRes int i7, @DimenRes int i10) {
        TypedValue typedValueResolve = resolve(context, i7);
        return (int) ((typedValueResolve == null || typedValueResolve.type != 5) ? context.getResources().getDimension(i10) : typedValueResolve.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static int resolveInteger(@NonNull Context context, @AttrRes int i7, int i10) {
        TypedValue typedValueResolve = resolve(context, i7);
        return (typedValueResolve == null || typedValueResolve.type != 16) ? i10 : typedValueResolve.data;
    }

    @Px
    public static int resolveMinimumAccessibleTouchTarget(@NonNull Context context) {
        return resolveDimension(context, R.attr.minTouchTargetSize, R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(@NonNull Context context, @AttrRes int i7, @NonNull String str) {
        return resolveTypedValueOrThrow(context, i7, str).data;
    }

    @NonNull
    public static TypedValue resolveTypedValueOrThrow(@NonNull View view, @AttrRes int i7) {
        return resolveTypedValueOrThrow(view.getContext(), i7, view.getClass().getCanonicalName());
    }

    public static int resolveOrThrow(@NonNull View view, @AttrRes int i7) {
        return resolveTypedValueOrThrow(view, i7).data;
    }

    @NonNull
    public static TypedValue resolveTypedValueOrThrow(@NonNull Context context, @AttrRes int i7, @NonNull String str) {
        TypedValue typedValueResolve = resolve(context, i7);
        if (typedValueResolve != null) {
            return typedValueResolve;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i7)));
    }
}
