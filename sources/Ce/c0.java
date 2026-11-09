package Ce;

import android.widget.ImageView;
import com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager;
import com.transsnet.palmpay.ui.fragment.InvestGuideFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements PagerGridLayoutManager.PagerChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InvestGuideFragment f1470a;

    public c0(InvestGuideFragment investGuideFragment) {
        this.f1470a = investGuideFragment;
    }

    @Override // com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager.PagerChangedListener
    public final void onPagerIndexSelected(int i7, int i10) {
        ArrayList arrayList = this.f1470a.f35196L;
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                ((ImageView) arrayList.get(i11)).setSelected(i10 == i11);
                i11++;
            }
        }
    }

    @Override // com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager.PagerChangedListener
    public final void onPagerCountChanged(int i7) {
    }
}
