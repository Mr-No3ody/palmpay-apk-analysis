package p097g9;

import Ef.a;
import Ff.h;
import Pa.I;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.base.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;
import p086fe.C1680n;

/* JADX INFO: renamed from: g9.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1721t extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721t(l lVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f36988b = lVar;
        this.f36989c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1721t(this.f36988b, this.f36989c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1721t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36987a;
        if (i7 != 0) {
            if (i7 == 1) {
                g.M(obj);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            return Unit.f38893a;
        }
        g.M(obj);
        if (NQEManager.INSTANCE.isNetworkOffline()) {
            return Unit.f38893a;
        }
        F f10 = new F();
        f10.f38951a = "";
        o oVar = o.f27359a;
        l lVar = this.f36988b;
        lVar.k(oVar);
        C1888u c1888u = new C1888u(X.n(new T(new r(this.f36989c, f10, null)), I.f7021a), new C1680n(lVar, null, 21));
        C1720s c1720s = new C1720s(lVar, null);
        this.f36987a = 2;
        if (X.g(c1888u, c1720s, this) == aVar) {
            return aVar;
        }
        return Unit.f38893a;
    }
}
