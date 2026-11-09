package Mc;

import Ff.h;
import Kc.f;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.resp.GetInterestRateConfigResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5930a;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5930a;
        try {
            if (i7 == 0) {
                g.M(obj);
                ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
                this.f5930a = 1;
                obj = manageApiService.getInterestRateConfig(this);
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
            if (!commonBeanResult.isSuccess() || commonBeanResult.data == 0) {
                obj = null;
            }
            CommonBeanResult commonBeanResult2 = (CommonBeanResult) obj;
            if (commonBeanResult2 == null) {
                return null;
            }
            p059e1.a.V(System.currentTimeMillis(), "sp_managemoney_last_query_interest_time");
            T t = commonBeanResult2.data;
            Intrinsics.e(t);
            p059e1.a.U(((GetInterestRateConfigResp) t).getInterestSwitchStatus(), "invest_interest_disable");
            f.f4999b.getInstance().f5000a = (GetInterestRateConfigResp) commonBeanResult2.data;
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_INVEST_INTEREST));
            return commonBeanResult2;
        } catch (Exception unused) {
            return Unit.f38893a;
        }
    }
}
