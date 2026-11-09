package p013ae;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f11904a;

    public d(e eVar) {
        this.f11904a = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        this.f11904a.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeChanged(int i7, int i10) {
        this.f11904a.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeInserted(int i7, int i10) {
        this.f11904a.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeMoved(int i7, int i10, int i11) {
        this.f11904a.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onItemRangeRemoved(int i7, int i10) {
        this.f11904a.a();
    }
}
