package com.shencoder.pagergridlayoutmanager;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements RecyclerView.OnChildAttachStateChangeListener {
    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(View view) {
        PagerGridLayoutManager.LayoutParams layoutParams = (PagerGridLayoutManager.LayoutParams) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
            throw new IllegalStateException("Item layout  must fill the whole PagerGridLayoutManager (use match_parent)");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(View view) {
    }
}
