package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Flow f39085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f39086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f39087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Flow flow, g0 g0Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f39085c = flow;
        this.f39086d = g0Var;
        this.f39087e = obj;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        M m7 = new M(this.f39085c, this.f39086d, this.f39087e, continuation);
        m7.f39084b = obj;
        return m7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((Z) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f39083a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            int iOrdinal = ((Z) this.f39084b).ordinal();
            g0 g0Var = this.f39086d;
            if (iOrdinal == 0) {
                this.f39083a = 1;
                if (this.f39085c.collect(g0Var, this) == aVar) {
                    return aVar;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new p355xf.l();
                }
                Pa.a0 a0Var = X.f39123a;
                Object obj2 = this.f39087e;
                if (obj2 == a0Var) {
                    g0Var.resetReplayCache();
                    throw null;
                }
                g0Var.setValue(obj2);
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
