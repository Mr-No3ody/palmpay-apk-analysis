package Kd;

import com.transsnet.palmpay.core.bean.req.QueryMemberByCodePlateReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class n2 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5334b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(String str, Continuation continuation) {
        super(1, continuation);
        this.f5334b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new n2(this.f5334b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((n2) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5333a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        QueryMemberByCodePlateReq queryMemberByCodePlateReq = new QueryMemberByCodePlateReq(this.f5334b);
        this.f5333a = 1;
        Object objQueryMemberByCodePlate = payApiService.queryMemberByCodePlate(queryMemberByCodePlateReq, this);
        return objQueryMemberByCodePlate == aVar ? aVar : objQueryMemberByCodePlate;
    }
}
