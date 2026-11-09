package com.wang.avi.indicators;

import C0.G;
import Re.e;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallPulseSyncIndicator extends Indicator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f35450i = new float[3];

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = (getWidth() - 8.0f) / 6.0f;
        float f10 = 2.0f * width;
        float width2 = (getWidth() / 2) - (f10 + 4.0f);
        for (int i7 = 0; i7 < 3; i7++) {
            canvas.save();
            float f11 = i7;
            canvas.translate((f11 * 4.0f) + (f10 * f11) + width2, this.f35450i[i7]);
            canvas.drawCircle(0.0f, 0.0f, width, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        float width = (getWidth() - 8.0f) / 6.0f;
        int[] iArr = {70, 140, 210};
        for (int i7 = 0; i7 < 3; i7++) {
            ValueAnimator valueAnimatorD = G.d(600L, new float[]{getHeight() / 2, (getHeight() / 2) - (2.0f * width), getHeight() / 2}, -1);
            valueAnimatorD.setStartDelay(iArr[i7]);
            addUpdateListener(valueAnimatorD, new e(this, i7, 2));
            arrayList.add(valueAnimatorD);
        }
        return arrayList;
    }
}
