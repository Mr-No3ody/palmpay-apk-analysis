package com.transsnet.palmpay.credit.ui.dialog;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.credit.ui.dialog.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1513k0 extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30140a;

    public C1513k0(int i7) {
        this.f30140a = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i7 = this.f30140a;
        outRect.left = childAdapterPosition == 0 ? 0 : i7 / 2;
        RecyclerView.Adapter adapter = parent.getAdapter();
        outRect.right = childAdapterPosition != (adapter != null ? adapter.getItemCount() : 1) - 1 ? i7 / 2 : 0;
    }
}
