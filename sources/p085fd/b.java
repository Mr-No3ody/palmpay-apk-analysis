package p085fd;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.airtime.bean.req.SendRecharge2CashOTPReq;
import com.transsnet.palmpay.airtime.network.IAirtimeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SendRecharge2CashOTPReq f36448b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SendRecharge2CashOTPReq sendRecharge2CashOTPReq, Continuation continuation) {
        super(1, continuation);
        this.f36448b = sendRecharge2CashOTPReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f36448b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((b) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36447a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        this.f36447a = 1;
        Object objSendRechargeToCashOTPMvvm = iAirtimeService.sendRechargeToCashOTPMvvm(this.f36448b, this);
        return objSendRechargeToCashOTPMvvm == aVar ? aVar : objSendRechargeToCashOTPMvvm;
    }
}
