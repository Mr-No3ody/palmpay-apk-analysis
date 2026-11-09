package o9;

import com.palmpay.lib.apm.network.NQEManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f40092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f40093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(com.transsnet.palmpay.core.base.l lVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f40092b = lVar;
        this.f40093c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new A(this.f40092b, this.f40093c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f40091a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            if (NQEManager.INSTANCE.isNetworkOffline()) {
                return Unit.f38893a;
            }
            kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
            f10.f38951a = "";
            com.transsnet.palmpay.core.base.o oVar = com.transsnet.palmpay.core.base.o.f27359a;
            com.transsnet.palmpay.core.base.l lVar = this.f40092b;
            lVar.k(oVar);
            C1888u c1888u = new C1888u(kotlinx.coroutines.flow.X.n(new kotlinx.coroutines.flow.T(new C1919y(this.f40093c, f10, null)), Pa.I.f7021a), new p130ic.w(lVar, null, 3));
            C1920z c1920z = new C1920z(lVar, null);
            this.f40091a = 1;
            if (kotlinx.coroutines.flow.X.g(c1888u, c1920z, this) == aVar) {
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
