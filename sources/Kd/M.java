package Kd;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.ConfigReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConfigReq f5086b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(ConfigReq configReq, Continuation continuation) {
        super(1, continuation);
        this.f5086b = configReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new M(this.f5086b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((M) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5085a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        this.f5085a = 1;
        Object objQueryBalanceAndLimitMvvm = sendMoneyApiService.queryBalanceAndLimitMvvm(this.f5086b, this);
        return objQueryBalanceAndLimitMvvm == aVar ? aVar : objQueryBalanceAndLimitMvvm;
    }
}
