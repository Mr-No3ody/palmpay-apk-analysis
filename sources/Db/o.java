package Db;

import com.transsnet.palmpay.credit.network.IApiCreditService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i7, Continuation continuation) {
        super(1, continuation);
        this.f1821b = i7;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new o(this.f1821b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((o) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1820a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiCreditService iApiCreditServiceH = C0.G.h(p221ob.c.f40268a);
        Integer num = new Integer(this.f1821b);
        Integer num2 = new Integer(20);
        this.f1820a = 1;
        Object objQueryFirstLoan = iApiCreditServiceH.queryFirstLoan(num, num2, this);
        return objQueryFirstLoan == aVar ? aVar : objQueryFirstLoan;
    }
}
