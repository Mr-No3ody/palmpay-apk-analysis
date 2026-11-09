package F7;

import androidx.recyclerview.widget.RecyclerView;
import com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PagerGridLayoutManager f2622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f2623c;

    public c(int i7, PagerGridLayoutManager pagerGridLayoutManager, RecyclerView recyclerView) {
        this.f2621a = i7;
        this.f2622b = pagerGridLayoutManager;
        this.f2623c = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f2623c;
        PagerGridLayoutManager pagerGridLayoutManager = this.f2622b;
        d dVar = new d(recyclerView, pagerGridLayoutManager);
        dVar.setTargetPosition(this.f2621a);
        pagerGridLayoutManager.startSmoothScroll(dVar);
    }
}
