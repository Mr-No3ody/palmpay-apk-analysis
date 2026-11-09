package com.wang.avi.indicators;

import Re.i;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallScaleIndicator extends Indicator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35453i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35454j = 255;

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        paint.setAlpha(this.f35454j);
        float f10 = this.f35453i;
        canvas.scale(f10, f10, getWidth() / 2, getHeight() / 2);
        paint.setAlpha(this.f35454j);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, (getWidth() / 2) - 4.0f, paint);
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat, new i(this, 0));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfInt, new i(this, 1));
        arrayList.add(valueAnimatorOfFloat);
        arrayList.add(valueAnimatorOfInt);
        return arrayList;
    }
}
