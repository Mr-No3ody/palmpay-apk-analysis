package x9;

import com.transsnet.palmpay.teller.bean.CreateBettingOrderReq;
import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateBettingOrderReq f43714b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(CreateBettingOrderReq createBettingOrderReq, Continuation continuation) {
        super(1, continuation);
        this.f43714b = createBettingOrderReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new y(this.f43714b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((y) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f43713a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        this.f43713a = 1;
        Object objCreateBettingOrder2 = iApiTellerService.createBettingOrder2(this.f43714b, this);
        return objCreateBettingOrder2 == aVar ? aVar : objCreateBettingOrder2;
    }
}
