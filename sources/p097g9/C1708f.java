package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1708f extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36961b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708f(String str, Continuation continuation) {
        super(1, continuation);
        this.f36961b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1708f(this.f36961b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1708f) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36960a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36960a = 1;
        Object objQueryTeenStatus = iApiAccountServiceT.queryTeenStatus(this.f36961b, this);
        return objQueryTeenStatus == aVar ? aVar : objQueryTeenStatus;
    }
}
