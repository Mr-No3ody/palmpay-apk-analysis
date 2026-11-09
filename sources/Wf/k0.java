package Wf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.Incomplete;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k0 extends kotlin.jvm.internal.m implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f10879a = new k0(3, n0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objR;
        n0 n0Var = (n0) obj;
        SelectInstance selectInstance = (SelectInstance) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n0.f10888a;
        n0Var.getClass();
        do {
            objR = n0.f10888a.get(n0Var);
            if (!(objR instanceof Incomplete)) {
                if (!(objR instanceof C0771o)) {
                    objR = AbstractC0780y.r(objR);
                }
                selectInstance.selectInRegistrationPhase(objR);
            }
            return Unit.f38893a;
        } while (n0Var.E(objR) < 0);
        selectInstance.disposeOnCompletion(AbstractC0780y.l(n0Var, true, new i0(n0Var, selectInstance, 0)));
        return Unit.f38893a;
    }
}
