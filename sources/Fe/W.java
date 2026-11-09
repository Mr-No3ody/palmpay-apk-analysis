package Fe;

import com.transsnet.palmpay.core.network.api.MemberApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class W extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2754a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new W(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((W) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2754a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        MemberApiService memberApiService = (MemberApiService) p324va.c.f43141a.f14622c;
        this.f2754a = 1;
        Object objCheckUpdateNameLimit = memberApiService.checkUpdateNameLimit(this);
        return objCheckUpdateNameLimit == aVar ? aVar : objCheckUpdateNameLimit;
    }
}
