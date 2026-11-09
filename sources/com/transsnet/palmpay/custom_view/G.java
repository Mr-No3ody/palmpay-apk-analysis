package com.transsnet.palmpay.custom_view;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeRecyclerView f31023a;

    public G(SwipeRecyclerView swipeRecyclerView) {
        this.f31023a = swipeRecyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        super.onChanged();
        SwipeRecyclerView swipeRecyclerView = this.f31023a;
        RecyclerView.Adapter adapter = swipeRecyclerView.f31141c.getAdapter();
        if (adapter != null && swipeRecyclerView.f31139a != null) {
            if (adapter.getItemCount() == ((!swipeRecyclerView.f31149p || adapter.getItemCount() == 0) ? 0 : 1)) {
                swipeRecyclerView.getClass();
                if (swipeRecyclerView.f31139a.getParent() == null) {
                    swipeRecyclerView.addView(swipeRecyclerView.f31139a, new FrameLayout.LayoutParams(-1, -1));
                }
                swipeRecyclerView.f31141c.setVisibility(8);
                swipeRecyclerView.f31139a.setVisibility(0);
            } else {
                swipeRecyclerView.getClass();
                swipeRecyclerView.f31139a.setVisibility(8);
                swipeRecyclerView.f31141c.setVisibility(0);
            }
        }
        swipeRecyclerView.f31147j.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i7, int i10) {
        super.onItemRangeChanged(i7, i10);
        this.f31023a.f31147j.notifyItemRangeChanged(i7, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i7, int i10) {
        super.onItemRangeInserted(i7, i10);
        this.f31023a.f31147j.notifyItemRangeInserted(i7, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeMoved(int i7, int i10, int i11) {
        super.onItemRangeMoved(i7, i10, i11);
        this.f31023a.f31147j.notifyItemRangeRemoved(i7, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeRemoved(int i7, int i10) {
        super.onItemRangeRemoved(i7, i10);
        this.f31023a.f31147j.notifyItemRangeRemoved(i7, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i7, int i10, Object obj) {
        super.onItemRangeChanged(i7, i10, obj);
        this.f31023a.f31147j.notifyItemRangeChanged(i7, i10, obj);
    }
}
