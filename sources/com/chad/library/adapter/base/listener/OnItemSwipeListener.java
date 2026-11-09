package com.chad.library.adapter.base.listener;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public interface OnItemSwipeListener {
    void clearView(RecyclerView.ViewHolder viewHolder, int pos);

    void onItemSwipeMoving(Canvas canvas, RecyclerView.ViewHolder viewHolder, float dX, float dY, boolean isCurrentlyActive);

    void onItemSwipeStart(RecyclerView.ViewHolder viewHolder, int pos);

    void onItemSwiped(RecyclerView.ViewHolder viewHolder, int pos);
}
