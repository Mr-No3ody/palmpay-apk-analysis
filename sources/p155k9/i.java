package p155k9;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i7 = childAdapterPosition % 3;
        int dp = CommonViewExtKt.getDp(8) / 3;
        if (i7 == 0) {
            outRect.left = 0;
            outRect.right = dp * 2;
        } else if (i7 == 1) {
            outRect.left = dp;
            outRect.right = dp;
        } else if (i7 == 2) {
            outRect.left = dp * 2;
            outRect.right = 0;
        }
        if (childAdapterPosition >= 3) {
            outRect.top = CommonViewExtKt.getDp(8);
        } else {
            outRect.top = 0;
        }
    }
}
