package J9;

import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: J9.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0327k extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PayByOrderReq f4585b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0327k(PayByOrderReq payByOrderReq, Continuation continuation) {
        super(1, continuation);
        this.f4585b = payByOrderReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0327k(this.f4585b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0327k) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4584a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f4584a = 1;
        Object objPayByNewOrderNoByVM = payApiService.payByNewOrderNoByVM(this.f4585b, this);
        return objPayByNewOrderNoByVM == aVar ? aVar : objPayByNewOrderNoByVM;
    }
}
