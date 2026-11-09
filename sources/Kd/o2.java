package Kd;

import com.transsnet.palmpay.core.bean.req.ParseInstalmentsQrcodeReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class o2 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParseInstalmentsQrcodeReq f5344b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(ParseInstalmentsQrcodeReq parseInstalmentsQrcodeReq, Continuation continuation) {
        super(1, continuation);
        this.f5344b = parseInstalmentsQrcodeReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new o2(this.f5344b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((o2) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5343a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f5343a = 1;
        Object objSearchAccountNumber = payApiService.searchAccountNumber(this.f5344b, this);
        return objSearchAccountNumber == aVar ? aVar : objSearchAccountNumber;
    }
}
