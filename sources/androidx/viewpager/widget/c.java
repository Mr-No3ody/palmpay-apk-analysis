package androidx.viewpager.widget;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class c extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerTitleStrip f18258b;

    public c(PagerTitleStrip pagerTitleStrip) {
        this.f18258b = pagerTitleStrip;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
    public final void onAdapterChanged(ViewPager viewPager, a aVar, a aVar2) {
        this.f18258b.a(aVar, aVar2);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        PagerTitleStrip pagerTitleStrip = this.f18258b;
        pagerTitleStrip.b(pagerTitleStrip.f18240a.getCurrentItem(), pagerTitleStrip.f18240a.getAdapter());
        float f10 = pagerTitleStrip.f18245f;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        pagerTitleStrip.c(f10, true, pagerTitleStrip.f18240a.getCurrentItem());
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
        this.f18257a = i7;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f10, int i10) {
        if (f10 > 0.5f) {
            i7++;
        }
        this.f18258b.c(f10, false, i7);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        if (this.f18257a == 0) {
            PagerTitleStrip pagerTitleStrip = this.f18258b;
            pagerTitleStrip.b(pagerTitleStrip.f18240a.getCurrentItem(), pagerTitleStrip.f18240a.getAdapter());
            float f10 = pagerTitleStrip.f18245f;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            pagerTitleStrip.c(f10, true, pagerTitleStrip.f18240a.getCurrentItem());
        }
    }
}
