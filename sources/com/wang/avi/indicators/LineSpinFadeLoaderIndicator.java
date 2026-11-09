package com.wang.avi.indicators;

import Re.n;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public class LineSpinFadeLoaderIndicator extends BallSpinFadeLoaderIndicator {
    @Override // com.wang.avi.indicators.BallSpinFadeLoaderIndicator, com.wang.avi.Indicator
    public void draw(Canvas canvas, Paint paint) {
        float width = getWidth() / 10;
        for (int i7 = 0; i7 < 8; i7++) {
            canvas.save();
            n nVarA = BallSpinFadeLoaderIndicator.a(getWidth(), getHeight(), (getWidth() / 2.5f) - width, ((double) i7) * 0.7853981633974483d);
            canvas.translate(nVarA.f8589a, nVarA.f8590b);
            float f10 = this.f35457i[i7];
            canvas.scale(f10, f10);
            canvas.rotate(i7 * 45);
            paint.setAlpha(this.f35458j[i7]);
            float f11 = -width;
            canvas.drawRoundRect(new RectF(f11, f11 / 1.5f, width * 1.5f, width / 1.5f), 5.0f, 5.0f, paint);
            canvas.restore();
        }
    }
}
