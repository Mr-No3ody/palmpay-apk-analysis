package com.luck.picture.lib.decoration;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class WrapContentLinearLayoutManager extends LinearLayoutManager {
    public WrapContentLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e10) {
            e10.printStackTrace();
        }
    }

    public WrapContentLinearLayoutManager(Context context, int i7, boolean z3) {
        super(context, i7, z3);
    }

    public WrapContentLinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, i10);
    }
}
