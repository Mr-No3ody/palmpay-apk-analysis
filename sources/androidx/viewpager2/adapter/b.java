package androidx.viewpager2.adapter;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends RecyclerView.AdapterDataObserver {
    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public abstract void onChanged();

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i7, int i10) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i7, int i10) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeMoved(int i7, int i10, int i11) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeRemoved(int i7, int i10) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i7, int i10, Object obj) {
        onChanged();
    }
}
