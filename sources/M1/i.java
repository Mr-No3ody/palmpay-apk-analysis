package M1;

import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.listener.GridSpanSizeLookup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f5735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GridLayoutManager f5736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GridLayoutManager.SpanSizeLookup f5737c;

    public i(j jVar, GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        this.f5735a = jVar;
        this.f5736b = gridLayoutManager;
        this.f5737c = spanSizeLookup;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        j jVar = this.f5735a;
        int itemViewType = jVar.getItemViewType(i7);
        if (itemViewType == 268435729 && jVar.getHeaderViewAsFlow()) {
            return 1;
        }
        if (itemViewType == 268436275 && jVar.getFooterViewAsFlow()) {
            return 1;
        }
        GridSpanSizeLookup gridSpanSizeLookup = jVar.mSpanSizeLookup;
        GridLayoutManager gridLayoutManager = this.f5736b;
        if (gridSpanSizeLookup == null) {
            return jVar.isFixedViewType(itemViewType) ? gridLayoutManager.getSpanCount() : this.f5737c.getSpanSize(i7);
        }
        if (jVar.isFixedViewType(itemViewType)) {
            return gridLayoutManager.getSpanCount();
        }
        GridSpanSizeLookup gridSpanSizeLookup2 = jVar.mSpanSizeLookup;
        Intrinsics.e(gridSpanSizeLookup2);
        return gridSpanSizeLookup2.getSpanSize(gridLayoutManager, itemViewType, i7 - jVar.getHeaderLayoutCount());
    }
}
