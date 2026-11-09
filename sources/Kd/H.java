package Kd;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerifyPaymentInfoReq f5044b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(VerifyPaymentInfoReq verifyPaymentInfoReq, Continuation continuation) {
        super(1, continuation);
        this.f5044b = verifyPaymentInfoReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new H(this.f5044b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((H) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5043a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        this.f5043a = 1;
        Object objStrangerCheckV2 = sendMoneyApiService.strangerCheckV2(this.f5044b, this);
        return objStrangerCheckV2 == aVar ? aVar : objStrangerCheckV2;
    }
}
