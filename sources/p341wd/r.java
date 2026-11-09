package p341wd;

import M1.j;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableOrderResp;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableOrderListActivity;
import kotlin.jvm.internal.Intrinsics;
import p173ld.h;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements SwipeRefreshLayout.OnRefreshListener, OnItemClickListener, OnLoadMoreListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferForBankUnstableOrderListActivity f43437b;

    public /* synthetic */ r(ScheduleTransferForBankUnstableOrderListActivity scheduleTransferForBankUnstableOrderListActivity, int i7) {
        this.f43436a = i7;
        this.f43437b = scheduleTransferForBankUnstableOrderListActivity;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        ScheduleTransferForBankUnstableOrderListActivity scheduleTransferForBankUnstableOrderListActivity = this.f43437b;
        switch (this.f43436a) {
            case 1:
                int i10 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                ScheduleTransferForBankUnstableOrderListActivity.s((ScheduleTransferForBankUnstableOrderResp) scheduleTransferForBankUnstableOrderListActivity.o().getData().get(i7));
                break;
            default:
                int i11 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                ScheduleTransferForBankUnstableOrderListActivity.s((ScheduleTransferForBankUnstableOrderResp) ((h) scheduleTransferForBankUnstableOrderListActivity.f33478g.getValue()).getData().get(i7));
                break;
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnLoadMoreListener
    public void onLoadMore() {
        int i7 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
        ScheduleTransferForBankUnstableOrderListActivity scheduleTransferForBankUnstableOrderListActivity = this.f43437b;
        scheduleTransferForBankUnstableOrderListActivity.r().setRefreshing(false);
        scheduleTransferForBankUnstableOrderListActivity.f33476e++;
        scheduleTransferForBankUnstableOrderListActivity.p();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        int i7 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
        ScheduleTransferForBankUnstableOrderListActivity scheduleTransferForBankUnstableOrderListActivity = this.f43437b;
        scheduleTransferForBankUnstableOrderListActivity.o().getLoadMoreModule().j(false);
        scheduleTransferForBankUnstableOrderListActivity.f33476e = 1;
        scheduleTransferForBankUnstableOrderListActivity.p();
    }
}
