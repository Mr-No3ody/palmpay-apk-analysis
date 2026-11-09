package x9;

import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateTellerOrderReq f43711b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(CreateTellerOrderReq createTellerOrderReq, Continuation continuation) {
        super(1, continuation);
        this.f43711b = createTellerOrderReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new w(this.f43711b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((w) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f43710a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        this.f43710a = 1;
        Object objAddQuickTellerOrderV2MVVM = iApiTellerService.addQuickTellerOrderV2MVVM(this.f43711b, this);
        return objAddQuickTellerOrderV2MVVM == aVar ? aVar : objAddQuickTellerOrderV2MVVM;
    }
}
