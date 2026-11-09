package Qb;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7667f;

    public c(int i7, int i10, int i11, int i12) {
        int iDp2px = SizeUtils.dp2px(i7);
        this.f7666e = iDp2px;
        this.f7664c = iDp2px;
        int iDp2px2 = SizeUtils.dp2px(i10);
        this.f7667f = iDp2px2;
        this.f7665d = iDp2px2;
        this.f7662a = SizeUtils.dp2px(i11);
        this.f7663b = SizeUtils.dp2px(i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        if (childLayoutPosition != 0) {
            rect.top = this.f7666e;
        } else {
            rect.top = this.f7664c;
        }
        int itemCount = state.getItemCount();
        if (itemCount <= 0 || childLayoutPosition != itemCount - 1) {
            rect.bottom = this.f7667f;
        } else {
            rect.bottom = this.f7665d;
        }
        rect.left = this.f7662a;
        rect.right = this.f7663b;
    }
}
