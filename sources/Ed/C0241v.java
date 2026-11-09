package Ed;

import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;

/* JADX INFO: renamed from: Ed.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0241v extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BankAccountPalmPayContactFragment f2406b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0241v(BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment, Continuation continuation) {
        super(2, continuation);
        this.f2406b = bankAccountPalmPayContactFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0241v(this.f2406b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0241v) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2405a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment = this.f2406b;
            kotlinx.coroutines.flow.T t = new kotlinx.coroutines.flow.T(new r(bankAccountPalmPayContactFragment, null));
            p042cg.f fVar = Wf.I.f10809a;
            C1888u c1888u = new C1888u(kotlinx.coroutines.flow.X.n(t, p042cg.e.f19009c), new C0238s(3, null, 0));
            C0240u c0240u = new C0240u(bankAccountPalmPayContactFragment, null);
            this.f2405a = 1;
            if (kotlinx.coroutines.flow.X.g(c1888u, c0240u, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
