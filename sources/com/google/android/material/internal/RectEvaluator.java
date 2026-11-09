package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class RectEvaluator implements TypeEvaluator<Rect> {
    private final Rect rect;

    public RectEvaluator(@NonNull Rect rect) {
        this.rect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f10, @NonNull Rect rect, @NonNull Rect rect2) {
        int i7 = rect.left;
        int i10 = i7 + ((int) ((rect2.left - i7) * f10));
        int i11 = rect.top;
        int i12 = i11 + ((int) ((rect2.top - i11) * f10));
        int i13 = rect.right;
        int i14 = i13 + ((int) ((rect2.right - i13) * f10));
        int i15 = rect.bottom;
        this.rect.set(i10, i12, i14, i15 + ((int) ((rect2.bottom - i15) * f10)));
        return this.rect;
    }
}
