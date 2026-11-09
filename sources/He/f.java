package He;

import com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements PagerGridLayoutManager.PagerChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p370ye.h f3882a;

    public f(p370ye.h hVar) {
        this.f3882a = hVar;
    }

    @Override // com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager.PagerChangedListener
    public final void onPagerIndexSelected(int i7, int i10) {
        p370ye.h hVar = this.f3882a;
        hVar.f44328c = i10;
        hVar.notifyDataSetChanged();
    }

    @Override // com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager.PagerChangedListener
    public final void onPagerCountChanged(int i7) {
    }
}
