package com.wang.avi.indicators;

import Re.e;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class LineScalePartyIndicator extends Indicator {
    public static final float SCALE = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f35468i = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 9;
        float height = getHeight() / 2;
        for (int i7 = 0; i7 < 4; i7++) {
            canvas.save();
            float f10 = width / 2.0f;
            canvas.translate((((i7 * 2) + 2) * width) - f10, height);
            float f11 = this.f35468i[i7];
            canvas.scale(f11, f11);
            canvas.drawRoundRect(new RectF((-width) / 2.0f, (-getHeight()) / 2.5f, f10, getHeight() / 2.5f), 5.0f, 5.0f, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        long[] jArr = {1260, 430, 1010, 730};
        long[] jArr2 = {770, 290, 280, 740};
        for (int i7 = 0; i7 < 4; i7++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.4f, 1.0f);
            valueAnimatorOfFloat.setDuration(jArr[i7]);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(jArr2[i7]);
            addUpdateListener(valueAnimatorOfFloat, new e(this, i7, 4));
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }
}
