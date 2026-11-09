package p130ic;

import Ef.a;
import Ff.h;
import Pa.I;
import androidx.camera.core.impl.utils.executor.g;
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
import p086fe.C1680n;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f37523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f37525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.transsnet.palmpay.core.base.l lVar, String str, Continuation continuation, String str2) {
        super(2, continuation);
        this.f37523b = lVar;
        this.f37524c = str;
        this.f37525d = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f37523b, this.f37524c, continuation, this.f37525d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f37522a;
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
        com.transsnet.palmpay.core.base.l lVar = this.f37523b;
        lVar.k(oVar);
        C1888u c1888u = new C1888u(X.n(new T(new j(this.f37524c, f10, null, this.f37525d)), I.f7021a), new C1680n(lVar, null, 27));
        k kVar = new k(lVar, null);
        this.f37522a = 2;
        if (X.g(c1888u, kVar, this) == aVar) {
            return aVar;
        }
        return Unit.f38893a;
    }
}
