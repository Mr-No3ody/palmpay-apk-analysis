package com.yalantis.ucrop.view.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import com.yalantis.ucrop.R;

/* JADX INFO: loaded from: classes4.dex */
public class HorizontalProgressWheelView extends View {
    private final Rect mCanvasClipBounds;
    private float mLastTouchedPosition;
    private int mMiddleLineColor;
    private int mProgressLineHeight;
    private int mProgressLineMargin;
    private Paint mProgressLinePaint;
    private int mProgressLineWidth;
    private Paint mProgressMiddleLinePaint;
    private boolean mScrollStarted;
    private ScrollingListener mScrollingListener;
    private float mTotalScrollDistance;

    public interface ScrollingListener {
        void onScroll(float f10, float f11);

        void onScrollEnd();

        void onScrollStart();
    }

    public HorizontalProgressWheelView(Context context) {
        this(context, null);
    }

    private void init() {
        this.mMiddleLineColor = getContext().getColor(R.color.ucrop_color_widget_rotate_mid_line);
        this.mProgressLineWidth = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_horizontal_wheel_progress_line);
        this.mProgressLineHeight = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_height_horizontal_wheel_progress_line);
        this.mProgressLineMargin = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.mProgressLinePaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mProgressLinePaint.setStrokeWidth(this.mProgressLineWidth);
        this.mProgressLinePaint.setColor(getResources().getColor(R.color.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.mProgressLinePaint);
        this.mProgressMiddleLinePaint = paint2;
        paint2.setColor(this.mMiddleLineColor);
        this.mProgressMiddleLinePaint.setStrokeCap(Paint.Cap.ROUND);
        this.mProgressMiddleLinePaint.setStrokeWidth(getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_middle_wheel_progress_line));
    }

    private void onScrollEvent(MotionEvent motionEvent, float f10) {
        this.mTotalScrollDistance -= f10;
        postInvalidate();
        this.mLastTouchedPosition = motionEvent.getX();
        ScrollingListener scrollingListener = this.mScrollingListener;
        if (scrollingListener != null) {
            scrollingListener.onScroll(-f10, this.mTotalScrollDistance);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.mCanvasClipBounds);
        int iWidth = this.mCanvasClipBounds.width();
        int i7 = this.mProgressLineWidth;
        int i10 = this.mProgressLineMargin;
        int i11 = iWidth / (i7 + i10);
        float f10 = this.mTotalScrollDistance % (i10 + i7);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i11 / 4;
            if (i12 < i13) {
                this.mProgressLinePaint.setAlpha((int) ((i12 / i13) * 255.0f));
            } else if (i12 > (i11 * 3) / 4) {
                this.mProgressLinePaint.setAlpha((int) (((i11 - i12) / i13) * 255.0f));
            } else {
                this.mProgressLinePaint.setAlpha(255);
            }
            float f11 = -f10;
            Rect rect = this.mCanvasClipBounds;
            float f12 = rect.left + f11 + ((this.mProgressLineWidth + this.mProgressLineMargin) * i12);
            float fCenterY = rect.centerY() - (this.mProgressLineHeight / 4.0f);
            Rect rect2 = this.mCanvasClipBounds;
            canvas.drawLine(f12, fCenterY, f11 + rect2.left + ((this.mProgressLineWidth + this.mProgressLineMargin) * i12), rect2.centerY() + (this.mProgressLineHeight / 4.0f), this.mProgressLinePaint);
        }
        canvas.drawLine(this.mCanvasClipBounds.centerX(), this.mCanvasClipBounds.centerY() - (this.mProgressLineHeight / 2.0f), this.mCanvasClipBounds.centerX(), (this.mProgressLineHeight / 2.0f) + this.mCanvasClipBounds.centerY(), this.mProgressMiddleLinePaint);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastTouchedPosition = motionEvent.getX();
        } else if (action == 1) {
            ScrollingListener scrollingListener = this.mScrollingListener;
            if (scrollingListener != null) {
                this.mScrollStarted = false;
                scrollingListener.onScrollEnd();
            }
        } else if (action == 2) {
            float x3 = motionEvent.getX() - this.mLastTouchedPosition;
            if (x3 != 0.0f) {
                if (!this.mScrollStarted) {
                    this.mScrollStarted = true;
                    ScrollingListener scrollingListener2 = this.mScrollingListener;
                    if (scrollingListener2 != null) {
                        scrollingListener2.onScrollStart();
                    }
                }
                onScrollEvent(motionEvent, x3);
            }
        }
        return true;
    }

    public void setMiddleLineColor(@ColorInt int i7) {
        this.mMiddleLineColor = i7;
        this.mProgressMiddleLinePaint.setColor(i7);
        invalidate();
    }

    public void setScrollingListener(ScrollingListener scrollingListener) {
        this.mScrollingListener = scrollingListener;
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mCanvasClipBounds = new Rect();
        init();
    }

    @TargetApi(21)
    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, i10);
        this.mCanvasClipBounds = new Rect();
    }
}
