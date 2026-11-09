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

/* JADX INFO: renamed from: fe.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1677l0 extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryServiceStateByCategoryIdReq f36683b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1677l0(QueryServiceStateByCategoryIdReq queryServiceStateByCategoryIdReq, Continuation continuation) {
        super(1, continuation);
        this.f36683b = queryServiceStateByCategoryIdReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1677l0(this.f36683b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1677l0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36682a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        PayApiService payApiService = (PayApiService) c.f43141a.f14621b;
        this.f36682a = 1;
        Object objQueryServiceStateByCategoryIdByNew = payApiService.queryServiceStateByCategoryIdByNew(this.f36683b, this);
        return objQueryServiceStateByCategoryIdByNew == aVar ? aVar : objQueryServiceStateByCategoryIdByNew;
    }
}
