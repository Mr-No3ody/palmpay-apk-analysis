package p041ce;

import androidx.viewpager2.widget.ViewPager2;
import com.transsnet.palmpay.teller.ui.view.WrapContentViewPager2;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WrapContentViewPager2 f18917a;

    public E(WrapContentViewPager2 wrapContentViewPager2) {
        this.f18917a = wrapContentViewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        int i10 = WrapContentViewPager2.f34365e;
        this.f18917a.b();
    }
}
