package p312ud;

import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferCreateResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferHomeResp;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateV2Activity;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p173ld.f;
import p220oa.h;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferCreateV2Activity f42978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferCreateV2Activity f42979c;

    public /* synthetic */ j(ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity, ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity2, int i7) {
        this.f42977a = i7;
        this.f42978b = scheduleTransferCreateV2Activity;
        this.f42979c = scheduleTransferCreateV2Activity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f42977a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof o;
                ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity = this.f42978b;
                if (z3) {
                    scheduleTransferCreateV2Activity.showLoadingDialog(true, true);
                } else {
                    boolean z8 = it instanceof p;
                    ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity2 = this.f42979c;
                    if (z8) {
                        scheduleTransferCreateV2Activity.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            ScheduleTransferHomeResp scheduleTransferHomeResp = (ScheduleTransferHomeResp) commonBeanResult.data;
                            if (scheduleTransferHomeResp != null) {
                                List<ScheduleTransferHomeResp.Payment> payTypeList = scheduleTransferHomeResp.getPayTypeList();
                                if (payTypeList != null && !payTypeList.isEmpty()) {
                                    List<ScheduleTransferHomeResp.Payment> payTypeList2 = scheduleTransferHomeResp.getPayTypeList();
                                    Intrinsics.e(payTypeList2);
                                    payTypeList2.get(0).setDefaultOption(Boolean.TRUE);
                                    List<ScheduleTransferHomeResp.Payment> payTypeList3 = scheduleTransferHomeResp.getPayTypeList();
                                    Intrinsics.e(payTypeList3);
                                    scheduleTransferCreateV2Activity2.f33380L = payTypeList3.get(0).getPaymentType();
                                }
                                ((f) scheduleTransferCreateV2Activity2.f33375A0.getValue()).setList(scheduleTransferHomeResp.getPayTypeList());
                            }
                        } else {
                            h.x(scheduleTransferCreateV2Activity2, commonBeanResult.getRespMsg());
                        }
                    } else if (it instanceof m) {
                        scheduleTransferCreateV2Activity.showLoadingDialog(false, true);
                    } else {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        scheduleTransferCreateV2Activity.showLoadingDialog(false, true);
                        n nVar = (n) it;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        h.x(scheduleTransferCreateV2Activity2, nVar.f27358a);
                    }
                }
                return Unit.f38893a;
            default:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z10 = it2 instanceof o;
                ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity3 = this.f42978b;
                if (z10) {
                    scheduleTransferCreateV2Activity3.showLoadingDialog(true, true);
                } else {
                    boolean z11 = it2 instanceof p;
                    ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity4 = this.f42979c;
                    if (z11) {
                        scheduleTransferCreateV2Activity3.showLoadingDialog(false, true);
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it2).f27360a;
                        if (commonBeanResult2.isSuccess()) {
                            ScheduleTransferCreateResp scheduleTransferCreateResp = (ScheduleTransferCreateResp) commonBeanResult2.data;
                            if (scheduleTransferCreateResp != null) {
                                ARouter.getInstance().build("/sm/schedule_transfer_create_result").withParcelable("extra_data", scheduleTransferCreateResp).navigation();
                            }
                        } else {
                            h.x(scheduleTransferCreateV2Activity4, commonBeanResult2.getRespMsg());
                        }
                    } else if (it2 instanceof m) {
                        scheduleTransferCreateV2Activity3.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        scheduleTransferCreateV2Activity3.showLoadingDialog(false, true);
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                        h.x(scheduleTransferCreateV2Activity4, ((n) it2).f27358a);
                    }
                }
                return Unit.f38893a;
        }
    }
}
