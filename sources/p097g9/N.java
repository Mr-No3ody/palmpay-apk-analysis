package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36922a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new N(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((N) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36922a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36922a = 1;
        Object objPreCheckApplyTier3 = iApiAccountServiceT.preCheckApplyTier3(this);
        return objPreCheckApplyTier3 == aVar ? aVar : objPreCheckApplyTier3;
    }
}
