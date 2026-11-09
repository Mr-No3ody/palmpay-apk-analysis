package p294tb;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentListActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLRepaymentListActivity f42477a;

    public i0(CLRepaymentListActivity cLRepaymentListActivity) {
        this.f42477a = cLRepaymentListActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i7);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.e(adapter);
        int itemCount = adapter.getItemCount();
        Intrinsics.e(linearLayoutManager);
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        int childCount = recyclerView.getChildCount();
        if (i7 == 0 && iFindLastVisibleItemPosition == itemCount - 1 && childCount > 0) {
            CLRepaymentListActivity cLRepaymentListActivity = this.f42477a;
            ArrayList arrayList = cLRepaymentListActivity.f29105e;
            if (arrayList == null) {
                Intrinsics.n("mData");
                throw null;
            }
            if (arrayList.size() != cLRepaymentListActivity.f29108i) {
                cLRepaymentListActivity.m(false);
            }
        }
    }
}
