package com.wang.avi.indicators;

import Re.v;
import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class TriangleSkewSpinIndicator extends Indicator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f35479j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Camera f35480o = new Camera();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Matrix f35481p = new Matrix();

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        Matrix matrix = this.f35481p;
        matrix.reset();
        Camera camera = this.f35480o;
        camera.save();
        camera.rotateX(this.f35478i);
        camera.rotateY(this.f35479j);
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-centerX(), -centerY());
        matrix.postTranslate(centerX(), centerY());
        canvas.concat(matrix);
        Path path = new Path();
        path.moveTo(getWidth() / 5, (getHeight() * 4) / 5);
        path.lineTo((getWidth() * 4) / 5, (getHeight() * 4) / 5);
        path.lineTo(getWidth() / 2, getHeight() / 5);
        path.close();
        canvas.drawPath(path, paint);
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 180.0f, 180.0f, 0.0f, 0.0f);
        addUpdateListener(valueAnimatorOfFloat, new v(this, 0));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setDuration(2500L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 0.0f, 180.0f, 180.0f, 0.0f);
        addUpdateListener(valueAnimatorOfFloat2, new v(this, 1));
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.setRepeatCount(-1);
        valueAnimatorOfFloat2.setDuration(2500L);
        arrayList.add(valueAnimatorOfFloat);
        arrayList.add(valueAnimatorOfFloat2);
        return arrayList;
    }
}
