package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.bean.req.ApplyT3QuotaReq;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApplyT3QuotaReq f36920b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(ApplyT3QuotaReq applyT3QuotaReq, Continuation continuation) {
        super(1, continuation);
        this.f36920b = applyT3QuotaReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new L(this.f36920b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((L) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36919a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36919a = 1;
        Object objApplyTier3TransactionLimit = iApiAccountServiceT.applyTier3TransactionLimit(this.f36920b, this);
        return objApplyTier3TransactionLimit == aVar ? aVar : objApplyTier3TransactionLimit;
    }
}
