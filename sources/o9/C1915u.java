package o9;

import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: o9.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1915u extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f40233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f40234b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1915u(com.transsnet.palmpay.core.base.l lVar, Continuation continuation) {
        super(2, continuation);
        this.f40234b = lVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1915u c1915u = new C1915u(this.f40234b, continuation);
        c1915u.f40233a = obj;
        return c1915u;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1915u) create((CommonResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        org.chromium.support_lib_boundary.util.b.B(this.f40234b, (CommonResult) this.f40233a);
        return Unit.f38893a;
    }
}
