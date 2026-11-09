package x9;

import com.transsnet.palmpay.teller.bean.BettingWithdrawRedeemCodeReq;
import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class C extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BettingWithdrawRedeemCodeReq f43654b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(BettingWithdrawRedeemCodeReq bettingWithdrawRedeemCodeReq, Continuation continuation) {
        super(1, continuation);
        this.f43654b = bettingWithdrawRedeemCodeReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C(this.f43654b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f43653a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        this.f43653a = 1;
        Object objBettingWithdrawRedeemCodeCheck = iApiTellerService.bettingWithdrawRedeemCodeCheck(this.f43654b, this);
        return objBettingWithdrawRedeemCodeCheck == aVar ? aVar : objBettingWithdrawRedeemCodeCheck;
    }
}
