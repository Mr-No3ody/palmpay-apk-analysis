package Gb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f3237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f3238b;

    public K(int i7) {
        Paint paint = new Paint(1);
        paint.setColor(i7);
        this.f3237a = paint;
        this.f3238b = new Path();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        if (bounds.isEmpty()) {
            return;
        }
        float level = getLevel() / 10000.0f;
        if (level <= 0.0f) {
            return;
        }
        float fHeight = bounds.height();
        float fWidth = bounds.width() * level;
        if (fWidth <= 0.0f || fHeight <= 0.0f) {
            return;
        }
        float f10 = bounds.left;
        float f11 = bounds.top;
        float f12 = bounds.bottom;
        float f13 = fHeight / 2.0f;
        Paint paint = this.f3237a;
        if (fWidth >= fHeight) {
            canvas.drawRoundRect(f10, f11, f10 + fWidth, f12, f13, f13, paint);
            return;
        }
        Path path = this.f3238b;
        path.reset();
        path.addRoundRect(new RectF(bounds), f13, f13, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        canvas.drawRect(f10, f11, f10 + fWidth, f12, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f3237a.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3237a.setColorFilter(colorFilter);
    }
}
