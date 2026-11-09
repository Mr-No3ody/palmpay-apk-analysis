package Kd;

import com.palmpay.lib.apm.network.NQEManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;

/* JADX INFO: renamed from: Kd.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0399n1 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f5330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0399n1(com.transsnet.palmpay.core.base.l lVar, String str, Continuation continuation, ArrayList arrayList) {
        super(2, continuation);
        this.f5330b = lVar;
        this.f5331c = str;
        this.f5332d = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0399n1(this.f5330b, this.f5331c, continuation, this.f5332d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0399n1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5329a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            boolean zIsNetworkOffline = NQEManager.INSTANCE.isNetworkOffline();
            com.transsnet.palmpay.core.base.l lVar = this.f5330b;
            if (zIsNetworkOffline) {
                org.chromium.support_lib_boundary.util.b.F(lVar);
                return Unit.f38893a;
            }
            kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
            f10.f38951a = "";
            lVar.k(com.transsnet.palmpay.core.base.o.f27359a);
            C1888u c1888u = new C1888u(kotlinx.coroutines.flow.X.n(new kotlinx.coroutines.flow.T(new C0393l1(this.f5331c, f10, null, this.f5332d)), Pa.I.f7021a), new J9.A(lVar, null, 14));
            C0396m1 c0396m1 = new C0396m1(lVar, null);
            this.f5329a = 1;
            if (kotlinx.coroutines.flow.X.g(c1888u, c0396m1, this) == aVar) {
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
