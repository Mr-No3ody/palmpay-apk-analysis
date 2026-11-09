package Fd;

import android.view.View;
import com.transsnet.palmpay.send_money.bean.resp.RecentlyScheduleTransferBean;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayHomeFragment f2713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecentlyScheduleTransferBean f2714c;

    public /* synthetic */ w(TransferToPalmPayHomeFragment transferToPalmPayHomeFragment, RecentlyScheduleTransferBean recentlyScheduleTransferBean, int i7) {
        this.f2712a = i7;
        this.f2713b = transferToPalmPayHomeFragment;
        this.f2714c = recentlyScheduleTransferBean;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2712a) {
            case 0:
                RecentlyScheduleTransferBean recentlyScheduleTransferBean = this.f2714c;
                String taskNo = recentlyScheduleTransferBean.getTaskNo();
                if (taskNo == null) {
                    taskNo = "";
                }
                this.f2713b.v(taskNo, recentlyScheduleTransferBean.getJumpUrl());
                break;
            default:
                String taskNo2 = this.f2714c.getTaskNo();
                if (taskNo2 == null) {
                    taskNo2 = "";
                }
                this.f2713b.v(taskNo2, null);
                break;
        }
    }
}
