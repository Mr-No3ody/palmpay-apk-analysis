package p310ub;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.util.ConvertUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ub.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2091n0 extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        outRect.left = ConvertUtils.dp2px(14.0f);
        outRect.right = ConvertUtils.dp2px(14.0f);
        outRect.top = ConvertUtils.dp2px(16.0f);
    }
}
