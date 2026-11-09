package Pe;

import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f7178b = str;
        this.f7179c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new H(this.f7178b, this.f7179c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((H) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7177a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f7177a = 1;
        Object cashInOrderDetail = payApiService.getCashInOrderDetail(this.f7178b, this.f7179c, this);
        return cashInOrderDetail == aVar ? aVar : cashInOrderDetail;
    }
}
