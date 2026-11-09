package Pe;

import com.transsnet.palmpay.core.network.api.AccountApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Pe.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0537i extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7257b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0537i(String str, Continuation continuation) {
        super(1, continuation);
        this.f7257b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0537i(this.f7257b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0537i) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7256a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        AccountApiService accountApiService = (AccountApiService) p324va.c.f43141a.f14623d;
        this.f7256a = 1;
        Object objQueryOrderNoByPayIdForMVVM = accountApiService.queryOrderNoByPayIdForMVVM(this.f7257b, this);
        return objQueryOrderNoByPayIdForMVVM == aVar ? aVar : objQueryOrderNoByPayIdForMVVM;
    }
}
