package p310ub;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import Wf.I;
import android.os.Bundle;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.req.TriggerFullExemptionReq;
import com.transsnet.palmpay.credit.bean.resp.TriggerFullExemptionData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes4.dex */
public final class Z0 extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcRepayActivity f42816b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(OcRepayActivity ocRepayActivity, Continuation continuation) {
        super(2, continuation);
        this.f42816b = ocRepayActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Z0(this.f42816b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Z0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String respMsg;
        TriggerFullExemptionData triggerFullExemptionData;
        Integer triggerStatus;
        a aVar = a.f2423a;
        int i7 = this.f42815a;
        OcRepayActivity ocRepayActivity = this.f42816b;
        try {
            if (i7 == 0) {
                g.M(obj);
                TriggerFullExemptionReq triggerFullExemptionReq = new TriggerFullExemptionReq(6, null, new Long(ocRepayActivity.d1));
                f fVar = I.f10809a;
                e eVar = e.f19009c;
                Y0 y8 = new Y0(triggerFullExemptionReq, null);
                this.f42815a = 1;
                obj = AbstractC0780y.s(eVar, y8, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
            ocRepayActivity.showLoadingDialog(false);
            if (!commonBeanResult.isSuccess() || (triggerFullExemptionData = (TriggerFullExemptionData) commonBeanResult.data) == null || (triggerStatus = triggerFullExemptionData.getTriggerStatus()) == null || triggerStatus.intValue() != 1) {
                TriggerFullExemptionData triggerFullExemptionData2 = (TriggerFullExemptionData) commonBeanResult.data;
                if (triggerFullExemptionData2 == null || (respMsg = triggerFullExemptionData2.getPromptMessage()) == null) {
                    respMsg = commonBeanResult.getRespMsg();
                }
                ToastUtils.showLong(respMsg, new Object[0]);
                int i10 = OcRepayActivity.f29705v1;
                ocRepayActivity.p();
            } else {
                ocRepayActivity.finish();
                Bundle bundle = new Bundle();
                bundle.putInt("accountType", 6);
                d.x(bundle, "LoanFullWaiverClearedResult");
            }
        } catch (Exception e10) {
            ocRepayActivity.showLoadingDialog(false);
            ToastUtils.showLong(e10.getMessage(), new Object[0]);
            int i11 = OcRepayActivity.f29705v1;
            ocRepayActivity.p();
        }
        return Unit.f38893a;
    }
}
