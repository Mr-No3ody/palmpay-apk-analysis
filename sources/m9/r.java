package m9;

import Rd.d0;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemRsp;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpEditTaskFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39582a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpEditTaskFragment f39583b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment) {
        super(1);
        this.f39583b = scheduleTopUpEditTaskFragment;
    }

    @Override // Of.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        List<ScheduleTopUpAmountItemBean> month;
        ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment = this.f39583b;
        int i7 = this.f39582a;
        Intrinsics.checkNotNullParameter(property, "property");
        switch (i7) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                ScheduleTopUpAmountItemRsp scheduleTopUpAmountItemRsp = scheduleTopUpEditTaskFragment.f26568B;
                if (scheduleTopUpAmountItemRsp != null) {
                    List<ScheduleTopUpAmountItemBean> week = scheduleTopUpAmountItemRsp.getWeek();
                    if ((week == null || !(!week.isEmpty())) && ((month = scheduleTopUpAmountItemRsp.getMonth()) == null || !(!month.isEmpty()))) {
                        scheduleTopUpAmountItemRsp = null;
                    }
                    if (scheduleTopUpAmountItemRsp != null) {
                        if (((Number) scheduleTopUpEditTaskFragment.f26570H.getValue(scheduleTopUpEditTaskFragment, ScheduleTopUpEditTaskFragment.f26566Y[1])).intValue() != -1) {
                            ScheduleTopUpEditTaskFragment.u(scheduleTopUpEditTaskFragment, iIntValue == 1 ? scheduleTopUpAmountItemRsp.getWeek() : scheduleTopUpAmountItemRsp.getMonth());
                        }
                    }
                }
                ScheduleTopUpEditTaskFragment.u(scheduleTopUpEditTaskFragment, null);
                break;
            default:
                int iIntValue2 = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                KProperty[] kPropertyArr = ScheduleTopUpEditTaskFragment.f26566Y;
                if (((Number) scheduleTopUpEditTaskFragment.f26569C.getValue(scheduleTopUpEditTaskFragment, ScheduleTopUpEditTaskFragment.f26566Y[0])).intValue() != 1) {
                    d0 d0Var = (d0) scheduleTopUpEditTaskFragment.f27335j;
                    if (d0Var != null) {
                        d0Var.f8257i.setText(CommonViewExtKt.toDayOfMonthByIndex(iIntValue2) + " of Month");
                    }
                } else {
                    d0 d0Var2 = (d0) scheduleTopUpEditTaskFragment.f27335j;
                    if (d0Var2 != null) {
                        d0Var2.f8257i.setText(CommonViewExtKt.toDayOfWeekByIndex(iIntValue2));
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Integer num, ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment) {
        super(num);
        this.f39583b = scheduleTopUpEditTaskFragment;
    }
}
