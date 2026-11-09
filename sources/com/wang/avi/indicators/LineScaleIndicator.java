package com.wang.avi.indicators;

import C0.G;
import Re.e;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class LineScaleIndicator extends Indicator {
    public static final float SCALE = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f35467i = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 11;
        float height = getHeight() / 2;
        for (int i7 = 0; i7 < 5; i7++) {
            canvas.save();
            float f10 = width / 2.0f;
            canvas.translate((((i7 * 2) + 2) * width) - f10, height);
            canvas.scale(1.0f, this.f35467i[i7]);
            canvas.drawRoundRect(new RectF((-width) / 2.0f, (-getHeight()) / 2.5f, f10, getHeight() / 2.5f), 5.0f, 5.0f, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        long[] jArr = {100, 200, 300, 400, 500};
        for (int i7 = 0; i7 < 5; i7++) {
            ValueAnimator valueAnimatorD = G.d(1000L, new float[]{1.0f, 0.4f, 1.0f}, -1);
            valueAnimatorD.setStartDelay(jArr[i7]);
            addUpdateListener(valueAnimatorD, new e(this, i7, 3));
            arrayList.add(valueAnimatorD);
        }
        return arrayList;
    }
}
