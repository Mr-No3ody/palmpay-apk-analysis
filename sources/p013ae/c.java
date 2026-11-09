package p013ae;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f11903a;

    public c(e eVar) {
        this.f11903a = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i10) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f11903a.b();
    }
}
