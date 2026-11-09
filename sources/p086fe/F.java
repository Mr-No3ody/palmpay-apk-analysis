package p086fe;

import Ef.a;
import Ff.h;
import Pa.I;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.base.o;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f36507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(l lVar, String str, Continuation continuation, ArrayList arrayList) {
        super(2, continuation);
        this.f36505b = lVar;
        this.f36506c = str;
        this.f36507d = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new F(this.f36505b, this.f36506c, continuation, this.f36507d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36504a;
        if (i7 == 0) {
            g.M(obj);
            boolean zIsNetworkOffline = NQEManager.INSTANCE.isNetworkOffline();
            l lVar = this.f36505b;
            if (zIsNetworkOffline) {
                b.F(lVar);
                return Unit.f38893a;
            }
            kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
            f10.f38951a = "";
            lVar.k(o.f27359a);
            C1888u c1888u = new C1888u(X.n(new T(new D(this.f36506c, f10, null, this.f36507d)), I.f7021a), new C1680n(lVar, null, 5));
            E e10 = new E(lVar, null);
            this.f36504a = 1;
            if (X.g(c1888u, e10, this) == aVar) {
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
