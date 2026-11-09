package Te;

import androidx.viewpager2.widget.ViewPager2;
import com.zhpan.indicator.base.BaseIndicatorView;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseIndicatorView f9074a;

    public a(BaseIndicatorView baseIndicatorView) {
        this.f9074a = baseIndicatorView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i7) {
        this.f9074a.onPageScrollStateChanged(i7);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i7, float f10, int i10) {
        this.f9074a.onPageScrolled(i7, f10, i10);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        this.f9074a.onPageSelected(i7);
    }
}
