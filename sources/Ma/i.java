package Ma;

import com.transsnet.palmpay.core.bean.req.USSDFundResultReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ USSDFundResultReq f5893b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(USSDFundResultReq uSSDFundResultReq, Continuation continuation) {
        super(1, continuation);
        this.f5893b = uSSDFundResultReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new i(this.f5893b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((i) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5892a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f5892a = 1;
        Object uSSDResultNew = payApiService.getUSSDResultNew(this.f5893b, this);
        return uSSDResultNew == aVar ? aVar : uSSDResultNew;
    }
}
