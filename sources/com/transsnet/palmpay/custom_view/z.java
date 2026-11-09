package com.transsnet.palmpay.custom_view;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReverseRecyclerView f31739a;

    public z(ReverseRecyclerView reverseRecyclerView) {
        this.f31739a = reverseRecyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        super.onChanged();
        ReverseRecyclerView reverseRecyclerView = this.f31739a;
        RecyclerView.Adapter adapter = reverseRecyclerView.f31110c.getAdapter();
        if (adapter != null && reverseRecyclerView.f31108a != null) {
            if (adapter.getItemCount() == ((!reverseRecyclerView.f31117o || adapter.getItemCount() == 0) ? 0 : 1)) {
                reverseRecyclerView.getClass();
                if (reverseRecyclerView.f31108a.getParent() == null) {
                    reverseRecyclerView.addView(reverseRecyclerView.f31108a, new FrameLayout.LayoutParams(-1, -1));
                }
                reverseRecyclerView.f31110c.setVisibility(8);
                reverseRecyclerView.f31108a.setVisibility(0);
            } else {
                reverseRecyclerView.getClass();
                reverseRecyclerView.f31108a.setVisibility(8);
                reverseRecyclerView.f31110c.setVisibility(0);
            }
        }
        reverseRecyclerView.f31115i.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i7, int i10) {
        super.onItemRangeChanged(i7, i10);
        this.f31739a.f31115i.notifyItemRangeChanged(i7, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i7, int i10) {
        super.onItemRangeInserted(i7, i10);
        this.f31739a.f31115i.notifyItemRangeInserted(i7, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeMoved(int i7, int i10, int i11) {
        super.onItemRangeMoved(i7, i10, i11);
        this.f31739a.f31115i.notifyItemRangeRemoved(i7, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeRemoved(int i7, int i10) {
        super.onItemRangeRemoved(i7, i10);
        this.f31739a.f31115i.notifyItemRangeRemoved(i7, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i7, int i10, Object obj) {
        super.onItemRangeChanged(i7, i10, obj);
        this.f31739a.f31115i.notifyItemRangeChanged(i7, i10, obj);
    }
}
