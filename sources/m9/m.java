package m9;

import C0.G;
import android.content.Context;
import androidx.fragment.app.E;
import com.transsnet.palmpay.airtime.ui.dialog.WeekAndDaySelectDialog;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpEditTaskFragment;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpEditTaskFragment f39573b;

    public /* synthetic */ m(ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment, int i7) {
        this.f39572a = i7;
        this.f39573b = scheduleTopUpEditTaskFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment = this.f39573b;
        switch (this.f39572a) {
            case 0:
                KProperty[] kPropertyArr = ScheduleTopUpEditTaskFragment.f26566Y;
                Context contextRequireContext = scheduleTopUpEditTaskFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                WeekAndDaySelectDialog weekAndDaySelectDialog = new WeekAndDaySelectDialog(contextRequireContext);
                weekAndDaySelectDialog.setCallBack(new p(scheduleTopUpEditTaskFragment));
                return weekAndDaySelectDialog;
            default:
                KProperty[] kPropertyArr2 = ScheduleTopUpEditTaskFragment.f26566Y;
                E activity = scheduleTopUpEditTaskFragment.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                G.u(MessageEvent.EVENT_SCHEDULE_LIST_REFRESH, org.greenrobot.eventbus.c.b());
                return Unit.f38893a;
        }
    }
}
