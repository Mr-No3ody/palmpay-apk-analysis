package U6;

import androidx.viewpager2.widget.ViewPager2;
import com.palmpay.lib.ui.indicator.RoundCornerIndicator;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RoundCornerIndicator f9277a;

    public a(RoundCornerIndicator roundCornerIndicator) {
        this.f9277a = roundCornerIndicator;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i7, float f10, int i10) {
        RoundCornerIndicator roundCornerIndicator = this.f9277a;
        if (roundCornerIndicator.isSnap || i7 == roundCornerIndicator.getCom.microsoft.codepush.react.CodePushConstants.LATEST_ROLLBACK_COUNT_KEY java.lang.String() - 1) {
            return;
        }
        roundCornerIndicator.currentItem = i7;
        roundCornerIndicator.f24474i = f10;
        roundCornerIndicator.invalidate();
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        RoundCornerIndicator roundCornerIndicator = this.f9277a;
        if (roundCornerIndicator.isSnap || i7 == roundCornerIndicator.getCom.microsoft.codepush.react.CodePushConstants.LATEST_ROLLBACK_COUNT_KEY java.lang.String() - 1) {
            roundCornerIndicator.currentItem = i7;
            roundCornerIndicator.invalidate();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i7) {
    }
}
