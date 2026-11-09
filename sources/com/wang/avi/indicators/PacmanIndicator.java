package com.wang.avi.indicators;

import C0.G;
import Re.t;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class PacmanIndicator extends Indicator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35470j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f35471o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f35472p;

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.save();
        canvas.translate(width, height);
        canvas.rotate(this.f35471o);
        paint.setAlpha(255);
        float f10 = (-width) / 1.7f;
        float f11 = (-height) / 1.7f;
        float f12 = width / 1.7f;
        float f13 = height / 1.7f;
        canvas.drawArc(new RectF(f10, f11, f12, f13), 0.0f, 270.0f, true, paint);
        canvas.restore();
        canvas.save();
        canvas.translate(width, height);
        canvas.rotate(this.f35472p);
        paint.setAlpha(255);
        canvas.drawArc(new RectF(f10, f11, f12, f13), 90.0f, 270.0f, true, paint);
        canvas.restore();
        float width2 = getWidth() / 11;
        paint.setAlpha(this.f35470j);
        canvas.drawCircle(this.f35469i, getHeight() / 2, width2, paint);
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getWidth() - (getWidth() / 11), getWidth() / 2);
        valueAnimatorOfFloat.setDuration(650L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfFloat, new t(this, 0));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 122);
        valueAnimatorOfInt.setDuration(650L);
        valueAnimatorOfInt.setRepeatCount(-1);
        addUpdateListener(valueAnimatorOfInt, new t(this, 1));
        ValueAnimator valueAnimatorD = G.d(650L, new float[]{0.0f, 45.0f, 0.0f}, -1);
        addUpdateListener(valueAnimatorD, new t(this, 2));
        ValueAnimator valueAnimatorD2 = G.d(650L, new float[]{0.0f, -45.0f, 0.0f}, -1);
        addUpdateListener(valueAnimatorD2, new t(this, 3));
        arrayList.add(valueAnimatorOfFloat);
        arrayList.add(valueAnimatorOfInt);
        arrayList.add(valueAnimatorD);
        arrayList.add(valueAnimatorD2);
        return arrayList;
    }
}
