package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f implements Runnable, CloneableDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f21227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Drawable drawable, int i7, boolean z3) {
        super(drawable);
        drawable.getClass();
        this.f21227c = 0.0f;
        this.f21228d = false;
        this.f21225a = i7;
        this.f21226b = z3;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.drawee.drawable.CloneableDrawable
    public final Drawable cloneDrawable() {
        Drawable drawableNewDrawable;
        Drawable drawable = getDrawable();
        if (drawable != 0) {
            CloneableDrawable cloneableDrawable = drawable instanceof CloneableDrawable ? (CloneableDrawable) drawable : null;
            if (cloneableDrawable == null || (drawableNewDrawable = cloneableDrawable.cloneDrawable()) == null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable();
                } else {
                    drawableNewDrawable = null;
                }
            }
        } else {
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable == null) {
            return null;
        }
        return new b(drawableNewDrawable, this.f21225a, this.f21226b);
    }

    @Override // com.facebook.drawee.drawable.f, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i7 = bounds.right;
        int i10 = bounds.left;
        int i11 = i7 - i10;
        int i12 = bounds.bottom;
        int i13 = bounds.top;
        int i14 = i12 - i13;
        float f10 = this.f21227c;
        if (!this.f21226b) {
            f10 = 360.0f - f10;
        }
        canvas.rotate(f10, (i11 / 2) + i10, (i14 / 2) + i13);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        if (this.f21228d) {
            return;
        }
        this.f21228d = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21228d = false;
        this.f21227c += (int) ((20.0f / this.f21225a) * 360.0f);
        invalidateSelf();
    }
}
