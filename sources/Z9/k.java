package Z9;

import J9.A;
import Pa.I;
import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.core.base.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f11594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11595c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.transsnet.palmpay.core.base.l lVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f11594b = lVar;
        this.f11595c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f11594b, this.f11595c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f11593a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            if (NQEManager.INSTANCE.isNetworkOffline()) {
                return Unit.f38893a;
            }
            F f10 = new F();
            f10.f38951a = "";
            o oVar = o.f27359a;
            com.transsnet.palmpay.core.base.l lVar = this.f11594b;
            lVar.k(oVar);
            C1888u c1888u = new C1888u(X.n(new T(new i(this.f11595c, f10, null)), I.f7021a), new A(lVar, null, 27));
            j jVar = new j(lVar, null);
            this.f11593a = 1;
            if (X.g(c1888u, jVar, this) == aVar) {
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
