package com.transsnet.palmpay.custom_view;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.Adapter f30944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReverseRecyclerView f30945b;

    public C(ReverseRecyclerView reverseRecyclerView, RecyclerView.Adapter adapter) {
        this.f30945b = reverseRecyclerView;
        this.f30944a = adapter;
    }

    public final boolean a(int i7) {
        return this.f30945b.f31117o && i7 == getItemCount() - 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        RecyclerView.Adapter adapter = this.f30944a;
        int itemCount = adapter == null ? 0 : adapter.getItemCount();
        return this.f30945b.f31117o ? itemCount + 1 : itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i7) {
        return this.f30944a.getItemId(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return a(i7) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : this.f30944a.getItemViewType(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new B(this, gridLayoutManager));
        }
        this.f30944a.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (a(i7)) {
            return;
        }
        this.f30944a.onBindViewHolder(viewHolder, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return 256 == i7 ? new A(this.f30945b.f31109b) : this.f30944a.onCreateViewHolder(viewGroup, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f30944a.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return this.f30944a.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) && a(viewHolder.getLayoutPosition())) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
        this.f30944a.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.f30944a.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        this.f30944a.onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        this.f30944a.registerAdapterDataObserver(adapterDataObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        this.f30944a.unregisterAdapterDataObserver(adapterDataObserver);
    }
}
