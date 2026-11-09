package Jb;

import com.transsnet.palmpay.credit.bean.req.CLQueryApplyAuditResultReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Jb.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0351j extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0351j(String str, Continuation continuation) {
        super(1, continuation);
        this.f4743b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0351j(this.f4743b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0351j) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4742a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiCreditService iApiCreditServiceH = C0.G.h(p221ob.c.f40268a);
        CLQueryApplyAuditResultReq cLQueryApplyAuditResultReq = new CLQueryApplyAuditResultReq(this.f4743b);
        this.f4742a = 1;
        Object objQueryApplyAuditResult = iApiCreditServiceH.queryApplyAuditResult(cLQueryApplyAuditResultReq, this);
        return objQueryApplyAuditResult == aVar ? aVar : objQueryApplyAuditResult;
    }
}
