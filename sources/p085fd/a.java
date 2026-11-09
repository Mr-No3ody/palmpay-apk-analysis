package p085fd;

import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.airtime.bean.req.MTNLoginReq;
import com.transsnet.palmpay.airtime.network.IAirtimeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MTNLoginReq f36446b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MTNLoginReq mTNLoginReq, Continuation continuation) {
        super(1, continuation);
        this.f36446b = mTNLoginReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f36446b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((a) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f36445a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        this.f36445a = 1;
        Object objRecharge2CashLoginMvvm = iAirtimeService.recharge2CashLoginMvvm(this.f36446b, this);
        return objRecharge2CashLoginMvvm == aVar ? aVar : objRecharge2CashLoginMvvm;
    }
}
