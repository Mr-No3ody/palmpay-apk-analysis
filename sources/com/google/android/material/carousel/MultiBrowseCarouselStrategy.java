package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.camera.video.u;
import androidx.recyclerview.widget.RecyclerView;
import p118hf.a;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};

    public boolean ensureArrangementFitsItemCount(Arrangement arrangement, int i7) {
        int itemCount = arrangement.getItemCount() - i7;
        boolean z3 = itemCount > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1);
        while (itemCount > 0) {
            int i10 = arrangement.smallCount;
            if (i10 > 0) {
                arrangement.smallCount = i10 - 1;
            } else {
                int i11 = arrangement.mediumCount;
                if (i11 > 1) {
                    arrangement.mediumCount = i11 - 1;
                }
            }
            itemCount--;
        }
        return z3;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        boolean z3;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f10;
        float fMax = Math.max(getSmallItemSizeMax() + f10, smallItemSizeMin);
        float f11 = containerHeight;
        float fMin = Math.min(measuredHeight + f10, f11);
        float fL = a.l((measuredHeight / 3.0f) + f10, smallItemSizeMin + f10, fMax + f10);
        float f12 = (fMin + fL) / 2.0f;
        int[] iArrDoubleCounts = SMALL_COUNTS;
        float f13 = 2.0f * smallItemSizeMin;
        if (f11 <= f13) {
            iArrDoubleCounts = new int[]{0};
        }
        int[] iArrDoubleCounts2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            iArrDoubleCounts = CarouselStrategy.doubleCounts(iArrDoubleCounts);
            iArrDoubleCounts2 = CarouselStrategy.doubleCounts(iArrDoubleCounts2);
        }
        int[] iArr = iArrDoubleCounts2;
        int[] iArr2 = iArrDoubleCounts;
        float f14 = f10;
        int iMax = (int) Math.max(1.0d, Math.floor(u.a(fMax, CarouselStrategyHelper.maxValue(iArr2), f11 - (CarouselStrategyHelper.maxValue(iArr) * f12), fMin)));
        int iCeil = (int) Math.ceil(f11 / fMin);
        int i7 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            iArr3[i10] = iCeil - i10;
        }
        Arrangement arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f11, fL, smallItemSizeMin, fMax, iArr2, f12, iArr, fMin, iArr3);
        this.keylineCount = arrangementFindLowestCostArrangement.getItemCount();
        boolean zEnsureArrangementFitsItemCount = ensureArrangementFitsItemCount(arrangementFindLowestCostArrangement, carousel.getItemCount());
        int i11 = arrangementFindLowestCostArrangement.mediumCount;
        if (i11 == 0 && arrangementFindLowestCostArrangement.smallCount == 0 && f11 > f13) {
            arrangementFindLowestCostArrangement.smallCount = 1;
            z3 = true;
        } else {
            z3 = zEnsureArrangementFitsItemCount;
        }
        if (z3) {
            arrangementFindLowestCostArrangement = Arrangement.findLowestCostArrangement(f11, fL, smallItemSizeMin, fMax, new int[]{arrangementFindLowestCostArrangement.smallCount}, f12, new int[]{i11}, fMin, new int[]{arrangementFindLowestCostArrangement.largeCount});
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f14, containerHeight, arrangementFindLowestCostArrangement, carousel.getCarouselAlignment());
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i7) {
        if (i7 >= this.keylineCount || carousel.getItemCount() < this.keylineCount) {
            return i7 >= this.keylineCount && carousel.getItemCount() < this.keylineCount;
        }
        return true;
    }
}
