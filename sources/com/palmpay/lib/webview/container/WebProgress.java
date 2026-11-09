package com.palmpay.lib.webview.container;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class WebProgress extends FrameLayout {
    private static int CURRENT_MAX_DECELERATE_SPEED_DURATION = 450;
    private static int CURRENT_MAX_UNIFORM_SPEED_DURATION = 8000;
    public static final int DO_END_ALPHA_DURATION = 630;
    public static final int DO_END_PROGRESS_DURATION = 500;
    public static final int FINISH = 2;
    public static final int MAX_DECELERATE_SPEED_DURATION = 450;
    public static final int MAX_UNIFORM_SPEED_DURATION = 8000;
    public static final int STARTED = 1;
    public static final int UN_START = 0;
    public static String WEB_PROGRESS_COLOR = "#32B848";
    public static int WEB_PROGRESS_DEFAULT_HEIGHT = 3;
    private int TAG;
    private boolean isShow;
    private Animator mAnimator;
    private AnimatorListenerAdapter mAnimatorListenerAdapter;
    private ValueAnimator.AnimatorUpdateListener mAnimatorUpdateListener;
    private int mColor;
    private float mCurrentProgress;
    private Paint mPaint;
    private int mTargetHeight;
    private int mTargetWidth;

    public WebProgress(Context context) {
        this(context, null);
    }

    private int dip2px(float f10) {
        return (int) ((f10 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doEnd() {
        if (this.TAG == 2 && this.mCurrentProgress == 100.0f) {
            setVisibility(8);
            this.mCurrentProgress = 0.0f;
            setAlpha(1.0f);
        }
        this.TAG = 0;
    }

    private void init(Context context, AttributeSet attributeSet, int i7) {
        this.mPaint = new Paint();
        this.mColor = Color.parseColor(WEB_PROGRESS_COLOR);
        this.mPaint.setAntiAlias(true);
        this.mPaint.setColor(this.mColor);
        this.mPaint.setDither(true);
        this.mPaint.setStrokeCap(Paint.Cap.SQUARE);
        this.mTargetWidth = context.getResources().getDisplayMetrics().widthPixels;
        this.mTargetHeight = dip2px(WEB_PROGRESS_DEFAULT_HEIGHT);
    }

    private void setFinish() {
        this.isShow = false;
        this.TAG = 2;
    }

    private void startAnim(boolean z3) {
        ValueAnimator valueAnimatorOfFloat;
        float f10 = z3 ? 100.0f : 95.0f;
        Animator animator = this.mAnimator;
        if (animator != null && animator.isStarted()) {
            this.mAnimator.cancel();
        }
        float f11 = this.mCurrentProgress;
        if (f11 == 0.0f) {
            f11 = 1.0E-8f;
        }
        this.mCurrentProgress = f11;
        setAlpha(1.0f);
        if (z3) {
            float f12 = this.mCurrentProgress;
            if (f12 < 95.0f) {
                valueAnimatorOfFloat = ValueAnimator.ofFloat(f12, 95.0f);
                float f13 = (1.0f - (this.mCurrentProgress / 100.0f)) - 0.05f;
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.setDuration((long) (f13 * CURRENT_MAX_DECELERATE_SPEED_DURATION));
                valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                valueAnimatorOfFloat.addUpdateListener(this.mAnimatorUpdateListener);
            } else {
                valueAnimatorOfFloat = null;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(630L);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(95.0f, 100.0f);
            valueAnimatorOfFloat2.setDuration(500L);
            valueAnimatorOfFloat2.addUpdateListener(this.mAnimatorUpdateListener);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfFloat2);
            if (valueAnimatorOfFloat != null) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(animatorSet).after(valueAnimatorOfFloat);
                animatorSet = animatorSet2;
            }
            animatorSet.addListener(this.mAnimatorListenerAdapter);
            animatorSet.start();
            this.mAnimator = animatorSet;
        } else {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.mCurrentProgress, f10);
            float f14 = (1.0f - (this.mCurrentProgress / 100.0f)) - 0.05f;
            valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat3.setDuration((long) (f14 * CURRENT_MAX_UNIFORM_SPEED_DURATION));
            valueAnimatorOfFloat3.addUpdateListener(this.mAnimatorUpdateListener);
            valueAnimatorOfFloat3.start();
            this.mAnimator = valueAnimatorOfFloat3;
        }
        this.TAG = 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, (this.mCurrentProgress / 100.0f) * getWidth(), getHeight(), this.mPaint);
    }

    public void hide() {
        setWebProgress(100);
    }

    public FrameLayout.LayoutParams offerLayoutParams() {
        return new FrameLayout.LayoutParams(this.mTargetWidth, this.mTargetHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.mAnimator;
        if (animator == null || !animator.isStarted()) {
            return;
        }
        this.mAnimator.cancel();
        this.mAnimator = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, getContext().getResources().getDisplayMetrics().widthPixels);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = this.mTargetHeight;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.mTargetWidth = getMeasuredWidth();
        int i13 = getContext().getResources().getDisplayMetrics().widthPixels;
        int i14 = this.mTargetWidth;
        if (i14 >= i13) {
            CURRENT_MAX_DECELERATE_SPEED_DURATION = MAX_DECELERATE_SPEED_DURATION;
            CURRENT_MAX_UNIFORM_SPEED_DURATION = MAX_UNIFORM_SPEED_DURATION;
        } else {
            float f10 = i14 / i13;
            CURRENT_MAX_UNIFORM_SPEED_DURATION = (int) (8000.0f * f10);
            CURRENT_MAX_DECELERATE_SPEED_DURATION = (int) (f10 * 450.0f);
        }
    }

    public void reset() {
        this.mCurrentProgress = 0.0f;
        Animator animator = this.mAnimator;
        if (animator == null || !animator.isStarted()) {
            return;
        }
        this.mAnimator.cancel();
    }

    public void setColor(int i7) {
        this.mColor = i7;
        this.mPaint.setColor(i7);
    }

    public WebProgress setHeight(int i7) {
        this.mTargetHeight = dip2px(i7);
        return this;
    }

    public void setProgress(int i7) {
        setProgress(i7);
    }

    public void setWebProgress(int i7) {
        if (i7 < 0 || i7 >= 95) {
            setProgress(i7);
            setFinish();
        } else if (this.isShow) {
            setProgress(i7);
        } else {
            show();
        }
    }

    public void show() {
        this.isShow = true;
        setVisibility(0);
        this.mCurrentProgress = 0.0f;
        startAnim(false);
    }

    public WebProgress(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setProgress(float f10) {
        if (this.TAG == 0 && f10 == 100.0f) {
            setVisibility(8);
            return;
        }
        if (getVisibility() == 8) {
            setVisibility(0);
        }
        if (f10 >= 95.0f && this.TAG != 2) {
            startAnim(true);
        }
    }

    public WebProgress(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mTargetWidth = 0;
        this.TAG = 0;
        this.isShow = false;
        this.mCurrentProgress = 0.0f;
        this.mAnimatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.palmpay.lib.webview.container.WebProgress.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                WebProgress.this.mCurrentProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                WebProgress.this.invalidate();
            }
        };
        this.mAnimatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.palmpay.lib.webview.container.WebProgress.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                WebProgress.this.doEnd();
            }
        };
        init(context, attributeSet, i7);
    }

    public void setColor(String str) {
        setColor(Color.parseColor(str));
    }

    public void setColor(int i7, int i10) {
        this.mPaint.setShader(new LinearGradient(0.0f, 0.0f, this.mTargetWidth, this.mTargetHeight, i7, i10, Shader.TileMode.CLAMP));
    }

    public void setColor(String str, String str2) {
        setColor(Color.parseColor(str), Color.parseColor(str2));
    }
}
