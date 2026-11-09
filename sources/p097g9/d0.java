package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.business.IApiAccountService;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SmsActionReq f36958b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(SmsActionReq smsActionReq, Continuation continuation) {
        super(1, continuation);
        this.f36958b = smsActionReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new d0(this.f36958b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((d0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36957a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36957a = 1;
        Object objSendSmsV2 = iApiAccountServiceT.sendSmsV2(this.f36958b, this);
        return objSendSmsV2 == aVar ? aVar : objSendSmsV2;
    }
}
