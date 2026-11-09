package com.wang.avi.indicators;

import Re.g;
import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallPulseRiseIndicator extends Indicator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Camera f35447i = new Camera();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f35448j = new Matrix();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f35449o;

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        Matrix matrix = this.f35448j;
        matrix.reset();
        Camera camera = this.f35447i;
        camera.save();
        camera.rotateX(this.f35449o);
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-centerX(), -centerY());
        matrix.postTranslate(centerX(), centerY());
        canvas.concat(matrix);
        float width = getWidth() / 10;
        float f10 = 2.0f * width;
        canvas.drawCircle(getWidth() / 4, f10, width, paint);
        canvas.drawCircle((getWidth() * 3) / 4, f10, width, paint);
        canvas.drawCircle(width, getHeight() - f10, width, paint);
        canvas.drawCircle(getWidth() / 2, getHeight() - f10, width, paint);
        canvas.drawCircle(getWidth() - width, getHeight() - f10, width, paint);
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        addUpdateListener(valueAnimatorOfFloat, new g(this, 0));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setDuration(1500L);
        arrayList.add(valueAnimatorOfFloat);
        return arrayList;
    }
}
