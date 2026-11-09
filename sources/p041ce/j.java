package p041ce;

import Xd.x;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f18946a;

    public j(x xVar) {
        this.f18946a = xVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        super.onPageSelected(i7);
        x xVar = this.f18946a;
        xVar.f11183b = i7;
        xVar.notifyDataSetChanged();
    }
}
