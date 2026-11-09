package com.google.android.material.theme.overlay;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;
import p241q.a;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialThemeOverlay {
    private static final int[] ANDROID_THEME_OVERLAY_ATTRS = {R.attr.theme, a.theme};
    private static final int[] MATERIAL_THEME_OVERLAY_ATTR = {com.google.android.material.R.attr.materialThemeOverlay};

    private MaterialThemeOverlay() {
    }

    @StyleRes
    private static int obtainAndroidThemeOverlayId(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ANDROID_THEME_OVERLAY_ATTRS);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @NonNull
    private static int[] obtainMaterialOverlayIds(@NonNull Context context, @Nullable AttributeSet attributeSet, @NonNull int[] iArr, @AttrRes int i7, @StyleRes int i10) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, i10);
            for (int i11 = 0; i11 < iArr.length; i11++) {
                iArr2[i11] = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        return iArr2;
    }

    @StyleRes
    private static int obtainMaterialThemeOverlayId(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7, @StyleRes int i10) {
        return obtainMaterialOverlayIds(context, attributeSet, MATERIAL_THEME_OVERLAY_ATTR, i7, i10)[0];
    }

    @NonNull
    public static Context wrap(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7, @StyleRes int i10) {
        return wrap(context, attributeSet, i7, i10, new int[0]);
    }

    @NonNull
    public static Context wrap(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7, @StyleRes int i10, @NonNull int[] iArr) {
        int iObtainMaterialThemeOverlayId = obtainMaterialThemeOverlayId(context, attributeSet, i7, i10);
        boolean z3 = (context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == iObtainMaterialThemeOverlayId;
        if (iObtainMaterialThemeOverlayId == 0 || z3) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, iObtainMaterialThemeOverlayId);
        for (int i11 : obtainMaterialOverlayIds(context, attributeSet, iArr, i7, i10)) {
            if (i11 != 0) {
                contextThemeWrapper.getTheme().applyStyle(i11, true);
            }
        }
        int iObtainAndroidThemeOverlayId = obtainAndroidThemeOverlayId(context, attributeSet);
        if (iObtainAndroidThemeOverlayId != 0) {
            contextThemeWrapper.getTheme().applyStyle(iObtainAndroidThemeOverlayId, true);
        }
        return contextThemeWrapper;
    }
}
