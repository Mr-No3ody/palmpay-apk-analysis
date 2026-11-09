package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CarouselStrategy {
    private float smallSizeMax;
    private float smallSizeMin;

    public enum StrategyType {
        CONTAINED,
        UNCONTAINED
    }

    public static int[] doubleCounts(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            iArr2[i7] = iArr[i7] * 2;
        }
        return iArr2;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static float getChildMaskPercentage(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public float getSmallItemSizeMax() {
        return this.smallSizeMax;
    }

    public float getSmallItemSizeMin() {
        return this.smallSizeMin;
    }

    public StrategyType getStrategyType() {
        return StrategyType.CONTAINED;
    }

    public void initialize(Context context) {
        float smallSizeMin = this.smallSizeMin;
        if (smallSizeMin <= 0.0f) {
            smallSizeMin = CarouselStrategyHelper.getSmallSizeMin(context);
        }
        this.smallSizeMin = smallSizeMin;
        float smallSizeMax = this.smallSizeMax;
        if (smallSizeMax <= 0.0f) {
            smallSizeMax = CarouselStrategyHelper.getSmallSizeMax(context);
        }
        this.smallSizeMax = smallSizeMax;
    }

    @NonNull
    @RestrictTo({c.f39801b})
    public abstract KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view);

    public void setSmallItemSizeMax(float f10) {
        this.smallSizeMax = f10;
    }

    public void setSmallItemSizeMin(float f10) {
        this.smallSizeMin = f10;
    }

    @RestrictTo({c.f39801b})
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i7) {
        return false;
    }
}
