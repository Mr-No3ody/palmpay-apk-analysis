package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.bean.req.CheckPinTouchWithOrderReq;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class X extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CheckPinTouchWithOrderReq f36938b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(CheckPinTouchWithOrderReq checkPinTouchWithOrderReq, Continuation continuation) {
        super(1, continuation);
        this.f36938b = checkPinTouchWithOrderReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new X(this.f36938b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((X) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36937a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36937a = 1;
        Object objCheckPinTouchWithOrderMvvm = iApiAccountServiceT.checkPinTouchWithOrderMvvm(this.f36938b, this);
        return objCheckPinTouchWithOrderMvvm == aVar ? aVar : objCheckPinTouchWithOrderMvvm;
    }
}
