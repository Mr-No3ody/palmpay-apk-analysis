package com.transsnet.adsdk.widgets.MarqueeTextView;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.perf.util.Constants;
import com.transsnet.adsdk.R;

/* JADX INFO: loaded from: classes3.dex */
public class MarqueeTextView extends HorizontalScrollView implements ValueAnimator.AnimatorUpdateListener {
    private boolean isRTL;
    private RelativeLayout mContainerLayout;
    private int mGhostOffset;
    private TextView mGhostTextView;
    private int mOffset;
    private CharSequence mText;
    private int mTextColor;
    private int mTextSize;
    private TextView mTextView;
    private int measureText;
    private int spacing;
    private int speed;
    private int startDelay;
    private Typeface typeface;
    private ValueAnimator valueAnimator;
    private int viewWidth;

    public MarqueeTextView(Context context) {
        this(context, null);
    }

    private TextView createTextView() {
        TextView textView = new TextView(getContext());
        textView.setPadding(0, 0, 0, 0);
        textView.setSingleLine();
        textView.setTextColor(this.mTextColor);
        textView.setTextSize(0, this.mTextSize);
        Typeface typeface = this.typeface;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        textView.setGravity(16);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealAnimation() {
        int i7 = this.measureText;
        int i10 = this.viewWidth;
        if (i7 <= i10 || i10 <= 0) {
            stopAnim();
        } else {
            startAnim();
        }
    }

    private void initAnim() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.measureText);
        this.valueAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setRepeatCount(-1);
        this.valueAnimator.setRepeatMode(1);
    }

    @SuppressLint({"Recycle"})
    private void initAttrs(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.OnlyMarqueeView);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.OnlyMarqueeView_mv_text_size)) {
            this.mTextSize = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.OnlyMarqueeView_mv_text_size, context.getResources().getDimensionPixelSize(R.dimen.dp_12));
        }
        this.mTextColor = typedArrayObtainStyledAttributes.getColor(R.styleable.OnlyMarqueeView_mv_text_color, this.mTextColor);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.OnlyMarqueeView_mv_font)) {
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.OnlyMarqueeView_mv_font, 0);
                if (resourceId != 0) {
                    this.typeface = Y.j.a(resourceId, context);
                }
            } catch (Exception unused) {
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.OnlyMarqueeView_mv_spacing)) {
            this.spacing = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.OnlyMarqueeView_mv_spacing, this.spacing);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.OnlyMarqueeView_mv_speed)) {
            this.speed = typedArrayObtainStyledAttributes.getInteger(R.styleable.OnlyMarqueeView_mv_speed, 2);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initLayout() {
        this.mContainerLayout = new RelativeLayout(getContext());
        this.mContainerLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        addView(this.mContainerLayout);
        TextView textViewCreateTextView = createTextView();
        this.mTextView = textViewCreateTextView;
        textViewCreateTextView.setContentDescription("Text");
        TextView textViewCreateTextView2 = createTextView();
        this.mGhostTextView = textViewCreateTextView2;
        textViewCreateTextView2.setContentDescription("GhostText");
        this.mContainerLayout.addView(this.mTextView);
        this.mContainerLayout.addView(this.mGhostTextView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetMarqueeView() {
        FrameLayout.LayoutParams layoutParams;
        int i7 = this.viewWidth;
        if (i7 <= 0) {
            return;
        }
        if (this.measureText > i7) {
            RelativeLayout relativeLayout = this.mContainerLayout;
            if (relativeLayout != null && i7 > 0) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = this.viewWidth;
                    this.mContainerLayout.setLayoutParams(layoutParams2);
                }
                this.mContainerLayout.setMinimumWidth(this.viewWidth);
            }
            this.mTextView.setVisibility(0);
            this.mGhostTextView.setVisibility(0);
            this.mTextView.setGravity(16);
            this.mGhostTextView.setGravity(16);
            if (this.isRTL) {
                this.mOffset = 0;
                this.mGhostOffset = (-this.measureText) - this.spacing;
            } else {
                this.mOffset = 0;
                this.mGhostOffset = this.measureText + this.spacing;
            }
            this.mTextView.setX(this.mOffset);
            this.mGhostTextView.setX(this.mGhostOffset);
        } else {
            RelativeLayout relativeLayout2 = this.mContainerLayout;
            if (relativeLayout2 != null && i7 > 0 && (layoutParams = (FrameLayout.LayoutParams) relativeLayout2.getLayoutParams()) != null) {
                layoutParams.width = this.viewWidth;
                this.mContainerLayout.setLayoutParams(layoutParams);
            }
            this.mGhostTextView.setVisibility(8);
            this.mTextView.setVisibility(0);
            this.mTextView.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
            this.mTextView.setTextDirection(5);
            this.mTextView.setTextAlignment(5);
            if (this.isRTL) {
                this.mOffset = this.viewWidth - this.measureText;
            } else {
                this.mOffset = 0;
            }
            this.mTextView.setX(this.mOffset);
        }
        invalidate();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.isRTL) {
            int i7 = this.mOffset;
            int i10 = this.speed;
            int i11 = i7 + i10;
            this.mOffset = i11;
            int i12 = this.mGhostOffset + i10;
            this.mGhostOffset = i12;
            int i13 = this.viewWidth;
            if (i11 > i13) {
                this.mOffset = (i12 - this.measureText) - this.spacing;
            }
            if (i12 > i13) {
                this.mGhostOffset = (this.mOffset - this.measureText) - this.spacing;
            }
        } else {
            int i14 = this.mOffset;
            int i15 = this.speed;
            int i16 = i14 - i15;
            this.mOffset = i16;
            int i17 = this.mGhostOffset - i15;
            this.mGhostOffset = i17;
            int i18 = this.measureText;
            if (i16 + i18 < 0) {
                this.mOffset = i17 + i18 + this.spacing;
            }
            if (i17 + i18 < 0) {
                this.mGhostOffset = this.mOffset + i18 + this.spacing;
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        stopAnim();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        TextView textView = this.mTextView;
        if (textView == null || this.mGhostTextView == null) {
            return;
        }
        textView.setX(this.mOffset);
        this.mGhostTextView.setX(this.mGhostOffset);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.viewWidth = getMeasuredWidth();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int w3, int h7, int oldw, int oldh) {
        super.onSizeChanged(w3, h7, oldw, oldh);
        boolean z3 = getLayoutDirection() == 1;
        if (this.isRTL != z3) {
            this.isRTL = z3;
        }
        post(new androidx.customview.widget.e(this, 18));
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        if (visibility == 0) {
            dealAnimation();
        } else {
            stopAnim();
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void releaseAnim() {
        stopAnim();
        this.valueAnimator = null;
    }

    public void setSpacing(int spacing) {
        this.spacing = spacing;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStartDelay(int delayMillis) {
        this.startDelay = delayMillis;
    }

    public void setText(CharSequence text) {
        this.mText = text;
        boolean z3 = getLayoutDirection() == 1;
        if (this.isRTL != z3) {
            this.isRTL = z3;
        }
        this.mTextView.setText(this.mText);
        this.mGhostTextView.setText(this.mText);
        if (TextUtils.isEmpty(this.mText)) {
            this.measureText = 0;
        } else {
            TextPaint paint = this.mTextView.getPaint();
            CharSequence charSequence = this.mText;
            this.measureText = (int) paint.measureText(charSequence, 0, charSequence.length());
        }
        resetMarqueeView();
        dealAnimation();
    }

    public void setTextColor(int mTextColor) {
        this.mTextColor = mTextColor;
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setTextColor(mTextColor);
        }
        TextView textView2 = this.mGhostTextView;
        if (textView2 != null) {
            textView2.setTextColor(mTextColor);
        }
        postInvalidate();
    }

    public void setTextSize(int complexUnitPx, int mTextSize) {
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setTextSize(complexUnitPx, mTextSize);
        }
        TextView textView2 = this.mGhostTextView;
        if (textView2 != null) {
            textView2.setTextSize(complexUnitPx, mTextSize);
        }
        postInvalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.typeface = typeface;
        if (typeface != null) {
            TextView textView = this.mTextView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
            TextView textView2 = this.mGhostTextView;
            if (textView2 != null) {
                textView2.setTypeface(typeface);
            }
        }
        postInvalidate();
    }

    public void startAnim() {
        stopAnim();
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.setDuration(this.measureText);
            this.valueAnimator.setStartDelay(this.startDelay);
            this.valueAnimator.addUpdateListener(this);
            this.valueAnimator.start();
        }
    }

    public void stopAnim() {
        try {
            ValueAnimator valueAnimator = this.valueAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeUpdateListener(this);
                this.valueAnimator.cancel();
            }
            resetMarqueeView();
        } catch (Exception unused) {
        }
    }

    public MarqueeTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MarqueeTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mOffset = 0;
        this.mGhostOffset = 0;
        this.spacing = 100;
        this.speed = 1;
        this.isRTL = false;
        this.startDelay = Constants.MAX_URL_LENGTH;
        this.mTextSize = 14;
        this.mTextColor = -16777216;
        initAttrs(context, attrs);
        setHorizontalScrollBarEnabled(false);
        setScrollbarFadingEnabled(true);
        setClipChildren(false);
        setClipToPadding(false);
        initLayout();
        initAnim();
    }
}
