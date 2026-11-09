package com.facebook.react.uimanager;

import android.graphics.BlendMode;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.view.inspector.InspectionCompanion;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ ColorStateListDrawable f(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ InspectionCompanion.UninitializedPropertyMapException i() {
        return new InspectionCompanion.UninitializedPropertyMapException();
    }

    public static /* bridge */ /* synthetic */ boolean r(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj) {
        return obj instanceof BlendMode;
    }
}
