package m9;

import C9.V;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.transsnet.palmpay.airtime.bean.ScheduleTopUpFAQBean;
import com.transsnet.palmpay.airtime.bean.ScheduleTopUpFAQResp;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskRsp;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpTaskListFragment;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpTaskListFragment f39586b;

    public /* synthetic */ t(ScheduleTopUpTaskListFragment scheduleTopUpTaskListFragment, int i7) {
        this.f39585a = i7;
        this.f39586b = scheduleTopUpTaskListFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ScheduleTopUpFAQResp scheduleTopUpFAQResp;
        List<ScheduleTopUpFAQBean> faqVOS;
        switch (this.f39585a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonBeanResult != null && (scheduleTopUpFAQResp = (ScheduleTopUpFAQResp) commonBeanResult.data) != null && (faqVOS = scheduleTopUpFAQResp.getFaqVOS()) != null) {
                            if (faqVOS.isEmpty()) {
                                faqVOS = null;
                            }
                            if (faqVOS != null) {
                                ScheduleTopUpTaskListFragment scheduleTopUpTaskListFragment = this.f39586b;
                                p155k9.n nVarU = scheduleTopUpTaskListFragment.u();
                                View viewInflate = LayoutInflater.from(scheduleTopUpTaskListFragment.requireContext()).inflate(Pd.d.qt_airtime_schedule_faq_header, (ViewGroup) null);
                                viewInflate.findViewById(Pd.c.ivArrowRight).setOnClickListener(new V(16, commonBeanResult, scheduleTopUpTaskListFragment));
                                Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
                                M1.j.setHeaderView$default(nVarU, viewInflate, 0, 0, 6, null);
                                scheduleTopUpTaskListFragment.u().setList(faqVOS);
                                p155k9.n nVarU2 = scheduleTopUpTaskListFragment.u();
                                if (nVarU2 != null) {
                                    nVarU2.setOnItemClickListener(new C2085k0(scheduleTopUpTaskListFragment, 24));
                                }
                            }
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        List<ScheduleTopUpTaskBean> paymentPhones = ((ScheduleTopUpTaskRsp) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a).data).getPaymentPhones();
                        if (paymentPhones != null) {
                            if (paymentPhones.isEmpty()) {
                                paymentPhones = null;
                            }
                            if (paymentPhones != null) {
                                this.f39586b.v().setList(paymentPhones);
                            }
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}
