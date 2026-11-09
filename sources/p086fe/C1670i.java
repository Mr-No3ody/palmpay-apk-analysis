package p086fe;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: fe.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1670i extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateTellerOrderReq f36659b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1670i(CreateTellerOrderReq createTellerOrderReq, Continuation continuation) {
        super(1, continuation);
        this.f36659b = createTellerOrderReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1670i(this.f36659b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1670i) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36658a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        this.f36658a = 1;
        Object objCreateOtherBillOrder = iApiTellerService.createOtherBillOrder(this.f36659b, this);
        return objCreateOtherBillOrder == aVar ? aVar : objCreateOtherBillOrder;
    }
}
