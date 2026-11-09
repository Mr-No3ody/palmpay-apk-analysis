package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.camera.video.u;
import androidx.recyclerview.widget.RecyclerView;
import p118hf.a;

/* JADX INFO: loaded from: classes2.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f10;
        float fMax = Math.max(getSmallItemSizeMax() + f10, smallItemSizeMin);
        float f11 = containerHeight;
        float fMin = Math.min(measuredWidth + f10, f11);
        float fL = a.l((measuredWidth / 3.0f) + f10, smallItemSizeMin + f10, fMax + f10);
        float f12 = (fMin + fL) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        int i7 = 0;
        int[] iArr2 = f11 < 2.0f * smallItemSizeMin ? new int[]{0} : iArr;
        int iMax = (int) Math.max(1.0d, Math.floor(u.a(fMax, CarouselStrategyHelper.maxValue(iArr), f11, fMin)));
        int iCeil = (((int) Math.ceil(f11 / fMin)) - iMax) + 1;
        int[] iArr3 = new int[iCeil];
        for (int i10 = 0; i10 < iCeil; i10++) {
            iArr3[i10] = iMax + i10;
        }
        int i11 = carousel.getCarouselAlignment() == 1 ? 1 : 0;
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f11, fL, smallItemSizeMin, fMax, i11 != 0 ? CarouselStrategy.doubleCounts(iArr2) : iArr2, f12, i11 != 0 ? CarouselStrategy.doubleCounts(MEDIUM_COUNTS) : MEDIUM_COUNTS, fMin, iArr3);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        if (arrangementFindLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f11, fL, smallItemSizeMin, fMax, iArr2, f12, MEDIUM_COUNTS, fMin, iArr3);
        } else {
            i7 = i11;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f10, containerHeight, arrangementFindLowestCostArrangement, i7);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i7) {
        if (carousel.getCarouselAlignment() == 1) {
            return (i7 < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i7 >= this.keylineCount && carousel.getItemCount() < this.keylineCount);
        }
        return false;
    }
}
