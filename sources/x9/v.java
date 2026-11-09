package x9;

import com.transsnet.palmpay.teller.bean.CheckBettingValidationReq;
import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckBettingValidationReq f43709b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(CheckBettingValidationReq checkBettingValidationReq, Continuation continuation) {
        super(1, continuation);
        this.f43709b = checkBettingValidationReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new v(this.f43709b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((v) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f43708a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        this.f43708a = 1;
        Object objCheckBettingValidation = iApiTellerService.checkBettingValidation(this.f43709b, this);
        return objCheckBettingValidation == aVar ? aVar : objCheckBettingValidation;
    }
}
