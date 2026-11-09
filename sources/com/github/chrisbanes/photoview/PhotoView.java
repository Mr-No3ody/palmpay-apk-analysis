package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes.dex */
public class PhotoView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f22332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView.ScaleType f22333b;

    public PhotoView(Context context) {
        this(context, null);
    }

    public e getAttacher() {
        return this.f22332a;
    }

    public RectF getDisplayRect() {
        e eVar = this.f22332a;
        eVar.b();
        return eVar.c(eVar.d());
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f22332a.t;
    }

    public float getMaximumScale() {
        return this.f22332a.f22352e;
    }

    public float getMediumScale() {
        return this.f22332a.f22351d;
    }

    public float getMinimumScale() {
        return this.f22332a.f22350c;
    }

    public float getScale() {
        return this.f22332a.e();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f22332a.f22363s0;
    }

    public void setAllowParentInterceptOnEdge(boolean z3) {
        this.f22332a.f22353f = z3;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i7, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i7, i10, i11, i12);
        if (frame) {
            this.f22332a.g();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        e eVar = this.f22332a;
        if (eVar != null) {
            eVar.g();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i7) {
        super.setImageResource(i7);
        e eVar = this.f22332a;
        if (eVar != null) {
            eVar.g();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        e eVar = this.f22332a;
        if (eVar != null) {
            eVar.g();
        }
    }

    public void setMaximumScale(float f10) {
        e eVar = this.f22332a;
        p140j8.f.c(eVar.f22350c, eVar.f22351d, f10);
        eVar.f22352e = f10;
    }

    public void setMediumScale(float f10) {
        e eVar = this.f22332a;
        p140j8.f.c(eVar.f22350c, f10, eVar.f22352e);
        eVar.f22351d = f10;
    }

    public void setMinimumScale(float f10) {
        e eVar = this.f22332a;
        p140j8.f.c(f10, eVar.f22351d, eVar.f22352e);
        eVar.f22350c = f10;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f22332a.f22343M = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f22332a.f22356j.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f22332a.f22344Q = onLongClickListener;
    }

    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
        this.f22332a.f22339B = onMatrixChangedListener;
    }

    public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
        this.f22332a.f22341H = onOutsidePhotoTapListener;
    }

    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.f22332a.f22340C = onPhotoTapListener;
    }

    public void setOnScaleChangeListener(OnScaleChangedListener onScaleChangedListener) {
        this.f22332a.f22345X = onScaleChangedListener;
    }

    public void setOnSingleFlingListener(OnSingleFlingListener onSingleFlingListener) {
        this.f22332a.f22346Y = onSingleFlingListener;
    }

    public void setOnViewDragListener(OnViewDragListener onViewDragListener) {
        this.f22332a.f22347Z = onViewDragListener;
    }

    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
        this.f22332a.f22342L = onViewTapListener;
    }

    public void setRotationBy(float f10) {
        e eVar = this.f22332a;
        eVar.f22365v.postRotate(f10 % 360.0f);
        eVar.a();
    }

    public void setRotationTo(float f10) {
        e eVar = this.f22332a;
        eVar.f22365v.setRotate(f10 % 360.0f);
        eVar.a();
    }

    public void setScale(float f10) {
        e eVar = this.f22332a;
        PhotoView photoView = eVar.f22355i;
        eVar.f(f10, photoView.getRight() / 2, photoView.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        e eVar = this.f22332a;
        if (eVar == null) {
            this.f22333b = scaleType;
            return;
        }
        eVar.getClass();
        if (scaleType == null) {
            return;
        }
        if (f.f22367a[scaleType.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (scaleType != eVar.f22363s0) {
            eVar.f22363s0 = scaleType;
            eVar.g();
        }
    }

    public void setZoomTransitionDuration(int i7) {
        this.f22332a.f22349b = i7;
    }

    public void setZoomable(boolean z3) {
        e eVar = this.f22332a;
        eVar.f22362r0 = z3;
        eVar.g();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f22332a = new e(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f22333b;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f22333b = null;
        }
    }
}
