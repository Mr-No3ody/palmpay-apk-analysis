package p312ud;

import Ad.O;
import Ad.f0;
import Jd.a;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.send_money.bean.req.ScheduleTransferCreateReq;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateActivity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmScheduleTransferDialog;
import com.transsnet.palmpay.send_money.ui.dialog.FrequencyPickerDialog;
import com.transsnet.palmpay.send_money.ui.dialog.MonthDayPickerDialog;
import com.transsnet.palmpay.send_money.ui.dialog.WeekDayPickerDialog;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements ConfirmScheduleTransferDialog.OnConfirmTransferInfoListener, WeekDayPickerDialog.OnWeekDaySelectedListener, FrequencyPickerDialog.OnFrequencySelectedListener, MonthDayPickerDialog.OnMonthDaySelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferCreateActivity f42963b;

    public /* synthetic */ b(ScheduleTransferCreateActivity scheduleTransferCreateActivity, int i7) {
        this.f42962a = i7;
        this.f42963b = scheduleTransferCreateActivity;
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.ConfirmScheduleTransferDialog.OnConfirmTransferInfoListener
    public void onConfirmClick(ScheduleTransferCreateReq scheduleTransferCreateReq) {
        int i7 = ScheduleTransferCreateActivity.f33322O0;
        Postcard postcardWithBoolean = ARouter.getInstance().build("/account/authentication").withBoolean("need_pin", true);
        ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42963b;
        scheduleTransferCreateActivity.getClass();
        postcardWithBoolean.withBoolean("extra_use_night_mode", true).navigation(scheduleTransferCreateActivity, ScheduleTransferCreateActivity.f33322O0);
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.FrequencyPickerDialog.OnFrequencySelectedListener
    public void onFrequencySelected(a aVar) {
        switch (this.f42962a) {
            case 2:
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42963b;
                scheduleTransferCreateActivity.f33357p0 = aVar;
                scheduleTransferCreateActivity.z();
                break;
            default:
                ScheduleTransferCreateActivity scheduleTransferCreateActivity2 = this.f42963b;
                scheduleTransferCreateActivity2.f33359r0 = aVar;
                scheduleTransferCreateActivity2.x();
                break;
        }
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.MonthDayPickerDialog.OnMonthDaySelectedListener
    public void onMonthDaySelected(O o10) {
        ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42963b;
        scheduleTransferCreateActivity.f33358q0 = o10;
        scheduleTransferCreateActivity.f33359r0 = null;
        scheduleTransferCreateActivity.w();
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.WeekDayPickerDialog.OnWeekDaySelectedListener
    public void onWeekDaySelected(f0 f0Var) {
        ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42963b;
        scheduleTransferCreateActivity.f33354k0 = f0Var;
        scheduleTransferCreateActivity.f33357p0 = null;
        scheduleTransferCreateActivity.y();
    }
}
