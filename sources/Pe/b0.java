package Pe;

import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f7222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f7223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Integer num, Long l5, Continuation continuation) {
        super(1, continuation);
        this.f7222b = num;
        this.f7223c = l5;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new b0(this.f7222b, this.f7223c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((b0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7221a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        this.f7221a = 1;
        Object objClaimProgressRewards = iApiMainService.claimProgressRewards(this.f7222b, this.f7223c, this);
        return objClaimProgressRewards == aVar ? aVar : objClaimProgressRewards;
    }
}
