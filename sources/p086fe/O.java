package p086fe;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.req.QueryServiceStateByCategoryIdReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryServiceStateByCategoryIdReq f36554b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(QueryServiceStateByCategoryIdReq queryServiceStateByCategoryIdReq, Continuation continuation) {
        super(1, continuation);
        this.f36554b = queryServiceStateByCategoryIdReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new O(this.f36554b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((O) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36553a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        PayApiService payApiService = (PayApiService) c.f43141a.f14621b;
        this.f36553a = 1;
        Object objQueryServiceStateByCategoryIdByNew = payApiService.queryServiceStateByCategoryIdByNew(this.f36554b, this);
        return objQueryServiceStateByCategoryIdByNew == aVar ? aVar : objQueryServiceStateByCategoryIdByNew;
    }
}
