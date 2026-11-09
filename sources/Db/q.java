package Db;

import com.transsnet.palmpay.credit.bean.req.CLRepaymentPlanReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1825b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j6, Continuation continuation) {
        super(1, continuation);
        this.f1825b = j6;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new q(this.f1825b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((q) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1824a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiCreditService iApiCreditServiceH = C0.G.h(p221ob.c.f40268a);
        CLRepaymentPlanReq cLRepaymentPlanReq = new CLRepaymentPlanReq(new Long(this.f1825b), null, false, 4, null);
        this.f1824a = 1;
        Object objClQueryInsCashRepaymentPlanSus = iApiCreditServiceH.clQueryInsCashRepaymentPlanSus(cLRepaymentPlanReq, this);
        return objClQueryInsCashRepaymentPlanSus == aVar ? aVar : objClQueryInsCashRepaymentPlanSus;
    }
}
