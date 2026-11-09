package Kd;

import com.transsnet.palmpay.core.bean.CreateBizOrderReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class k2 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateBizOrderReq f5299b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(CreateBizOrderReq createBizOrderReq, Continuation continuation) {
        super(1, continuation);
        this.f5299b = createBizOrderReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new k2(this.f5299b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((k2) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5298a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f5298a = 1;
        Object objCreateBizOrder = payApiService.createBizOrder(this.f5299b, this);
        return objCreateBizOrder == aVar ? aVar : objCreateBizOrder;
    }
}
