package Fe;

import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Fe.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0268p extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2801b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0268p(String str, Continuation continuation) {
        super(1, continuation);
        this.f2801b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0268p(this.f2801b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0268p) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2800a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        this.f2800a = 1;
        Object objClaimTaskCenterReward = iApiMainService.claimTaskCenterReward(this.f2801b, this);
        return objClaimTaskCenterReward == aVar ? aVar : objClaimTaskCenterReward;
    }
}
