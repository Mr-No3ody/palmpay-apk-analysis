package V9;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int iDp2px = SizeUtils.dp2px(10.0f);
        rect.right = iDp2px;
        rect.bottom = iDp2px;
    }
}
