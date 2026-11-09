package com.wang.avi.indicators;

import Re.p;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallZigZagDeflectIndicator extends BallZigZagIndicator {
    @Override // com.wang.avi.indicators.BallZigZagIndicator, com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        char c6 = 4;
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        float width = getWidth() / 6;
        float width2 = getWidth() / 6;
        int i7 = 0;
        while (i7 < 2) {
            float width3 = getWidth() - width;
            float width4 = getWidth() - width;
            float[] fArr = new float[5];
            fArr[0] = width;
            fArr[1] = width3;
            fArr[2] = width;
            fArr[3] = width4;
            fArr[c6] = width;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            if (i7 == 1) {
                float width5 = getWidth() - width;
                float width6 = getWidth() - width;
                float width7 = getWidth() - width;
                float[] fArr2 = new float[5];
                fArr2[0] = width5;
                fArr2[1] = width;
                fArr2[2] = width6;
                fArr2[3] = width;
                fArr2[c6] = width7;
                valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr2);
            }
            float height = getHeight() - width2;
            float height2 = getHeight() - width2;
            float[] fArr3 = new float[5];
            fArr3[0] = width2;
            fArr3[1] = width2;
            fArr3[2] = height;
            fArr3[3] = height2;
            fArr3[c6] = width2;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr3);
            if (i7 == 1) {
                float height3 = getHeight() - width2;
                float height4 = getHeight() - width2;
                float height5 = getHeight() - width2;
                float[] fArr4 = new float[5];
                fArr4[0] = height3;
                fArr4[1] = height4;
                fArr4[2] = width2;
                fArr4[3] = width2;
                fArr4[c6] = height5;
                valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr4);
            }
            valueAnimatorOfFloat.setDuration(2000L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat, new p(this, i7, 0));
            valueAnimatorOfFloat2.setDuration(2000L);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat2, new p(this, i7, 1));
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfFloat2);
            i7++;
            c6 = 4;
        }
        return arrayList;
    }
}
