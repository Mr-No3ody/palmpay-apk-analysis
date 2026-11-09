package com.wang.avi.indicators;

import Re.u;
import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class SquareSpinIndicator extends Indicator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f35475j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Camera f35476o = new Camera();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Matrix f35477p = new Matrix();

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        Matrix matrix = this.f35477p;
        matrix.reset();
        Camera camera = this.f35476o;
        camera.save();
        camera.rotateX(this.f35474i);
        camera.rotateY(this.f35475j);
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-centerX(), -centerY());
        matrix.postTranslate(centerX(), centerY());
        canvas.concat(matrix);
        canvas.drawRect(new RectF(getWidth() / 5, getHeight() / 5, (getWidth() * 4) / 5, (getHeight() * 4) / 5), paint);
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 180.0f, 180.0f, 0.0f, 0.0f);
        addUpdateListener(valueAnimatorOfFloat, new u(this, 0));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setDuration(2500L);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 0.0f, 180.0f, 180.0f, 0.0f);
        addUpdateListener(valueAnimatorOfFloat2, new u(this, 1));
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.setRepeatCount(-1);
        valueAnimatorOfFloat2.setDuration(2500L);
        arrayList.add(valueAnimatorOfFloat);
        arrayList.add(valueAnimatorOfFloat2);
        return arrayList;
    }
}
