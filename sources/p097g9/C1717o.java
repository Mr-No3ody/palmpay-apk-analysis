package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.bean.req.NameCheckReq;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1717o extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NameCheckReq f36977b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1717o(NameCheckReq nameCheckReq, Continuation continuation) {
        super(1, continuation);
        this.f36977b = nameCheckReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1717o(this.f36977b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1717o) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36976a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36976a = 1;
        Object objCheckInputNameMvvm = iApiAccountServiceT.checkInputNameMvvm(this.f36977b, this);
        return objCheckInputNameMvvm == aVar ? aVar : objCheckInputNameMvvm;
    }
}
