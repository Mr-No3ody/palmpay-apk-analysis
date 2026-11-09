package com.luck.picture.lib.animators;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseAnimationAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private RecyclerView.Adapter<RecyclerView.ViewHolder> mAdapter;
    private int mDuration = 250;
    private Interpolator mInterpolator = new LinearInterpolator();
    private int mLastPosition = -1;
    private boolean isFirstOnly = true;

    public BaseAnimationAdapter(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        this.mAdapter = adapter;
    }

    public abstract Animator[] getAnimators(View view);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mAdapter.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i7) {
        return this.mAdapter.getItemId(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i7) {
        return this.mAdapter.getItemViewType(i7);
    }

    public RecyclerView.Adapter<RecyclerView.ViewHolder> getWrappedAdapter() {
        return this.mAdapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.mAdapter.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        this.mAdapter.onBindViewHolder(viewHolder, i7);
        int adapterPosition = viewHolder.getAdapterPosition();
        if (this.isFirstOnly && adapterPosition <= this.mLastPosition) {
            ViewHelper.clear(viewHolder.itemView);
            return;
        }
        for (Animator animator : getAnimators(viewHolder.itemView)) {
            animator.setDuration(this.mDuration).start();
            animator.setInterpolator(this.mInterpolator);
        }
        this.mLastPosition = adapterPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        return this.mAdapter.onCreateViewHolder(viewGroup, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.mAdapter.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        this.mAdapter.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        this.mAdapter.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        this.mAdapter.onViewRecycled(viewHolder);
        super.onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.registerAdapterDataObserver(adapterDataObserver);
        this.mAdapter.registerAdapterDataObserver(adapterDataObserver);
    }

    public void setDuration(int i7) {
        this.mDuration = i7;
    }

    public void setFirstOnly(boolean z3) {
        this.isFirstOnly = z3;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    public void setStartPosition(int i7) {
        this.mLastPosition = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.unregisterAdapterDataObserver(adapterDataObserver);
        this.mAdapter.unregisterAdapterDataObserver(adapterDataObserver);
    }
}
