package com.wang.avi.indicators;

import Re.k;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallScaleRippleIndicator extends BallScaleIndicator {
    @Override // com.wang.avi.indicators.BallScaleIndicator, com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
        super.draw(canvas, paint);
    }

    @Override // com.wang.avi.indicators.BallScaleIndicator, com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat, new k(this, 0));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfInt, new k(this, 1));
        arrayList.add(valueAnimatorOfFloat);
        arrayList.add(valueAnimatorOfInt);
        return arrayList;
    }
}
