package Ed;

import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ed.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0243x extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BankAccountPalmPayContactFragment f2413b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0243x(BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment, Continuation continuation) {
        super(2, continuation);
        this.f2413b = bankAccountPalmPayContactFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0243x c0243x = new C0243x(this.f2413b, continuation);
        c0243x.f2412a = obj;
        return c0243x;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0243x) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f2413b.t().setList(androidx.camera.core.impl.utils.n.q((List) this.f2412a, new Ab.B(11)));
        return Unit.f38893a;
    }
}
