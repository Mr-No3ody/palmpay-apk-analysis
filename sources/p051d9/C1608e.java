package p051d9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: d9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1608e extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35608b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1608e(String str, Continuation continuation) {
        super(1, continuation);
        this.f35608b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1608e(this.f35608b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1608e) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f35607a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f35607a = 1;
        Object objCheckPhoneIsReg = iApiAccountServiceT.checkPhoneIsReg(this.f35608b, this);
        return objCheckPhoneIsReg == aVar ? aVar : objCheckPhoneIsReg;
    }
}
