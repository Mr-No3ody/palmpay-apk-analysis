package p341wd;

import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableOrderResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferBankChannelInfoResp;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableHomeActivity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateScheduleTransferDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements ConfirmDuplicateScheduleTransferDialog.OnConfirmDuplicateScheduleTransferListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43433a;

    public p(ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity) {
        this.f43433a = scheduleTransferForBankUnstableHomeActivity;
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateScheduleTransferDialog.OnConfirmDuplicateScheduleTransferListener
    public final void onNegativeClick(View view) {
        ScheduleTransferForBankUnstableOrderResp bookTransferDetail;
        Intrinsics.checkNotNullParameter(view, "view");
        TransferBankChannelInfoResp transferBankChannelInfoResp = this.f43433a.f33467u0;
        if (transferBankChannelInfoResp == null || (bookTransferDetail = transferBankChannelInfoResp.getBookTransferDetail()) == null) {
            return;
        }
        ARouter.getInstance().build("/sm/schedule_transfer_for_bank_unstable_detail").withString("orderId", bookTransferDetail.getBookNo()).navigation();
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateScheduleTransferDialog.OnConfirmDuplicateScheduleTransferListener
    public final void onPositiveClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i7 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
        this.f43433a.p();
    }
}
