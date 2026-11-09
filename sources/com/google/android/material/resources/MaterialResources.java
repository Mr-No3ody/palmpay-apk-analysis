package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.Z0;
import androidx.core.content.d;
import com.google.android.material.R;
import p192n.c;
import p241q.j;
import p264r5.a;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class MaterialResources {
    private static final float FONT_SCALE_1_3 = 1.3f;
    private static final float FONT_SCALE_2_0 = 2.0f;

    private MaterialResources() {
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i7) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (colorStateListC = d.c(resourceId, context)) == null) ? typedArray.getColorStateList(i7) : colorStateListC;
    }

    private static int getComplexUnit(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }

    public static int getDimensionPixelSize(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i7, int i10) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i7, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i7, i10);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i10);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i7) {
        int resourceId;
        Drawable drawableQ;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (drawableQ = a.q(resourceId, context)) == null) ? typedArray.getDrawable(i7) : drawableQ;
    }

    public static float getFontScale(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    @StyleableRes
    public static int getIndexWithValue(@NonNull TypedArray typedArray, @StyleableRes int i7, @StyleableRes int i10) {
        return typedArray.hasValue(i7) ? i7 : i10;
    }

    @Nullable
    public static TextAppearance getTextAppearance(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i7) {
        int resourceId;
        if (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) {
            return null;
        }
        return new TextAppearance(context, resourceId);
    }

    public static int getUnscaledLineHeight(@NonNull Context context, @StyleRes int i7, int i10) {
        if (i7 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, R.styleable.MaterialTextAppearance);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(R.styleable.MaterialTextAppearance_lineHeight, typedValue);
            if (!value) {
                value = typedArrayObtainStyledAttributes.getValue(R.styleable.MaterialTextAppearance_android_lineHeight, typedValue);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return getComplexUnit(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i10;
    }

    public static int getUnscaledTextSize(@NonNull Context context, @StyleRes int i7, int i10) {
        if (i7 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, j.TextAppearance);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(j.TextAppearance_android_textSize, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                return getComplexUnit(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
        }
        return i10;
    }

    public static boolean isFontScaleAtLeast1_3(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= FONT_SCALE_1_3;
    }

    public static boolean isFontScaleAtLeast2_0(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= FONT_SCALE_2_0;
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context, @NonNull Z0 z3, @StyleableRes int i7) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!z3.f12863b.hasValue(i7) || (resourceId = z3.f12863b.getResourceId(i7, 0)) == 0 || (colorStateListC = d.c(resourceId, context)) == null) ? z3.a(i7) : colorStateListC;
    }
}
