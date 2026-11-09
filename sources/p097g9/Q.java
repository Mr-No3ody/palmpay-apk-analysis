package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class Q extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36927b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(String str, Continuation continuation) {
        super(1, continuation);
        this.f36927b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new Q(this.f36927b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Q) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36926a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36926a = 1;
        Object objQueryUserRawIdNo = iApiAccountServiceT.queryUserRawIdNo(this.f36927b, this);
        return objQueryUserRawIdNo == aVar ? aVar : objQueryUserRawIdNo;
    }
}
