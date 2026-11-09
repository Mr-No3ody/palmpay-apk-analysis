package p294tb;

import androidx.viewpager2.widget.ViewPager2;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOpenResultActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLOpenResultActivity f42414a;

    public J(CLOpenResultActivity cLOpenResultActivity) {
        this.f42414a = cLOpenResultActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        super.onPageSelected(i7);
        int i10 = CLOpenResultActivity.f28955V0;
        CLOpenResultActivity cLOpenResultActivity = this.f42414a;
        cLOpenResultActivity.y(i7);
        cLOpenResultActivity.w();
    }
}
