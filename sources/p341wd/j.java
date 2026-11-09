package p341wd;

import Kd.B;
import O6.c;
import O6.d;
import android.view.View;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableOrderResp;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableDetailActivity;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferForBankUnstableViewModel;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferForBankUnstableDetailActivity f43422b;

    public /* synthetic */ j(ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity, int i7) {
        this.f43421a = i7;
        this.f43422b = scheduleTransferForBankUnstableDetailActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f43421a) {
            case 0:
                this.f43422b.onBackPressed();
                break;
            case 1:
                ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity = this.f43422b;
                ScheduleTransferForBankUnstableOrderResp scheduleTransferForBankUnstableOrderResp = scheduleTransferForBankUnstableDetailActivity.f33440j;
                if (scheduleTransferForBankUnstableOrderResp != null) {
                    ScheduleTransferForBankUnstableViewModel scheduleTransferForBankUnstableViewModel = (ScheduleTransferForBankUnstableViewModel) scheduleTransferForBankUnstableDetailActivity.l();
                    String bookNo = scheduleTransferForBankUnstableOrderResp.getBookNo();
                    scheduleTransferForBankUnstableViewModel.getClass();
                    f.s(scheduleTransferForBankUnstableViewModel, new B(bookNo, null), scheduleTransferForBankUnstableViewModel.f33997j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                break;
            default:
                ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity2 = this.f43422b;
                c cVar = new c(scheduleTransferForBankUnstableDetailActivity2);
                cVar.f6596b = d.f("Cancel the Scheduled?");
                cVar.f6598d = "Your money will only be deducted once bank service is restored.";
                cVar.f6601g = "Not Now";
                cVar.f6603i = null;
                j jVar = new j(scheduleTransferForBankUnstableDetailActivity2, 1);
                cVar.f6600f = "Yes, cancel";
                cVar.f6602h = jVar;
                cVar.g();
                break;
        }
    }
}
