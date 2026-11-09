package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends Drawable implements Rounded, TransformAwareDrawable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RectF f21296B;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Matrix f21302X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Matrix f21303Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f21305a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float[] f21316p;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TransformCallback f21320s0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21306b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21307c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f21308d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f21309e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21310f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21311g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Path f21312i = new Path();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f21313j = new float[8];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float[] f21315o = new float[8];
    public final RectF t = new RectF();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f21321v = new RectF();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f21322w = new RectF();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final RectF f21295A = new RectF();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Matrix f21297C = new Matrix();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Matrix f21298H = new Matrix();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Matrix f21299L = new Matrix();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Matrix f21300M = new Matrix();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final Matrix f21301Q = new Matrix();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final Matrix f21304Z = new Matrix();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f21314k0 = 0.0f;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f21317p0 = false;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f21318q0 = false;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f21319r0 = true;

    public k(Drawable drawable) {
        this.f21305a = drawable;
    }

    public final void a() {
        if (this.f21319r0) {
            Path path = this.f21312i;
            path.reset();
            RectF rectF = this.t;
            float f10 = this.f21308d / 2.0f;
            rectF.inset(f10, f10);
            boolean z3 = this.f21306b;
            float[] fArr = this.f21315o;
            float[] fArr2 = this.f21313j;
            if (z3) {
                path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                for (int i7 = 0; i7 < fArr.length; i7++) {
                    fArr[i7] = (fArr2[i7] + this.f21314k0) - (this.f21308d / 2.0f);
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            float f11 = (-this.f21308d) / 2.0f;
            rectF.inset(f11, f11);
            Path path2 = this.f21309e;
            path2.reset();
            float f12 = this.f21314k0 + (this.f21317p0 ? this.f21308d : 0.0f);
            rectF.inset(f12, f12);
            if (this.f21306b) {
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f21317p0) {
                if (this.f21316p == null) {
                    this.f21316p = new float[8];
                }
                for (int i10 = 0; i10 < fArr.length; i10++) {
                    this.f21316p[i10] = fArr2[i10] - this.f21308d;
                }
                path2.addRoundRect(rectF, this.f21316p, Path.Direction.CW);
            } else {
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
            }
            float f13 = -f12;
            rectF.inset(f13, f13);
            path2.setFillType(Path.FillType.WINDING);
            this.f21319r0 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00dc  */
    public void b() {
        Matrix matrix;
        Matrix matrix2;
        Matrix matrix3;
        Matrix matrix4;
        Matrix matrix5;
        Matrix matrix6;
        boolean zEquals;
        TransformCallback transformCallback = this.f21320s0;
        Matrix matrix7 = this.f21299L;
        RectF rectF = this.t;
        if (transformCallback != null) {
            transformCallback.getTransform(matrix7);
            this.f21320s0.getRootBounds(rectF);
        } else {
            matrix7.reset();
            rectF.set(getBounds());
        }
        RectF rectF2 = this.f21322w;
        Drawable drawable = this.f21305a;
        rectF2.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        RectF rectF3 = this.f21295A;
        rectF3.set(drawable.getBounds());
        Matrix matrix8 = this.f21297C;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix8.setRectToRect(rectF2, rectF3, scaleToFit);
        if (this.f21317p0) {
            RectF rectF4 = this.f21296B;
            if (rectF4 == null) {
                this.f21296B = new RectF(rectF);
            } else {
                rectF4.set(rectF);
            }
            RectF rectF5 = this.f21296B;
            float f10 = this.f21308d;
            rectF5.inset(f10, f10);
            if (this.f21302X == null) {
                this.f21302X = new Matrix();
            }
            this.f21302X.setRectToRect(rectF, this.f21296B, scaleToFit);
        } else {
            Matrix matrix9 = this.f21302X;
            if (matrix9 != null) {
                matrix9.reset();
            }
        }
        Matrix matrix10 = this.f21300M;
        boolean zEquals2 = matrix7.equals(matrix10);
        Matrix matrix11 = this.f21298H;
        if (zEquals2 && matrix8.equals(matrix11)) {
            Matrix matrix12 = this.f21302X;
            if (matrix12 != null) {
                Matrix matrix13 = this.f21303Y;
                if (matrix12 == null && matrix13 == null) {
                    zEquals = true;
                } else {
                    zEquals = (matrix12 == null || matrix13 == null) ? false : matrix12.equals(matrix13);
                }
                if (!zEquals) {
                    this.f21310f = true;
                    matrix7.invert(this.f21301Q);
                    matrix = this.f21304Z;
                    matrix.set(matrix7);
                    if (this.f21317p0) {
                        matrix.postConcat(matrix6);
                    }
                    matrix.preConcat(matrix8);
                    matrix10.set(matrix7);
                    matrix11.set(matrix8);
                    if (this.f21317p0) {
                        matrix3 = this.f21303Y;
                        if (matrix3 == null) {
                            matrix4 = this.f21302X;
                            if (matrix4 == null) {
                                matrix5 = null;
                            } else {
                                matrix5 = new Matrix(matrix4);
                            }
                            this.f21303Y = matrix5;
                        } else {
                            matrix3.set(this.f21302X);
                        }
                    } else {
                        matrix2 = this.f21303Y;
                        if (matrix2 != null) {
                            matrix2.reset();
                        }
                    }
                }
            }
        } else {
            this.f21310f = true;
            matrix7.invert(this.f21301Q);
            matrix = this.f21304Z;
            matrix.set(matrix7);
            if (this.f21317p0 && (matrix6 = this.f21302X) != null) {
                matrix.postConcat(matrix6);
            }
            matrix.preConcat(matrix8);
            matrix10.set(matrix7);
            matrix11.set(matrix8);
            if (this.f21317p0) {
                matrix3 = this.f21303Y;
                if (matrix3 == null) {
                    matrix4 = this.f21302X;
                    if (matrix4 == null) {
                        matrix5 = null;
                    } else {
                        matrix5 = new Matrix(matrix4);
                    }
                    this.f21303Y = matrix5;
                } else {
                    matrix3.set(this.f21302X);
                }
            } else {
                matrix2 = this.f21303Y;
                if (matrix2 != null) {
                    matrix2.reset();
                }
            }
        }
        RectF rectF6 = this.f21321v;
        if (rectF.equals(rectF6)) {
            return;
        }
        this.f21319r0 = true;
        rectF6.set(rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.f21305a.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        p181m3.a.a();
        this.f21305a.draw(canvas);
        p181m3.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f21305a.getAlpha();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final int getBorderColor() {
        return this.f21311g;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final float getBorderWidth() {
        return this.f21308d;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f21305a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f21305a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f21305a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f21305a.getOpacity();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final float getPadding() {
        return this.f21314k0;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final boolean getPaintFilterBitmap() {
        return this.f21318q0;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final float[] getRadii() {
        return this.f21313j;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final boolean getScaleDownInsideBorders() {
        return this.f21317p0;
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final boolean isCircle() {
        return this.f21306b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f21305a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f21305a.setAlpha(i7);
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setBorder(int i7, float f10) {
        if (this.f21311g == i7 && this.f21308d == f10) {
            return;
        }
        this.f21311g = i7;
        this.f21308d = f10;
        this.f21319r0 = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setCircle(boolean z3) {
        this.f21306b = z3;
        this.f21319r0 = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i7, PorterDuff.Mode mode) {
        this.f21305a.setColorFilter(i7, mode);
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setPadding(float f10) {
        if (this.f21314k0 != f10) {
            this.f21314k0 = f10;
            this.f21319r0 = true;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setPaintFilterBitmap(boolean z3) {
        if (this.f21318q0 != z3) {
            this.f21318q0 = z3;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setRadii(float[] fArr) {
        float[] fArr2 = this.f21313j;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
            this.f21307c = false;
        } else {
            p213o2.e.b(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, fArr2, 0, 8);
            this.f21307c = false;
            for (int i7 = 0; i7 < 8; i7++) {
                this.f21307c |= fArr[i7] > 0.0f;
            }
        }
        this.f21319r0 = true;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setRadius(float f10) {
        p213o2.e.f(f10 >= 0.0f);
        Arrays.fill(this.f21313j, f10);
        this.f21307c = f10 != 0.0f;
        this.f21319r0 = true;
        invalidateSelf();
    }

    public void setRepeatEdgePixels(boolean z3) {
    }

    @Override // com.facebook.drawee.drawable.Rounded
    public final void setScaleDownInsideBorders(boolean z3) {
        if (this.f21317p0 != z3) {
            this.f21317p0 = z3;
            this.f21319r0 = true;
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.TransformAwareDrawable
    public final void setTransformCallback(TransformCallback transformCallback) {
        this.f21320s0 = transformCallback;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f21305a.setColorFilter(colorFilter);
    }
}
