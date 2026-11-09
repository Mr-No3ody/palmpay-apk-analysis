package Jb;

import com.transsnet.palmpay.credit.bean.req.OcApplyReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Jb.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0344c extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcApplyReq f4728b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0344c(OcApplyReq ocApplyReq, Continuation continuation) {
        super(1, continuation);
        this.f4728b = ocApplyReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0344c(this.f4728b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0344c) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4727a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiCreditService iApiCreditServiceH = C0.G.h(p221ob.c.f40268a);
        this.f4727a = 1;
        Object objApplyOkCardV2 = iApiCreditServiceH.applyOkCardV2(this.f4728b, this);
        return objApplyOkCardV2 == aVar ? aVar : objApplyOkCardV2;
    }
}
