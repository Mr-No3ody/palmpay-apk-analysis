package com.wang.avi.indicators;

import Re.j;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallScaleMultipleIndicator extends Indicator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f35455i = {1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f35456j = {255, 255, 255};

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        for (int i7 = 0; i7 < 3; i7++) {
            paint.setAlpha(this.f35456j[i7]);
            float f10 = this.f35455i[i7];
            canvas.scale(f10, f10, getWidth() / 2, getHeight() / 2);
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, (getWidth() / 2) - 4.0f, paint);
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        long[] jArr = {0, 200, 400};
        for (int i7 = 0; i7 < 3; i7++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat, new j(this, i7, 0));
            valueAnimatorOfFloat.setStartDelay(jArr[i7]);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
            valueAnimatorOfInt.setDuration(1000L);
            valueAnimatorOfInt.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfInt, new j(this, i7, 1));
            valueAnimatorOfFloat.setStartDelay(jArr[i7]);
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }
}
