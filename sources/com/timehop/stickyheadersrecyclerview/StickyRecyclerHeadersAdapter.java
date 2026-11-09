package com.timehop.stickyheadersrecyclerview;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* JADX INFO: loaded from: classes3.dex */
public interface StickyRecyclerHeadersAdapter<VH extends RecyclerView.ViewHolder> {
    long getHeaderId(int i7);

    int getItemCount();

    void onBindHeaderViewHolder(VH vh2, int i7);

    VH onCreateHeaderViewHolder(ViewGroup viewGroup);
}
