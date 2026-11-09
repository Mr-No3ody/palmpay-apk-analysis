package Wf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.Incomplete;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m0 extends kotlin.jvm.internal.m implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f10882a = new m0(3, n0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i7 = 1;
        n0 n0Var = (n0) obj;
        SelectInstance selectInstance = (SelectInstance) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n0.f10888a;
        n0Var.getClass();
        do {
            obj4 = n0.f10888a.get(n0Var);
            if (!(obj4 instanceof Incomplete)) {
                selectInstance.selectInRegistrationPhase(Unit.f38893a);
            }
            return Unit.f38893a;
        } while (n0Var.E(obj4) < 0);
        selectInstance.disposeOnCompletion(AbstractC0780y.l(n0Var, true, new i0(n0Var, selectInstance, i7)));
        return Unit.f38893a;
    }
}
