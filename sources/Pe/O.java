package Pe;

import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.f7194b = str;
        this.f7195c = str2;
        this.f7196d = str3;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new O(this.f7194b, this.f7195c, this.f7196d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((O) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7193a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        this.f7193a = 1;
        Object objAuthDelay = iApiMainService.authDelay(this.f7194b, this.f7195c, this.f7196d, 2, this);
        return objAuthDelay == aVar ? aVar : objAuthDelay;
    }
}
