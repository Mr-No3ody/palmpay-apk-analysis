package Fe;

import com.transsnet.palmpay.main.export.bean.req.ClaimRewardReq;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Fe.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0267o extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClaimRewardReq f2798b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0267o(ClaimRewardReq claimRewardReq, Continuation continuation) {
        super(1, continuation);
        this.f2798b = claimRewardReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0267o(this.f2798b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0267o) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2797a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        this.f2797a = 1;
        Object objClaimRewardsCenterReward = iApiMainService.claimRewardsCenterReward(this.f2798b, this);
        return objClaimRewardsCenterReward == aVar ? aVar : objClaimRewardsCenterReward;
    }
}
