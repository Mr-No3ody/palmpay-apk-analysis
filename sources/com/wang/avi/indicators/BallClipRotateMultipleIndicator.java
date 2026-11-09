package com.wang.avi.indicators;

import C0.G;
import Re.c;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallClipRotateMultipleIndicator extends Indicator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35438i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f35439j;

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.save();
        canvas.translate(width, height);
        float f10 = this.f35438i;
        canvas.scale(f10, f10);
        canvas.rotate(this.f35439j);
        float[] fArr = {135.0f, -45.0f};
        for (int i7 = 0; i7 < 2; i7++) {
            canvas.drawArc(new RectF((-width) + 12.0f, (-height) + 12.0f, width - 12.0f, height - 12.0f), fArr[i7], 90.0f, false, paint);
        }
        canvas.restore();
        canvas.translate(width, height);
        float f11 = this.f35438i;
        canvas.scale(f11, f11);
        canvas.rotate(-this.f35439j);
        float[] fArr2 = {225.0f, 45.0f};
        for (int i10 = 0; i10 < 2; i10++) {
            canvas.drawArc(new RectF(((-width) / 1.8f) + 12.0f, ((-height) / 1.8f) + 12.0f, (width / 1.8f) - 12.0f, (height / 1.8f) - 12.0f), fArr2[i10], 90.0f, false, paint);
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        ValueAnimator valueAnimatorD = G.d(1000L, new float[]{1.0f, 0.6f, 1.0f}, -1);
        addUpdateListener(valueAnimatorD, new c(this, 0));
        ValueAnimator valueAnimatorD2 = G.d(1000L, new float[]{0.0f, 180.0f, 360.0f}, -1);
        addUpdateListener(valueAnimatorD2, new c(this, 1));
        arrayList.add(valueAnimatorD);
        arrayList.add(valueAnimatorD2);
        return arrayList;
    }
}
