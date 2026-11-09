package Kd;

import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Kd.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0409r0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f5366b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0409r0(com.transsnet.palmpay.core.base.l lVar, Continuation continuation) {
        super(2, continuation);
        this.f5366b = lVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0409r0 c0409r0 = new C0409r0(this.f5366b, continuation);
        c0409r0.f5365a = obj;
        return c0409r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0409r0) create((CommonResult) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        org.chromium.support_lib_boundary.util.b.B(this.f5366b, (CommonResult) this.f5365a);
        return Unit.f38893a;
    }
}
