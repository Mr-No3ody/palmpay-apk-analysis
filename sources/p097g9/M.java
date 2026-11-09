package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class M extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36921a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new M(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((M) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36921a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36921a = 1;
        Object objQueryRealNameAuthInfoMvvm = iApiAccountServiceT.queryRealNameAuthInfoMvvm(this);
        return objQueryRealNameAuthInfoMvvm == aVar ? aVar : objQueryRealNameAuthInfoMvvm;
    }
}
