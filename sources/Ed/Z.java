package Ed;

import Pa.n0;
import androidx.viewpager.widget.ViewPager;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class Z implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2353a;

    public Z(ArrayList arrayList) {
        this.f2353a = arrayList;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        String str = (String) CollectionsKt.G(i7, this.f2353a);
        n0 n0VarG = n0.g();
        ClickEvent clickEvent = new ClickEvent("Transfer_ToBank_Tab_Click");
        if (str == null) {
            str = "";
        }
        n0VarG.k(clickEvent.add("element_name", str));
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f10, int i10) {
    }
}
