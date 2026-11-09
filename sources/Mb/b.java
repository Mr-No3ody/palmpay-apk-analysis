package Mb;

import androidx.viewpager.widget.ViewPager;
import com.transsnet.palmpay.custom_view.autoheightviewpager.AutoHeightViewPager;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends ViewPager.SimpleOnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AutoHeightViewPager f5929a;

    public b(AutoHeightViewPager autoHeightViewPager) {
        this.f5929a = autoHeightViewPager;
    }

    @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
        if (i7 == 0) {
            AutoHeightViewPager autoHeightViewPager = this.f5929a;
            autoHeightViewPager.f31190c = autoHeightViewPager.getCurrentItem();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f10, int i10) {
        AutoHeightViewPager autoHeightViewPager = this.f5929a;
        if (f10 == 0.0f) {
            autoHeightViewPager.f31191d = false;
            autoHeightViewPager.requestLayout();
            return;
        }
        int i11 = autoHeightViewPager.f31190c;
        int i12 = i7 >= i11 ? i7 : i7 + 1;
        int i13 = i7 >= i11 ? i7 + 1 : i7;
        int iA = autoHeightViewPager.a(i12);
        float f11 = iA;
        float fA = autoHeightViewPager.a(i13) - iA;
        if (i7 < autoHeightViewPager.f31190c) {
            f10 = 1 - f10;
        }
        autoHeightViewPager.f31189b = (int) ((fA * f10) + f11);
        autoHeightViewPager.f31191d = true;
        autoHeightViewPager.requestLayout();
    }
}
