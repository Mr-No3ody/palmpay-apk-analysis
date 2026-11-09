package Kd;

import com.transsnet.palmpay.core.bean.req.QueryMemberByCodePlateReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Kd.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0429y extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5406b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0429y(String str, Continuation continuation) {
        super(1, continuation);
        this.f5406b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0429y(this.f5406b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0429y) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5405a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        QueryMemberByCodePlateReq queryMemberByCodePlateReq = new QueryMemberByCodePlateReq(this.f5406b);
        this.f5405a = 1;
        Object objQueryMemberByCodePlate = payApiService.queryMemberByCodePlate(queryMemberByCodePlateReq, this);
        return objQueryMemberByCodePlate == aVar ? aVar : objQueryMemberByCodePlate;
    }
}
