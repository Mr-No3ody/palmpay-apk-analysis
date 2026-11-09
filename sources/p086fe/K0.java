package p086fe;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.teller.bean.OrderReminderSubscribeReq;
import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class K0 extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36535b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(String str, Continuation continuation) {
        super(1, continuation);
        this.f36535b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new K0(this.f36535b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((K0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36534a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        OrderReminderSubscribeReq orderReminderSubscribeReq = new OrderReminderSubscribeReq(this.f36535b);
        this.f36534a = 1;
        Object objSubscribeLowData = iApiTellerService.subscribeLowData(orderReminderSubscribeReq, this);
        return objSubscribeLowData == aVar ? aVar : objSubscribeLowData;
    }
}
