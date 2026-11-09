package m9;

import Rd.c0;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemRsp;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import face.security.device.api.FaceSecCode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpAddTaskFragment f39569b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment, int i7) {
        super(1);
        this.f39568a = i7;
        switch (i7) {
            case 1:
                this.f39569b = scheduleTopUpAddTaskFragment;
                super(1);
                break;
            default:
                this.f39569b = scheduleTopUpAddTaskFragment;
                break;
        }
    }

    @Override // Of.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        List<ScheduleTopUpAmountItemBean> month;
        ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = this.f39569b;
        int i7 = this.f39568a;
        Intrinsics.checkNotNullParameter(property, "property");
        switch (i7) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                ScheduleTopUpAmountItemRsp scheduleTopUpAmountItemRsp = scheduleTopUpAddTaskFragment.f26565w;
                if (scheduleTopUpAmountItemRsp != null) {
                    List<ScheduleTopUpAmountItemBean> week = scheduleTopUpAmountItemRsp.getWeek();
                    if ((week == null || week.isEmpty()) && ((month = scheduleTopUpAmountItemRsp.getMonth()) == null || month.isEmpty())) {
                        scheduleTopUpAmountItemRsp = null;
                    }
                    if (scheduleTopUpAmountItemRsp != null) {
                        ScheduleTopUpAddTaskFragment.v(scheduleTopUpAddTaskFragment, iIntValue == 1 ? scheduleTopUpAmountItemRsp.getWeek() : scheduleTopUpAmountItemRsp.getMonth());
                    }
                }
                ScheduleTopUpAddTaskFragment.v(scheduleTopUpAddTaskFragment, null);
                break;
            default:
                int iIntValue2 = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                if (((Number) scheduleTopUpAddTaskFragment.f26550A.getValue(scheduleTopUpAddTaskFragment, ScheduleTopUpAddTaskFragment.f26549q0[0])).intValue() != 1) {
                    c0 c0Var = (c0) scheduleTopUpAddTaskFragment.f27335j;
                    if (c0Var != null) {
                        c0Var.t.setText(CommonViewExtKt.toDayOfMonthByIndex(iIntValue2) + " of Month");
                    }
                } else {
                    if (iIntValue2 > 10000) {
                        iIntValue2 -= FaceSecCode.SC_SUCCESS;
                    }
                    c0 c0Var2 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                    if (c0Var2 != null) {
                        c0Var2.t.setText(String.valueOf(CommonViewExtKt.toDayOfWeekByIndex(iIntValue2)));
                    }
                }
                break;
        }
    }
}
