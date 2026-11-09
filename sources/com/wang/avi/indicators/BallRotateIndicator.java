package com.wang.avi.indicators;

import C0.G;
import Re.h;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallRotateIndicator extends Indicator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35451i = 0.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f35452j;

    public BallRotateIndicator() {
        new Matrix();
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 10;
        float width2 = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.rotate(this.f35452j, centerX(), centerY());
        canvas.save();
        float f10 = 2.0f * width;
        canvas.translate((width2 - f10) - width, height);
        float f11 = this.f35451i;
        canvas.scale(f11, f11);
        canvas.drawCircle(0.0f, 0.0f, width, paint);
        canvas.restore();
        canvas.save();
        canvas.translate(width2, height);
        float f12 = this.f35451i;
        canvas.scale(f12, f12);
        canvas.drawCircle(0.0f, 0.0f, width, paint);
        canvas.restore();
        canvas.save();
        canvas.translate(width2 + f10 + width, height);
        float f13 = this.f35451i;
        canvas.scale(f13, f13);
        canvas.drawCircle(0.0f, 0.0f, width, paint);
        canvas.restore();
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        ValueAnimator valueAnimatorD = G.d(1000L, new float[]{0.5f, 1.0f, 0.5f}, -1);
        addUpdateListener(valueAnimatorD, new h(this, 0));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 180.0f, 360.0f);
        addUpdateListener(valueAnimatorOfFloat, new h(this, 1));
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        arrayList.add(valueAnimatorD);
        arrayList.add(valueAnimatorOfFloat);
        return arrayList;
    }
}
