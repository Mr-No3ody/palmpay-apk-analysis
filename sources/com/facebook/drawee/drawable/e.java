package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Drawable implements Drawable.Callback, TransformCallback, TransformAwareDrawable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int[] f21234A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f21235B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean[] f21236C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f21237H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f21238L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f21239M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TransformCallback f21240a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable[] f21242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DrawableParent[] f21243d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Drawable[] f21248j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f21249o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21250p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f21251v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f21252w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f21241b = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f21244e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21245f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21246g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21247i = false;

    public e(Drawable[] drawableArr) {
        Drawable[] drawableArr2;
        this.f21242c = drawableArr;
        int i7 = 0;
        while (true) {
            drawableArr2 = this.f21242c;
            if (i7 >= drawableArr2.length) {
                break;
            }
            com.facebook.imagepipeline.nativecode.b.P(drawableArr2[i7], this, this);
            i7++;
        }
        this.f21243d = new DrawableParent[drawableArr2.length];
        this.f21239M = true;
        if (!(drawableArr.length >= 1)) {
            throw new IllegalStateException("At least one layer required!");
        }
        this.f21248j = drawableArr;
        int[] iArr = new int[drawableArr.length];
        this.f21252w = iArr;
        int[] iArr2 = new int[drawableArr.length];
        this.f21234A = iArr2;
        this.f21235B = 255;
        boolean[] zArr = new boolean[drawableArr.length];
        this.f21236C = zArr;
        this.f21237H = 0;
        this.f21249o = 2;
        this.f21250p = 2;
        Arrays.fill(iArr, 0);
        iArr[0] = 255;
        Arrays.fill(iArr2, 0);
        iArr2[0] = 255;
        Arrays.fill(zArr, false);
        zArr[0] = true;
    }

    public final void a() {
        this.f21237H--;
        invalidateSelf();
    }

    public final void b() {
        this.f21250p = 2;
        for (int i7 = 0; i7 < this.f21248j.length; i7++) {
            this.f21234A[i7] = this.f21236C[i7] ? 255 : 0;
        }
        invalidateSelf();
    }

    public final Drawable c(int i7) {
        p213o2.e.a(Boolean.valueOf(i7 >= 0));
        Drawable[] drawableArr = this.f21242c;
        p213o2.e.a(Boolean.valueOf(i7 < drawableArr.length));
        return drawableArr[i7];
    }

    public final Drawable d(int i7, Drawable drawable) {
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException();
        }
        Drawable[] drawableArr = this.f21242c;
        if (!(i7 < drawableArr.length)) {
            throw new IllegalArgumentException();
        }
        Drawable drawable2 = drawableArr[i7];
        if (drawable != drawable2) {
            if (drawable != null && this.f21247i) {
                drawable.mutate();
            }
            com.facebook.imagepipeline.nativecode.b.P(drawableArr[i7], null, null);
            com.facebook.imagepipeline.nativecode.b.P(drawable, null, null);
            com.facebook.imagepipeline.nativecode.b.Q(drawable, this.f21241b);
            com.facebook.imagepipeline.nativecode.b.h(drawable, this);
            com.facebook.imagepipeline.nativecode.b.P(drawable, this, this);
            this.f21246g = false;
            drawableArr[i7] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean zE;
        int i7;
        int i10 = this.f21250p;
        int[] iArr = this.f21234A;
        Drawable[] drawableArr = this.f21248j;
        if (i10 == 0) {
            System.arraycopy(iArr, 0, this.f21252w, 0, drawableArr.length);
            this.f21251v = SystemClock.uptimeMillis();
            zE = e(this.t == 0 ? 1.0f : 0.0f);
            if (!this.f21238L && (i7 = this.f21249o) >= 0) {
                boolean[] zArr = this.f21236C;
                if (i7 < zArr.length && zArr[i7]) {
                    this.f21238L = true;
                }
            }
            this.f21250p = zE ? 2 : 1;
        } else if (i10 != 1) {
            zE = true;
        } else {
            p213o2.e.f(this.t > 0);
            zE = e((SystemClock.uptimeMillis() - this.f21251v) / this.t);
            this.f21250p = zE ? 2 : 1;
        }
        for (int i11 = 0; i11 < drawableArr.length; i11++) {
            Drawable drawable = drawableArr[i11];
            int iCeil = (int) Math.ceil(((double) (iArr[i11] * this.f21235B)) / 255.0d);
            if (drawable != null && iCeil > 0) {
                this.f21237H++;
                if (this.f21239M) {
                    drawable.mutate();
                }
                drawable.setAlpha(iCeil);
                this.f21237H--;
                drawable.draw(canvas);
            }
        }
        if (!zE) {
            invalidateSelf();
        } else if (this.f21238L) {
            this.f21238L = false;
        }
    }

    public final boolean e(float f10) {
        boolean z3 = true;
        for (int i7 = 0; i7 < this.f21248j.length; i7++) {
            boolean z8 = this.f21236C[i7];
            int i10 = (int) (((z8 ? 1 : -1) * 255 * f10) + this.f21252w[i7]);
            int[] iArr = this.f21234A;
            iArr[i7] = i10;
            if (i10 < 0) {
                iArr[i7] = 0;
            }
            if (iArr[i7] > 255) {
                iArr[i7] = 255;
            }
            if (z8 && iArr[i7] < 255) {
                z3 = false;
            }
            if (!z8 && iArr[i7] > 0) {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f21235B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i7 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f21242c;
            if (i7 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i7++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i7 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f21242c;
            if (i7 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i7++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable[] drawableArr = this.f21242c;
        if (drawableArr.length == 0) {
            return -2;
        }
        int iResolveOpacity = -1;
        for (int i7 = 1; i7 < drawableArr.length; i7++) {
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
        }
        return iResolveOpacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int i7 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        while (true) {
            Drawable[] drawableArr = this.f21242c;
            if (i7 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                Rect rect2 = this.f21244e;
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i7++;
        }
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public final void getRootBounds(RectF rectF) {
        TransformCallback transformCallback = this.f21240a;
        if (transformCallback != null) {
            transformCallback.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public final void getTransform(Matrix matrix) {
        TransformCallback transformCallback = this.f21240a;
        if (transformCallback != null) {
            transformCallback.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f21237H == 0) {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!this.f21246g) {
            this.f21245f = false;
            int i7 = 0;
            while (true) {
                Drawable[] drawableArr = this.f21242c;
                boolean z3 = true;
                if (i7 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i7];
                boolean z8 = this.f21245f;
                if (drawable == null || !drawable.isStateful()) {
                    z3 = false;
                }
                this.f21245f = z8 | z3;
                i7++;
            }
            this.f21246g = true;
        }
        return this.f21245f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f21242c;
            if (i7 >= drawableArr.length) {
                this.f21247i = true;
                return this;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.mutate();
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f21242c;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        int i10 = 0;
        boolean z3 = false;
        while (true) {
            Drawable[] drawableArr = this.f21242c;
            if (i10 >= drawableArr.length) {
                return z3;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.setLevel(i7)) {
                z3 = true;
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i7 = 0;
        boolean z3 = false;
        while (true) {
            Drawable[] drawableArr = this.f21242c;
            if (i7 >= drawableArr.length) {
                return z3;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null && drawable.setState(iArr)) {
                z3 = true;
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        scheduleSelf(runnable, j6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.f21235B != i7) {
            this.f21235B = i7;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f21241b;
        dVar.f21231c = colorFilter;
        int i7 = 0;
        dVar.f21230b = colorFilter != null;
        while (true) {
            Drawable[] drawableArr = this.f21242c;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z3) {
        this.f21241b.f21232d = z3 ? 1 : 0;
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f21242c;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setDither(z3);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z3) {
        this.f21241b.f21233e = z3 ? 1 : 0;
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f21242c;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setFilterBitmap(z3);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f21242c;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setHotspot(f10, f11);
            }
            i7++;
        }
    }

    @Override // com.facebook.drawee.drawable.TransformAwareDrawable
    public final void setTransformCallback(TransformCallback transformCallback) {
        this.f21240a = transformCallback;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z8) {
        boolean visible = super.setVisible(z3, z8);
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f21242c;
            if (i7 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setVisible(z3, z8);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
