package p310ub;

import androidx.viewpager.widget.ViewPager;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcReferEarnHistoryActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class N0 implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcReferEarnHistoryActivity f42777a;

    public N0(OcReferEarnHistoryActivity ocReferEarnHistoryActivity) {
        this.f42777a = ocReferEarnHistoryActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        boolean z3 = i7 == 0;
        int i10 = OcReferEarnHistoryActivity.f29690i;
        this.f42777a.p(z3);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f10, int i10) {
    }
}
