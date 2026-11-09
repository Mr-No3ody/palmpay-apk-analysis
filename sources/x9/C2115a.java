package x9;

import com.transsnet.palmpay.teller.bean.CreateBettingOrderReq;
import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: x9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2115a extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateBettingOrderReq f43656b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2115a(CreateBettingOrderReq createBettingOrderReq, Continuation continuation) {
        super(1, continuation);
        this.f43656b = createBettingOrderReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C2115a(this.f43656b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C2115a) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f43655a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        this.f43655a = 1;
        Object objCreateBettingOrder = iApiTellerService.createBettingOrder(this.f43656b, this);
        return objCreateBettingOrder == aVar ? aVar : objCreateBettingOrder;
    }
}
