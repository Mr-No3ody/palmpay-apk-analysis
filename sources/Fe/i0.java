package Fe;

import com.transsnet.palmpay.main.export.bean.req.ThresholdReq;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThresholdReq f2781b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ThresholdReq thresholdReq, Continuation continuation) {
        super(1, continuation);
        this.f2781b = thresholdReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new i0(this.f2781b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((i0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2780a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        this.f2780a = 1;
        Object objCreateOneStepPayThreshold = iApiMainService.createOneStepPayThreshold(this.f2781b, this);
        return objCreateOneStepPayThreshold == aVar ? aVar : objCreateOneStepPayThreshold;
    }
}
