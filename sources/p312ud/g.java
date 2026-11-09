package p312ud;

import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements PpAmountEditText.OnTextInputListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferCreateActivity f42972a;

    public g(ScheduleTransferCreateActivity scheduleTransferCreateActivity) {
        this.f42972a = scheduleTransferCreateActivity;
    }

    @Override // com.palmpay.lib.ui.edit.PpAmountEditText.OnTextInputListener
    public final void OnTextInput(String str) {
        ScheduleTransferCreateActivity.m(this.f42972a);
    }
}
