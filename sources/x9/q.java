package x9;

import Pa.I;
import com.palmpay.lib.apm.network.NQEManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f43698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f43700d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.transsnet.palmpay.core.base.l lVar, String str, Continuation continuation, ArrayList arrayList) {
        super(2, continuation);
        this.f43698b = lVar;
        this.f43699c = str;
        this.f43700d = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new q(this.f43698b, this.f43699c, continuation, this.f43700d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f43697a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            boolean zIsNetworkOffline = NQEManager.INSTANCE.isNetworkOffline();
            com.transsnet.palmpay.core.base.l lVar = this.f43698b;
            if (zIsNetworkOffline) {
                org.chromium.support_lib_boundary.util.b.F(lVar);
                return Unit.f38893a;
            }
            F f10 = new F();
            f10.f38951a = "";
            lVar.k(com.transsnet.palmpay.core.base.o.f27359a);
            C1888u c1888u = new C1888u(X.n(new T(new o(this.f43699c, f10, null, this.f43700d)), I.f7021a), new p130ic.w(lVar, null, 12));
            p pVar = new p(lVar, null);
            this.f43697a = 1;
            if (X.g(c1888u, pVar, this) == aVar) {
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
