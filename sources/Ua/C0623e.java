package Ua;

import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Ua.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0623e extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayByOrderReq f9395b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0623e(PayByOrderReq payByOrderReq, Continuation continuation) {
        super(1, continuation);
        this.f9395b = payByOrderReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0623e(this.f9395b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0623e) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f9394a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f9394a = 1;
        Object objPayByOrderNoV2VM = payApiService.payByOrderNoV2VM(this.f9395b, this);
        return objPayByOrderNoV2VM == aVar ? aVar : objPayByOrderNoV2VM;
    }
}
