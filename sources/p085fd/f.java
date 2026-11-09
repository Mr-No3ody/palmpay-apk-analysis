package p085fd;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.airtime.bean.req.R2CCreateOrderReq;
import com.transsnet.palmpay.airtime.network.IAirtimeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R2CCreateOrderReq f36455b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(R2CCreateOrderReq r2CCreateOrderReq, Continuation continuation) {
        super(1, continuation);
        this.f36455b = r2CCreateOrderReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new f(this.f36455b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((f) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36454a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        this.f36454a = 1;
        Object objCreateR2COrder = iAirtimeService.createR2COrder(this.f36455b, this);
        return objCreateR2COrder == aVar ? aVar : objCreateR2COrder;
    }
}
