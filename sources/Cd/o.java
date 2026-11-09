package Cd;

import Kd.C0386j0;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferOrderResp;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferHomeFragment;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements OnItemClickListener, SwipeRefreshLayout.OnRefreshListener, OnLoadMoreListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferHomeFragment f1379b;

    public /* synthetic */ o(ScheduleTransferHomeFragment scheduleTransferHomeFragment, int i7) {
        this.f1378a = i7;
        this.f1379b = scheduleTransferHomeFragment;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        ScheduleTransferHomeFragment scheduleTransferHomeFragment = this.f1379b;
        switch (this.f1378a) {
            case 0:
                ScheduleTransferHomeFragment.a aVar = ScheduleTransferHomeFragment.f33695k0;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                ARouter.getInstance().build("/sm/schedule_transfer_order_detail").withString("orderId", ((ScheduleTransferOrderResp) scheduleTransferHomeFragment.u().getItem(i7)).getTaskNo()).navigation();
                break;
            default:
                ScheduleTransferHomeFragment.a aVar2 = ScheduleTransferHomeFragment.f33695k0;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                ARouter.getInstance().build("/sm/schedule_transfer_order_detail").withString("orderId", ((ScheduleTransferOrderResp) scheduleTransferHomeFragment.t().getItem(i7)).getTaskNo()).navigation();
                break;
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnLoadMoreListener
    public void onLoadMore() {
        ScheduleTransferHomeFragment.a aVar = ScheduleTransferHomeFragment.f33695k0;
        ScheduleTransferHomeFragment scheduleTransferHomeFragment = this.f1379b;
        ScheduleTransferViewModel scheduleTransferViewModel = (ScheduleTransferViewModel) scheduleTransferHomeFragment.f27333i;
        if (scheduleTransferViewModel != null) {
            int i7 = scheduleTransferHomeFragment.f33709v + 1;
            scheduleTransferHomeFragment.f33709v = i7;
            p140j8.f.s(scheduleTransferViewModel, new C0386j0(i7, null), scheduleTransferViewModel.f34016j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        ScheduleTransferHomeFragment.a aVar = ScheduleTransferHomeFragment.f33695k0;
        ScheduleTransferHomeFragment scheduleTransferHomeFragment = this.f1379b;
        scheduleTransferHomeFragment.f33709v = 1;
        ScheduleTransferViewModel scheduleTransferViewModel = (ScheduleTransferViewModel) scheduleTransferHomeFragment.f27333i;
        if (scheduleTransferViewModel != null) {
            p140j8.f.s(scheduleTransferViewModel, new C0386j0(1, null), scheduleTransferViewModel.f34016j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }
}
