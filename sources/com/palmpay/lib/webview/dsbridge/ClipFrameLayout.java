package com.palmpay.lib.webview.dsbridge;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class ClipFrameLayout extends FrameLayout {
    public ClipFrameLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        setLayerType(1, null);
        Path path = new Path();
        float width = (int) (((double) getWidth()) * 0.03d);
        path.addRoundRect(new RectF(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom()), width, width, Path.Direction.CCW);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.clipPath(path, Region.Op.INTERSECT);
        canvas.save();
        super.dispatchDraw(canvas);
    }

    public ClipFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClipFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
