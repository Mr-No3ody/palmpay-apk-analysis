package com.wang.avi.indicators;

import Re.l;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallScaleRippleMultipleIndicator extends BallScaleMultipleIndicator {
    @Override // com.wang.avi.indicators.BallScaleMultipleIndicator, com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
        super.draw(canvas, paint);
    }

    @Override // com.wang.avi.indicators.BallScaleMultipleIndicator, com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        long[] jArr = {0, 200, 400};
        for (int i7 = 0; i7 < 3; i7++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat, new l(this, i7, 0));
            valueAnimatorOfFloat.setStartDelay(jArr[i7]);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.setDuration(1000L);
            valueAnimatorOfInt.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfInt, new l(this, i7, 1));
            valueAnimatorOfFloat.setStartDelay(jArr[i7]);
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }
}
