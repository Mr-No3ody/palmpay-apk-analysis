package C9;

import Wf.AbstractC0780y;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawAgentPaymentResultActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class K extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WithdrawAgentPaymentResultActivity f1263b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity, Continuation continuation) {
        super(2, continuation);
        this.f1263b = withdrawAgentPaymentResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        K k2 = new K(this.f1263b, continuation);
        k2.f1262a = obj;
        return k2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        AbstractC0780y.m((CoroutineScope) this.f1262a, null, null, new J(this.f1263b, null), 3);
        return Unit.f38893a;
    }
}
