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

/* JADX INFO: renamed from: fe.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1669h0 extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36657c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669h0(l lVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f36656b = lVar;
        this.f36657c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1669h0(this.f36656b, this.f36657c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1669h0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36655a;
        if (i7 == 0) {
            g.M(obj);
            if (NQEManager.INSTANCE.isNetworkOffline()) {
                return Unit.f38893a;
            }
            F f10 = new F();
            f10.f38951a = "";
            o oVar = o.f27359a;
            l lVar = this.f36656b;
            lVar.k(oVar);
            C1888u c1888u = new C1888u(X.n(new T(new C1665f0(this.f36657c, f10, null)), I.f7021a), new C1680n(lVar, null, 12));
            C1667g0 c1667g0 = new C1667g0(lVar, null);
            this.f36655a = 1;
            if (X.g(c1888u, c1667g0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }
}
