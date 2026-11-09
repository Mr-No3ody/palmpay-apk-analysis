package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1706d extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36956a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1706d(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1706d) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36956a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36956a = 1;
        Object objQueryGuardianInfo = iApiAccountServiceT.queryGuardianInfo(this);
        return objQueryGuardianInfo == aVar ? aVar : objQueryGuardianInfo;
    }
}
