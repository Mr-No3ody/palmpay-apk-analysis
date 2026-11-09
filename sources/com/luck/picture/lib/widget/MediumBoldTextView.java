package com.luck.picture.lib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.luck.picture.lib.R;

/* JADX INFO: loaded from: classes3.dex */
public class MediumBoldTextView extends AppCompatTextView {
    private float mStrokeWidth;

    public MediumBoldTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        TextPaint paint = getPaint();
        float strokeWidth = paint.getStrokeWidth();
        float f10 = this.mStrokeWidth;
        if (strokeWidth != f10) {
            paint.setStrokeWidth(f10);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        super.onDraw(canvas);
    }

    public void setStrokeWidth(float f10) {
        this.mStrokeWidth = f10;
        invalidate();
    }

    public MediumBoldTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediumBoldTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mStrokeWidth = 0.6f;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.PictureMediumBoldTextView, i7, 0);
        this.mStrokeWidth = typedArrayObtainStyledAttributes.getFloat(R.styleable.PictureMediumBoldTextView_stroke_Width, this.mStrokeWidth);
        typedArrayObtainStyledAttributes.recycle();
    }
}
