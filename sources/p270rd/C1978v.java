package p270rd;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rd.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1978v extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int iDp2px = SizeUtils.dp2px(10.0f);
        outRect.top = iDp2px;
        outRect.bottom = iDp2px;
        int iDp2px2 = SizeUtils.dp2px(6.0f);
        outRect.left = iDp2px2;
        outRect.right = iDp2px2;
    }
}
