package Ce;

import android.widget.ImageView;
import com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager;
import com.transsnet.palmpay.ui.fragment.HomeSavingsUserV2Fragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class Y implements PagerGridLayoutManager.PagerChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeSavingsUserV2Fragment f1459a;

    public Y(HomeSavingsUserV2Fragment homeSavingsUserV2Fragment) {
        this.f1459a = homeSavingsUserV2Fragment;
    }

    @Override // com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager.PagerChangedListener
    public final void onPagerIndexSelected(int i7, int i10) {
        ArrayList arrayList = this.f1459a.f35179v0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                ((ImageView) arrayList.get(i11)).setSelected(i10 == i11);
                i11++;
            }
        }
        if (i10 > 0) {
            Pa.n0.g().v("FinanceTab_Icon_Swipe_Click");
        }
    }

    @Override // com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager.PagerChangedListener
    public final void onPagerCountChanged(int i7) {
    }
}
