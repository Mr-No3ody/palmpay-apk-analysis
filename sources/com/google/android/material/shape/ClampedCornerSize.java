package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import p118hf.a;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public final class ClampedCornerSize implements CornerSize {
    private final float target;

    public ClampedCornerSize(float f10) {
        this.target = f10;
    }

    @NonNull
    public static ClampedCornerSize createFromCornerSize(@NonNull AbsoluteCornerSize absoluteCornerSize) {
        return new ClampedCornerSize(absoluteCornerSize.getCornerSize());
    }

    private static float getMaxCornerSize(@NonNull RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClampedCornerSize) && this.target == ((ClampedCornerSize) obj).target;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return a.l(this.target, 0.0f, getMaxCornerSize(rectF));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.target)});
    }
}
