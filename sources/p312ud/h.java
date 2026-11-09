package p312ud;

import Ad.O;
import Ad.f0;
import Jd.a;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.send_money.bean.req.ScheduleTransferCreateReq;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateV2Activity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmScheduleTransferDialog;
import com.transsnet.palmpay.send_money.ui.dialog.FrequencyPickerDialog;
import com.transsnet.palmpay.send_money.ui.dialog.MonthDayPickerDialog;
import com.transsnet.palmpay.send_money.ui.dialog.WeekDayPickerDialog;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements ConfirmScheduleTransferDialog.OnConfirmTransferInfoListener, WeekDayPickerDialog.OnWeekDaySelectedListener, FrequencyPickerDialog.OnFrequencySelectedListener, MonthDayPickerDialog.OnMonthDaySelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferCreateV2Activity f42974b;

    public /* synthetic */ h(ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity, int i7) {
        this.f42973a = i7;
        this.f42974b = scheduleTransferCreateV2Activity;
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.ConfirmScheduleTransferDialog.OnConfirmTransferInfoListener
    public void onConfirmClick(ScheduleTransferCreateReq scheduleTransferCreateReq) {
        int i7 = ScheduleTransferCreateV2Activity.f33373C0;
        Postcard postcardWithBoolean = ARouter.getInstance().build("/account/authentication").withBoolean("need_pin", true);
        ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity = this.f42974b;
        scheduleTransferCreateV2Activity.getClass();
        postcardWithBoolean.withBoolean("extra_use_night_mode", true).navigation(scheduleTransferCreateV2Activity, ScheduleTransferCreateV2Activity.f33373C0);
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.FrequencyPickerDialog.OnFrequencySelectedListener
    public void onFrequencySelected(a aVar) {
        switch (this.f42973a) {
            case 2:
                ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity = this.f42974b;
                scheduleTransferCreateV2Activity.f33401v = aVar;
                scheduleTransferCreateV2Activity.x();
                break;
            default:
                ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity2 = this.f42974b;
                scheduleTransferCreateV2Activity2.f33374A = aVar;
                scheduleTransferCreateV2Activity2.v();
                break;
        }
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.MonthDayPickerDialog.OnMonthDaySelectedListener
    public void onMonthDaySelected(O o10) {
        ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity = this.f42974b;
        scheduleTransferCreateV2Activity.f33403w = o10;
        scheduleTransferCreateV2Activity.f33374A = null;
        scheduleTransferCreateV2Activity.u();
    }

    @Override // com.transsnet.palmpay.send_money.ui.dialog.WeekDayPickerDialog.OnWeekDaySelectedListener
    public void onWeekDaySelected(f0 f0Var) {
        ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity = this.f42974b;
        scheduleTransferCreateV2Activity.t = f0Var;
        scheduleTransferCreateV2Activity.f33401v = null;
        scheduleTransferCreateV2Activity.w();
    }
}
