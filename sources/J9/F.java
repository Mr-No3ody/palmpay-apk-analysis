package J9;

import com.transsnet.palmpay.cash_in.bean.request.NearbyAgentsReq;
import com.transsnet.palmpay.cash_in.network.IRechargeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class F extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NearbyAgentsReq f4555b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(NearbyAgentsReq nearbyAgentsReq, Continuation continuation) {
        super(1, continuation);
        this.f4555b = nearbyAgentsReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new F(this.f4555b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((F) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4554a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IRechargeService iRechargeService = (IRechargeService) A9.a.f95a.f35518b;
        this.f4554a = 1;
        Object objQueryNearbyAgents = iRechargeService.queryNearbyAgents(this.f4555b, this);
        return objQueryNearbyAgents == aVar ? aVar : objQueryNearbyAgents;
    }
}
