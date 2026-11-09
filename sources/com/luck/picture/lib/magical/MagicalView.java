package com.luck.picture.lib.magical;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.viewpager2.widget.ViewPager2;
import com.luck.picture.lib.basic.InterpolatorFactory;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.utils.DensityUtil;

/* JADX INFO: loaded from: classes3.dex */
public class MagicalView extends FrameLayout {
    private final long animationDuration;
    private final int appInScreenHeight;
    private final View backgroundView;
    private final FrameLayout contentLayout;
    private boolean isAnimating;
    private final boolean isPreviewFullScreenMode;
    private float mAlpha;
    private int mOriginHeight;
    private int mOriginLeft;
    private int mOriginTop;
    private int mOriginWidth;
    private final MagicalViewWrapper magicalWrapper;
    private OnMagicalViewCallback onMagicalViewCallback;
    private int realHeight;
    private int realWidth;
    private int screenHeight;
    private int screenWidth;
    private final SelectorConfig selectorConfig;
    private int startX;
    private int startY;
    private int targetEndLeft;
    private int targetImageHeight;
    private int targetImageTop;
    private int targetImageWidth;

    public MagicalView(Context context) {
        this(context, null);
    }

    @RequiresApi(api = 21)
    private void backToMinWithTransition() {
        this.contentLayout.post(new Runnable() { // from class: com.luck.picture.lib.magical.MagicalView.3
            @Override // java.lang.Runnable
            public void run() {
                TransitionManager.beginDelayedTransition((ViewGroup) MagicalView.this.contentLayout.getParent(), new TransitionSet().setDuration(250L).addTransition(new ChangeBounds()).addTransition(new ChangeTransform()).addTransition(new ChangeImageTransform()));
                MagicalView.this.beginBackToMin(true);
                MagicalView.this.contentLayout.setTranslationX(0.0f);
                MagicalView.this.contentLayout.setTranslationY(0.0f);
                MagicalView.this.magicalWrapper.setWidth(MagicalView.this.mOriginWidth);
                MagicalView.this.magicalWrapper.setHeight(MagicalView.this.mOriginHeight);
                MagicalView.this.magicalWrapper.setMarginTop(MagicalView.this.mOriginTop);
                MagicalView.this.magicalWrapper.setMarginLeft(MagicalView.this.mOriginLeft);
                MagicalView.this.changeBackgroundViewAlpha(true);
            }
        });
    }

    private void backToMinWithoutView() {
        this.contentLayout.animate().alpha(0.0f).setDuration(250L).setListener(new AnimatorListenerAdapter() { // from class: com.luck.picture.lib.magical.MagicalView.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (MagicalView.this.onMagicalViewCallback != null) {
                    MagicalView.this.onMagicalViewCallback.onMagicalViewFinish();
                }
            }
        }).start();
        this.backgroundView.animate().alpha(0.0f).setDuration(250L).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void beginBackToMin(boolean z3) {
        if (z3) {
            this.onMagicalViewCallback.onBeginBackMinMagicalFinish(true);
        }
    }

    private void beginShow(boolean z3) {
        Interpolator interpolatorNewInterpolator;
        if (z3) {
            this.mAlpha = 1.0f;
            this.backgroundView.setAlpha(1.0f);
            showNormalMin(this.targetImageTop, this.targetEndLeft, this.targetImageWidth, this.targetImageHeight);
            setShowEndParams();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.luck.picture.lib.magical.MagicalView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MagicalView magicalView = MagicalView.this;
                magicalView.showNormalMin(fFloatValue, magicalView.mOriginTop, MagicalView.this.targetImageTop, MagicalView.this.mOriginLeft, MagicalView.this.targetEndLeft, MagicalView.this.mOriginWidth, MagicalView.this.targetImageWidth, MagicalView.this.mOriginHeight, MagicalView.this.targetImageHeight);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.luck.picture.lib.magical.MagicalView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MagicalView.this.setShowEndParams();
            }
        });
        InterpolatorFactory interpolatorFactory = this.selectorConfig.interpolatorFactory;
        if (interpolatorFactory != null && (interpolatorNewInterpolator = interpolatorFactory.newInterpolator()) != null) {
            valueAnimatorOfFloat.setInterpolator(interpolatorNewInterpolator);
        }
        valueAnimatorOfFloat.setDuration(250L).start();
        changeBackgroundViewAlpha(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeBackgroundViewAlpha(final boolean z3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mAlpha, z3 ? 0.0f : 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.luck.picture.lib.magical.MagicalView.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                MagicalView.this.isAnimating = true;
                MagicalView.this.mAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MagicalView.this.backgroundView.setAlpha(MagicalView.this.mAlpha);
                if (MagicalView.this.onMagicalViewCallback != null) {
                    MagicalView.this.onMagicalViewCallback.onBackgroundAlpha(MagicalView.this.mAlpha);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.luck.picture.lib.magical.MagicalView.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MagicalView.this.isAnimating = false;
                if (!z3 || MagicalView.this.onMagicalViewCallback == null) {
                    return;
                }
                MagicalView.this.onMagicalViewCallback.onMagicalViewFinish();
            }
        });
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.start();
    }

    private void changeContentViewToFullscreen() {
        int i7 = this.screenHeight;
        this.targetImageHeight = i7;
        this.targetImageWidth = this.screenWidth;
        this.targetImageTop = 0;
        this.magicalWrapper.setHeight(i7);
        this.magicalWrapper.setWidth(this.screenWidth);
        this.magicalWrapper.setMarginTop(0);
        this.magicalWrapper.setMarginLeft(0);
    }

    private void getScreenSize() {
        this.screenWidth = DensityUtil.getRealScreenWidth(getContext());
        if (this.isPreviewFullScreenMode) {
            this.screenHeight = DensityUtil.getRealScreenHeight(getContext());
        } else {
            this.screenHeight = DensityUtil.getScreenHeight(getContext());
        }
    }

    private void setOriginParams() {
        this.contentLayout.getLocationOnScreen(new int[2]);
        this.targetEndLeft = 0;
        int i7 = this.screenWidth;
        int i10 = this.screenHeight;
        float f10 = i7 / i10;
        int i11 = this.realWidth;
        int i12 = this.realHeight;
        if (f10 < i11 / i12) {
            this.targetImageWidth = i7;
            int i13 = (int) ((i12 / i11) * i7);
            this.targetImageHeight = i13;
            this.targetImageTop = (i10 - i13) / 2;
        } else {
            this.targetImageHeight = i10;
            int i14 = (int) ((i11 / i12) * i10);
            this.targetImageWidth = i14;
            this.targetImageTop = 0;
            this.targetEndLeft = (i7 - i14) / 2;
        }
        this.magicalWrapper.setWidth(this.mOriginWidth);
        this.magicalWrapper.setHeight(this.mOriginHeight);
        this.magicalWrapper.setMarginLeft(this.mOriginLeft);
        this.magicalWrapper.setMarginTop(this.mOriginTop);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowEndParams() {
        this.isAnimating = false;
        changeContentViewToFullscreen();
        OnMagicalViewCallback onMagicalViewCallback = this.onMagicalViewCallback;
        if (onMagicalViewCallback != null) {
            onMagicalViewCallback.onBeginMagicalAnimComplete(this, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showNormalMin(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        showNormalMin(false, f10, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    public void backToMin() {
        if (this.isAnimating) {
            return;
        }
        if (this.mOriginWidth == 0 || this.mOriginHeight == 0) {
            backToMinWithoutView();
            return;
        }
        OnMagicalViewCallback onMagicalViewCallback = this.onMagicalViewCallback;
        if (onMagicalViewCallback != null) {
            onMagicalViewCallback.onBeginBackMinAnim();
        }
        beginBackToMin(false);
        backToMinWithTransition();
    }

    public void changeRealScreenHeight(int i7, int i10, boolean z3) {
        int i11;
        int i12;
        if (this.isPreviewFullScreenMode || (i11 = this.screenWidth) > (i12 = this.screenHeight)) {
            return;
        }
        if (((int) (i11 / (i7 / i10))) > i12) {
            this.screenHeight = this.appInScreenHeight;
            if (z3) {
                this.magicalWrapper.setWidth(i11);
                this.magicalWrapper.setHeight(this.screenHeight);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View childAt = this.contentLayout.getChildAt(0);
        ViewPager2 viewPager2 = childAt instanceof ViewPager2 ? (ViewPager2) childAt : null;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.startX = (int) motionEvent.getX();
            this.startY = (int) motionEvent.getY();
            if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(true);
            }
        } else if (action == 1) {
            if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(true);
            }
        } else if (action == 2) {
            int x3 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if (Math.abs(x3 - this.startX) > Math.abs(y8 - this.startY)) {
                if (viewPager2 != null) {
                    viewPager2.setUserInputEnabled(true);
                }
            } else if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(canScrollVertically(this.startY - y8));
            }
        } else if (action == 3) {
            if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void resetStart() {
        getScreenSize();
        start(true);
    }

    public void resetStartNormal(int i7, int i10, boolean z3) {
        getScreenSize();
        startNormal(i7, i10, z3);
    }

    public void setBackgroundAlpha(float f10) {
        this.mAlpha = f10;
        this.backgroundView.setAlpha(f10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.backgroundView.setBackgroundColor(i7);
    }

    public void setMagicalContent(View view) {
        this.contentLayout.addView(view);
    }

    public void setOnMojitoViewCallback(OnMagicalViewCallback onMagicalViewCallback) {
        this.onMagicalViewCallback = onMagicalViewCallback;
    }

    public void setViewParams(int i7, int i10, int i11, int i12, int i13, int i14) {
        this.realWidth = i13;
        this.realHeight = i14;
        this.mOriginLeft = i7;
        this.mOriginTop = i10;
        this.mOriginWidth = i11;
        this.mOriginHeight = i12;
    }

    public void start(boolean z3) {
        float f10;
        if (z3) {
            f10 = 1.0f;
            this.mAlpha = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.mAlpha = f10;
        this.backgroundView.setAlpha(f10);
        setVisibility(0);
        setOriginParams();
        beginShow(z3);
    }

    public void startNormal(int i7, int i10, boolean z3) {
        this.realWidth = i7;
        this.realHeight = i10;
        this.mOriginLeft = 0;
        this.mOriginTop = 0;
        this.mOriginWidth = 0;
        this.mOriginHeight = 0;
        setVisibility(0);
        setOriginParams();
        showNormalMin(this.targetImageTop, this.targetEndLeft, this.targetImageWidth, this.targetImageHeight);
        if (z3) {
            this.mAlpha = 1.0f;
            this.backgroundView.setAlpha(1.0f);
        } else {
            this.mAlpha = 0.0f;
            this.backgroundView.setAlpha(0.0f);
            this.contentLayout.setAlpha(0.0f);
            this.contentLayout.animate().alpha(1.0f).setDuration(250L).start();
            this.backgroundView.animate().alpha(1.0f).setDuration(250L).start();
        }
        setShowEndParams();
    }

    public MagicalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void showNormalMin(float f10, float f11, float f12, float f13) {
        showNormalMin(true, 0.0f, 0.0f, f10, 0.0f, f11, 0.0f, f12, 0.0f, f13);
    }

    public MagicalView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mAlpha = 0.0f;
        this.animationDuration = 250L;
        this.isAnimating = false;
        SelectorConfig selectorConfig = SelectorProviders.getInstance().getSelectorConfig();
        this.selectorConfig = selectorConfig;
        this.isPreviewFullScreenMode = selectorConfig.isPreviewFullScreenMode;
        this.appInScreenHeight = DensityUtil.getRealScreenHeight(getContext());
        getScreenSize();
        View view = new View(context);
        this.backgroundView = view;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setAlpha(this.mAlpha);
        addView(view);
        FrameLayout frameLayout = new FrameLayout(context);
        this.contentLayout = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.magicalWrapper = new MagicalViewWrapper(frameLayout);
    }

    private void showNormalMin(boolean z3, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (z3) {
            this.magicalWrapper.setWidth(f16);
            this.magicalWrapper.setHeight(f18);
            this.magicalWrapper.setMarginLeft((int) f14);
            this.magicalWrapper.setMarginTop((int) f12);
            return;
        }
        this.magicalWrapper.setWidth(f15 + ((f16 - f15) * f10));
        this.magicalWrapper.setHeight(f17 + ((f18 - f17) * f10));
        this.magicalWrapper.setMarginLeft((int) (f13 + ((f14 - f13) * f10)));
        this.magicalWrapper.setMarginTop((int) (f11 + ((f12 - f11) * f10)));
    }
}
