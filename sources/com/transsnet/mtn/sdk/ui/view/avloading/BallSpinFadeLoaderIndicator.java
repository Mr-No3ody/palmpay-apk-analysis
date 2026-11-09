package com.transsnet.mtn.sdk.ui.view.avloading;

import C0.G;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.logging.type.LogSeverity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.util.ArrayList;
import oh.b;

/* JADX INFO: loaded from: classes3.dex */
public class BallSpinFadeLoaderIndicator extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f25755i = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f25756j = {255, 255, 255, 255, 255, 255, 255, 255};

    @Override // oh.b
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 10;
        for (int i7 = 0; i7 < 8; i7++) {
            canvas.save();
            int width2 = getWidth();
            int height = getHeight();
            double d2 = ((double) i7) * 0.7853981633974483d;
            double width3 = (getWidth() / 2) - width;
            canvas.translate((float) ((Math.cos(d2) * width3) + ((double) (width2 / 2))), (float) ((Math.sin(d2) * width3) + ((double) (height / 2))));
            float f10 = this.f25755i[i7];
            canvas.scale(f10, f10);
            paint.setAlpha(this.f25756j[i7]);
            canvas.drawCircle(0.0f, 0.0f, width, paint);
            canvas.restore();
        }
    }

    @Override // oh.b
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {0, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, 240, MessageEvent.EVENT_CL_REPAYMENT_FAILED, 480, LogSeverity.CRITICAL_VALUE, 720, 780, 840};
        for (int i7 = 0; i7 < 8; i7++) {
            ValueAnimator valueAnimatorD = G.d(1000L, new float[]{1.0f, 0.4f, 1.0f}, -1);
            valueAnimatorD.setStartDelay(iArr[i7]);
            addUpdateListener(valueAnimatorD, new C8.b(this, i7, 0));
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 77, 255);
            valueAnimatorOfInt.setDuration(1000L);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr[i7]);
            addUpdateListener(valueAnimatorOfInt, new C8.b(this, i7, 1));
            arrayList.add(valueAnimatorD);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }
}
