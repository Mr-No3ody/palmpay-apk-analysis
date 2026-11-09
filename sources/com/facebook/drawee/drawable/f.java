package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class f extends Drawable implements Drawable.Callback, TransformCallback, TransformAwareDrawable, DrawableParent {
    private static final Matrix sTempTransform = new Matrix();

    @Nullable
    private Drawable mCurrentDelegate;
    private final d mDrawableProperties = new d();

    @Nullable
    protected TransformCallback mTransformCallback;

    public f(Drawable drawable) {
        this.mCurrentDelegate = drawable;
        com.facebook.imagepipeline.nativecode.b.P(drawable, this, this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.mCurrentDelegate;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable getCurrent() {
        return this.mCurrentDelegate;
    }

    @Override // com.facebook.drawee.drawable.DrawableParent
    @Nullable
    public Drawable getDrawable() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.mCurrentDelegate;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.mCurrentDelegate;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.mCurrentDelegate;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    public void getParentTransform(Matrix matrix) {
        TransformCallback transformCallback = this.mTransformCallback;
        if (transformCallback != null) {
            transformCallback.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public void getRootBounds(RectF rectF) {
        TransformCallback transformCallback = this.mTransformCallback;
        if (transformCallback != null) {
            transformCallback.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
    }

    public void getTransformedBounds(RectF rectF) {
        Matrix matrix = sTempTransform;
        getParentTransform(matrix);
        rectF.set(getBounds());
        matrix.mapRect(rectF);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i7) {
        Drawable drawable = this.mCurrentDelegate;
        return drawable == null ? super.onLevelChange(i7) : drawable.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.mCurrentDelegate;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        scheduleSelf(runnable, j6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.mDrawableProperties.f21229a = i7;
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        d dVar = this.mDrawableProperties;
        dVar.f21231c = colorFilter;
        dVar.f21230b = colorFilter != null;
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Nullable
    public Drawable setCurrent(@Nullable Drawable drawable) {
        Drawable currentWithoutInvalidate = setCurrentWithoutInvalidate(drawable);
        invalidateSelf();
        return currentWithoutInvalidate;
    }

    @Nullable
    public Drawable setCurrentWithoutInvalidate(@Nullable Drawable drawable) {
        Drawable drawable2 = this.mCurrentDelegate;
        com.facebook.imagepipeline.nativecode.b.P(drawable2, null, null);
        com.facebook.imagepipeline.nativecode.b.P(drawable, null, null);
        com.facebook.imagepipeline.nativecode.b.Q(drawable, this.mDrawableProperties);
        com.facebook.imagepipeline.nativecode.b.h(drawable, this);
        com.facebook.imagepipeline.nativecode.b.P(drawable, this, this);
        this.mCurrentDelegate = drawable;
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z3) {
        this.mDrawableProperties.f21232d = z3 ? 1 : 0;
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setDither(z3);
        }
    }

    @Override // com.facebook.drawee.drawable.DrawableParent
    @Nullable
    public Drawable setDrawable(@Nullable Drawable drawable) {
        return setCurrent(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z3) {
        this.mDrawableProperties.f21233e = z3 ? 1 : 0;
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setFilterBitmap(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.mCurrentDelegate;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // com.facebook.drawee.drawable.TransformAwareDrawable
    public void setTransformCallback(@Nullable TransformCallback transformCallback) {
        this.mTransformCallback = transformCallback;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z8) {
        boolean visible = super.setVisible(z3, z8);
        Drawable drawable = this.mCurrentDelegate;
        return drawable == null ? visible : drawable.setVisible(z3, z8);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
