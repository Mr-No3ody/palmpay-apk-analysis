package com.wang.avi.indicators;

import C0.G;
import Re.e;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class LineScalePulseOutRapidIndicator extends LineScaleIndicator {
    @Override // com.wang.avi.indicators.LineScaleIndicator, com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        long[] jArr = {400, 200, 0, 200, 400};
        for (int i7 = 0; i7 < 5; i7++) {
            ValueAnimator valueAnimatorD = G.d(1000L, new float[]{1.0f, 0.4f, 1.0f}, -1);
            valueAnimatorD.setStartDelay(jArr[i7]);
            addUpdateListener(valueAnimatorD, new e(this, i7, 6));
            arrayList.add(valueAnimatorD);
        }
        return arrayList;
    }
}
