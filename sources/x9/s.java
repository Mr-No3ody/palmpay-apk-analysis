package x9;

import com.transsnet.palmpay.teller.bean.CreateBettingAutoRenewalReq;
import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateBettingAutoRenewalReq f43705b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(CreateBettingAutoRenewalReq createBettingAutoRenewalReq, Continuation continuation) {
        super(1, continuation);
        this.f43705b = createBettingAutoRenewalReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new s(this.f43705b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((s) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f43704a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        this.f43704a = 1;
        Object objCreateBettingAutoRenewal = iApiTellerService.createBettingAutoRenewal(this.f43705b, this);
        return objCreateBettingAutoRenewal == aVar ? aVar : objCreateBettingAutoRenewal;
    }
}
