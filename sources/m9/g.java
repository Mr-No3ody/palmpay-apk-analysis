package m9;

import Rd.c0;
import androidx.constraintlayout.widget.Group;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemRsp;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpRecommendBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpRecommendResp;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.QueryMobileWalletTypeByPhoneRsp;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpAddTaskFragment f39561b;

    public /* synthetic */ g(ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment, int i7) {
        this.f39560a = i7;
        this.f39561b = scheduleTopUpAddTaskFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ScheduleTopUpRecommendResp scheduleTopUpRecommendResp;
        Group group;
        Group group2;
        ScheduleTopUpAmountItemRsp scheduleTopUpAmountItemRsp;
        List<ScheduleTopUpAmountItemBean> month;
        List<ScheduleTopUpAmountItemBean> week;
        Group group3;
        ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = this.f39561b;
        switch (this.f39560a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        QueryMobileWalletTypeByPhoneRsp queryMobileWalletTypeByPhoneRsp = (QueryMobileWalletTypeByPhoneRsp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (queryMobileWalletTypeByPhoneRsp.isSuccess()) {
                            ScheduleTopUpAddTaskFragment.u(scheduleTopUpAddTaskFragment, queryMobileWalletTypeByPhoneRsp.operatorName);
                        } else {
                            ScheduleTopUpAddTaskFragment.u(scheduleTopUpAddTaskFragment, "");
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        nVar.getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonBeanResult.isSuccess() && (scheduleTopUpRecommendResp = (ScheduleTopUpRecommendResp) commonBeanResult.data) != null) {
                            List<ScheduleTopUpRecommendBean> phones = scheduleTopUpRecommendResp.getPhones();
                            if (phones == null || phones.isEmpty()) {
                                KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                                c0 c0Var = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                if (c0Var != null) {
                                    p220oa.h.c(c0Var.f8229d);
                                }
                            } else {
                                KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                                c0 c0Var2 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                if (c0Var2 != null) {
                                    p220oa.h.C(c0Var2.f8229d);
                                }
                                ((p155k9.l) scheduleTopUpAddTaskFragment.f26560k0.getValue()).setList(scheduleTopUpRecommendResp.getPhones());
                            }
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        if (commonBeanResult2.isSuccess()) {
                            KProperty[] kPropertyArr3 = ScheduleTopUpAddTaskFragment.f26549q0;
                            c0 c0Var3 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                            if (c0Var3 != null && (group3 = c0Var3.f8228c) != null) {
                                p220oa.h.C(group3);
                            }
                            ScheduleTopUpAmountItemRsp scheduleTopUpAmountItemRsp2 = (ScheduleTopUpAmountItemRsp) commonBeanResult2.data;
                            scheduleTopUpAddTaskFragment.f26565w = scheduleTopUpAmountItemRsp2;
                            if ((scheduleTopUpAmountItemRsp2 == null || (week = scheduleTopUpAmountItemRsp2.getWeek()) == null || !(!week.isEmpty())) && (scheduleTopUpAmountItemRsp = (ScheduleTopUpAmountItemRsp) commonBeanResult2.data) != null && (month = scheduleTopUpAmountItemRsp.getMonth()) != null && (!month.isEmpty())) {
                                ScheduleTopUpAddTaskFragment.w(scheduleTopUpAddTaskFragment, 2);
                                scheduleTopUpAddTaskFragment.D(CommonViewExtKt.getDayIndexOfMonth(System.currentTimeMillis()));
                            } else {
                                ScheduleTopUpAddTaskFragment.w(scheduleTopUpAddTaskFragment, 1);
                                scheduleTopUpAddTaskFragment.D(CommonViewExtKt.getDayIndexOfWeek(System.currentTimeMillis()));
                            }
                        } else {
                            KProperty[] kPropertyArr4 = ScheduleTopUpAddTaskFragment.f26549q0;
                            c0 c0Var4 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                            if (c0Var4 != null && (group2 = c0Var4.f8228c) != null) {
                                p220oa.h.c(group2);
                            }
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it3).getClass();
                        KProperty[] kPropertyArr5 = ScheduleTopUpAddTaskFragment.f26549q0;
                        c0 c0Var5 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                        if (c0Var5 != null && (group = c0Var5.f8228c) != null) {
                            p220oa.h.c(group);
                        }
                    }
                }
                return Unit.f38893a;
        }
    }
}
