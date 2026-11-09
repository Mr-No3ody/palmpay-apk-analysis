package Db;

import com.transsnet.palmpay.core.bean.req.GetRecentMerchantsReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1833b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i7, Continuation continuation) {
        super(1, continuation);
        this.f1833b = i7;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new u(this.f1833b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((u) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1832a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        GetRecentMerchantsReq getRecentMerchantsReq = new GetRecentMerchantsReq();
        getRecentMerchantsReq.pageNum = this.f1833b;
        getRecentMerchantsReq.pageSize = 10;
        this.f1832a = 1;
        Object recentMerchantsMvvm = payApiService.getRecentMerchantsMvvm(getRecentMerchantsReq, this);
        return recentMerchantsMvvm == aVar ? aVar : recentMerchantsMvvm;
    }
}
