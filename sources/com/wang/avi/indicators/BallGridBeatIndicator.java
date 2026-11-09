package com.wang.avi.indicators;

import Re.e;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallGridBeatIndicator extends Indicator {
    public static final int ALPHA = 255;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f35443i = {255, 255, 255, 255, 255, 255, 255, 255, 255};

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = (getWidth() - 16.0f) / 6.0f;
        float f10 = 2.0f * width;
        float f11 = f10 + 4.0f;
        float width2 = (getWidth() / 2) - f11;
        float width3 = (getWidth() / 2) - f11;
        for (int i7 = 0; i7 < 3; i7++) {
            for (int i10 = 0; i10 < 3; i10++) {
                canvas.save();
                float f12 = i10;
                float f13 = i7;
                canvas.translate((f12 * 4.0f) + (f10 * f12) + width2, (f13 * 4.0f) + (f10 * f13) + width3);
                paint.setAlpha(this.f35443i[(i7 * 3) + i10]);
                canvas.drawCircle(0.0f, 0.0f, width, paint);
                canvas.restore();
            }
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {960, 930, 1190, 1130, 1340, 940, 1200, 820, 1190};
        int[] iArr2 = {MessageEvent.EVENT_CL_REPAYMENT_FAILED, 400, 680, 410, 710, -150, -120, 10, 320};
        for (int i7 = 0; i7 < 9; i7++) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 168, 255);
            valueAnimatorOfInt.setDuration(iArr[i7]);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr2[i7]);
            addUpdateListener(valueAnimatorOfInt, new e(this, i7, 0));
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }
}
