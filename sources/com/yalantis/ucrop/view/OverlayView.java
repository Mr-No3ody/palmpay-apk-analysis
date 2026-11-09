package com.yalantis.ucrop.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.yalantis.ucrop.R;
import com.yalantis.ucrop.callback.OverlayViewChangeListener;
import com.yalantis.ucrop.util.DensityUtil;
import com.yalantis.ucrop.util.RectUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class OverlayView extends View {
    public static final boolean DEFAULT_CIRCLE_DIMMED_LAYER = false;
    public static final int DEFAULT_CROP_GRID_COLUMN_COUNT = 2;
    public static final int DEFAULT_CROP_GRID_ROW_COUNT = 2;
    public static final int DEFAULT_FREESTYLE_CROP_MODE = 0;
    public static final boolean DEFAULT_SHOW_CROP_FRAME = true;
    public static final boolean DEFAULT_SHOW_CROP_GRID = true;
    public static final int FREESTYLE_CROP_MODE_DISABLE = 0;
    public static final int FREESTYLE_CROP_MODE_ENABLE = 1;
    public static final int FREESTYLE_CROP_MODE_ENABLE_WITH_PASS_THROUGH = 2;
    private static final long SMOOTH_CENTER_DURATION = 1000;
    private boolean isDragCenter;
    private OverlayViewChangeListener mCallback;
    private boolean mCircleDimmedLayer;
    private Path mCircularPath;
    private Paint mCropFrameCornersPaint;
    private Paint mCropFramePaint;
    protected float[] mCropGridCenter;
    private int mCropGridColumnCount;
    protected float[] mCropGridCorners;
    private Paint mCropGridPaint;
    private int mCropGridRowCount;
    private int mCropRectCornerTouchAreaLineLength;
    private int mCropRectMinSize;
    private final RectF mCropViewRect;
    private int mCurrentTouchCornerIndex;
    private int mDimmedColor;
    private Paint mDimmedStrokePaint;
    private int mFreestyleCropMode;
    private float[] mGridPoints;
    private float mPreviousTouchX;
    private float mPreviousTouchY;
    private boolean mShouldSetupCropBounds;
    private boolean mShowCropFrame;
    private boolean mShowCropGrid;
    private float mTargetAspectRatio;
    private final RectF mTempRect;
    protected int mThisHeight;
    protected int mThisWidth;
    private int mTouchPointThreshold;
    private ValueAnimator smoothAnimator;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FreestyleMode {
    }

    public OverlayView(Context context) {
        this(context, null);
    }

    private int getCurrentTouchIndex(float f10, float f11) {
        double d2 = this.mTouchPointThreshold;
        int i7 = -1;
        for (int i10 = 0; i10 < 8; i10 += 2) {
            double dSqrt = Math.sqrt(Math.pow(f11 - this.mCropGridCorners[i10 + 1], 2.0d) + Math.pow(f10 - this.mCropGridCorners[i10], 2.0d));
            if (dSqrt < d2) {
                i7 = i10 / 2;
                d2 = dSqrt;
            }
        }
        if (this.mFreestyleCropMode == 1 && i7 < 0 && this.mCropViewRect.contains(f10, f11)) {
            return 4;
        }
        return i7;
    }

    private void initCropFrameStyle(@NonNull TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.ucrop_UCropView_ucrop_frame_stroke_size, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_frame_color, getResources().getColor(R.color.ucrop_color_default_crop_frame));
        this.mCropFramePaint.setStrokeWidth(dimensionPixelSize);
        this.mCropFramePaint.setColor(color);
        Paint paint = this.mCropFramePaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.mCropFrameCornersPaint.setStrokeWidth(dimensionPixelSize * 3);
        this.mCropFrameCornersPaint.setColor(color);
        this.mCropFrameCornersPaint.setStyle(style);
    }

    private void initCropGridStyle(@NonNull TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.ucrop_UCropView_ucrop_grid_stroke_size, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_grid_color, getResources().getColor(R.color.ucrop_color_default_crop_grid));
        this.mCropGridPaint.setStrokeWidth(dimensionPixelSize);
        this.mCropGridPaint.setColor(color);
        this.mCropGridRowCount = typedArray.getInt(R.styleable.ucrop_UCropView_ucrop_grid_row_count, 2);
        this.mCropGridColumnCount = typedArray.getInt(R.styleable.ucrop_UCropView_ucrop_grid_column_count, 2);
    }

    private void smoothToCenter() {
        Point point = new Point((getLeft() + getRight()) / 2, (getBottom() + getTop()) / 2);
        final int iCenterY = (int) (point.y - this.mCropViewRect.centerY());
        final int iCenterX = (int) (point.x - this.mCropViewRect.centerX());
        final RectF rectF = new RectF(this.mCropViewRect);
        new RectF(this.mCropViewRect).offset(iCenterX, iCenterY);
        ValueAnimator valueAnimator = this.smoothAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.smoothAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(SMOOTH_CENTER_DURATION);
        this.smoothAnimator.setInterpolator(new OvershootInterpolator(1.0f));
        this.smoothAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.yalantis.ucrop.view.OverlayView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (OverlayView.this.mCallback != null) {
                    OverlayView.this.mCallback.onCropRectUpdated(OverlayView.this.mCropViewRect);
                }
            }
        });
        this.smoothAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yalantis.ucrop.view.OverlayView.2
            float lastAnimationValue = 0.0f;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue() * iCenterX;
                float fFloatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue() * iCenterY;
                RectF rectF2 = OverlayView.this.mCropViewRect;
                RectF rectF3 = rectF;
                rectF2.set(new RectF(rectF3.left + fFloatValue, rectF3.top + fFloatValue2, rectF3.right + fFloatValue, rectF3.bottom + fFloatValue2));
                OverlayView.this.updateGridPoints();
                OverlayView.this.postInvalidate();
                if (OverlayView.this.mCallback != null) {
                    OverlayView.this.mCallback.postTranslate((((Float) valueAnimator2.getAnimatedValue()).floatValue() - this.lastAnimationValue) * iCenterX, (((Float) valueAnimator2.getAnimatedValue()).floatValue() - this.lastAnimationValue) * iCenterY);
                }
                this.lastAnimationValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
            }
        });
        this.smoothAnimator.start();
    }

    private void updateCropViewRect(float f10, float f11) {
        this.mTempRect.set(this.mCropViewRect);
        int i7 = this.mCurrentTouchCornerIndex;
        if (i7 == 0) {
            RectF rectF = this.mTempRect;
            RectF rectF2 = this.mCropViewRect;
            rectF.set(f10, f11, rectF2.right, rectF2.bottom);
        } else if (i7 == 1) {
            RectF rectF3 = this.mTempRect;
            RectF rectF4 = this.mCropViewRect;
            rectF3.set(rectF4.left, f11, f10, rectF4.bottom);
        } else if (i7 == 2) {
            RectF rectF5 = this.mTempRect;
            RectF rectF6 = this.mCropViewRect;
            rectF5.set(rectF6.left, rectF6.top, f10, f11);
        } else if (i7 == 3) {
            RectF rectF7 = this.mTempRect;
            RectF rectF8 = this.mCropViewRect;
            rectF7.set(f10, rectF8.top, rectF8.right, f11);
        } else if (i7 == 4) {
            this.mTempRect.offset(f10 - this.mPreviousTouchX, f11 - this.mPreviousTouchY);
            if (this.mTempRect.left <= getLeft() || this.mTempRect.top <= getTop() || this.mTempRect.right >= getRight() || this.mTempRect.bottom >= getBottom()) {
                return;
            }
            this.mCropViewRect.set(this.mTempRect);
            updateGridPoints();
            postInvalidate();
            return;
        }
        boolean z3 = this.mTempRect.height() >= ((float) this.mCropRectMinSize);
        boolean z8 = this.mTempRect.width() >= ((float) this.mCropRectMinSize);
        RectF rectF9 = this.mCropViewRect;
        rectF9.set(z8 ? this.mTempRect.left : rectF9.left, z3 ? this.mTempRect.top : rectF9.top, z8 ? this.mTempRect.right : rectF9.right, z3 ? this.mTempRect.bottom : rectF9.bottom);
        if (z3 || z8) {
            updateGridPoints();
            postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateGridPoints() {
        this.mCropGridCorners = RectUtils.getCornersFromRect(this.mCropViewRect);
        this.mCropGridCenter = RectUtils.getCenterFromRect(this.mCropViewRect);
        this.mGridPoints = null;
        this.mCircularPath.reset();
        this.mCircularPath.addCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, Path.Direction.CW);
    }

    public void drawCropGrid(@NonNull Canvas canvas) {
        if (this.mShowCropGrid) {
            if (this.mGridPoints == null && !this.mCropViewRect.isEmpty()) {
                this.mGridPoints = new float[(this.mCropGridColumnCount * 4) + (this.mCropGridRowCount * 4)];
                int i7 = 0;
                for (int i10 = 0; i10 < this.mCropGridRowCount; i10++) {
                    float[] fArr = this.mGridPoints;
                    RectF rectF = this.mCropViewRect;
                    fArr[i7] = rectF.left;
                    float f10 = i10 + 1.0f;
                    float fHeight = (f10 / (this.mCropGridRowCount + 1)) * rectF.height();
                    RectF rectF2 = this.mCropViewRect;
                    fArr[i7 + 1] = fHeight + rectF2.top;
                    float[] fArr2 = this.mGridPoints;
                    int i11 = i7 + 3;
                    fArr2[i7 + 2] = rectF2.right;
                    i7 += 4;
                    fArr2[i11] = ((f10 / (this.mCropGridRowCount + 1)) * rectF2.height()) + this.mCropViewRect.top;
                }
                for (int i12 = 0; i12 < this.mCropGridColumnCount; i12++) {
                    float[] fArr3 = this.mGridPoints;
                    float f11 = i12 + 1.0f;
                    float fWidth = (f11 / (this.mCropGridColumnCount + 1)) * this.mCropViewRect.width();
                    RectF rectF3 = this.mCropViewRect;
                    fArr3[i7] = fWidth + rectF3.left;
                    float[] fArr4 = this.mGridPoints;
                    fArr4[i7 + 1] = rectF3.top;
                    int i13 = i7 + 3;
                    float fWidth2 = (f11 / (this.mCropGridColumnCount + 1)) * rectF3.width();
                    RectF rectF4 = this.mCropViewRect;
                    fArr4[i7 + 2] = fWidth2 + rectF4.left;
                    i7 += 4;
                    this.mGridPoints[i13] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.mGridPoints;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.mCropGridPaint);
            }
        }
        if (this.mShowCropFrame) {
            canvas.drawRect(this.mCropViewRect, this.mCropFramePaint);
        }
        if (this.mFreestyleCropMode != 0) {
            canvas.save();
            this.mTempRect.set(this.mCropViewRect);
            RectF rectF5 = this.mTempRect;
            int i14 = this.mCropRectCornerTouchAreaLineLength;
            rectF5.inset(i14, -i14);
            RectF rectF6 = this.mTempRect;
            Region.Op op = Region.Op.DIFFERENCE;
            canvas.clipRect(rectF6, op);
            this.mTempRect.set(this.mCropViewRect);
            RectF rectF7 = this.mTempRect;
            int i15 = this.mCropRectCornerTouchAreaLineLength;
            rectF7.inset(-i15, i15);
            canvas.clipRect(this.mTempRect, op);
            canvas.drawRect(this.mCropViewRect, this.mCropFrameCornersPaint);
            canvas.restore();
        }
    }

    public void drawDimmedLayer(@NonNull Canvas canvas) {
        canvas.save();
        if (this.mCircleDimmedLayer) {
            canvas.clipPath(this.mCircularPath, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.mCropViewRect, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.mDimmedColor);
        canvas.restore();
        if (this.mCircleDimmedLayer) {
            canvas.drawCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, this.mDimmedStrokePaint);
        }
    }

    @NonNull
    public RectF getCropViewRect() {
        return this.mCropViewRect;
    }

    public int getFreestyleCropMode() {
        return this.mFreestyleCropMode;
    }

    public OverlayViewChangeListener getOverlayViewChangeListener() {
        return this.mCallback;
    }

    public void init() {
    }

    @Deprecated
    public boolean isFreestyleCropEnabled() {
        return this.mFreestyleCropMode == 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawDimmedLayer(canvas);
        drawCropGrid(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        if (z3) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.mThisWidth = width - paddingLeft;
            this.mThisHeight = height - paddingTop;
            if (this.mShouldSetupCropBounds) {
                this.mShouldSetupCropBounds = false;
                setTargetAspectRatio(this.mTargetAspectRatio);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mCropViewRect.isEmpty() && this.mFreestyleCropMode != 0) {
            float x3 = motionEvent.getX();
            float y8 = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int currentTouchIndex = getCurrentTouchIndex(x3, y8);
                this.mCurrentTouchCornerIndex = currentTouchIndex;
                boolean z3 = currentTouchIndex != -1;
                if (!z3) {
                    this.mPreviousTouchX = -1.0f;
                    this.mPreviousTouchY = -1.0f;
                    return z3;
                }
                if (this.mPreviousTouchX < 0.0f) {
                    this.mPreviousTouchX = x3;
                    this.mPreviousTouchY = y8;
                }
                return z3;
            }
            if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.mCurrentTouchCornerIndex != -1) {
                float fMin = Math.min(Math.max(x3, getPaddingLeft()), getWidth() - getPaddingRight());
                float fMin2 = Math.min(Math.max(y8, getPaddingTop()), getHeight() - getPaddingBottom());
                updateCropViewRect(fMin, fMin2);
                this.mPreviousTouchX = fMin;
                this.mPreviousTouchY = fMin2;
                return true;
            }
            if ((motionEvent.getAction() & 255) == 1) {
                this.mPreviousTouchX = -1.0f;
                this.mPreviousTouchY = -1.0f;
                this.mCurrentTouchCornerIndex = -1;
                OverlayViewChangeListener overlayViewChangeListener = this.mCallback;
                if (overlayViewChangeListener != null) {
                    overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
                }
                if (this.isDragCenter) {
                    smoothToCenter();
                }
            }
        }
        return false;
    }

    public void processStyledAttributes(@NonNull TypedArray typedArray) {
        this.mCircleDimmedLayer = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_circle_dimmed_layer, false);
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_dimmed_color, getResources().getColor(R.color.ucrop_color_default_dimmed));
        this.mDimmedColor = color;
        this.mDimmedStrokePaint.setColor(color);
        this.mDimmedStrokePaint.setStyle(Paint.Style.STROKE);
        this.mDimmedStrokePaint.setStrokeWidth(DensityUtil.dip2px(getContext(), 1.0f));
        initCropFrameStyle(typedArray);
        this.mShowCropFrame = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_show_frame, true);
        initCropGridStyle(typedArray);
        this.mShowCropGrid = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_show_grid, true);
    }

    public void setCircleDimmedLayer(boolean z3) {
        this.mCircleDimmedLayer = z3;
    }

    public void setCircleStrokeColor(@ColorInt int i7) {
        this.mDimmedStrokePaint.setColor(i7);
    }

    public void setCropFrameColor(@ColorInt int i7) {
        this.mCropFramePaint.setColor(i7);
    }

    public void setCropFrameStrokeWidth(@IntRange(from = 0) int i7) {
        this.mCropFramePaint.setStrokeWidth(i7);
    }

    public void setCropGridColor(@ColorInt int i7) {
        this.mCropGridPaint.setColor(i7);
    }

    public void setCropGridColumnCount(@IntRange(from = 0) int i7) {
        this.mCropGridColumnCount = i7;
        this.mGridPoints = null;
    }

    public void setCropGridRowCount(@IntRange(from = 0) int i7) {
        this.mCropGridRowCount = i7;
        this.mGridPoints = null;
    }

    public void setCropGridStrokeWidth(@IntRange(from = 0) int i7) {
        this.mCropGridPaint.setStrokeWidth(i7);
    }

    public void setDimmedColor(@ColorInt int i7) {
        this.mDimmedColor = i7;
    }

    public void setDimmedStrokeWidth(@IntRange(from = 0) int i7) {
        this.mDimmedStrokePaint.setStrokeWidth(i7);
    }

    public void setDragSmoothToCenter(boolean z3) {
        this.isDragCenter = z3;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z3) {
        this.mFreestyleCropMode = z3 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i7) {
        this.mFreestyleCropMode = i7;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(OverlayViewChangeListener overlayViewChangeListener) {
        this.mCallback = overlayViewChangeListener;
    }

    public void setShowCropFrame(boolean z3) {
        this.mShowCropFrame = z3;
    }

    public void setShowCropGrid(boolean z3) {
        this.mShowCropGrid = z3;
    }

    public void setTargetAspectRatio(float f10) {
        this.mTargetAspectRatio = f10;
        if (this.mThisWidth <= 0) {
            this.mShouldSetupCropBounds = true;
        } else {
            setupCropBounds();
            postInvalidate();
        }
    }

    public void setupCropBounds() {
        int i7 = this.mThisWidth;
        float f10 = this.mTargetAspectRatio;
        int i10 = (int) (i7 / f10);
        int i11 = this.mThisHeight;
        if (i10 > i11) {
            int i12 = (int) (i11 * f10);
            int i13 = (i7 - i12) / 2;
            this.mCropViewRect.set(getPaddingLeft() + i13, getPaddingTop(), getPaddingLeft() + i12 + i13, getPaddingTop() + this.mThisHeight);
        } else {
            int i14 = (i11 - i10) / 2;
            this.mCropViewRect.set(getPaddingLeft(), getPaddingTop() + i14, getPaddingLeft() + this.mThisWidth, getPaddingTop() + i10 + i14);
        }
        OverlayViewChangeListener overlayViewChangeListener = this.mCallback;
        if (overlayViewChangeListener != null) {
            overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
        }
        updateGridPoints();
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mCropViewRect = new RectF();
        this.mTempRect = new RectF();
        this.mGridPoints = null;
        this.mCircularPath = new Path();
        this.mDimmedStrokePaint = new Paint(1);
        this.mCropGridPaint = new Paint(1);
        this.mCropFramePaint = new Paint(1);
        this.mCropFrameCornersPaint = new Paint(1);
        this.mFreestyleCropMode = 0;
        this.mPreviousTouchX = -1.0f;
        this.mPreviousTouchY = -1.0f;
        this.mCurrentTouchCornerIndex = -1;
        this.mTouchPointThreshold = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.mCropRectMinSize = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_min_size);
        this.mCropRectCornerTouchAreaLineLength = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
        init();
    }
}
