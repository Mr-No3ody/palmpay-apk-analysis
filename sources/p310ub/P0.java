package p310ub;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepaidListActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class P0 extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcRepaidListActivity f42781a;

    public P0(OcRepaidListActivity ocRepaidListActivity) {
        this.f42781a = ocRepaidListActivity;
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
            OcRepaidListActivity ocRepaidListActivity = this.f42781a;
            ArrayList arrayList = ocRepaidListActivity.f29699g;
            if (arrayList == null) {
                Intrinsics.n("mData");
                throw null;
            }
            if (arrayList.size() != ocRepaidListActivity.f29703p) {
                ocRepaidListActivity.m(false);
            }
        }
    }
}
