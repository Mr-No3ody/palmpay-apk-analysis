package Pe;

import com.palmpay.lib.apm.network.NQEManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f7190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(com.transsnet.palmpay.core.base.l lVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f7190b = lVar;
        this.f7191c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new M(this.f7190b, this.f7191c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7189a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            if (NQEManager.INSTANCE.isNetworkOffline()) {
                return Unit.f38893a;
            }
            kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
            f10.f38951a = "";
            com.transsnet.palmpay.core.base.o oVar = com.transsnet.palmpay.core.base.o.f27359a;
            com.transsnet.palmpay.core.base.l lVar = this.f7190b;
            lVar.k(oVar);
            C1888u c1888u = new C1888u(kotlinx.coroutines.flow.X.n(new kotlinx.coroutines.flow.T(new K(this.f7191c, f10, null)), Pa.I.f7021a), new J9.A(lVar, null, 23));
            L l5 = new L(lVar, null);
            this.f7189a = 1;
            if (kotlinx.coroutines.flow.X.g(c1888u, l5, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
