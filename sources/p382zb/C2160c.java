package p382zb;

import F6.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.ui.fragment.CLBorrowListFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zb.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2160c extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLBorrowListFragment f44569a;

    public C2160c(CLBorrowListFragment cLBorrowListFragment) {
        this.f44569a = cLBorrowListFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i7);
        CLBorrowListFragment cLBorrowListFragment = this.f44569a;
        d.h(cLBorrowListFragment.f27317a, 3, "onScrollStateChanged >>>");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.e(adapter);
        int itemCount = adapter.getItemCount();
        Intrinsics.e(linearLayoutManager);
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        int childCount = recyclerView.getChildCount();
        if (i7 == 0 && iFindLastVisibleItemPosition == itemCount - 1 && childCount > 0) {
            ArrayList arrayList = cLBorrowListFragment.f30235o;
            if (arrayList == null) {
                Intrinsics.n("mData");
                throw null;
            }
            if (arrayList.size() != cLBorrowListFragment.f30237v) {
                cLBorrowListFragment.u(false);
            }
        }
    }
}
