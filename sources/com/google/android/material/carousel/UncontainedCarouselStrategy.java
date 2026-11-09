package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class UncontainedCarouselStrategy extends CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    private float calculateMediumChildSize(float f10, float f11, float f12) {
        float fMax = Math.max(1.5f * f12, f10);
        float f13 = 0.85f * f11;
        if (fMax > f13) {
            fMax = Math.max(f13, f12 * 1.2f);
        }
        return Math.min(f11, fMax);
    }

    private KeylineState createCenterAlignedKeylineState(int i7, float f10, float f11, int i10, float f12, float f13, float f14) {
        float fMin = Math.min(f13, f11);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMin, f11, f10);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(f12, f11, f10);
        float f15 = f12 / 2.0f;
        float f16 = (f14 + 0.0f) - f15;
        float f17 = f16 + f15;
        float f18 = fMin / 2.0f;
        float f19 = (i10 * f11) + f17;
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(f11, i7).addAnchorKeyline((f16 - f15) - f18, childMaskPercentage, fMin).addKeyline(f16, childMaskPercentage2, f12, false).addKeylineRange((f11 / 2.0f) + f17, 0.0f, f11, i10, true);
        builderAddKeylineRange.addKeyline(f15 + f19, childMaskPercentage2, f12, false);
        builderAddKeylineRange.addAnchorKeyline(f19 + f12 + f18, childMaskPercentage, fMin);
        return builderAddKeylineRange.build();
    }

    private KeylineState createLeftAlignedKeylineState(Context context, float f10, int i7, float f11, int i10, float f12, int i11, float f13) {
        float fMin = Math.min(f13, f11);
        float fMax = Math.max(fMin, 0.5f * f12);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(fMax, f11, f10);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(fMin, f11, f10);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(f12, f11, f10);
        float f14 = (i10 * f11) + 0.0f;
        KeylineState.Builder builderAddKeylineRange = new KeylineState.Builder(f11, i7).addAnchorKeyline(0.0f - (fMax / 2.0f), childMaskPercentage, fMax).addKeylineRange(f11 / 2.0f, 0.0f, f11, i10, true);
        if (i11 > 0) {
            float f15 = (f12 / 2.0f) + f14;
            f14 += f12;
            builderAddKeylineRange.addKeyline(f15, childMaskPercentage3, f12, false);
        }
        builderAddKeylineRange.addAnchorKeyline((CarouselStrategyHelper.getExtraSmallSize(context) / 2.0f) + f14, childMaskPercentage2, fMin);
        return builderAddKeylineRange.build();
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public CarouselStrategy.StrategyType getStrategyType() {
        return CarouselStrategy.StrategyType.UNCONTAINED;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f11 = measuredHeight;
        float f12 = f10;
        float f13 = f11 + f12;
        float extraSmallSize = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f12;
        float extraSmallSize2 = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f12;
        float f14 = containerWidth;
        int iMax = Math.max(1, (int) Math.floor(f14 / f13));
        float f15 = f14 - (iMax * f13);
        if (carousel.getCarouselAlignment() == 1) {
            float f16 = f15 / 2.0f;
            return createCenterAlignedKeylineState(containerWidth, f12, f13, iMax, Math.max(Math.min(3.0f * f16, f13), getSmallItemSizeMin() + f12), extraSmallSize2, f16);
        }
        int i7 = 1;
        if (f15 <= 0.0f) {
            i7 = 0;
        }
        return createLeftAlignedKeylineState(view.getContext(), f12, containerWidth, f13, iMax, calculateMediumChildSize(extraSmallSize, f13, f15), i7, extraSmallSize2);
    }
}
