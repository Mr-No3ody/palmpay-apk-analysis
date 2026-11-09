package com.wang.avi.indicators;

import C0.G;
import Re.d;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallClipRotatePulseIndicator extends Indicator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f35441j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f35442o;

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.save();
        canvas.translate(width, height);
        float f10 = this.f35440i;
        canvas.scale(f10, f10);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(0.0f, 0.0f, width / 2.5f, paint);
        canvas.restore();
        canvas.translate(width, height);
        float f11 = this.f35441j;
        canvas.scale(f11, f11);
        canvas.rotate(this.f35442o);
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        float[] fArr = {225.0f, 45.0f};
        for (int i7 = 0; i7 < 2; i7++) {
            canvas.drawArc(new RectF((-width) + 12.0f, (-height) + 12.0f, width - 12.0f, height - 12.0f), fArr[i7], 90.0f, false, paint);
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ValueAnimator valueAnimatorD = G.d(1000L, new float[]{1.0f, 0.3f, 1.0f}, -1);
        addUpdateListener(valueAnimatorD, new d(this, 0));
        ValueAnimator valueAnimatorD2 = G.d(1000L, new float[]{1.0f, 0.6f, 1.0f}, -1);
        addUpdateListener(valueAnimatorD2, new d(this, 1));
        ValueAnimator valueAnimatorD3 = G.d(1000L, new float[]{0.0f, 180.0f, 360.0f}, -1);
        addUpdateListener(valueAnimatorD3, new d(this, 2));
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        arrayList.add(valueAnimatorD);
        arrayList.add(valueAnimatorD2);
        arrayList.add(valueAnimatorD3);
        return arrayList;
    }
}
