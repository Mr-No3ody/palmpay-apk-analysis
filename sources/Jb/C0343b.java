package Jb;

import com.transsnet.palmpay.credit.network.IApiCreditService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Jb.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0343b extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4726a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0343b(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0343b) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4726a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiCreditService iApiCreditServiceH = C0.G.h(p221ob.c.f40268a);
        Boolean bool = Boolean.FALSE;
        this.f4726a = 1;
        Object financeDataSuspend = iApiCreditServiceH.getFinanceDataSuspend(bool, this);
        return financeDataSuspend == aVar ? aVar : financeDataSuspend;
    }
}
