package Kd;

import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.resp.AddFavoriteReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class F0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddFavoriteReq f5035b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(AddFavoriteReq addFavoriteReq, Continuation continuation) {
        super(1, continuation);
        this.f5035b = addFavoriteReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new F0(this.f5035b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((F0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5034a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) p188md.b.f39648a.f6830b;
        this.f5034a = 1;
        Object objCreateFavoriteRecipient = sendMoneyApiService.createFavoriteRecipient(this.f5035b, this);
        return objCreateFavoriteRecipient == aVar ? aVar : objCreateFavoriteRecipient;
    }
}
