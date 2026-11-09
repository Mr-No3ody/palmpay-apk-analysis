package com.wang.avi.indicators;

import C0.G;
import Re.b;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallClipRotateIndicator extends Indicator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35436i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f35437j;

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.translate(width, height);
        float f10 = this.f35436i;
        canvas.scale(f10, f10);
        canvas.rotate(this.f35437j);
        canvas.drawArc(new RectF((-width) + 12.0f, (-height) + 12.0f, (width + 0.0f) - 12.0f, (height + 0.0f) - 12.0f), -45.0f, 270.0f, false, paint);
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        ValueAnimator valueAnimatorD = G.d(750L, new float[]{1.0f, 0.6f, 0.5f, 1.0f}, -1);
        addUpdateListener(valueAnimatorD, new b(this, 0));
        ValueAnimator valueAnimatorD2 = G.d(750L, new float[]{0.0f, 180.0f, 360.0f}, -1);
        addUpdateListener(valueAnimatorD2, new b(this, 1));
        arrayList.add(valueAnimatorD);
        arrayList.add(valueAnimatorD2);
        return arrayList;
    }
}
