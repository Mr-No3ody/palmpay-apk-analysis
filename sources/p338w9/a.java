package p338w9;

import Xd.x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f43338a;

    public a(x xVar) {
        this.f43338a = xVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i7);
        if (i7 == 0) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int iFindFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
            if (iFindFirstCompletelyVisibleItemPosition != -1) {
                x xVar = this.f43338a;
                xVar.f11183b = iFindFirstCompletelyVisibleItemPosition;
                xVar.notifyDataSetChanged();
            }
        }
    }
}
