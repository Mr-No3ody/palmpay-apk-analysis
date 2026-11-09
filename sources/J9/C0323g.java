package J9;

import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: J9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0323g extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckPayReq f4577b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0323g(CheckPayReq checkPayReq, Continuation continuation) {
        super(1, continuation);
        this.f4577b = checkPayReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0323g(this.f4577b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0323g) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4576a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f4576a = 1;
        Object objQueryPayResultVM = payApiService.queryPayResultVM(this.f4577b, this);
        return objQueryPayResultVM == aVar ? aVar : objQueryPayResultVM;
    }
}
