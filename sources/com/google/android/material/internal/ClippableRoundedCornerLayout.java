package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class ClippableRoundedCornerLayout extends FrameLayout {

    @NonNull
    private float[] cornerRadii;

    @Nullable
    private Path path;

    public ClippableRoundedCornerLayout(@NonNull Context context) {
        super(context);
        this.cornerRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.path == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @NonNull
    public float[] getCornerRadii() {
        return this.cornerRadii;
    }

    public void resetClipBoundsAndCornerRadii() {
        this.path = null;
        this.cornerRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        invalidate();
    }

    public void updateClipBoundsAndCornerRadii(@NonNull Rect rect, @NonNull float[] fArr) {
        updateClipBoundsAndCornerRadii(rect.left, rect.top, rect.right, rect.bottom, fArr);
    }

    public void updateCornerRadii(@NonNull float[] fArr) {
        updateClipBoundsAndCornerRadii(getLeft(), getTop(), getRight(), getBottom(), fArr);
    }

    public void updateClipBoundsAndCornerRadii(float f10, float f11, float f12, float f13, @NonNull float[] fArr) {
        updateClipBoundsAndCornerRadii(new RectF(f10, f11, f12, f13), fArr);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cornerRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public void updateClipBoundsAndCornerRadii(@NonNull RectF rectF, @NonNull float[] fArr) {
        if (this.path == null) {
            this.path = new Path();
        }
        this.cornerRadii = fArr;
        this.path.reset();
        this.path.addRoundRect(rectF, fArr, Path.Direction.CW);
        this.path.close();
        invalidate();
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.cornerRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }
}
