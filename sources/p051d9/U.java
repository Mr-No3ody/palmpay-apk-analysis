package p051d9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class U extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f35579b = str;
        this.f35580c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new U(this.f35579b, this.f35580c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((U) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f35578a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        Integer num = new Integer(15);
        this.f35578a = 1;
        Object objPreCheckPhoneMvvm = iApiAccountServiceT.preCheckPhoneMvvm(this.f35579b, null, num, this.f35580c, this);
        return objPreCheckPhoneMvvm == aVar ? aVar : objPreCheckPhoneMvvm;
    }
}
