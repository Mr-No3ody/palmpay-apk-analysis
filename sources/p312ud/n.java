package p312ud;

import Kd.C0371e0;
import O6.c;
import O6.d;
import android.view.View;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferOrderResp;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferOrderDetailActivity;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferViewModel;
import p025ba.k;
import p140j8.f;
import p310ub.h1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferOrderDetailActivity f42985b;

    public /* synthetic */ n(ScheduleTransferOrderDetailActivity scheduleTransferOrderDetailActivity, int i7) {
        this.f42984a = i7;
        this.f42985b = scheduleTransferOrderDetailActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ScheduleTransferOrderDetailActivity scheduleTransferOrderDetailActivity = this.f42985b;
        switch (this.f42984a) {
            case 0:
                int i7 = ScheduleTransferOrderDetailActivity.f33409p;
                c cVar = new c(scheduleTransferOrderDetailActivity);
                cVar.f6596b = d.f("The plan is not end yet");
                cVar.f6598d = "Are you sure you want to cancel the plan?";
                String string = scheduleTransferOrderDetailActivity.getString(k.core_cancel);
                n nVar = new n(scheduleTransferOrderDetailActivity, 1);
                cVar.f6601g = string;
                cVar.f6603i = nVar;
                String string2 = scheduleTransferOrderDetailActivity.getString(k.core_no);
                h1 h1Var = new h1(8);
                cVar.f6600f = string2;
                cVar.f6602h = h1Var;
                cVar.g();
                break;
            default:
                ScheduleTransferOrderResp scheduleTransferOrderResp = scheduleTransferOrderDetailActivity.f33412f;
                if (scheduleTransferOrderResp != null) {
                    ScheduleTransferViewModel scheduleTransferViewModel = (ScheduleTransferViewModel) scheduleTransferOrderDetailActivity.l();
                    String taskNo = scheduleTransferOrderResp.getTaskNo();
                    scheduleTransferViewModel.getClass();
                    f.s(scheduleTransferViewModel, new C0371e0(taskNo, null), scheduleTransferViewModel.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                break;
        }
    }
}
