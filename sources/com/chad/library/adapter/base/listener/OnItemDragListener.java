package com.chad.library.adapter.base.listener;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public interface OnItemDragListener {
    void onItemDragEnd(RecyclerView.ViewHolder viewHolder, int pos);

    void onItemDragMoving(RecyclerView.ViewHolder source, int from, RecyclerView.ViewHolder target, int to);

    void onItemDragStart(RecyclerView.ViewHolder viewHolder, int pos);
}
