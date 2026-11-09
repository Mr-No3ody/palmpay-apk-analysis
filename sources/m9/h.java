package m9;

import Rd.c0;
import android.text.TextUtils;
import com.transsnet.palmpay.airtime.bean.QueryAirtimeV2Rsp;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.viewmodel.DataBundleRecordHistoryViewModel;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f39563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpAddTaskFragment f39564c;

    public /* synthetic */ h(com.transsnet.palmpay.core.base.l lVar, ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment, int i7) {
        this.f39562a = i7;
        this.f39563b = lVar;
        this.f39564c = scheduleTopUpAddTaskFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = this.f39564c;
        com.transsnet.palmpay.core.base.l lVar = this.f39563b;
        switch (this.f39562a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        Function0 function0 = (Function0) lVar.f27356m;
                        if (((CommonResult) ((com.transsnet.palmpay.core.base.p) it).f27360a).isSuccess()) {
                            KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                            ((DataBundleRecordHistoryViewModel) scheduleTopUpAddTaskFragment.f26557X.getValue()).d();
                            if (function0 != null) {
                                function0.invoke();
                            }
                            ToastUtils.showLong(p025ba.k.core_delete_successfully);
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        Object obj2 = lVar.f27356m;
                        QueryAirtimeV2Rsp queryAirtimeV2Rsp = (QueryAirtimeV2Rsp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        Function0 function1 = (Function0) obj2;
                        if (queryAirtimeV2Rsp.isSuccess()) {
                            List<QueryAirtimeV2Rsp.DataBean> data = queryAirtimeV2Rsp.getData();
                            KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                            if (data != null) {
                                List<QueryAirtimeV2Rsp.DataBean> list = !data.isEmpty() ? data : null;
                                if (list != null) {
                                    c0 c0Var = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                    if (c0Var != null) {
                                        ModelMobileWithIconInputLayout.initModelMobileInputLayout$default(c0Var.f8230e, scheduleTopUpAddTaskFragment.f27319c, list, new i(scheduleTopUpAddTaskFragment), BaseApplication.getCountryLocale(), null, null, null, scheduleTopUpAddTaskFragment.m(), HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR, null);
                                    }
                                    scheduleTopUpAddTaskFragment.f26555M = list;
                                    c0 c0Var2 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                    if (TextUtils.isEmpty(c0Var2 != null ? c0Var2.f8230e.getPhoneNumber() : null)) {
                                        c0 c0Var3 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                        if (c0Var3 != null) {
                                            c0Var3.f8230e.updateSelectItem(list.get(0));
                                        }
                                        scheduleTopUpAddTaskFragment.A(list.get(0));
                                    } else {
                                        c0 c0Var4 = (c0) scheduleTopUpAddTaskFragment.f27335j;
                                        scheduleTopUpAddTaskFragment.B(c0Var4 != null ? c0Var4.f8230e.getPhoneNumber() : null);
                                    }
                                }
                            }
                            if (function1 != null) {
                                function1.invoke();
                            }
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}
