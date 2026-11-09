package com.google.android.material.color;

import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorRoles {
    private final int accent;
    private final int accentContainer;
    private final int onAccent;
    private final int onAccentContainer;

    public ColorRoles(@ColorInt int i7, @ColorInt int i10, @ColorInt int i11, @ColorInt int i12) {
        this.accent = i7;
        this.onAccent = i10;
        this.accentContainer = i11;
        this.onAccentContainer = i12;
    }

    @ColorInt
    public int getAccent() {
        return this.accent;
    }

    @ColorInt
    public int getAccentContainer() {
        return this.accentContainer;
    }

    @ColorInt
    public int getOnAccent() {
        return this.onAccent;
    }

    @ColorInt
    public int getOnAccentContainer() {
        return this.onAccentContainer;
    }
}
