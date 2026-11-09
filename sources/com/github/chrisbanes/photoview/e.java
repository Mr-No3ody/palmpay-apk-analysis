package com.github.chrisbanes.photoview;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.camera.video.u;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public OnMatrixChangedListener f22339B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public OnPhotoTapListener f22340C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public OnOutsidePhotoTapListener f22341H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public OnViewTapListener f22342L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public View.OnClickListener f22343M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public View.OnLongClickListener f22344Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public OnScaleChangedListener f22345X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public OnSingleFlingListener f22346Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public OnViewDragListener f22347Z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PhotoView f22355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final GestureDetector f22356j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public p012ad.c f22357k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p012ad.e f22358o;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final b f22364t0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f22348a = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22349b = 200;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22350c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f22351d = 1.75f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22352e = 3.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22353f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22354g = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Matrix f22359p = new Matrix();
    public final Matrix t = new Matrix();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Matrix f22365v = new Matrix();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f22366w = new RectF();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float[] f22338A = new float[9];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f22360p0 = 2;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f22361q0 = 2;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f22362r0 = true;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ImageView.ScaleType f22363s0 = ImageView.ScaleType.FIT_CENTER;

    public e(PhotoView photoView) {
        b bVar = new b(this);
        this.f22364t0 = bVar;
        this.f22355i = photoView;
        photoView.setOnTouchListener(this);
        photoView.addOnLayoutChangeListener(this);
        if (photoView.isInEditMode()) {
            return;
        }
        this.f22358o = new p012ad.e(photoView.getContext(), bVar);
        GestureDetector gestureDetector = new GestureDetector(photoView.getContext(), new androidx.camera.view.impl.e(this, 2));
        this.f22356j = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c(this));
    }

    public final void a() {
        RectF rectFC;
        if (b()) {
            Matrix matrixD = d();
            this.f22355i.setImageMatrix(matrixD);
            if (this.f22339B == null || (rectFC = c(matrixD)) == null) {
                return;
            }
            this.f22339B.onMatrixChanged(rectFC);
        }
    }

    public final boolean b() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        RectF rectFC = c(d());
        if (rectFC == null) {
            return false;
        }
        float fHeight = rectFC.height();
        float fWidth = rectFC.width();
        PhotoView photoView = this.f22355i;
        float height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        float f15 = 0.0f;
        if (fHeight <= height) {
            int i7 = d.f22337a[this.f22363s0.ordinal()];
            if (i7 != 2) {
                if (i7 != 3) {
                    f13 = (height - fHeight) / 2.0f;
                    f14 = rectFC.top;
                } else {
                    f13 = height - fHeight;
                    f14 = rectFC.top;
                }
                f10 = f13 - f14;
            } else {
                f10 = -rectFC.top;
            }
            this.f22361q0 = 2;
        } else {
            float f16 = rectFC.top;
            if (f16 > 0.0f) {
                this.f22361q0 = 0;
                f10 = -f16;
            } else {
                float f17 = rectFC.bottom;
                if (f17 < height) {
                    this.f22361q0 = 1;
                    f10 = height - f17;
                } else {
                    this.f22361q0 = -1;
                    f10 = 0.0f;
                }
            }
        }
        float width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        if (fWidth <= width) {
            int i10 = d.f22337a[this.f22363s0.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    f11 = (width - fWidth) / 2.0f;
                    f12 = rectFC.left;
                } else {
                    f11 = width - fWidth;
                    f12 = rectFC.left;
                }
                f15 = f11 - f12;
            } else {
                f15 = -rectFC.left;
            }
            this.f22360p0 = 2;
        } else {
            float f18 = rectFC.left;
            if (f18 > 0.0f) {
                this.f22360p0 = 0;
                f15 = -f18;
            } else {
                float f19 = rectFC.right;
                if (f19 < width) {
                    f15 = width - f19;
                    this.f22360p0 = 1;
                } else {
                    this.f22360p0 = -1;
                }
            }
        }
        this.f22365v.postTranslate(f15, f10);
        return true;
    }

    public final RectF c(Matrix matrix) {
        Drawable drawable = this.f22355i.getDrawable();
        if (drawable == null) {
            return null;
        }
        RectF rectF = this.f22366w;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(rectF);
        return rectF;
    }

    public final Matrix d() {
        Matrix matrix = this.t;
        matrix.set(this.f22359p);
        matrix.postConcat(this.f22365v);
        return matrix;
    }

    public final float e() {
        Matrix matrix = this.f22365v;
        float[] fArr = this.f22338A;
        matrix.getValues(fArr);
        float fPow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(fPow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    public final void f(float f10, float f11, float f12, boolean z3) {
        if (f10 < this.f22350c || f10 > this.f22352e) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z3) {
            this.f22355i.post(new p012ad.a(this, e(), f10, f11, f12));
        } else {
            this.f22365v.setScale(f10, f10, f11, f12);
            a();
        }
    }

    public final void g() {
        RectF rectFC;
        if (this.f22362r0) {
            h(this.f22355i.getDrawable());
            return;
        }
        Matrix matrix = this.f22365v;
        matrix.reset();
        matrix.postRotate(0.0f);
        a();
        Matrix matrixD = d();
        this.f22355i.setImageMatrix(matrixD);
        if (this.f22339B != null && (rectFC = c(matrixD)) != null) {
            this.f22339B.onMatrixChanged(rectFC);
        }
        b();
    }

    public final void h(Drawable drawable) {
        RectF rectFC;
        if (drawable == null) {
            return;
        }
        PhotoView photoView = this.f22355i;
        float width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        float height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.f22359p;
        matrix.reset();
        float f10 = intrinsicWidth;
        float f11 = width / f10;
        float f12 = intrinsicHeight;
        float f13 = height / f12;
        ImageView.ScaleType scaleType = this.f22363s0;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((width - f10) / 2.0f, (height - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f11, f13);
            matrix.postScale(fMax, fMax);
            matrix.postTranslate((width - (f10 * fMax)) / 2.0f, u.a(f12, fMax, height, 2.0f));
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f11, f13));
            matrix.postScale(fMin, fMin);
            matrix.postTranslate((width - (f10 * fMin)) / 2.0f, u.a(f12, fMin, height, 2.0f));
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f10);
            }
            int i7 = d.f22337a[this.f22363s0.ordinal()];
            if (i7 == 1) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i7 == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i7 == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i7 == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        Matrix matrix2 = this.f22365v;
        matrix2.reset();
        matrix2.postRotate(0.0f);
        a();
        Matrix matrixD = d();
        this.f22355i.setImageMatrix(matrixD);
        if (this.f22339B != null && (rectFC = c(matrixD)) != null) {
            this.f22339B.onMatrixChanged(rectFC);
        }
        b();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i7 == i13 && i10 == i14 && i11 == i15 && i12 == i16) {
            return;
        }
        h(this.f22355i.getDrawable());
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        p012ad.e eVar;
        GestureDetector gestureDetector;
        ScaleGestureDetector scaleGestureDetector;
        boolean zIsInProgress;
        boolean z8;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (!this.f22362r0 || ((ImageView) view).getDrawable() == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (e() < this.f22350c) {
                    b();
                    RectF rectFC = c(d());
                    if (rectFC != null) {
                        view.post(new p012ad.a(this, e(), this.f22350c, rectFC.centerX(), rectFC.centerY()));
                        z3 = true;
                    }
                } else if (e() > this.f22352e) {
                    b();
                    RectF rectFC2 = c(d());
                    if (rectFC2 != null) {
                        view.post(new p012ad.a(this, e(), this.f22352e, rectFC2.centerX(), rectFC2.centerY()));
                        z3 = true;
                    }
                }
            }
            eVar = this.f22358o;
            if (eVar != null) {
                scaleGestureDetector = eVar.f11888c;
                zIsInProgress = scaleGestureDetector.isInProgress();
                z8 = eVar.f11890e;
                try {
                    scaleGestureDetector.onTouchEvent(motionEvent);
                    eVar.a(motionEvent);
                } catch (IllegalArgumentException unused) {
                }
                if (!zIsInProgress || scaleGestureDetector.isInProgress()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z8 || eVar.f11890e) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z10 && z11) {
                    z12 = true;
                }
                this.f22354g = z12;
                z3 = true;
            }
            gestureDetector = this.f22356j;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
            return z3;
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        p012ad.c cVar = this.f22357k0;
        if (cVar != null) {
            ((OverScroller) cVar.f11883d).forceFinished(true);
            this.f22357k0 = null;
        }
        z3 = false;
        eVar = this.f22358o;
        if (eVar != null) {
            scaleGestureDetector = eVar.f11888c;
            zIsInProgress = scaleGestureDetector.isInProgress();
            z8 = eVar.f11890e;
            scaleGestureDetector.onTouchEvent(motionEvent);
            eVar.a(motionEvent);
            if (zIsInProgress) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z8) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (z10) {
                z12 = true;
            }
            this.f22354g = z12;
            z3 = true;
        }
        gestureDetector = this.f22356j;
        if (gestureDetector == null) {
        }
        return z3;
    }
}
