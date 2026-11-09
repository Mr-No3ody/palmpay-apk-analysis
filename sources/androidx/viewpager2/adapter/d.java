package androidx.viewpager2.adapter;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f18269a;

    public d(e eVar) {
        this.f18269a = eVar;
    }

    @Override // androidx.viewpager2.adapter.b, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public final void onChanged() {
        this.f18269a.b(true);
    }
}
