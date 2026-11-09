package Kd;

import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class Z extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f5178b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(com.transsnet.palmpay.core.base.l lVar, Continuation continuation) {
        super(2, continuation);
        this.f5178b = lVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        Z z3 = new Z(this.f5178b, continuation);
        z3.f5177a = obj;
        return z3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((CommonResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        org.chromium.support_lib_boundary.util.b.C(this.f5178b, (CommonResult) this.f5177a);
        return Unit.f38893a;
    }
}
