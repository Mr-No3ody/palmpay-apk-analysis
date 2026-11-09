package com.wang.avi.indicators;

import Re.r;
import Re.s;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class CubeTransitionIndicator extends Indicator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f35465o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f35463i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f35464j = new float[2];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f35466p = 1.0f;

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 5;
        float height = getHeight() / 5;
        for (int i7 = 0; i7 < 2; i7++) {
            canvas.save();
            canvas.translate(this.f35463i[i7], this.f35464j[i7]);
            canvas.rotate(this.f35465o);
            float f10 = this.f35466p;
            canvas.scale(f10, f10);
            canvas.drawRect(new RectF((-width) / 2.0f, (-height) / 2.0f, width / 2.0f, height / 2.0f), paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        char c6;
        int i7;
        char c10 = 3;
        int i10 = 2;
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        float width = getWidth() / 5;
        float height = getHeight() / 5;
        int i11 = 0;
        while (i11 < i10) {
            this.f35463i[i11] = width;
            float width2 = getWidth() - width;
            float width3 = getWidth() - width;
            float[] fArr = new float[5];
            fArr[0] = width;
            fArr[1] = width2;
            fArr[i10] = width3;
            fArr[c10] = width;
            fArr[4] = width;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            if (i11 == 1) {
                float width4 = getWidth() - width;
                float width5 = getWidth() - width;
                float width6 = getWidth() - width;
                c6 = c10;
                float[] fArr2 = new float[5];
                fArr2[0] = width4;
                fArr2[1] = width;
                fArr2[i10] = width;
                fArr2[c6] = width5;
                fArr2[4] = width6;
                valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr2);
            } else {
                c6 = c10;
            }
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(1600L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.addUpdateListener(new r(this, i11, 0));
            this.f35464j[i11] = height;
            float height2 = getHeight() - height;
            float height3 = getHeight() - height;
            float[] fArr3 = new float[5];
            fArr3[0] = height;
            fArr3[1] = height;
            fArr3[i10] = height2;
            fArr3[c6] = height3;
            fArr3[4] = height;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr3);
            if (i11 == 1) {
                float height4 = getHeight() - height;
                float height5 = getHeight() - height;
                float height6 = getHeight() - height;
                i7 = i10;
                float[] fArr4 = new float[5];
                fArr4[0] = height4;
                fArr4[1] = height5;
                fArr4[i7] = height;
                fArr4[c6] = height;
                fArr4[4] = height6;
                valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr4);
            } else {
                i7 = i10;
            }
            valueAnimatorOfFloat2.setDuration(1600L);
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.setRepeatCount(-1);
            addUpdateListener(valueAnimatorOfFloat2, new r(this, i11, 1));
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfFloat2);
            i11++;
            c10 = c6;
            i10 = i7;
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.5f, 1.0f, 0.5f, 1.0f);
        valueAnimatorOfFloat3.setDuration(1600L);
        valueAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat3.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat3, new s(this, 0));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 180.0f, 360.0f, 540.0f, 720.0f);
        valueAnimatorOfFloat4.setDuration(1600L);
        valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat4.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat4, new s(this, 1));
        arrayList.add(valueAnimatorOfFloat3);
        arrayList.add(valueAnimatorOfFloat4);
        return arrayList;
    }
}
