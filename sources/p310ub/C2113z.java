package p310ub;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcBillHistoryActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ub.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2113z extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcBillHistoryActivity f42953a;

    public C2113z(OcBillHistoryActivity ocBillHistoryActivity) {
        this.f42953a = ocBillHistoryActivity;
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
            OcBillHistoryActivity ocBillHistoryActivity = this.f42953a;
            ArrayList arrayList = ocBillHistoryActivity.f29359e;
            if (arrayList == null) {
                Intrinsics.n("mData");
                throw null;
            }
            if (arrayList.size() != ocBillHistoryActivity.f29362i) {
                ocBillHistoryActivity.m(false);
            }
        }
    }
}
