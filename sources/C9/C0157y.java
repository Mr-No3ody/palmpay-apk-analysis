package C9;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C9.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0157y extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int spanCount;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        RecyclerView.Adapter adapter = parent.getAdapter();
        Intrinsics.e(adapter);
        int itemCount = adapter.getItemCount();
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        Intrinsics.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        if (itemCount % ((GridLayoutManager) layoutManager).getSpanCount() == 0) {
            RecyclerView.Adapter adapter2 = parent.getAdapter();
            Intrinsics.e(adapter2);
            int itemCount2 = adapter2.getItemCount();
            RecyclerView.LayoutManager layoutManager2 = parent.getLayoutManager();
            Intrinsics.f(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            spanCount = itemCount2 / ((GridLayoutManager) layoutManager2).getSpanCount();
        } else {
            RecyclerView.Adapter adapter3 = parent.getAdapter();
            Intrinsics.e(adapter3);
            int itemCount3 = adapter3.getItemCount();
            RecyclerView.LayoutManager layoutManager3 = parent.getLayoutManager();
            Intrinsics.f(layoutManager3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            spanCount = (itemCount3 / ((GridLayoutManager) layoutManager3).getSpanCount()) + 1;
        }
        if (spanCount == 1) {
            outRect.bottom = SizeUtils.dp2px(18.0f);
        } else if (parent.getChildLayoutPosition(view) / 3 == 0) {
            outRect.bottom = SizeUtils.dp2px(10.0f);
        } else if (parent.getChildLayoutPosition(view) / 3 == spanCount - 1) {
            outRect.bottom = SizeUtils.dp2px(18.0f);
        }
        if (parent.getChildLayoutPosition(view) % 3 == 0) {
            outRect.left = SizeUtils.dp2px(16.0f);
            outRect.right = SizeUtils.dp2px(11.0f);
        } else if (parent.getChildLayoutPosition(view) % 3 == 2) {
            outRect.left = SizeUtils.dp2px(11.0f);
            outRect.right = SizeUtils.dp2px(16.0f);
        } else {
            outRect.left = SizeUtils.dp2px(11.0f);
            outRect.right = SizeUtils.dp2px(11.0f);
        }
    }
}
