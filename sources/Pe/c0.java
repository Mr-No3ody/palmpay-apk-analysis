package Pe;

import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f7228c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(String str, Long l5, Continuation continuation) {
        super(1, continuation);
        this.f7227b = str;
        this.f7228c = l5;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new c0(this.f7227b, this.f7228c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((c0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7226a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        this.f7226a = 1;
        Object objClaimTaskRewards = iApiMainService.claimTaskRewards(this.f7227b, this.f7228c, this);
        return objClaimTaskRewards == aVar ? aVar : objClaimTaskRewards;
    }
}
