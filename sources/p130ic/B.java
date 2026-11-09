package p130ic;

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
import kotlin.jvm.internal.F;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f37491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f37493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(l lVar, String str, Continuation continuation, ArrayList arrayList) {
        super(2, continuation);
        this.f37491b = lVar;
        this.f37492c = str;
        this.f37493d = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new B(this.f37491b, this.f37492c, continuation, this.f37493d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f37490a;
        if (i7 == 0) {
            g.M(obj);
            boolean zIsNetworkOffline = NQEManager.INSTANCE.isNetworkOffline();
            l lVar = this.f37491b;
            if (zIsNetworkOffline) {
                b.F(lVar);
                return Unit.f38893a;
            }
            F f10 = new F();
            f10.f38951a = "";
            lVar.k(o.f27359a);
            C1888u c1888u = new C1888u(X.n(new T(new z(this.f37492c, f10, null, this.f37493d)), I.f7021a), new w(lVar, null, 1));
            A a3 = new A(lVar, null);
            this.f37490a = 1;
            if (X.g(c1888u, a3, this) == aVar) {
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
