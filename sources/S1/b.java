package S1;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8639a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.LayoutManager f8640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f8641c;

    public /* synthetic */ b(c cVar, RecyclerView.LayoutManager layoutManager) {
        this.f8641c = cVar;
        this.f8640b = layoutManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8639a) {
            case 0:
                c this$0 = this.f8641c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                RecyclerView.LayoutManager manager = this.f8640b;
                Intrinsics.checkNotNullParameter(manager, "$manager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) manager;
                this$0.getClass();
                if (linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1 != this$0.f8642a.getItemCount() || linearLayoutManager.findFirstCompletelyVisibleItemPosition() != 0) {
                    this$0.f8644c = true;
                }
                break;
            default:
                RecyclerView.LayoutManager manager2 = this.f8640b;
                Intrinsics.checkNotNullParameter(manager2, "$manager");
                c this$1 = this.f8641c;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) manager2;
                int spanCount = staggeredGridLayoutManager.getSpanCount();
                int[] iArr = new int[spanCount];
                staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(iArr);
                this$1.getClass();
                int i7 = -1;
                if (spanCount != 0) {
                    int i10 = 0;
                    while (i10 < spanCount) {
                        int i11 = iArr[i10];
                        i10++;
                        if (i11 > i7) {
                            i7 = i11;
                        }
                    }
                }
                if (i7 + 1 != this$1.f8642a.getItemCount()) {
                    this$1.f8644c = true;
                }
                break;
        }
    }

    public /* synthetic */ b(RecyclerView.LayoutManager layoutManager, c cVar) {
        this.f8640b = layoutManager;
        this.f8641c = cVar;
    }
}
