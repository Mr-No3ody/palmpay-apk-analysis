package androidx.viewpager.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerTabStrip f18256b;

    public /* synthetic */ b(PagerTabStrip pagerTabStrip, int i7) {
        this.f18255a = i7;
        this.f18256b = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f18255a) {
            case 0:
                ViewPager viewPager = this.f18256b.f18240a;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                break;
            default:
                ViewPager viewPager2 = this.f18256b.f18240a;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
                break;
        }
    }
}
