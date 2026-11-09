package p086fe;

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

/* JADX INFO: renamed from: fe.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1684p extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f36714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1684p(l lVar, String str, Continuation continuation, String str2) {
        super(2, continuation);
        this.f36712b = lVar;
        this.f36713c = str;
        this.f36714d = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1684p(this.f36712b, this.f36713c, continuation, this.f36714d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1684p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36711a;
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
        l lVar = this.f36712b;
        lVar.k(oVar);
        C1888u c1888u = new C1888u(X.n(new T(new C1678m(this.f36713c, f10, null, this.f36714d)), I.f7021a), new C1680n(lVar, null, 0));
        C1682o c1682o = new C1682o(lVar, null);
        this.f36711a = 2;
        if (X.g(c1888u, c1682o, this) == aVar) {
            return aVar;
        }
        return Unit.f38893a;
    }
}
