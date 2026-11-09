package J9;

import com.transsnet.palmpay.cash_in.network.IRechargeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: J9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0322f extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4575b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0322f(String str, Continuation continuation) {
        super(1, continuation);
        this.f4575b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0322f(this.f4575b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0322f) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4574a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IRechargeService iRechargeService = (IRechargeService) A9.a.f95a.f35518b;
        this.f4574a = 1;
        Object objQueryBindBankCardDetail = iRechargeService.queryBindBankCardDetail(this.f4575b, this);
        return objQueryBindBankCardDetail == aVar ? aVar : objQueryBindBankCardDetail;
    }
}
