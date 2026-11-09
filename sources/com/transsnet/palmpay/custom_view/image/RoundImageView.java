package com.transsnet.palmpay.custom_view.image;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.transsnet.palmpay.custom_view.x;

/* JADX INFO: loaded from: classes4.dex */
public class RoundImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f31351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f31352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f31353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f31354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f31355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31357g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f31359j;

    public RoundImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        Path path = this.f31352b;
        path.reset();
        RectF rectF = this.f31353c;
        float f10 = width;
        float f11 = height;
        rectF.set(0.0f, 0.0f, f10, f11);
        Path.Direction direction = Path.Direction.CW;
        float[] fArr = this.f31351a;
        path.addRoundRect(rectF, fArr, direction);
        if (this.f31359j) {
            Paint paint = this.f31354d;
            paint.setColor(this.f31358i);
            canvas.drawPath(path, paint);
        }
        canvas.save();
        canvas.clipPath(path);
        super.onDraw(canvas);
        canvas.restore();
        int i7 = this.f31356f;
        if (i7 <= 0 || this.f31357g == 0) {
            return;
        }
        float f12 = i7 / 2.0f;
        rectF.set(f12, f12, f10 - f12, f11 - f12);
        path.reset();
        float[] fArr2 = new float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = Math.max(0.0f, fArr[i10] - f12);
        }
        path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        Paint paint2 = this.f31355e;
        paint2.setColor(this.f31357g);
        paint2.setStrokeWidth(this.f31356f);
        canvas.drawPath(path, paint2);
    }

    public void setRadius(int i7) {
        int i10 = 0;
        while (true) {
            float[] fArr = this.f31351a;
            if (i10 >= fArr.length) {
                postInvalidate();
                return;
            } else {
                fArr[i10] = i7;
                i10++;
            }
        }
    }

    public void setRoundBackgroundColor(int i7) {
        this.f31359j = true;
        this.f31358i = i7;
        postInvalidate();
    }

    public void setStrokeColor(int i7) {
        this.f31357g = i7;
        postInvalidate();
    }

    public void setStrokeWidth(int i7) {
        this.f31356f = i7;
        postInvalidate();
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        float[] fArr = {10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f};
        this.f31351a = fArr;
        this.f31353c = new RectF();
        Paint paint = new Paint(1);
        this.f31354d = paint;
        Paint paint2 = new Paint(1);
        this.f31355e = paint2;
        this.f31352b = new Path();
        paint.setStyle(Paint.Style.FILL);
        paint2.setStyle(Paint.Style.STROKE);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.CvRoundImageView);
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.CvRoundImageView_cvRadius, 0);
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.CvRoundImageView_cvTopLeftRadius, -1);
            float f10 = dimensionPixelOffset2 < 0 ? dimensionPixelOffset : dimensionPixelOffset2;
            fArr[0] = f10;
            fArr[1] = f10;
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.CvRoundImageView_cvTopRightRadius, -1);
            float f11 = dimensionPixelOffset3 < 0 ? dimensionPixelOffset : dimensionPixelOffset3;
            fArr[2] = f11;
            fArr[3] = f11;
            int dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.CvRoundImageView_cvBottomRightRadius, -1);
            float f12 = dimensionPixelOffset4 < 0 ? dimensionPixelOffset : dimensionPixelOffset4;
            fArr[4] = f12;
            fArr[5] = f12;
            int dimensionPixelOffset5 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.CvRoundImageView_cvBottomLeftRadius, -1);
            float f13 = dimensionPixelOffset5 >= 0 ? dimensionPixelOffset5 : dimensionPixelOffset;
            fArr[6] = f13;
            fArr[7] = f13;
            this.f31356f = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.CvRoundImageView_cvStrokeWidth, 0);
            this.f31357g = typedArrayObtainStyledAttributes.getColor(x.CvRoundImageView_cvStrokeColor, 0);
            if (typedArrayObtainStyledAttributes.hasValue(x.CvRoundImageView_cvBackgroundColor)) {
                this.f31359j = true;
                this.f31358i = typedArrayObtainStyledAttributes.getColor(x.CvRoundImageView_cvBackgroundColor, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        setLayerType(2, null);
    }
}
