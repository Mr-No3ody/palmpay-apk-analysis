package Db;

import com.transsnet.palmpay.credit.bean.req.CLRepaymentPlanReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1823b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j6, Continuation continuation) {
        super(1, continuation);
        this.f1823b = j6;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new p(this.f1823b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((p) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1822a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiCreditService iApiCreditServiceH = C0.G.h(p221ob.c.f40268a);
        CLRepaymentPlanReq cLRepaymentPlanReq = new CLRepaymentPlanReq(new Long(this.f1823b), null, false, 4, null);
        this.f1822a = 1;
        Object objClQueryCashRepaymentPlanSus = iApiCreditServiceH.clQueryCashRepaymentPlanSus(cLRepaymentPlanReq, this);
        return objClQueryCashRepaymentPlanSus == aVar ? aVar : objClQueryCashRepaymentPlanSus;
    }
}
