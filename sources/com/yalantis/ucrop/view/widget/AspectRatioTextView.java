package com.yalantis.ucrop.view.widget;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.yalantis.ucrop.model.AspectRatio;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class AspectRatioTextView extends AppCompatTextView {
    private final float MARGIN_MULTIPLIER;
    private float mAspectRatio;
    private String mAspectRatioTitle;
    private float mAspectRatioX;
    private float mAspectRatioY;
    private final Rect mCanvasClipBounds;
    private Paint mDotPaint;
    private int mDotSize;

    public AspectRatioTextView(Context context) {
        this(context, null);
    }

    private void applyActiveColor(@ColorInt int i7) {
        Paint paint = this.mDotPaint;
        if (paint != null) {
            paint.setColor(i7);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{0}}, new int[]{i7, getContext().getColor(com.yalantis.ucrop.R.color.ucrop_color_widget)}));
    }

    private void init(@NonNull TypedArray typedArray) {
        setGravity(1);
        this.mAspectRatioTitle = typedArray.getString(com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_title);
        this.mAspectRatioX = typedArray.getFloat(com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_x, 0.0f);
        float f10 = typedArray.getFloat(com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_y, 0.0f);
        this.mAspectRatioY = f10;
        float f11 = this.mAspectRatioX;
        if (f11 == 0.0f || f10 == 0.0f) {
            this.mAspectRatio = 0.0f;
        } else {
            this.mAspectRatio = f11 / f10;
        }
        this.mDotSize = getContext().getResources().getDimensionPixelSize(com.yalantis.ucrop.R.dimen.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.mDotPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        setTitle();
        applyActiveColor(getResources().getColor(com.yalantis.ucrop.R.color.ucrop_color_widget_active));
        typedArray.recycle();
    }

    private void setTitle() {
        if (!TextUtils.isEmpty(this.mAspectRatioTitle)) {
            setText(this.mAspectRatioTitle);
            return;
        }
        Locale locale = Locale.US;
        setText(((int) this.mAspectRatioX) + ":" + ((int) this.mAspectRatioY));
    }

    private void toggleAspectRatio() {
        if (this.mAspectRatio != 0.0f) {
            float f10 = this.mAspectRatioX;
            float f11 = this.mAspectRatioY;
            this.mAspectRatioX = f11;
            this.mAspectRatioY = f10;
            this.mAspectRatio = f11 / f10;
        }
    }

    public float getAspectRatio(boolean z3) {
        if (z3) {
            toggleAspectRatio();
            setTitle();
        }
        return this.mAspectRatio;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.mCanvasClipBounds);
            Rect rect = this.mCanvasClipBounds;
            float f10 = (rect.right - rect.left) / 2.0f;
            float f11 = rect.bottom - (rect.top / 2.0f);
            int i7 = this.mDotSize;
            canvas.drawCircle(f10, f11 - (i7 * 1.5f), i7 / 2.0f, this.mDotPaint);
        }
    }

    public void setActiveColor(@ColorInt int i7) {
        applyActiveColor(i7);
        invalidate();
    }

    public void setAspectRatio(@NonNull AspectRatio aspectRatio) {
        this.mAspectRatioTitle = aspectRatio.getAspectRatioTitle();
        this.mAspectRatioX = aspectRatio.getAspectRatioX();
        float aspectRatioY = aspectRatio.getAspectRatioY();
        this.mAspectRatioY = aspectRatioY;
        float f10 = this.mAspectRatioX;
        if (f10 == 0.0f || aspectRatioY == 0.0f) {
            this.mAspectRatio = 0.0f;
        } else {
            this.mAspectRatio = f10 / aspectRatioY;
        }
        setTitle();
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.MARGIN_MULTIPLIER = 1.5f;
        this.mCanvasClipBounds = new Rect();
        init(context.obtainStyledAttributes(attributeSet, com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView));
    }

    @TargetApi(21)
    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7);
        this.MARGIN_MULTIPLIER = 1.5f;
        this.mCanvasClipBounds = new Rect();
        init(context.obtainStyledAttributes(attributeSet, com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView));
    }
}
