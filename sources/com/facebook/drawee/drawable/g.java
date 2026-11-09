package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f21253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f21256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f21257e;

    public g(BitmapDrawable bitmapDrawable, int i7, int i10) {
        super(bitmapDrawable);
        this.f21253a = new Matrix();
        this.f21254b = i7 - (i7 % 90);
        this.f21255c = (i10 < 0 || i10 > 8) ? 0 : i10;
        this.f21256d = new Matrix();
        this.f21257e = new RectF();
    }

    @Override // com.facebook.drawee.drawable.f, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i7;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f21254b <= 0 && ((i7 = this.f21255c) == 0 || i7 == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f21253a);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // com.facebook.drawee.drawable.f, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i7 = this.f21255c;
        return (i7 == 5 || i7 == 7 || this.f21254b % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.drawable.f, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i7 = this.f21255c;
        return (i7 == 5 || i7 == 7 || this.f21254b % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.drawable.f, com.facebook.drawee.drawable.TransformCallback
    public final void getTransform(Matrix transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        getParentTransform(transform);
        Matrix matrix = this.f21253a;
        if (matrix.isIdentity()) {
            return;
        }
        transform.preConcat(matrix);
    }

    @Override // com.facebook.drawee.drawable.f, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        int i7 = this.f21255c;
        int i10 = this.f21254b;
        if (i10 <= 0 && (i7 == 0 || i7 == 1)) {
            current.setBounds(bounds);
            return;
        }
        Matrix matrix = this.f21253a;
        if (i7 == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i7 == 7) {
            matrix.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            matrix.postScale(-1.0f, 1.0f);
        } else if (i7 == 4) {
            matrix.setScale(1.0f, -1.0f);
        } else if (i7 != 5) {
            matrix.setRotate(i10, bounds.centerX(), bounds.centerY());
        } else {
            matrix.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            matrix.postScale(1.0f, -1.0f);
        }
        Matrix matrix2 = this.f21256d;
        matrix2.reset();
        matrix.invert(matrix2);
        RectF rectF = this.f21257e;
        rectF.set(bounds);
        matrix2.mapRect(rectF);
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
