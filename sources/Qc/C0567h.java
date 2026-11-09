package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.req.CashBoxTrialCalculationReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Qc.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0567h extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7768b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0567h(long j6, Continuation continuation) {
        super(1, continuation);
        this.f7768b = j6;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0567h(this.f7768b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0567h) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7767a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        CashBoxTrialCalculationReq cashBoxTrialCalculationReq = new CashBoxTrialCalculationReq(this.f7768b);
        this.f7767a = 1;
        Object objCashBoxTrialCalculation = manageApiService.cashBoxTrialCalculation(cashBoxTrialCalculationReq, this);
        return objCashBoxTrialCalculation == aVar ? aVar : objCashBoxTrialCalculation;
    }
}
