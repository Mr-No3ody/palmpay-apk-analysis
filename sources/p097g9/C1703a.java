package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.bean.req.SubmitGuardianReq;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1703a extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubmitGuardianReq f36945b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703a(SubmitGuardianReq submitGuardianReq, Continuation continuation) {
        super(1, continuation);
        this.f36945b = submitGuardianReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1703a(this.f36945b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1703a) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36944a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36944a = 1;
        Object objApproveGuardian = iApiAccountServiceT.approveGuardian(this.f36945b, this);
        return objApproveGuardian == aVar ? aVar : objApproveGuardian;
    }
}
