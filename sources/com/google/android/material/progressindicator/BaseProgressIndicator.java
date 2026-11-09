package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.c;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import p241q.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseProgressIndicator<S extends BaseProgressIndicatorSpec> extends ProgressBar {
    static final float DEFAULT_OPACITY = 0.2f;
    static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_ProgressIndicator;
    public static final int HIDE_ESCAPE = 3;
    public static final int HIDE_INWARD = 2;
    public static final int HIDE_NONE = 0;
    public static final int HIDE_OUTWARD = 1;
    static final int MAX_ALPHA = 255;
    static final int MAX_HIDE_DELAY = 1000;
    public static final int SHOW_INWARD = 2;
    public static final int SHOW_NONE = 0;
    public static final int SHOW_OUTWARD = 1;
    AnimatorDurationScaleProvider animatorDurationScaleProvider;
    private final Runnable delayedHide;
    private final Runnable delayedShow;
    private final c hideAnimationCallback;
    boolean initialized;
    private boolean isIndeterminateModeChangeRequested;
    private boolean isParentDoneInitializing;
    private long lastShowStartTime;
    private final int minHideDelay;
    private final int showDelay;
    S spec;
    private int storedProgress;
    private boolean storedProgressAnimated;
    private final c switchIndeterminateModeCallback;
    private int visibilityAfterHide;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({p192n.c.f39801b})
    public @interface HideAnimationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({p192n.c.f39801b})
    public @interface ShowAnimationBehavior {
    }

    public BaseProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i7, @StyleRes int i10) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i7, DEF_STYLE_RES), attributeSet, i7);
        this.lastShowStartTime = -1L;
        this.isIndeterminateModeChangeRequested = false;
        this.visibilityAfterHide = 4;
        this.delayedShow = new Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.1
            @Override // java.lang.Runnable
            public void run() {
                BaseProgressIndicator.this.internalShow();
            }
        };
        this.delayedHide = new Runnable() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.2
            @Override // java.lang.Runnable
            public void run() {
                BaseProgressIndicator.this.internalHide();
                BaseProgressIndicator.this.lastShowStartTime = -1L;
            }
        };
        this.switchIndeterminateModeCallback = new c() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.3
            @Override // androidx.vectordrawable.graphics.drawable.c
            public void onAnimationEnd(Drawable drawable) {
                BaseProgressIndicator.this.setIndeterminate(false);
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setProgressCompat(baseProgressIndicator.storedProgress, BaseProgressIndicator.this.storedProgressAnimated);
            }
        };
        this.hideAnimationCallback = new c() { // from class: com.google.android.material.progressindicator.BaseProgressIndicator.4
            @Override // androidx.vectordrawable.graphics.drawable.c
            public void onAnimationEnd(Drawable drawable) {
                if (BaseProgressIndicator.this.isIndeterminateModeChangeRequested) {
                    return;
                }
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.visibilityAfterHide);
            }
        };
        Context context2 = getContext();
        this.spec = (S) createSpec(context2, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.BaseProgressIndicator, i7, i10, new int[0]);
        this.showDelay = typedArrayObtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_showDelay, -1);
        this.minHideDelay = Math.min(typedArrayObtainStyledAttributes.getInt(R.styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArrayObtainStyledAttributes.recycle();
        this.animatorDurationScaleProvider = new AnimatorDurationScaleProvider();
        this.isParentDoneInitializing = true;
    }

    @Nullable
    private DrawingDelegate<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().getDrawingDelegate();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().getDrawingDelegate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalHide() {
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).setVisible(false, false, true);
        if (isNoLongerNeedToBeVisible()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalShow() {
        if (this.minHideDelay > 0) {
            this.lastShowStartTime = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean isNoLongerNeedToBeVisible() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            return getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible();
        }
        return false;
    }

    private void registerAnimationCallbacks() {
        registerSwitchIndeterminateModeCallback();
        if (getProgressDrawable() != null) {
            getProgressDrawable().registerAnimationCallback(this.hideAnimationCallback);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().registerAnimationCallback(this.hideAnimationCallback);
        }
    }

    private void unregisterAnimationCallbacks() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().unregisterAnimationCallback(this.hideAnimationCallback);
            getIndeterminateDrawable().getAnimatorDelegate().unregisterAnimatorsCompleteCallback();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().unregisterAnimationCallback(this.hideAnimationCallback);
        }
    }

    public void applyNewVisibility(boolean z3) {
        if (this.isParentDoneInitializing) {
            ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).setVisible(visibleToUser(), false, z3);
        }
    }

    public abstract S createSpec(@NonNull Context context, @NonNull AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.spec.hideAnimationBehavior;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.spec.indicatorColors;
    }

    @Px
    public int getIndicatorTrackGapSize() {
        return this.spec.indicatorTrackGapSize;
    }

    public int getShowAnimationBehavior() {
        return this.spec.showAnimationBehavior;
    }

    @ColorInt
    public int getTrackColor() {
        return this.spec.trackColor;
    }

    @Px
    public int getTrackCornerRadius() {
        return this.spec.trackCornerRadius;
    }

    public float getTrackCornerRadiusFraction() {
        return this.spec.trackCornerRadiusFraction;
    }

    @Px
    public int getTrackThickness() {
        return this.spec.trackThickness;
    }

    @Px
    public int getWaveAmplitude() {
        return this.spec.waveAmplitude;
    }

    @Px
    public int getWaveSpeed() {
        return this.spec.waveSpeed;
    }

    @Px
    public int getWavelengthDeterminate() {
        return this.spec.wavelengthDeterminate;
    }

    @Px
    public int getWavelengthIndeterminate() {
        return this.spec.wavelengthIndeterminate;
    }

    public void hide() {
        if (getVisibility() != 0) {
            removeCallbacks(this.delayedShow);
            return;
        }
        removeCallbacks(this.delayedHide);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.lastShowStartTime;
        int i7 = this.minHideDelay;
        if (jUptimeMillis >= i7) {
            this.delayedHide.run();
        } else {
            postDelayed(this.delayedHide, ((long) i7) - jUptimeMillis);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public boolean isEffectivelyVisible() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerAnimationCallbacks();
        if (visibleToUser()) {
            internalShow();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.delayedHide);
        removeCallbacks(this.delayedShow);
        ((DrawableWithAnimatedVisibilityChange) getCurrentDrawable()).hideNow();
        unregisterAnimationCallbacks();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(@NonNull Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        getCurrentDrawingDelegate().invalidateCachedPaths();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i7, int i10) {
        try {
            DrawingDelegate<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.getPreferredWidth() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i7) : currentDrawingDelegate.getPreferredWidth() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.getPreferredHeight() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i10) : currentDrawingDelegate.getPreferredHeight() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i7) {
        super.onVisibilityChanged(view, i7);
        applyNewVisibility(i7 == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        applyNewVisibility(false);
    }

    public void registerSwitchIndeterminateModeCallback() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().getAnimatorDelegate().registerAnimatorsCompleteCallback(this.switchIndeterminateModeCallback);
    }

    @RestrictTo({p192n.c.f39801b})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull AnimatorDurationScaleProvider animatorDurationScaleProvider) {
        this.animatorDurationScaleProvider = animatorDurationScaleProvider;
        if (getProgressDrawable() != null) {
            getProgressDrawable().animatorDurationScaleProvider = animatorDurationScaleProvider;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().animatorDurationScaleProvider = animatorDurationScaleProvider;
        }
    }

    public void setHideAnimationBehavior(int i7) {
        this.spec.hideAnimationBehavior = i7;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z3) {
        try {
            if (z3 == isIndeterminate()) {
                return;
            }
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange != null) {
                drawableWithAnimatedVisibilityChange.hideNow();
            }
            super.setIndeterminate(z3);
            DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange2 = (DrawableWithAnimatedVisibilityChange) getCurrentDrawable();
            if (drawableWithAnimatedVisibilityChange2 != null) {
                drawableWithAnimatedVisibilityChange2.setVisible(visibleToUser(), false, false);
            }
            if ((drawableWithAnimatedVisibilityChange2 instanceof IndeterminateDrawable) && visibleToUser()) {
                ((IndeterminateDrawable) drawableWithAnimatedVisibilityChange2).getAnimatorDelegate().startAnimator();
            }
            this.isIndeterminateModeChangeRequested = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(@FloatRange(from = 0.10000000149011612d, to = 10.0d) float f10) {
        S s3 = this.spec;
        if (s3.indeterminateAnimatorDurationScale != f10) {
            s3.indeterminateAnimatorDurationScale = f10;
            getIndeterminateDrawable().getAnimatorDelegate().invalidateSpecValues();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable instanceof IndeterminateDrawable) {
            ((DrawableWithAnimatedVisibilityChange) drawable).hideNow();
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.initialized) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{MaterialColors.getColor(getContext(), a.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.spec.indicatorColors = iArr;
        getIndeterminateDrawable().getAnimatorDelegate().invalidateSpecValues();
        invalidate();
    }

    public void setIndicatorTrackGapSize(@Px int i7) {
        S s3 = this.spec;
        if (s3.indicatorTrackGapSize != i7) {
            s3.indicatorTrackGapSize = i7;
            s3.validateSpec();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i7) {
        if (isIndeterminate()) {
            return;
        }
        setProgressCompat(i7, false);
    }

    public void setProgressCompat(int i7, boolean z3) {
        if (!isIndeterminate()) {
            super.setProgress(i7);
            if (getProgressDrawable() == null || z3) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.storedProgress = i7;
            this.storedProgressAnimated = z3;
            this.isIndeterminateModeChangeRequested = true;
            if (!getIndeterminateDrawable().isVisible() || this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(getContext().getContentResolver()) == 0.0f) {
                this.switchIndeterminateModeCallback.onAnimationEnd(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().getAnimatorDelegate().requestCancelAnimatorAfterCurrentCycle();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        if (!(drawable instanceof DeterminateDrawable)) {
            if (this.initialized) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            DeterminateDrawable determinateDrawable = (DeterminateDrawable) drawable;
            determinateDrawable.hideNow();
            super.setProgressDrawable(determinateDrawable);
            determinateDrawable.setLevelByFraction(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i7) {
        this.spec.showAnimationBehavior = i7;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i7) {
        S s3 = this.spec;
        if (s3.trackColor != i7) {
            s3.trackColor = i7;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@Px int i7) {
        S s3 = this.spec;
        if (s3.trackCornerRadius != i7) {
            s3.trackCornerRadius = Math.min(i7, s3.trackThickness / 2);
            this.spec.useRelativeTrackCornerRadius = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(@FloatRange(from = 0.0d, to = 0.5d) float f10) {
        S s3 = this.spec;
        if (s3.trackCornerRadiusFraction != f10) {
            s3.trackCornerRadiusFraction = Math.min(f10, 0.5f);
            this.spec.useRelativeTrackCornerRadius = true;
            invalidate();
        }
    }

    public void setTrackThickness(@Px int i7) {
        S s3 = this.spec;
        if (s3.trackThickness != i7) {
            s3.trackThickness = i7;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i7) {
        if (i7 != 0 && i7 != 4 && i7 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.visibilityAfterHide = i7;
    }

    public void setWaveAmplitude(@Px int i7) {
        S s3 = this.spec;
        if (s3.waveAmplitude != i7) {
            s3.waveAmplitude = Math.abs(i7);
            requestLayout();
        }
    }

    public void setWaveSpeed(@Px int i7) {
        this.spec.waveSpeed = i7;
        getProgressDrawable().setEnforcedDrawing(this.spec.waveSpeed != 0);
    }

    public void setWavelength(@Px int i7) {
        setWavelengthDeterminate(i7);
        setWavelengthIndeterminate(i7);
    }

    public void setWavelengthDeterminate(@Px int i7) {
        S s3 = this.spec;
        if (s3.wavelengthDeterminate != i7) {
            s3.wavelengthDeterminate = Math.abs(i7);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(@Px int i7) {
        S s3 = this.spec;
        if (s3.wavelengthIndeterminate != i7) {
            s3.wavelengthIndeterminate = Math.abs(i7);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    public void show() {
        if (this.showDelay <= 0) {
            this.delayedShow.run();
        } else {
            removeCallbacks(this.delayedShow);
            postDelayed(this.delayedShow, this.showDelay);
        }
    }

    public boolean visibleToUser() {
        return isAttachedToWindow() && getWindowVisibility() == 0 && isEffectivelyVisible();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public IndeterminateDrawable<S> getIndeterminateDrawable() {
        return (IndeterminateDrawable) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public DeterminateDrawable<S> getProgressDrawable() {
        return (DeterminateDrawable) super.getProgressDrawable();
    }
}
