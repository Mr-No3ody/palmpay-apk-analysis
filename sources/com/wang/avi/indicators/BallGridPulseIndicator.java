package com.wang.avi.indicators;

import Re.f;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.palmpay.lib.webview.container.WebProgress;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallGridPulseIndicator extends Indicator {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f35444i = {255, 255, 255, 255, 255, 255, 255, 255, 255};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f35445j = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

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
                int i11 = (i7 * 3) + i10;
                float f14 = this.f35445j[i11];
                canvas.scale(f14, f14);
                paint.setAlpha(this.f35444i[i11]);
                canvas.drawCircle(0.0f, 0.0f, width, paint);
                canvas.restore();
            }
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {720, 1020, 1280, 1420, 1450, 1180, 870, 1450, 1060};
        int[] iArr2 = {-60, 250, -170, 480, MessageEvent.EVENT_PATTERN_UNLOCK_SUCCESS, 30, 460, 780, WebProgress.MAX_DECELERATE_SPEED_DURATION};
        for (int i7 = 0; i7 < 9; i7++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.5f, 1.0f);
            valueAnimatorOfFloat.setDuration(iArr[i7]);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr2[i7]);
            addUpdateListener(valueAnimatorOfFloat, new f(this, i7, 0));
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 210, 122, 255);
            valueAnimatorOfInt.setDuration(iArr[i7]);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr2[i7]);
            addUpdateListener(valueAnimatorOfInt, new f(this, i7, 1));
            arrayList.add(valueAnimatorOfFloat);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }
}
