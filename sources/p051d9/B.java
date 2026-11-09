package p051d9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.business.IApiAccountService;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SmsActionReq f35553b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(SmsActionReq smsActionReq, Continuation continuation) {
        super(1, continuation);
        this.f35553b = smsActionReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new B(this.f35553b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((B) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f35552a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f35552a = 1;
        Object objCheckSmsCodeV2 = iApiAccountServiceT.checkSmsCodeV2(this.f35553b, this);
        return objCheckSmsCodeV2 == aVar ? aVar : objCheckSmsCodeV2;
    }
}
