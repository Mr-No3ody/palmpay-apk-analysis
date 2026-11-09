package Je;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.AdapterDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f4776a;

    public c(d dVar) {
        this.f4776a = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        this.f4776a.c();
    }
}
