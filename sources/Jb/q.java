package Jb;

import com.transsnet.palmpay.credit.bean.req.QueryBusinessConfigReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f4755b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(List list, Continuation continuation) {
        super(1, continuation);
        this.f4755b = list;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new q(this.f4755b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((q) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4754a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiCreditService iApiCreditServiceH = C0.G.h(p221ob.c.f40268a);
        QueryBusinessConfigReq queryBusinessConfigReq = new QueryBusinessConfigReq(this.f4755b);
        this.f4754a = 1;
        Object objQueryBusinessConfigForMVVM = iApiCreditServiceH.queryBusinessConfigForMVVM(queryBusinessConfigReq, this);
        return objQueryBusinessConfigForMVVM == aVar ? aVar : objQueryBusinessConfigForMVVM;
    }
}
