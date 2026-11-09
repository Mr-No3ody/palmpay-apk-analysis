package p051d9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.bean.ChangeTempPinReq;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class I extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChangeTempPinReq f35561b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(ChangeTempPinReq changeTempPinReq, Continuation continuation) {
        super(1, continuation);
        this.f35561b = changeTempPinReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new I(this.f35561b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((I) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f35560a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f35560a = 1;
        Object objChangeTempPinOrPsw = iApiAccountServiceT.changeTempPinOrPsw(this.f35561b, this);
        return objChangeTempPinOrPsw == aVar ? aVar : objChangeTempPinOrPsw;
    }
}
