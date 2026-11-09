package Ic;

import androidx.viewpager.widget.ViewPager;
import com.transsnet.palmpay.mall.ui.activity.MallPhotoViewActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MallPhotoViewActivity f4305a;

    public b(MallPhotoViewActivity mallPhotoViewActivity) {
        this.f4305a = mallPhotoViewActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        int i10 = MallPhotoViewActivity.f32007g;
        this.f4305a.l(i7);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f10, int i10) {
    }
}
