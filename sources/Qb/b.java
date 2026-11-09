package Qb;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class b extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7661b;

    public b(int i7, int i10, int i11) {
        this.f7660a = i7;
        this.f7661b = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i7 = this.f7660a;
        int i10 = childAdapterPosition % i7;
        int i11 = this.f7661b;
        outRect.left = (i10 * i11) / i7;
        outRect.right = i11 - (((i10 + 1) * i11) / i7);
        if (childAdapterPosition < i7) {
            outRect.top = 0;
        } else {
            outRect.top = i11 / 2;
        }
        if (childAdapterPosition >= ((state.getItemCount() - 1) / i7) * i7) {
            outRect.bottom = 0;
        } else {
            outRect.bottom = i11 / 2;
        }
    }
}
