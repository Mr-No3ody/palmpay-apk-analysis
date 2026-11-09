package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.core.impl.utils.n;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1719q extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36980b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1719q(String str, Continuation continuation) {
        super(1, continuation);
        this.f36980b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1719q(this.f36980b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1719q) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36979a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36979a = 1;
        Object objT = n.t(iApiAccountServiceT, this.f36980b, null, this, 14);
        return objT == aVar ? aVar : objT;
    }
}
