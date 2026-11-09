package m9;

import com.transsnet.palmpay.airtime.ui.dialog.WeekAndDaySelectDialog;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpEditTaskFragment;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements WeekAndDaySelectDialog.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpEditTaskFragment f39579a;

    public p(ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment) {
        this.f39579a = scheduleTopUpEditTaskFragment;
    }

    @Override // com.transsnet.palmpay.airtime.ui.dialog.WeekAndDaySelectDialog.Callback
    public final void onDataSelected(int i7, int i10) {
        KProperty[] kPropertyArr = ScheduleTopUpEditTaskFragment.f26566Y;
        ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment = this.f39579a;
        scheduleTopUpEditTaskFragment.f26571L = null;
        scheduleTopUpEditTaskFragment.v().a(-1);
        scheduleTopUpEditTaskFragment.w(i7);
        scheduleTopUpEditTaskFragment.f26570H.setValue(scheduleTopUpEditTaskFragment, ScheduleTopUpEditTaskFragment.f26566Y[1], Integer.valueOf(i10));
    }
}
