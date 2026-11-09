package com.wang.avi.indicators;

import Re.g;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class SemiCircleSpinIndicator extends Indicator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35473i;

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        canvas.rotate(this.f35473i, centerX(), centerY());
        canvas.drawArc(new RectF(0.0f, 0.0f, getWidth(), getHeight()), -60.0f, 120.0f, false, paint);
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 180.0f, 360.0f);
        addUpdateListener(valueAnimatorOfFloat, new g(this, 1));
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        arrayList.add(valueAnimatorOfFloat);
        return arrayList;
    }
}
