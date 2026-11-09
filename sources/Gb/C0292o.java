package Gb;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.view.KingKongContentInfoView;
import com.transsnet.palmpay.util.ConvertUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Gb.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0292o extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KingKongContentInfoView f3290a;

    public C0292o(KingKongContentInfoView kingKongContentInfoView) {
        this.f3290a = kingKongContentInfoView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int viewLayoutPosition = ((RecyclerView.LayoutParams) layoutParams).getViewLayoutPosition();
        KingKongContentInfoView kingKongContentInfoView = this.f3290a;
        kingKongContentInfoView.getClass();
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        Intrinsics.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int spanCount = ((GridLayoutManager) layoutManager).getSpanCount();
        if (viewLayoutPosition % spanCount != spanCount - 1) {
            outRect.right = ConvertUtils.dp2px(12.0f);
        }
        RecyclerView.LayoutManager layoutManager2 = parent.getLayoutManager();
        Intrinsics.f(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int spanCount2 = ((GridLayoutManager) layoutManager2).getSpanCount();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        Intrinsics.f(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int viewLayoutPosition2 = ((RecyclerView.LayoutParams) layoutParams2).getViewLayoutPosition();
        kingKongContentInfoView.getClass();
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView.LayoutManager layoutManager3 = parent.getLayoutManager();
        int itemCount = layoutManager3 != null ? layoutManager3.getItemCount() : 0;
        int i7 = viewLayoutPosition2 / spanCount2;
        int i10 = itemCount % spanCount2;
        int i11 = itemCount / spanCount2;
        if (i10 != 0) {
            i11++;
        }
        if (i7 == i11 - 1) {
            return;
        }
        outRect.bottom = ConvertUtils.dp2px(12.0f);
    }
}
