package J9;

import com.transsnet.palmpay.cash_in.network.IRechargeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: J9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0324h extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4579b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0324h(String str, Continuation continuation) {
        super(1, continuation);
        this.f4579b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0324h(this.f4579b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0324h) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4578a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IRechargeService iRechargeService = (IRechargeService) A9.a.f95a.f35518b;
        this.f4578a = 1;
        Object objQueryCashInDetailNew = iRechargeService.queryCashInDetailNew(this.f4579b, this);
        return objQueryCashInDetailNew == aVar ? aVar : objQueryCashInDetailNew;
    }
}
