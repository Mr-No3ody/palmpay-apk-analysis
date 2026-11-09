package com.google.android.material.loadingindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.q;
import com.google.android.material.R;
import com.google.android.material.progressindicator.AnimatorDurationScaleProvider;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
public final class LoadingIndicatorDrawable extends Drawable implements Drawable.Callback {

    @IntRange(from = 0, to = 255)
    int alpha;

    @NonNull
    private LoadingIndicatorAnimatorDelegate animatorDelegate;

    @NonNull
    private final Context context;

    @NonNull
    private LoadingIndicatorDrawingDelegate drawingDelegate;

    @NonNull
    private final LoadingIndicatorSpec specs;
    private Drawable staticDummyDrawable;
    AnimatorDurationScaleProvider animatorDurationScaleProvider = new AnimatorDurationScaleProvider();

    @NonNull
    Paint paint = new Paint();

    public LoadingIndicatorDrawable(@NonNull Context context, @NonNull LoadingIndicatorSpec loadingIndicatorSpec, @NonNull LoadingIndicatorDrawingDelegate loadingIndicatorDrawingDelegate, @NonNull LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate) {
        this.context = context;
        this.specs = loadingIndicatorSpec;
        this.drawingDelegate = loadingIndicatorDrawingDelegate;
        this.animatorDelegate = loadingIndicatorAnimatorDelegate;
        loadingIndicatorAnimatorDelegate.registerDrawable(this);
        setAlpha(255);
    }

    @NonNull
    public static LoadingIndicatorDrawable create(@NonNull Context context, @NonNull LoadingIndicatorSpec loadingIndicatorSpec) {
        LoadingIndicatorDrawable loadingIndicatorDrawable = new LoadingIndicatorDrawable(context, loadingIndicatorSpec, new LoadingIndicatorDrawingDelegate(loadingIndicatorSpec), new LoadingIndicatorAnimatorDelegate(loadingIndicatorSpec));
        loadingIndicatorDrawable.setStaticDummyDrawable(q.a(null, context.getResources(), R.drawable.ic_mtrl_arrow_circle));
        return loadingIndicatorDrawable;
    }

    private boolean isSystemAnimatorDisabled() {
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.animatorDurationScaleProvider;
        return animatorDurationScaleProvider != null && animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) == 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable;
        Rect rect = new Rect();
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
                drawable.setBounds(bounds);
                this.staticDummyDrawable.setTint(this.specs.indicatorColors[0]);
                this.staticDummyDrawable.draw(canvas);
            } else {
                canvas.save();
                this.drawingDelegate.adjustCanvas(canvas, bounds);
                this.drawingDelegate.drawContainer(canvas, this.paint, this.specs.containerColor, getAlpha());
                this.drawingDelegate.drawIndicator(canvas, this.paint, this.animatorDelegate.indicatorState, getAlpha());
                canvas.restore();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    @NonNull
    public LoadingIndicatorAnimatorDelegate getAnimatorDelegate() {
        return this.animatorDelegate;
    }

    @NonNull
    public LoadingIndicatorDrawingDelegate getDrawingDelegate() {
        return this.drawingDelegate;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Nullable
    @RestrictTo({c.f39801b})
    public Drawable getStaticDummyDrawable() {
        return this.staticDummyDrawable;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        if (this.alpha != i7) {
            this.alpha = i7;
            invalidateSelf();
        }
    }

    public void setAnimatorDelegate(@NonNull LoadingIndicatorAnimatorDelegate loadingIndicatorAnimatorDelegate) {
        this.animatorDelegate = loadingIndicatorAnimatorDelegate;
        loadingIndicatorAnimatorDelegate.registerDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDrawingDelegate(@NonNull LoadingIndicatorDrawingDelegate loadingIndicatorDrawingDelegate) {
        this.drawingDelegate = loadingIndicatorDrawingDelegate;
    }

    @RestrictTo({c.f39801b})
    @VisibleForTesting
    public void setStaticDummyDrawable(@Nullable Drawable drawable) {
        this.staticDummyDrawable = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    @CanIgnoreReturnValue
    public boolean setVisible(boolean z3, boolean z8) {
        return setVisible(z3, z8, z3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @CanIgnoreReturnValue
    public boolean setVisible(boolean z3, boolean z8, boolean z10) {
        boolean visible = super.setVisible(z3, z8);
        this.animatorDelegate.cancelAnimatorImmediately();
        if (z3 && z10 && !isSystemAnimatorDisabled()) {
            this.animatorDelegate.startAnimator();
        }
        return visible;
    }
}
