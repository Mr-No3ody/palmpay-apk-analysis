package p312ud;

import Kd.C0392l0;
import M1.j;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferSubOrderResp;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferOrderDetailActivity;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferViewModel;
import kotlin.jvm.internal.Intrinsics;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements OnItemClickListener, OnLoadMoreListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferOrderDetailActivity f42983a;

    public /* synthetic */ m(ScheduleTransferOrderDetailActivity scheduleTransferOrderDetailActivity) {
        this.f42983a = scheduleTransferOrderDetailActivity;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        int i10 = ScheduleTransferOrderDetailActivity.f33409p;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        ARouter.getInstance().build("/smorder/detail").withString("orderId", ((ScheduleTransferSubOrderResp) this.f42983a.n().getData().get(i7)).getOrderNo()).navigation();
    }

    @Override // com.chad.library.adapter.base.listener.OnLoadMoreListener
    public void onLoadMore() {
        ScheduleTransferOrderDetailActivity scheduleTransferOrderDetailActivity = this.f42983a;
        String str = scheduleTransferOrderDetailActivity.f33410d;
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str != null) {
                ScheduleTransferViewModel scheduleTransferViewModel = (ScheduleTransferViewModel) scheduleTransferOrderDetailActivity.l();
                int i7 = scheduleTransferOrderDetailActivity.f33411e + 1;
                scheduleTransferOrderDetailActivity.f33411e = i7;
                scheduleTransferViewModel.getClass();
                f.s(scheduleTransferViewModel, new C0392l0(i7, str, null), scheduleTransferViewModel.f34018p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
    }
}
