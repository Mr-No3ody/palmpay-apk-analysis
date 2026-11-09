package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.video.u;
import androidx.vectordrawable.graphics.drawable.q;
import com.google.android.material.R;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
public final class IndeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    private IndeterminateAnimatorDelegate<ObjectAnimator> animatorDelegate;
    private DrawingDelegate<S> drawingDelegate;
    private Drawable staticDummyDrawable;

    public IndeterminateDrawable(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec, @NonNull DrawingDelegate<S> drawingDelegate, @NonNull IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        super(context, baseProgressIndicatorSpec);
        setDrawingDelegate(drawingDelegate);
        setAnimatorDelegate(indeterminateAnimatorDelegate);
    }

    @NonNull
    public static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return createCircularDrawable(context, circularProgressIndicatorSpec, new CircularDrawingDelegate(circularProgressIndicatorSpec));
    }

    @NonNull
    public static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return createLinearDrawable(context, linearProgressIndicatorSpec, new LinearDrawingDelegate(linearProgressIndicatorSpec));
    }

    private boolean isSystemAnimatorDisabled() {
        AnimatorDurationScaleProvider animatorDurationScaleProvider = this.animatorDurationScaleProvider;
        return animatorDurationScaleProvider != null && animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) == 0.0f;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0104  */
    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        int i7;
        Drawable drawable;
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.clipBounds)) {
            int i10 = 0;
            if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
                drawable.setBounds(getBounds());
                this.staticDummyDrawable.setTint(this.baseSpec.indicatorColors[0]);
                this.staticDummyDrawable.draw(canvas);
                return;
            }
            canvas.save();
            this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getBounds(), getGrowFraction(), isShowing(), isHiding());
            int i11 = this.baseSpec.indicatorTrackGapSize;
            int alpha = getAlpha();
            BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.baseSpec;
            boolean z3 = (baseProgressIndicatorSpec instanceof LinearProgressIndicatorSpec) || ((baseProgressIndicatorSpec instanceof CircularProgressIndicatorSpec) && ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indeterminateTrackVisible);
            boolean z8 = z3 && i11 == 0 && !baseProgressIndicatorSpec.hasWavyEffect(false);
            if (!z8) {
                if (z3) {
                    DrawingDelegate.ActiveIndicator activeIndicator = this.animatorDelegate.activeIndicators.get(0);
                    DrawingDelegate.ActiveIndicator activeIndicator2 = (DrawingDelegate.ActiveIndicator) u.e(1, this.animatorDelegate.activeIndicators);
                    DrawingDelegate<S> drawingDelegate = this.drawingDelegate;
                    if (drawingDelegate instanceof LinearDrawingDelegate) {
                        i7 = i11;
                        drawingDelegate.fillTrack(canvas, this.paint, 0.0f, activeIndicator.startFraction, this.baseSpec.trackColor, alpha, i7);
                        canvas2 = canvas;
                        this.drawingDelegate.fillTrack(canvas2, this.paint, activeIndicator2.endFraction, 1.0f, this.baseSpec.trackColor, alpha, i7);
                    } else {
                        canvas2 = canvas;
                        i7 = i11;
                        canvas.save();
                        canvas.rotate(activeIndicator2.rotationDegree);
                        this.drawingDelegate.fillTrack(canvas2, this.paint, activeIndicator2.endFraction, activeIndicator.startFraction + 1.0f, this.baseSpec.trackColor, alpha, i7);
                        canvas.restore();
                    }
                } else {
                    canvas2 = canvas;
                }
                while (i10 < this.animatorDelegate.activeIndicators.size()) {
                    DrawingDelegate.ActiveIndicator activeIndicator3 = this.animatorDelegate.activeIndicators.get(i10);
                    activeIndicator3.phaseFraction = getPhaseFraction();
                    this.drawingDelegate.fillIndicator(canvas, this.paint, activeIndicator3, getAlpha());
                    if (i10 <= 0 && !z8 && z3) {
                        this.drawingDelegate.fillTrack(canvas2, this.paint, this.animatorDelegate.activeIndicators.get(i10 - 1).endFraction, activeIndicator3.startFraction, this.baseSpec.trackColor, alpha, i7);
                    }
                    i10++;
                    canvas2 = canvas;
                }
                canvas.restore();
            }
            canvas2 = canvas;
            this.drawingDelegate.fillTrack(canvas2, this.paint, 0.0f, 1.0f, this.baseSpec.trackColor, alpha, 0);
            i7 = i11;
            while (i10 < this.animatorDelegate.activeIndicators.size()) {
                DrawingDelegate.ActiveIndicator activeIndicator4 = this.animatorDelegate.activeIndicators.get(i10);
                activeIndicator4.phaseFraction = getPhaseFraction();
                this.drawingDelegate.fillIndicator(canvas, this.paint, activeIndicator4, getAlpha());
                if (i10 <= 0) {
                }
                i10++;
                canvas2 = canvas;
            }
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @NonNull
    public IndeterminateAnimatorDelegate<ObjectAnimator> getAnimatorDelegate() {
        return this.animatorDelegate;
    }

    @NonNull
    public DrawingDelegate<S> getDrawingDelegate() {
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

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Nullable
    @RestrictTo({c.f39801b})
    public Drawable getStaticDummyDrawable() {
        return this.staticDummyDrawable;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@NonNull androidx.vectordrawable.graphics.drawable.c cVar) {
        super.registerAnimationCallback(cVar);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(@IntRange(from = 0, to = 255) int i7) {
        super.setAlpha(i7);
    }

    public void setAnimatorDelegate(@NonNull IndeterminateAnimatorDelegate<ObjectAnimator> indeterminateAnimatorDelegate) {
        this.animatorDelegate = indeterminateAnimatorDelegate;
        indeterminateAnimatorDelegate.registerDrawable(this);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public void setDrawingDelegate(@NonNull DrawingDelegate<S> drawingDelegate) {
        this.drawingDelegate = drawingDelegate;
    }

    @RestrictTo({c.f39801b})
    @VisibleForTesting
    public void setStaticDummyDrawable(@Nullable Drawable drawable) {
        this.staticDummyDrawable = drawable;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z3, boolean z8) {
        return super.setVisible(z3, z8);
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public boolean setVisibleInternal(boolean z3, boolean z8, boolean z10) {
        Drawable drawable;
        boolean visibleInternal = super.setVisibleInternal(z3, z8, z10);
        if (isSystemAnimatorDisabled() && (drawable = this.staticDummyDrawable) != null) {
            return drawable.setVisible(z3, z8);
        }
        if (!isRunning()) {
            this.animatorDelegate.cancelAnimatorImmediately();
        }
        if (!z3 || !z10) {
            return visibleInternal;
        }
        this.animatorDelegate.startAnimator();
        return visibleInternal;
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@NonNull androidx.vectordrawable.graphics.drawable.c cVar) {
        return super.unregisterAnimationCallback(cVar);
    }

    @NonNull
    public static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec, @NonNull CircularDrawingDelegate circularDrawingDelegate) {
        IndeterminateDrawable<CircularProgressIndicatorSpec> indeterminateDrawable = new IndeterminateDrawable<>(context, circularProgressIndicatorSpec, circularDrawingDelegate, circularProgressIndicatorSpec.indeterminateAnimationType == 1 ? new CircularIndeterminateRetreatAnimatorDelegate(context, circularProgressIndicatorSpec) : new CircularIndeterminateAdvanceAnimatorDelegate(circularProgressIndicatorSpec));
        indeterminateDrawable.setStaticDummyDrawable(q.a(null, context.getResources(), R.drawable.ic_mtrl_arrow_circle));
        return indeterminateDrawable;
    }

    @NonNull
    public static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec, @NonNull LinearDrawingDelegate linearDrawingDelegate) {
        return new IndeterminateDrawable<>(context, linearProgressIndicatorSpec, linearDrawingDelegate, linearProgressIndicatorSpec.indeterminateAnimationType == 0 ? new LinearIndeterminateContiguousAnimatorDelegate(linearProgressIndicatorSpec) : new LinearIndeterminateDisjointAnimatorDelegate(context, linearProgressIndicatorSpec));
    }

    @Override // com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z3, boolean z8, boolean z10) {
        return super.setVisible(z3, z8, z10);
    }
}
