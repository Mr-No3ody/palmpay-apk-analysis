package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public abstract class SortedListAdapterCallback<T2> extends SortedList.Callback<T2> {
    final RecyclerView.Adapter<?> mAdapter;

    public SortedListAdapterCallback(@SuppressLint({"UnknownNullness", "MissingNullability"}) RecyclerView.Adapter<?> adapter) {
        this.mAdapter = adapter;
    }

    @Override // androidx.recyclerview.widget.SortedList.Callback
    public void onChanged(int i7, int i10) {
        this.mAdapter.notifyItemRangeChanged(i7, i10);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onInserted(int i7, int i10) {
        this.mAdapter.notifyItemRangeInserted(i7, i10);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onMoved(int i7, int i10) {
        this.mAdapter.notifyItemMoved(i7, i10);
    }

    @Override // androidx.recyclerview.widget.ListUpdateCallback
    public void onRemoved(int i7, int i10) {
        this.mAdapter.notifyItemRangeRemoved(i7, i10);
    }

    @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
    @SuppressLint({"UnknownNullness"})
    public void onChanged(int i7, int i10, Object obj) {
        this.mAdapter.notifyItemRangeChanged(i7, i10, obj);
    }
}
