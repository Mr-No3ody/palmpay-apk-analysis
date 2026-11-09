package Jb;

import com.transsnet.palmpay.credit.bean.req.CLCalcReturnSendCouponReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Jb.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0355n extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLCalcReturnSendCouponReq f4750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0355n(CLCalcReturnSendCouponReq cLCalcReturnSendCouponReq, Continuation continuation) {
        super(1, continuation);
        this.f4750b = cLCalcReturnSendCouponReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0355n(this.f4750b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0355n) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4749a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiCreditService iApiCreditServiceH = C0.G.h(p221ob.c.f40268a);
        this.f4749a = 1;
        Object objCalcReturnSendCouponForMVVM = iApiCreditServiceH.calcReturnSendCouponForMVVM(this.f4750b, this);
        return objCalcReturnSendCouponForMVVM == aVar ? aVar : objCalcReturnSendCouponForMVVM;
    }
}
