package Qb;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {
    @Override // Qb.b, androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        if (parent.getChildCount() <= 0 || (adapter = parent.getAdapter()) == null) {
            return;
        }
        if (parent.getChildLayoutPosition(view) == adapter.getItemCount() - 1) {
            outRect.left = 0;
            outRect.right = 0;
            outRect.bottom = 0;
            outRect.top = 0;
        }
    }
}
