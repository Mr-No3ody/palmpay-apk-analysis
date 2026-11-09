package J9;

import com.transsnet.palmpay.core.bean.req.QueryRecipientReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class G extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryRecipientReq f4557b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(QueryRecipientReq queryRecipientReq, Continuation continuation) {
        super(1, continuation);
        this.f4557b = queryRecipientReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new G(this.f4557b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((G) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4556a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f4556a = 1;
        Object objQueryRecentlyMerchantList = payApiService.queryRecentlyMerchantList(this.f4557b, this);
        return objQueryRecentlyMerchantList == aVar ? aVar : objQueryRecentlyMerchantList;
    }
}
