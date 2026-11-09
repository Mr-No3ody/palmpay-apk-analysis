package t9;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42365a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42366b;

    public k(int i7) {
        this.f42366b = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i7 = this.f42365a;
        int i10 = childAdapterPosition % i7;
        int i11 = this.f42366b;
        outRect.left = (i10 * i11) / i7;
        outRect.right = i11 - (((i10 + 1) * i11) / i7);
        if (childAdapterPosition >= i7) {
            outRect.top = i11;
        }
    }
}
