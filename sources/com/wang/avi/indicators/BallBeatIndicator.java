package com.wang.avi.indicators;

import C0.G;
import Re.a;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallBeatIndicator extends Indicator {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f35434i = {1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f35435j = {255, 255, 255};

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = (getWidth() - 8.0f) / 6.0f;
        float f10 = 2.0f * width;
        float width2 = (getWidth() / 2) - (f10 + 4.0f);
        float height = getHeight() / 2;
        for (int i7 = 0; i7 < 3; i7++) {
            canvas.save();
            float f11 = i7;
            canvas.translate((f11 * 4.0f) + (f10 * f11) + width2, height);
            float f12 = this.f35434i[i7];
            canvas.scale(f12, f12);
            paint.setAlpha(this.f35435j[i7]);
            canvas.drawCircle(0.0f, 0.0f, width, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {350, 0, 350};
        for (int i7 = 0; i7 < 3; i7++) {
            ValueAnimator valueAnimatorD = G.d(700L, new float[]{1.0f, 0.75f, 1.0f}, -1);
            valueAnimatorD.setStartDelay(iArr[i7]);
            addUpdateListener(valueAnimatorD, new a(this, i7, 0));
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 51, 255);
            valueAnimatorOfInt.setDuration(700L);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr[i7]);
            addUpdateListener(valueAnimatorOfInt, new a(this, i7, 1));
            arrayList.add(valueAnimatorD);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }
}
