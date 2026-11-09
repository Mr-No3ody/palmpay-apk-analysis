package p382zb;

import F6.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.ui.fragment.CLRepaymentListFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zb.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2172o extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLRepaymentListFragment f44609a;

    public C2172o(CLRepaymentListFragment cLRepaymentListFragment) {
        this.f44609a = cLRepaymentListFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i7);
        CLRepaymentListFragment cLRepaymentListFragment = this.f44609a;
        d.h(cLRepaymentListFragment.f27317a, 3, "onScrollStateChanged >>>");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.e(adapter);
        int itemCount = adapter.getItemCount();
        Intrinsics.e(linearLayoutManager);
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        int childCount = recyclerView.getChildCount();
        if (i7 == 0 && iFindLastVisibleItemPosition == itemCount - 1 && childCount > 0) {
            ArrayList arrayList = cLRepaymentListFragment.f30328o;
            if (arrayList == null) {
                Intrinsics.n("mData");
                throw null;
            }
            if (arrayList.size() != cLRepaymentListFragment.f30330v) {
                cLRepaymentListFragment.t(false);
            }
        }
    }
}
