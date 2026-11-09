package p270rd;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.interfaces.ILoanBankSilentAuthService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: rd.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1959b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ILoanBankSilentAuthService f41725b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1959b(ILoanBankSilentAuthService iLoanBankSilentAuthService, Continuation continuation) {
        super(2, continuation);
        this.f41725b = iLoanBankSilentAuthService;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1959b(this.f41725b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1959b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f41724a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        this.f41724a = 1;
        Object objEnsure = this.f41725b.ensure(this);
        return objEnsure == aVar ? aVar : objEnsure;
    }
}
