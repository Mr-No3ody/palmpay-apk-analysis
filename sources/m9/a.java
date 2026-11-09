package m9;

import C0.G;
import Pa.r0;
import Rd.c0;
import android.content.Context;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.airtime.bean.req.AddScheduleTopUpTaskReq;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpConfigInfoBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import com.transsnet.palmpay.airtime.viewmodel.ScheduleTopUpViewModel;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.TopUpRecordItem;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import o9.K;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTopUpAddTaskFragment f39552b;

    public /* synthetic */ a(ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment, int i7) {
        this.f39551a = i7;
        this.f39552b = scheduleTopUpAddTaskFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String paymentMethod;
        c0 c0Var;
        String str = "";
        ScheduleTopUpAddTaskFragment scheduleTopUpAddTaskFragment = this.f39552b;
        switch (this.f39551a) {
            case 0:
                CommonBeanResult rsp = (CommonBeanResult) obj2;
                KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                Intrinsics.checkNotNullParameter(rsp, "rsp");
                if (rsp.isSuccess()) {
                    Postcard postcardBuild = ARouter.getInstance().build("/airtime/airtime_schedule_topup_task_status");
                    ScheduleTopUpConfigInfoBean scheduleTopUpConfigInfoBean = (ScheduleTopUpConfigInfoBean) ((K) scheduleTopUpAddTaskFragment.f26562p.getValue()).f40121d.d();
                    if (scheduleTopUpConfigInfoBean != null && (paymentMethod = scheduleTopUpConfigInfoBean.getPaymentMethod()) != null) {
                        str = paymentMethod;
                    }
                    Postcard postcardWithString = postcardBuild.withString("extra_data", str);
                    ScheduleTopUpTaskBean scheduleTopUpTaskBean = (ScheduleTopUpTaskBean) rsp.data;
                    postcardWithString.withString("extra_data_1", scheduleTopUpTaskBean != null ? scheduleTopUpTaskBean.getId() : null).navigation();
                    E activity = scheduleTopUpAddTaskFragment.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    G.u(MessageEvent.EVENT_SCHEDULE_LIST_REFRESH, org.greenrobot.eventbus.c.b());
                } else {
                    ToastUtils.showShort(rsp.getRespMsg(), new Object[0]);
                }
                break;
            case 1:
                AddScheduleTopUpTaskReq addScheduleTopUpTaskReq = (AddScheduleTopUpTaskReq) obj;
                CommonResult rsp2 = (CommonResult) obj2;
                KProperty[] kPropertyArr2 = ScheduleTopUpAddTaskFragment.f26549q0;
                Intrinsics.checkNotNullParameter(rsp2, "rsp");
                if (rsp2.isSuccess()) {
                    Postcard postcardBuild2 = ARouter.getInstance().build("/account/authentication");
                    ARouter aRouter = ARouter.getInstance();
                    Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                    Intrinsics.e(postcardBuild2);
                    r0.x(aRouter, scheduleTopUpAddTaskFragment, postcardBuild2, scheduleTopUpAddTaskFragment.f26561o);
                } else if ("CFRONT_800101".equalsIgnoreCase(rsp2.getRespCode())) {
                    Context context = scheduleTopUpAddTaskFragment.getContext();
                    if (context != null) {
                        int i7 = Pd.f.qt_confirm_mobile_information;
                        String respMsg = rsp2.getRespMsg();
                        String str2 = respMsg == null ? "" : respMsg;
                        io.fastkv.n.O(context, 0, Integer.valueOf(i7), null, null, null, null, str2, Integer.valueOf(p025ba.k.core_continue), null, new p054dd.n(18, addScheduleTopUpTaskReq, scheduleTopUpAddTaskFragment), Integer.valueOf(p025ba.k.core_change), null, null, null, false, 0, 8385149);
                    }
                } else {
                    String respMsg2 = rsp2.getRespMsg();
                    if (respMsg2 != null && respMsg2.length() != 0 && (c0Var = (c0) scheduleTopUpAddTaskFragment.f27335j) != null) {
                        c0Var.f8230e.setError(rsp2.getRespMsg());
                    }
                }
                break;
            case 2:
                List items = (List) obj;
                Function0 callback = (Function0) obj2;
                KProperty[] kPropertyArr3 = ScheduleTopUpAddTaskFragment.f26549q0;
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(callback, "callback");
                ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) scheduleTopUpAddTaskFragment.f27333i;
                if (scheduleTopUpViewModel != null) {
                    List list = items;
                    ArrayList arrayList = new ArrayList(kotlin.collections.r.l(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(((TopUpRecordItem) it.next()).id));
                    }
                    scheduleTopUpViewModel.e(new ArrayList(arrayList), callback);
                }
                break;
            default:
                TopUpRecordItem item = (TopUpRecordItem) obj;
                Function0 callback2 = (Function0) obj2;
                KProperty[] kPropertyArr4 = ScheduleTopUpAddTaskFragment.f26549q0;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(callback2, "callback");
                ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) scheduleTopUpAddTaskFragment.f27333i;
                if (scheduleTopUpViewModel2 != null) {
                    scheduleTopUpViewModel2.e(C1850q.e(Long.valueOf(item.id)), callback2);
                }
                break;
        }
        return Unit.f38893a;
    }
}
