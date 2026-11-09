package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Dash extends PatternItem {
    public final float length;

    public Dash(float f10) {
        super(0, Float.valueOf(Math.max(f10, 0.0f)));
        this.length = Math.max(f10, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    @NonNull
    public String toString() {
        return "[Dash: length=" + this.length + "]";
    }
}
