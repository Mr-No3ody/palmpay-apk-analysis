package com.transsnet.palmpay.custom_view;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.Adapter f31026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRecyclerView f31027b;

    public J(SwipeRecyclerView swipeRecyclerView, RecyclerView.Adapter adapter) {
        this.f31027b = swipeRecyclerView;
        this.f31026a = adapter;
    }

    public final boolean a(int i7) {
        return this.f31027b.f31149p && i7 == getItemCount() - 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        RecyclerView.Adapter adapter = this.f31026a;
        int itemCount = adapter == null ? 0 : adapter.getItemCount();
        return this.f31027b.f31149p ? itemCount + 1 : itemCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i7) {
        return this.f31026a.getItemId(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return a(i7) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : this.f31026a.getItemViewType(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new I(this, gridLayoutManager));
        }
        this.f31026a.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        if (a(i7)) {
            return;
        }
        this.f31026a.onBindViewHolder(viewHolder, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return 256 == i7 ? new H(this.f31027b.f31140b) : this.f31026a.onCreateViewHolder(viewGroup, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f31026a.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return this.f31026a.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) && a(viewHolder.getLayoutPosition())) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
        this.f31026a.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.f31026a.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        this.f31026a.onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        this.f31026a.registerAdapterDataObserver(adapterDataObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        this.f31026a.unregisterAdapterDataObserver(adapterDataObserver);
    }
}
