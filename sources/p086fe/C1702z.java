package p086fe;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: fe.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1702z extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateTellerOrderReq f36795b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702z(CreateTellerOrderReq createTellerOrderReq, Continuation continuation) {
        super(1, continuation);
        this.f36795b = createTellerOrderReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1702z(this.f36795b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1702z) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36794a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        CreateTellerOrderReq createTellerOrderReq = this.f36795b;
        String str = createTellerOrderReq.customerId;
        String str2 = createTellerOrderReq.paymentItemId;
        String str3 = createTellerOrderReq.billerName;
        String strValueOf = String.valueOf(createTellerOrderReq.businessAmount);
        this.f36794a = 1;
        Object objQueryOrderInfoConfirm = iApiTellerService.queryOrderInfoConfirm(str, str2, str3, strValueOf, this);
        return objQueryOrderInfoConfirm == aVar ? aVar : objQueryOrderInfoConfirm;
    }
}
