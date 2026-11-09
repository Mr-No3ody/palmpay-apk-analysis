package m9;

import com.transsnet.palmpay.airtime.ui.dialog.WeekAndDaySelectDialog;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements WeekAndDaySelectDialog.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpAddTaskFragment f39559a;

    public f(ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment) {
        this.f39559a = scheduleTopUpAddTaskFragment;
    }

    @Override // com.transsnet.palmpay.airtime.ui.dialog.WeekAndDaySelectDialog.Callback
    public final void onDataSelected(int i7, int i10) {
        KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
        ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = this.f39559a;
        scheduleTopUpAddTaskFragment.f26552C = null;
        scheduleTopUpAddTaskFragment.y().a(-1);
        ScheduleTopUpAddTaskFragment.w(scheduleTopUpAddTaskFragment, i7);
        scheduleTopUpAddTaskFragment.D(i10);
    }
}
