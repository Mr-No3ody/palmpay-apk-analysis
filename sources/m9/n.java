package m9;

import Pa.n0;
import Pa.r0;
import Rd.d0;
import android.view.View;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.airtime.ui.dialog.WeekAndDaySelectDialog;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpEditTaskFragment;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpEditTaskFragment f39575b;

    public /* synthetic */ n(ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment, int i7) {
        this.f39574a = i7;
        this.f39575b = scheduleTopUpEditTaskFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long price;
        ScheduleTopUpTaskBean scheduleTopUpTaskBean;
        ScheduleTopUpTaskBean scheduleTopUpTaskBean2;
        int i7 = 1;
        int i10 = 0;
        ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment = this.f39575b;
        switch (this.f39574a) {
            case 0:
                KProperty[] kPropertyArr = ScheduleTopUpEditTaskFragment.f26566Y;
                Postcard postcardBuild = ARouter.getInstance().build("/account/authentication");
                ARouter aRouter = ARouter.getInstance();
                Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                Intrinsics.e(postcardBuild);
                r0.x(aRouter, scheduleTopUpEditTaskFragment, postcardBuild, scheduleTopUpEditTaskFragment.f26575o);
                break;
            case 1:
                KProperty[] kPropertyArr2 = ScheduleTopUpEditTaskFragment.f26566Y;
                Postcard postcardBuild2 = ARouter.getInstance().build("/account/authentication");
                ARouter aRouter2 = ARouter.getInstance();
                Intrinsics.checkNotNullExpressionValue(aRouter2, "getInstance(...)");
                Intrinsics.e(postcardBuild2);
                r0.x(aRouter2, scheduleTopUpEditTaskFragment, postcardBuild2, scheduleTopUpEditTaskFragment.f26576p);
                break;
            case 2:
                KProperty[] kPropertyArr3 = ScheduleTopUpEditTaskFragment.f26566Y;
                if (!r0.U0()) {
                    O6.c cVar = new O6.c(scheduleTopUpEditTaskFragment.requireContext());
                    cVar.e(Pd.f.qt_turn_off_service);
                    cVar.b(Pd.f.qt_turn_off_service_tip);
                    cVar.d(p025ba.k.core_turn_off, new n(scheduleTopUpEditTaskFragment, i10));
                    cVar.c(p025ba.k.core_cancel, null);
                    cVar.g();
                    n0.g().l("Schedule_Top_Up_Airtime_Modify_Page_Turn_Off");
                    break;
                }
                break;
            case 3:
                KProperty[] kPropertyArr4 = ScheduleTopUpEditTaskFragment.f26566Y;
                if (!r0.U0()) {
                    ((WeekAndDaySelectDialog) scheduleTopUpEditTaskFragment.f26574X.getValue()).show();
                    n0.g().l("Schedule_Top_Up_Airtime_Modify_Page_Top_Up_Date");
                    break;
                }
                break;
            default:
                KProperty[] kPropertyArr5 = ScheduleTopUpEditTaskFragment.f26566Y;
                if (!r0.U0()) {
                    ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean = scheduleTopUpEditTaskFragment.f26571L;
                    if (scheduleTopUpAmountItemBean == null) {
                        ToastUtils.showShort(scheduleTopUpEditTaskFragment.getString(Pd.f.qt_airtime_please_select_amount_item), new Object[0]);
                    } else if (Intrinsics.c(scheduleTopUpAmountItemBean.getSuspend(), Boolean.TRUE)) {
                        ToastUtils.showShort(scheduleTopUpEditTaskFragment.getString(Pd.f.qt_airtime_this_amount_item_is_suspend), new Object[0]);
                    } else {
                        if (Intrinsics.c(scheduleTopUpEditTaskFragment.f26571L, scheduleTopUpEditTaskFragment.f26572M) && (scheduleTopUpTaskBean = scheduleTopUpEditTaskFragment.t) != null) {
                            Integer timeType = scheduleTopUpTaskBean.getTimeType();
                            KProperty<?>[] kPropertyArr6 = ScheduleTopUpEditTaskFragment.f26566Y;
                            int iIntValue = ((Number) scheduleTopUpEditTaskFragment.f26569C.getValue(scheduleTopUpEditTaskFragment, kPropertyArr6[0])).intValue();
                            if (timeType != null && timeType.intValue() == iIntValue && (scheduleTopUpTaskBean2 = scheduleTopUpEditTaskFragment.t) != null) {
                                Integer timeValue = scheduleTopUpTaskBean2.getTimeValue();
                                int iIntValue2 = ((Number) scheduleTopUpEditTaskFragment.f26570H.getValue(scheduleTopUpEditTaskFragment, kPropertyArr6[1])).intValue();
                                if (timeValue != null && timeValue.intValue() == iIntValue2) {
                                    E activity = scheduleTopUpEditTaskFragment.getActivity();
                                    if (activity != null) {
                                        activity.finish();
                                    }
                                }
                            }
                        }
                        if (scheduleTopUpEditTaskFragment.t != null) {
                            O6.c cVar2 = new O6.c(scheduleTopUpEditTaskFragment.requireContext());
                            cVar2.e(Pd.f.qt_modify_settings);
                            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean2 = scheduleTopUpEditTaskFragment.f26571L;
                            String strB = r0.B((scheduleTopUpAmountItemBean2 == null || (price = scheduleTopUpAmountItemBean2.getPrice()) == null) ? 0L : price.longValue(), false);
                            d0 d0Var = (d0) scheduleTopUpEditTaskFragment.f27335j;
                            CharSequence text = d0Var != null ? d0Var.f8257i.getText() : null;
                            d0 d0Var2 = (d0) scheduleTopUpEditTaskFragment.f27335j;
                            cVar2.f6598d = "Top up" + strB + " every " + ((Object) text) + " for " + ((Object) (d0Var2 != null ? d0Var2.f8259o.getText() : null)) + "?";
                            cVar2.d(p025ba.k.core_confirm, new n(scheduleTopUpEditTaskFragment, i7));
                            cVar2.c(p025ba.k.core_cancel, null);
                            cVar2.g();
                        }
                    }
                    n0.g().l("Schedule_Top_Up_Airtime_Modify_Page_Confirm");
                    break;
                }
                break;
        }
    }
}
