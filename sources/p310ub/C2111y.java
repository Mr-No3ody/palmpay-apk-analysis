package p310ub;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillDetailActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ub.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2111y extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcBillDetailActivity f42948a;

    public C2111y(OcBillDetailActivity ocBillDetailActivity) {
        this.f42948a = ocBillDetailActivity;
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
            OcBillDetailActivity ocBillDetailActivity = this.f42948a;
            ArrayList arrayList = ocBillDetailActivity.f29353o;
            if (arrayList == null) {
                Intrinsics.n("mData");
                throw null;
            }
            if (arrayList.size() != ocBillDetailActivity.f29355v) {
                ocBillDetailActivity.m(false);
            }
        }
    }
}
