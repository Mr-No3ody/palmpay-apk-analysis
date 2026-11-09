package Pe;

import com.transsnet.palmpay.core.bean.bill.TransHistroyDownReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransHistroyDownReq f7302b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(TransHistroyDownReq transHistroyDownReq, Continuation continuation) {
        super(1, continuation);
        this.f7302b = transHistroyDownReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new s0(this.f7302b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((s0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7301a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f7301a = 1;
        Object objCheckBillDownload = payApiService.checkBillDownload(this.f7302b, this);
        return objCheckBillDownload == aVar ? aVar : objCheckBillDownload;
    }
}
