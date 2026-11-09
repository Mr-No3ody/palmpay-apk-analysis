package com.wang.avi.indicators;

import C0.G;
import Re.m;
import Re.n;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.logging.type.LogSeverity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import com.wang.avi.Indicator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class BallSpinFadeLoaderIndicator extends Indicator {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f35457i = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f35458j = {255, 255, 255, 255, 255, 255, 255, 255};

    public static n a(int i7, int i10, float f10, double d2) {
        double d10 = f10;
        double dCos = Math.cos(d2) * d10;
        double dSin = Math.sin(d2) * d10;
        n nVar = new n();
        nVar.f8589a = (float) (dCos + ((double) (i7 / 2)));
        nVar.f8590b = (float) (dSin + ((double) (i10 / 2)));
        return nVar;
    }

    @Override // com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 10;
        for (int i7 = 0; i7 < 8; i7++) {
            canvas.save();
            n nVarA = a(getWidth(), getHeight(), (getWidth() / 2) - width, ((double) i7) * 0.7853981633974483d);
            canvas.translate(nVarA.f8589a, nVarA.f8590b);
            float f10 = this.f35457i[i7];
            canvas.scale(f10, f10);
            paint.setAlpha(this.f35458j[i7]);
            canvas.drawCircle(0.0f, 0.0f, width, paint);
            canvas.restore();
        }
    }

    @Override // com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {0, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, 240, MessageEvent.EVENT_CL_REPAYMENT_FAILED, 480, LogSeverity.CRITICAL_VALUE, 720, 780, 840};
        for (int i7 = 0; i7 < 8; i7++) {
            ValueAnimator valueAnimatorD = G.d(1000L, new float[]{1.0f, 0.4f, 1.0f}, -1);
            valueAnimatorD.setStartDelay(iArr[i7]);
            addUpdateListener(valueAnimatorD, new m(this, i7, 0));
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 77, 255);
            valueAnimatorOfInt.setDuration(1000L);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setStartDelay(iArr[i7]);
            addUpdateListener(valueAnimatorOfInt, new m(this, i7, 1));
            arrayList.add(valueAnimatorD);
            arrayList.add(valueAnimatorOfInt);
        }
        return arrayList;
    }
}
