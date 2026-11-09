package p197n4;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f39834f;

    public a() {
        int iDp2px = SizeUtils.dp2px(15);
        this.f39833e = iDp2px;
        this.f39831c = iDp2px;
        int iDp2px2 = SizeUtils.dp2px(0);
        this.f39834f = iDp2px2;
        this.f39832d = iDp2px2;
        float f10 = 20;
        this.f39829a = SizeUtils.dp2px(f10);
        this.f39830b = SizeUtils.dp2px(f10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childLayoutPosition = parent.getChildLayoutPosition(view);
        if (childLayoutPosition != 0) {
            outRect.top = this.f39833e;
        } else {
            outRect.top = this.f39831c;
        }
        int itemCount = state.getItemCount();
        if (itemCount <= 0 || childLayoutPosition != itemCount - 1) {
            outRect.bottom = this.f39834f;
        } else {
            outRect.bottom = this.f39832d;
        }
        outRect.left = this.f39829a;
        outRect.right = this.f39830b;
    }
}
