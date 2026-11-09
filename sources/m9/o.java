package m9;

import C0.G;
import Pa.r0;
import Rd.d0;
import V8.w;
import android.text.TextUtils;
import androidx.fragment.app.E;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpEditTaskFragment;
import com.transsnet.palmpay.airtime.viewmodel.ScheduleTopUpViewModel;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpEditTaskFragment f39577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpEditTaskFragment f39578c;

    public /* synthetic */ o(ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment, ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment2, int i7) {
        this.f39576a = i7;
        this.f39577b = scheduleTopUpEditTaskFragment;
        this.f39578c = scheduleTopUpEditTaskFragment2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d0 d0Var;
        switch (this.f39576a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment = this.f39577b;
                if (z3) {
                    scheduleTopUpEditTaskFragment.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    scheduleTopUpEditTaskFragment.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        ScheduleTopUpTaskBean scheduleTopUpTaskBean = (ScheduleTopUpTaskBean) commonBeanResult.data;
                        ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment2 = this.f39578c;
                        scheduleTopUpEditTaskFragment2.t = scheduleTopUpTaskBean;
                        if (scheduleTopUpTaskBean != null) {
                            String strW0 = r0.w0(scheduleTopUpTaskBean.getPhone());
                            if (strW0 != null && (d0Var = (d0) scheduleTopUpEditTaskFragment2.f27335j) != null) {
                                d0Var.f8259o.setText(CommonExtKt.formatWithPhone(strW0));
                            }
                            if (!TextUtils.isEmpty(scheduleTopUpTaskBean.getBillerLogo())) {
                                d0 d0Var2 = (d0) scheduleTopUpEditTaskFragment2.f27335j;
                                r0.l1(scheduleTopUpTaskBean.getBillerLogo(), d0Var2 != null ? d0Var2.f8252c : null);
                            }
                            String billerId = !TextUtils.isEmpty(scheduleTopUpTaskBean.getBillerId()) ? scheduleTopUpTaskBean.getBillerId() : scheduleTopUpTaskBean.getOperatorCode();
                            if (billerId == null) {
                                billerId = "";
                            }
                            scheduleTopUpEditTaskFragment2.f26571L = null;
                            scheduleTopUpEditTaskFragment2.v().a(-1);
                            ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) scheduleTopUpEditTaskFragment2.f27333i;
                            if (scheduleTopUpViewModel != null) {
                                scheduleTopUpViewModel.g(billerId);
                            }
                            ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) scheduleTopUpEditTaskFragment2.f27333i;
                            com.transsnet.palmpay.core.base.l lVar = scheduleTopUpViewModel2 != null ? scheduleTopUpViewModel2.f26648v : null;
                            if (lVar != null) {
                                lVar.e(scheduleTopUpEditTaskFragment2, new p054dd.q(new w(scheduleTopUpEditTaskFragment2, 17), 13));
                            }
                        }
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    scheduleTopUpEditTaskFragment.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    scheduleTopUpEditTaskFragment.showLoadingDialog(false, true);
                    ToastUtils.showShort(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment3 = this.f39577b;
                if (z8) {
                    scheduleTopUpEditTaskFragment3.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    scheduleTopUpEditTaskFragment3.showLoadingDialog(false, true);
                    if (((CommonResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a).isSuccess()) {
                        ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment4 = this.f39578c;
                        E activity = scheduleTopUpEditTaskFragment4.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                        ToastUtils.showShort(scheduleTopUpEditTaskFragment4.getString(Pd.f.qt_turn_off_successfully), new Object[0]);
                    }
                    G.u(MessageEvent.EVENT_SCHEDULE_LIST_REFRESH, org.greenrobot.eventbus.c.b());
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    scheduleTopUpEditTaskFragment3.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    scheduleTopUpEditTaskFragment3.showLoadingDialog(false, true);
                    ToastUtils.showShort(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
