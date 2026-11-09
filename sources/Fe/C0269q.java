package Fe;

import com.transsnet.palmpay.main.export.bean.req.ClearRewardCacheReq;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Fe.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0269q extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClearRewardCacheReq f2805b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0269q(ClearRewardCacheReq clearRewardCacheReq, Continuation continuation) {
        super(1, continuation);
        this.f2805b = clearRewardCacheReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0269q(this.f2805b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0269q) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2804a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        this.f2804a = 1;
        Object objClearRewardsResultCache = iApiMainService.clearRewardsResultCache(this.f2805b, this);
        return objClearRewardsResultCache == aVar ? aVar : objClearRewardsResultCache;
    }
}
