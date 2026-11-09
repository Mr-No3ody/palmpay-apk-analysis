package com.wang.avi.indicators;

import C0.G;
import Re.e;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class LineScalePulseOutIndicator extends LineScaleIndicator {
    @Override // com.wang.avi.indicators.LineScaleIndicator, com.wang.avi.Indicator
    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        long[] jArr = {500, 250, 0, 250, 500};
        for (int i7 = 0; i7 < 5; i7++) {
            ValueAnimator valueAnimatorD = G.d(900L, new float[]{1.0f, 0.3f, 1.0f}, -1);
            valueAnimatorD.setStartDelay(jArr[i7]);
            addUpdateListener(valueAnimatorD, new e(this, i7, 5));
            arrayList.add(valueAnimatorD);
        }
        return arrayList;
    }
}
