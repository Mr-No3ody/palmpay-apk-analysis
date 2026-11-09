package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.camera.camera2.internal.F;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j extends f implements Rounded {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Path f21279A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Path f21280B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final RectF f21281C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f21283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RectF f21284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f21285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f21286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f21287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f21288g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f21290j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21292p;
    public float t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21293v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21294w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Drawable drawable) {
        super(drawable);
        drawable.getClass();
        this.f21282a = 1;
        this.f21283b = new RectF();
        this.f21286e = new float[8];
        this.f21287f = new float[8];
        this.f21288g = new Paint(1);
        this.f21289i = false;
        this.f21290j = 0.0f;
        this.f21291o = 0;
        this.f21292p = 0;
        this.t = 0.0f;
        this.f21293v = false;
        this.f21294w = false;
        this.f21279A = new Path();
        this.f21280B = new Path();
        this.f21281C = new RectF();
    }

    public final void a() {
        float[] fArr;
        Path path = this.f21279A;
        path.reset();
        Path path2 = this.f21280B;
        path2.reset();
        RectF rectF = this.f21281C;
        rectF.set(getBounds());
        float f10 = this.t;
        rectF.inset(f10, f10);
        if (this.f21282a == 1) {
            path.addRect(rectF, Path.Direction.CW);
        }
        boolean z3 = this.f21289i;
        float[] fArr2 = this.f21286e;
        if (z3) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f11 = -this.t;
        rectF.inset(f11, f11);
        float f12 = this.f21290j / 2.0f;
        rectF.inset(f12, f12);
        if (this.f21289i) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i7 = 0;
            while (true) {
                fArr = this.f21287f;
                if (i7 >= fArr.length) {
                    break;
                }
                fArr[i7] = (fArr2[i7] + this.t) - (this.f21290j / 2.0f);
                i7++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f13 = (-this.f21290j) / 2.0f;
        rectF.inset(f13, f13);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.drawee.drawable.f, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        RectF rectF = this.f21283b;
        rectF.set(getBounds());
        int i7 = F.i(this.f21282a);
        Path path = this.f21279A;
        Paint paint = this.f21288g;
        if (i7 == 0) {
            if (this.f21293v) {
                RectF rectF2 = this.f21284c;
                if (rectF2 == null) {
                    this.f21284c = new RectF(rectF);
                    this.f21285d = new Matrix();
                } else {
                    rectF2.set(rectF);
                }
                RectF rectF3 = this.f21284c;
                float f10 = this.f21290j;
                rectF3.inset(f10, f10);
                Matrix matrix = this.f21285d;
                if (matrix != null) {
                    matrix.setRectToRect(rectF, this.f21284c, Matrix.ScaleToFit.FILL);
                }
                int iSave = canvas.save();
                canvas.clipRect(rectF);
                canvas.concat(this.f21285d);
                super.draw(canvas);
                canvas.restoreToCount(iSave);
            } else {
                super.draw(canvas);
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.f21292p);
            paint.setStrokeWidth(0.0f);
            paint.setFilterBitmap(this.f21294w);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(path, paint);
            if (this.f21289i) {
                float fWidth = ((rectF.width() - rectF.height()) + this.f21290j) / 2.0f;
                float fHeight = ((rectF.height() - rectF.width()) + this.f21290j) / 2.0f;
                if (fWidth > 0.0f) {
                    float f11 = rectF.left;
                    canvas2 = canvas;
                    canvas2.drawRect(f11, rectF.top, f11 + fWidth, rectF.bottom, paint);
                    float f12 = rectF.right;
                    canvas2.drawRect(f12 - fWidth, rectF.top, f12, rectF.bottom, paint);
                } else {
                    canvas2 = canvas;
                }
                if (fHeight > 0.0f) {
                    float f13 = rectF.left;
                    float f14 = rectF.top;
                    canvas2.drawRect(f13, f14, rectF.right, f14 + fHeight, paint);
                    float f15 = rectF.left;
                    float f16 = rectF.bottom;
                    canvas2.drawRect(f15, f16 - fHeight, rectF.right, f16, paint);
                }
            }
            if (this.f21291o != 0) {
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(this.f21291o);
                paint.setStrokeWidth(this.f21290j);
                path.setFillType(Path.FillType.EVEN_ODD);
                canvas2.drawPath(this.f21280B, paint);
            }
        }
        if (i7 == 1) {
            int iSave2 = canvas.save();
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        canvas2 = canvas;
        if (this.f21291o != 0) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.f21291o);
            paint.setStrokeWidth(this.f21290j);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas2.drawPath(this.f21280B, paint);
        }
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final int getBorderColor() {
        return this.f21291o;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final float getBorderWidth() {
        return this.f21290j;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final float getPadding() {
        return this.t;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final boolean getPaintFilterBitmap() {
        return this.f21294w;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final float[] getRadii() {
        return this.f21286e;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final boolean getScaleDownInsideBorders() {
        return this.f21293v;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final boolean isCircle() {
        return this.f21289i;
    }

    @Override // com.facebook.drawee.drawable.f, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setBorder(int i7, float f10) {
        this.f21291o = i7;
        this.f21290j = f10;
        a();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setCircle(boolean z3) {
        this.f21289i = z3;
        a();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setPadding(float f10) {
        this.t = f10;
        a();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setPaintFilterBitmap(boolean z3) {
        if (this.f21294w != z3) {
            this.f21294w = z3;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setRadii(float[] fArr) {
        float[] fArr2 = this.f21286e;
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
        Arrays.fill(this.f21286e, f10);
        a();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setRepeatEdgePixels(boolean z3) {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setScaleDownInsideBorders(boolean z3) {
        this.f21293v = z3;
        a();
        invalidateSelf();
    }
}
