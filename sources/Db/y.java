package Db;

import com.transsnet.palmpay.core.bean.req.QueryRecipientReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1838a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new y(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((y) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1838a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        QueryRecipientReq queryRecipientReq = new QueryRecipientReq(1, 3, C0.G.k());
        this.f1838a = 1;
        Object objQueryRecentlyMerchantList = payApiService.queryRecentlyMerchantList(queryRecipientReq, this);
        return objQueryRecentlyMerchantList == aVar ? aVar : objQueryRecentlyMerchantList;
    }
}
