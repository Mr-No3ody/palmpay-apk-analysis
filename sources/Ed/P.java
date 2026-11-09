package Ed;

import android.view.View;
import com.transsnet.palmpay.send_money.bean.resp.RecentlyScheduleTransferBean;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class P implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankHomeFragment f2338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecentlyScheduleTransferBean f2339c;

    public /* synthetic */ P(TransferToBankHomeFragment transferToBankHomeFragment, RecentlyScheduleTransferBean recentlyScheduleTransferBean, int i7) {
        this.f2337a = i7;
        this.f2338b = transferToBankHomeFragment;
        this.f2339c = recentlyScheduleTransferBean;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2337a) {
            case 0:
                RecentlyScheduleTransferBean recentlyScheduleTransferBean = this.f2339c;
                String taskNo = recentlyScheduleTransferBean.getTaskNo();
                if (taskNo == null) {
                    taskNo = "";
                }
                this.f2338b.u(taskNo, recentlyScheduleTransferBean.getJumpUrl());
                break;
            default:
                String taskNo2 = this.f2339c.getTaskNo();
                if (taskNo2 == null) {
                    taskNo2 = "";
                }
                this.f2338b.u(taskNo2, null);
                break;
        }
    }
}
