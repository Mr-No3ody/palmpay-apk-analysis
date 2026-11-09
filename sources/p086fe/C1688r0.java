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

/* JADX INFO: renamed from: fe.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1688r0 extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f36734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f36736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1688r0(l lVar, String str, Continuation continuation, String str2) {
        super(2, continuation);
        this.f36734b = lVar;
        this.f36735c = str;
        this.f36736d = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1688r0(this.f36734b, this.f36735c, continuation, this.f36736d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1688r0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36733a;
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
        l lVar = this.f36734b;
        lVar.k(oVar);
        C1888u c1888u = new C1888u(X.n(new T(new C1685p0(this.f36735c, f10, null, this.f36736d)), I.f7021a), new C1680n(lVar, null, 15));
        C1687q0 c1687q0 = new C1687q0(lVar, null);
        this.f36733a = 2;
        if (X.g(c1888u, c1687q0, this) == aVar) {
            return aVar;
        }
        return Unit.f38893a;
    }
}
