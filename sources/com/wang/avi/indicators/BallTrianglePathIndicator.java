package com.wang.avi.indicators;

import Re.o;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallTrianglePathIndicator extends Indicator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f35459i = new float[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f35460j = new float[3];

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        for (int i7 = 0; i7 < 3; i7++) {
            canvas.save();
            canvas.translate(this.f35459i[i7], this.f35460j[i7]);
            canvas.drawCircle(0.0f, 0.0f, getWidth() / 10, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        float width = getWidth() / 5;
        float width2 = getWidth() / 5;
        for (int i7 = 0; i7 < 3; i7++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getWidth() / 2, getWidth() - width, width, getWidth() / 2);
            if (i7 == 1) {
                valueAnimatorOfFloat = ValueAnimator.ofFloat(getWidth() - width, width, getWidth() / 2, getWidth() - width);
            } else if (i7 == 2) {
                valueAnimatorOfFloat = ValueAnimator.ofFloat(width, getWidth() / 2, getWidth() - width, width);
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(width2, getHeight() - width2, getHeight() - width2, width2);
            if (i7 == 1) {
                valueAnimatorOfFloat2 = ValueAnimator.ofFloat(getHeight() - width2, getHeight() - width2, width2, getHeight() - width2);
            } else if (i7 == 2) {
                valueAnimatorOfFloat2 = ValueAnimator.ofFloat(getHeight() - width2, width2, getHeight() - width2, getHeight() - width2);
            }
            valueAnimatorOfFloat.setDuration(2000L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat, new o(this, i7, 0));
            valueAnimatorOfFloat2.setDuration(2000L);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat2, new o(this, i7, 1));
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfFloat2);
        }
        return arrayList;
    }
}
