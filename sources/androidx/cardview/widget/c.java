package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f15027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f15028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f15029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f15030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15031e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f15034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f15035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f15036j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15032f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15033g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f15037k = PorterDuff.Mode.SRC_IN;

    public c(float f10, ColorStateList colorStateList) {
        this.f15027a = f10;
        Paint paint = new Paint(5);
        this.f15028b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f15034h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f15034h.getDefaultColor()));
        this.f15029c = new RectF();
        this.f15030d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f15029c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f15030d;
        rect2.set(rect);
        if (this.f15032f) {
            rect2.inset((int) Math.ceil(d.a(this.f15031e, this.f15027a, this.f15033g)), (int) Math.ceil(d.b(this.f15031e, this.f15027a, this.f15033g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z3;
        Paint paint = this.f15028b;
        if (this.f15035i == null || paint.getColorFilter() != null) {
            z3 = false;
        } else {
            paint.setColorFilter(this.f15035i);
            z3 = true;
        }
        RectF rectF = this.f15029c;
        float f10 = this.f15027a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z3) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f15030d, this.f15027a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f15036j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f15034h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f15034h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f15028b;
        boolean z3 = colorForState != paint.getColor();
        if (z3) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f15036j;
        if (colorStateList2 == null || (mode = this.f15037k) == null) {
            return z3;
        }
        this.f15035i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f15028b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15028b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f15036j = colorStateList;
        this.f15035i = a(colorStateList, this.f15037k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f15037k = mode;
        this.f15035i = a(this.f15036j, mode);
        invalidateSelf();
    }
}
