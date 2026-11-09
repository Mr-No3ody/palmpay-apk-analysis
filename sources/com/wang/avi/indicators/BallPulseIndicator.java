package com.wang.avi.indicators;

import C0.G;
import Re.e;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallPulseIndicator extends Indicator {
    public static final float SCALE = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f35446i = {1.0f, 1.0f, 1.0f};

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float fMin = (Math.min(getWidth(), getHeight()) - 8.0f) / 6.0f;
        float f10 = 2.0f * fMin;
        float width = (getWidth() / 2) - (f10 + 4.0f);
        float height = getHeight() / 2;
        for (int i7 = 0; i7 < 3; i7++) {
            canvas.save();
            float f11 = i7;
            canvas.translate((f11 * 4.0f) + (f10 * f11) + width, height);
            float f12 = this.f35446i[i7];
            canvas.scale(f12, f12);
            canvas.drawCircle(0.0f, 0.0f, fMin, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, 240, MessageEvent.EVENT_CL_REPAYMENT_FAILED};
        for (int i7 = 0; i7 < 3; i7++) {
            ValueAnimator valueAnimatorD = G.d(750L, new float[]{1.0f, 0.3f, 1.0f}, -1);
            valueAnimatorD.setStartDelay(iArr[i7]);
            addUpdateListener(valueAnimatorD, new e(this, i7, 1));
            arrayList.add(valueAnimatorD);
        }
        return arrayList;
    }
}
