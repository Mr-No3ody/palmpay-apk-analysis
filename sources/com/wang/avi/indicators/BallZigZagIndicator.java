package com.wang.avi.indicators;

import Re.q;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallZigZagIndicator extends Indicator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f35461i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f35462j = new float[2];

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        for (int i7 = 0; i7 < 2; i7++) {
            canvas.save();
            canvas.translate(this.f35461i[i7], this.f35462j[i7]);
            canvas.drawCircle(0.0f, 0.0f, getWidth() / 10, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        float width = getWidth() / 6;
        float width2 = getWidth() / 6;
        for (int i7 = 0; i7 < 2; i7++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(width, getWidth() - width, getWidth() / 2, width);
            if (i7 == 1) {
                valueAnimatorOfFloat = ValueAnimator.ofFloat(getWidth() - width, width, getWidth() / 2, getWidth() - width);
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(width2, width2, getHeight() / 2, width2);
            if (i7 == 1) {
                valueAnimatorOfFloat2 = ValueAnimator.ofFloat(getHeight() - width2, getHeight() - width2, getHeight() / 2, getHeight() - width2);
            }
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat, new q(this, i7, 0));
            valueAnimatorOfFloat2.setDuration(1000L);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat2, new q(this, i7, 1));
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfFloat2);
        }
        return arrayList;
    }
}
