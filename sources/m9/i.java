package m9;

import Pa.n0;
import com.transsnet.palmpay.airtime.bean.QueryAirtimeV2Rsp;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import com.transsnet.palmpay.custom_view.input.OnOperatorItemClickListener;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements OnOperatorItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpAddTaskFragment f39565a;

    public i(ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment) {
        this.f39565a = scheduleTopUpAddTaskFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnOperatorItemClickListener
    public final void onOperatorItemClick(Object obj) {
        QueryAirtimeV2Rsp.DataBean item = (QueryAirtimeV2Rsp.DataBean) obj;
        Intrinsics.checkNotNullParameter(item, "item");
        KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
        this.f39565a.A(item);
        n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Choose_Biller");
    }
}
