package x9;

import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f43665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, Continuation continuation) {
        super(1, continuation);
        this.f43665b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new f(this.f43665b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((f) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f43664a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
        this.f43664a = 1;
        Object objQueryBettingGetQuickWebUrl = iApiTellerService.queryBettingGetQuickWebUrl(this.f43665b, this);
        return objQueryBettingGetQuickWebUrl == aVar ? aVar : objQueryBettingGetQuickWebUrl;
    }
}
