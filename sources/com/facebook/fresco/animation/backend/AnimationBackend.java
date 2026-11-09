package com.facebook.fresco.animation.backend;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AnimationBackend extends AnimationInformation {
    void clear();

    boolean drawFrame(Drawable parent, Canvas canvas, int frameNumber);

    int getIntrinsicHeight();

    int getIntrinsicWidth();

    int getSizeInBytes();

    void setAlpha(@IntRange(from = 0, to = 255) int alpha);

    void setBounds(Rect bounds);

    void setColorFilter(@Nullable ColorFilter colorFilter);
}
