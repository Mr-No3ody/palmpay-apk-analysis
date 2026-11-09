package x9;

import Pa.I;
import com.palmpay.lib.apm.network.NQEManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f43684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f43686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f43687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.transsnet.palmpay.core.base.l lVar, String str, Continuation continuation, String str2, String str3) {
        super(2, continuation);
        this.f43684b = lVar;
        this.f43685c = str;
        this.f43686d = str2;
        this.f43687e = str3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f43684b, this.f43685c, continuation, this.f43686d, this.f43687e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f43683a;
        if (i7 != 0) {
            if (i7 == 1) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            return Unit.f38893a;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        if (NQEManager.INSTANCE.isNetworkOffline()) {
            return Unit.f38893a;
        }
        F f10 = new F();
        f10.f38951a = "";
        com.transsnet.palmpay.core.base.o oVar = com.transsnet.palmpay.core.base.o.f27359a;
        com.transsnet.palmpay.core.base.l lVar = this.f43684b;
        lVar.k(oVar);
        C1888u c1888u = new C1888u(X.n(new T(new j(this.f43685c, f10, null, this.f43686d, this.f43687e)), I.f7021a), new p130ic.w(lVar, null, 11));
        k kVar = new k(lVar, null);
        this.f43683a = 2;
        if (X.g(c1888u, kVar, this) == aVar) {
            return aVar;
        }
        return Unit.f38893a;
    }
}
