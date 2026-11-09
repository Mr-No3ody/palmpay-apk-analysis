package Kd;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class a2 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Boolean f5196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(String str, Boolean bool, Continuation continuation) {
        super(1, continuation);
        this.f5195b = str;
        this.f5196c = bool;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new a2(this.f5195b, this.f5196c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((a2) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5194a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        this.f5194a = 1;
        Object objSearchPpAccount = sendMoneyApiService.searchPpAccount(this.f5195b, this.f5196c, this);
        return objSearchPpAccount == aVar ? aVar : objSearchPpAccount;
    }
}
