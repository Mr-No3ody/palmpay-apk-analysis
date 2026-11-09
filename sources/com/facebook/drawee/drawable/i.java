package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Drawable implements Rounded {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f21268c;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f21277v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f21266a = new float[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f21267b = new float[8];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f21269d = new Paint(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21270e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f21271f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f21272g = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21273i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21274j = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21275o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Path f21276p = new Path();
    public final Path t = new Path();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f21278w = new RectF();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f21265A = 255;

    public i(int i7) {
        this.f21277v = 0;
        if (this.f21277v != i7) {
            this.f21277v = i7;
            invalidateSelf();
        }
    }

    public final void a() {
        float[] fArr;
        float[] fArr2;
        Path path = this.f21276p;
        path.reset();
        Path path2 = this.t;
        path2.reset();
        RectF rectF = this.f21278w;
        rectF.set(getBounds());
        float f10 = this.f21271f;
        rectF.inset(f10 / 2.0f, f10 / 2.0f);
        boolean z3 = this.f21270e;
        int i7 = 0;
        float[] fArr3 = this.f21266a;
        if (z3) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i10 = 0;
            while (true) {
                fArr = this.f21267b;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = (fArr3[i10] + this.f21272g) - (this.f21271f / 2.0f);
                i10++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f11 = this.f21271f;
        rectF.inset((-f11) / 2.0f, (-f11) / 2.0f);
        float f12 = this.f21272g + (this.f21274j ? this.f21271f : 0.0f);
        rectF.inset(f12, f12);
        if (this.f21270e) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f21274j) {
            if (this.f21268c == null) {
                this.f21268c = new float[8];
            }
            while (true) {
                fArr2 = this.f21268c;
                if (i7 >= fArr2.length) {
                    break;
                }
                fArr2[i7] = fArr3[i7] - this.f21271f;
                i7++;
            }
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr3, Path.Direction.CW);
        }
        float f13 = -f12;
        rectF.inset(f13, f13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f21269d;
        paint.setColor(com.facebook.imagepipeline.nativecode.b.C(this.f21277v, this.f21265A));
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(this.f21275o);
        canvas.drawPath(this.f21276p, paint);
        if (this.f21271f != 0.0f) {
            paint.setColor(com.facebook.imagepipeline.nativecode.b.C(this.f21273i, this.f21265A));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f21271f);
            canvas.drawPath(this.t, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f21265A;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final int getBorderColor() {
        return this.f21273i;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final float getBorderWidth() {
        return this.f21271f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iC = com.facebook.imagepipeline.nativecode.b.C(this.f21277v, this.f21265A) >>> 24;
        if (iC != 0) {
            return iC != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final float getPadding() {
        return this.f21272g;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final boolean getPaintFilterBitmap() {
        return this.f21275o;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final float[] getRadii() {
        return this.f21266a;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final boolean getScaleDownInsideBorders() {
        return this.f21274j;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final boolean isCircle() {
        return this.f21270e;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (i7 != this.f21265A) {
            this.f21265A = i7;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setBorder(int i7, float f10) {
        if (this.f21273i != i7) {
            this.f21273i = i7;
            invalidateSelf();
        }
        if (this.f21271f != f10) {
            this.f21271f = f10;
            a();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setCircle(boolean z3) {
        this.f21270e = z3;
        a();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setPadding(float f10) {
        if (this.f21272g != f10) {
            this.f21272g = f10;
            a();
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setPaintFilterBitmap(boolean z3) {
        if (this.f21275o != z3) {
            this.f21275o = z3;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setRadii(float[] fArr) {
        float[] fArr2 = this.f21266a;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            p213o2.e.b(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        a();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setRadius(float f10) {
        p213o2.e.b(f10 >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f21266a, f10);
        a();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setRepeatEdgePixels(boolean z3) {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setScaleDownInsideBorders(boolean z3) {
        if (this.f21274j != z3) {
            this.f21274j = z3;
            a();
            invalidateSelf();
        }
    }
}
