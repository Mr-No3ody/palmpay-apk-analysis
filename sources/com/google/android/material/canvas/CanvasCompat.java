package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class CanvasCompat {

    public interface CanvasOperation {
        void run(@NonNull Canvas canvas);
    }

    private CanvasCompat() {
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, @Nullable RectF rectF, int i7) {
        return canvas.saveLayerAlpha(rectF, i7);
    }

    public static int saveLayerAlpha(@NonNull Canvas canvas, float f10, float f11, float f12, float f13, int i7) {
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i7);
    }
}
