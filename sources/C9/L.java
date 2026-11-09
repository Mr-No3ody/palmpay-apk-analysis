package C9;

import com.transsnet.palmpay.cash_in.ui.activity.WithdrawAgentPaymentResultActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WithdrawAgentPaymentResultActivity f1264a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity, Continuation continuation) {
        super(2, continuation);
        this.f1264a = withdrawAgentPaymentResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new L(this.f1264a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((L) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        boolean z3 = this.f1264a.f26910A;
        return Unit.f38893a;
    }
}
