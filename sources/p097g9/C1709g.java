package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1709g extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1709g(String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f36963b = str;
        this.f36964c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1709g(this.f36963b, this.f36964c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1709g) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36962a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36962a = 1;
        Object objResubmitGuardian = iApiAccountServiceT.resubmitGuardian(this.f36963b, this.f36964c, this);
        return objResubmitGuardian == aVar ? aVar : objResubmitGuardian;
    }
}
